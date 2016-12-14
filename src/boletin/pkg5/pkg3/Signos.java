/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg5.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Signos {
    public int setNumero(){
        int numero;
        return(Integer.parseInt(JOptionPane.showInputDialog("teclear numero")));
    }
public void comparar(int numero){
    
    if (numero>0){
        JOptionPane.showMessageDialog(null,"Positivo");
    }
    else if (numero<0){
        JOptionPane.showMessageDialog(null, "Negativo");
    }
}
}


