package com.example.mvvm.ui;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm.util.MyModel;

public class AppViewModel extends ViewModel {

    MutableLiveData<String> mutableLiveData = new MutableLiveData<>();

    //Connect ViewModel with Database(Model)
    private MyModel getAppFromDatabase(){
        return new MyModel("Master Class App",900000,5);
    }

    //Connect ViewModel with MainActivity(View)
    public void getAppName(){
        String appName = getAppFromDatabase().getAppName();
        mutableLiveData.setValue(appName);
    }
}
