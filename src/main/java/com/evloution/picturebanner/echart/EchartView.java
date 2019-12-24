package com.evloution.picturebanner.echart;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.evloution.picturebanner.util.JSONAnalysisUtils;
import com.github.abel533.echarts.json.GsonOption;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

public class EchartView extends WebView {

    private static final String TAG = EchartView.class.getSimpleName();

    public EchartView(Context context) {
        this(context, null);
    }

    public EchartView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public EchartView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        WebSettings webSettings = getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setSupportZoom(false);
        webSettings.setDisplayZoomControls(false);
        loadUrl("file:///android_asset/echarts.html");
    }

    /**
     * 刷新图表
     * java调用js的loadEcharts方法刷新echart
     * 不能在第一时间就用此方法来显示图表，因为第一时间html的标签还未加载完成，不能获取到标签值
     */
    public void refreshEchartsWithOption() {
        Object[] x = new Object[]{"电警", "卡口", "红绿灯条形LED", "诱导屏", "微卡", "礼让行人", "借道左转", "球机", "违停球", "公交车道", "高点监控", "限高架"};
        Object[] y = new Object[]{"970", "212", "19", "16", "100", "60", "0", "408", "36", "21", "5", "54"};
        Object[] y1 = new Object[]{"79", "3", "0", "0", "2", "3", "28", "9", "0", "0", "0", "0"};
        String json = "{\n" +
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
        String data = JSONAnalysisUtils.JSONDataAnalysis(json);
        String label = JSONAnalysisUtils.JSONPersonAnalysis(data, "label").replace("[", "").replace("\"", "").replace("]", "").replace(",", "");
        String dropped = JSONAnalysisUtils.JSONPersonAnalysis(data, "dropped").replace("[", "").replace("\"", "").replace("]", "").replace(",", "");
        String alive = JSONAnalysisUtils.JSONPersonAnalysis(data, "alive").replace("[", "").replace("\"", "").replace("]", "").replace(",", "");
        JSONArray aliveArray = JSONAnalysisUtils.JSONAnalysis(data, "alive");
        JSONArray droppedArray = JSONAnalysisUtils.JSONAnalysis(data, "dropped");
        JSONArray labelArray = JSONAnalysisUtils.JSONAnalysis(data, "label");
        Log.e("data", data);
        Log.e("alive", alive);
        Log.e("dropped", dropped);
        Log.e("label", label);
        Log.e("array", aliveArray + "");
        String call = "javascript:loadChart('" + labelArray + "', '" + aliveArray + "', '" + droppedArray + "')";
        // String call = "javascript:loadChart()";
        Log.e("call", call);
        loadUrl(call);
    }

    public void refreshEchartsWithOption(GsonOption option) {
        if (option == null) {
            return;
        }
        String optionString = option.toString();
        Log.e("optionString", optionString);
        String call = "javascript:loadEcharts('" + optionString + "')";
        loadUrl(call);
    }
}
