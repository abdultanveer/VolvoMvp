package com.next.volvomvp.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.next.volvomvp.R;


//MainActivity --- view --- noticeboard
public class MainActivity extends AppCompatActivity implements MainContract.view {//implementation//11
    MainPresenter presenter;//6
    TextView mTextView;
    EditText noteEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);//7
        mTextView = findViewById(R.id.mTextview);
        noteEditText = findViewById(R.id.editTextNote);
    }

    public void clickHandler(View view) {//1
        //hey mr presenter someone clicked me what should i do
        String name = noteEditText.getText().toString();
        presenter.somebodyClickedButton(name);//8
    }

    @Override
    public void plzUpdateTextview(String hello_mvp) {
        mTextView.setText(hello_mvp);//15
    }
}