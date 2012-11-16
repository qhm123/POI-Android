/*
 * An XML document type.
 * Localname: shape
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.ShapeDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one shape(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class ShapeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.ShapeDocument
{
    
    public ShapeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHAPE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "shape");
    
    
    /**
     * Gets the "shape" element
     */
    public schemasMicrosoftComVml.CTShape getShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShape target = null;
            target = (schemasMicrosoftComVml.CTShape)get_store().find_element_user(SHAPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "shape" element
     */
    public void setShape(schemasMicrosoftComVml.CTShape shape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShape target = null;
            target = (schemasMicrosoftComVml.CTShape)get_store().find_element_user(SHAPE$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTShape)get_store().add_element_user(SHAPE$0);
            }
            target.set(shape);
        }
    }
    
    /**
     * Appends and returns a new empty "shape" element
     */
    public schemasMicrosoftComVml.CTShape addNewShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShape target = null;
            target = (schemasMicrosoftComVml.CTShape)get_store().add_element_user(SHAPE$0);
            return target;
        }
    }
}
