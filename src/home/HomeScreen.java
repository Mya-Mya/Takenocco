package home;

import app.DataTransfer;
import app.Design;
import scene.Screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends Screen implements ActionListener {
    HomePresenter p;

    public HomeScreen(DataTransfer dt) {
        super(dt);
        JLabel message = new JLabel("はじめるボタン押せ");
        message.setFont(Design.getNormalFont());
        add(message, BorderLayout.CENTER);

        JButton startButton = new JButton("はじめる");
        startButton.addActionListener(this);
        startButton.setFont(Design.getNormalFont());
        add(startButton, BorderLayout.CENTER);

        p = new HomePresenter(dt);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        p.pressedButton();
    }
}
