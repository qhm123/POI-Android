/*
 * An XML document type.
 * Localname: borderleft
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: schemasMicrosoftComOfficeWord.BorderleftDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeWord.impl;
/**
 * A document containing one borderleft(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public class BorderleftDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeWord.BorderleftDocument
{
    
    public BorderleftDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BORDERLEFT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:word", "borderleft");
    
    
    /**
     * Gets the "borderleft" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder getBorderleft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().find_element_user(BORDERLEFT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "borderleft" element
     */
    public void setBorderleft(schemasMicrosoftComOfficeWord.CTBorder borderleft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().find_element_user(BORDERLEFT$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().add_element_user(BORDERLEFT$0);
            }
            target.set(borderleft);
        }
    }
    
    /**
     * Appends and returns a new empty "borderleft" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder addNewBorderleft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().add_element_user(BORDERLEFT$0);
            return target;
        }
    }
}
