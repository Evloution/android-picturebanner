// Generated code from Butter Knife. Do not modify!
package com.evloution.picturebanner.togglepages.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.evloution.picturebanner.R;
import com.evloution.picturebanner.echart.EchartView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DataPieFragment_ViewBinding implements Unbinder {
  private DataPieFragment target;

  @UiThread
  public DataPieFragment_ViewBinding(DataPieFragment target, View source) {
    this.target = target;

    target.eChart = Utils.findRequiredViewAsType(source, R.id.eChart, "field 'eChart'", EchartView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DataPieFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.eChart = null;
  }
}
