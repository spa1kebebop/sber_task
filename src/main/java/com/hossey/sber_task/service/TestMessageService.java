package com.hossey.sber_task.service;

import com.hossey.sber_task.entity.TestMessage;

import java.util.List;

public interface TestMessageService {
    
    public List<TestMessage> getAllTestMessage();

    public TestMessage getTestMessage(int id);

    public void saveTestMessage(TestMessage testMessage);

    public void deleteTestmessage(int id);

}
