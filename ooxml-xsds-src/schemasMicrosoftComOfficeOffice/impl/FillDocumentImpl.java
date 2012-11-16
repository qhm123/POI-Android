/*
 * An XML document type.
 * Localname: fill
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.FillDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one fill(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class FillDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.FillDocument
{
    
    public FillDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILL$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "fill");
    
    
    /**
     * Gets the "fill" element
     */
    public schemasMicrosoftComOfficeOffice.CTFill getFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTFill target = null;
            target = (schemasMicrosoftComOfficeOffice.CTFill)get_store().find_element_user(FILL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fill" element
     */
    public void setFill(schemasMicrosoftComOfficeOffice.CTFill fill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTFill target = null;
            target = (schemasMicrosoftComOfficeOffice.CTFill)get_store().find_element_user(FILL$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTFill)get_store().add_element_user(FILL$0);
            }
            target.set(fill);
        }
    }
    
    /**
     * Appends and returns a new empty "fill" element
     */
    public schemasMicrosoftComOfficeOffice.CTFill addNewFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTFill target = null;
            target = (schemasMicrosoftComOfficeOffice.CTFill)get_store().add_element_user(FILL$0);
            return target;
        }
    }
}
