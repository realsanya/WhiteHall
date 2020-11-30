package ru.itis.javalab.models;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
public class Review {
    private Integer id;
    private User user_id;
    private Date date;
    private String text;
}
