/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi;

/**
 *
 * @author LENOVO
 */
public class Fahrenheit {
    public double toCalvin(double n){
        double k;
        k = (n + 345.57)/2.8;
        return k ;
    }public double toFahrenheit(double n){
        double k;
        k = n;
        return k ;
    }public double toCalcius(double n){
        double k;
        k = (n - 23)/2.8;
        return k ;
    }
    
}
