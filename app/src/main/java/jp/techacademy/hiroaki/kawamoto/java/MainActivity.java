package jp.techacademy.hiroaki.kawamoto.java;

import android.os.Bundle;
import android. support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human Human = new Human("ヒロアキ", 24,"ゲーム");
        Human.name = "ヒロアキ";

        Human.age =24;
        Human.hobby = "ゲーム";

        Human.say();/*不明*/
        Log.d("javatest","私の名前は" + Human.name + "です。");
        Log.d("javatest","私の年齢は" + Human.age + "です。");
        Log.d("javatest","私は" + Human.hobby + "について考えます。");


    }
}
