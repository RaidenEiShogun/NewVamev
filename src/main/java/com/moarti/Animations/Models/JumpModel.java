package com.moarti.Animations.Models;

import java.util.ArrayList;

public class JumpModel extends BaseModel{

    @Override
    public ArrayList<AnimationPoints> getPoints() {
        ArrayList<AnimationPoints> points = new ArrayList<>();

        points.add(new AnimationPoints(-157, -535, 130, 241));
        points.add(new AnimationPoints(-307, -535, 130, 241));
        points.add(new AnimationPoints(-457, -535, 130, 241));
        points.add(new AnimationPoints(-607, -535, 130, 241));
        points.add(new AnimationPoints(-745, -535, 130, 241));
        points.add(new AnimationPoints(-905, -535, 130, 241));
        points.add(new AnimationPoints(-1095, -535, 130, 241));
        points.add(new AnimationPoints(-905, -535, 130, 241));
        points.add(new AnimationPoints(-745, -535, 130, 241));




        return points;
    }
}
