package com.company.designpatterns;

import com.company.designpatterns.command.CommandMain;
import com.company.designpatterns.command.HomeCommandType;

public class DesignPatternMain {

    public static void main(String[] args) {
        CommandMain commandMain = new CommandMain();

        System.out.println(commandMain.main(HomeCommandType.CREATE_HOME_WITH_GARAGE));
        System.out.println(commandMain.main(HomeCommandType.CREATE_HOME_WITH_GARDEN));
        System.out.println(commandMain.main(HomeCommandType.CREATE_APARTMENT));
    }
}
