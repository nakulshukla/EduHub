package com.example.eduhub;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewTT extends Activity {
	final Context context = this;
	private Button btn_cr;
	int Lec;
	int Days;
	public final static String EXTRA_MESSAGE = "com.example.eduhub.MESSAGE";
	public final static String EXTRA_MESSAGE2 = "com.example.eduhub.MESSAGE";
	Context c= this;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_tt);
	    btn_cr = (Button) findViewById(R.id.button1);
                                                                        // Code to check empty edit fields	
		btn_cr.setOnClickListener(new View.OnClickListener() 
		{ public void onClick(View view)
		      {     EditText et1 = (EditText) findViewById(R.id.nlec);
					//EditText et2 = (EditText) findViewById(R.id.nday);
					String text1 = et1.getText().toString();
					//String text2 = et2.getText().toString();
		    	    if (text1 == null || text1.equals("")/*||text2 == null || text2.equals("")*/) 
		    	    {
		    	    	AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(context);
		                dlgAlert.setMessage("Numbers not entered");
		                dlgAlert.setTitle("Error Message!!!");
		                dlgAlert.setPositiveButton("OK", null);
		                dlgAlert.setCancelable(true);
		                dlgAlert.create().show();

		                dlgAlert.setPositiveButton("Ok",
		                        new DialogInterface.OnClickListener() {
		                    public void onClick(DialogInterface dialog, int which) {

		                    }
		                });
		            }
		    	    else
		    	    {
		    	    	Intent intent = new Intent( c , CreateTimeTable.class);
		    	        EditText editText = (EditText) findViewById(R.id.nlec);
		    	        EditText editText2 = (EditText) findViewById(R.id.nday);
		    	        String message = editText.getText().toString();
		    	        String message2 = editText2.getText().toString();
		    	        intent.putExtra(EXTRA_MESSAGE, message);
		    	        intent.putExtra(EXTRA_MESSAGE2, message2);
		    	        startActivity(intent);
			        }
		         }
			    });
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_tt, menu);
		return true;
	}
	
}
