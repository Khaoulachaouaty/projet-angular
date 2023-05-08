package com.khaoula.livre.dto;

import java.util.Date;

import com.khaoula.livre.entities.Editeur;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LivreDTO {
private Long idLivre;
private String nomLivre;
private Double prixLivre;
private Date datePublication;
private Editeur editeur;
private String nomEd;

}