package com.example.mvpdalvik;

public interface MainActivityContract {

    interface View {
        void start();
        void setViewData(String data);
    }

    interface Model {
        String getData();
    }

    interface Presenter {
        void onClick(android.view.View view);
    }
}
