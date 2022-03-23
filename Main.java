package com.company;
/*Braille.java
  ICS4U1
  March 11, 2022
  Looping through file to encrypt message and print to console
 */
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("Braille1.txt")); //Scanning through a new file named "Braille1.txt"
        while(file.hasNext()){
            String l1 = file.nextLine(); //setting l1 to line1 by going to next line
            String l2 = file.nextLine(); //setting l2 to line2 by going to next line
            String l3 = file.nextLine(); //setting l3 to line3 by going to next line
            for(int i=0; i<l1.length(); i+=2) { //looping through nested if statements to check if position of x and o match letter
                if(l1.charAt(i)=='x' && l1.charAt(i+1)=='o'){ //checking line-by-line through first(changing) and second(changing) column to identify corresponding letter
                                                              //specifically in the first line that has an x in first(changing) column and o in second(changing) column.
                    if(l2.charAt(i)=='o' && l2.charAt(i+1)=='o'){ //Going through the rest of lines and columns to find matching braille pattern.
                        if(l3.charAt(i)=='o' && l3.charAt(i+1)=='o'){
                            System.out.print("A "); //once conditions are met, letter is printed
                        }
                    }
                    if(l2.charAt(i)=='x' && l2.charAt(i+1)=='o'){
                        if(l3.charAt(i)=='o' && l3.charAt(i+1)=='o'){
                            System.out.print("B ");
                        }
                    }
                    if(l2.charAt(i)=='o' && l2.charAt(i+1)=='x'){
                        if(l3.charAt(i)=='o' && l3.charAt(i+1)=='o'){
                            System.out.print("E ");
                        }
                    }
                    if(l2.charAt(i)=='x' && l2.charAt(i+1)=='x'){
                        if(l3.charAt(i)=='o' && l3.charAt(i+1)=='o'){
                            System.out.print("H ");
                        }
                    }
                    if(l2.charAt(i)=='o' && l2.charAt(i+1)=='o'){
                        if(l3.charAt(i)=='x' && l3.charAt(i+1)=='o'){
                            System.out.print("K ");
                        }
                    }
                    if(l2.charAt(i)=='x' && l2.charAt(i+1)=='o'){
                        if(l3.charAt(i)=='x' && l3.charAt(i+1)=='o'){
                            System.out.print("L ");
                        }
                    }
                    if(l2.charAt(i)=='o' && l2.charAt(i+1)=='x'){
                        if(l3.charAt(i)=='x' && l3.charAt(i+1)=='o'){
                            System.out.print("O ");
                        }
                    }
                    if(l2.charAt(i)=='x' && l2.charAt(i+1)=='x'){
                        if(l3.charAt(i)=='x' && l3.charAt(i+1)=='o'){
                            System.out.print("R ");
                        }
                    }
                    if(l2.charAt(i)=='o' && l2.charAt(i+1)=='o'){
                        if(l3.charAt(i)=='x' && l3.charAt(i+1)=='x'){
                            System.out.print("U ");
                        }
                    }
                    if(l2.charAt(i)=='x' && l2.charAt(i+1)=='o'){
                        if(l3.charAt(i)=='x' && l3.charAt(i+1)=='x'){
                            System.out.print("V ");
                        }
                    }
                    if(l2.charAt(i)=='o' && l2.charAt(i+1)=='x'){
                        if(l3.charAt(i)=='x' && l3.charAt(i+1)=='x'){
                            System.out.print("Z ");
                        }
                    }
                }
                if(l1.charAt(i)=='x' && l1.charAt(i+1)=='x'){ //checking line-by-line through first(changing) and second(changing) column to identify corresponding letter
                                                              //specifically in the first line that has an x in first(changing) column and x in second(changing) column.
                    if(l2.charAt(i)=='o' && l2.charAt(i+1)=='o'){ //Going through the rest of lines and columns to find matching braille pattern.
                        if(l3.charAt(i)=='o' && l3.charAt(i+1)=='o'){
                            System.out.print("C "); //once conditions are met, letter is printed
                        }
                    }
                    if(l2.charAt(i)=='o' && l2.charAt(i+1)=='x'){
                        if(l3.charAt(i)=='o' && l3.charAt(i+1)=='o'){
                            System.out.print("D ");
                        }
                    }
                    if(l2.charAt(i)=='x' && l2.charAt(i+1)=='o'){
                        if(l3.charAt(i)=='o' && l3.charAt(i+1)=='o'){
                            System.out.print("F ");
                        }
                    }
                    if(l2.charAt(i)=='x' && l2.charAt(i+1)=='x'){
                        if(l3.charAt(i)=='o' && l3.charAt(i+1)=='o'){
                            System.out.print("G ");
                        }
                    }
                    if(l2.charAt(i)=='o' && l2.charAt(i+1)=='o'){
                        if(l3.charAt(i)=='x' && l3.charAt(i+1)=='o'){
                            System.out.print("M ");
                        }
                    }
                    if(l2.charAt(i)=='o' && l2.charAt(i+1)=='x'){
                        if(l3.charAt(i)=='x' && l3.charAt(i+1)=='o'){
                            System.out.print("N ");
                        }
                    }
                    if(l2.charAt(i)=='x' && l2.charAt(i+1)=='o'){
                        if(l3.charAt(i)=='x' && l3.charAt(i+1)=='o'){
                            System.out.print("P ");
                        }
                    }
                    if(l2.charAt(i)=='x' && l2.charAt(i+1)=='x'){
                        if(l3.charAt(i)=='x' && l3.charAt(i+1)=='o'){
                            System.out.print("Q ");
                        }
                    }
                    if(l2.charAt(i)=='o' && l2.charAt(i+1)=='o'){
                        if(l3.charAt(i)=='x' && l3.charAt(i+1)=='x'){
                            System.out.print("X ");
                        }
                    }
                    if(l2.charAt(i)=='o' && l2.charAt(i+1)=='x'){
                        if(l3.charAt(i)=='x' && l3.charAt(i+1)=='x'){
                            System.out.print("Y ");
                        }
                    }
                }
                if(l1.charAt(i)=='o' && l1.charAt(i+1)=='x'){ //checking line-by-line through first(changing) and second(changing) column to identify corresponding letter
                                                              //specifically in the first line that has an o in first(changing) column and x in second(changing) column.
                    if(l2.charAt(i)=='x' && l2.charAt(i+1)=='o'){ //Going through the rest of lines and columns to find matching braille pattern.
                        if(l3.charAt(i)=='o' && l3.charAt(i+1)=='o'){
                            System.out.print("I "); //once conditions are met, letter is printed
                        }
                    }
                    if(l2.charAt(i)=='x' && l2.charAt(i+1)=='x'){
                        if(l3.charAt(i)=='o' && l3.charAt(i+1)=='o'){
                            System.out.print("J ");
                        }
                    }
                    if(l2.charAt(i)=='x' && l2.charAt(i+1)=='o'){
                        if(l3.charAt(i)=='x' && l3.charAt(i+1)=='o'){
                            System.out.print("S ");
                        }
                    }
                    if(l2.charAt(i)=='x' && l2.charAt(i+1)=='x'){
                        if(l3.charAt(i)=='x' && l3.charAt(i+1)=='o'){
                            System.out.print("T ");
                        }
                    }
                    if(l2.charAt(i)=='x' && l2.charAt(i+1)=='x'){
                        if(l3.charAt(i)=='o' && l3.charAt(i+1)=='x'){
                            System.out.print("W ");
                        }
                    }
                }
                if (i+2 == l1.length()){ //if the index plus 2 indices(accounting for next 2 columns)
                                         //in line1 equals to the length of that row, a new line is written.
                    System.out.println();
                }
            }
        }
    }
}