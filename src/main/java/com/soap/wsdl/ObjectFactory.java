//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.01.29 a las 04:25:58 PM PET 
//


package com.soap.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dirsapol.registro.wsdl package. 
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

    private final static QName _ConsultarDniMayor_QNAME = new QName("http://servicio.reniec.sgws.pnp.gob.pe/", "consultarDniMayor");
    private final static QName _ConsultarDniMayorResponse_QNAME = new QName("http://servicio.reniec.sgws.pnp.gob.pe/", "consultarDniMayorResponse");
    private final static QName _ConsultarDniMenor_QNAME = new QName("http://servicio.reniec.sgws.pnp.gob.pe/", "consultarDniMenor");
    private final static QName _ConsultarDniMenorResponse_QNAME = new QName("http://servicio.reniec.sgws.pnp.gob.pe/", "consultarDniMenorResponse");
    private final static QName _ConsultarNombreMayores_QNAME = new QName("http://servicio.reniec.sgws.pnp.gob.pe/", "consultarNombreMayores");
    private final static QName _ConsultarNombreMayoresResponse_QNAME = new QName("http://servicio.reniec.sgws.pnp.gob.pe/", "consultarNombreMayoresResponse");
    private final static QName _ConsultarNombreMenores_QNAME = new QName("http://servicio.reniec.sgws.pnp.gob.pe/", "consultarNombreMenores");
    private final static QName _ConsultarNombreMenoresResponse_QNAME = new QName("http://servicio.reniec.sgws.pnp.gob.pe/", "consultarNombreMenoresResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dirsapol.registro.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarDniMayor }
     * 
     */
    public ConsultarDniMayor createConsultarDniMayor() {
        return new ConsultarDniMayor();
    }

    /**
     * Create an instance of {@link ConsultarDniMayorResponse }
     * 
     */
    public ConsultarDniMayorResponse createConsultarDniMayorResponse() {
        return new ConsultarDniMayorResponse();
    }

    /**
     * Create an instance of {@link ConsultarDniMenor }
     * 
     */
    public ConsultarDniMenor createConsultarDniMenor() {
        return new ConsultarDniMenor();
    }

    /**
     * Create an instance of {@link ConsultarDniMenorResponse }
     * 
     */
    public ConsultarDniMenorResponse createConsultarDniMenorResponse() {
        return new ConsultarDniMenorResponse();
    }

    /**
     * Create an instance of {@link ConsultarNombreMayores }
     * 
     */
    public ConsultarNombreMayores createConsultarNombreMayores() {
        return new ConsultarNombreMayores();
    }

    /**
     * Create an instance of {@link ConsultarNombreMayoresResponse }
     * 
     */
    public ConsultarNombreMayoresResponse createConsultarNombreMayoresResponse() {
        return new ConsultarNombreMayoresResponse();
    }

    /**
     * Create an instance of {@link ConsultarNombreMenores }
     * 
     */
    public ConsultarNombreMenores createConsultarNombreMenores() {
        return new ConsultarNombreMenores();
    }

    /**
     * Create an instance of {@link ConsultarNombreMenoresResponse }
     * 
     */
    public ConsultarNombreMenoresResponse createConsultarNombreMenoresResponse() {
        return new ConsultarNombreMenoresResponse();
    }

    /**
     * Create an instance of {@link ResultadoReniecDni }
     * 
     */
    public ResultadoReniecDni createResultadoReniecDni() {
        return new ResultadoReniecDni();
    }

    /**
     * Create an instance of {@link ResultadoReniecNombre }
     * 
     */
    public ResultadoReniecNombre createResultadoReniecNombre() {
        return new ResultadoReniecNombre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarDniMayor }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarDniMayor }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicio.reniec.sgws.pnp.gob.pe/", name = "consultarDniMayor")
    public JAXBElement<ConsultarDniMayor> createConsultarDniMayor(ConsultarDniMayor value) {
        return new JAXBElement<ConsultarDniMayor>(_ConsultarDniMayor_QNAME, ConsultarDniMayor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarDniMayorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarDniMayorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicio.reniec.sgws.pnp.gob.pe/", name = "consultarDniMayorResponse")
    public JAXBElement<ConsultarDniMayorResponse> createConsultarDniMayorResponse(ConsultarDniMayorResponse value) {
        return new JAXBElement<ConsultarDniMayorResponse>(_ConsultarDniMayorResponse_QNAME, ConsultarDniMayorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarDniMenor }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarDniMenor }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicio.reniec.sgws.pnp.gob.pe/", name = "consultarDniMenor")
    public JAXBElement<ConsultarDniMenor> createConsultarDniMenor(ConsultarDniMenor value) {
        return new JAXBElement<ConsultarDniMenor>(_ConsultarDniMenor_QNAME, ConsultarDniMenor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarDniMenorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarDniMenorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicio.reniec.sgws.pnp.gob.pe/", name = "consultarDniMenorResponse")
    public JAXBElement<ConsultarDniMenorResponse> createConsultarDniMenorResponse(ConsultarDniMenorResponse value) {
        return new JAXBElement<ConsultarDniMenorResponse>(_ConsultarDniMenorResponse_QNAME, ConsultarDniMenorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarNombreMayores }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarNombreMayores }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicio.reniec.sgws.pnp.gob.pe/", name = "consultarNombreMayores")
    public JAXBElement<ConsultarNombreMayores> createConsultarNombreMayores(ConsultarNombreMayores value) {
        return new JAXBElement<ConsultarNombreMayores>(_ConsultarNombreMayores_QNAME, ConsultarNombreMayores.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarNombreMayoresResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarNombreMayoresResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicio.reniec.sgws.pnp.gob.pe/", name = "consultarNombreMayoresResponse")
    public JAXBElement<ConsultarNombreMayoresResponse> createConsultarNombreMayoresResponse(ConsultarNombreMayoresResponse value) {
        return new JAXBElement<ConsultarNombreMayoresResponse>(_ConsultarNombreMayoresResponse_QNAME, ConsultarNombreMayoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarNombreMenores }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarNombreMenores }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicio.reniec.sgws.pnp.gob.pe/", name = "consultarNombreMenores")
    public JAXBElement<ConsultarNombreMenores> createConsultarNombreMenores(ConsultarNombreMenores value) {
        return new JAXBElement<ConsultarNombreMenores>(_ConsultarNombreMenores_QNAME, ConsultarNombreMenores.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarNombreMenoresResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarNombreMenoresResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servicio.reniec.sgws.pnp.gob.pe/", name = "consultarNombreMenoresResponse")
    public JAXBElement<ConsultarNombreMenoresResponse> createConsultarNombreMenoresResponse(ConsultarNombreMenoresResponse value) {
        return new JAXBElement<ConsultarNombreMenoresResponse>(_ConsultarNombreMenoresResponse_QNAME, ConsultarNombreMenoresResponse.class, null, value);
    }

}
