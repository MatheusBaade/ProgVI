/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque;

import com.sun.jersey.api.core.PackagesResourceConfig;
import java.util.Set;
import javax.ws.rs.ApplicationPath;

/**
 *
 * @author matheus
 */
@ApplicationPath("/app")
public class EstoqueApplication extends PackagesResourceConfig {
    public EstoqueApplication() {
        super("resources,exceptions,authenticator");
    }

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }


    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(authenticator.AuthenticationRequestFilter.class);
        resources.add(exceptions.MyExceptionMapper.class);
        resources.add(resources.HelloWorld.class);
        resources.add(resources.ProdutoResource.class);
    }
}
