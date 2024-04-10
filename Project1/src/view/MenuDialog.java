package view;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JLayeredPane;

/**
 *
 * @author Michalis
 */
public class MenuDialog extends JLayeredPane {

      Image image;

        public MenuDialog(Image img) {
            image=img;
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, this);
        }
    }