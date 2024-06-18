package store.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import tools.dynamia.domain.OrderBy;
import tools.dynamia.domain.contraints.NotEmpty;
import tools.dynamia.domain.jpa.BaseEntity;
import tools.dynamia.domain.jpa.SimpleEntity;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table (name = "products")
@OrderBy("nombre")
public class Products implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @NotEmpty
    private String nombre;
    private int precio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
