package jp.techacademy.yusuke2.suzuki.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        double value1 = intent.getDoubleExtra("VALUE1",0); //課題指摘事項を受け再修正 小数点入力に対応
        double value2 = intent.getDoubleExtra("VALUE2",0); //課題指摘事項を受け再修正 小数点入力に対応
        String operator = intent.getStringExtra("OPERATOR");

        if (operator.equals("+")) {
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(String.valueOf(value1 + value2));
        } else if (operator.equals("-")) {
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(String.valueOf(value1 - value2));
        } else if (operator.equals("*")) {
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(String.valueOf(value1 * value2));
        } else if (operator.equals("/")) {
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(String.valueOf(value1 / value2));
        }

    }
}
