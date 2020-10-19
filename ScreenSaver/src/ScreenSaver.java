
import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harry
 */
public class ScreenSaver {
    public static final void main(final String[] args) throws Exception {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

         final JFrame screenSaverFrame = new JFrame();
         screenSaverFrame.setDefaultCloseOperation(
             WindowConstants.EXIT_ON_CLOSE);
         screenSaverFrame.setUndecorated(true);
         screenSaverFrame.setResizable(false);
         screenSaverFrame.add(new JLabel("This is a Java Screensaver!",
                              SwingConstants.CENTER), BorderLayout.CENTER);
         screenSaverFrame.validate();
         GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(screenSaverFrame);
    }
}
