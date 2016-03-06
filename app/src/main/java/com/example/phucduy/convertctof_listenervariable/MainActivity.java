package com.example.phucduy.convertctof_listenervariable;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnConvert2C, btnConvert2F, btnClear;
    private EditText editTextDoF, editTextDoC;

    private View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try{
                if (v==btnClear){
                    editTextDoF.setText("");
                    editTextDoC.setText("");
                    editTextDoF.requestFocus();
                }else if (v==btnConvert2C){
                    int doF = Integer.parseInt(editTextDoF.getText().toString());
                    int doC = (doF - 32)*5/9;
                    editTextDoC.setText(String.valueOf(doC));
                }else if (v==btnConvert2F){
                    int doC = Integer.parseInt(editTextDoC.getText().toString());
                    int doF = doC*9/5 + 32;
                    editTextDoF.setText(String.valueOf(doF));
                }
            }catch (Throwable e){
                Toast.makeText(MainActivity.this,"Invalid Input",Toast.LENGTH_LONG).show();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextDoF = (EditText)findViewById(R.id.editTextDoF);
        editTextDoC = (EditText)findViewById(R.id.editTextDoC);

        btnConvert2C = (Button)findViewById(R.id.btnConvert2C);
        btnConvert2F = (Button)findViewById(R.id.btnConvert2F);
        btnClear = (Button)findViewById(R.id.btnClear);

        btnConvert2C.setOnClickListener(myClick);
        btnConvert2F.setOnClickListener(myClick);
        btnClear.setOnClickListener(myClick);
    }
}
