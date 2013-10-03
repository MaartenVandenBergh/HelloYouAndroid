package com.example.helloyou;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class HelloActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hello, menu);
        return true;
    }
    public void sayHello(View view) {
    	Log.v("TestLog", "Succes!");
    	Context context = getApplicationContext();
    	EditText mEdit   = (EditText)findViewById(R.id.editText1);
    	CharSequence text;
    	if(!TextUtils.isEmpty(mEdit.getText().toString())){
    		text = "Hello " +mEdit.getText().toString()+ ",\nhow are you today?";
    	}
    	else{
    		text = "FOLLOW INSTRUCTIONS DAMN IT!";
    	}
    	int duration = Toast.LENGTH_SHORT;

    	Toast toast = Toast.makeText(context, text, duration);
    	toast.show();
    }
}
