/*
 * An XML document type.
 * Localname: extrusion
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ExtrusionDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one extrusion(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class ExtrusionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.ExtrusionDocument
{
    
    public ExtrusionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTRUSION$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "extrusion");
    
    
    /**
     * Gets the "extrusion" element
     */
    public schemasMicrosoftComOfficeOffice.CTExtrusion getExtrusion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTExtrusion target = null;
            target = (schemasMicrosoftComOfficeOffice.CTExtrusion)get_store().find_element_user(EXTRUSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "extrusion" element
     */
    public void setExtrusion(schemasMicrosoftComOfficeOffice.CTExtrusion extrusion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTExtrusion target = null;
            target = (schemasMicrosoftComOfficeOffice.CTExtrusion)get_store().find_element_user(EXTRUSION$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTExtrusion)get_store().add_element_user(EXTRUSION$0);
            }
            target.set(extrusion);
        }
    }
    
    /**
     * Appends and returns a new empty "extrusion" element
     */
    public schemasMicrosoftComOfficeOffice.CTExtrusion addNewExtrusion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTExtrusion target = null;
            target = (schemasMicrosoftComOfficeOffice.CTExtrusion)get_store().add_element_user(EXTRUSION$0);
            return target;
        }
    }
}
