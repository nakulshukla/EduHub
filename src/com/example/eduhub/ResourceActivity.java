package com.example.eduhub;

import com.dropbox.client2.DropboxAPI;
import com.dropbox.client2.DropboxAPI.Entry;
import com.dropbox.client2.android.AndroidAuthSession;
import com.dropbox.client2.android.AuthActivity;
import com.dropbox.client2.exception.DropboxException;
import com.dropbox.client2.session.AccessTokenPair;
import com.dropbox.client2.session.AppKeyPair;
import com.dropbox.client2.session.TokenPair;
import com.dropbox.client2.session.Session.AccessType;
//import com.example.fulldb.MainActivity;
//import com.example.fulldb.R;
//import com.example.fulldb.list_files;

import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
//import android.widget.ImageView;
import android.widget.LinearLayout;
//import android.widget.ScrollView;
import android.widget.Toast;

public class ResourceActivity extends Activity {
	private static final String TAG = "FullDB";	 	
 	final static private String APP_KEY = "zravzk3rpvdy36v";
    final static private String APP_SECRET = "64tfi3b4ffbqzzi";
    final static private AccessType ACCESS_TYPE = AccessType.DROPBOX;
    final static private String ACCOUNT_PREFS_NAME = "prefs";
    final static private String ACCESS_KEY_NAME = "ACCESS_KEY";
    final static private String ACCESS_SECRET_NAME = "ACCESS_SECRET";
    DropboxAPI<AndroidAuthSession> mApi;
    private boolean mLoggedIn;
    
    private Button mSubmit;
    private LinearLayout mDisplay;
    private Button mPhoto;
   // private Button mRoulette;

    //private ImageView mImage;
    Intent intent;
   
    Entry existingEntry;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		AndroidAuthSession session = buildSession();
        mApi = new DropboxAPI<AndroidAuthSession>(session);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
       // intent= new Intent(ResourceActivity.this, list_files.class);
        checkAppKeySetup();

		setContentView(R.layout.activity_resource);
		
		 mSubmit = (Button)findViewById(R.id.button1);
	     mPhoto = (Button)findViewById(R.id.button2);
			//mPhoto.setVisibility(View.GONE);
			
