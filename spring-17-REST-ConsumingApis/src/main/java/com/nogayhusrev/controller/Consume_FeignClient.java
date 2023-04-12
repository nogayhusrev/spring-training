package com.nogayhusrev.controller;


import com.nogayhusrev.client.EmployeeClient;
import com.nogayhusrev.client.UserClient;
import com.nogayhusrev.dto.ResponseWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Consume_FeignClient {

    private final UserClient userClient;
    private final EmployeeClient employeeClient;

    public Consume_FeignClient(UserClient userClient, EmployeeClient employeeClient) {
        this.userClient = userClient;
        this.employeeClient = employeeClient;
    }

    @GetMapping("/api/v1/users")
    public ResponseEntity<ResponseWrapper> getUsers(){
        return ResponseEntity.ok(new ResponseWrapper("UserList Retrieved",userClient.getUsers()));
    }

    @GetMapping("/api/v1/employee")
    public ResponseEntity<ResponseWrapper> getEmployee(){
        return ResponseEntity.ok(new ResponseWrapper("Employee Retrieved", employeeClient.getEmployee("6298ebfecd0551211fce37a6")));
    }

}
