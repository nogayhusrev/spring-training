package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.casefactory.DellCase;
import com.cydeo.bean_annotation.config.ComputerConfig;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ComputerTest {

    public static void main(String[] args) {
//      Creating container by using Application Context
        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class);

//      Creating container by using BeanFactory
        BeanFactory context = new AnnotationConfigApplicationContext(ComputerConfig.class);



        System.out.println("********************Retrieving Beans******************");

        SonyMonitor sonyMonitor = container.getBean(SonyMonitor.class);
        DellCase dellCase = container.getBean(DellCase.class);
        AsusMotherboard asusMotherboard = container.getBean(AsusMotherboard.class);

        PC pc = new PC(dellCase,sonyMonitor,asusMotherboard);
        pc.powerUp();

/*
        Monitor theMonitor = container.getBean(Monitor.class);
        Case theCase = container.getBean(Case.class);
        Motherboard theMotherBoard = container.getBean(Motherboard.class);


        PC myPc = new PC(theCase, theMonitor, theMotherBoard);
        myPc.powerUp();

 */
        System.out.println();


        System.out.println("********************Multiple Object******************");
        Monitor theMonitor2 = container.getBean("monitorSony", Monitor.class); //Default bean name
//        Monitor theMonitor3 = container.getBean("sony", Monitor.class); //Custom bean name
        Monitor theMonitor4 = container.getBean( Monitor.class); //@Primary




        Case theCase = container.getBean(Case.class);
        Motherboard theMotherBoard = container.getBean(Motherboard.class);

        PC myPc = new PC(theCase, theMonitor4, theMotherBoard);
        myPc.powerUp();


    }
}
