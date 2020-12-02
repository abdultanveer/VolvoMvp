package com.next.volvomvp.data;

// talks b/w presenter and model[data]
//single point of truth
public interface NotesDataSource {

  public void  getTodonotefromDb(onNoteLoadedDbCallback callback);

  interface onNoteLoadedDbCallback {
    void onNoteloaded(TodoNote note);
  }
}
