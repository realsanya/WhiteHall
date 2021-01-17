package ru.itis.javalab.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
public class User {
    private Integer id;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private Image image_id;
}
