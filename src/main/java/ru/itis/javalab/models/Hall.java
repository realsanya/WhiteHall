package ru.itis.javalab.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
public class Hall {
    private Integer id;
    private String name;
    private Integer cost;
}
