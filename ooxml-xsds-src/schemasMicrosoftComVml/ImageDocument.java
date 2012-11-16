/*
 * An XML document type.
 * Localname: image
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.ImageDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * A document containing one image(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public interface ImageDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImageDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("imagec71bdoctype");
    
    /**
     * Gets the "image" element
     */
    schemasMicrosoftComVml.CTImage getImage();
    
    /**
     * Sets the "image" element
     */
    void setImage(schemasMicrosoftComVml.CTImage image);
    
    /**
     * Appends and returns a new empty "image" element
     */
    schemasMicrosoftComVml.CTImage addNewImage();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
