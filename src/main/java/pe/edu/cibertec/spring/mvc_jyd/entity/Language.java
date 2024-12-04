package pe.edu.cibertec.spring.mvc_jyd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer LanguageId;
    private String name;
    private Date lastUpdate;

    @OneToMany(mappedBy = "Leguage")
    private List<Film> films;
}
