/*
 * An XML document type.
 * Localname: rect
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.RectDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one rect(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class RectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.RectDocument
{
    
    public RectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "rect");
    
    
    /**
     * Gets the "rect" element
     */
    public schemasMicrosoftComVml.CTRect getRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTRect target = null;
            target = (schemasMicrosoftComVml.CTRect)get_store().find_element_user(RECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rect" element
     */
    public void setRect(schemasMicrosoftComVml.CTRect rect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTRect target = null;
            target = (schemasMicrosoftComVml.CTRect)get_store().find_element_user(RECT$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTRect)get_store().add_element_user(RECT$0);
            }
            target.set(rect);
        }
    }
    
    /**
     * Appends and returns a new empty "rect" element
     */
    public schemasMicrosoftComVml.CTRect addNewRect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTRect target = null;
            target = (schemasMicrosoftComVml.CTRect)get_store().add_element_user(RECT$0);
            return target;
        }
    }
}
