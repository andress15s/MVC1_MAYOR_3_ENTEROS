package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

    //--------------------------------
    // ATRIBUTO
    //--------------------------------
    private PanelEntradaDatos miPanelEntradaDatos;
    //--------------------------------
    // METODO
    //--------------------------------

    // MERODO CONSTRUCTOR
   public VentanaPrincipal()
   {
    
    //definicion del contenedor de la ventana
    this.setLayout(null);

    //CREACION Y ADICION DE UN PANEL TIPO PANELENTRADADATOS
    miPanelEntradaDatos = new PanelEntradaDatos();
    miPanelEntradaDatos.setBounds(10,10,465, 200);
    this.add(miPanelEntradaDatos);



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
    

