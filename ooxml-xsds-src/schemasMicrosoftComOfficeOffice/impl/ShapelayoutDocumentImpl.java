/*
 * An XML document type.
 * Localname: shapelayout
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ShapelayoutDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one shapelayout(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class ShapelayoutDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.ShapelayoutDocument
{
    
    public ShapelayoutDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHAPELAYOUT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "shapelayout");
    
    
    /**
     * Gets the "shapelayout" element
     */
    public schemasMicrosoftComOfficeOffice.CTShapeLayout getShapelayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTShapeLayout target = null;
            target = (schemasMicrosoftComOfficeOffice.CTShapeLayout)get_store().find_element_user(SHAPELAYOUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "shapelayout" element
     */
    public void setShapelayout(schemasMicrosoftComOfficeOffice.CTShapeLayout shapelayout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTShapeLayout target = null;
            target = (schemasMicrosoftComOfficeOffice.CTShapeLayout)get_store().find_element_user(SHAPELAYOUT$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTShapeLayout)get_store().add_element_user(SHAPELAYOUT$0);
            }
            target.set(shapelayout);
        }
    }
    
    /**
     * Appends and returns a new empty "shapelayout" element
     */
    public schemasMicrosoftComOfficeOffice.CTShapeLayout addNewShapelayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTShapeLayout target = null;
            target = (schemasMicrosoftComOfficeOffice.CTShapeLayout)get_store().add_element_user(SHAPELAYOUT$0);
            return target;
        }
    }
}
