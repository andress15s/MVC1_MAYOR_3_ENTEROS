package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

    //--------------------------------
    // ATRIBUTO
    //--------------------------------

    //--------------------------------
    // METODO
    //--------------------------------

    // MERODO CONSTRUCTOR
   public VentanaPrincipal()
   {
    //CARACTERISTICAS DE LA VENTANA
    this.setTitle("Mayor de 3 enteros");
    this.setSize(500,500);
    //this.setLocation(100 , 100);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setVisible(true);
   }
        
    }
    
}
