/*
 * An XML document type.
 * Localname: line
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.LineDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one line(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class LineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.LineDocument
{
    
    public LineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "line");
    
    
    /**
     * Gets the "line" element
     */
    public schemasMicrosoftComVml.CTLine getLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTLine target = null;
            target = (schemasMicrosoftComVml.CTLine)get_store().find_element_user(LINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "line" element
     */
    public void setLine(schemasMicrosoftComVml.CTLine line)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTLine target = null;
            target = (schemasMicrosoftComVml.CTLine)get_store().find_element_user(LINE$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTLine)get_store().add_element_user(LINE$0);
            }
            target.set(line);
        }
    }
    
    /**
     * Appends and returns a new empty "line" element
     */
    public schemasMicrosoftComVml.CTLine addNewLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTLine target = null;
            target = (schemasMicrosoftComVml.CTLine)get_store().add_element_user(LINE$0);
            return target;
        }
    }
}
