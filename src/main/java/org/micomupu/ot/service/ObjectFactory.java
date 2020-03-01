
package org.micomupu.ot.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.micomupu.ot.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultarOrdenTrabajo_QNAME = new QName("http://service.ot.micomupu.org/", "consultarOrdenTrabajo");
    private final static QName _IngresarOrdenResponse_QNAME = new QName("http://service.ot.micomupu.org/", "ingresarOrdenResponse");
    private final static QName _IngresarOrden_QNAME = new QName("http://service.ot.micomupu.org/", "ingresarOrden");
    private final static QName _ConsultarOrdenTrabajoResponse_QNAME = new QName("http://service.ot.micomupu.org/", "consultarOrdenTrabajoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.micomupu.ot.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarOrdenTrabajo }
     * 
     */
    public ConsultarOrdenTrabajo createConsultarOrdenTrabajo() {
        return new ConsultarOrdenTrabajo();
    }

    /**
     * Create an instance of {@link ConsultarOrdenTrabajoResponse }
     * 
     */
    public ConsultarOrdenTrabajoResponse createConsultarOrdenTrabajoResponse() {
        return new ConsultarOrdenTrabajoResponse();
    }

    /**
     * Create an instance of {@link IngresarOrdenResponse }
     * 
     */
    public IngresarOrdenResponse createIngresarOrdenResponse() {
        return new IngresarOrdenResponse();
    }

    /**
     * Create an instance of {@link IngresarOrden }
     * 
     */
    public IngresarOrden createIngresarOrden() {
        return new IngresarOrden();
    }

    /**
     * Create an instance of {@link Trabajo }
     * 
     */
    public Trabajo createTrabajo() {
        return new Trabajo();
    }

    /**
     * Create an instance of {@link Equipo }
     * 
     */
    public Equipo createEquipo() {
        return new Equipo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarOrdenTrabajo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ot.micomupu.org/", name = "consultarOrdenTrabajo")
    public JAXBElement<ConsultarOrdenTrabajo> createConsultarOrdenTrabajo(ConsultarOrdenTrabajo value) {
        return new JAXBElement<ConsultarOrdenTrabajo>(_ConsultarOrdenTrabajo_QNAME, ConsultarOrdenTrabajo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarOrdenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ot.micomupu.org/", name = "ingresarOrdenResponse")
    public JAXBElement<IngresarOrdenResponse> createIngresarOrdenResponse(IngresarOrdenResponse value) {
        return new JAXBElement<IngresarOrdenResponse>(_IngresarOrdenResponse_QNAME, IngresarOrdenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarOrden }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ot.micomupu.org/", name = "ingresarOrden")
    public JAXBElement<IngresarOrden> createIngresarOrden(IngresarOrden value) {
        return new JAXBElement<IngresarOrden>(_IngresarOrden_QNAME, IngresarOrden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarOrdenTrabajoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ot.micomupu.org/", name = "consultarOrdenTrabajoResponse")
    public JAXBElement<ConsultarOrdenTrabajoResponse> createConsultarOrdenTrabajoResponse(ConsultarOrdenTrabajoResponse value) {
        return new JAXBElement<ConsultarOrdenTrabajoResponse>(_ConsultarOrdenTrabajoResponse_QNAME, ConsultarOrdenTrabajoResponse.class, null, value);
    }

}
