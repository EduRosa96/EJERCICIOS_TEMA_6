package PDF_I.ejercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonERR extends JFrame implements ActionListener {
    private JButton button1, button2, button3;
    private JPanel panel1;



    public JButtonERR() {

        panel1 = new JPanel();//llamamos al panel
        panel1.setLayout(null);
        panel1.setBackground(Color.green);
        add(panel1);
        button1 = new JButton("UNO");//indica el texto del boton
        button1.setBounds(10, 100, 90, 30);//tamaño y poscición
        panel1.add(button1);//añadimos el boton
        button1.addActionListener(this);//le damos funcionalidad

        button2 = new JButton("DOS");
        button2.setBounds(110, 100, 90, 30);
        panel1.add(button2);
        button2.addActionListener(this);

        button3 = new JButton("TRES");
        button3.setBounds(210, 100, 90, 30);
        panel1.add(button3);//tenemos que añadir cada botón al panel corresponiente
        button3.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            setTitle("EDUARDO"); //cambiamos el título de la ventana
            panel1.setBackground(Color.RED);// cambiamos el color del panel
        } else if (e.getSource() == button2) {
            setTitle("RODRÍGUEZ");
            panel1.setBackground(Color.green);
        } else if (e.getSource() == button3) {
            setTitle("ROSA");
            panel1.setBackground((Color.blue));

        }
    }

    public static void main(String[] args) {
        JButtonERR ejemplo = new JButtonERR();
        ejemplo.setBounds(0, 0, 400, 200);
        ejemplo.setVisible(true);
    }

}

