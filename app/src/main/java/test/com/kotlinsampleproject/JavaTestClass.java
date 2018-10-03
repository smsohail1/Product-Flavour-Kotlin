package test.com.kotlinsampleproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by muhammad.sohail on 10/1/2018.
 */

public class JavaTestClass extends AppCompatActivity implements View.OnClickListener {

    Button getDetailsBtn;
    List<String> list;
    KotlinTestClass kotlinTestClass;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDetailsBtn = findViewById(R.id.getDetailsBtn);
        list = new ArrayList<>();
        list.add("sohail");
        list.add("salman");
        getDetailsBtn.setOnClickListener(this);


        String BaseURL = BuildConfig.FLAVOR_BASE_URL;
        Log.d("url", BaseURL);

        String RMSBaseURL = BuildConfig.RMS_BASE_URL;
        Log.d("url", RMSBaseURL);
        kotlinTestClass  = new KotlinTestClass();
        kotlinTestClass.testMethod2(1, "john");

        //  KotlinTestClass kotlinTestClass = new KotlinTestClass();
        // kotlinTestClass.testMethod2(1, "john");
        //kotlinTestClass.testMethod1(list);
        //Does not access or call from another class
        //kotlinTestClass.testMethod3();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.getDetailsBtn:
                //kotlinTestClass.testMethod2(1, "john");
                kotlinTestClass.testMethod1(list);
                break;
        }
    }
}
