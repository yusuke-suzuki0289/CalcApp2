package jp.techacademy.yusuke2.suzuki.calcapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.DialogInterface;
//import android.text.TextWatcher; //課題指摘を受け修正
//import android.text.InputType;

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

        //EditTextの値の取得
        String str1 = edittext.getText().toString();
        String str2 = edittext2.getText().toString();

        //Nullの場合はアラートを表示
        if (str1.equals("") || str2.equals("")) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setTitle("warning");
            alertDialogBuilder.setMessage("数字が入力されていません。");
            alertDialogBuilder.setPositiveButton("OK", null);
            alertDialogBuilder.show();

        //Nullでない場合はintent処理へ
        }else {
        //浮動小数点型への変換
            double d1 = Double.parseDouble(str1); //課題指摘事項を受け再修正 小数点入力に対応
            double d2 = Double.parseDouble(str2); //課題指摘事項を受け再修正 小数点入力に対応
            intent.putExtra("VALUE1", d1);
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
}
