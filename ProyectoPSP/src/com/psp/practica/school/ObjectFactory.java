
package com.psp.practica.school;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.psp.practica.school package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.psp.practica.school
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubjectRequest }
     * 
     */
    public SubjectRequest createSubjectRequest() {
        return new SubjectRequest();
    }

    /**
     * Create an instance of {@link SubjectResponse }
     * 
     */
    public SubjectResponse createSubjectResponse() {
        return new SubjectResponse();
    }

    /**
     * Create an instance of {@link StudentRequest }
     * 
     */
    public StudentRequest createStudentRequest() {
        return new StudentRequest();
    }

    /**
     * Create an instance of {@link StudentResponse }
     * 
     */
    public StudentResponse createStudentResponse() {
        return new StudentResponse();
    }

    /**
     * Create an instance of {@link EvaluationRequest }
     * 
     */
    public EvaluationRequest createEvaluationRequest() {
        return new EvaluationRequest();
    }

    /**
     * Create an instance of {@link EvaluationResponse }
     * 
     */
    public EvaluationResponse createEvaluationResponse() {
        return new EvaluationResponse();
    }

}
