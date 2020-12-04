package com.next.volvomvp.add;

import com.next.volvomvp.data.TodoNote;
import com.next.volvomvp.data.source.NotesDataSource;
import com.next.volvomvp.data.source.Repository;

import java.util.ArrayList;

public class AddEditPresenter implements AddEditContract.presenter, NotesDataSource.onNotesloadedCallback {
    NotesDataSource repository;
    AddEditContract.view view;

    public AddEditPresenter(AddEditActivity addEditActivity) {
        repository = new Repository();
        view = addEditActivity;
    }

    @Override
    public void activityCreated() {
        //ask the repository to get the data
      repository.getNotesDb(this);

    }

    @Override
    public void onNotesLoaded(ArrayList<TodoNote> notes) {
        view.loadDataListview(notes);
    }
}
