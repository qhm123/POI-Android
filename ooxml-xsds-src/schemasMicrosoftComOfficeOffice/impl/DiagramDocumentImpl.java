/*
 * An XML document type.
 * Localname: diagram
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.DiagramDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one diagram(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class DiagramDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.DiagramDocument
{
    
    public DiagramDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIAGRAM$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "diagram");
    
    
    /**
     * Gets the "diagram" element
     */
    public schemasMicrosoftComOfficeOffice.CTDiagram getDiagram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTDiagram target = null;
            target = (schemasMicrosoftComOfficeOffice.CTDiagram)get_store().find_element_user(DIAGRAM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "diagram" element
     */
    public void setDiagram(schemasMicrosoftComOfficeOffice.CTDiagram diagram)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTDiagram target = null;
            target = (schemasMicrosoftComOfficeOffice.CTDiagram)get_store().find_element_user(DIAGRAM$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTDiagram)get_store().add_element_user(DIAGRAM$0);
            }
            target.set(diagram);
        }
    }
    
    /**
     * Appends and returns a new empty "diagram" element
     */
    public schemasMicrosoftComOfficeOffice.CTDiagram addNewDiagram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTDiagram target = null;
            target = (schemasMicrosoftComOfficeOffice.CTDiagram)get_store().add_element_user(DIAGRAM$0);
            return target;
        }
    }
}
