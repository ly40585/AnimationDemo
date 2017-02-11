package com.example.root.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Demo3Fragment extends Fragment implements View.OnClickListener {

    private String TAG = "linyuan";
    private ObjectAnimator anim;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i(TAG, "Demo3Fragment onCreateView");
        View view = inflater.inflate(R.layout.demo3, container, false);
        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(this);
        TextView textView = (TextView) view.findViewById(R.id.textview);
        anim = ObjectAnimator.ofFloat(textView, "rotation", 0f, 360f);
        anim.setDuration(5000);

        return view;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Demo3Fragment onDestroy");
        //anim.cancel();
    }

    @Override
    public void onClick(View v) {
        anim.start();
    }
}