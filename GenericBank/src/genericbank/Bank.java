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
class Bank<CardType extends ICard> {

    CardType card;

    Bank(CardType card) {
        this.card = card;
    }

    boolean pay() {
        if (card.validate()) {
            card.getMoney(10);
        }
        return true;

    }
}
