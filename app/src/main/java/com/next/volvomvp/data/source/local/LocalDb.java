package com.next.volvomvp.data.source.local;

import android.util.Log;

import com.next.volvomvp.data.source.NotesDataSource;
import com.next.volvomvp.data.TodoNote;

import java.util.ArrayList;

public class LocalDb {
    public static String TAG = LocalDb.class.getSimpleName();

    public void  getNote(NotesDataSource.onNoteLoadedDbCallback callback){
        //querying db and returning the data
        callback.onNoteloaded(new TodoNote("vtitle","vsubtitle"));
    }

    public void saveNote(String name) {
        Log.i(TAG,"note saveed in local db = "+ name);
    }

    public void getNotes(NotesDataSource.onNotesloadedCallback notesCallback) {
        ArrayList<TodoNote> notes = new ArrayList<>();
        notes.add(new TodoNote("title","subtitle"));
        notes.add(new TodoNote("title1","subtitle"));
        notes.add(new TodoNote("title2","subtitle"));
        notes.add(new TodoNote("title3","subtitle"));
        notes.add(new TodoNote("title4","subtitle"));

        notesCallback.onNotesLoaded(notes);

    }
}
