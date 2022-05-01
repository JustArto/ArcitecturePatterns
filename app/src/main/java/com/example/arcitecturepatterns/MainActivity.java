package com.example.arcitecturepatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.arcitecturepatterns.R;
import com.example.arcitecturepatterns.MyModel;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = findViewById(R.id.textView);
        myButton = findViewById(R.id.button);

//        myButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                myTextView.setText(GetAppFromModel().getAppName() +"Downloads "+GetAppFromModel().getAppDownloads());
//            }
//        });
    }

    public MyModel GetAppFromModel(){
        return new MyModel("Master Codding App",700000,5);
    }

    @SuppressLint("SetTextI18n")
    public void DisplayAppInText(View view) {
        myTextView.setText(GetAppFromModel().getAppName() +"Downloads "+GetAppFromModel().getAppDownloads());
    }

    //MVC
    //Model: MyModel
    //View: myTextView
    //Controller: MainActivity
}