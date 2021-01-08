package ru.itis.javalab.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
public class Role {
    private Integer role_id;
    private String name;
}
