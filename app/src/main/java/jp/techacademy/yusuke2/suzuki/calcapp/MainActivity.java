package jp.techacademy.yusuke2.suzuki.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(this);

        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(this);

        Button button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUE1", 10);
        intent.putExtra("VALUE2", 20);
        startActivity(intent);
    }
}
