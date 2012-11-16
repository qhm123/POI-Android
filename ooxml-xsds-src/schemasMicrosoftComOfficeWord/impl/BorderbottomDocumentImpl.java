/*
 * An XML document type.
 * Localname: borderbottom
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: schemasMicrosoftComOfficeWord.BorderbottomDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeWord.impl;
/**
 * A document containing one borderbottom(@urn:schemas-microsoft-com:office:word) element.
 *
 * This is a complex type.
 */
public class BorderbottomDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeWord.BorderbottomDocument
{
    
    public BorderbottomDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BORDERBOTTOM$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:word", "borderbottom");
    
    
    /**
     * Gets the "borderbottom" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder getBorderbottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().find_element_user(BORDERBOTTOM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "borderbottom" element
     */
    public void setBorderbottom(schemasMicrosoftComOfficeWord.CTBorder borderbottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().find_element_user(BORDERBOTTOM$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().add_element_user(BORDERBOTTOM$0);
            }
            target.set(borderbottom);
        }
    }
    
    /**
     * Appends and returns a new empty "borderbottom" element
     */
    public schemasMicrosoftComOfficeWord.CTBorder addNewBorderbottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeWord.CTBorder target = null;
            target = (schemasMicrosoftComOfficeWord.CTBorder)get_store().add_element_user(BORDERBOTTOM$0);
            return target;
        }
    }
}
