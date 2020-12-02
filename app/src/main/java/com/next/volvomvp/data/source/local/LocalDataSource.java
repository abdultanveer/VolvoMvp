package com.next.volvomvp.data.source.local;

//why locanotes datasource interface because you might be fetching the data from db/file
//or assembling data from different local sources


import com.next.volvomvp.data.source.NotesDataSource;

public class LocalDataSource implements NotesDataSource {

LocalDb localDb;

    public LocalDataSource() {
        localDb = new LocalDb();
    }

    @Override
    public void getTodonotefromDb(onNoteLoadedDbCallback callback) {
         localDb.getNote(callback);
    }

    @Override
    public void saveNote(String name) {
        localDb.saveNote(name);
    }
}
