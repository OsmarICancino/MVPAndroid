package com.example.mvpdalvik;

import android.view.View;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View mView;
    private MainActivityContract.Model mModel;

    public MainActivityPresenter(MainActivityContract.View view) {

        mView = view;
        init();
    }

    private void init() {
        mModel = new MainActivityModel();
        mView.start();
    }

    @Override
    public void onClick(View view) {
        String data = mModel.getData();
        mView.setViewData(data);
    }
}
