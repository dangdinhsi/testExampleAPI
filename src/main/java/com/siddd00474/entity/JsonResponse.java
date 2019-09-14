package com.siddd00474.entity;

public class JsonResponse {
    private int status;
    private String message;
    private Object data;

    public JsonResponse setStatus(int status) {
        this.status = status;
        return this;
    }

    public JsonResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public JsonResponse setData(Object data) {
        this.data = data;
        return this;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}
