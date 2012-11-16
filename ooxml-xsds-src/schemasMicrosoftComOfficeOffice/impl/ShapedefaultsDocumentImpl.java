/*
 * An XML document type.
 * Localname: shapedefaults
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ShapedefaultsDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one shapedefaults(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class ShapedefaultsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.ShapedefaultsDocument
{
    
    public ShapedefaultsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHAPEDEFAULTS$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "shapedefaults");
    
    
    /**
     * Gets the "shapedefaults" element
     */
    public schemasMicrosoftComOfficeOffice.CTShapeDefaults getShapedefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTShapeDefaults target = null;
            target = (schemasMicrosoftComOfficeOffice.CTShapeDefaults)get_store().find_element_user(SHAPEDEFAULTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "shapedefaults" element
     */
    public void setShapedefaults(schemasMicrosoftComOfficeOffice.CTShapeDefaults shapedefaults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTShapeDefaults target = null;
            target = (schemasMicrosoftComOfficeOffice.CTShapeDefaults)get_store().find_element_user(SHAPEDEFAULTS$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTShapeDefaults)get_store().add_element_user(SHAPEDEFAULTS$0);
            }
            target.set(shapedefaults);
        }
    }
    
    /**
     * Appends and returns a new empty "shapedefaults" element
     */
    public schemasMicrosoftComOfficeOffice.CTShapeDefaults addNewShapedefaults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTShapeDefaults target = null;
            target = (schemasMicrosoftComOfficeOffice.CTShapeDefaults)get_store().add_element_user(SHAPEDEFAULTS$0);
            return target;
        }
    }
}
