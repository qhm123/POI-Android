/*
 * An XML document type.
 * Localname: handles
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.HandlesDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one handles(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class HandlesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.HandlesDocument
{
    
    public HandlesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HANDLES$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "handles");
    
    
    /**
     * Gets the "handles" element
     */
    public schemasMicrosoftComVml.CTHandles getHandles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTHandles target = null;
            target = (schemasMicrosoftComVml.CTHandles)get_store().find_element_user(HANDLES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "handles" element
     */
    public void setHandles(schemasMicrosoftComVml.CTHandles handles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTHandles target = null;
            target = (schemasMicrosoftComVml.CTHandles)get_store().find_element_user(HANDLES$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTHandles)get_store().add_element_user(HANDLES$0);
            }
            target.set(handles);
        }
    }
    
    /**
     * Appends and returns a new empty "handles" element
     */
    public schemasMicrosoftComVml.CTHandles addNewHandles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTHandles target = null;
            target = (schemasMicrosoftComVml.CTHandles)get_store().add_element_user(HANDLES$0);
            return target;
        }
    }
}
