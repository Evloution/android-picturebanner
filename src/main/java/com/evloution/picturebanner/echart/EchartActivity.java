package com.evloution.picturebanner.echart;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.evloution.picturebanner.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EchartActivity extends AppCompatActivity {

    @BindView(R.id.lineChart)
    EchartView lineChart;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_echart);
        ButterKnife.bind(this);

        lineChart.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                //最好在h5页面加载完毕后再加载数据，防止html的标签还未加载完成，不能正常显示
                // refreshLineChart();
                // refreshPieChart();
                //lineChart.refreshEchartsWithOption();
                refreshPieChart();
            }
        });
    }

    // 折线图
    private void refreshLineChart(){
        Object[] x = new Object[]{
                "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"
        };
        Object[] y = new Object[]{
                820, 932, 901, 934, 1290, 1330, 1320
        };
        lineChart.refreshEchartsWithOption(EchartOptionUtil.getLineChartOptions(x, y));
    }

    // 饼图
    private void refreshPieChart(){
        Object[] y = new Object[] {"直接访问","邮件营销","联盟广告","视频广告","搜索引擎"};
        Object[] x = new Object[]{"{value:335, name:'直接访问'}","{value:310, name:'邮件营销'}","{value:234, name:'联盟广告'}",
                "{value:135, name:'视频广告'}","{value:1548, name:'搜索引擎'}"};
        lineChart.refreshEchartsWithOption(EchartOptionUtil.getPieChartOptions(y, x));
    }
}