/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;

/**
 *
 * @author pc
 */
public class CompteurHexadécimal {
    
public int count =10;

public CompteurHexadécimal(){

}
public CompteurHexadécimal(int count){
this.count = count;
}
public void incrémente(int inc){
this.count += inc;
}
public void décrémente(int dec){
count -= dec;
}
public int getValeur(){
return count;
}
public void setValuer(int c) {
this.count = c;
}

public static void main(String[] args) {
    
    CompteurHexadécimal ch=new CompteurHexadécimal();
    String x=  Integer.toHexString(422);
    System.out.println("Hex = "+ x);
    
    int decimal=Integer.parseInt(x,16);
    System.out.println("decimal = "+decimal);

                      
 
    
     
    
     
        
    
    }
    
}
