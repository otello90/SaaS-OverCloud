//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.27 at 03:11:18 PM KST 
//


package com.netmng.websvc.soap.parser.inter.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netmng.websvc.soap.parser.inter.topology.NSAType;
import com.netmng.websvc.soap.parser.inter.topology.NsiServiceType;


/**
 * <p>Java class for NetworkObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lifetime" type="{http://schemas.ogf.org/nml/2013/05/base#}LifeTimeType" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://schemas.ogf.org/nml/2013/05/base#}LocationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute ref="{http://schemas.ogf.org/nsi/2013/09/topology#}isReference"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkObject", propOrder = {
    "name",
    "lifetime",
    "location"
})
@XmlSeeAlso({
    PortGroupType.class,
    DeadaptationServiceType.class,
    TopologyType.class,
    LinkGroupType.class,
    BidirectionalLinkType.class,
    PortType.class,
    AdaptationServiceType.class,
    LinkType.class,
    NodeType.class,
    SwitchingServiceType.class,
    BidirectionalPortType.class,
    NSAType.class,
    NsiServiceType.class
})
public class NetworkObject {

    protected String name;
    @XmlElement(name = "Lifetime")
    protected LifeTimeType lifetime;
    @XmlElement(name = "Location")
    protected LocationType location;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlAttribute(name = "version")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar version;
    @XmlAttribute(name = "isReference", namespace = "http://schemas.ogf.org/nsi/2013/09/topology#")
    protected String isReference;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the lifetime property.
     * 
     * @return
     *     possible object is
     *     {@link LifeTimeType }
     *     
     */
    public LifeTimeType getLifetime() {
        return lifetime;
    }

    /**
     * Sets the value of the lifetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeTimeType }
     *     
     */
    public void setLifetime(LifeTimeType value) {
        this.lifetime = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersion(XMLGregorianCalendar value) {
        this.version = value;
    }

    /**
     * Gets the value of the isReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsReference() {
        return isReference;
    }

    /**
     * Sets the value of the isReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsReference(String value) {
        this.isReference = value;
    }

}
