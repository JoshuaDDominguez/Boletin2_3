
package boletin2_3;

import java.util.Scanner;
public class Boletin2_3 {

    
    public static void main(String[] args) {
        
        float eur,cam,dol;
        Scanner sc=new Scanner(System.in);
        System.out.println("Teclea euros");
        eur=sc.nextFloat();
        System.out.println("Teclea cambio");
        cam=sc.nextFloat();
        dol=eur*cam;
        System.out.println(eur+"€ son "+dol+"$");
        
    }
    
}
