/*
 * Copyright (C) 2023 Dynamia Soluciones IT S.A.S - NIT 900302344-1
 * Colombia / South America
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package store.providers;

import store.domain.Client;
import tools.dynamia.crud.CrudPage;
import tools.dynamia.integration.sterotypes.Provider;
import tools.dynamia.navigation.Module;
import tools.dynamia.navigation.ModuleProvider;
import tools.dynamia.navigation.Page;

@Provider
public class ClientModuleProvider implements ModuleProvider { // <1>

    @Override
    public Module getModule() { //<2>

        var mod = new Module("cliente", "Clientes") //<3>
                .icon("user")
                .description("my books library")
                .position(0)
                .addPage(new CrudPage("clientes", "Clientes", Client.class));

//

        return mod;


    }
}
