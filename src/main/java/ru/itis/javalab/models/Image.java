package ru.itis.javalab.models;

import lombok.*;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
public class Image {
    private Integer id;
    private String type;
    private String path;
}
