package com.next.volvomvp.main;

public class MainPresenter implements MainContract.presenter {
    MainContract.view view;

    public MainPresenter(MainActivity mainActivity) {
        view = mainActivity; //wiring
    }



    @Override
    public void somebodyClickedButton() {
        // hey mr view please update your textview to hello mvp
        view.plzUpdateTextview("hello mvp");
    }
}
