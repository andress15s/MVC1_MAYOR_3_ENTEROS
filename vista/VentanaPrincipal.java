package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame {

    //--------------------------------
    // ATRIBUTO
    //--------------------------------
    private PanelEntradaDatos miPanelEntradaDatos;
    private PanelOperaciones miPanelOperaciones;
    private PanelResultados miPanelResultados;

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


    //CREACION Y ADICION DE UN PANEL TIPO PANELOPERACION
    miPanelOperaciones = new PanelOperaciones();
    miPanelOperaciones.setBounds(10,150,465, 200);
    this.add(miPanelOperaciones);

    //CREACION Y ADICION DE UN PANEL TIPO PANELRESULTADOS
    miPanelResultados = new PanelResultados();
    miPanelResultados.setBounds(10,250,465, 200);
    this.add(miPanelResultados);


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
    

