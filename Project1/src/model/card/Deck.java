package model.card;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Deck {
private ClassLoader cldr;  
    /**
     * @param args the command line arguments
     */
    private ArrayList<DestinationCard>exodia =new ArrayList<DestinationCard>();

    public void readCards(String filePath) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
        String sCurrentLine = "";
        int i = -1;
        while ((sCurrentLine = br.readLine()) != null) {
            if (i == -1) {
                i = 0;
                continue;
            }
            String[] splitLine = sCurrentLine.split(",");
            int id = Integer.parseInt(splitLine[0]);
            String from = splitLine[1];
            String to = splitLine[2];
            int score = Integer.parseInt(splitLine[3]);
            String colorsList = splitLine[4];
            String imagePath = splitLine[5];
            String[] splitColors = colorsList.split("-");
            ArrayList<String> colors = new ArrayList<String>();
            DestinationCard des=new DestinationCard(score,id,from,to,"resources/images/destination_Tickets/"+imagePath,colors);
            exodia.add(des);
            colors.addAll(Arrays.asList(splitColors));
           

        }
    }

    public ArrayList<DestinationCard> eksafanise(){
		return exodia;
    	
    }
    
    public void showCards(String filePath) throws FileNotFoundException, IOException {
          cldr = this.getClass().getClassLoader();
        BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
        String sCurrentLine = "";
        int i = -1;
         JFrame f = new JFrame();
        JButton[] cards = new JButton[46];
        while ((sCurrentLine = br.readLine()) != null) {
            if (i == -1) {
                i = 0;
                continue;
            }
            String[] splitLine = sCurrentLine.split(",");
            String imagePath = splitLine[5];
           
            cards[i]=new JButton();
            URL imageURL = cldr.getResource(imagePath); //image
            Image image = new ImageIcon(imageURL).getImage().getScaledInstance(80, 110, Image.SCALE_SMOOTH);
            cards[i].setIcon(new ImageIcon(image));
            f.add(cards[i]);
            cards[i].setSize(80,110);
            f.setLayout(new GridLayout(5, 10));
            f.setSize(800,550);  
           
            i++;
        }
         f.setVisible(true);  

    }
}