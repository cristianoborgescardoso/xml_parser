//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.08.25 às 04:52:54 PM BRT 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}FlowStats"/>
 *         &lt;element ref="{}Ipv4FlowClassifier"/>
 *         &lt;element ref="{}Ipv6FlowClassifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flowStats",
    "ipv4FlowClassifier",
    "ipv6FlowClassifier"
})
@XmlRootElement(name = "FlowMonitor")
public class FlowMonitor {

    @XmlElement(name = "FlowStats", required = true)
    protected FlowStats flowStats;
    @XmlElement(name = "Ipv4FlowClassifier", required = true)
    protected Ipv4FlowClassifier ipv4FlowClassifier;
    @XmlElement(name = "Ipv6FlowClassifier", required = true)
    protected Ipv6FlowClassifier ipv6FlowClassifier;

    /**
     * Obtém o valor da propriedade flowStats.
     * 
     * @return
     *     possible object is
     *     {@link FlowStats }
     *     
     */
    public FlowStats getFlowStats() {
        return flowStats;
    }

    /**
     * Define o valor da propriedade flowStats.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowStats }
     *     
     */
    public void setFlowStats(FlowStats value) {
        this.flowStats = value;
    }

    /**
     * Obtém o valor da propriedade ipv4FlowClassifier.
     * 
     * @return
     *     possible object is
     *     {@link Ipv4FlowClassifier }
     *     
     */
    public Ipv4FlowClassifier getIpv4FlowClassifier() {
        return ipv4FlowClassifier;
    }

    /**
     * Define o valor da propriedade ipv4FlowClassifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Ipv4FlowClassifier }
     *     
     */
    public void setIpv4FlowClassifier(Ipv4FlowClassifier value) {
        this.ipv4FlowClassifier = value;
    }

    /**
     * Obtém o valor da propriedade ipv6FlowClassifier.
     * 
     * @return
     *     possible object is
     *     {@link Ipv6FlowClassifier }
     *     
     */
    public Ipv6FlowClassifier getIpv6FlowClassifier() {
        return ipv6FlowClassifier;
    }

    /**
     * Define o valor da propriedade ipv6FlowClassifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Ipv6FlowClassifier }
     *     
     */
    public void setIpv6FlowClassifier(Ipv6FlowClassifier value) {
        this.ipv6FlowClassifier = value;
    }

}
