/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericbank;

/**
 *
 * @author Nemanja Djorovic
 */
public class GenericBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bank<Visa> bankV = new Bank<>(new Visa());
        bankV.pay();
        Bank<Master> bankM = new Bank<>(new Master());
        bankM.pay();
    
    }
    
}
