/*
 * An XML document type.
 * Localname: arc
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.ArcDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one arc(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class ArcDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.ArcDocument
{
    
    public ArcDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARC$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "arc");
    
    
    /**
     * Gets the "arc" element
     */
    public schemasMicrosoftComVml.CTArc getArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTArc target = null;
            target = (schemasMicrosoftComVml.CTArc)get_store().find_element_user(ARC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "arc" element
     */
    public void setArc(schemasMicrosoftComVml.CTArc arc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTArc target = null;
            target = (schemasMicrosoftComVml.CTArc)get_store().find_element_user(ARC$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTArc)get_store().add_element_user(ARC$0);
            }
            target.set(arc);
        }
    }
    
    /**
     * Appends and returns a new empty "arc" element
     */
    public schemasMicrosoftComVml.CTArc addNewArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTArc target = null;
            target = (schemasMicrosoftComVml.CTArc)get_store().add_element_user(ARC$0);
            return target;
        }
    }
}
