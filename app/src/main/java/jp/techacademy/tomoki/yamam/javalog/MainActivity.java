package jp.techacademy.tomoki.yamam.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("Taro", 20, "テニス");     // 名前をTaro、年齢20歳、趣味をテニスで、Humanのインスタンスを作る
        human.say(); //「私の名前は～」ログ出力
        human.think(); //「私は～について考える」ログ出力
    }

}