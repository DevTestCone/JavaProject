
package dev.game.tilegame.display;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * @author Nemanja Djorovic
 */
public class Display {

    private JFrame frame;
    private Canvas canvas;

    private String title;
    private int width, height;

    public Display(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;

        createDisplay();
    }

    private void createDisplay() {
//        Kreiranje prozora
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
//        Pozicioniranje prozora na sredinu ekrana
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

//        Kreiranje platna
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));

//        Dodati platno na prozor
        frame.add(canvas);
        frame.pack();
    }
    
//    Metod kako bi pristupili Canvas iz Game klase u metodi render
    public Canvas getCanvas(){
        return canvas;
    }

}
