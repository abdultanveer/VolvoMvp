package com.next.volvomvp.data.local;

import com.next.volvomvp.data.NotesDataSource;
import com.next.volvomvp.data.TodoNote;

public class LocalDb {

    public void  getNote(NotesDataSource.onNoteLoadedDbCallback callback){
        //querying db and returning the data
        callback.onNoteloaded(new TodoNote("vtitle","vsubtitle"));
    }
}
