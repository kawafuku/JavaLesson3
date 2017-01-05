package jp.techacademy.hiroaki.kawamoto.java;

import android.os.Bundle;
import android. support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("ヒロアキ", 24,"ゲーム");

        human.say();/*不明*/
        human.think();

    }
}
