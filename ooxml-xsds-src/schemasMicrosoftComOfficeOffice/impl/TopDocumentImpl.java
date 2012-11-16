/*
 * An XML document type.
 * Localname: top
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.TopDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one top(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class TopDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.TopDocument
{
    
    public TopDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOP$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "top");
    
    
    /**
     * Gets the "top" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild getTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(TOP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "top" element
     */
    public void setTop(schemasMicrosoftComOfficeOffice.CTStrokeChild top)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(TOP$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(TOP$0);
            }
            target.set(top);
        }
    }
    
    /**
     * Appends and returns a new empty "top" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild addNewTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(TOP$0);
            return target;
        }
    }
}
