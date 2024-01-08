package com.moarti.ChangeTextColor.Views;


import com.moarti.ChangeTextColor.Actions.Actions;
import com.moarti.ChangeTextColor.Controllers.BaseController;

import javax.swing.*;
import java.awt.*;

public final class MainScreen extends BaseScreen {

    public MainScreen(BaseController controller) {
        super(controller);
    }

    @Override
    protected void initComponents() {
        setLayout(null);
        JButton button = new JButton("tap button");
        button.setName(Actions.CHANGE_TEXT.name());
        button.setBounds(100, 100, 200, 50);
        button.setBackground(Color.WHITE);
        button.setForeground(Color.DARK_GRAY);
        button.addMouseListener(controller);


        add(button);
    }
}
