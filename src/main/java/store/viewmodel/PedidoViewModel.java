package store.viewmodel;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import store.domain.Client;
import store.domain.Products;
import tools.dynamia.domain.services.CrudService;
import tools.dynamia.domain.util.DomainUtils;

import java.util.List;

public class PedidoViewModel {
    private CrudService crudService = DomainUtils.lookupCrudService();
    private Client selectedClient;
    private List<Client> clients;
    private Products selectdProduct;
    private List<Products> products;

    @Init
    public void initPage() {
        System.out.println("Todos los clientes y productos");
        products = crudService.findAll(Products.class);
        clients = crudService.findAll(Client.class);
    }

}
