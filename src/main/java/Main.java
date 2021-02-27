import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Main {


    public static void main(String[] args){


        JDialog jDialog = new JDialog();
        jDialog.setTitle("Hallo");
        jDialog.setSize(800,800);

     //  JPanel panel = new JPanel(new GridLayout(100, 100));

        JButton button = new JButton("Game of Life");
        button.setPreferredSize(new Dimension(100, 100));
        jDialog.getContentPane().setLayout(new FlowLayout());
        jDialog.getContentPane().add(button);
       // jDialog.add(new JButton("Game"), BorderLayout.CENTER);

      //  jDialog.add(button);
        jDialog.setVisible(true);




    }
}
