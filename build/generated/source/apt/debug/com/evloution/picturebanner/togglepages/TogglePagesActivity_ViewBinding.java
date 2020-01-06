// Generated code from Butter Knife. Do not modify!
package com.evloution.picturebanner.togglepages;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.evloution.picturebanner.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TogglePagesActivity_ViewBinding implements Unbinder {
  private TogglePagesActivity target;

  private View view2131230991;

  private View view2131230992;

  @UiThread
  public TogglePagesActivity_ViewBinding(TogglePagesActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TogglePagesActivity_ViewBinding(final TogglePagesActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.togglepages_one_btn, "field 'togglepagesOneBtn' and method 'onViewClicked'");
    target.togglepagesOneBtn = Utils.castView(view, R.id.togglepages_one_btn, "field 'togglepagesOneBtn'", Button.class);
    view2131230991 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.togglepages_two_btn, "field 'togglepagesTwoBtn' and method 'onViewClicked'");
    target.togglepagesTwoBtn = Utils.castView(view, R.id.togglepages_two_btn, "field 'togglepagesTwoBtn'", Button.class);
    view2131230992 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    TogglePagesActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.togglepagesOneBtn = null;
    target.togglepagesTwoBtn = null;

    view2131230991.setOnClickListener(null);
    view2131230991 = null;
    view2131230992.setOnClickListener(null);
    view2131230992 = null;
  }
}
