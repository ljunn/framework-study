package com.example.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@Getter
@Setter
public class Users {
    private String userid;
    private String username;
    private String password;
}
