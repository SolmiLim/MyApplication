package com.example.thfad_000.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by thfad_000 on 2017-05-05.
 */
public class Adapter_proudList extends RecyclerView.Adapter<Adapter_proudList.ViewHolder> {

    Context context;
    List<ProudList_item> items;
    int item_layout;

    public Adapter_proudList (Context context, List<ProudList_item> items, int item_layout) {
        this.context=context;
        this.items=items;
        this.item_layout=item_layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_proud,parent,false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final ProudList_item item=items.get(position);
        holder.image.setBackgroundResource(item.getImage());
        holder.name.setText(item.getName());
        holder.like.setText(item.getLike());
        holder.date.setText(item.getDate());
        holder.desc.setText(item.getDesc());
        holder.comment.setText(item.getComment());

    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView name;
        TextView date;
        TextView desc;
        TextView like;
        TextView comment;

        public ViewHolder(View itemView) {

            super(itemView);
            image=(ImageView)itemView.findViewById(R.id.proud_image);
            name=(TextView)itemView.findViewById(R.id.proud_name);
            date = (TextView)itemView.findViewById(R.id.proud_date);
            desc = (TextView)itemView.findViewById(R.id.proud_desc);
            like = (TextView)itemView.findViewById(R.id.proud_like);
            comment = (TextView)itemView.findViewById(R.id.proud_comment);
        }
    }

    public void clear() {
        items.clear();
        notifyDataSetChanged();
    }

}