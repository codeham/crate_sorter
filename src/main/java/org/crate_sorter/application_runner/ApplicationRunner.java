package org.crate_sorter.application_runner;

import org.crate_sorter.ui.IntroMenuUserInterface;

public class ApplicationRunner {

    public ApplicationRunner(){}

    public void run(){
        executeUserInterface();
    }

    public void executeUserInterface(){
        IntroMenuUserInterface ui = new IntroMenuUserInterface();
        ui.displayIntroductionMenu();
        ui.getIntroMenuChoice();
    }

    public void displayUserInterface(){

    }

    public void runFileScanningAlgorithm(){

    }

    public void exportDataToExcel(){

    }
}
