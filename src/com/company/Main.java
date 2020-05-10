package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9,10};
        Scanner input = new Scanner(System.in);

        System.out.print("Aranacak sayiyi giriniz: ");
        int aranacak = input.nextInt();

         int sayi = find(sayilar,aranacak);

         if(sayi == -1){
             System.out.println("Sayi bulunamadı");
         }
         else
             System.out.println(sayi +" Sayısı bulundu");

    }

    public static int find(int[] a, int target)
    {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return a[i];
            }
        }
        return -1;
    }


}