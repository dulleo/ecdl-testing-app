package com.duskol.ecdl.service;

import com.duskol.ecdl.entity.Test;
import com.duskol.ecdl.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestRepository testRepository;

    @Override
    public Test createTest(Test test) {
        return testRepository.save(test);
    }
}
