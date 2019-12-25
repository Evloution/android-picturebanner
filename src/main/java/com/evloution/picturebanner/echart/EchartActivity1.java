package com.evloution.picturebanner.echart;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import com.evloution.picturebanner.R;
import com.evloution.picturebanner.util.JSONAnalysisUtils;

import org.json.JSONArray;

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
    String json;
    String data;
    JSONArray aliveArray;
    JSONArray droppedArray;
    JSONArray labelArray;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echart1);
        ButterKnife.bind(this);
        chartshowWb.loadUrl("file:///android_asset/echarts4.html");
        chartshowWb.getSettings().setAllowFileAccess(true);
        chartshowWb.getSettings().setJavaScriptEnabled(true);
        json = "{\n" +
                "    \"msg\": \"获取成功\",\n" +
                "    \"code\": 0,\n" +
                "    \"data\": {\n" +
                "        \"alive\": [\n" +
                "            \"79\",\n" +
                "            \"3\",\n" +
                "            \"0\",\n" +
                "            \"0\",\n" +
                "            \"2\",\n" +
                "            \"3\",\n" +
                "            \"28\",\n" +
                "            \"9\",\n" +
                "            \"0\",\n" +
                "            \"0\",\n" +
                "            \"0\",\n" +
                "            \"0\"\n" +
                "        ],\n" +
                "        \"dropped\": [\n" +
                "            \"970\",\n" +
                "            \"212\",\n" +
                "            \"19\",\n" +
                "            \"16\",\n" +
                "            \"100\",\n" +
                "            \"60\",\n" +
                "            \"0\",\n" +
                "            \"408\",\n" +
                "            \"36\",\n" +
                "            \"21\",\n" +
                "            \"5\",\n" +
                "            \"54\"\n" +
                "        ],\n" +
                "        \"label\": [\n" +
                "            \"电警\",\n" +
                "            \"卡口\",\n" +
                "            \"红绿灯条形LED\",\n" +
                "            \"诱导屏\",\n" +
                "            \"微卡\",\n" +
                "            \"礼让行人\",\n" +
                "            \"借道左转\",\n" +
                "            \"球机\",\n" +
                "            \"违停球\",\n" +
                "            \"公交车道\",\n" +
                "            \"高点监控\",\n" +
                "            \"限高架\"\n" +
                "        ]\n" +
                "    }\n" +
                "}";
        data = JSONAnalysisUtils.JSONDataAnalysis(json);
        aliveArray = JSONAnalysisUtils.JSONAnalysis(data, "alive");
        droppedArray = JSONAnalysisUtils.JSONAnalysis(data, "dropped");
        labelArray = JSONAnalysisUtils.JSONAnalysis(data, "label");
        Log.e("aliveArray", aliveArray + "");
        Log.e("droppedArray", droppedArray + "");
        Log.e("labelArray", labelArray + "");
    }

    @OnClick({R.id.linechart_bt, R.id.barchart_bt, R.id.piechart_bt})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.linechart_bt:
                chartshowWb.setVisibility(View.GONE);
                chartshowWb.setVisibility(View.VISIBLE);
                chartshowWb.loadUrl("javascript:doCreatChart('line'," + 0 + ", " + 0 + "," + 0 + ");");
                break;
            case R.id.barchart_bt:
                chartshowWb.setVisibility(View.GONE);
                chartshowWb.setVisibility(View.VISIBLE);
                chartshowWb.loadUrl("javascript:doCreatChart('bar'," + labelArray + ", " + droppedArray + "," + aliveArray + ");");
                break;
            case R.id.piechart_bt:
                chartshowWb.setVisibility(View.GONE);
                chartshowWb.setVisibility(View.VISIBLE);
                chartshowWb.loadUrl("javascript:doCreatChart('pie', " + 2.5 + "," + 0 + "," + 0 + ");");
                break;
        }
    }
}
