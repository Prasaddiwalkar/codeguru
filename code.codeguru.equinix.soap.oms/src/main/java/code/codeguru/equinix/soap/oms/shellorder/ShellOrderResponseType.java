
package code.codeguru.equinix.soap.oms.shellorder;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShellOrderResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShellOrderResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderReferenceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShellOrderResponseType", propOrder = {
    "orderReferenceId",
    "orderNumber",
    "srNumber"
})
public class ShellOrderResponseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OrderReferenceId", required = true)
    protected String orderReferenceId;
    @XmlElement(name = "OrderNumber", required = true)
    protected String orderNumber;
    @XmlElement(name = "SRNumber", required = true)
    protected String srNumber;

    /**
     * Gets the value of the orderReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderReferenceId() {
        return orderReferenceId;
    }

    /**
     * Sets the value of the orderReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderReferenceId(String value) {
        this.orderReferenceId = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the srNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRNumber() {
        return srNumber;
    }

    /**
     * Sets the value of the srNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRNumber(String value) {
        this.srNumber = value;
    }

}
