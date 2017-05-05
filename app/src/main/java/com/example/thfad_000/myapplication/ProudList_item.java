package com.example.thfad_000.myapplication;

import android.widget.ImageView;

/**
 * Created by thfad_000 on 2017-05-05.
 * 프레그먼트 3번째 자랑글 리스트 아이템
 * 날짜, 닉네임, 사진, 글, 좋아요, 댓글
 */
public class ProudList_item {

    int image;
    String name ;
    String date;
    String desc;
    String like;
    String comment;

    public int getImage(){
        return this.image;
    }
    public String getName(){ return this.name; }
    public String getDate(){
        return this.date;
    }
    public String getDesc(){
        return this.desc;
    }
    public String getLike(){ return this.like; }
    public String getComment(){ return this.comment; }

    public ProudList_item(int image, String name, String date, String desc, String like, String comment){

        this.image=image;
        this.name=name;
        this.date = date;
        this.desc = desc;
        this.like = like;
        this.comment = comment;

    }

}