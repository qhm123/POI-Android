/*
 * An XML document type.
 * Localname: bordertop
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: schemasMicrosoftComOfficeWord.BordertopDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeWord.impl;
/**
 * A document containing one bordertop(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public class BordertopDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeWord.BordertopDocument
{
    
    public BordertopDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BORDERTOP$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:word", "bordertop");
    
    
    /**
     * Gets the "bordertop" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder getBordertop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().find_element_user(BORDERTOP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "bordertop" element
     */
    public void setBordertop(schemasMicrosoftComOfficeWord.CTBorder bordertop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().find_element_user(BORDERTOP$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().add_element_user(BORDERTOP$0);
            }
            target.set(bordertop);
        }
    }
    
    /**
     * Appends and returns a new empty "bordertop" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder addNewBordertop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().add_element_user(BORDERTOP$0);
            return target;
        }
    }
}
