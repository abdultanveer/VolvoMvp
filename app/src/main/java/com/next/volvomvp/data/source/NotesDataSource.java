package com.next.volvomvp.data.source;

import com.next.volvomvp.data.TodoNote;

import java.util.ArrayList;

// talks b/w presenter and model[data]
//single point of truth
public interface NotesDataSource {

  public void  getTodonotefromDb(onNoteLoadedDbCallback callback);
  public  void getNotesDb(onNotesloadedCallback notesCallback);

  void saveNote(String name);

  interface onNoteLoadedDbCallback {
    void onNoteloaded(TodoNote note);
  }

  interface onNotesloadedCallback{
    void onNotesLoaded(ArrayList<TodoNote> notes);
  }
}
