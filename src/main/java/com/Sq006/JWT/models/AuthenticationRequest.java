package com.Sq006.JWT.models;

import lombok.Data;

import java.io.Serializable;
@Data
public class AuthenticationRequest implements Serializable {


    private String username;
    private String password;

}

