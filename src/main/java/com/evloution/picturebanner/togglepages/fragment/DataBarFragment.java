package com.evloution.picturebanner.togglepages.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.evloution.picturebanner.R;
import com.evloution.picturebanner.echart.EchartView;
import com.evloution.picturebanner.util.JSONAnalysisUtils;

import org.json.JSONArray;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class DataBarFragment extends Fragment {


    String json;
    String data;
    JSONArray aliveArray;
    JSONArray droppedArray;
    JSONArray labelArray;
    @BindView(R.id.eChart)
    EchartView eChart;
    Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_databar, container, false);
        unbinder = ButterKnife.bind(this, view);
        eChart.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                //最好在h5页面加载完毕后再加载数据，防止html的标签还未加载完成，不能正常显示
                refreshBarChart();
            }
        });
        return view;
    }

    private void refreshBarChart() {
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
        eChart.refreshBarEchartsWithOption("'bar'," + labelArray + ", " + droppedArray + "," + aliveArray);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
