//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.06 at 03:11:12 PM KST 
//


package com.netmng.websvc.soap.svc.services.point2point;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netmng.websvc.soap.svc.services.types.DirectionalityType;
import com.netmng.websvc.soap.svc.services.types.StpListType;
import com.netmng.websvc.soap.svc.services.types.StpType;


/**
 * 
 *                 Type defining a generic point-to-point service specification.
 *                 At the moment this type supports a unidirectional or symmetric
 *                 bidirectional service.
 *                 
 *                 Elements:
 *                 
 *                 capacity - Capacity of the service in Mb/s.
 *                 
 *                 directionality - The (uni or bi) directionality of the service.
 *                 
 *                 symmetricPath - An indication that both directions of a bidirectional
 *                 circuit must fallow the same path.  Only applicable when
 *                 directionality is "Bidirectional".  If not specified then value
 *                 is assumed to be false.
 *                 
 *                 sourceSTP - Source STP of the service.
 *                 
 *                 destSTP - Destination STP of the service.
 *                 
 *                 ero - Hop-by-hop ordered list of STP from sourceSTP to
 *                 destSTP. List does not include sourceSTP and destSTP.
 *             
 * 
 * <p>Java class for P2PServiceBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P2PServiceBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="directionality" type="{http://schemas.ogf.org/nsi/2013/07/services/types}DirectionalityType"/>
 *         &lt;element name="symmetricPath" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sourceSTP" type="{http://schemas.ogf.org/nsi/2013/07/services/types}StpType"/>
 *         &lt;element name="destSTP" type="{http://schemas.ogf.org/nsi/2013/07/services/types}StpType"/>
 *         &lt;element name="ero" type="{http://schemas.ogf.org/nsi/2013/07/services/types}StpListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P2PServiceBaseType", propOrder = {
    "capacity",
    "directionality",
    "symmetricPath",
    "sourceSTP",
    "destSTP",
    "ero"
})
@XmlSeeAlso({
    EthernetBaseType.class
})
public class P2PServiceBaseType {

    protected long capacity;
    @XmlElement(required = true, defaultValue = "Bidirectional")
    protected DirectionalityType directionality;
    protected Boolean symmetricPath;
    @XmlElement(required = true)
    protected StpType sourceSTP;
    @XmlElement(required = true)
    protected StpType destSTP;
    protected StpListType ero;

    /**
     * Gets the value of the capacity property.
     * 
     */
    public long getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     */
    public void setCapacity(long value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the directionality property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionalityType }
     *     
     */
    public DirectionalityType getDirectionality() {
        return directionality;
    }

    /**
     * Sets the value of the directionality property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionalityType }
     *     
     */
    public void setDirectionality(DirectionalityType value) {
        this.directionality = value;
    }

    /**
     * Gets the value of the symmetricPath property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSymmetricPath() {
        return symmetricPath;
    }

    /**
     * Sets the value of the symmetricPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSymmetricPath(Boolean value) {
        this.symmetricPath = value;
    }

    /**
     * Gets the value of the sourceSTP property.
     * 
     * @return
     *     possible object is
     *     {@link StpType }
     *     
     */
    public StpType getSourceSTP() {
        return sourceSTP;
    }

    /**
     * Sets the value of the sourceSTP property.
     * 
     * @param value
     *     allowed object is
     *     {@link StpType }
     *     
     */
    public void setSourceSTP(StpType value) {
        this.sourceSTP = value;
    }

    /**
     * Gets the value of the destSTP property.
     * 
     * @return
     *     possible object is
     *     {@link StpType }
     *     
     */
    public StpType getDestSTP() {
        return destSTP;
    }

    /**
     * Sets the value of the destSTP property.
     * 
     * @param value
     *     allowed object is
     *     {@link StpType }
     *     
     */
    public void setDestSTP(StpType value) {
        this.destSTP = value;
    }

    /**
     * Gets the value of the ero property.
     * 
     * @return
     *     possible object is
     *     {@link StpListType }
     *     
     */
    public StpListType getEro() {
        return ero;
    }

    /**
     * Sets the value of the ero property.
     * 
     * @param value
     *     allowed object is
     *     {@link StpListType }
     *     
     */
    public void setEro(StpListType value) {
        this.ero = value;
    }

}
