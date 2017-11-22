/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

/**
 *
 * @author eoinkirwan
 */
public class Bar extends javax.swing.JFrame {
    protected double totalCost;
    protected double heineken;
    protected double carlsberg;
    protected double orchard;
    protected double guinness;
    protected double bulmers;
    protected double kopparberg;
    protected double spirits;
    protected double softDrink;
    protected double whiteWine;
    protected double redWine;
    protected double burger;
    protected double hotDog;
    protected double chips;
    protected double cashGiven;
    protected double cashOwed;
    
    //Amount variables for log
    protected int heinekenSold;
    protected int carlsbergSold;
    protected int orchardSold;
    protected int guinnessSold;
    protected int bulmersSold;
    protected int kopparbergSold;
    protected int vodkaSold;
    protected int ginSold;
    protected int whiskeySold;
    protected int rumSold;
    protected int tequilaSold;
    protected int whiteWineSold;
    protected int redWineSold;
    protected int cokeSold;
    protected int fantaSold;
    protected int dietCokeSold;
    protected int spriteSold;
    protected int pepsiSold;
    protected int hotDogSold;
    protected int chipsSold;
    protected int burgerSold;
    

    public Bar() {
    totalCost =0.00; 
    heineken = 5.50;
    carlsberg = 5.00;
    orchard = 4.50;
    guinness = 4.30;
    bulmers = 4.60;
    kopparberg = 5.80;
    spirits = 7.20;
    softDrink = 4.20;
    whiteWine = 5.50;
    redWine = 5.60;
    burger = 6.00;
    hotDog = 5.50;
    chips = 2.20;
    cashGiven=0.00;
    cashOwed=0.00;
    }

    public Bar(double totalCost, double heineken, double carlsberg, double orchard, double guinness, double bulmers, double kopparberg, double spirits, double softDrink, double whiteWine, double redWine, double burger, double hotDog, double chips) {
        this.totalCost = totalCost;
        this.heineken = heineken;
        this.carlsberg = carlsberg;
        this.orchard = orchard;
        this.guinness = guinness;
        this.bulmers = bulmers;
        this.kopparberg = kopparberg;
        this.spirits = spirits;
        this.softDrink = softDrink;
        this.whiteWine = whiteWine;
        this.redWine = redWine;
        this.burger = burger;
        this.hotDog = hotDog;
        this.chips = chips;
    }

}
