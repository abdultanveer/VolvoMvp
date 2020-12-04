package com.next.volvomvp.addedit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.next.volvomvp.R;
import com.next.volvomvp.data.TodoNote;

import java.util.ArrayList;

public class TodoAdapter extends BaseAdapter {
ArrayList<TodoNote> mTodoNotes;
Context mContext;
    public TodoAdapter(ArrayList<TodoNote> notes, Context context) {
        mTodoNotes = notes;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mTodoNotes.size();
    }

    @Override
    public TodoNote getItem(int position) {
        return mTodoNotes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    //return wooden plank
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(R.layout.row_listview,null);

        TextView titleTextView = convertView.findViewById(R.id.textViewtitle);
        TextView subtitleTextView = convertView.findViewById(R.id.textViewSubtitle);

        titleTextView.setText(getItem(position).getTitle());
        subtitleTextView.setText(getItem(position).getSubTitle());
        return convertView;
    }

    /**
     * This method adds 2 nos
     * @param firstNo first no
     * @param firstNo second no
     * @return sum of 2 nos
     */
    public int add(int firstNo , int secondNo){
        return  firstNo+secondNo;
    }
}
