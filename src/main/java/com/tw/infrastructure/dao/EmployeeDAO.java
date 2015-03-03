package com.tw.infrastructure.dao;

import com.tw.infrastructure.model.EmployeeVO;

import java.util.List;

/**
 * Created by lwzhang on 3/1/15.
 */
public interface EmployeeDAO
{
    public List<EmployeeVO> getAllEmployees();
}