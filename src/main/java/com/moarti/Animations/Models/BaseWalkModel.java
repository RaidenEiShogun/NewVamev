package com.moarti.Animations.Models;

import java.util.ArrayList;

public class BaseWalkModel extends BaseModel {

    @Override
    public ArrayList<AnimationPoints> getPoints() {
        ArrayList<AnimationPoints> points = new ArrayList<>();

        points.add(new AnimationPoints(-307, -35, 130, 241));
        points.add(new AnimationPoints(-457, -35, 130, 241));
        points.add(new AnimationPoints(-607, -35, 130, 241));
        points.add(new AnimationPoints(-745, -35, 130, 241));
        points.add(new AnimationPoints(-607, -35, 130, 241));
        points.add(new AnimationPoints(-157, -35, 130, 241));

        return points;
    }
}
