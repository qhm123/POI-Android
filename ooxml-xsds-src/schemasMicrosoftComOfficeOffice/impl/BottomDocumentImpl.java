/*
 * An XML document type.
 * Localname: bottom
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.BottomDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one bottom(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class BottomDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.BottomDocument
{
    
    public BottomDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOTTOM$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "bottom");
    
    
    /**
     * Gets the "bottom" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild getBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(BOTTOM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "bottom" element
     */
    public void setBottom(schemasMicrosoftComOfficeOffice.CTStrokeChild bottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(BOTTOM$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(BOTTOM$0);
            }
            target.set(bottom);
        }
    }
    
    /**
     * Appends and returns a new empty "bottom" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild addNewBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(BOTTOM$0);
            return target;
        }
    }
}
