import javax.swing.*;

public class Help extends JFrame{
    private JPanel panel1;

    public Help(){
        initWindow();
    }

    public void initWindow(){
        setVisible(true);
        setTitle("Help");
        setLocationRelativeTo(null);
        setSize(300,300);
        setResizable(false);
        add(panel1);

    }

}
