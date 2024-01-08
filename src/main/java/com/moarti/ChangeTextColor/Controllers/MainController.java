package com.moarti.ChangeTextColor.Controllers;

import com.moarti.ChangeTextColor.Actions.Actions;
import com.moarti.ChangeTextColor.Models.BaseModel;
import com.moarti.ChangeTextColor.Models.ChangeButTextAnother;
import com.moarti.ChangeTextColor.Models.ChangeButTextModel;
import com.moarti.ChangeTextColor.Views.MainScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class MainController extends BaseController {
    private final BaseModel changeTextModel;
    private final BaseModel anotherTextModel;

    public MainController() {
        screen = new MainScreen(this);
        changeTextModel = new ChangeButTextModel(screen);
        anotherTextModel = new ChangeButTextAnother(screen);

        JButton changeTextButton = (JButton) screen.getComponentByName(Actions.CHANGE_TEXT.name());
        JButton anotherTextButton = new JButton("Another Action");
        anotherTextButton.setBackground(Color.darkGray);
        anotherTextButton.setForeground(Color.white);
        anotherTextButton.setName(Actions.ANOTHER_TEXT.name());
        anotherTextButton.setBounds(100, 200, 200, 50);
        anotherTextButton.addMouseListener(this);

        changeTextButton.addMouseListener(this);
        screen.add(anotherTextButton);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        if (Objects.equals(((JComponent) source).getName(), Actions.CHANGE_TEXT.name())) {
            changeTextModel.execute();
        } else if (Objects.equals(((JComponent) source).getName(), Actions.ANOTHER_TEXT.name())) {
            anotherTextModel.execute();
        }
    }
}