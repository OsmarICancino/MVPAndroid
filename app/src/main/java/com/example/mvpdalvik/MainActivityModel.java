package com.example.mvpdalvik;

public class MainActivityModel implements MainActivityContract.Model{

    private int counter = 0;

    @Override
    public String getData() {
        String msg = "Hello Universe \n";
        if(counter == 0) {
            counter++;
        } else {
            msg += counter++;
        }

        return msg;
    }
}
