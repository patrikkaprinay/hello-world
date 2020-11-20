package javaretazce;
import java.util.*;

public class JavaRetazce {

    
    public static void main(String[] args) {
        String heslo = "RybickyZuzka123";
        String inputHeslo;
        char prvy, piaty, posledny;
        bool hesloSpr = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Zadajte heslo:");
        inputHeslo = input.nextLine();
        if(inputHeslo == heslo){
            hesloSpr = true;
        } else {
            if(inputHeslo.length() == heslo.length()){
                System.out.println("Heslo je rovnako dlhé, ale nie je správne");
            } else if(inputHeslo.length() > heslo.length()){
                System.out.println("Heslo je dlhé");
            } else if(inputHeslo.length() < heslo.length()){
                System.out.println("Heslo je krátke");
            }
        }

        //Neviem includovať ASCII aby som mohol Rybi č kyZuzka123 písať a nie RybickyZuzka123

        if(inputHeslo.equalsIgnoreCase(heslo)){
            System.out.println("Pomýlili ste v malých alebo velkých písmenách");
        }

        if(!hesloSpr){
            System.out.println("Zadajte 1. znak hesla: ");
        prvy = input.next().charAt(0);
        System.out.println("Zadajte 5. znak hesla: ");
        piaty = input.next().charAt(0);
        System.out.println("Zadajte posledný znak hesla: ");
        posledny = input.next().charAt(0);
        }

        if(prvy == heslo.charAt(0)){
            if(piaty == heslo.charAt(5)) {
                if(posledny == heslo.charAt(heslo.length())){
                    System.out.println("Zadali ste správne heslo!");
                } else {
                    System.out.println("Zadali ste nesprávne heslo!");
                }
            } else {
                System.out.println("Zadali ste nesprávne heslo!");
            }
        } else {
            System.out.println("Zadali ste nesprávne heslo!");
        }
    }
    
}
