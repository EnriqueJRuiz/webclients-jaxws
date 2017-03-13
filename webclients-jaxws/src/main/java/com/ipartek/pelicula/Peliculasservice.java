
package com.ipartek.pelicula;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "peliculasservice", targetNamespace = "http://pelicula.ws.formacion.ipartek.com/", wsdlLocation = "http://192.168.0.4:8080/webservices-jaxws/peliculaws?wsdl")
public class Peliculasservice
    extends Service
{

    private final static URL PELICULASSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.ipartek.pelicula.Peliculasservice.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.ipartek.pelicula.Peliculasservice.class.getResource(".");
            url = new URL(baseUrl, "http://192.168.0.4:8080/webservices-jaxws/peliculaws?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://192.168.0.4:8080/webservices-jaxws/peliculaws?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PELICULASSERVICE_WSDL_LOCATION = url;
    }

    public Peliculasservice(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Peliculasservice() {
        super(PELICULASSERVICE_WSDL_LOCATION, new QName("http://pelicula.ws.formacion.ipartek.com/", "peliculasservice"));
    }

    /**
     * 
     * @return
     *     returns PeliculaServiceWSImp
     */
    @WebEndpoint(name = "PeliculaServiceWSImpPort")
    public PeliculaServiceWSImp getPeliculaServiceWSImpPort() {
        return super.getPort(new QName("http://pelicula.ws.formacion.ipartek.com/", "PeliculaServiceWSImpPort"), PeliculaServiceWSImp.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PeliculaServiceWSImp
     */
    @WebEndpoint(name = "PeliculaServiceWSImpPort")
    public PeliculaServiceWSImp getPeliculaServiceWSImpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://pelicula.ws.formacion.ipartek.com/", "PeliculaServiceWSImpPort"), PeliculaServiceWSImp.class, features);
    }

}
