package com.cydeo;

import com.cydeo.config.CommentConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CommentConfig.class);
        
        CommentService cs1 = applicationContext.getBean(CommentService.class);
        CommentService cs2 = applicationContext.getBean(CommentService.class);

        System.out.println("cs1 = " + cs1);
        System.out.println("cs2 = " + cs2);
        System.out.println("(cs1 == cs2) = " + (cs1 == cs2));


       
    }
}
