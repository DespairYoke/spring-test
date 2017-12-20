package com.zwd.hlw.impl;

import com.zwd.hlw.dao.DemoDao;
import com.zwd.hlw.entity.Person;
import com.zwd.hlw.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;
    @Override
    public void save(Person person) {
        demoDao.save(person);
    }
}
