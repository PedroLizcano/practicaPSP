
package org.example.escuela;

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
 *         &lt;element name="nameasignatura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idasignatura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "nameasignatura",
    "idasignatura"
})
@XmlRootElement(name = "asignaturaRequest")
public class AsignaturaRequest {

    @XmlElement(required = true)
    protected String nameasignatura;
    @XmlElement(required = true)
    protected String idasignatura;

    /**
     * Obtiene el valor de la propiedad nameasignatura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameasignatura() {
        return nameasignatura;
    }

    /**
     * Define el valor de la propiedad nameasignatura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameasignatura(String value) {
        this.nameasignatura = value;
    }

    /**
     * Obtiene el valor de la propiedad idasignatura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdasignatura() {
        return idasignatura;
    }

    /**
     * Define el valor de la propiedad idasignatura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdasignatura(String value) {
        this.idasignatura = value;
    }

	@Override
	public String toString() {
		return "AsignaturaRequest [nameasignatura=" + nameasignatura + ", idasignatura=" + idasignatura + "]";
	}
    

}
