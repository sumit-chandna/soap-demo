package org.skcorg.soap.endpoint.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.skcorg.soap.endpoint.ProductCatalog;

@WebService
public class ProductCatalogImpl implements ProductCatalog {
	@Override
	public List<String> getProductCategories() {
		List<String> prodCat = new ArrayList<>();
		prodCat.add("Abc");
		prodCat.add("Bcd");
		prodCat.add("Cde");
		prodCat.add("Efg");
		return prodCat;
	}
}