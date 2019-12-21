package com.evloution.picturebanner.echart;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import com.evloution.picturebanner.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EchartActivity1 extends AppCompatActivity {

    @BindView(R.id.linechart_bt)
    Button linechartBt;
    @BindView(R.id.barchart_bt)
    Button barchartBt;
    @BindView(R.id.piechart_bt)
    Button piechartBt;
    @BindView(R.id.chartshow_wb)
    WebView chartshowWb;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echart1);
        ButterKnife.bind(this);
        chartshowWb.loadUrl("file:///android_asset/echart/myechart.html");
        chartshowWb.getSettings().setAllowFileAccess(true);
        chartshowWb.getSettings().setJavaScriptEnabled(true);

    }

    @OnClick({R.id.linechart_bt, R.id.barchart_bt, R.id.piechart_bt})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.linechart_bt:
                chartshowWb.loadUrl("javascript:createChart('line',[89,78,77]);");
                break;
            case R.id.barchart_bt:
                chartshowWb.loadUrl("javascript:createChart('bar',[89,78,77]);");
                break;
            case R.id.piechart_bt:
                chartshowWb.loadUrl("javascript:createChart('pie',[89,78,77]);");
                break;
        }
    }
}
