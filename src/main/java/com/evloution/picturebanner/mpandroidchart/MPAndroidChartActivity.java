package com.evloution.picturebanner.mpandroidchart;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.evloution.picturebanner.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MPAndroidChartActivity extends AppCompatActivity {

    @BindView(R.id.pieChart)
    PieChart pieChart;

    List<PieEntry> pieEntryList;
    PieDataSet pieDataSet;
    PieData pieData;
    Description description;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpandroidchart);
        ButterKnife.bind(this);
        pieChart.setNoDataText("老哥，我还没吃饭呢，快给我数据");
        pieEntryList = new ArrayList<>();

        PieEntry pieEntry1 = new PieEntry(100f, "北京", "ssss");
        PieEntry pieEntry2 = new PieEntry(200f, "上海", "ssss");
        PieEntry pieEntry3 = new PieEntry(300f, "广东", "ssss");
        PieEntry pieEntry4 = new PieEntry(400f, "深圳", "ssss");
        pieEntryList.add(pieEntry1);
        pieEntryList.add(pieEntry2);
        pieEntryList.add(pieEntry3);
        pieEntryList.add(pieEntry4);

        pieDataSet = new PieDataSet(pieEntryList, "");
        //一般有多少项数据，就配置多少个颜色的，少的话会复用最后一个颜色，多的话无大碍
        List<Integer> colors = new ArrayList<>();
        colors.add(R.color.orangered);
        colors.add(R.color.salmon);
        colors.add(R.color.brown);
        colors.add(R.color.blueviolet);
        pieDataSet.setColors(colors);
        pieData = new PieData(pieDataSet);
        pieData.setValueFormatter(new PercentFormatter());
        //设置值得颜色
        pieData.setValueTextColor(R.color.white);
        //设置值得大小
        pieData.setValueTextSize(14f);
        pieChart.setData(pieData);
        description = new Description();
        //把右下边的Description label 去掉，同学也可以设置成饼图说明
        description.setText("");

        pieChart.setDescription(description);
        //去掉中心圆，此时中心圆半透明
        pieChart.setHoleRadius(0f);
        //去掉半透明
        pieChart.setTransparentCircleAlpha(0);
        pieChart.setDrawEntryLabels(true);
        pieChart.invalidate();
    }
}
