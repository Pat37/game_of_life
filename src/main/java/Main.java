import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Main {


    public static void main(String[] args){



        JDialog jDialog = new JDialog();
        jDialog.setTitle("Hallo");
        jDialog.setSize(800,800);

        JPanel panel = new JPanel(new GridLayout(5, 1));
        JButton button = new JButton("Game");
        jDialog.add(panel);
       //panel.add(new JButton(("Centered")), new GridBagConstraints());




      /*
        button.setPreferredSize(new Dimension(100, 100));
        jDialog.getContentPane().setLayout(new FlowLayout());
        jDialog.getContentPane().add(button);
       // jDialog.add(button);
       // jDialog.add(new JButton("Game"), BorderLayout.CENTER);

      //  jDialog.add(button);*/

        jDialog.setVisible(true);




    }
}
