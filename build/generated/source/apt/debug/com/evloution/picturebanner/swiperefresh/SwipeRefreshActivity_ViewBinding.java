// Generated code from Butter Knife. Do not modify!
package com.evloution.picturebanner.swiperefresh;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.evloution.picturebanner.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SwipeRefreshActivity_ViewBinding implements Unbinder {
  private SwipeRefreshActivity target;

  @UiThread
  public SwipeRefreshActivity_ViewBinding(SwipeRefreshActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SwipeRefreshActivity_ViewBinding(SwipeRefreshActivity target, View source) {
    this.target = target;

    target.swiperefreshlayout = Utils.findRequiredViewAsType(source, R.id.swiperefreshlayout, "field 'swiperefreshlayout'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SwipeRefreshActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.swiperefreshlayout = null;
  }
}
