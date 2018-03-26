/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericbank;

import java.util.Scanner;

/**
 *
 * @author Nemanja Djorovic
 */
class Visa implements ICard {
    Scanner input = new Scanner(System.in);

    @Override
    public void getMoney(double amount){
    
    double balans = 1000;
    double podizanjeNovca ;
        System.out.println("Unesi placanje? ");
        podizanjeNovca = input.nextDouble();
        balans-=podizanjeNovca;
        System.out.println("Stanje je:" + balans);
    }

    @Override
    public boolean validate() {
        System.out.println("Validating Visa");
        return true;
    }
}
