
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
 *         &lt;element name="NameStudent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DNIStudent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AddressStudent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "nameStudent",
    "dniStudent",
    "addressStudent"
})
@XmlRootElement(name = "StudentRequest")
public class StudentRequest {

    @XmlElement(name = "NameStudent", required = true)
    protected String nameStudent;
    @XmlElement(name = "DNIStudent", required = true)
    protected String dniStudent;
    @XmlElement(name = "AddressStudent", required = true)
    protected String addressStudent;

    /**
     * Obtiene el valor de la propiedad nameStudent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameStudent() {
        return nameStudent;
    }

    /**
     * Define el valor de la propiedad nameStudent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameStudent(String value) {
        this.nameStudent = value;
    }

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
     * Obtiene el valor de la propiedad addressStudent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStudent() {
        return addressStudent;
    }

    /**
     * Define el valor de la propiedad addressStudent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStudent(String value) {
        this.addressStudent = value;
    }

	@Override
	public String toString() {
		return "StudentRequest [nameStudent=" + nameStudent + ", dniStudent=" + dniStudent + ", addressStudent="
				+ addressStudent + "]";
	}
    

}
