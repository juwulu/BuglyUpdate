package com.jwl.buglyupdate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Beta.checkUpgrade();

    }

    public void click(View view) {
        Toast.makeText(this, "手动更新", Toast.LENGTH_SHORT).show();
        Beta.checkUpgrade();
    }
}
