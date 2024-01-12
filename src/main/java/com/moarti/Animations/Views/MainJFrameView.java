package com.moarti.Animations.Views;

import com.moarti.Animations.Contollers.MainController;
import com.moarti.Animations.Models.BaseModel;
import com.moarti.Animations.Models.BaseWalkModel;

import javax.swing.*;
import java.awt.*;

public class MainJFrameView extends JFrame {

    private BaseModel model = new BaseWalkModel();

    public final CharacterComplectation character = new CharacterComplectation();

    public MainJFrameView(MainController controller) {
        SwingUtilities.invokeLater(() -> {
            setSize(600, 350);
            setBackground(new Color(0xD2DFD9));
            addKeyListener(controller);

            setLayout(null);
            setVisible(true);

            character.setBounds(0, 0, model.getSpriteX(), model.getSpriteY());
            add(character);
        });
    }
}