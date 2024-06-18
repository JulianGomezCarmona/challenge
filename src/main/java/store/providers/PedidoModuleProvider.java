package store.providers;


import store.domain.Pedidos;
import tools.dynamia.integration.sterotypes.Provider;
import tools.dynamia.navigation.Module;
import tools.dynamia.navigation.ModuleProvider;
import tools.dynamia.navigation.Page;
import tools.dynamia.navigation.PageGroup;

@Provider
public class PedidoModuleProvider implements ModuleProvider {

    @Override
    public Module getModule(){

        var mod3 = new Module("pedido","Pedidos")
                .icon("book")
                .addPage(new Page("crearPedido", "Crear Pedido","classpath:/pages/standard-mvvm.zul"));


        return mod3;
    }
}
