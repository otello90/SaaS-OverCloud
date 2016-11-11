
package com.netmng.websvc.soap.param.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Type definition for the reserveConfirmed message. A Provider NSA
 *                 sends this positive reserveRequest response to the Requester NSA
 *                 that issued the original request message.
 *                 
 *                 Elements:
 *                 
 *                 connectionId - The Provider NSA assigned connectionId for this
 *                 reservation. This value will be unique within the context
 *                 of the Provider NSA.
 *                 
 *                 globalReservationId - An optional global reservation id that can be
 *                 used to correlate individual related service reservations through
 *                 the network. This must be populated with a Universally Unique
 *                 Identifier (UUID) URN as per ITU-T Rec. X.667 | ISO/IEC 9834-8:2005
 *                 and IETF RFC 4122.
 *                 
 *                 description - An optional description for the service reservation.
 *                 
 *                 criteria - A set of versioned reservation criteria information.
 *             
 * 
 * <p>ReserveConfirmedType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ReserveConfirmedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectionId" type="{http://schemas.ogf.org/nsi/2013/07/framework/types}ConnectionIdType"/>
 *         &lt;element name="globalReservationId" type="{http://schemas.ogf.org/nsi/2013/07/connection/types}GlobalReservationIdType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="criteria" type="{http://schemas.ogf.org/nsi/2013/07/connection/types}ReservationConfirmCriteriaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReserveConfirmedType", propOrder = {
    "connectionId",
    "globalReservationId",
    "description",
    "criteria"
})
public class ReserveConfirmedType {

    @XmlElement(required = true)
    protected String connectionId;
    protected String globalReservationId;
    protected String description;
    @XmlElement(required = true)
    protected ReservationConfirmCriteriaType criteria;

    /**
     * connectionId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * connectionId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionId(String value) {
        this.connectionId = value;
    }

    /**
     * globalReservationId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalReservationId() {
        return globalReservationId;
    }

    /**
     * globalReservationId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalReservationId(String value) {
        this.globalReservationId = value;
    }

    /**
     * description 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * description 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * criteria 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ReservationConfirmCriteriaType }
     *     
     */
    public ReservationConfirmCriteriaType getCriteria() {
        return criteria;
    }

    /**
     * criteria 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationConfirmCriteriaType }
     *     
     */
    public void setCriteria(ReservationConfirmCriteriaType value) {
        this.criteria = value;
    }

}
