package com.evloution.picturebanner.echart;

import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.json.GsonOption;
import com.github.abel533.echarts.series.Bar;
import com.github.abel533.echarts.series.Line;
import com.github.abel533.echarts.series.Pie;
import com.github.abel533.echarts.style.ItemStyle;

import java.util.List;

public class EchartOptionUtil {

    public static GsonOption getLineChartOptions(Object[] xAxis, Object[] yAxis) {
        GsonOption option = new GsonOption();
        option.title("折线图");
        option.legend("销量");
        option.tooltip().trigger(Trigger.axis);

        ValueAxis valueAxis = new ValueAxis();
        option.yAxis(valueAxis);

        ItemStyle dataStyle = new ItemStyle();
        dataStyle.normal().label().show(true).formatter("{b}\n({d}%)");

        CategoryAxis categorxAxis = new CategoryAxis();
        categorxAxis.axisLine().onZero(false);
        categorxAxis.boundaryGap(true);
        categorxAxis.data(xAxis);
        option.xAxis(categorxAxis);

        // pie  bar
        Bar bar = new Bar();
        Line line = new Line();
        Pie pie = new Pie();
        pie.clockWise(false).center("48%", "45%").radius("55", "80")
                .itemStyle(dataStyle).data();
        /*Pie pie = new Pie("访问来源");
        pie.clockWise(false).center("48%", "45%").radius("55", "80")
                .itemStyle(dataStyle)
                .data(
                        new Data("直接访问",335),
                        new Data("邮件营销",310),
                        new Data("联盟广告",274),
                        new Data("视频广告",235),
                        new Data("搜索引擎",400)
                );*/
        line.smooth(false).name("销量").data(yAxis).itemStyle().normal().lineStyle().shadowColor("rgba(0,0,0,0.4)");
        option.series(line);
        return option;
    }

    public static GsonOption getPieChartOptions(List<DataTest> dataTest) {
        GsonOption option = new GsonOption();

        ValueAxis valueAxis = new ValueAxis();
        option.yAxis(valueAxis);

        ItemStyle dataStyle = new ItemStyle();
        dataStyle.normal().label().show(true).formatter("{b}\n({d}%)");

        // pie  bar
        Pie pie = new Pie();
        pie.clockWise(false).center("48%", "45%").radius("55", "80")
                .itemStyle(dataStyle).data(dataTest);
        option.series(pie);
        return option;
    }
}
