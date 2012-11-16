/*
 * An XML document type.
 * Localname: curve
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.CurveDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one curve(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class CurveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.CurveDocument
{
    
    public CurveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "curve");
    
    
    /**
     * Gets the "curve" element
     */
    public schemasMicrosoftComVml.CTCurve getCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTCurve target = null;
            target = (schemasMicrosoftComVml.CTCurve)get_store().find_element_user(CURVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "curve" element
     */
    public void setCurve(schemasMicrosoftComVml.CTCurve curve)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTCurve target = null;
            target = (schemasMicrosoftComVml.CTCurve)get_store().find_element_user(CURVE$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTCurve)get_store().add_element_user(CURVE$0);
            }
            target.set(curve);
        }
    }
    
    /**
     * Appends and returns a new empty "curve" element
     */
    public schemasMicrosoftComVml.CTCurve addNewCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTCurve target = null;
            target = (schemasMicrosoftComVml.CTCurve)get_store().add_element_user(CURVE$0);
            return target;
        }
    }
}
