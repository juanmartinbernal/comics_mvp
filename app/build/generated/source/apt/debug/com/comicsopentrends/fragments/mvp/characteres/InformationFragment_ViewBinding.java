// Generated code from Butter Knife. Do not modify!
package com.comicsopentrends.fragments.mvp.characteres;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.comicsopentrends.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class InformationFragment_ViewBinding implements Unbinder {
  private InformationFragment target;

  @UiThread
  public InformationFragment_ViewBinding(InformationFragment target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'mRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    InformationFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
  }
}
