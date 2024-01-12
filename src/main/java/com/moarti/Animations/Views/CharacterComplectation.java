package com.moarti.Animations.Views;

import com.moarti.Animations.Models.AnimationPoints;
import com.moarti.Animations.Models.BaseWalkModel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class CharacterComplectation extends JPanel {

    private AnimationPoints pointsCurr;
    public final BaseAnimation baseAnimationCurrent = new BaseAnimation();

    @Override
    public void paintComponent(Graphics g) {
        BufferedImage IMAGE;

        try {
            IMAGE = ImageIO.read(new File("C:\\Users\\Windows\\IdeaProjects\\mavenLast\\src\\main\\java\\com\\moarti\\Animations\\res\\OIG.jpg"));

            setSize(pointsCurr.getW(), pointsCurr.getH());
            g.drawImage(IMAGE, pointsCurr.getX(), pointsCurr.getY(), null);
        } catch (IOException e) {

            System.out.println("Incorrect path to image");
        }
    }

    public void repaintSprite(AnimationPoints points){
        pointsCurr=points;
        repaint();
    }

    public class BaseAnimation {
        private final ArrayList<ArrayList<AnimationPoints>> pointsArray = new ArrayList<>();

        public void addPoints(ArrayList<AnimationPoints> points) {
            pointsArray.add(points);
        }

        public Runnable thread1 = new Runnable() {
            @Override
            synchronized public void run() {

                if (pointsArray.isEmpty()) {
                    return;
                }

                ArrayList<AnimationPoints> points = pointsArray.get(0);
                for (AnimationPoints point : points) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    repaintSprite(point);
                }
                pointsArray.remove(0);
            }
        };
    }
}
