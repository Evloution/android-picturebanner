package com.evloution.picturebanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.evloution.picturebanner.banner.BannerActivity;
import com.evloution.picturebanner.echart.EchartActivity;
import com.evloution.picturebanner.echart.EchartActivity1;
import com.evloution.picturebanner.mpandroidchart.MPAndroidChartActivity;
import com.evloution.picturebanner.revealbanner.RevealBannerActivity;
import com.evloution.picturebanner.smartrefresh.SmartRefreshActivity;
import com.evloution.picturebanner.swiperefresh.SwipeRefreshActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_banner)
    Button mainBanner;
    @BindView(R.id.main_revealbanner)
    Button mainRevealbanner;
    @BindView(R.id.main_smartrefresh)
    Button mainSmartrefresh;
    @BindView(R.id.main_swiperefresh)
    Button mainSwiperefresh;
    @BindView(R.id.main_mpandroidchart)
    Button mainMpandroidchart;
    @BindView(R.id.main_echart)
    Button mainEchart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.main_banner, R.id.main_revealbanner, R.id.main_smartrefresh, R.id.main_swiperefresh, R.id.main_mpandroidchart, R.id.main_echart})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.main_banner:
                startActivity(new Intent(this, BannerActivity.class));
                break;
            case R.id.main_revealbanner:
                startActivity(new Intent(this, RevealBannerActivity.class));
                break;
            case R.id.main_smartrefresh:
                startActivity(new Intent(this, SmartRefreshActivity.class));
                break;
            case R.id.main_swiperefresh:
                startActivity(new Intent(this, SwipeRefreshActivity.class));
                break;
            case R.id.main_mpandroidchart:
                startActivity(new Intent(this, MPAndroidChartActivity.class));
                break;
            case R.id.main_echart:
                startActivity(new Intent(this, EchartActivity1.class));
                break;
        }
    }
}
