package vista;

import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class Proyecto_Podologia {
    public static void main(String[] args) {

        VentanaPrincipal ventanaMain = new VentanaPrincipal();
        ventanaMain.setTitle("Podología");
        ventanaMain.setLocationRelativeTo(null);
        ventanaMain.setResizable(false); //modificar tamaño de la ventana
        ventanaMain.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //No cerrar la ventana con la X
        
        ventanaMain.setVisible(true);
    }   
}
