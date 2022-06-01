package com.example.fragment18022022;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Button btnSendData;
    EditText edtInput;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSendData = findViewById(R.id.button_send_data);
        edtInput = findViewById(R.id.edittext_main);
        fragmentManager = getSupportFragmentManager();

        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = edtInput.getText().toString();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                AndroidFragment androidFragment = new AndroidFragment();
                androidFragment.setParams(input);
                fragmentTransaction.add(R.id.linear_container, androidFragment, "android_fragment");
                fragmentTransaction.addToBackStack("fragment_android");
                fragmentTransaction.commit();
            }
        });
    }
}
