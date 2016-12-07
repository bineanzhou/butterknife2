package org.butterknife;

import android.app.Activity;
import android.os.Bundle;

import org.butterknife.processor.TestAnnotation;

@TestAnnotation
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
