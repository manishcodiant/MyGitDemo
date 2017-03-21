package gs.com.mygitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("Demo", "This is my git Demo!!!");

        Log.w("Demo", "This is my dgknd glkdhjdfkjh dfjhl Demo!!!");
        Log.e("Demo","This is my git Demo!!!");
        Log.e("Demo","Direct Committed By Manish !!!!!");
    }
}
