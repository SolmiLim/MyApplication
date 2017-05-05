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
public class Adapter_questionList extends RecyclerView.Adapter<Adapter_questionList.ViewHolder> {

    Context context;
    List<QuestionList_item> items;
    int item_layout;

    public Adapter_questionList (Context context, List<QuestionList_item> items, int item_layout) {
        this.context=context;
        this.items=items;
        this.item_layout=item_layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_question,parent,false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final QuestionList_item item=items.get(position);

        holder.date.setText(item.getDate());
        holder.name.setText(item.getName());
        holder.title.setText(item.getTitle());
        holder.comment.setText(item.getComment());

    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView date;
        TextView name;
        TextView title;
        TextView comment;

        public ViewHolder(View itemView) {

            super(itemView);
            date = (TextView)itemView.findViewById(R.id.question_date);
            name=(TextView)itemView.findViewById(R.id.question_name);
            title = (TextView)itemView.findViewById(R.id.question_title);
            comment = (TextView)itemView.findViewById(R.id.question_comment);
        }
    }

    public void clear() {
        items.clear();
        notifyDataSetChanged();
    }

}