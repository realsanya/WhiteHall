package ru.itis.javalab.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
public class TeamMember {
    Integer id;
    String first_name;
    String last_name;
    Role role_id;
    String text;
}
