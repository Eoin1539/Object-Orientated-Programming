/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxoffice;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author x16401714
 */
public class BoxOfficeApp {
    public static void main (String args[]) throws IOException{
        String stand = "";
        int section = 0;
        int quantity = 0;
        double totalPrice;
        double individualPrice;
        String seatOutput;
         
        BoxOffice myBoxOffice = new BoxOffice();
       
        myBoxOffice.readFile();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input stand.");
        stand = input.next();
        System.out.println("Input section.");
        section = input.nextInt();
        System.out.println("Input quantity.");
        quantity = input.nextInt();
        
        
        myBoxOffice.setQuantity(quantity);
        myBoxOffice.setStand(stand);
        myBoxOffice.setSection(section);
        
        
        myBoxOffice.calculatePrice();
      ///  for (int i = 0; i>quantity; i++){
        myBoxOffice.allocateSeats();
        totalPrice = myBoxOffice.getTotalPrice();
        individualPrice = myBoxOffice.getIndividualPrice();
        seatOutput = myBoxOffice.getSeatOutput();
        
        myBoxOffice.writeFile();
        
        System.out.println(totalPrice);
        System.out.println(individualPrice);
        System.out.println(seatOutput);
    }
    
}
