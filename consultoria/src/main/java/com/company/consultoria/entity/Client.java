package com.company.consultoria.entity;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;



@Entity
@Builder
@EqualsAndHashCode(exclude = {"age","name","address","cep"})
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @Getter private String cpf;
    @Getter private String name;
    @Getter private String address;
    @Getter private Integer age;
    @Getter private String cep;
}