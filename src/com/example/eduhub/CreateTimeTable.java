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
	    int t=0;
	    if(day==1) 
	       {for(int i=0;i<=lec;i++) 
		     {  TableRow trow=new TableRow(this);
                 if(i==0)
		        	{   TextView tv1=new TextView(this);
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
                 else
		            {EditText e1=new EditText(this);
		              e1.setInputType(InputType.TYPE_DATETIME_VARIATION_TIME);
		              e1.setId(t);
		              t++;
		              e1.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e1);
		              EditText e2=new EditText(this);
		              e2.setId(t);
		              t++;
		              e2.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e2);		              
		           }
		        
		        ll.addView(trow);
		        View v = new View(this);
		        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 5);
		        v.setLayoutParams(params);
		        v.setBackgroundColor(getResources().getColor(android.R.color.transparent));
		        ll.addView(v);
		    }
	       }
	    
	    else if(day==2) 
	       {for(int i=0;i<=lec;i++) 
		     {
		        TableRow trow=new TableRow(this);
				 if(i==0)
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
				 else
		            {EditText e1=new EditText(this);
		              e1.setId(t);
		              t++;
		              e1.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e1);
		              EditText e2=new EditText(this);
		              e2.setId(t);
		              t++;
		              e2.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e2);
		              EditText e3=new EditText(this);
		              e3.setId(t);
		              t++;
		              e3.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e3);
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
	       {for(int i=0;i<=lec;i++) 
		     {
		        TableRow trow=new TableRow(this);

		        	if(i==0)
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
		        	else
		        	{
		        		EditText e1=new EditText(this);
			              e1.setId(t);
			              t++;
			              e1.setBackgroundResource(R.drawable.cell_shape);
			              trow.addView(e1);
			              EditText e2=new EditText(this);
			              e2.setId(t);
			              t++;
			              e2.setBackgroundResource(R.drawable.cell_shape);
			              trow.addView(e2);
			              EditText e3=new EditText(this);
			              e3.setId(t);
			              t++;
			              e3.setBackgroundResource(R.drawable.cell_shape);
			              trow.addView(e3);
			              EditText e4=new EditText(this);
			              e4.setId(t);
			              t++;
			              e4.setBackgroundResource(R.drawable.cell_shape);
			              trow.addView(e4);    
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
	       {for(int i=0;i<=lec;i++) 
		     {
		        TableRow trow=new TableRow(this);

		        if(i==0)
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
		        else
		            { EditText e1=new EditText(this);
		              e1.setId(t);
		              t++;
		              e1.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e1);
		              EditText e2=new EditText(this);
		              e2.setId(t);
		              t++;
		              e2.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e2);
		              EditText e3=new EditText(this);
		              e3.setId(t);
		              t++;
		              e3.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e3);
		              EditText e4=new EditText(this);
		              e4.setId(t);
		              t++;
		              e4.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e4);
		        	  EditText e5=new EditText(this);
		              e5.setId(t);
		              t++;
		              e5.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e5);                
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
	       {for(int i=0;i<=lec;i++) 
		     {
		        TableRow trow=new TableRow(this);
		        	if(i==0)
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
		        else
		         { EditText e1=new EditText(this);
	              e1.setId(t);
	              t++;
	              e1.setBackgroundResource(R.drawable.cell_shape);
	              trow.addView(e1);
	              EditText e2=new EditText(this);
	              e2.setId(t);
	              t++;
	              e2.setBackgroundResource(R.drawable.cell_shape);
	              trow.addView(e2);
	              EditText e3=new EditText(this);
	              e3.setId(t);
	              t++;
	              e3.setBackgroundResource(R.drawable.cell_shape);
	              trow.addView(e3);
	              EditText e4=new EditText(this);
	              e4.setId(t);
	              t++;
	              e4.setBackgroundResource(R.drawable.cell_shape);
	              trow.addView(e4);
	        	  EditText e5=new EditText(this);
	              e5.setId(t);
	              t++;
	              e5.setBackgroundResource(R.drawable.cell_shape);
	              trow.addView(e5);
	              EditText e6=new EditText(this);
	              e6.setId(t);
	              t++;
	              e6.setBackgroundResource(R.drawable.cell_shape);
	              trow.addView(e6);
	             
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
       {for(int i=0;i<=lec;i++) 
	     {
	        TableRow trow=new TableRow(this);

	        	if(i==0)
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
	       else	
	       {  EditText e1=new EditText(this);
              e1.setId(t);
              t++;
              e1.setBackgroundResource(R.drawable.cell_shape);
              trow.addView(e1);
              EditText e2=new EditText(this);
              e2.setId(t);
              t++;
              e2.setBackgroundResource(R.drawable.cell_shape);
              trow.addView(e2);
              EditText e3=new EditText(this);
              e3.setId(t);
              t++;
              e3.setBackgroundResource(R.drawable.cell_shape);
              trow.addView(e3);
              EditText e4=new EditText(this);
              e4.setId(t);
              t++;
              e4.setBackgroundResource(R.drawable.cell_shape);
              trow.addView(e4);
              EditText e5=new EditText(this);
              e5.setId(t);
              t++;
              e5.setBackgroundResource(R.drawable.cell_shape);
              trow.addView(e5);
              EditText e6=new EditText(this);
              e6.setId(t);
              t++;
              e6.setBackgroundResource(R.drawable.cell_shape);
              trow.addView(e6);
              EditText e7=new EditText(this);
              e7.setId(t);
              t++;
              e7.setBackgroundResource(R.drawable.cell_shape);
              trow.addView(e7);
              
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
