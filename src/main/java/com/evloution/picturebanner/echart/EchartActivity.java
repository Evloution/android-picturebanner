package com.evloution.picturebanner.echart;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.evloution.picturebanner.R;

import java.util.ArrayList;
import java.util.List;

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
                //refreshLineChart();
                refreshPieChart();
            }
        });
    }

    private void refreshLineChart(){
        Object[] x = new Object[]{
                "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"
        };
        Object[] y = new Object[]{
                820, 932, 901, 934, 1290, 1330, 1320
        };
        lineChart.refreshEchartsWithOption(EchartOptionUtil.getLineChartOptions(x, y));
    }

    private void refreshPieChart(){
        List<DataTest> dataTestList = new ArrayList<>();
        DataTest dataTest1 = new DataTest("杨帅", "23");
        DataTest dataTest2 = new DataTest("222", "65");
        DataTest dataTest3 = new DataTest("sd", "12");
        DataTest dataTest4 = new DataTest("rt", "27");
        dataTestList.add(dataTest1);
        dataTestList.add(dataTest2);
        dataTestList.add(dataTest3);
        dataTestList.add(dataTest4);
        lineChart.refreshEchartsWithOption(EchartOptionUtil.getPieChartOptions(dataTestList));
    }
}
