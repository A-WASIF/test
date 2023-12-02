import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JFrame;

class myFrame extends JFrame{
    myFrame(){
        this.setVisible(true);    //set visibily it's not visible by default
        this.setSize(500, 500);   //sets size of the frame
        this.setTitle("MY JFRAME");   //defines title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //determines what to do on pressing close button
        this.setResizable(false);     //can't change size of frame anymore

        //setting image for the frame
        ImageIcon img = new ImageIcon("logo.jpg"); // create an ImageIcon
        this.setIconImage(img.getImage());    //sets logo of the frame

        this.getContentPane().setBackground(new Color(150,150,255));  //sets background-colour of fram remember to import Color library 


    }
}


public class jframe {
    
    public static void main(String args[]){
        /* 
        JFrame fr = new JFrame();   //creates a new frame instance

        fr.setVisible(true);    //set visibily it's not visible by default
        fr.setSize(500, 500);   //sets size of the frame
        fr.setTitle("MY JFRAME");   //defines title of frame
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //determines what to do on pressing close button
        fr.setResizable(false);     //can't change size of fram anymore

        //setting image for the frame
        ImageIcon img = new ImageIcon("logo.jpg"); // create an ImageIcon
        fr.setIconImage(img.getImage());    //sets logo of the frame

        fr.getContentPane().setBackground(new Color(150,150,255));  //sets background-colour of fram remember to import Color library 

        */


        // we can also create a class for jframe
        new myFrame();


    }
}
