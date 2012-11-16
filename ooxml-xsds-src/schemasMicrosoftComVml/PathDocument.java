/*
 * An XML document type.
 * Localname: path
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.PathDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * A document containing one path(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface PathDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PathDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("path11b7doctype");
    
    /**
     * Gets the "path" element
     */
    schemasMicrosoftComVml.CTPath getPath();
    
    /**
     * Sets the "path" element
     */
    void setPath(schemasMicrosoftComVml.CTPath path);
    
    /**
     * Appends and returns a new empty "path" element
     */
    schemasMicrosoftComVml.CTPath addNewPath();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
