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
        Log.w("Test","this is commited by g");
        Log.e("Demo", "This is made by manish !!!");
        Log.e("Demo", "This is change by yogesh !!!");
        Log.e("Demo", "This is change by yogesh 22-03-2017 !!!");
        Log.e("Demo", "This is change by yogesh 22-03-2017-11.56pm !!!");


    }
}
