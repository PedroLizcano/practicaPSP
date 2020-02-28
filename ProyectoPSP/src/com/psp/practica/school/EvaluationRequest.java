
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
 *         &lt;element name="DNIStudent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IdSubject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "dniStudent",
    "idSubject",
    "note"
})
@XmlRootElement(name = "EvaluationRequest")
public class EvaluationRequest {

    @XmlElement(name = "DNIStudent", required = true)
    protected String dniStudent;
    @XmlElement(name = "IdSubject", required = true)
    protected String idSubject;
    @XmlElement(name = "Note")
    protected int note;

    /**
     * Obtiene el valor de la propiedad dniStudent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNIStudent() {
        return dniStudent;
    }

    /**
     * Define el valor de la propiedad dniStudent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNIStudent(String value) {
        this.dniStudent = value;
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

    /**
     * Obtiene el valor de la propiedad note.
     * 
     */
    public int getNote() {
        return note;
    }

    /**
     * Define el valor de la propiedad note.
     * 
     */
    public void setNote(int value) {
        this.note = value;
    }

}
