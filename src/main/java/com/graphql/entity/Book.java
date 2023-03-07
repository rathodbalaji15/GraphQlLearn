package com.graphql.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="project_books")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String desc;
    @Column
    private String author;
    @Column
    private double price;
    @Column
    private int pages;
}
