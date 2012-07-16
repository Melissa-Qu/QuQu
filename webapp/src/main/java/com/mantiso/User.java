package com.mantiso;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class User {
    private String _name;
    private String _email;
    private String _avatarUrl;

    private List<Todo> todos;

    public User() {
        todos = new ArrayList<>();
    }

    public String getName() {
        return _name;
    }

    public void setName(String value) {
        _name = value;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String value) {
        _email = value;
    }

    public String getAvatarUrl() {
        return _avatarUrl;
    }

    public void setAvatarUrl(String _avatarUrl) {
        this._avatarUrl = _avatarUrl;
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public void addTodo(String description, int priority){
        todos.add(new Todo(description, priority));
    }
}
