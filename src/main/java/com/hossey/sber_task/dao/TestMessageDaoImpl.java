package com.hossey.sber_task.dao;

import com.hossey.sber_task.entity.TestMessage;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class TestMessageDaoImpl implements TestMessageDao {

    @Autowired
    EntityManager entityManager;


    @Override
    public List<TestMessage> getAllTestMessage() {
//        Session session = entityManager.unwrap(Session.class);
//        Query query = session.createQuery("from testmessage");
//        List<TestMessage> allMessage =  query.getResultList();

        Query query = entityManager.createQuery("from TestMessage");
        List<TestMessage> allMessage = query.getResultList();
        return allMessage;
    }

    @Override
    public TestMessage getTestMessage(int id) {
        Session session = entityManager.unwrap(Session.class);
        TestMessage testMessage = session.get(TestMessage.class, id);
        return null;
    }

    @Override
    @Transactional
    public void saveTestMessage(TestMessage testMessage) {
        TestMessage newTestMessage = entityManager.merge(testMessage);
        testMessage.setId(newTestMessage.getId());
    }

    @Override
    public void deleteTestmessage(int id) {
        Query query = entityManager.createQuery("delete from TestMessage " + "where id=:testMessageId");
        query.executeUpdate();
    }
}
