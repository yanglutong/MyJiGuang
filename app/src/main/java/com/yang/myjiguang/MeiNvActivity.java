package com.yang.myjiguang;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MeiNvActivity extends AppCompatActivity {

    private ImageView mIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mei_nv);
        initView();
    }

    private void initView() {
        String url = getIntent().getStringExtra("url");
        mIv = (ImageView) findViewById(R.id.iv);
        Glide.with(this).load(url).into(mIv);
    }
}
