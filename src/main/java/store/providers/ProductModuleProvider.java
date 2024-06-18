package store.providers;

import store.domain.Products;
import tools.dynamia.crud.CrudPage;
import tools.dynamia.integration.sterotypes.Provider;
import tools.dynamia.navigation.Module;
import tools.dynamia.navigation.ModuleProvider;

@Provider
public class ProductModuleProvider implements ModuleProvider {
    @Override
    public Module getModule() { //<2>

        var mod2 = new Module("producto", "Productos") //<3>
                .icon("tree")
                .description("Mis productos")
                .position(0)
                .addPage(new CrudPage("productos", "Productos", Products.class));

//

        return mod2;


    }
}
