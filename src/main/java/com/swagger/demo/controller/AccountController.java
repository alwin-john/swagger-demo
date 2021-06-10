package com.swagger.demo.controller;

import com.swagger.demo.exception.BusinessErrorException;
import com.swagger.demo.exception.RegisterUserDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
@RequestMapping("/v1/api/accounts")
public class AccountController {

    /**
     * Create a new account
     * @param registerDto details need to register a user
     * @return created account information
     */
    @ApiOperation(value = "Register a new account to the application",
                  notes = "User can create an account in the application. He/she can create it without login ")
    @PostMapping(value = "/register")
    public ResponseEntity<?> signUp(@RequestBody RegisterUserDto registerDto) throws BusinessErrorException {
        return new ResponseEntity(HttpStatus.OK);

    }

    /**
     * List the users associated with an account
     * @return list of user information associated with an account
     */
    @ApiOperation(value = "List the users associated with an account",
        notes = " Account user must login into the application. " +
                " Find the token in response header and use that token in Authorization header ( Bearer <your token>)")
    @GetMapping(value = "/users")
    public ResponseEntity<?> getUsers() throws BusinessErrorException {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
