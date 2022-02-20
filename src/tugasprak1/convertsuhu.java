/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprak1;

/**
 *
 * @author Suyoto
 */
public class convertsuhu {
    double Celcius;

    public convertsuhu(double Celcius) {
        this.Celcius = Celcius;
    }
    
    double convertfahrenheit(){
        return (Celcius*1.8+32);
    }
    double convertreamur(){
        return (Celcius*0.8);
    }
    double convertkelvin(){
        return (Celcius+273.15);
    }
    
}
