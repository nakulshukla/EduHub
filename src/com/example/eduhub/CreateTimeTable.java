package com.example.eduhub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;


public class CreateTimeTable extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_time_table);
		// Get the message from the intent
	    int j;
		Intent intent = getIntent();
	    String message = intent.getStringExtra(NewTT.EXTRA_MESSAGE);
	    String message2 = intent.getStringExtra(NewTT.EXTRA_MESSAGE2);
	    int lec = Integer.parseInt(message);
	    int day =  Integer.parseInt(message2);
	    
	    ScrollView sv = new ScrollView(this);
	    sv.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
	    TableLayout ll=new TableLayout(this);
	    HorizontalScrollView hsv = new HorizontalScrollView(this);
	    
	    if(day==1) 
	       {for(int i=1;i<=lec;i++) 
		     {
		        TableRow trow=new TableRow(this);

		        for(j=1;j<=1;j++) {
		        	if(i==1&&j==1)
		        	{
		        		TextView tv1=new TextView(this);
		                TextView tv2=new TextView(this);
		                tv1.setText("TIME");
		                tv1.setId(101);
		                tv1.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv1);
		                tv2.setText("MONDAY");
		                tv2.setId(102);
		                tv2.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv2);
		                }
		            EditText e1=new EditText(this);
		            if(j==1)
		            	e1.setInputType(InputType.TYPE_DATETIME_VARIATION_TIME);
		            e1.setId(i+j);
		            e1.setBackgroundResource(R.drawable.cell_shape);
		            trow.addView(e1);                
		        }
		        ll.addView(trow);
		        View v = new View(this);
		        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT );
		        v.setLayoutParams(params);
		        v.setBackgroundResource(R.drawable.blackboard);
		        ll.addView(v);
		    }
	       }
	    
	    else if(day==2) 
	       {for(int i=1;i<=lec;i++) 
		     {
		        TableRow trow=new TableRow(this);

		        for(j=1;j<=2;j++) {
		        	if(i==1&&j==1)
		        	{
		        		TextView tv1=new TextView(this);
		                TextView tv2=new TextView(this);
		                TextView tv3=new TextView(this);
		                tv1.setText("TIME");
		                tv1.setId(101);
		                tv1.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv1);
		                tv2.setText("MONDAY");
		                tv2.setId(102);
		                tv2.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv2);
		                tv3.setText("TUESDAY");
		                tv3.setId(103);
		                tv3.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv3);
		                }
		            EditText e1=new EditText(this);
		           //e1.setText("Element :"+ i + "" + j);
		            if(j==1)
		            	e1.setInputType(InputType.TYPE_DATETIME_VARIATION_TIME);
		            e1.setId(i+j);
		            e1.setBackgroundResource(R.drawable.cell_shape);
		            trow.addView(e1);                
		        }
		        ll.addView(trow);
		        View v = new View(this);
		        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 5);
		        v.setLayoutParams(params);
		        v.setBackgroundColor(getResources().getColor(android.R.color.transparent));
		        ll.addView(v);
		    }
	       }	

	    else if(day==3) 
	       {for(int i=1;i<=lec;i++) 
		     {
		        TableRow trow=new TableRow(this);

		        for(j=1;j<=3;j++) {
		        	if(i==1&&j==1)
		        	{
		        		TextView tv1=new TextView(this);
		                TextView tv2=new TextView(this);
		                TextView tv3=new TextView(this);
		                TextView tv4=new TextView(this);
		                tv1.setText("TIME");
		                tv1.setId(101);
		                tv1.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv1);
		                tv2.setText("MONDAY");
		                tv2.setId(102);
		                tv2.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv2);
		                tv3.setText("TUESDAY");
		                tv3.setId(103);
		                tv3.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv3);
		                tv4.setText("WEDNESDAY");
		                tv4.setId(104);
		                tv4.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv4);
		                }
		            EditText e1=new EditText(this);
		           //e1.setText("Element :"+ i + "" + j);
		            if(j==1)
		            	e1.setInputType(InputType.TYPE_DATETIME_VARIATION_TIME);
		            e1.setId(i+j);
		            e1.setBackgroundResource(R.drawable.cell_shape);
		            trow.addView(e1);                
		        }
		        ll.addView(trow);
		        View v = new View(this);
		        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 5);
		        v.setLayoutParams(params);
		        v.setBackgroundColor(getResources().getColor(android.R.color.transparent));
		        ll.addView(v);
		    }
	       }
	    
	    else if(day==4) 
	       {for(int i=1;i<=lec;i++) 
		     {
		        TableRow trow=new TableRow(this);

		        for(j=1;j<=4;j++) {
		        	if(i==1&&j==1)
		        	{
		        		TextView tv1=new TextView(this);
		                TextView tv2=new TextView(this);
		                TextView tv3=new TextView(this);
		                TextView tv4=new TextView(this);
		                TextView tv5=new TextView(this);
		                tv1.setText("TIME");
		                tv1.setId(101);
		                tv1.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv1);
		                tv2.setText("MONDAY");
		                tv2.setId(102);
		                tv2.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv2);
		                tv3.setText("TUESDAY");
		                tv3.setId(103);
		                tv3.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv3);
		                tv4.setText("WEDNESDAY");
		                tv4.setId(104);
		                tv4.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv4);
		                tv5.setText("THURSDAY");
		                tv5.setId(102);
		                tv5.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv5);
		                }
		            EditText e1=new EditText(this);
		           //e1.setText("Element :"+ i + "" + j);
		            if(j==1)
		            	e1.setInputType(InputType.TYPE_DATETIME_VARIATION_TIME);
		            e1.setId(i+j);
		            e1.setBackgroundResource(R.drawable.cell_shape);
		            trow.addView(e1);                
		        }
		        ll.addView(trow);
		        View v = new View(this);
		        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 5);
		        v.setLayoutParams(params);
		        v.setBackgroundColor(getResources().getColor(android.R.color.transparent));
		        ll.addView(v);
		    }
	       }
	    
	    else if(day==5) 
	       {for(int i=1;i<=lec;i++) 
		     {
		        TableRow trow=new TableRow(this);

		        for(j=1;j<=5;j++) {
		        	if(i==1&&j==1)
		        	{
		        		TextView tv1=new TextView(this);
		                TextView tv2=new TextView(this);
		                TextView tv3=new TextView(this);
		                TextView tv4=new TextView(this);
		                TextView tv5=new TextView(this);
		                TextView tv6=new TextView(this);
		                tv1.setText("TIME");
		                tv1.setId(101);
		                tv1.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv1);
		                tv2.setText("MONDAY");
		                tv2.setId(102);
		                tv2.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv2);
		                tv3.setText("TUESDAY");
		                tv3.setId(103);
		                tv3.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv3);
		                tv4.setText("WEDNESDAY");
		                tv4.setId(104);
		                tv4.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv4);
		                tv5.setText("THURSDAY");
		                tv5.setId(102);
		                tv5.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv5);
		                tv6.setText("FRIDAY");
		                tv6.setId(102);
		                tv6.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv6);
		                }
		            EditText e1=new EditText(this);
		           //e1.setText("Element :"+ i + "" + j);
		            if(j==1)
		            	e1.setInputType(InputType.TYPE_DATETIME_VARIATION_TIME);
		            e1.setId(i+j);
		            e1.setBackgroundResource(R.drawable.cell_shape);
		            trow.addView(e1);                
		        }
		        ll.addView(trow);
		        View v = new View(this);
		        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 5);
		        v.setLayoutParams(params);
		        v.setBackgroundColor(getResources().getColor(android.R.color.transparent));
		        ll.addView(v);
		    }
	       }
	    
	    else if(day==6) 
       {for(int i=1;i<=lec;i++) 
	     {
	        TableRow trow=new TableRow(this);

	        for(j=1;j<=6;j++) {
	        	if(i==1&&j==1)
	        	{
	        		TextView tv1=new TextView(this);
	                TextView tv2=new TextView(this);
	                TextView tv3=new TextView(this);
	                TextView tv4=new TextView(this);
	                TextView tv5=new TextView(this);
	                TextView tv6=new TextView(this);
	                TextView tv7=new TextView(this);
	                tv1.setText("TIME");
	                tv1.setId(101);
	                tv1.setBackgroundResource(R.drawable.cell_shape);
	                trow.addView(tv1);
	                tv2.setText("MONDAY");
	                tv2.setId(102);
	                tv2.setBackgroundResource(R.drawable.cell_shape);
	                trow.addView(tv2);
	                tv3.setText("TUESDAY");
	                tv3.setId(103);
	                tv3.setBackgroundResource(R.drawable.cell_shape);
	                trow.addView(tv3);
	                tv4.setText("WEDNESDAY");
	                tv4.setId(104);
	                tv4.setBackgroundResource(R.drawable.cell_shape);
	                trow.addView(tv4);
	                tv5.setText("THURSDAY");
	                tv5.setId(102);
	                tv5.setBackgroundResource(R.drawable.cell_shape);
	                trow.addView(tv5);
	                tv6.setText("FRIDAY");
	                tv6.setId(102);
	                tv6.setBackgroundResource(R.drawable.cell_shape);
	                trow.addView(tv6);
	                tv7.setText("SATURDAY");
	                tv7.setId(102);
	                tv7.setBackgroundResource(R.drawable.cell_shape);
	                trow.addView(tv7);
	            }
	            EditText e1=new EditText(this);
	           //e1.setText("Element :"+ i + "" + j);
	            if(j==1)
	            	e1.setInputType(InputType.TYPE_DATETIME_VARIATION_TIME);
	            e1.setId(i+j);
	            e1.setBackgroundResource(R.drawable.cell_shape);
	            trow.addView(e1);                
	        }
	        ll.addView(trow);
	        View v = new View(this);
	        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 5);
	        v.setLayoutParams(params);
	        v.setBackgroundColor(getResources().getColor(android.R.color.transparent));
	        ll.addView(v);
	    }
       }
	    
	    
	    hsv.addView(ll);
	    sv.addView(hsv);
	    setContentView(sv);
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.create_time_table, menu);
		return true;
	}

}
