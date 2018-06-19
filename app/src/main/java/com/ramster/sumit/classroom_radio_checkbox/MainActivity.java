package com.ramster.sumit.classroom_radio_checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tv1,tv2;ImageView inc1,inc2,inc3,inc4;
int cnt1=0,cnt2=0;CheckBox food1,food2;int cost1=220,cost2=350;Button order;int total=0;int pure=50;int f1=0,f2=0;RadioGroup radioGroup,radioGroup1; RadioButton radiobutton,radiobutton1;int selectedId,selectedId1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.textView1);
        tv2=(TextView)findViewById(R.id.textView2);
        inc1=(ImageView)findViewById(R.id.inc1);
        inc2=(ImageView)findViewById(R.id.inc2);
        inc3=(ImageView)findViewById(R.id.inc3);
        inc4=(ImageView)findViewById(R.id.inc4);
        food1=(CheckBox)findViewById(R.id.food1);
        food2=(CheckBox)findViewById(R.id.food2);
        order=(Button)findViewById(R.id.check);
        radioGroup=(RadioGroup)findViewById(R.id.rbg);
        radioGroup1=(RadioGroup)findViewById(R.id.rbg1);
        total=(cost1*cnt1)+cost2*cnt2;
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if(food1.isChecked()){
                  f1=cost1*cnt1;
                  selectedId = radioGroup.getCheckedRadioButtonId();
                  radiobutton = (RadioButton) findViewById(selectedId);
                  if(radiobutton.isChecked()){
                  if(radiobutton.getText().equals("Pure Ghee")){
                      f1=f1+pure;
                  }
              }
              }
              if(food2.isChecked()){
                  f2=cost2*cnt2;
                   selectedId1 = radioGroup1.getCheckedRadioButtonId();
                   radiobutton1 = (RadioButton) findViewById(selectedId1);
                  if(radiobutton1.isChecked()){
                  if(radiobutton1.getText().equals("Pure Ghee")){
                       f2=f2+pure;
                   }
              }
              }
              total=f1+f2;

                Toast.makeText(getApplicationContext(),"Order :"+"Chicken shawrma X "+cnt1+" and Chicken Tikka X "+cnt2+"="+total+"",Toast.LENGTH_SHORT).show();
            }
        });
        inc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cnt1>0){
                    cnt1--;
                    tv1.setText(cnt1+"");
                }
            }
        });
        inc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt1++;
                tv1.setText(cnt1+"");
            }
        });
        inc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cnt1>0){
                    cnt2--;
                    tv2.setText(cnt2+"");
                }
            }
        });
        inc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt2++;
                tv2.setText(cnt2+"");
            }
        });
    }
}
