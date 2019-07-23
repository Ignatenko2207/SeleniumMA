package com.mainacad.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    private String login;
    private String password;
    private String firstName;
    private String lastName;

}
