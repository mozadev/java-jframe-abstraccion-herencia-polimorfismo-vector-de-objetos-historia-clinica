package DAO;

import BEAN.HistorialClinico;
import java.util.Vector;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VectorHistorialClinico {

    Vector vHistorial;

    public VectorHistorialClinico() {
        vHistorial = new Vector();
    }

    public void agregaHistorial(HistorialClinico p) {
        vHistorial.addElement(p);
    }

    public void repVecProd(JTextArea TXTAreatexto) {
        HistorialClinico h;
        for (int i = 0; i < vHistorial.size(); i++) {
            h = (HistorialClinico) vHistorial.get(i);
          //  System.out.println(p.repDatos());
           // System.out.println("========================");
            TXTAreatexto.append(h.repDatos() + "\n\n");
        }

    }

}
