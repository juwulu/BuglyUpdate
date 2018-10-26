package com.jwl.buglyupdate;

import android.app.Application;
import android.os.Environment;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.beta.Beta;

/**
 * author:  lujunwu
 * date:    2018/10/26 16:32
 * desc:    NoDiscription
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();


        /***** Bugly高级设置 *****/
        BuglyStrategy strategy = new BuglyStrategy();
        /**
         * 设置app渠道号
         */
        strategy.setAppChannel("release");

        /***** 统一初始化Bugly产品，包含Beta *****/
        Bugly.init(getApplicationContext(), "38e958a0ac", false,strategy);

    }
}


