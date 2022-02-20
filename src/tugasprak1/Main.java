/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprak1;

import java.util.Scanner;

/**
 *
 * @author Suyoto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ulang;
        double Celcius;
        System.out.println("+===========================+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+===========================+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius\t: ");
        Celcius = input.nextDouble();
        do{
            convertsuhu celcius = new convertsuhu(Celcius);
            System.out.println("");
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih\t: ");
            ulang=input.nextInt();
            if(ulang == 1){
                System.out.println("");
                System.out.println("Suhu dalam Celcius\t: " + Celcius + "°C");
                System.out.println("Dalam Fahrenheit\t: " + celcius.convertfahrenheit() + "°F");
                System.out.println("Dalam Reamur\t\t: " + celcius.convertreamur() + "°R");
                System.out.println("Dalam Kelvin\t\t: " + celcius.convertkelvin() + "K");
                if(Celcius<=0){
                    System.out.println("Kondisi Air Beku");
                }
                else if(Celcius>=100){
                    System.out.println("Kondisi Air Mendidih");
                }
                else {
                    System.out.println("Kondisi Air Normal");
                }
            }
            else if(ulang == 2){
                System.out.println("\nInput Data");
                System.out.println("----------");
                System.out.print("Suhu Dalam Celcius\t: ");
                Celcius = input.nextDouble();
            }
            else if(ulang != 3){
                System.out.println("\nOpsi tidak ada. Mohon masukkan opsi dengan benar");
            }
        }while(ulang!=3);
    }
    
}
