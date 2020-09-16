package com.example.mytest.entity;


import com.example.mytest.domain.LineDto;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Entity
@Table(name = "location")
@TypeDef(
        name = "jsonb",
        typeClass = JsonBinaryType.class
)
public class Locations {
    @Id
    @GeneratedValue
    private Long id;

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private LineDto lineDto;

    public Locations() {
    }

    public Long getId() {
        return id;
    }

    public LineDto getLineDto() {
        return lineDto;
    }

    public void setLineDto(LineDto lineDto) {
        this.lineDto = lineDto;
    }
}
