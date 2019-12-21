package com.evloution.picturebanner.swiperefresh;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.evloution.picturebanner.R;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static java.text.DateFormat.DEFAULT;

/**
 * @Description：
 * @Author： Evloution_
 * @Date： 2019-12-18
 * @Email： 15227318030@163.com
 */

public class SwipeRefreshActivity extends AppCompatActivity {

    @BindView(R.id.swiperefreshlayout)
    SwipeRefreshLayout swiperefreshlayout;

    private Handler mHandler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            switch (msg.what) {
                case 0:
                    //为了保险起见可以先判断当前是否在刷新中（旋转的小圈圈在旋转）....
                    if (swiperefreshlayout.isRefreshing()) {
                        //关闭刷新动画
                        swiperefreshlayout.setRefreshing(false);
                    }
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiperefresh);
        ButterKnife.bind(this);

        initView();
        initData();
        initEvent();
    }

    private void initView() {
        swiperefreshlayout.setSize(DEFAULT);
        swiperefreshlayout.setColorSchemeResources(R.color.gray_8f, R.color.deeppink, R.color.royalblue);
        // swiperefreshlayout.setRefreshing(true);
        swiperefreshlayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Log.e("刷新", "下拉刷新");
                mHandler.sendEmptyMessageDelayed(0, 1000);
            }
        });
    }

    private void initData() {
    }

    private void initEvent() {
    }
}