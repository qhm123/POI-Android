/*
 * An XML document type.
 * Localname: wrap
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: schemasMicrosoftComOfficeWord.WrapDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeWord.impl;
/**
 * A document containing one wrap(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public class WrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeWord.WrapDocument
{
    
    public WrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WRAP$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:word", "wrap");
    
    
    /**
     * Gets the "wrap" element
     */
    public schemasMicrosoftComOfficeWord.CTWrap getWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTWrap target = null;
            target = (schemasMicrosoftComOfficeWord.CTWrap)get_store().find_element_user(WRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wrap" element
     */
    public void setWrap(schemasMicrosoftComOfficeWord.CTWrap wrap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTWrap target = null;
            target = (schemasMicrosoftComOfficeWord.CTWrap)get_store().find_element_user(WRAP$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeWord.CTWrap)get_store().add_element_user(WRAP$0);
            }
            target.set(wrap);
        }
    }
    
    /**
     * Appends and returns a new empty "wrap" element
     */
    public schemasMicrosoftComOfficeWord.CTWrap addNewWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTWrap target = null;
            target = (schemasMicrosoftComOfficeWord.CTWrap)get_store().add_element_user(WRAP$0);
            return target;
        }
    }
}
