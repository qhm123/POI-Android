/*
 * An XML document type.
 * Localname: skew
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.SkewDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one skew(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class SkewDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.SkewDocument
{
    
    public SkewDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SKEW$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "skew");
    
    
    /**
     * Gets the "skew" element
     */
    public schemasMicrosoftComOfficeOffice.CTSkew getSkew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTSkew target = null;
            target = (schemasMicrosoftComOfficeOffice.CTSkew)get_store().find_element_user(SKEW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "skew" element
     */
    public void setSkew(schemasMicrosoftComOfficeOffice.CTSkew skew)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTSkew target = null;
            target = (schemasMicrosoftComOfficeOffice.CTSkew)get_store().find_element_user(SKEW$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTSkew)get_store().add_element_user(SKEW$0);
            }
            target.set(skew);
        }
    }
    
    /**
     * Appends and returns a new empty "skew" element
     */
    public schemasMicrosoftComOfficeOffice.CTSkew addNewSkew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTSkew target = null;
            target = (schemasMicrosoftComOfficeOffice.CTSkew)get_store().add_element_user(SKEW$0);
            return target;
        }
    }
}
