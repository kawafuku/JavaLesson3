package jp.techacademy.hiroaki.kawamoto.java;

/**
 * Created by Amagaeru on 2016/12/16.
 */

import android.provider.Settings;
import android.util.Log;

/**
 * Created by Amagaeru on 2016/12/10.
 */



    class Human extends Animal implements thinkable {

    String hobby;


        public Human(String name, int age, String hobby) {

            this.name = name;
            this.age = age;
            this.hobby = hobby;
        }


    @Override
    public void think() {
        Log.d("javatest","私の名前は" + name + "です。" + "年は" + age + "歳です。");
    }

    public void say() {/*メンバ変数*/
            Log.d("javatest", "私は" + hobby + "について考える");}

        }