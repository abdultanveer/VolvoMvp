package com.next.volvomvp.main;

public interface MainContract {//3
    //view to presenter
    interface presenter{//4
        public void somebodyClickedButton();//5
    }
    //presenter speaking to view
    interface view{  //switchboard 10
        public void plzUpdateTextview(String hello_mvp);//11
    }
}
