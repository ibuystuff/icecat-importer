//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.07 at 03:02:30 PM CEST 
//


package com.christian.icecat.model.product;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Measure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Measure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Sign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Signs" type="{}Signs" minOccurs="0"/>
 *         &lt;element name="Names" type="{}Names" minOccurs="0"/>
 *         &lt;element name="Descriptions" type="{}Descriptions" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Sign" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Measure", propOrder = {

})
public class Measure {

    @XmlElement(name = "Sign")
    protected String signElement;
    @XmlElement(name = "Signs")
    protected Signs signs;
    @XmlElement(name = "Names")
    protected Names names;
    @XmlElement(name = "Descriptions")
    protected Descriptions descriptions;
    @XmlAttribute(name = "ID", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "Sign")
    protected String signAttribute;

    /**
     * Gets the value of the signElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignElement() {
        return signElement;
    }

    /**
     * Sets the value of the signElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignElement(String value) {
        this.signElement = value;
    }

    /**
     * Gets the value of the signs property.
     * 
     * @return
     *     possible object is
     *     {@link Signs }
     *     
     */
    public Signs getSigns() {
        return signs;
    }

    /**
     * Sets the value of the signs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Signs }
     *     
     */
    public void setSigns(Signs value) {
        this.signs = value;
    }

    /**
     * Gets the value of the names property.
     * 
     * @return
     *     possible object is
     *     {@link Names }
     *     
     */
    public Names getNames() {
        return names;
    }

    /**
     * Sets the value of the names property.
     * 
     * @param value
     *     allowed object is
     *     {@link Names }
     *     
     */
    public void setNames(Names value) {
        this.names = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Descriptions }
     *     
     */
    public Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descriptions }
     *     
     */
    public void setDescriptions(Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the signAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignAttribute() {
        return signAttribute;
    }

    /**
     * Sets the value of the signAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignAttribute(String value) {
        this.signAttribute = value;
    }

}
