package com.zk.sharevideo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtn = findViewById(R.id.mBtn);
        mBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //首先第一步打开打开相册选择视频文件:
        Intent intent = new Intent();
        intent.setType("video/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(intent, ProfilePhotoTask.PHOTO_CAMERA);
        //
    }
    //第二步处理返回结果：



}
