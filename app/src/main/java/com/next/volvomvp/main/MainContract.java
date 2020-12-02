package com.next.volvomvp.main;

public interface MainContract {
    //view to presenter
    interface presenter{
        public void somebodyClickedButton();
    }
    //presenter speaking to view
    interface view{  //switchboard
        public void plzUpdateTextview(String hello_mvp);
    }
}
