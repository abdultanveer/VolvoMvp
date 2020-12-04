package com.next.volvomvp.data.source;

import com.next.volvomvp.data.source.local.LocalDataSource;


//main point of contact for both local and remote data source
public class Repository implements NotesDataSource {

LocalDataSource localDataSource;

    public Repository() {
        localDataSource = new LocalDataSource();
    }

    @Override
    public void  getTodonotefromDb(onNoteLoadedDbCallback callback){
        localDataSource.getTodonotefromDb(callback);//repository decides to get data from local datasource becoz no internet

    }

    @Override
    public void getNotesDb(onNotesloadedCallback notesCallback) {
        localDataSource.getNotesDb(notesCallback);
    }

    @Override
    public void saveNote(String name) {
        localDataSource.saveNote(name);
    }
}
