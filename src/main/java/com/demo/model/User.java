package com.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class User  extends Superior {
@Column(nullable = false)
private String nom_complet;
@Min(value = 18,message = "l'age doit être >18")
private int age;
@Column(nullable = true)
private String adresse;
@Column(length = 20)
private String tel;
}
