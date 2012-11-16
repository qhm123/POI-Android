/*
 * An XML document type.
 * Localname: arc
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.ArcDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * A document containing one arc(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface ArcDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArcDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("arcdb92doctype");
    
    /**
     * Gets the "arc" element
     */
    schemasMicrosoftComVml.CTArc getArc();
    
    /**
     * Sets the "arc" element
     */
    void setArc(schemasMicrosoftComVml.CTArc arc);
    
    /**
     * Appends and returns a new empty "arc" element
     */
    schemasMicrosoftComVml.CTArc addNewArc();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
