package com.comicsopentrends.fragments.mvp.characteres;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.comicsopentrends.R;
import com.comicsopentrends.adapter.CharacterAdapter;
import com.comicsopentrends.model.Character;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Asus on 21/10/2017.
 */

public class InformationFragment extends Fragment {
    // Store instance variables
    private String title;
    private int page;
    private Character character;
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    // newInstance constructor for creating fragment with arguments
    public static InformationFragment newInstance(int page, String title, String character) {
        InformationFragment fragmentFirst = new InformationFragment();
        Bundle args = new Bundle();
        args.putInt("position", page);
        args.putString("title", title);
        args.putString("character", character);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("position", 0);
        title = getArguments().getString("title");
        String data = getArguments().getString("character");
         character = new Gson().fromJson(data,Character.class);

    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.information_fragment, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        if(page == 0) {
            mRecyclerView.setAdapter(new CharacterAdapter(character.comic.items, null));
        }else{
            mRecyclerView.setAdapter(new CharacterAdapter(null, character.event.items));
        }
    }
}