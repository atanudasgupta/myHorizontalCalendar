package com.emerald.mycalendar;


import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CalendarAdapter extends RecyclerView.Adapter<CalendarAdapter.MyViewHolder> {

    private List<MyCalendar> mCalendar;
    private int recyclecount=0;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tb_day, tb_date;


        public MyViewHolder(View view) {
            super(view);
            tb_day = (TextView) view.findViewById(R.id.day_1);
            tb_date = (TextView) view.findViewById(R.id.date_1);


        }

    }


    public CalendarAdapter(List<MyCalendar> mCalendar) {
        this.mCalendar = mCalendar;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.date_list_row, parent, false);


        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MyCalendar calendar = mCalendar.get(position);

        holder.tb_day.setText(calendar.getDay());

        holder.tb_date.setText(calendar.getDate());

    }

    @Override
    public int getItemCount() {
        return mCalendar.size();
    }

    @Override
    public void onViewRecycled (MyViewHolder holder){

        recyclecount++;

    }




}

