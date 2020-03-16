package webservices.client.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "CityService", targetNamespace = "http://lab3.webservices.mileshin.ifmo/", wsdlLocation = "http://0.0.0.0:2097/CityService?wsdl")
public class CityService
        extends Service
{

    private final static URL CITYSERVICE_WSDL_LOCATION;
    private final static WebServiceException CITYSERVICE_EXCEPTION;
    private final static QName CITYSERVICE_QNAME = new QName("http://lab3.webservices.mileshin.ifmo/", "CityService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://0.0.0.0:2987/CityService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CITYSERVICE_WSDL_LOCATION = url;
        CITYSERVICE_EXCEPTION = e;
    }

    public CityService() {
        super(__getWsdlLocation(), CITYSERVICE_QNAME);
    }

    public CityService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CITYSERVICE_QNAME, features);
    }

    public CityService(URL wsdlLocation) {
        super(wsdlLocation, CITYSERVICE_QNAME);
    }

    public CityService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CITYSERVICE_QNAME, features);
    }

    public CityService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CityService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns CityWebService
     */
    @WebEndpoint(name = "CityWebServicePort")
    public CityWebService getCityWebServicePort() {
        return super.getPort(new QName("http://lab3.webservices.mileshin.ifmo/", "CityWebServicePort"), CityWebService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CityWebService
     */
    @WebEndpoint(name = "CityWebServicePort")
    public CityWebService getCityWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://lab3.webservices.mileshin.ifmo/", "CityWebServicePort"), CityWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CITYSERVICE_EXCEPTION!= null) {
            throw CITYSERVICE_EXCEPTION;
        }
        return CITYSERVICE_WSDL_LOCATION;
    }

}