/*
 * An XML document type.
 * Localname: textbox
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.TextboxDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one textbox(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class TextboxDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.TextboxDocument
{
    
    public TextboxDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTBOX$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "textbox");
    
    
    /**
     * Gets the "textbox" element
     */
    public schemasMicrosoftComVml.CTTextbox getTextbox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTTextbox target = null;
            target = (schemasMicrosoftComVml.CTTextbox)get_store().find_element_user(TEXTBOX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "textbox" element
     */
    public void setTextbox(schemasMicrosoftComVml.CTTextbox textbox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTTextbox target = null;
            target = (schemasMicrosoftComVml.CTTextbox)get_store().find_element_user(TEXTBOX$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTTextbox)get_store().add_element_user(TEXTBOX$0);
            }
            target.set(textbox);
        }
    }
    
    /**
     * Appends and returns a new empty "textbox" element
     */
    public schemasMicrosoftComVml.CTTextbox addNewTextbox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTTextbox target = null;
            target = (schemasMicrosoftComVml.CTTextbox)get_store().add_element_user(TEXTBOX$0);
            return target;
        }
    }
}
