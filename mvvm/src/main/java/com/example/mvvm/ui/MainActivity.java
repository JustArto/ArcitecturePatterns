package com.example.mvvm.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.mvvm.R;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    TextView myTextView;

    AppViewModel appViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = findViewById(R.id.textView);
        myButton = findViewById(R.id.button);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appViewModel.getAppName();
                Log.d("MYTAG","OnClick");
            }
        });

        appViewModel = new ViewModelProvider(this).get(AppViewModel.class);

        appViewModel.mutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.d("MYTAG",s);
                    myTextView.setText(s);
            }
        });
    }

    //MVVM
    //Model: MyModel
    //View: myTextView
    //ViewModel: MainActivity
}