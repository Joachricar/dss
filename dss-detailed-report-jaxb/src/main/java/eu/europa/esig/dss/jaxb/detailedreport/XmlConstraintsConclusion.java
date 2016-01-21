//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.21 at 09:07:54 PM CET 
//


package eu.europa.esig.dss.jaxb.detailedreport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstraintsConclusion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstraintsConclusion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Constraint" type="{http://dss.esig.europa.eu/validation/diagnostic}Constraint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Conclusion" type="{http://dss.esig.europa.eu/validation/diagnostic}Conclusion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintsConclusion", propOrder = {
    "constraint",
    "conclusion"
})
@XmlSeeAlso({
    XmlValidationProcessBasicSignatures.class,
    XmlPCV.class,
    XmlERV.class,
    XmlSAV.class,
    XmlXCV.class,
    XmlRFC.class,
    XmlVTS.class,
    XmlISC.class,
    XmlValidationProcessTimestamps.class,
    XmlValidationProcessLongTermData.class,
    XmlPSV.class,
    XmlCV.class,
    XmlValidationProcessArchivalData.class,
    XmlFC.class,
    XmlVCI.class
})
public class XmlConstraintsConclusion {

    @XmlElement(name = "Constraint")
    protected List<XmlConstraint> constraint;
    @XmlElement(name = "Conclusion", required = true)
    protected XmlConclusion conclusion;

    /**
     * Gets the value of the constraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlConstraint }
     * 
     * 
     */
    public List<XmlConstraint> getConstraint() {
        if (constraint == null) {
            constraint = new ArrayList<XmlConstraint>();
        }
        return this.constraint;
    }

    /**
     * Gets the value of the conclusion property.
     * 
     * @return
     *     possible object is
     *     {@link XmlConclusion }
     *     
     */
    public XmlConclusion getConclusion() {
        return conclusion;
    }

    /**
     * Sets the value of the conclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlConclusion }
     *     
     */
    public void setConclusion(XmlConclusion value) {
        this.conclusion = value;
    }

}
