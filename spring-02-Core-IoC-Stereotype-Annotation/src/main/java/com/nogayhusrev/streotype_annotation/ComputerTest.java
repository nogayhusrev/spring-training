package com.nogayhusrev.streotype_annotation;


import com.nogayhusrev.streotype_annotation.config.PcConfig;
import com.nogayhusrev.streotype_annotation.monitorfactory.Monitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class ComputerTest {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);

        Monitor theMonitor = container.getBean(Monitor.class);
        System.out.println(theMonitor.getSize());
    }


}
