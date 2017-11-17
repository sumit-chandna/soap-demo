package org.skcorg.soap.endpoint;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

/*
 * SEI
 */
@WebService
public interface ProductCatalog {
	@WebMethod
	List<String> getProductCategories();
}
