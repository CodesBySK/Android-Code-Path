package com.example.viewsactivity;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText=(EditText)findViewById(R.id.txt_special);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
               boolean handled =false;
               if(actionId== EditorInfo.IME_ACTION_SEND){
                   //sendMessage();
                   handled=true;
               }
                return true;
            }
        });

    Button btnEnter =(Button) findViewById(R.id.btnEnter);

    //Intent intent = new Intent(this, SecondPageActivity2.class);
     btnEnter.setOnClickListener(new View.OnClickListener()

    {

        public void onClick (View v)
        {
            Intent intent = new Intent(MainActivity.this, SecondPageActivity2.class);
            startActivity(intent);
        }
    });
}

}