			 mSubmit.setOnClickListener(new OnClickListener() {
		            public void onClick(View v) {
		                // This logs you out if you're logged in, or vice versa
		                if (mLoggedIn) {
		                    logOut();
		                } else {
		                    // Start the remote authentication
		                    mApi.getSession().startAuthentication(ResourceActivity.this);
		                }
		            }
		        });
			 mPhoto.setOnClickListener(new OnClickListener(){
				  public void onClick(View v) {
		                //Intent intent = new Intent();
					  try {
						existingEntry = mApi.metadata("/Getting Started.pdf", 1, null, false, null);
					} catch (DropboxException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Log.i("DbExampleLog", "The file's rev is now: " + existingEntry.rev);
					Log.i("DbExampleLog", "The file's rev is now: " + existingEntry.size); 
					Log.i("DbExampleLog", "The file's rev is now: " + existingEntry.fileName());
						  
						 
					  /*startActivity(intent);
					  finish();*/
				  }});
			 //mDisplay = (LinearLayout)findViewById(R.id.linlay);
		}

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.resource, menu);
		return true;
	}
	 @Override
	    protected void onResume() {
	        super.onResume();
	        //AndroidAuthSession session = mApi.getSession();

	        // The next part must be inserted in the onResume() method of the
	        // activity from which session.startAuthentication() was called, so
	        // that Dropbox authentication completes properly.
	        if (mApi.getSession().authenticationSuccessful()) {
	            try {
	                // Mandatory call to complete the auth
	                mApi.getSession().finishAuthentication();

	                // Store it locally in our app for later use
	                TokenPair tokens = mApi.getSession().getAccessTokenPair();
	                storeKeys(tokens.key, tokens.secret);
	                setLoggedIn(true);
	            } catch (IllegalStateException e) {
	                showToast("Couldn't authenticate with Dropbox:" + e.getLocalizedMessage());
	                Log.i(TAG, "Error authenticating", e);
	            }
	            catch (Exception e){
	            	e.printStackTrace();
	            }
	        }
	        
	       
	    }

	private void logOut() {
     // Remove credentials from the session
     mApi.getSession().unlink();

     // Clear our stored keys
     clearKeys();
     // Change UI state to display logged out version
     setLoggedIn(false);
 }
	
	  private void setLoggedIn(boolean loggedIn) {
	    	mLoggedIn = loggedIn;
	    	if (loggedIn) {
	    		mSubmit.setText("Unlink from Dropbox");
	            mDisplay.setVisibility(View.VISIBLE);
	            mPhoto.setVisibility(View.VISIBLE);
	    	} else {
	    		mSubmit.setText("Link with Dropbox");
	           mDisplay.setVisibility(View.GONE);
	            mPhoto.setVisibility(View.GONE);
	           // mImage.setImageDrawable(null);
	    	}
	    }
	
	
	private void checkAppKeySetup() {
     // Check to make sure that we have a valid app key
     if (APP_KEY.startsWith("CHANGE") ||
             APP_SECRET.startsWith("CHANGE")) {
         showToast("You must apply for an app key and secret from developers.dropbox.com, and add them to the DBRoulette ap before trying it.");
         finish();
         return;
     }

     // Check if the app has set up its manifest properly.
     Intent testIntent = new Intent(Intent.ACTION_VIEW);
     String scheme = "db-" + APP_KEY;
     String uri = scheme + "://" + AuthActivity.AUTH_VERSION + "/test";
     testIntent.setData(Uri.parse(uri));
     PackageManager pm = getPackageManager();
     if (0 == pm.queryIntentActivities(testIntent, 0).size()) {
         showToast("URL scheme in your app's " +
                 "manifest is not set up correctly. You should have a " +
                 "com.dropbox.client2.android.AuthActivity with the " +
                 "scheme: " + scheme);
         finish();
     }
 }
	 private void showToast(String msg) {
	        Toast error = Toast.makeText(this, msg, Toast.LENGTH_LONG);
	        error.show();
	    }
	 
	 
	 private String[] getKeys() {
	        SharedPreferences prefs = getSharedPreferences(ACCOUNT_PREFS_NAME, 0);
	        String key = prefs.getString(ACCESS_KEY_NAME, null);
	        String secret = prefs.getString(ACCESS_SECRET_NAME, null);
	        if (key != null && secret != null) {
	        	String[] ret = new String[2];
	        	ret[0] = key;
	        	ret[1] = secret;
	        	return ret;
	        } else {
	        	return null;
	        }
	    }
	    /**
	     * Shows keeping the access keys returned from Trusted Authenticator in a local
	     * store, rather than storing user name & password, and re-authenticating each
	     * time (which is not to be done, ever).
	     */
	    private void storeKeys(String key, String secret) {
	        // Save the access key for later
	        SharedPreferences prefs = getSharedPreferences(ACCOUNT_PREFS_NAME, 0);
	        Editor edit = prefs.edit();
	        edit.putString(ACCESS_KEY_NAME, key);
	        edit.putString(ACCESS_SECRET_NAME, secret);
	        edit.commit();
	    }

	    private void clearKeys() {
	        SharedPreferences prefs = getSharedPreferences(ACCOUNT_PREFS_NAME, 0);
	        Editor edit = prefs.edit();
	        edit.clear();
	        edit.commit();
	    }

	    protected AndroidAuthSession buildSession() {
	        AppKeyPair appKeyPair = new AppKeyPair(APP_KEY, APP_SECRET);
	        AndroidAuthSession session;

	        String[] stored = getKeys();
	        if (stored != null) {
	            AccessTokenPair accessToken = new AccessTokenPair(stored[0], stored[1]);
	            session = new AndroidAuthSession(appKeyPair, ACCESS_TYPE, accessToken);
	        } else {
	            session = new AndroidAuthSession(appKeyPair, ACCESS_TYPE);
	        }

	        return session;
	    }
}
