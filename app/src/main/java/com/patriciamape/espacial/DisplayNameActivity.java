package com.patriciamape.espacial;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DisplayNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_name);

        // Get the message from the intent
        Intent intent = getIntent();
        String nombre = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Recogemos el TextView y le ponemos los datos introducidos
        TextView text = (TextView) findViewById(R.id.textView2);
        text.setText(nombre);




    }

}
