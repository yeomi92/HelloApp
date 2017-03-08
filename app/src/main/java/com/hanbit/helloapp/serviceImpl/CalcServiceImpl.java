package com.hanbit.helloapp.serviceImpl;

import com.hanbit.helloapp.domain.CalcBean;
import com.hanbit.helloapp.service.CalcService;

/**
 * Created by hb2008 on 2017-03-08.
 */

public class CalcServiceImpl implements CalcService{
    @Override
    public void plus(CalcBean bean) {
        bean.setResult(bean.getFirstNum()+bean.getSecondNum());
    }

    @Override
    public void minus(CalcBean bean) {
        bean.setResult(bean.getFirstNum()-bean.getSecondNum());
    }

    @Override
    public void multiple(CalcBean bean) {
        bean.setResult(bean.getFirstNum()*bean.getSecondNum());
    }

    @Override
    public void div(CalcBean bean) {
        bean.setResult(bean.getFirstNum()/bean.getSecondNum());
    }

    @Override
    public void mod(CalcBean bean) {
        bean.setResult(bean.getFirstNum()%bean.getSecondNum());
    }
}
