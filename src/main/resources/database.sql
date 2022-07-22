
CREATE DATABASE IF NOT EXISTS java_27_28_todo_app;

USE JAVA_27_28_todo_app;

CREATE TABLE IF NOT EXISTS todos (
    id int not null auto_increment,
    description text not null,
    dueDate date not null,
    dueTime time not null,
    status varchar (10),
    /*audit fields*/
    createdAt timestamp default current_timestamp,
    updatedAt timestamp default current_timestamp on update current_timestamp,
    primary key (id)
);