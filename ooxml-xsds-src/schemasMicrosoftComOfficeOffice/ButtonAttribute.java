/*
 * An XML attribute type.
 * Localname: button
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ButtonAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one button(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public interface ButtonAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ButtonAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("button59dbattrtypetype");
    
    /**
     * Gets the "button" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getButton();
    
    /**
     * Gets (as xml) the "button" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse xgetButton();
    
    /**
     * True if has "button" attribute
     */
    boolean isSetButton();
    
    /**
     * Sets the "button" attribute
     */
    void setButton(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum button);
    
    /**
     * Sets (as xml) the "button" attribute
     */
    void xsetButton(schemasMicrosoftComOfficeOffice.STTrueFalse button);
    
    /**
     * Unsets the "button" attribute
     */
    void unsetButton();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
