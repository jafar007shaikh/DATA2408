
package classes;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "getfilelistService", targetNamespace = "http://Classes/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetfilelistService {


    /**
     * 
     * @param emailid
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getfilelist", targetNamespace = "http://Classes/", className = "classes.Getfilelist")
    @ResponseWrapper(localName = "getfilelistResponse", targetNamespace = "http://Classes/", className = "classes.GetfilelistResponse")
    @Action(input = "http://Classes/getfilelistService/getfilelistRequest", output = "http://Classes/getfilelistService/getfilelistResponse")
    public List<String> getfilelist(
        @WebParam(name = "emailid", targetNamespace = "")
        String emailid);

}
