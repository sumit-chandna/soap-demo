package org.skcorg.soap.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.skcorg.soap.Person;

/*
 * SEI
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface PersonService {

	@WebMethod
	public boolean addPerson(@WebParam(name = "Person") Person p);

	@WebMethod
	public boolean deletePerson(int id);

	@WebMethod
	public Person getPerson(int id);

	@WebMethod(action = "fetchAllperson", operationName = "fetchPersons")
	public Person[] getAllPersons();
}