package com.example.eduhub;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class SchedulerActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scheduler);
		
         Button btn_existing = (Button) findViewById(R.id.btn_exs);
		 
		 Button btn_new= (Button) findViewById(R.id.btn_new);
		
		 // Listening to Existing Time Table button click
		    btn_existing.setOnClickListener(new View.OnClickListener() {
		         
		        @Override
		        public void onClick(View view) {
		            // Launching News Feed Screen
		            Intent i = new Intent(getApplicationContext(), ExistingTT.class);
		            startActivity(i);
		        }
		    });
			
	   // Listening to New Time Table button click
			    btn_new.setOnClickListener(new View.OnClickListener() {
			         
			        @Override
			        public void onClick(View view) {
			            // Launching News Feed Screen
			            Intent i = new Intent(getApplicationContext(), NewTT.class);
			            startActivity(i);
			        }
			    });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.scheduler, menu);
		return true;
	}

}
