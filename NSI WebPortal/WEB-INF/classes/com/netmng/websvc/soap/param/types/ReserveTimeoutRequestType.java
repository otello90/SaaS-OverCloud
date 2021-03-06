
package com.netmng.websvc.soap.param.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Type definition for the reserve timeout notification message.
 *                 This is an autonomous message issued from a Provider NSA to
 *                 a Requester NSA when a timeout on an existing reserve request
 *                 occurs and uncommitted resources have been freed. The type of
 *                 event is orignaated from a uPA, and propagated up the request
 *                 tree to the originating uRA.  Aggregator NSA will map the
 *                 received connectionId into a context understood by the next
 *                 parent NSA in the reuqest tree, then propagate the event
 *                 upwards.  The originating connectionId and NSA are provided in
 *                 separate elements to maintin the original context generating
 *                 the timeout.  The timeoutValue and timeStamp are populated
 *                 by the originating NSA and propagated up the tree untouched.
 *                 
 *                 Elements:
 * 
 *                 timeoutValue - The timeout value in seconds that expired this
 *                 reservation.
 *                 
 *                 originatingConnectionId - The connectionId that triggered the
 *                 reserve timeout.
 *                 
 *                 originatingNSA - The NSA originating the timeout event.
 *             
 * 
 * <p>ReserveTimeoutRequestType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ReserveTimeoutRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.ogf.org/nsi/2013/07/connection/types}NotificationBaseType">
 *       &lt;sequence>
 *         &lt;element name="timeoutValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="originatingConnectionId" type="{http://schemas.ogf.org/nsi/2013/07/framework/types}ConnectionIdType"/>
 *         &lt;element name="originatingNSA" type="{http://schemas.ogf.org/nsi/2013/07/framework/types}NsaIdType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReserveTimeoutRequestType", propOrder = {
    "timeoutValue",
    "originatingConnectionId",
    "originatingNSA"
})
public class ReserveTimeoutRequestType
    extends NotificationBaseType
{

    protected int timeoutValue;
    @XmlElement(required = true)
    protected String originatingConnectionId;
    @XmlElement(required = true)
    protected String originatingNSA;

    /**
     * timeoutValue 속성의 값을 가져옵니다.
     * 
     */
    public int getTimeoutValue() {
        return timeoutValue;
    }

    /**
     * timeoutValue 속성의 값을 설정합니다.
     * 
     */
    public void setTimeoutValue(int value) {
        this.timeoutValue = value;
    }

    /**
     * originatingConnectionId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingConnectionId() {
        return originatingConnectionId;
    }

    /**
     * originatingConnectionId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingConnectionId(String value) {
        this.originatingConnectionId = value;
    }

    /**
     * originatingNSA 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingNSA() {
        return originatingNSA;
    }

    /**
     * originatingNSA 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingNSA(String value) {
        this.originatingNSA = value;
    }

}
