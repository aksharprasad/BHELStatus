package com.example.hp.bhelstatus;

public class Field {
    private String fieldName;
    private String fieldValue;
    private int n;
    private String id;
    private String pid;
    private String projectName;
    private String deptName;
    private int number;

    public Field(){
    }

    public Field(String id, String pid, String fieldName, String fieldValue, int n, String projectName, String deptName, int number) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        this.n = n;
        this.pid = pid;
        this.id = id;
        this.projectName = projectName;
        this.deptName = deptName;
        this.number = number;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public int getN() {
        return n;
    }

    public String getId() {
        return id;
    }

    public String getPid() {
        return pid;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {

        this.number = number;
    }
}
