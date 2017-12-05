/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import javax.swing.JOptionPane;
/**
 *
 * @author x16401714
 */
public class BoxOffice implements Serializable {
    int section;
    String stand;
    String seatOutput;
    int seat;
    double totalPrice;
    double individualPrice;
    int quantity;
    int stdASec1;
    int stdASec2;
    int stdASec3;
    int stdBSec1;
    int stdBSec2;
    int stdBSec3;
    int stdCSec1;
    int stdCSec2;
    int stdCSec3;
    String seatString;
    StringBuffer strBuff;
    
    public BoxOffice() throws IOException {
        section = 0;
        stand = "";
        seatOutput = "";
        totalPrice = 0;
        individualPrice = 0;
        quantity = 0;
        //stdASec1 = new ArrayList<int>();
        strBuff = new StringBuffer();
    }
    
    public void setSection(int section){
        this.section = section;
    }
    
    public void setStand(String stand){
        this.stand = stand;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public void calculatePrice(){
        switch (section) {
            case 1:
                individualPrice = 80.50;
                totalPrice = individualPrice * quantity;
                break;
            case 2:
                individualPrice = 62.20;
                totalPrice = individualPrice * quantity;
                break;
            default:
                individualPrice = 37.50;   
                totalPrice = individualPrice * quantity;
                break;
        }
       }
    public void allocateSeats() {
        strBuff.delete(0, strBuff.length());
         switch(stand)  {
             case "A":
                 switch(section){
                     case 1:
                        if((stdASec1 + quantity) > 100){
                            seatOutput = "Sorry, we can not find " + quantity + " seats together in stand " + stand + " section " + section;
                }
                        else {
                             for (int i = 0; i<quantity; i++){
                                seat = (stdASec1 + 1);
                                stdASec1++;
                                strBuff.append(seat);   
                                strBuff.append(" ");
                                }
                            seatOutput= strBuff.toString();
                }
                break;
                
                case 2:
                        if((stdASec2 + quantity) > 100){
                            seatOutput = "Sorry, we can not find " + quantity + " seats together in stand " + stand + " section " + section;
                }
                        else {
                             for (int i = 0; i<quantity; i++){
                                seat = (stdASec2 + 1);
                                stdASec2++;
                                strBuff.append(seat);   
                                strBuff.append(" ");
                                }
                            seatOutput= strBuff.toString();
                }
                break;
                
                case 3:
                        if((stdASec3 + quantity) > 100){
                            seatOutput = "Sorry, we can not find " + quantity + " seats together in stand " + stand + " section " + section;
                }
                        else {
                             for (int i = 0; i<quantity; i++){
                                seat = (stdASec3 + 1);
                                stdASec3++;
                                strBuff.append(seat);   
                                strBuff.append(" ");
                                }
                            seatOutput= strBuff.toString();
                }
                break;
                        }
            break;
            
            case "B":
                 switch(section){
                     case 1:
                        if((stdBSec1 + quantity) > 100){
                            seatOutput = "Sorry, we can not find " + quantity + " seats together in stand " + stand + " section " + section;
                }
                        else {
                             for (int i = 0; i<quantity; i++){
                                seat = (stdBSec1 + 1);
                                stdBSec1++;
                                strBuff.append(seat);   
                                strBuff.append(" ");
                                }
                            seatOutput= strBuff.toString();
                }
                break;
                
                case 2:
                        if((stdBSec2 + quantity) > 100){
                            seatOutput = "Sorry, we can not find " + quantity + " seats together in stand " + stand + " section " + section;
                }
                        else {
                             for (int i = 0; i<quantity; i++){
                                seat = (stdBSec2 + 1);
                                stdBSec2++;
                                strBuff.append(seat);   
                                strBuff.append(" ");
                                }
                            seatOutput= strBuff.toString();
                }
                break;
                
                case 3:
                        if((stdBSec3 + quantity) > 100){
                            seatOutput = "Sorry, we can not find " + quantity + " seats together in stand " + stand + " section " + section;
                }
                        else {
                             for (int i = 0; i<quantity; i++){
                                seat = (stdBSec3 + 1);
                                stdBSec3++;
                                strBuff.append(seat);   
                                strBuff.append(" ");
                                }
                            seatOutput= strBuff.toString();
                }
                break;
                        }
            break;
            
            case "C":
                 switch(section){
                     case 1:
                        if((stdCSec1 + quantity) > 100){
                            seatOutput = "Sorry, we can not find " + quantity + " seats together in stand " + stand + " section " + section;
                }
                        else {
                             for (int i = 0; i<quantity; i++){
                                seat = (stdCSec1 + 1);
                                stdCSec1++;
                                strBuff.append(seat);   
                                strBuff.append(" ");
                                }
                            seatOutput= strBuff.toString();
                }
                break;
                
                case 2:
                        if((stdCSec2 + quantity) > 100){
                            seatOutput = "Sorry, we can not find " + quantity + " seats together in stand " + stand + " section " + section;
                }
                        else {
                             for (int i = 0; i<quantity; i++){
                                seat = (stdCSec2 + 1);
                                stdASec2++;
                                strBuff.append(seat);   
                                strBuff.append(" ");
                                }
                            seatOutput= strBuff.toString();
                }
                break;
                
                case 3:
                        if((stdCSec3 + quantity) > 100){
                            seatOutput = "Sorry, we can not find " + quantity + " seats together in stand " + stand + " section " + section;
                }
                        else {
                             for (int i = 0; i<quantity; i++){
                                seat = (stdCSec3 + 1);
                                stdCSec3++;
                                strBuff.append(seat);   
                                strBuff.append(" ");
                                }
                            seatOutput= strBuff.toString();
                }
                break;
                        }
            break;
            
         
  
    }
    }
       
    public void writeFile() throws IOException{
    try{
            File outFile = new File ("BoxOffice.txt");
            FileWriter fw = new FileWriter(outFile);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(String.valueOf(stdASec1));
            bw.newLine();
            bw.write(String.valueOf(stdASec2));
            bw.newLine();
            bw.write(String.valueOf(stdASec3));
            bw.newLine();
            bw.write(String.valueOf(stdBSec1));
            bw.newLine();
            bw.write(String.valueOf(stdBSec2));
            bw.newLine();
            bw.write(String.valueOf(stdBSec3));
            bw.newLine();
            bw.write(String.valueOf(stdCSec1));
            bw.newLine();
            bw.write(String.valueOf(stdCSec2));
            bw.newLine();
            bw.write(String.valueOf(stdCSec3));

            bw.close();
            System.out.println("Saved to file successfully");
        }catch (IOException e){
            System.out.println("Error writing to file:"+e);
        }

         
     }
    
    
    /**
     *
     * @throws IOException
     */
    public void readFile() throws IOException {
       try{
        File inFile= new File ("BoxOffice.txt");
        FileReader fr = new FileReader(inFile);
        BufferedReader br = new BufferedReader(fr);
        
        String[] ticketsSold = new String[100];
        String line = "";
        int i=0;
        while(line!=null){
            line=br.readLine();
            ticketsSold[i]=line;
            i=i+1;
        }
        br.close();
        stdASec1=Integer.parseInt(ticketsSold[0]);
        stdASec2=Integer.parseInt(ticketsSold[1]);
        stdASec3=Integer.parseInt(ticketsSold[2]);
        stdBSec1=Integer.parseInt(ticketsSold[3]);
        stdBSec2=Integer.parseInt(ticketsSold[4]);
        stdBSec3=Integer.parseInt(ticketsSold[5]);
        stdCSec1=Integer.parseInt(ticketsSold[6]);
        stdCSec2=Integer.parseInt(ticketsSold[7]);
        stdCSec3=Integer.parseInt(ticketsSold[8]);
        
        System.out.println(stdASec1);
         }
         catch(IOException e){
         JOptionPane.showMessageDialog(null, "Sorry, there was an error reading from the file, please try closing and opening the application again "+e);
    
          }
     
    }
      
    public String getSeatOutput(){
        return seatOutput; 
    }
    
    public double getIndividualPrice(){
        return individualPrice;
    }
    
    public double getTotalPrice(){
        return totalPrice;
    }
    public void clearData(){
        stdASec1 = 0;
        stdASec2 = 0;
        stdASec3 = 0;
        stdBSec1 = 0;
        stdBSec2 = 0;
        stdBSec3 = 0;
        stdCSec1 = 0;
        stdCSec2 = 0;
        stdCSec3 = 0;
    }

    
    /**
     * @param args the command line arguments
     */

}
