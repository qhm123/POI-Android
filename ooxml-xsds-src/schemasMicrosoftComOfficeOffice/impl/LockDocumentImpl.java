/*
 * An XML document type.
 * Localname: lock
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.LockDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one lock(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class LockDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.LockDocument
{
    
    public LockDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCK$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "lock");
    
    
    /**
     * Gets the "lock" element
     */
    public schemasMicrosoftComOfficeOffice.CTLock getLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTLock target = null;
            target = (schemasMicrosoftComOfficeOffice.CTLock)get_store().find_element_user(LOCK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lock" element
     */
    public void setLock(schemasMicrosoftComOfficeOffice.CTLock lock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTLock target = null;
            target = (schemasMicrosoftComOfficeOffice.CTLock)get_store().find_element_user(LOCK$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTLock)get_store().add_element_user(LOCK$0);
            }
            target.set(lock);
        }
    }
    
    /**
     * Appends and returns a new empty "lock" element
     */
    public schemasMicrosoftComOfficeOffice.CTLock addNewLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTLock target = null;
            target = (schemasMicrosoftComOfficeOffice.CTLock)get_store().add_element_user(LOCK$0);
            return target;
        }
    }
}
