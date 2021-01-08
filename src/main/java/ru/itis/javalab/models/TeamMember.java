package ru.itis.javalab.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
public class TeamMember {
    private Integer id;
    private String first_name;
    private String last_name;
    private Role role_id;
    private String text;
}
