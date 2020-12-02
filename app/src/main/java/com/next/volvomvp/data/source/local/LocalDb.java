package com.next.volvomvp.data.source.local;

import android.util.Log;

import com.next.volvomvp.data.source.NotesDataSource;
import com.next.volvomvp.data.TodoNote;

public class LocalDb {
    public static String TAG = LocalDb.class.getSimpleName();
    public void  getNote(NotesDataSource.onNoteLoadedDbCallback callback){
        //querying db and returning the data
        callback.onNoteloaded(new TodoNote("vtitle","vsubtitle"));
    }

    public void saveNote(String name) {
        Log.i(TAG,"note saveed in local db = "+ name);
    }
}
