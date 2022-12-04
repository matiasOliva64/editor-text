import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame implements  ActionListener, KeyListener, MouseListener {
    private JPanel panel1;
    private JEditorPane editorPane1;
    private JMenu Help;
    private JMenuItem salir,guardar,guardarComo,darkMode,darkModeOff,fonts,Ayuda;



    public Ventana(){
        initWindows();
        componentsWindow();
    }

    public void initWindows(){
        setTitle("Editor text");
        setLocationRelativeTo(null);
        setIconImage(getIconImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }

    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Images/icon.png" ));
        return retValue;
    }

    public void componentsWindow(){
        add(panel1);
        add(editorPane1);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu archivo = new JMenu("Archivo");
        menuBar.add(archivo);

        JMenu formato = new JMenu("Formato");
        menuBar.add(formato);

        JMenu edicion = new JMenu("Edición");
        menuBar.add(edicion);

        Help = new JMenu("Help");
        menuBar.add(Help);

        Ayuda = new JMenuItem("Ayuda");
        Help.add(Ayuda);
        Ayuda.addActionListener(Ventana.this);

        darkMode = new JMenuItem("Dark Mode ON");
        edicion.add(darkMode);
        darkMode.addActionListener(Ventana.this);

        darkModeOff = new JMenuItem("Dark Mode OFF");
        edicion.add(darkModeOff);
        darkModeOff.addActionListener(Ventana.this);

        guardar = new JMenuItem("Guardar");
        archivo.add(guardar);
        guardar.addActionListener(Ventana.this);

        guardarComo = new JMenuItem("Guardar Como");
        archivo.add(guardarComo);
        guardarComo.addActionListener(Ventana.this);

        salir = new JMenuItem("Salir");
        archivo.add(salir);
        salir.addActionListener(Ventana.this);

        fonts = new JMenuItem("Fuente");
        formato.add(fonts);
        fonts.addActionListener(Ventana.this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == salir) {
            System.exit(1);
        }
        else if(e.getSource() == darkMode){
            editorPane1.setBackground(Color.DARK_GRAY);
            editorPane1.setCaretColor(Color.WHITE);
            editorPane1.setForeground(Color.WHITE);
        }
        else if(e.getSource() == darkModeOff){
            editorPane1.setBackground(Color.WHITE);
            editorPane1.setCaretColor(Color.BLACK);
            editorPane1.setForeground(Color.BLACK);
        }
        else if(e.getSource() == fonts){
            Fonts f = new Fonts();
            f.initWindow();
        }
        else if(e.getSource() == Ayuda){
            Help help = new Help();
            help.initWindow();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


}
