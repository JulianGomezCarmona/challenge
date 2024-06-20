package store.viewmodel;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import store.domain.Client;
import store.domain.DetallesPedidos;
import store.domain.Products;
import tools.dynamia.domain.services.CrudService;
import tools.dynamia.domain.util.DomainUtils;
import tools.dynamia.zk.util.ZKBindingUtil;
import tools.dynamia.zk.util.ZKUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PedidoViewModel {
    private CrudService crudService = DomainUtils.lookupCrudService();
    private Client selectedClient;
    private List<Client> clients;
    private Products selectdProduct;
    private List<Products> products;
    private int Cantidad;
    private List<DetallesPedidos> detallesPedidos = new ArrayList<>();


    @Init
    public void initPage() {
        System.out.println("Todos los clientes y productos");
        products = crudService.findAll(Products.class);
        clients = crudService.findAll(Client.class);
    }
//    @Command
//    @NotifyChange("productPrice")

//    public int priceProduct(){
//
//        System.out.println(priceProduct);
//        return priceProduct;
//    }

    @Command
    public void crearDetalle(){
        int cantidad = getCantidad();
        String nombreProducto = getSelectdProduct().getNombre();
        String nombreCliente = getSelectedClient().getNombre();
        int precio = getSelectdProduct().getPrecio();
        DetallesPedidos  detallesPedido = new DetallesPedidos();
        detallesPedido.setCantidad(cantidad);
        detallesPedido.setPrecio(precio);
        detallesPedidos.add(detallesPedido);
        setSelectedClient(null);
        setSelectdProduct(null);
        setCantidad(0);
        ZKBindingUtil.postNotifyChange(this);
    }

    public Client getSelectedClient() {
        return selectedClient;
    }

    public void setSelectedClient(Client selectedClient) {
        this.selectedClient = selectedClient;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public Products getSelectdProduct() {
        return selectdProduct;
    }

    public void setSelectdProduct(Products selectdProduct) {
        this.selectdProduct = selectdProduct;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }


}
