// Generated code from Butter Knife. Do not modify!
package com.comicsopentrends.fragments.mvp.characteres;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.comicsopentrends.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DetailCharacterFragmentDialog_ViewBinding implements Unbinder {
  private DetailCharacterFragment target;

  @UiThread
  public DetailCharacterFragmentDialog_ViewBinding(DetailCharacterFragment target,
      View source) {
    this.target = target;

    target.imgBackDetail = Utils.findRequiredViewAsType(source, R.id.imgBackDetail, "field 'imgBackDetail'", ImageView.class);
    target.imgCharacterDetail = Utils.findRequiredViewAsType(source, R.id.imgCharacterDetail, "field 'imgCharacterDetail'", ImageView.class);
    target.txtNameCharacter = Utils.findRequiredViewAsType(source, R.id.txtNameCharacter, "field 'txtNameCharacter'", TextView.class);
    target.txtDescription = Utils.findRequiredViewAsType(source, R.id.txtDescription, "field 'txtDescription'", TextView.class);
    target.btnDetail = Utils.findRequiredViewAsType(source, R.id.btnDetail, "field 'btnDetail'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailCharacterFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imgBackDetail = null;
    target.imgCharacterDetail = null;
    target.txtNameCharacter = null;
    target.txtDescription = null;
    target.btnDetail = null;
  }
}
