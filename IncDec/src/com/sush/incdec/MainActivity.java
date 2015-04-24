/*Author: Sushanth Manakhari
**Email: sushanth.manakhari@gmail.com*/

package com.sush.incdec;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	
	int counter=0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                        
        Button inc = (Button)this.findViewById(R.id.inc);
		inc.setOnClickListener(new Button.OnClickListener() { 
			public void onClick(View v) 
			{

				TextView resp = (TextView) findViewById(R.id.response);
				counter++;
				resp.setText("Result: "+counter);
			} 
		});

		Button dec = (Button)this.findViewById(R.id.dec);
		dec.setOnClickListener(new Button.OnClickListener() { 
			public void onClick(View v) 
			{

				TextView resp = (TextView) findViewById(R.id.response);
				counter--;
				resp.setText("Result: "+counter);
			} 
		});
    }
}
