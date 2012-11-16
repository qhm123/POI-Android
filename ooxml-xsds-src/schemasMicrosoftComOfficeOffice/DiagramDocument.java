/*
 * An XML document type.
 * Localname: diagram
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.DiagramDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice;


/**
 * A document containing one diagram(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface DiagramDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DiagramDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("diagram31f8doctype");
    
    /**
     * Gets the "diagram" element
     */
    schemasMicrosoftComOfficeOffice.CTDiagram getDiagram();
    
    /**
     * Sets the "diagram" element
     */
    void setDiagram(schemasMicrosoftComOfficeOffice.CTDiagram diagram);
    
    /**
     * Appends and returns a new empty "diagram" element
     */
    schemasMicrosoftComOfficeOffice.CTDiagram addNewDiagram();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
