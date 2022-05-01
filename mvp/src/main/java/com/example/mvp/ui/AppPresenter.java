package com.example.mvp.ui;

import com.example.mvp.util.MyModel;

public class AppPresenter {

    AppView appView;

    public AppPresenter(AppView appView) {
        this.appView = appView;
    }

    public MyModel GetAppFromModel(){
        return new MyModel("Master Codding App",700000,5);
    }

    public void getAppName(){
        appView.onGetAppName(GetAppFromModel().getAppName());
    }

}
