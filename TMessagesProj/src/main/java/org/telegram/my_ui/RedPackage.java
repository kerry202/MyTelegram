package org.telegram.my_ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import org.telegram.messenger.R;

/**
 * Created by yangbo on 2018/3/12
 */

public class RedPackage extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.red_package_layout);
    }
}
