/*
 * An XML document type.
 * Localname: ink
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.InkDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one ink(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class InkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.InkDocument
{
    
    public InkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INK$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "ink");
    
    
    /**
     * Gets the "ink" element
     */
    public schemasMicrosoftComOfficeOffice.CTInk getInk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTInk target = null;
            target = (schemasMicrosoftComOfficeOffice.CTInk)get_store().find_element_user(INK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ink" element
     */
    public void setInk(schemasMicrosoftComOfficeOffice.CTInk ink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTInk target = null;
            target = (schemasMicrosoftComOfficeOffice.CTInk)get_store().find_element_user(INK$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTInk)get_store().add_element_user(INK$0);
            }
            target.set(ink);
        }
    }
    
    /**
     * Appends and returns a new empty "ink" element
     */
    public schemasMicrosoftComOfficeOffice.CTInk addNewInk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTInk target = null;
            target = (schemasMicrosoftComOfficeOffice.CTInk)get_store().add_element_user(INK$0);
            return target;
        }
    }
}
