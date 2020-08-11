package com.evente.debug.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@AllArgsConstructor
@Getter
public class User {
    private String userName;
    private String pwd;
    private String userType;
}
