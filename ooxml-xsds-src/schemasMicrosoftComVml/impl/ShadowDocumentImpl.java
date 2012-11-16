/*
 * An XML document type.
 * Localname: shadow
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.ShadowDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one shadow(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class ShadowDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.ShadowDocument
{
    
    public ShadowDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHADOW$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "shadow");
    
    
    /**
     * Gets the "shadow" element
     */
    public schemasMicrosoftComVml.CTShadow getShadow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShadow target = null;
            target = (schemasMicrosoftComVml.CTShadow)get_store().find_element_user(SHADOW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "shadow" element
     */
    public void setShadow(schemasMicrosoftComVml.CTShadow shadow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShadow target = null;
            target = (schemasMicrosoftComVml.CTShadow)get_store().find_element_user(SHADOW$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTShadow)get_store().add_element_user(SHADOW$0);
            }
            target.set(shadow);
        }
    }
    
    /**
     * Appends and returns a new empty "shadow" element
     */
    public schemasMicrosoftComVml.CTShadow addNewShadow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShadow target = null;
            target = (schemasMicrosoftComVml.CTShadow)get_store().add_element_user(SHADOW$0);
            return target;
        }
    }
}
