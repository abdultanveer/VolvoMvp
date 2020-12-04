package com.next.volvomvp.add;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.next.volvomvp.R;
import com.next.volvomvp.data.TodoNote;

import java.util.ArrayList;

public class AddEditActivity extends AppCompatActivity implements AddEditContract.view{ //activity is a view wrt MVP
    AddEditContract.presenter presenter;
    ListView noteListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit);
        noteListView = findViewById(R.id.listviewNotes);
        //hey presenter i have created what should i do next
        presenter = new AddEditPresenter(this);
        presenter.activityCreated();
    }

    @Override
    public void loadDataListview(ArrayList<TodoNote> notes) {
        ArrayAdapter<TodoNote> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, notes);
        noteListView.setAdapter(adapter);

    }
}