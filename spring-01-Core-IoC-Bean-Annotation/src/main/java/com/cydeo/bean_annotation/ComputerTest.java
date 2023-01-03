package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.config.ComputerConfig;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
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
        Monitor theMonitor3 = container.getBean("sony", Monitor.class); //Custom bean name
        Monitor theMonitor4 = container.getBean( Monitor.class); //@Primary




        Case theCase = container.getBean(Case.class);
        Motherboard theMotherBoard = container.getBean(Motherboard.class);

        PC myPc = new PC(theCase, theMonitor2, theMotherBoard);
        myPc.powerUp();


    }
}
