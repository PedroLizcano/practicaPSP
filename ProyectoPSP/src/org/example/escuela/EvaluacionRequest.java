
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
 *         &lt;element name="DNIalumno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idasignatura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nota" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "dnIalumno",
    "idasignatura",
    "nota"
})
@XmlRootElement(name = "evaluacionRequest")
public class EvaluacionRequest {

    @XmlElement(name = "DNIalumno", required = true)
    protected String dnIalumno;
    @XmlElement(required = true)
    protected String idasignatura;
    protected int nota;

    /**
     * Obtiene el valor de la propiedad dnIalumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNIalumno() {
        return dnIalumno;
    }

    /**
     * Define el valor de la propiedad dnIalumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNIalumno(String value) {
        this.dnIalumno = value;
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

    /**
     * Obtiene el valor de la propiedad nota.
     * 
     */
    public int getNota() {
        return nota;
    }

    /**
     * Define el valor de la propiedad nota.
     * 
     */
    public void setNota(int value) {
        this.nota = value;
    }

	@Override
	public String toString() {
		return "EvaluacionRequest [dnIalumno=" + dnIalumno + ", idasignatura=" + idasignatura + ", nota=" + nota + "]";
	}
    

}
