package com.doudou.cn.testleftdraw.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.doudou.cn.testleftdraw.R;
import com.doudou.cn.testleftdraw.utils.SwipeRecyclerView;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends ActionBarActivity {

    private SwipeRecyclerView mSwipeRecyclerView;
    private SearchsAdapetr mAdapter=null;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<SearchVo> mSerachVos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSwipeRecyclerView = (SwipeRecyclerView) findViewById(R.id.swipeView);
        mLayoutManager = new LinearLayoutManager(this);
        mSerachVos = new ArrayList<>();
        for(int i=0;i<10;i++){
            mSerachVos.add(new SearchVo("test"+i,false));
        }

        //只是adapter 适配器的修改。

        mAdapter = new SearchsAdapetr(this,mSerachVos);
        mSwipeRecyclerView.setHasFixedSize(true);
        mSwipeRecyclerView.setLayoutManager(mLayoutManager);
        mSwipeRecyclerView.setAdapter(mAdapter);
        mSwipeRecyclerView.setScrollContainer(false);

    }
}
