package com.example.course.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name ="tb_category")
public class Category implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String name;
    @JsonIgnore
    @ManyToMany(mappedBy = "categories")

    private Set<Product> product = new HashSet<>();

    public Category() {
    }

    public Category(Long ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Set<Product> getProduct() {
        return product;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(ID, category.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }




}
