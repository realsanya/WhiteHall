package ru.itis.javalab.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
public class Hall {
    Integer id;
    String name;
    Integer cost;
}
