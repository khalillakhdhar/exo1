package com.demo.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Activite extends Superior {
@Column(columnDefinition = ("varchar(200) default 'loisir' "))
private String type;

private String description;
}
