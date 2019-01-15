package com.githubexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //added by vishal

        int c = sum(5,10);
        int d = subtract(5,10);
        System.out.println("sum : "+c);
        System.out.println("sub : "+d);
    }

    public int sum(int a,int b){
        return a+b;
    }
    
    public int subtract(int a,int b){
        return a-b;
    }
}
