package com.qa.TextAdventure;

import java.util.*;

public class App {

		
    public static void main( String[] args )
    {
        System.out.println( "-* Welcome to the Swamp *- a kind wanderer says as you pass.\n");
        
    		Scanner s = new Scanner(System.in);
        	System.out.println("Enter you name Traveller: [type name] ");
        	String name = s.nextLine();
        	System.out.println("What are you Traveller? [type class] ");
            String clss = s.nextLine();
            System.out.println("Welcome " + name + ", the " + clss + "\nAre you ready? \nLet us begin");
            System.out.println("\nYou are left alone with nothing but your 'Magic' compass, or so the shopkeeper said. \nIt is a small disk that you worked out does not necessarily point north.\n"
            		+ "Looking around there is no points of reference just a large, damp, grey swamp");
            
             
            System.out.println("\nWhich direction would you like to go? [north, east, south, west?] ");
            String d1 = s.nextLine();
        	System.out.println("You go " + d1);
        	if (d1.equals("north")) { 
       		}else System.out.println("You are already lost, go back");      

        	
        	System.out.println("You passed the first test.\nWhich direction would you like to go? [north, east, south, west?] ");
            String d2 = s.nextLine();
         	System.out.println("You go " + d2);
         	if (d2.equals("west")) { 
         		System.out.println("You are on the right track, well done!\nThe compass shows that you are close");
        		}else System.out.println("You are already lost, go back"); 
 	
        	        	
        	}   
}
