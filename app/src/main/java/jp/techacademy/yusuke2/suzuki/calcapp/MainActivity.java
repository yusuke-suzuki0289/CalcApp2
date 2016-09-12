package jp.techacademy.yusuke2.suzuki.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.text.TextWatcher; //課題指摘を受け修正

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ボタンの取得とリスナーの登録
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //Intentの宣言
        Intent intent = new Intent(this, SecondActivity.class);

        // EditTextの宣言
        EditText edittext = (EditText) findViewById(R.id.editText);
        EditText edittext2 = (EditText) findViewById(R.id.editText2);


        //EditTextの値の取得と浮動小数点型への変換
        String str1 = edittext.getText().toString();
        double d1 = Integer.parseInt(str1);
        intent.putExtra("VALUE1", d1);

        String str2 = edittext2.getText().toString();
        double d2 = Integer.parseInt(str2);
        intent.putExtra("VALUE2", d2);

        //Buttonの値の取得
        // ボタン1「+」が押された場合
        if (v.getId() == R.id.button) {
            intent.putExtra("OPERATOR", "+");
        } else if (v.getId() == R.id.button2) {
            intent.putExtra("OPERATOR", "-");
        } else if (v.getId() == R.id.button3) {
            intent.putExtra("OPERATOR", "*");
        } else if (v.getId() == R.id.button4) {
            intent.putExtra("OPERATOR", "/");
        }

        startActivity(intent);
    }
}
