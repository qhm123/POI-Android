/*
 * XML Type:  CT_Ink
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTInk
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * An XML CT_Ink(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTInk extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTInk.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctink6f5ftype");
    
    /**
     * Gets the "i" attribute
     */
    byte[] getI();
    
    /**
     * Gets (as xml) the "i" attribute
     */
    org.apache.xmlbeans.XmlBase64Binary xgetI();
    
    /**
     * True if has "i" attribute
     */
    boolean isSetI();
    
    /**
     * Sets the "i" attribute
     */
    void setI(byte[] iValue);
    
    /**
     * Sets (as xml) the "i" attribute
     */
    void xsetI(org.apache.xmlbeans.XmlBase64Binary iValue);
    
    /**
     * Unsets the "i" attribute
     */
    void unsetI();
    
    /**
     * Gets the "annotation" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getAnnotation();
    
    /**
     * Gets (as xml) the "annotation" attribute
     */
    schemasMicrosoftComOfficeOffice.STTrueFalse xgetAnnotation();
    
    /**
     * True if has "annotation" attribute
     */
    boolean isSetAnnotation();
    
    /**
     * Sets the "annotation" attribute
     */
    void setAnnotation(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum annotation);
    
    /**
     * Sets (as xml) the "annotation" attribute
     */
    void xsetAnnotation(schemasMicrosoftComOfficeOffice.STTrueFalse annotation);
    
    /**
     * Unsets the "annotation" attribute
     */
    void unsetAnnotation();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
