
package org.micomupu.ot.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para trabajo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="trabajo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="causaIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equipoIngreso" type="{http://service.ot.micomupu.org/}equipo" minOccurs="0"/>
 *         &lt;element name="fechaEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personaAtiende" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personaIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trabajo", propOrder = {
    "causaIngreso",
    "equipoIngreso",
    "fechaEntrega",
    "fechaIngreso",
    "personaAtiende",
    "personaIngreso"
})
public class Trabajo {

    protected String causaIngreso;
    protected Equipo equipoIngreso;
    protected String fechaEntrega;
    protected String fechaIngreso;
    protected String personaAtiende;
    protected String personaIngreso;

    /**
     * Obtiene el valor de la propiedad causaIngreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausaIngreso() {
        return causaIngreso;
    }

    /**
     * Define el valor de la propiedad causaIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausaIngreso(String value) {
        this.causaIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad equipoIngreso.
     * 
     * @return
     *     possible object is
     *     {@link Equipo }
     *     
     */
    public Equipo getEquipoIngreso() {
        return equipoIngreso;
    }

    /**
     * Define el valor de la propiedad equipoIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link Equipo }
     *     
     */
    public void setEquipoIngreso(Equipo value) {
        this.equipoIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Define el valor de la propiedad fechaEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEntrega(String value) {
        this.fechaEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIngreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Define el valor de la propiedad fechaIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaIngreso(String value) {
        this.fechaIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad personaAtiende.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaAtiende() {
        return personaAtiende;
    }

    /**
     * Define el valor de la propiedad personaAtiende.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaAtiende(String value) {
        this.personaAtiende = value;
    }

    /**
     * Obtiene el valor de la propiedad personaIngreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaIngreso() {
        return personaIngreso;
    }

    /**
     * Define el valor de la propiedad personaIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaIngreso(String value) {
        this.personaIngreso = value;
    }

}
