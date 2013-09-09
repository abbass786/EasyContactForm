package com.easycontactformandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class EasyContactFormActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_contact_form);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.easy_contact_form, menu);
        return true;
    }
    
}
