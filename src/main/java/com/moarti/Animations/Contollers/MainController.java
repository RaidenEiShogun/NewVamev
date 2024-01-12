package com.moarti.Animations.Contollers;

import com.moarti.Animations.Models.*;
import com.moarti.Animations.Views.MainJFrameView;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainController implements KeyListener {

    private BaseModel model;
    public MainJFrameView frameView;

    public MainController() {
        model = new BaseWalkModel();
        frameView = new MainJFrameView(this);
        newAnimation(model);

    }

    private void newAnimation(BaseModel model) {
        var collectPoints = model.getPoints();
        frameView.character.baseAnimationCurrent.addPoints(collectPoints);
        new Thread(frameView.character.baseAnimationCurrent.thread1).start();
    }


    @Override
    public void keyReleased(KeyEvent e) {
        model = new BaseWalkModel();
        newAnimation(model);
    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {
            case KeyEvent.VK_W-> model = new BaseWalkModel();

            case KeyEvent.VK_SPACE -> model = new JumpModel();
        }
        newAnimation(model);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

}