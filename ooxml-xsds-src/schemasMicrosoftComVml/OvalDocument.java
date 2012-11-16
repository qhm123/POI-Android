/*
 * An XML document type.
 * Localname: oval
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.OvalDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * A document containing one oval(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface OvalDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OvalDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("oval1d24doctype");
    
    /**
     * Gets the "oval" element
     */
    schemasMicrosoftComVml.CTOval getOval();
    
    /**
     * Sets the "oval" element
     */
    void setOval(schemasMicrosoftComVml.CTOval oval);
    
    /**
     * Appends and returns a new empty "oval" element
     */
    schemasMicrosoftComVml.CTOval addNewOval();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
