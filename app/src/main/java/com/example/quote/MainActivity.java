package com.example.quote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


   private TextView textView;
   private Button refreshBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        refreshBtn=findViewById(R.id.button);
        textView= findViewById(R.id.textView);

        refreshBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               quotesService quotesservice = new quotesService();

               textView.setText(quotesservice.getRandomQuotes());

                 }
        });

    }





}