package com.haari;
import java.util.*;
public class nestedSwitch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int empID=sc.nextInt();
        String department=sc.next();
        switch (empID) {
            case 1:
                System.out.println("haari");
                break;
            case 2:
                System.out.println("hello");
                break;
            case 3:
                switch (department) {
                    case "IT" -> System.out.println("it ");
                    case "cse" -> System.out.println("cse");
                    default -> System.out.println("no dept");
                }
                break;
            default:
                System.out.println("invalid");
                break;
        }

    }
}
