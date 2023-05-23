package metodoString;
import java.util.Scanner;

public class Nombres{
    public static void main(String args[]){
        String nombreA="";
        String nombreB="";

        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese nombre A: ");
        nombreA = input.nextLine();
        
        System.out.println("Ingrese nombre B: ");
        nombreB = input.nextLine();

        if(nombreA.equalsIgnoreCase(nombreB)) {
            System.out.println("Nombres iguales");
        } else {
            System.out.println("Nombres diferentes");
        }
    }
}