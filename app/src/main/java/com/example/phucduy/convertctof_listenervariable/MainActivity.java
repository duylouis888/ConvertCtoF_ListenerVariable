package com.example.phucduy.convertctof_listenervariable;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnConvert2C, btnConvert2F, btnClear;
    private EditText editTextDoF, editTextDoC;

    private View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("TEST","Okie");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClear = (Button)findViewById(R.id.btnClear);
        btnClear.setOnClickListener(myClick);
    }
}
