package com.next.volvomvp.data.source;

import com.next.volvomvp.data.TodoNote;

// talks b/w presenter and model[data]
//single point of truth
public interface NotesDataSource {

  public void  getTodonotefromDb(onNoteLoadedDbCallback callback);

  void saveNote(String name);

  interface onNoteLoadedDbCallback {
    void onNoteloaded(TodoNote note);
  }
}
