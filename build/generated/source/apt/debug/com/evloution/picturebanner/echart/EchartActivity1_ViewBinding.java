// Generated code from Butter Knife. Do not modify!
package com.evloution.picturebanner.echart;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.evloution.picturebanner.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EchartActivity1_ViewBinding implements Unbinder {
  private EchartActivity1 target;

  private View view2131230873;

  private View view2131230763;

  private View view2131230913;

  @UiThread
  public EchartActivity1_ViewBinding(EchartActivity1 target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EchartActivity1_ViewBinding(final EchartActivity1 target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.linechart_bt, "field 'linechartBt' and method 'onViewClicked'");
    target.linechartBt = Utils.castView(view, R.id.linechart_bt, "field 'linechartBt'", Button.class);
    view2131230873 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.barchart_bt, "field 'barchartBt' and method 'onViewClicked'");
    target.barchartBt = Utils.castView(view, R.id.barchart_bt, "field 'barchartBt'", Button.class);
    view2131230763 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.piechart_bt, "field 'piechartBt' and method 'onViewClicked'");
    target.piechartBt = Utils.castView(view, R.id.piechart_bt, "field 'piechartBt'", Button.class);
    view2131230913 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.chartshowWb = Utils.findRequiredViewAsType(source, R.id.chartshow_wb, "field 'chartshowWb'", WebView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EchartActivity1 target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.linechartBt = null;
    target.barchartBt = null;
    target.piechartBt = null;
    target.chartshowWb = null;

    view2131230873.setOnClickListener(null);
    view2131230873 = null;
    view2131230763.setOnClickListener(null);
    view2131230763 = null;
    view2131230913.setOnClickListener(null);
    view2131230913 = null;
  }
}
