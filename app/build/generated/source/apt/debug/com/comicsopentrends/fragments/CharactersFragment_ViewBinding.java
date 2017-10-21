// Generated code from Butter Knife. Do not modify!
package com.comicsopentrends.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.comicsopentrends.R;
import com.comicsopentrends.fragments.mvp.characteres.CharactersFragment;

import java.lang.IllegalStateException;
import java.lang.Override;

public class CharactersFragment_ViewBinding implements Unbinder {
  private CharactersFragment target;

  @UiThread
  public CharactersFragment_ViewBinding(CharactersFragment target, View source) {
    this.target = target;

    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    target.progressBarLoadUsers = Utils.findRequiredViewAsType(source, R.id.progressBarLoadUsers, "field 'progressBarLoadUsers'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CharactersFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.progressBarLoadUsers = null;
  }
}
