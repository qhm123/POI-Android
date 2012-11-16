/*
 * An XML document type.
 * Localname: stroke
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.StrokeDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one stroke(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class StrokeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.StrokeDocument
{
    
    public StrokeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STROKE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "stroke");
    
    
    /**
     * Gets the "stroke" element
     */
    public schemasMicrosoftComVml.CTStroke getStroke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTStroke target = null;
            target = (schemasMicrosoftComVml.CTStroke)get_store().find_element_user(STROKE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "stroke" element
     */
    public void setStroke(schemasMicrosoftComVml.CTStroke stroke)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTStroke target = null;
            target = (schemasMicrosoftComVml.CTStroke)get_store().find_element_user(STROKE$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTStroke)get_store().add_element_user(STROKE$0);
            }
            target.set(stroke);
        }
    }
    
    /**
     * Appends and returns a new empty "stroke" element
     */
    public schemasMicrosoftComVml.CTStroke addNewStroke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTStroke target = null;
            target = (schemasMicrosoftComVml.CTStroke)get_store().add_element_user(STROKE$0);
            return target;
        }
    }
}
