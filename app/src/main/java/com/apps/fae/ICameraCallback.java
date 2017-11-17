package com.apps.fae;

public interface ICameraCallback {

    public abstract void success(Object data);

    public abstract void fail(String msg);

    public abstract void exception(String msg);

}