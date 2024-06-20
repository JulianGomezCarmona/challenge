package store.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import tools.dynamia.domain.OrderBy;
import tools.dynamia.domain.jpa.BaseEntity;

@Entity
@Table(name = "DetallesPedidos")
@OrderBy("id")
public class DetallesPedidos extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;
    private Long pedidoId;
    private int cantidad;
    private int precio;



    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}


