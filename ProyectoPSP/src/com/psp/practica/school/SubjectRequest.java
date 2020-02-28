
package com.psp.practica.school;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NameSubject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IdSubject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nameSubject",
    "idSubject"
})
@XmlRootElement(name = "SubjectRequest")
public class SubjectRequest {

    @XmlElement(name = "NameSubject", required = true)
    protected String nameSubject;
    @XmlElement(name = "IdSubject", required = true)
    protected String idSubject;

    /**
     * Obtiene el valor de la propiedad nameSubject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSubject() {
        return nameSubject;
    }

    /**
     * Define el valor de la propiedad nameSubject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSubject(String value) {
        this.nameSubject = value;
    }

    /**
     * Obtiene el valor de la propiedad idSubject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSubject() {
        return idSubject;
    }

    /**
     * Define el valor de la propiedad idSubject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSubject(String value) {
        this.idSubject = value;
    }

}
