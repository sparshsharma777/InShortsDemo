package com.learnfirst.demo.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.learnfirst.demo.R;

public class PostFragment extends Fragment {

    public int number = 0;
    private Activity mActivity;



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity = getActivity();
    }





    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(mActivity).inflate(R.layout.postframent, container, false);


        return view;
    }
}
