package gs.com.mygitdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button moveToFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("Demo", "This is my git Demo!!!");
        Log.w("Test","this is commited by g");
        Log.e("Demo", "This is made by manish !!!");
        Log.e("Demo", "This is change by yogesh !!!");
        Log.e("Demo", "This is change by yogesh 22-03-2017 !!!");
        Log.e("Demo", "This is change by yogesh 22-03-2017-12.05pm !!!");
        Log.e("Demo", "This is change by Manish 22-03-2017-12.14pm !!!");
        Log.e("Demo", "This is change by yogesh 22-03-2017-16.14pm !!!");

        moveToFirst = (Button) findViewById(R.id.moveToFirst);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.moveToFirst:
                Intent intent = new Intent(MainActivity.this,FirstActivity.class);
                startActivity(intent);
        }
    }
}
