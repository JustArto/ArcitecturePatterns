package com.example.mvp.ui;

import android.util.Log;

import com.example.mvp.util.MyModel;

public class AppPresenter {

    AppView appView;

    public AppPresenter(AppView appView) {
        this.appView = appView;
    }

    public MyModel GetAppFromModel(){
        Log.d("MyTaag", "AppPresent GetAppFormModel");
        return new MyModel("Master Codding App",700000,5);
    }

    public void getAppName(){
        Log.d("MyTaag", "AppPresent getAppName");
        appView.onGetAppName(GetAppFromModel().getAppName());
    }

}
