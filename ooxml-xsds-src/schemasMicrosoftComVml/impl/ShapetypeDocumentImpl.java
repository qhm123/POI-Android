/*
 * An XML document type.
 * Localname: shapetype
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.ShapetypeDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one shapetype(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class ShapetypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.ShapetypeDocument
{
    
    public ShapetypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHAPETYPE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "shapetype");
    
    
    /**
     * Gets the "shapetype" element
     */
    public schemasMicrosoftComVml.CTShapetype getShapetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShapetype target = null;
            target = (schemasMicrosoftComVml.CTShapetype)get_store().find_element_user(SHAPETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "shapetype" element
     */
    public void setShapetype(schemasMicrosoftComVml.CTShapetype shapetype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShapetype target = null;
            target = (schemasMicrosoftComVml.CTShapetype)get_store().find_element_user(SHAPETYPE$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTShapetype)get_store().add_element_user(SHAPETYPE$0);
            }
            target.set(shapetype);
        }
    }
    
    /**
     * Appends and returns a new empty "shapetype" element
     */
    public schemasMicrosoftComVml.CTShapetype addNewShapetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTShapetype target = null;
            target = (schemasMicrosoftComVml.CTShapetype)get_store().add_element_user(SHAPETYPE$0);
            return target;
        }
    }
}
