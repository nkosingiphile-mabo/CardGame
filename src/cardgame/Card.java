/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author user pc
 */
public class Card {
    private String cardName; //Eg. AceSpades or 10Diamonds
    private int cardValue;  // Eg. 1 or 10

    public Card() {
    }

    public Card(String cardName, int cardValue) {
        this.cardName = cardName;
        this.cardValue = cardValue;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }
}
