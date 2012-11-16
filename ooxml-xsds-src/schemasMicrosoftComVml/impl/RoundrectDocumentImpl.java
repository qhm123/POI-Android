/*
 * An XML document type.
 * Localname: roundrect
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.RoundrectDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one roundrect(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class RoundrectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.RoundrectDocument
{
    
    public RoundrectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUNDRECT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "roundrect");
    
    
    /**
     * Gets the "roundrect" element
     */
    public schemasMicrosoftComVml.CTRoundRect getRoundrect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTRoundRect target = null;
            target = (schemasMicrosoftComVml.CTRoundRect)get_store().find_element_user(ROUNDRECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "roundrect" element
     */
    public void setRoundrect(schemasMicrosoftComVml.CTRoundRect roundrect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTRoundRect target = null;
            target = (schemasMicrosoftComVml.CTRoundRect)get_store().find_element_user(ROUNDRECT$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTRoundRect)get_store().add_element_user(ROUNDRECT$0);
            }
            target.set(roundrect);
        }
    }
    
    /**
     * Appends and returns a new empty "roundrect" element
     */
    public schemasMicrosoftComVml.CTRoundRect addNewRoundrect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTRoundRect target = null;
            target = (schemasMicrosoftComVml.CTRoundRect)get_store().add_element_user(ROUNDRECT$0);
            return target;
        }
    }
}
