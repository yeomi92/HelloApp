package com.hanbit.helloapp.service;

import com.hanbit.helloapp.domain.CalcBean;

/**
 * Created by hb2008 on 2017-03-08.
 */

public interface CalcService{
    public void plus(CalcBean bean);
    public void minus(CalcBean bean);
    public void multiple(CalcBean bean);
    public void div(CalcBean bean);
    public void mod(CalcBean bean);
}
