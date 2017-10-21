// Generated code from Butter Knife. Do not modify!
package com.comicsopentrends.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.comicsopentrends.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CharacterAdapter$ViewHolder_ViewBinding implements Unbinder {
  private CharacterAdapter.ViewHolder target;

  @UiThread
  public CharacterAdapter$ViewHolder_ViewBinding(CharacterAdapter.ViewHolder target, View source) {
    this.target = target;

    target.name = Utils.findRequiredViewAsType(source, R.id.txtName, "field 'name'", TextView.class);
    target.txtComic = Utils.findRequiredViewAsType(source, R.id.txtComic, "field 'txtComic'", TextView.class);
    target.image = Utils.findRequiredViewAsType(source, R.id.imgCharacter, "field 'image'", ImageView.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progressBarCharacter, "field 'progressBar'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CharacterAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.name = null;
    target.txtComic = null;
    target.image = null;
    target.progressBar = null;
  }
}
