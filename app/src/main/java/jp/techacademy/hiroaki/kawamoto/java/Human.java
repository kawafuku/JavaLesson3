package jp.techacademy.hiroaki.kawamoto.java;

/**
 * Created by Amagaeru on 2016/12/16.
 */

import android.util.Log;

/**
 * Created by Amagaeru on 2016/12/10.
 */
class Human implements thinkable{

    String name;
    int age;
    String hobby;

    public Human(String name, int age, String hobby){
        name = "";
        age = 0;
        hobby = "";

    }

    public void say(){
        Log.d("javatest", this.name + "(" + this.age + "歳)");}

    public void think(){
        Log.d("javatest", this.hobby + "(" + this.hobby +"について）");
    }


}