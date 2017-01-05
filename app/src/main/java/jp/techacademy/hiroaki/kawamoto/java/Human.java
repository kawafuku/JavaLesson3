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

    @Override
    public void think(){
        Log.d("javatest","私は"+ hobby + "について考える。");
    }




        public Human(String name, int age, String hobby) {
            name = "";
            age = 0;
            hobby = "";

        }

        public void say() {/*メンバ変数*/
            Log.d("javatest", this.name + "(" + this.age + "歳)");}

        }