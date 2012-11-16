/*
 * An XML document type.
 * Localname: fill
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.FillDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one fill(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class FillDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.FillDocument
{
    
    public FillDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILL$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "fill");
    
    
    /**
     * Gets the "fill" element
     */
    public schemasMicrosoftComVml.CTFill getFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTFill target = null;
            target = (schemasMicrosoftComVml.CTFill)get_store().find_element_user(FILL$0, 0);
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
    public void setFill(schemasMicrosoftComVml.CTFill fill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTFill target = null;
            target = (schemasMicrosoftComVml.CTFill)get_store().find_element_user(FILL$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTFill)get_store().add_element_user(FILL$0);
            }
            target.set(fill);
        }
    }
    
    /**
     * Appends and returns a new empty "fill" element
     */
    public schemasMicrosoftComVml.CTFill addNewFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTFill target = null;
            target = (schemasMicrosoftComVml.CTFill)get_store().add_element_user(FILL$0);
            return target;
        }
    }
}
