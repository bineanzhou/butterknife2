package org.butterknife;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends Activity {

    TextView mTextView;
    @Bind(R.id.tv)
    TextView tv;
    @Bind(R.id.tv_111)
    TextView tv111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        if (mTextView != null)
            mTextView.setText("test Bind");
    }
}
