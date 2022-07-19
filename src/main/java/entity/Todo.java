package entity;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Todo {

    private Long id;
    private String description;
    private Date dueDate;
    private Time dueTime;
    private Status status;
    private Timestamp createdAt;

    public Todo(Long id, String description, Date dueDate, Time dueTime, Status status, Timestamp createdAt) {
        this.id = id;
        this.description = description;
        this.dueDate = dueDate;
        this.dueTime = dueTime;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Todo(Long id, String description, Date dueDate, Time dueTime, Status status) {
        this.id = id;
        this.description = description;
        this.dueDate = dueDate;
        this.dueTime = dueTime;
        this.status = status;
    }

    public Todo() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Time getDueTime() {
        return dueTime;
    }

    public void setDueTime(Time dueTime) {
        this.dueTime = dueTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return  id +
                "\t" + description +
                "\t" + dueDate +
                "\t" + dueTime +
                "\t" + status +
                "\t" + createdAt;
    }
}
