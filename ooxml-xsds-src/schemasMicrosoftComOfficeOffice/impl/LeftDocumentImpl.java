/*
 * An XML document type.
 * Localname: left
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.LeftDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one left(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class LeftDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.LeftDocument
{
    
    public LeftDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEFT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "left");
    
    
    /**
     * Gets the "left" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild getLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(LEFT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "left" element
     */
    public void setLeft(schemasMicrosoftComOfficeOffice.CTStrokeChild left)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(LEFT$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(LEFT$0);
            }
            target.set(left);
        }
    }
    
    /**
     * Appends and returns a new empty "left" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild addNewLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(LEFT$0);
            return target;
        }
    }
}
