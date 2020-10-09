package br.com.caelum.payfast.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

@ApplicationPath("/v1")
public class PagamentoService extends Application {
	public PagamentoService() {
		BeanConfig conf = new BeanConfig();
		conf.setTitle("Payfast API");
		conf.setDescription("Pagamentos r�pidos");
		conf.setVersion("1.0.0");
		conf.setHost("localhost:8080");
		conf.setBasePath("/fj36-webservice/v1");
		conf.setSchemes(new String[] { "http" });
		conf.setResourcePackage("br.com.caelum.payfast.rest");
		conf.setScan(true);
	}

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<>();
		resources.add(PagamentoResource.class);
		resources.add(ApiListingResource.class);
		resources.add(SwaggerSerializers.class);
		return resources;
	}
}
