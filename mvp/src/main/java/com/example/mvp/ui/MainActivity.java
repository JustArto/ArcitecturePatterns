package com.example.mvp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.mvp.R;
import com.example.mvp.util.MyModel;

public class MainActivity extends AppCompatActivity implements AppView {

    AppPresenter appPresenter;
    Button myButton;
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = findViewById(R.id.textView);
        myButton = findViewById(R.id.button);

        appPresenter = new AppPresenter(this);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MyTaag", "MainActivity buttonOnClick");
                appPresenter.getAppName();
            }
        });
    }

    @Override
    public void onGetAppName(String string) {
        Log.d("MyTaag", "MainActivity onGetAppName");
        myTextView.setText(string);
    }


//    @SuppressLint("SetTextI18n")
//    public void DisplayAppInText(View view) {
//        myTextView.setText(GetAppFromModel().getAppName() +"Downloads "+GetAppFromModel().getAppDownloads());
//    }

    //MVP
    //Model: MyModel
    //View: myTextView
    //Presenter: AppPresenter
}