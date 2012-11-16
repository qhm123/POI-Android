/*
 * An XML document type.
 * Localname: background
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.BackgroundDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one background(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class BackgroundDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.BackgroundDocument
{
    
    public BackgroundDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BACKGROUND$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "background");
    
    
    /**
     * Gets the "background" element
     */
    public schemasMicrosoftComVml.CTBackground getBackground()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTBackground target = null;
            target = (schemasMicrosoftComVml.CTBackground)get_store().find_element_user(BACKGROUND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "background" element
     */
    public void setBackground(schemasMicrosoftComVml.CTBackground background)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTBackground target = null;
            target = (schemasMicrosoftComVml.CTBackground)get_store().find_element_user(BACKGROUND$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTBackground)get_store().add_element_user(BACKGROUND$0);
            }
            target.set(background);
        }
    }
    
    /**
     * Appends and returns a new empty "background" element
     */
    public schemasMicrosoftComVml.CTBackground addNewBackground()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTBackground target = null;
            target = (schemasMicrosoftComVml.CTBackground)get_store().add_element_user(BACKGROUND$0);
            return target;
        }
    }
}
