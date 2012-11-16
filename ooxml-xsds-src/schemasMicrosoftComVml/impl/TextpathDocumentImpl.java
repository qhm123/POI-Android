/*
 * An XML document type.
 * Localname: textpath
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.TextpathDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one textpath(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class TextpathDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.TextpathDocument
{
    
    public TextpathDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTPATH$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "textpath");
    
    
    /**
     * Gets the "textpath" element
     */
    public schemasMicrosoftComVml.CTTextPath getTextpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTTextPath target = null;
            target = (schemasMicrosoftComVml.CTTextPath)get_store().find_element_user(TEXTPATH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "textpath" element
     */
    public void setTextpath(schemasMicrosoftComVml.CTTextPath textpath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTTextPath target = null;
            target = (schemasMicrosoftComVml.CTTextPath)get_store().find_element_user(TEXTPATH$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTTextPath)get_store().add_element_user(TEXTPATH$0);
            }
            target.set(textpath);
        }
    }
    
    /**
     * Appends and returns a new empty "textpath" element
     */
    public schemasMicrosoftComVml.CTTextPath addNewTextpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTTextPath target = null;
            target = (schemasMicrosoftComVml.CTTextPath)get_store().add_element_user(TEXTPATH$0);
            return target;
        }
    }
}
