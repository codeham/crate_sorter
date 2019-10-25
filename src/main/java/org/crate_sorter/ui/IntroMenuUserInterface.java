package org.crate_sorter.ui;

import java.util.Scanner;

public class IntroMenuUserInterface {
    private Scanner scanner;
    private int introMenuChoice;

    public IntroMenuUserInterface(){
        scanner = new Scanner(System.in);
    }

    public void displayIntroductionMenu(){
        System.out.println("Crate Scanner");
        System.out.println("---------------");
        System.out.println("1. Scan complete library");
        System.out.println("2. Scan up to # of files");
        System.out.println("3. exit");
    }

    public int getIntroMenuChoice(){
        return introMenuChoice;
    }
}
