package com.hanbit.helloapp.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.hanbit.helloapp.R;
import com.hanbit.helloapp.domain.CalcBean;
import com.hanbit.helloapp.service.CalcService;
import com.hanbit.helloapp.serviceImpl.CalcServiceImpl;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etFirstNum,etSecondNum;
    Button btPlus,btMinus,btMultiple,btDiv,btMod,btEqual;
    TextView tvResult;
    CalcService service;
    CalcBean bean;

    //생성자
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        service=new CalcServiceImpl();
        bean=new CalcBean();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstNum= (EditText) findViewById(R.id.etFirstNum);
        etSecondNum= (EditText) findViewById(R.id.etSecondNum);
        btPlus= (Button) findViewById(R.id.btPlus);
        btMinus= (Button) findViewById(R.id.btMinus);
        btMultiple= (Button) findViewById(R.id.btMultiple);
        btDiv= (Button) findViewById(R.id.btDiv);
        btMod= (Button) findViewById(R.id.btMod);
        btEqual= (Button) findViewById(R.id.btEqual);
        tvResult= (TextView) findViewById(R.id.tvResult);
        btPlus.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        btMultiple.setOnClickListener(this);
        btDiv.setOnClickListener(this);
        btMod.setOnClickListener(this);
        btEqual.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        bean.setFirstNum(Integer.parseInt(etFirstNum.getText().toString()));
        bean.setSecondNum(Integer.parseInt(etSecondNum.getText().toString()));
        switch (v.getId()){
            case R.id.btPlus:
               service.plus(bean);
                break;
            case R.id.btMinus:
                service.minus(bean);
                break;
            case R.id.btMultiple:
                service.multiple(bean);
                break;
            case R.id.btDiv:
                service.div(bean);
                break;
            case R.id.btMod:
                service.mod(bean);
                break;
            case R.id.btEqual:
                tvResult.setText("RESULT: "+bean.getResult());
                break;
        }
    }
}
