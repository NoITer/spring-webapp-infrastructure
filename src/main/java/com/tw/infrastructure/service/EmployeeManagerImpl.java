package com.tw.infrastructure.service;

import com.tw.infrastructure.dao.EmployeeDAO;
import com.tw.infrastructure.model.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lwzhang on 3/1/15.
 */

@Service
public class EmployeeManagerImpl implements EmployeeManager {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public List<EmployeeVO> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
