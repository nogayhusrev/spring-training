package com.nogayhusrev;

import com.nogayhusrev.model.Comment;
import com.nogayhusrev.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring07SpringBootDemoApplication {

	public static void main(String[] args) {

		Comment comment  = new Comment();
		comment.setAuthor("Johnson");
		comment.setText("Spring Framework");

		ApplicationContext container = SpringApplication.run(Spring07SpringBootDemoApplication.class, args);

		CommentService commentService = container.getBean(CommentService.class);
		commentService.publishComment(comment);

		commentService.printConfigData();
		commentService.printDbConfigData();
	}



}
