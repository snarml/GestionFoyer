package tn.esprim.gestiontest1.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Getter
@Setter
@AllArgsConstructor 
@NoArgsConstructor 

public class Etudiant implements Serializable {
  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idEtudiant;
  private String nom;
  private String prenom;
  private long cin;
  private String ecole;
  @JsonFormat(pattern = "yyy-MM-dd")
  private Date dateNaissance;
  @OneToOne
  @JsonIgnore
  private Chambre chambre ;
  @OneToMany(mappedBy = "etudiant")
  @JsonIgnore
  private List<Reservation> reservations;
}
