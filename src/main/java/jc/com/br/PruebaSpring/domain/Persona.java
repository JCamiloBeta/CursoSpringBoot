package jc.com.br.PruebaSpring.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;


@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    @Email
    private String email;
    @Positive
    @Size(min = 7, max = 15)
    @Digits(fraction = 0, integer = 15)
    private String telefono;
    @NotNull
    private Double saldo;
}
