// Generated code from Butter Knife. Do not modify!
package com.comicsopentrends.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.comicsopentrends.R;
import com.comicsopentrends.fragments.mvp.characteres.DetailWebviewDialogFragment;

import java.lang.IllegalStateException;
import java.lang.Override;

public class DetailWebviewDialogFragment_ViewBinding implements Unbinder {
  private DetailWebviewDialogFragment target;

  @UiThread
  public DetailWebviewDialogFragment_ViewBinding(DetailWebviewDialogFragment target, View source) {
    this.target = target;

    target.containerOptionsBackChat = Utils.findRequiredViewAsType(source, R.id.containerOptionsBackChat, "field 'containerOptionsBackChat'", LinearLayout.class);
    target.imgBack = Utils.findRequiredViewAsType(source, R.id.imgBack, "field 'imgBack'", ImageView.class);
    target.progressBarLoadUrl = Utils.findRequiredViewAsType(source, R.id.progressBarLoadUrl, "field 'progressBarLoadUrl'", ProgressBar.class);
    target.webView = Utils.findRequiredViewAsType(source, R.id.webView, "field 'webView'", WebView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailWebviewDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.containerOptionsBackChat = null;
    target.imgBack = null;
    target.progressBarLoadUrl = null;
    target.webView = null;
  }
}
