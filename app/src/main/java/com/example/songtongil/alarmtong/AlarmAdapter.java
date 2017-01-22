package com.example.songtongil.alarmtong;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class AlarmAdapter extends RecyclerView.Adapter<AlarmAdapter.AlarmAdapterViewHolder>{

    private final Context mContext;
    private Cursor mCursor;

    public AlarmAdapter(Context mContext) {
        this.mContext = mContext;

    }

    @Override
    public AlarmAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(mContext)
                .inflate(R.layout.alarm_list_item, parent, false);
        view.setFocusable(true);

        return new AlarmAdapterViewHolder(view);


    }

    @Override
    public void onBindViewHolder(AlarmAdapterViewHolder Viewholder, int position) {
        Viewholder.AlarmTitle.setText("title");
        Viewholder.AlarmSummary.setText(position);
    }


    @Override
    public int getItemCount() {
        if(mCursor==null) return 0;
        return 0;
    }

    void swapCursor(Cursor cursor){
        mCursor=cursor;
        notifyDataSetChanged();
    }



    class AlarmAdapterViewHolder extends RecyclerView.ViewHolder {

        TextView AlarmTitle;
        TextView AlarmSummary;

        public AlarmAdapterViewHolder(View itemView) {
            super(itemView);


            AlarmTitle=(TextView)itemView.findViewById(R.id.alarm_item_title);
            AlarmSummary=(TextView)itemView.findViewById(R.id.alarm_item_summary);


        }




    }


}
