package com.example.thfad_000.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by thfad_000 on 2017-04-11.
 */
public class Fragment_3 extends Fragment{

    Context mContext;
    private RecyclerView proudView;
    private RecyclerView questionView;
    private  RecyclerView.Adapter Adapter_proud;
    private  RecyclerView.Adapter Adapter_question;
    private RecyclerView.LayoutManager layoutManager_proud;
    private RecyclerView.LayoutManager layoutManager_question;

    private Button btProud;
    private Button btQuestion;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_3, container, false);

        proudView = (RecyclerView) view.findViewById(R.id.proud_list);
        proudView.setHasFixedSize(true);

        questionView = (RecyclerView) view.findViewById(R.id.question_list);
        questionView.setHasFixedSize(true);
        questionView.setVisibility(View.GONE);

        layoutManager_proud = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        layoutManager_question = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);

        btProud = (Button) view.findViewById(R.id.proud_bt);
        btQuestion = (Button) view.findViewById(R.id.question_bt);

        // 자랑 버튼 클릭 시 이벤트
        btProud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btProud.setBackgroundColor(getResources().getColor(R.color.colorPoint));
                btQuestion.setBackgroundColor(getResources().getColor(R.color.colorMain));

                questionView.setVisibility(View.GONE);
                proudView.setVisibility(View.VISIBLE);
            }
        });

        // 질문 버튼 클릭 시 이벤트
        btQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btProud.setBackgroundColor(getResources().getColor(R.color.colorMain));
                btQuestion.setBackgroundColor(getResources().getColor(R.color.colorPoint));

                questionView.setVisibility(View.VISIBLE);
                proudView.setVisibility(View.GONE);

            }
        });

        // 자랑글 리스트 아이템 설정

        ArrayList<ProudList_item> proudList_items = new ArrayList<>();

        for(int i=0;i<20;i++) {
            proudList_items.add(new ProudList_item(R.drawable.sample, "닉네임", "2017.05.05", "오늘은 5월 5일 어린이날임", "좋아요", "댓글"));
        }
        proudView.setLayoutManager(layoutManager_proud);

        Adapter_proud = new Adapter_proudList(mContext,proudList_items,1);
        proudView.setAdapter(Adapter_proud);

        // 질문글 리스트 아이템 설정

        ArrayList<QuestionList_item> questionList_items = new ArrayList<>();

        for(int i=0;i<20;i++) {
            questionList_items.add(new QuestionList_item("2017.05.05", "닉네임", "이건 뭔가요? 제발 알려주세요...", "댓글"));
        }

        questionView.setLayoutManager(layoutManager_question);

        Adapter_question = new Adapter_questionList(mContext,questionList_items,1);
        questionView.setAdapter(Adapter_question);

        return view;

    }


}
