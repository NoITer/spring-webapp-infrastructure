package com.tw.infrastructure.service;

import com.tw.infrastructure.model.EmployeeVO;

import java.util.List;

/**
 * Created by lwzhang on 3/1/15.
 */
public interface EmployeeManager {

    public List<EmployeeVO> getAllEmployees();
}
