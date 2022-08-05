package com.hossey.sber_task.service;

import com.hossey.sber_task.dao.TestMessageDao;
import com.hossey.sber_task.entity.TestMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TestMessageServiceImpl implements TestMessageService{

    @Autowired
    TestMessageDao testMessageDao;


    @Override
    public List<TestMessage> getAllTestMessage() {
        return testMessageDao.getAllTestMessage();
    }

    @Override
    public TestMessage getTestMessage(int id) {
        return testMessageDao.getTestMessage(id);
    }

    @Override
    @Transactional
    public void saveTestMessage(TestMessage testMessage) {
        testMessageDao.saveTestMessage(testMessage);
    }

    @Override
    public void deleteTestmessage(int id) {
        testMessageDao.deleteTestmessage(id);
    }
}
