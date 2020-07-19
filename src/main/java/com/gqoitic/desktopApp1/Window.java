package com.gqoitic.desktopApp1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.net.URL;

class Window extends JFrame {

    private int spawnX = 0;
    private int spawnY = 0;

    private int windowCounter = 1;

    private int amountOfWindows = 1;

     void launch() {
        createWindow();
    }

    private void createWindow() {
        final JFrame frame = new JFrame();

        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setTitle("window[" + windowCounter
                + "]---- windows at the moment of creation: "
                + amountOfWindows);
        frame.setLocation(spawnX, spawnY);

        JButton newWindowButton = new JButton("New Picture");
        newWindowButton.setSize(300, 50);
        newWindowButton.setVisible(true);
        newWindowButton.addActionListener(e -> {
            spawnX += 20;
            spawnY += 20;

            amountOfWindows++;
            windowCounter++;

            createWindow();
        });

        JButton closeAllButton = new JButton("Close All Windows");
        closeAllButton.setSize(300, 50);
        closeAllButton.setVisible(true);
        closeAllButton.addActionListener(e -> {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        });

        final Container pane = frame.getContentPane();
        pane.add(newWindowButton, BorderLayout.PAGE_START);
        pane.add(closeAllButton, BorderLayout.PAGE_END);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                amountOfWindows--;

                if(amountOfWindows == 0) {
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                }
            }
        });

        String path = Image.randomImage().getLink();

        try {
            URL url = new URL(path);
            BufferedImage image = ImageIO.read(url);
            JLabel label = new JLabel(new ImageIcon(image));
            pane.add(label, BorderLayout.CENTER);
        } catch(Exception exception) {
            //exception.printStackTrace();
            for(int i = 0; i < 10; i++) {
                System.out.println("Error uploading picture - " + path);
            }
        }

    }
}
