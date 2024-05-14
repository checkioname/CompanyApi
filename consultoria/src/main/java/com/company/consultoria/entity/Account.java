package com.company.consultoria.entity.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
@Getter@Setter@NoArgsConstructor
@Builder
public class Account {

    @Id
    @GeneratedValue
    @Getter private Long id;

    @Getter private String username;
    @Getter private String password;
    @Getter private Date age;
    @Getter private String email;

}
