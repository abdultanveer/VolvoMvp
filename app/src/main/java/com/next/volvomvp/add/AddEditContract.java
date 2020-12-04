package com.next.volvomvp.add;

import com.next.volvomvp.data.TodoNote;

import java.util.ArrayList;

public interface AddEditContract {

    //view to presenter
    interface  presenter{
        public void activityCreated();
    }

    //presenter tell to the view
    interface view{
        void loadDataListview(ArrayList<TodoNote> notes);
    }
}
