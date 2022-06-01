package com.example.fragment18022022;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;

import java.util.Random;

public class AndroidFragment extends Fragment {

    RelativeLayout relativeLayout;
    View view;
    Random random;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_android, container, false);
        relativeLayout = view.findViewById(R.id.relative_android);
        random = new Random();
        relativeLayout.setBackgroundColor(Color.rgb(random.nextInt() + 1, random.nextInt() + 1, random.nextInt() + 1));
        return view;
    }

}
