
package org.example.escuela;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.escuela package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.escuela
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AsignaturaRequest }
     * 
     */
    public AsignaturaRequest createAsignaturaRequest() {
        return new AsignaturaRequest();
    }

    /**
     * Create an instance of {@link AsignaturaResponse }
     * 
     */
    public AsignaturaResponse createAsignaturaResponse() {
        return new AsignaturaResponse();
    }

    /**
     * Create an instance of {@link AlumnoRequest }
     * 
     */
    public AlumnoRequest createAlumnoRequest() {
        return new AlumnoRequest();
    }

    /**
     * Create an instance of {@link AlumnoResponse }
     * 
     */
    public AlumnoResponse createAlumnoResponse() {
        return new AlumnoResponse();
    }

    /**
     * Create an instance of {@link EvaluacionRequest }
     * 
     */
    public EvaluacionRequest createEvaluacionRequest() {
        return new EvaluacionRequest();
    }

    /**
     * Create an instance of {@link EvaluacionResponse }
     * 
     */
    public EvaluacionResponse createEvaluacionResponse() {
        return new EvaluacionResponse();
    }

}
