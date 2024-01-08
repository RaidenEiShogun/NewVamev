package com.moarti.ChangeTextColor.Models;


import com.moarti.ChangeTextColor.Views.BaseScreen;

/**
 * Models specify what to do on {@link com.moarti.ChangeTextColor.Actions.Actions action}
 */
public abstract class BaseModel {
    /**
     * A screen (view) that should be controlled.
     */
    protected final BaseScreen screen;
    protected Object arg;

    public BaseModel(BaseScreen screen) {
        this.screen = screen;
    }

    public void setArg(Object arg) {
        this.arg = arg;
    }

    /**
     * Does something when {@link com.moarti.ChangeTextColor.Actions.Actions action} received
     */
    public abstract void execute();
}
