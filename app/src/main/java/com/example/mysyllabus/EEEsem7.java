package com.example.mysyllabus;

import android.animation.LayoutTransition;
import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EEEsem7 extends AppCompatActivity {

    TextView detailsText, detailstext1, detailstext2;
    LinearLayout layout, layout1, layout2;

    Button button4, button5, button6, button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eeesem7);

        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);


        detailsText=findViewById(R.id.detail);
        layout=findViewById(R.id.layout);
        layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        detailstext1=findViewById(R.id.detail1);
        layout1=findViewById(R.id.layout1);
        layout1.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        detailstext2=findViewById(R.id.detail2);
        layout2=findViewById(R.id.layout2);
        layout2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);



        button4.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(), EEE_elective_sem7.class);
            startActivity(intent);
        });

        button5.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(), EEE_elective_sem7.class);
            startActivity(intent);
        });

        button6.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(), EEE_elective_sem7.class);
            startActivity(intent);
        });

        button7.setOnClickListener(v -> {
            Intent intent =new Intent(getApplicationContext(), EEE_elective_sem7.class);
            startActivity(intent);
        });
    }

    public void expand(View view){
        int v=(detailsText.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout, new AutoTransition());
        detailsText.setVisibility(v);
    }
    public void expand1(View view){
        int v=(detailstext1.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout1, new AutoTransition());
        detailstext1.setVisibility(v);
    }
    public void expand2(View view){
        int v=(detailstext2.getVisibility()==View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout2, new AutoTransition());
        detailstext2.setVisibility(v);
    }
}

