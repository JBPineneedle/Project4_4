package com.cookandroid.project4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch swAgree;
    TextView tvText1, tvText2;
    RadioGroup rgGroup1;
    RadioButton rQ,rR,rS;
    Button btnFinish, btnReset;
    ImageView imgVer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");
        swAgree = findViewById(R.id.swAgree);
        tvText1 = findViewById(R.id.text1);
        tvText2 = findViewById(R.id.text2);
        rgGroup1 = findViewById(R.id.rGroup1);
        rQ = findViewById(R.id.RQ);
        rR = findViewById(R.id.RR);
        rS = findViewById(R.id.RS);
        btnFinish = findViewById(R.id.btnExit);
        btnReset = findViewById(R.id.btnReset);
        imgVer = findViewById(R.id.ImgVer);

        // swAgree 스위치 클릭 리스너 설정
        swAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // 스위치가 ON 상태일 때
                if (isChecked) {
                    tvText2.setVisibility(View.VISIBLE);
                    rgGroup1.setVisibility(View.VISIBLE);
                    btnFinish.setVisibility(View.VISIBLE);
                }
                // 스위치가 OFF 상태일 때
                else {
                    tvText2.setVisibility(View.INVISIBLE);
                    rgGroup1.setVisibility(View.INVISIBLE);
                    btnFinish.setVisibility(View.INVISIBLE);
                    imgVer.setVisibility(View.INVISIBLE);
                }
            }
        });

        // 라디오버튼 클릭 리스너 설정
        rgGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.RQ) {
                    imgVer.setImageResource(R.drawable.q);
                    imgVer.setVisibility(View.VISIBLE);
                }
                else if (checkedId == R.id.RR) {
                    imgVer.setImageResource(R.drawable.r);
                    imgVer.setVisibility(View.VISIBLE);
                }
                else if (checkedId == R.id.RS) {
                    imgVer.setImageResource(R.drawable.s);
                    imgVer.setVisibility(View.VISIBLE);
                }
            }
        });

        // 종료버튼 클릭 리스너 설정
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                btnFinish.setVisibility(View.VISIBLE);
            }
        });

        // 초기화버튼 클릭 리스너 설정
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swAgree.setChecked(false);
                btnReset.setVisibility(View.VISIBLE);
            }
        });
    }
}
