/*
 * An XML document type.
 * Localname: right
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.RightDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one right(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface RightDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RightDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("right3401doctype");
    
    /**
     * Gets the "right" element
     */
    schemasMicrosoftComOfficeOffice.CTStrokeChild getRight();
    
    /**
     * Sets the "right" element
     */
    void setRight(schemasMicrosoftComOfficeOffice.CTStrokeChild right);
    
    /**
     * Appends and returns a new empty "right" element
     */
    schemasMicrosoftComOfficeOffice.CTStrokeChild addNewRight();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
