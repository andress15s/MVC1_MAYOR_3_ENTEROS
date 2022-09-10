package vista;

import java.awt.Font;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
  //--------------------------------
    // ATRIBUTO
    //--------------------------------
    private JLabel lbTitulo;


    //--------------------------------
    // METODO
    //--------------------------------
    
    
    //metodo constructor
    public PanelEntradaDatos()
{
  this.setBackground(Color.GREEN);

  //Definir contenedor del panel
  this.setLayout(null);
  this.setBackground(Color.WHITE);

  //Crear y agrgar etiqueta para titulo
  lbTitulo = new JLabel("Mayor 3 Enteros", JLabel.CENTER);
  lbTitulo.setFont(new Font("ARIAL",Font.BOLD, 20));
  lbTitulo.setForeground(Color.BLUE);
  lbTitulo.setBounds(10,10,480,20);
  this.add(lbTitulo);

  //BORDE Y TITULO
  TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
  borde.setTitleColor(Color.BLUE);
  this.setBorder(borde);


}



}
