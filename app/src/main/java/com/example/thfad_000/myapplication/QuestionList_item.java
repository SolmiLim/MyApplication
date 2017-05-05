package com.example.thfad_000.myapplication;

/**
 * Created by thfad_000 on 2017-05-05.
 *  프레그먼트 3번째 질문글 리스트 아이템
 * 날짜, 닉네임, 제목, 댓글수
 */
public class QuestionList_item {

    String date;
    String name ;
    String title;
    String comment;

    public String getDate(){
        return this.date;
    }
    public String getName(){ return this.name; }
    public String getTitle(){ return this.title; }
    public String getComment(){ return this.comment; }

    public QuestionList_item( String date, String name, String title, String comment){

        this.date = date;
        this.name=name;
        this.title = title;
        this.comment = comment;

    }

}

