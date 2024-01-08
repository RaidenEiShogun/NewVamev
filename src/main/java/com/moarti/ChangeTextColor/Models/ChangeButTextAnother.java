package com.moarti.ChangeTextColor.Models;

import com.moarti.ChangeTextColor.Actions.Actions;
import com.moarti.ChangeTextColor.Views.BaseScreen;

import javax.swing.*;

public class ChangeButTextAnother extends BaseModel {
    public ChangeButTextAnother(BaseScreen screen) {
        super(screen);
    }

    @Override
    public void execute() {
        JButton button = (JButton) screen.getComponentByName(Actions.CHANGE_TEXT.name());
        button.setText("Jujutsu kaisen button");
    }
}
