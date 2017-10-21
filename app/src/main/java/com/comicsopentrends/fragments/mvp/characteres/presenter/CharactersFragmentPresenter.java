package com.comicsopentrends.fragments.mvp.characteres.presenter;

import com.comicsopentrends.model.Character;

import java.util.List;

/**
 * Created by Asus on 20/10/2017.
 */

public interface CharactersFragmentPresenter {

    void searchCharacter(String query);

    void loadList(int offset);

    List<Character> getCharacteresAcum();

    void onLoadMore(int offset);
}
