package com.moarti.Animations.Models;
import java.util.ArrayList;

public abstract class BaseModel{

    public int getSpriteX() {
        return 130;
    }

    public int getSpriteY() {
        return 241;
    }

    public abstract ArrayList<AnimationPoints> getPoints();
}