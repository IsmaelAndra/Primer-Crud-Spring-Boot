package ejemplo.crud.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_estudiante;
    private String name_estudiante;
    private String lastName_estudiante;
    private int age_estudiante;
    private String email_estudiante;
    private String address_estudiante;

    public Estudiante(long id_estudiante, String name_estudiante, String lastName_estudiante, int age_estudiante, String email_estudiante, String address_estudiante){
        this.id_estudiante = id_estudiante;
        this.name_estudiante = name_estudiante;
        this.lastName_estudiante = lastName_estudiante;
        this.age_estudiante = age_estudiante;
        this.email_estudiante = email_estudiante;
        this.address_estudiante = address_estudiante;
    }

    public long getId_estudiante() {
        return this.id_estudiante;
    }

    public void setId_estudiante(long id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getName_estudiante() {
        return this.name_estudiante;
    }

    public void setName_estudiante(String name_estudiante) {
        this.name_estudiante = name_estudiante;
    }

    public String getLastName_estudiante() {
        return this.lastName_estudiante;
    }

    public void setLastName_estudiante(String lastName_estudiante) {
        this.lastName_estudiante = lastName_estudiante;
    }

    public int getAge_estudiante() {
        return this.age_estudiante;
    }

    public void setAge_estudiante(int age_estudiante) {
        this.age_estudiante = age_estudiante;
    }

    public String getEmail_estudiante() {
        return this.email_estudiante;
    }

    public void setAge_estudiante(String email_estudiante) {
        this.email_estudiante = email_estudiante;
    }

    public String getAddress_estudiante() {
        return this.address_estudiante;
    }

    public void setAddress_estudiante(String address_estudiante) {
        this.address_estudiante = address_estudiante;
    }
}
