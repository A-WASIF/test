import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class myClass extends JFrame implements ActionListener{
    JButton btn;

    myClass(){
        // Frame
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Buttons");
        this.setResizable(false);
        ImageIcon img = new ImageIcon("logo.jpg");
        this.setIconImage(img.getImage());
        this.getContentPane().setBackground(Color.orange);
        
        this.setLayout(null); // this is improtant to write for button visibility
        
        // Button
        btn = new JButton();
        btn.setBounds(200, 100, 200, 150);

        this.add(btn);
        

        btn.addActionListener(this); // adding action listner whenever button is pressed

        btn.setText("Here");
        btn.setIcon(img);
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn){
            System.out.println("Hello World!");
        }
    }

}

public class buttonWithLambda {
    public static void main(String args[]){
        new myClass();
    }
}
