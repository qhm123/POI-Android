/*
 * An XML document type.
 * Localname: OLEObject
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.OLEObjectDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one OLEObject(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class OLEObjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.OLEObjectDocument
{
    
    public OLEObjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OLEOBJECT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "OLEObject");
    
    
    /**
     * Gets the "OLEObject" element
     */
    public schemasMicrosoftComOfficeOffice.CTOLEObject getOLEObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTOLEObject target = null;
            target = (schemasMicrosoftComOfficeOffice.CTOLEObject)get_store().find_element_user(OLEOBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OLEObject" element
     */
    public void setOLEObject(schemasMicrosoftComOfficeOffice.CTOLEObject oleObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTOLEObject target = null;
            target = (schemasMicrosoftComOfficeOffice.CTOLEObject)get_store().find_element_user(OLEOBJECT$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTOLEObject)get_store().add_element_user(OLEOBJECT$0);
            }
            target.set(oleObject);
        }
    }
    
    /**
     * Appends and returns a new empty "OLEObject" element
     */
    public schemasMicrosoftComOfficeOffice.CTOLEObject addNewOLEObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTOLEObject target = null;
            target = (schemasMicrosoftComOfficeOffice.CTOLEObject)get_store().add_element_user(OLEOBJECT$0);
            return target;
        }
    }
}
