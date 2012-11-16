/*
 * An XML document type.
 * Localname: borderright
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: schemasMicrosoftComOfficeWord.BorderrightDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeWord.impl;
/**
 * A document containing one borderright(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public class BorderrightDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeWord.BorderrightDocument
{
    
    public BorderrightDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BORDERRIGHT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:word", "borderright");
    
    
    /**
     * Gets the "borderright" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder getBorderright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().find_element_user(BORDERRIGHT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "borderright" element
     */
    public void setBorderright(schemasMicrosoftComOfficeWord.CTBorder borderright)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().find_element_user(BORDERRIGHT$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().add_element_user(BORDERRIGHT$0);
            }
            target.set(borderright);
        }
    }
    
    /**
     * Appends and returns a new empty "borderright" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder addNewBorderright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().add_element_user(BORDERRIGHT$0);
            return target;
        }
    }
}
