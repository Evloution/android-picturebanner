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

public class DataBarFragment_ViewBinding implements Unbinder {
  private DataBarFragment target;

  @UiThread
  public DataBarFragment_ViewBinding(DataBarFragment target, View source) {
    this.target = target;

    target.eChart = Utils.findRequiredViewAsType(source, R.id.eChart, "field 'eChart'", EchartView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DataBarFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.eChart = null;
  }
}
