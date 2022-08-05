package com.hossey.sber_task.controller;

import com.hossey.sber_task.entity.TestMessage;
import com.hossey.sber_task.service.TestMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/")
@RestController
public class TestController {

    @Autowired
    TestMessageService testMessageService;

    @GetMapping("/testMessage")
    public List<TestMessage> showAllMessage() {
        List<TestMessage> list = testMessageService.getAllTestMessage();
        return list;
    }

    @GetMapping("/testMessage.{id}")
    public TestMessage getTestMessage(@PathVariable int id) {
        TestMessage testMessage = testMessageService.getTestMessage(id);
        return testMessage;
    }

    @PutMapping("/testMessage")
    public TestMessage updatetestMessage(@RequestBody TestMessage testMessage){
        testMessageService.saveTestMessage(testMessage);
        return testMessage;
    }

    @PostMapping("/testMessage")
    public TestMessage addNewTestMessage(@RequestBody TestMessage testMessage){
        testMessageService.saveTestMessage(testMessage);
        return testMessage;
    }

    @PostMapping("testMessage/{id}")
    public String deleteTestMesaage(@PathVariable int id){
        testMessageService.deleteTestmessage(id);
        return "test message deleted " + id;
    }


}
