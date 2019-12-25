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


public class DataPieFragment extends Fragment {

    @BindView(R.id.eChart)
    EchartView eChart;
    Unbinder unbinder;
    // 哈哈git测试
    // dkhdjhfdf

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_datapie, container, false);
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
        eChart.refreshBarEchartsWithOption("'pie', " + 2.5 + "," + 0 + "," + 0);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
