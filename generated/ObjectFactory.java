//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.08.25 às 04:52:54 PM BRT 
//


package generated;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FlowStats }
     * 
     */
    public FlowStats createFlowStats() {
        return new FlowStats();
    }

    /**
     * Create an instance of {@link Flow }
     * 
     */
    public Flow createFlow() {
        return new Flow();
    }

    /**
     * Create an instance of {@link Ipv4FlowClassifier }
     * 
     */
    public Ipv4FlowClassifier createIpv4FlowClassifier() {
        return new Ipv4FlowClassifier();
    }

    /**
     * Create an instance of {@link FlowMonitor }
     * 
     */
    public FlowMonitor createFlowMonitor() {
        return new FlowMonitor();
    }

    /**
     * Create an instance of {@link Ipv6FlowClassifier }
     * 
     */
    public Ipv6FlowClassifier createIpv6FlowClassifier() {
        return new Ipv6FlowClassifier();
    }

}
