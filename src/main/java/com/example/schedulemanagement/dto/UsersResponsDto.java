package com.example.schedulemanagement.dto;

import com.example.schedulemanagement.entity.Users;
import lombok.Getter;

@Getter
public class UsersResponsDto {
    private Long id;
    private String name;

    public UsersResponsDto(Users users){
        this.id = users.getId();
        this.name = users.getName();
    }

    public UsersResponsDto(Long id, String name){
        this.id = id;
        this.name = name;
    }
}
