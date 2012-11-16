/*
 * An XML document type.
 * Localname: callout
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CalloutDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one callout(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class CalloutDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CalloutDocument
{
    
    public CalloutDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLOUT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "callout");
    
    
    /**
     * Gets the "callout" element
     */
    public schemasMicrosoftComOfficeOffice.CTCallout getCallout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTCallout target = null;
            target = (schemasMicrosoftComOfficeOffice.CTCallout)get_store().find_element_user(CALLOUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "callout" element
     */
    public void setCallout(schemasMicrosoftComOfficeOffice.CTCallout callout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTCallout target = null;
            target = (schemasMicrosoftComOfficeOffice.CTCallout)get_store().find_element_user(CALLOUT$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTCallout)get_store().add_element_user(CALLOUT$0);
            }
            target.set(callout);
        }
    }
    
    /**
     * Appends and returns a new empty "callout" element
     */
    public schemasMicrosoftComOfficeOffice.CTCallout addNewCallout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTCallout target = null;
            target = (schemasMicrosoftComOfficeOffice.CTCallout)get_store().add_element_user(CALLOUT$0);
            return target;
        }
    }
}
