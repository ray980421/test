package tw.edu.tut.mis.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "ooxx";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"book");
        Log.d(TAG,"book");
        Log.w(TAG,"book");
        Log.e(TAG,"book");
    }
}
