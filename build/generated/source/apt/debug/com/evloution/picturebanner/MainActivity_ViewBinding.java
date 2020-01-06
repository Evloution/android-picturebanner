// Generated code from Butter Knife. Do not modify!
package com.evloution.picturebanner;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131230880;

  private View view2131230884;

  private View view2131230885;

  private View view2131230886;

  private View view2131230882;

  private View view2131230881;

  private View view2131230887;

  private View view2131230883;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.main_banner, "field 'mainBanner' and method 'onViewClicked'");
    target.mainBanner = Utils.castView(view, R.id.main_banner, "field 'mainBanner'", Button.class);
    view2131230880 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.main_revealbanner, "field 'mainRevealbanner' and method 'onViewClicked'");
    target.mainRevealbanner = Utils.castView(view, R.id.main_revealbanner, "field 'mainRevealbanner'", Button.class);
    view2131230884 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.main_smartrefresh, "field 'mainSmartrefresh' and method 'onViewClicked'");
    target.mainSmartrefresh = Utils.castView(view, R.id.main_smartrefresh, "field 'mainSmartrefresh'", Button.class);
    view2131230885 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.main_swiperefresh, "field 'mainSwiperefresh' and method 'onViewClicked'");
    target.mainSwiperefresh = Utils.castView(view, R.id.main_swiperefresh, "field 'mainSwiperefresh'", Button.class);
    view2131230886 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.main_mpandroidchart, "field 'mainMpandroidchart' and method 'onViewClicked'");
    target.mainMpandroidchart = Utils.castView(view, R.id.main_mpandroidchart, "field 'mainMpandroidchart'", Button.class);
    view2131230882 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.main_echart, "field 'mainEchart' and method 'onViewClicked'");
    target.mainEchart = Utils.castView(view, R.id.main_echart, "field 'mainEchart'", Button.class);
    view2131230881 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.main_togglepages, "field 'mainTogglepages' and method 'onViewClicked'");
    target.mainTogglepages = Utils.castView(view, R.id.main_togglepages, "field 'mainTogglepages'", Button.class);
    view2131230887 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.main_notification, "field 'mainNotification' and method 'onViewClicked'");
    target.mainNotification = Utils.castView(view, R.id.main_notification, "field 'mainNotification'", Button.class);
    view2131230883 = view;
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
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mainBanner = null;
    target.mainRevealbanner = null;
    target.mainSmartrefresh = null;
    target.mainSwiperefresh = null;
    target.mainMpandroidchart = null;
    target.mainEchart = null;
    target.mainTogglepages = null;
    target.mainNotification = null;

    view2131230880.setOnClickListener(null);
    view2131230880 = null;
    view2131230884.setOnClickListener(null);
    view2131230884 = null;
    view2131230885.setOnClickListener(null);
    view2131230885 = null;
    view2131230886.setOnClickListener(null);
    view2131230886 = null;
    view2131230882.setOnClickListener(null);
    view2131230882 = null;
    view2131230881.setOnClickListener(null);
    view2131230881 = null;
    view2131230887.setOnClickListener(null);
    view2131230887 = null;
    view2131230883.setOnClickListener(null);
    view2131230883 = null;
  }
}
