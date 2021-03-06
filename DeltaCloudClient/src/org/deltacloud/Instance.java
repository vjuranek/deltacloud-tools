//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.07.26 at 02:05:59 PM BST 
//


package org.deltacloud;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://www.deltacloud.org/deltacloud.xsd}name"/>
 *         &lt;element ref="{http://www.deltacloud.org/deltacloud.xsd}owner_id"/>
 *         &lt;element ref="{http://www.deltacloud.org/deltacloud.xsd}image"/>
 *         &lt;element ref="{http://www.deltacloud.org/deltacloud.xsd}hardware_profile"/>
 *         &lt;element ref="{http://www.deltacloud.org/deltacloud.xsd}realm"/>
 *         &lt;element ref="{http://www.deltacloud.org/deltacloud.xsd}state"/>
 *         &lt;element ref="{http://www.deltacloud.org/deltacloud.xsd}public_addresses"/>
 *         &lt;element ref="{http://www.deltacloud.org/deltacloud.xsd}private_addresses"/>
 *         &lt;element ref="{http://www.deltacloud.org/deltacloud.xsd}actions"/>
 *       &lt;/all>
 *       &lt;attribute ref="{http://www.deltacloud.org/deltacloud.xsd}href"/>
 *       &lt;attribute ref="{http://www.deltacloud.org/deltacloud.xsd}id"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "instance")
public class Instance {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "owner_id", required = true)
    protected String ownerId;
    @XmlElement(required = true)
    protected Image image;
    @XmlElement(name = "hardware_profile", required = true)
    protected HardwareProfile hardwareProfile;
    @XmlElement(required = true)
    protected Realm realm;
    @XmlElement(required = true)
    protected String state;
    @XmlElement(name = "public_addresses", required = true)
    protected PublicAddresses publicAddresses;
    @XmlElement(name = "private_addresses", required = true)
    protected PrivateAddresses privateAddresses;
    @XmlElement(required = true)
    protected Actions actions;
    @XmlAttribute(namespace = "http://www.deltacloud.org/deltacloud.xsd")
    protected String href;
    @XmlAttribute(namespace = "http://www.deltacloud.org/deltacloud.xsd")
    protected String id;

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
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerId(String value) {
        this.ownerId = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

    /**
     * Gets the value of the hardwareProfile property.
     * 
     * @return
     *     possible object is
     *     {@link HardwareProfile }
     *     
     */
    public HardwareProfile getHardwareProfile() {
        return hardwareProfile;
    }

    /**
     * Sets the value of the hardwareProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link HardwareProfile }
     *     
     */
    public void setHardwareProfile(HardwareProfile value) {
        this.hardwareProfile = value;
    }

    /**
     * Gets the value of the realm property.
     * 
     * @return
     *     possible object is
     *     {@link Realm }
     *     
     */
    public Realm getRealm() {
        return realm;
    }

    /**
     * Sets the value of the realm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Realm }
     *     
     */
    public void setRealm(Realm value) {
        this.realm = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the publicAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link PublicAddresses }
     *     
     */
    public PublicAddresses getPublicAddresses() {
        return publicAddresses;
    }

    /**
     * Sets the value of the publicAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicAddresses }
     *     
     */
    public void setPublicAddresses(PublicAddresses value) {
        this.publicAddresses = value;
    }

    /**
     * Gets the value of the privateAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateAddresses }
     *     
     */
    public PrivateAddresses getPrivateAddresses() {
        return privateAddresses;
    }

    /**
     * Sets the value of the privateAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateAddresses }
     *     
     */
    public void setPrivateAddresses(PrivateAddresses value) {
        this.privateAddresses = value;
    }

    /**
     * Gets the value of the actions property.
     * 
     * @return
     *     possible object is
     *     {@link Actions }
     *     
     */
    public Actions getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Actions }
     *     
     */
    public void setActions(Actions value) {
        this.actions = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
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
    
    public List<String> getActionNames()
    {
    	ArrayList<String> actions = new ArrayList<String>();
    	for(Link link : getActions().getLink())
    	{
    		actions.add(link.getRel());
    	}
    	return actions;
    }

}
