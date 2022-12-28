package com.example.services;

import lombok.*;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserEntry {

    private String userName;
    private String name;
    private String email;
    private String mobNo;
}
