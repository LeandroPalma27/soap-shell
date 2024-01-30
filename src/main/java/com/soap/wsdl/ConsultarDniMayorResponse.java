//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.01.29 a las 04:25:58 PM PET 
//


package com.soap.wsdl;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarDniMayorResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarDniMayorResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultadoDniMayor" type="{http://servicio.reniec.sgws.pnp.gob.pe/}resultadoReniecDni" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarDniMayorResponse", propOrder = {
    "resultadoDniMayor"
})
@XmlRootElement(name = "ConsultaDniMayorResponse")
public class ConsultarDniMayorResponse {

    protected ResultadoReniecDni resultadoDniMayor;

    /**
     * Obtiene el valor de la propiedad resultadoDniMayor.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoReniecDni }
     *     
     */
    public ResultadoReniecDni getResultadoDniMayor() {
        return resultadoDniMayor;
    }

    /**
     * Define el valor de la propiedad resultadoDniMayor.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoReniecDni }
     *     
     */
    public void setResultadoDniMayor(ResultadoReniecDni value) {
        this.resultadoDniMayor = value;
    }

}
