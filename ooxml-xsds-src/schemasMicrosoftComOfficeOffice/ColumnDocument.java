/*
 * An XML document type.
 * Localname: column
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ColumnDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one column(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface ColumnDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ColumnDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("column37cddoctype");
    
    /**
     * Gets the "column" element
     */
    schemasMicrosoftComOfficeOffice.CTStrokeChild getColumn();
    
    /**
     * Sets the "column" element
     */
    void setColumn(schemasMicrosoftComOfficeOffice.CTStrokeChild column);
    
    /**
     * Appends and returns a new empty "column" element
     */
    schemasMicrosoftComOfficeOffice.CTStrokeChild addNewColumn();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
