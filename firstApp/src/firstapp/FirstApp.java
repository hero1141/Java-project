/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapp;
import java.util.Scanner;

/**
 *
 * @author mrozu
 */


public class FirstApp {
    
    public void z1() //Zadanie testowe
    {
        int i = 3;
        i=i+7;
        if(i == 10)
        {
            System.out.println("Jest ok");
        }
    }
    
    public void z2() // Znajdowanie najmniejszej wartości w tablicy
    {
        Scanner in = new Scanner(System.in);
        int[] tab = new int[10];
        for(int i = 0 ; i< 10; i++)
        {
            tab[i] = in.nextInt();
        }
        int licznik = 1;
        int najmniejsza = tab[0];
        while(licznik < 10)
        {
            if(tab[licznik] < najmniejsza)
            {
                najmniejsza = tab[licznik];
            }
            licznik++;
        }
        System.out.println(najmniejsza);
    }
    
    public void z3() // Sprawdzenie czy podana liczba jest liczbą pierwszą
    {
         Scanner in = new Scanner(System.in);
         int liczba = in.nextInt();
         int ile_dzielnikow = 0;
         for(int i =2 ; i<liczba/2; i++)
         {
             if(liczba % i == 0)
             {
                 ile_dzielnikow++;
             }
         }
         if(ile_dzielnikow == 0)
         {
              System.out.println("Liczba "+liczba+" jest liczbą pierwszą!");
         }
         else
         {
              System.out.println("Liczba "+liczba+" nie jest liczbą pierwszą!");
         }
    }
    
    public void z4() //Sito eratostenesa
    {
        Scanner in = new Scanner(System.in);
        int zakres = in.nextInt();
        int liczba = 2;
        boolean[] tab = new boolean[zakres+1];
        while(liczba <= zakres)
        {
            for(int i = liczba; i<=zakres; i++)
            {
                if(i % liczba == 0 && i> liczba && tab[i] == false)
                {
                    tab[i] = true;
                }
            }
            boolean sprawdz = false;
            if(liczba != zakres)
            {
                for(int j = liczba+1; sprawdz == false;j++)
                {
                  if( !tab[j] ) {
                      liczba = j;
                      sprawdz = true;
                  }
                  if(j == zakres)
                  {
                      sprawdz = true;
                      liczba++;
                  }
                }
                if(!sprawdz) 
                {
                    liczba++;
                }
            }
            else
            {
                liczba++;
            }
        }
        System.out.println("Oto lista liczb pierwszych z podanego zakresu!");
        for(int k=2; k<=zakres;k++)
        {
            if(!tab[k])
            {
                System.out.println(k);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FirstApp f1 = new FirstApp();
       //f1.z1();
       //f1.z2();
       //f1.z3();
       f1.z4();
    }
    
    
}
