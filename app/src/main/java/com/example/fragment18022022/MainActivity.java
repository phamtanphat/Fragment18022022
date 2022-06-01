package com.example.fragment18022022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAddAndroid, btnDeleteAndroid;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAddAndroid = findViewById(R.id.button_add_android_fragment);
        btnDeleteAndroid = findViewById(R.id.button_delete_android_fragment);
        fragmentManager = getSupportFragmentManager();

        btnAddAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                AndroidFragment androidFragment = new AndroidFragment();
                fragmentTransaction.add(R.id.linear_container, androidFragment,"android_fragment");
                fragmentTransaction.commit();
            }
        });

        btnDeleteAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AndroidFragment androidFragment = (AndroidFragment) fragmentManager.findFragmentByTag("android_fragment");
                if (androidFragment != null){
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.remove(androidFragment);
                    fragmentTransaction.commit();
                }
            }
        });
    }
}
