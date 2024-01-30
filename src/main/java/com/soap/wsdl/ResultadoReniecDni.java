//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.01.29 a las 04:25:58 PM PET 
//


package com.soap.wsdl;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultadoReniecDni complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultadoReniecDni"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="materno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departamentoDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="provinciaDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="distritoDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localidadDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccionDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gradoInstruccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departamentoNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="provinciaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="distritoNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombrePadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="constanciaVotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restricciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="caducidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcionMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foto" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="firma" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultadoReniecDni", propOrder = {
    "dni",
    "paterno",
    "materno",
    "nombres",
    "departamentoDomicilio",
    "provinciaDomicilio",
    "distritoDomicilio",
    "localidadDomicilio",
    "direccionDomicilio",
    "estadoCivil",
    "gradoInstruccion",
    "estatura",
    "sexo",
    "departamentoNacimiento",
    "provinciaNacimiento",
    "distritoNacimiento",
    "fechaNacimiento",
    "nombrePadre",
    "nombreMadre",
    "fechaInscripcion",
    "fechaExpedicion",
    "constanciaVotacion",
    "restricciones",
    "caducidad",
    "estadoo",
    "codigoMensaje",
    "descripcionMensaje",
    "foto",
    "firma"
})
public class ResultadoReniecDni {

    protected String dni;
    protected String paterno;
    protected String materno;
    protected String nombres;
    protected String departamentoDomicilio;
    protected String provinciaDomicilio;
    protected String distritoDomicilio;
    protected String localidadDomicilio;
    protected String direccionDomicilio;
    protected String estadoCivil;
    protected String gradoInstruccion;
    protected String estatura;
    protected String sexo;
    protected String departamentoNacimiento;
    protected String provinciaNacimiento;
    protected String distritoNacimiento;
    protected String fechaNacimiento;
    protected String nombrePadre;
    protected String nombreMadre;
    protected String fechaInscripcion;
    protected String fechaExpedicion;
    protected String constanciaVotacion;
    protected String restricciones;
    protected String caducidad;
    protected String estadoo;
    protected String codigoMensaje;
    protected String descripcionMensaje;
    protected byte[] foto;
    protected byte[] firma;

    /**
     * Obtiene el valor de la propiedad dni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDni() {
        return dni;
    }

    /**
     * Define el valor de la propiedad dni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDni(String value) {
        this.dni = value;
    }

    /**
     * Obtiene el valor de la propiedad paterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaterno() {
        return paterno;
    }

    /**
     * Define el valor de la propiedad paterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaterno(String value) {
        this.paterno = value;
    }

    /**
     * Obtiene el valor de la propiedad materno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterno() {
        return materno;
    }

    /**
     * Define el valor de la propiedad materno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterno(String value) {
        this.materno = value;
    }

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad departamentoDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamentoDomicilio() {
        return departamentoDomicilio;
    }

    /**
     * Define el valor de la propiedad departamentoDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamentoDomicilio(String value) {
        this.departamentoDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinciaDomicilio() {
        return provinciaDomicilio;
    }

    /**
     * Define el valor de la propiedad provinciaDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinciaDomicilio(String value) {
        this.provinciaDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad distritoDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistritoDomicilio() {
        return distritoDomicilio;
    }

    /**
     * Define el valor de la propiedad distritoDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistritoDomicilio(String value) {
        this.distritoDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad localidadDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidadDomicilio() {
        return localidadDomicilio;
    }

    /**
     * Define el valor de la propiedad localidadDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidadDomicilio(String value) {
        this.localidadDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    /**
     * Define el valor de la propiedad direccionDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionDomicilio(String value) {
        this.direccionDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Define el valor de la propiedad estadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCivil(String value) {
        this.estadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad gradoInstruccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradoInstruccion() {
        return gradoInstruccion;
    }

    /**
     * Define el valor de la propiedad gradoInstruccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradoInstruccion(String value) {
        this.gradoInstruccion = value;
    }

    /**
     * Obtiene el valor de la propiedad estatura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstatura() {
        return estatura;
    }

    /**
     * Define el valor de la propiedad estatura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstatura(String value) {
        this.estatura = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad departamentoNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamentoNacimiento() {
        return departamentoNacimiento;
    }

    /**
     * Define el valor de la propiedad departamentoNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamentoNacimiento(String value) {
        this.departamentoNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinciaNacimiento() {
        return provinciaNacimiento;
    }

    /**
     * Define el valor de la propiedad provinciaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinciaNacimiento(String value) {
        this.provinciaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad distritoNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistritoNacimiento() {
        return distritoNacimiento;
    }

    /**
     * Define el valor de la propiedad distritoNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistritoNacimiento(String value) {
        this.distritoNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePadre() {
        return nombrePadre;
    }

    /**
     * Define el valor de la propiedad nombrePadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePadre(String value) {
        this.nombrePadre = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreMadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreMadre() {
        return nombreMadre;
    }

    /**
     * Define el valor de la propiedad nombreMadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreMadre(String value) {
        this.nombreMadre = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    /**
     * Define el valor de la propiedad fechaInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInscripcion(String value) {
        this.fechaInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Define el valor de la propiedad fechaExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicion(String value) {
        this.fechaExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad constanciaVotacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstanciaVotacion() {
        return constanciaVotacion;
    }

    /**
     * Define el valor de la propiedad constanciaVotacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstanciaVotacion(String value) {
        this.constanciaVotacion = value;
    }

    /**
     * Obtiene el valor de la propiedad restricciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestricciones() {
        return restricciones;
    }

    /**
     * Define el valor de la propiedad restricciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestricciones(String value) {
        this.restricciones = value;
    }

    /**
     * Obtiene el valor de la propiedad caducidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaducidad() {
        return caducidad;
    }

    /**
     * Define el valor de la propiedad caducidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaducidad(String value) {
        this.caducidad = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoo() {
        return estadoo;
    }

    /**
     * Define el valor de la propiedad estadoo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoo(String value) {
        this.estadoo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMensaje() {
        return codigoMensaje;
    }

    /**
     * Define el valor de la propiedad codigoMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMensaje(String value) {
        this.codigoMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMensaje() {
        return descripcionMensaje;
    }

    /**
     * Define el valor de la propiedad descripcionMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMensaje(String value) {
        this.descripcionMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad foto.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFoto() {
        return foto;
    }

    /**
     * Define el valor de la propiedad foto.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFoto(byte[] value) {
        this.foto = value;
    }

    /**
     * Obtiene el valor de la propiedad firma.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFirma() {
        return firma;
    }

    /**
     * Define el valor de la propiedad firma.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFirma(byte[] value) {
        this.firma = value;
    }

}
