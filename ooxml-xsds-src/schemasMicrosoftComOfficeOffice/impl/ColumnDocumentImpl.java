/*
 * An XML document type.
 * Localname: column
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ColumnDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one column(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class ColumnDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.ColumnDocument
{
    
    public ColumnDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMN$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "column");
    
    
    /**
     * Gets the "column" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild getColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(COLUMN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "column" element
     */
    public void setColumn(schemasMicrosoftComOfficeOffice.CTStrokeChild column)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().find_element_user(COLUMN$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(COLUMN$0);
            }
            target.set(column);
        }
    }
    
    /**
     * Appends and returns a new empty "column" element
     */
    public schemasMicrosoftComOfficeOffice.CTStrokeChild addNewColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTStrokeChild target = null;
            target = (schemasMicrosoftComOfficeOffice.CTStrokeChild)get_store().add_element_user(COLUMN$0);
            return target;
        }
    }
}
