package com.chen.entity;

public class Result {
    private String process;

    private String department;

    private String aspect;

    private String message;

    public Result() {

    }

    public Result(String process, String department, String aspect) {
        this.process = process;
        this.department = department;
        this.aspect = aspect;
    }

    public Result(String message) {
        this.message = message;
    }

    public Result(String process, String department, String aspect, String message) {
        this.process = process;
        this.department = department;
        this.aspect = aspect;
        this.message = message;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAspect() {
        return aspect;
    }

    public void setAspect(String aspect) {
        this.aspect = aspect;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "process='" + process + '\'' +
                ", department='" + department + '\'' +
                ", aspect='" + aspect + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
