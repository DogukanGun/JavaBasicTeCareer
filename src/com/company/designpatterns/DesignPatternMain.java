package com.company.designpatterns;

import com.company.designpatterns.command.CommandMain;
import com.company.designpatterns.command.HomeCommandType;
import com.company.designpatterns.mediator.Mediator;
import com.company.designpatterns.mediator.MediatorImpl;
import com.company.designpatterns.mediator.OnsiteStudent;

public class DesignPatternMain {

    public static void main(String[] args) {
        CommandMain commandMain = new CommandMain();
        System.out.println(commandMain.main(HomeCommandType.CREATE_HOME_WITH_GARAGE));
        System.out.println(commandMain.main(HomeCommandType.CREATE_HOME_WITH_GARDEN));
        System.out.println(commandMain.main(HomeCommandType.CREATE_APARTMENT));

        Mediator chat = new MediatorImpl();
        OnsiteStudent student1 = new OnsiteStudent(chat ,"A");
        student1.send("Hi remote, how is going?");
    }
}
