/*
 * An XML document type.
 * Localname: oval
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.OvalDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one oval(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class OvalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.OvalDocument
{
    
    public OvalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OVAL$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "oval");
    
    
    /**
     * Gets the "oval" element
     */
    public schemasMicrosoftComVml.CTOval getOval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTOval target = null;
            target = (schemasMicrosoftComVml.CTOval)get_store().find_element_user(OVAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "oval" element
     */
    public void setOval(schemasMicrosoftComVml.CTOval oval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTOval target = null;
            target = (schemasMicrosoftComVml.CTOval)get_store().find_element_user(OVAL$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTOval)get_store().add_element_user(OVAL$0);
            }
            target.set(oval);
        }
    }
    
    /**
     * Appends and returns a new empty "oval" element
     */
    public schemasMicrosoftComVml.CTOval addNewOval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTOval target = null;
            target = (schemasMicrosoftComVml.CTOval)get_store().add_element_user(OVAL$0);
            return target;
        }
    }
}
