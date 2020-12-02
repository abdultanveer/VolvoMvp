package com.next.volvomvp.main;

import com.next.volvomvp.data.source.NotesDataSource;
import com.next.volvomvp.data.source.Repository;
import com.next.volvomvp.data.TodoNote;

public class MainPresenter implements MainContract.presenter, NotesDataSource.onNoteLoadedDbCallback {//2//9
    MainContract.view view;//12
    Repository repository;

    public MainPresenter(MainActivity mainActivity) {
        view = mainActivity; //wiring//13
        repository = new Repository();
    }



    @Override
    public void somebodyClickedButton(String name) {
        // hey mr view please update your textview to hello mvp
        //presenter tells the model[repository] to getnote from db
        repository.getTodonotefromDb(this);
        repository.saveNote(name);
    }

    @Override
    public void onNoteloaded(TodoNote note) {
        view.plzUpdateTextview(note.getTitle());//14

    }
}
