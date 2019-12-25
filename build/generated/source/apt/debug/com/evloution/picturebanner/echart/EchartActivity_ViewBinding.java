// Generated code from Butter Knife. Do not modify!
package com.evloution.picturebanner.echart;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.evloution.picturebanner.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EchartActivity_ViewBinding implements Unbinder {
  private EchartActivity target;

  @UiThread
  public EchartActivity_ViewBinding(EchartActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EchartActivity_ViewBinding(EchartActivity target, View source) {
    this.target = target;

    target.lineChart = Utils.findRequiredViewAsType(source, R.id.lineChart, "field 'lineChart'", EchartView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EchartActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.lineChart = null;
  }
}
