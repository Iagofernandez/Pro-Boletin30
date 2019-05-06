
package pro.boletin30;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ifernandezblanco
 */
public class ProBoletin30 {

    
    public static void main(String[] args) {
       ArrayList<SeleccionFutbol>lista = new ArrayList<>();
       SeleccionFutbol fut = new Futbolista(9,"Delantero",1234,"Elias","Perez Vazquez",20);
       SeleccionFutbol entren = new Entrenador(1,12345,"Paco","Guitierrez Nando",55);
       SeleccionFutbol masajista = new Masajista("Masajista de pies",15,2134,"Keko","peña",30);
       SeleccionFutbol seleccionador = new Seleccionador(2222, "Jose Luis","Fernandez Soto",50);
       
       fut.concentrarse();
       entren.concentrarse();
       masajista.concentrarse();
       seleccionador.concentrarse();
       
       lista.add(fut);
       lista.add(entren);
       lista.add(masajista);
       lista.add(seleccionador);
       
       for(SeleccionFutbol futbol : lista){
           JOptionPane.showMessageDialog(null,futbol);
       }
       
    }
    
}
