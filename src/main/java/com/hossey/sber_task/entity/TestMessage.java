package com.hossey.sber_task.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "testmessage")
public class TestMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "message")
    private String message;

    @Column(name = "level")
    private String level;

    @Column(name = "time")
    private Timestamp time;


    public TestMessage() {
    }

    public TestMessage(String message, String level, Timestamp time) {
        this.message = message;
        this.level = level;
        this.time = new Timestamp(LocalDateTime.now().getDayOfMonth());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "TestMessage{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", level='" + level + '\'' +
                ", time=" + time +
                '}';
    }
}
