package com.evloution.picturebanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.evloution.picturebanner.banner.BannerActivity;
import com.evloution.picturebanner.revealbanner.RevealBannerActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_banner)
    Button mainBanner;
    @BindView(R.id.main_revealbanner)
    Button mainRevealbanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.main_banner, R.id.main_revealbanner})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.main_banner:
                startActivity(new Intent(this, BannerActivity.class));
                break;
            case R.id.main_revealbanner:
                startActivity(new Intent(this, RevealBannerActivity.class));
                break;
        }
    }
}
