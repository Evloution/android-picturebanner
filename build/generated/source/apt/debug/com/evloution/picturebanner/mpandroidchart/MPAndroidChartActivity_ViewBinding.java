// Generated code from Butter Knife. Do not modify!
package com.evloution.picturebanner.mpandroidchart;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.evloution.picturebanner.R;
import com.github.mikephil.charting.charts.PieChart;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MPAndroidChartActivity_ViewBinding implements Unbinder {
  private MPAndroidChartActivity target;

  @UiThread
  public MPAndroidChartActivity_ViewBinding(MPAndroidChartActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MPAndroidChartActivity_ViewBinding(MPAndroidChartActivity target, View source) {
    this.target = target;

    target.pieChart = Utils.findRequiredViewAsType(source, R.id.pieChart, "field 'pieChart'", PieChart.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MPAndroidChartActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.pieChart = null;
  }
}
