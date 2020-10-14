/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.h2_p2;

import java.util.Scanner;

/**
 *
 * @author Emrah
 */
public class Main {
    public static void main(String[] args){
    double sayı; //Bellekten reel sayı için rezervasyon
        sayı = Math.random(); //[0-1] aralığında rastgele sayı üretir
        
        //[0-1] aralığında reel sayıyı [1-10] haline döndüreceğiz
        int tutulan;
        tutulan = (int)(sayı * 1000); //Geçici tip değişikliği (casting)
        //Aritmatik operatörleri : +, -, *, /, %->modüler aritmatik
        tutulan = (tutulan % 100) + 1; //işlemde öncelik için () parantez içinde yazılır.
        
        int sayaç = 0;
        
        System.out.println("Rastgele sayı:" + sayı);
        System.out.println("Tutulan Sayı:" + tutulan);
        
        int tahminEdilen;
        int altDeger = 1,ustDeger=100;
        Scanner kbd= new Scanner(System.in); //klavyeden veri okuma import java.util.Scanner kütüphanesini kullanır
        
        //Karşılaştırma Operatörleri : ==, >, <, >=, <=, !=, &&, ||, &, |
        
        do {
            sayaç++; //sayaç = sayaç + 1
            System.out.print("Lütfen tahmininizi girin ("+ altDeger + " - " + ustDeger + "): ");
            tahminEdilen = kbd.nextInt();
            if (tahminEdilen == tutulan) {
                System .out.println("Bravo" + sayaç + ". tahmininde Bildiniz!!!");
                break;
            }else if(tahminEdilen < tutulan)
                altDeger = tahminEdilen;
            else
                ustDeger = tahminEdilen;
           System .out.println("Malesef Bilemediniz!!!" + sayaç + ". adımdasın");
        }while(true);    
    }
}
