/*
 * An XML document type.
 * Localname: clippath
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ClippathDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one clippath(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class ClippathDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.ClippathDocument
{
    
    public ClippathDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIPPATH$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "clippath");
    
    
    /**
     * Gets the "clippath" element
     */
    public schemasMicrosoftComOfficeOffice.CTClipPath getClippath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTClipPath target = null;
            target = (schemasMicrosoftComOfficeOffice.CTClipPath)get_store().find_element_user(CLIPPATH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clippath" element
     */
    public void setClippath(schemasMicrosoftComOfficeOffice.CTClipPath clippath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTClipPath target = null;
            target = (schemasMicrosoftComOfficeOffice.CTClipPath)get_store().find_element_user(CLIPPATH$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTClipPath)get_store().add_element_user(CLIPPATH$0);
            }
            target.set(clippath);
        }
    }
    
    /**
     * Appends and returns a new empty "clippath" element
     */
    public schemasMicrosoftComOfficeOffice.CTClipPath addNewClippath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTClipPath target = null;
            target = (schemasMicrosoftComOfficeOffice.CTClipPath)get_store().add_element_user(CLIPPATH$0);
            return target;
        }
    }
}
