package ru.itis.javalab.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
public class Role {
    Integer role_id;
    String name;
}
