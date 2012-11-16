/*
 * An XML document type.
 * Localname: anchorlock
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: schemasMicrosoftComOfficeWord.AnchorlockDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeWord.impl;
/**
 * A document containing one anchorlock(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public class AnchorlockDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeWord.AnchorlockDocument
{
    
    public AnchorlockDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANCHORLOCK$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:word", "anchorlock");
    
    
    /**
     * Gets the "anchorlock" element
     */
    public schemasMicrosoftComOfficeWord.CTAnchorLock getAnchorlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTAnchorLock target = null;
            target = (schemasMicrosoftComOfficeWord.CTAnchorLock)get_store().find_element_user(ANCHORLOCK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "anchorlock" element
     */
    public void setAnchorlock(schemasMicrosoftComOfficeWord.CTAnchorLock anchorlock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTAnchorLock target = null;
            target = (schemasMicrosoftComOfficeWord.CTAnchorLock)get_store().find_element_user(ANCHORLOCK$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeWord.CTAnchorLock)get_store().add_element_user(ANCHORLOCK$0);
            }
            target.set(anchorlock);
        }
    }
    
    /**
     * Appends and returns a new empty "anchorlock" element
     */
    public schemasMicrosoftComOfficeWord.CTAnchorLock addNewAnchorlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTAnchorLock target = null;
            target = (schemasMicrosoftComOfficeWord.CTAnchorLock)get_store().add_element_user(ANCHORLOCK$0);
            return target;
        }
    }
}
