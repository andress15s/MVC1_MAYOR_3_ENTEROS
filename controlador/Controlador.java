package controlador;

import modelo.Mayor3Enteros;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador implements ActionListener
{
    //----------------
    //Atributos
    //----------------
    public VentanaPrincipal venPrin;
    public Mayor3Enteros model;

    //----------------
    //Metodos
    //----------------

    //Medodo constructor
    public Controlador(VentanaPrincipal pVenPrin, Mayor3Enteros pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.btHallarMayor.addActionListener(this);
        this.venPrin.miPanelOperaciones.btBorrar.addActionListener(this);
        this.venPrin.miPanelOperaciones.btSalir.addActionListener(this);
    }

    //Metodo de atención de eventos
    public void actionPerformed(ActionEvent ae)
    {   
        //Identificar el comando generado (hallarMayor, borrar, salir)
        String comando = ae.getActionCommand();
        
        if(comando.equals("hallarMayor"))
        {

        }
        if(comando.equals("borrar"))
        {
            System.setOut(null);
        }
        if(comando.equals("salir"))
        {
            System.exit(0);
        }
    }
}




