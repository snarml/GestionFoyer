package tn.esprim.gestiontest1.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter 
@AllArgsConstructor 
@NoArgsConstructor 

public class Universite implements Serializable {
  
  @Id 
  @GeneratedValue 
  private Long idUniversite;
  private String nomUniversite;
  private String adresseUniversite;

  @OneToOne
  private Foyer foyer;

}
