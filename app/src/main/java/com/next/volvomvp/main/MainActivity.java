package com.next.volvomvp.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.next.volvomvp.R;


//MainActivity --- view --- noticeboard
public class MainActivity extends AppCompatActivity implements MainContract.view {//implementation//11
    MainPresenter presenter;//6
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);//7
        mTextView = findViewById(R.id.mTextview);
    }

    public void clickHandler(View view) {//1
        //hey mr presenter someone clicked me what should i do
        presenter.somebodyClickedButton();//8
    }

    @Override
    public void plzUpdateTextview(String hello_mvp) {
        mTextView.setText(hello_mvp);//15
    }
}