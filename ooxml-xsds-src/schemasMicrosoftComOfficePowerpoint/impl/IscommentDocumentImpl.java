/*
 * An XML document type.
 * Localname: iscomment
 * Namespace: urn:schemas-microsoft-com:office:powerpoint
 * Java type: schemasMicrosoftComOfficePowerpoint.IscommentDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficePowerpoint.impl;
/**
 * A document containing one iscomment(@urn:schemas-microsoft-com:office:powerpoint) element.
 *
 * This is a complex type.
 */
public class IscommentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficePowerpoint.IscommentDocument
{
    
    public IscommentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISCOMMENT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:powerpoint", "iscomment");
    
    
    /**
     * Gets the "iscomment" element
     */
    public schemasMicrosoftComOfficePowerpoint.CTEmpty getIscomment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficePowerpoint.CTEmpty target = null;
            target = (schemasMicrosoftComOfficePowerpoint.CTEmpty)get_store().find_element_user(ISCOMMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "iscomment" element
     */
    public void setIscomment(schemasMicrosoftComOfficePowerpoint.CTEmpty iscomment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficePowerpoint.CTEmpty target = null;
            target = (schemasMicrosoftComOfficePowerpoint.CTEmpty)get_store().find_element_user(ISCOMMENT$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficePowerpoint.CTEmpty)get_store().add_element_user(ISCOMMENT$0);
            }
            target.set(iscomment);
        }
    }
    
    /**
     * Appends and returns a new empty "iscomment" element
     */
    public schemasMicrosoftComOfficePowerpoint.CTEmpty addNewIscomment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficePowerpoint.CTEmpty target = null;
            target = (schemasMicrosoftComOfficePowerpoint.CTEmpty)get_store().add_element_user(ISCOMMENT$0);
            return target;
        }
    }
}
