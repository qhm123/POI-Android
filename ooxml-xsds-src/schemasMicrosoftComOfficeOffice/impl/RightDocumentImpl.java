/*
 * An XML document type.
 * Localname: right
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.RightDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one right(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class RightDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.RightDocument
{
    
    public RightDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RIGHT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "right");
    
    
    /**
     * Gets the "right" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild getRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(RIGHT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "right" element
     */
    public void setRight(schemasMicrosoftComOfficeOffice.CTStrokeChild right)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(RIGHT$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(RIGHT$0);
            }
            target.set(right);
        }
    }
    
    /**
     * Appends and returns a new empty "right" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild addNewRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(RIGHT$0);
            return target;
        }
    }
}
