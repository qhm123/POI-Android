/*
 * An XML document type.
 * Localname: polyline
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.PolylineDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * A document containing one polyline(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class PolylineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.PolylineDocument
{
    
    public PolylineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYLINE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "polyline");
    
    
    /**
     * Gets the "polyline" element
     */
    public schemasMicrosoftComVml.CTPolyLine getPolyline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTPolyLine target = null;
            target = (schemasMicrosoftComVml.CTPolyLine)get_store().find_element_user(POLYLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "polyline" element
     */
    public void setPolyline(schemasMicrosoftComVml.CTPolyLine polyline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTPolyLine target = null;
            target = (schemasMicrosoftComVml.CTPolyLine)get_store().find_element_user(POLYLINE$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.CTPolyLine)get_store().add_element_user(POLYLINE$0);
            }
            target.set(polyline);
        }
    }
    
    /**
     * Appends and returns a new empty "polyline" element
     */
    public schemasMicrosoftComVml.CTPolyLine addNewPolyline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.CTPolyLine target = null;
            target = (schemasMicrosoftComVml.CTPolyLine)get_store().add_element_user(POLYLINE$0);
            return target;
        }
    }
}
