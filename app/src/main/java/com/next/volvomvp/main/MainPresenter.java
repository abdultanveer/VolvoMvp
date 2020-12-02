package com.next.volvomvp.main;

public class MainPresenter implements MainContract.presenter {//2//9
    MainContract.view view;//12

    public MainPresenter(MainActivity mainActivity) {
        view = mainActivity; //wiring//13
    }



    @Override
    public void somebodyClickedButton() {
        // hey mr view please update your textview to hello mvp
        view.plzUpdateTextview("hello mvp");//14
    }
}
