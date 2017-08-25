//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.08.25 às 04:52:54 PM BRT 
//


package generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="delaySum" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="destinationAddress" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="destinationPort" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="flowId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="jitterSum" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="lostPackets" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="protocol" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="rxBytes" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="rxPackets" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="sourceAddress" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="sourcePort" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="throughput" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="txBytes" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="txPackets" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Flow")
public class Flow {

    @XmlAttribute(name = "delaySum")
    @XmlSchemaType(name = "anySimpleType")
    protected String delaySum;
    @XmlAttribute(name = "destinationAddress")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String destinationAddress;
    @XmlAttribute(name = "destinationPort")
    protected BigInteger destinationPort;
    @XmlAttribute(name = "flowId", required = true)
    protected BigInteger flowId;
    @XmlAttribute(name = "jitterSum")
    @XmlSchemaType(name = "anySimpleType")
    protected String jitterSum;
    @XmlAttribute(name = "lostPackets")
    protected BigInteger lostPackets;
    @XmlAttribute(name = "protocol")
    protected BigInteger protocol;
    @XmlAttribute(name = "rxBytes")
    protected BigInteger rxBytes;
    @XmlAttribute(name = "rxPackets")
    protected BigInteger rxPackets;
    @XmlAttribute(name = "sourceAddress")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String sourceAddress;
    @XmlAttribute(name = "sourcePort")
    protected BigInteger sourcePort;
    @XmlAttribute(name = "throughput")
    protected BigDecimal throughput;
    @XmlAttribute(name = "txBytes")
    protected BigInteger txBytes;
    @XmlAttribute(name = "txPackets")
    protected BigInteger txPackets;

    /**
     * Obtém o valor da propriedade delaySum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelaySum() {
        return delaySum;
    }

    /**
     * Define o valor da propriedade delaySum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelaySum(String value) {
        this.delaySum = value;
    }

    /**
     * Obtém o valor da propriedade destinationAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * Define o valor da propriedade destinationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAddress(String value) {
        this.destinationAddress = value;
    }

    /**
     * Obtém o valor da propriedade destinationPort.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDestinationPort() {
        return destinationPort;
    }

    /**
     * Define o valor da propriedade destinationPort.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDestinationPort(BigInteger value) {
        this.destinationPort = value;
    }

    /**
     * Obtém o valor da propriedade flowId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlowId() {
        return flowId;
    }

    /**
     * Define o valor da propriedade flowId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlowId(BigInteger value) {
        this.flowId = value;
    }

    /**
     * Obtém o valor da propriedade jitterSum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJitterSum() {
        return jitterSum;
    }

    /**
     * Define o valor da propriedade jitterSum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJitterSum(String value) {
        this.jitterSum = value;
    }

    /**
     * Obtém o valor da propriedade lostPackets.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLostPackets() {
        return lostPackets;
    }

    /**
     * Define o valor da propriedade lostPackets.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLostPackets(BigInteger value) {
        this.lostPackets = value;
    }

    /**
     * Obtém o valor da propriedade protocol.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProtocol() {
        return protocol;
    }

    /**
     * Define o valor da propriedade protocol.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProtocol(BigInteger value) {
        this.protocol = value;
    }

    /**
     * Obtém o valor da propriedade rxBytes.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRxBytes() {
        return rxBytes;
    }

    /**
     * Define o valor da propriedade rxBytes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRxBytes(BigInteger value) {
        this.rxBytes = value;
    }

    /**
     * Obtém o valor da propriedade rxPackets.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRxPackets() {
        return rxPackets;
    }

    /**
     * Define o valor da propriedade rxPackets.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRxPackets(BigInteger value) {
        this.rxPackets = value;
    }

    /**
     * Obtém o valor da propriedade sourceAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAddress() {
        return sourceAddress;
    }

    /**
     * Define o valor da propriedade sourceAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAddress(String value) {
        this.sourceAddress = value;
    }

    /**
     * Obtém o valor da propriedade sourcePort.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourcePort() {
        return sourcePort;
    }

    /**
     * Define o valor da propriedade sourcePort.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourcePort(BigInteger value) {
        this.sourcePort = value;
    }

    /**
     * Obtém o valor da propriedade throughput.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThroughput() {
        return throughput;
    }

    /**
     * Define o valor da propriedade throughput.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThroughput(BigDecimal value) {
        this.throughput = value;
    }

    /**
     * Obtém o valor da propriedade txBytes.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxBytes() {
        return txBytes;
    }

    /**
     * Define o valor da propriedade txBytes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxBytes(BigInteger value) {
        this.txBytes = value;
    }

    /**
     * Obtém o valor da propriedade txPackets.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTxPackets() {
        return txPackets;
    }

    /**
     * Define o valor da propriedade txPackets.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTxPackets(BigInteger value) {
        this.txPackets = value;
    }

}
