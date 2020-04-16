package com.example.rickmc.javaandpractice2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText enterMeters;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         enterMeters = (EditText) findViewById(R.id.editText);
         resultTextView = (TextView) findViewById(R.id.resultText);
         convertButton = (Button) findViewById(R.id.convertButton);

         convertButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 double multiplier = 39.37;
                 double result = 0.0;

                 if (enterMeters.getText().toString().equals("")){
                     resultTextView.setText(R.string.error_message);
                     resultTextView.setTextColor(Color.RED);
                 } else {
                     double meterValue = Double.parseDouble(enterMeters.getText().toString());
                     result = meterValue * multiplier;
                     resultTextView.setTextColor(Color.DKGRAY);

                     //     resultTextView.setText(Double.toString(result) +" Inches");
                     resultTextView.setText(String.format("%.2f", result) + " Inches Wooza!");
                 }

             }
         });

    }
}
