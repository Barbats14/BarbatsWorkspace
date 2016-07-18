package com.example.nicholas.gameprofile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/*
 * Created by Nicholas on 7/15/2016.
 */

public class activeAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<eventInfo> events;

    private class ViewHolder {
        TextView textView1;
        TextView textView2;
        TextView textView3;
        TextView textView4;
    }

    public activeAdapter(Context context, ArrayList<eventInfo> events) {
        inflater = LayoutInflater.from(context);
        this.events = events;
    }

    public int getCount() {
        return events.size();
    }

    public eventInfo getItem(int position) {
        return events.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.active_row_layout, null);
            holder.textView1 = (TextView) convertView.findViewById(R.id.activeRowEventTitle);
            holder.textView2 = (TextView) convertView.findViewById(R.id.activeRowEventTurnUps);
            holder.textView3 = (TextView) convertView.findViewById(R.id.activeRowEventDate);
            holder.textView4 = (TextView) convertView.findViewById(R.id.activeRowEventTime);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.textView1.setText(events.get(position).getEventTitle());
        holder.textView2.setText(events.get(position).getTurnUps());
        holder.textView3.setText(events.get(position).getDate());
        holder.textView4.setText(events.get(position).getTime());
        return convertView;
    }
}
