package com.eazybytes.eazystore.controller;

import com.eazybytes.eazystore.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1/dummy")
public class DummyController {

    @PostMapping("/create-user")
    public String createUser(@RequestBody UserDto userDto) {
        System.out.println(userDto);
        return "User created Successfully";
    }

    @GetMapping("/search")
    public String searchUser(@RequestParam(required = false, defaultValue = "Guest", name = "name") String userName) {
        return "Searching for user with name " + userName;
    }

//    @GetMapping("/multiple-search")
//    public String multipleSearch(@RequestParam String firstName,@RequestParam String lastName) {
//        return "Searching for user with name " + firstName + " " + lastName;
//    }
//
    @GetMapping("/multiple-search")
    public String multipleSearch(@RequestParam Map<String, String> requestParams) {
        return "Searching for user with name " + requestParams.get("firstName") + " " + requestParams.get("lastName");
    }

//    @GetMapping("/user/{userId}/post/{postId}")
//    public String getUser(@PathVariable(name = "userId") String id, @PathVariable String postId) {
//        return "User with id " + id + " and post id " + postId;
//    }

    @GetMapping({"/user/{userId}/post/{postId}","/user/{userId}"})
    public String getUser(@PathVariable(name = "userId") String id, @PathVariable(required = false) String postId) {
        return "User with id " + id + " and post id " + postId;
    }

    @GetMapping({"/user/map/{userId}/post/{postId}","/user/map/{userId}"})
    public String getUserUsingMap(@PathVariable Map<String, String> pathVariables) {
        return "Searching for user with id " + pathVariables.get("userId") + " and post id " + pathVariables.get("postId");
    }

//    @GetMapping("/headers")
//    public String readHeaders(@RequestHeader(name = "User-Agent") String userAgent,
//                              @RequestHeader(name = "User-Location", required = false) String userLocation) {
//        return "User agent " + userAgent + " and location " + userLocation;
//    }

//    @GetMapping("/headers")
//    public String readHeaders(@RequestHeader Map<String, String> headers) {
//        return "Read headers : " + headers.toString();
//    }

    @GetMapping("/headers")
    public String readHeaders(@RequestHeader HttpHeaders headers) {
        return "Read headers : " + headers.toString();
    }
}
