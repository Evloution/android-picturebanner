package com.evloution.picturebanner.smartrefresh;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.evloution.picturebanner.R;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

/**
 * @Description：
 * @Author： Evloution_
 * @Date： 2019-12-17
 * @Email： 15227318030@163.com
 */

public class SmartRefreshActivity extends AppCompatActivity {

    RefreshLayout refreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smartrefresh);

        initView();
        initData();
        initEvent();
    }

    private void initView() {
        refreshLayout = (RefreshLayout)findViewById(R.id.refreshLayout);

        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {

                refreshlayout.finishRefresh(1000/*,false*/);//传入false表示刷新失败
            }
        });

        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshlayout) {
                refreshlayout.finishLoadMore(1000/*,false*/);//传入false表示加载失败
            }
        });
    }

    private void initData() {
    }

    private void initEvent() {
    }
}
