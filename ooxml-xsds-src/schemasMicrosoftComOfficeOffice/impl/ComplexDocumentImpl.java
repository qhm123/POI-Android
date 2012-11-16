/*
 * An XML document type.
 * Localname: complex
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ComplexDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one complex(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class ComplexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.ComplexDocument
{
    
    public ComplexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLEX$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "complex");
    
    
    /**
     * Gets the "complex" element
     */
    public schemasMicrosoftComOfficeOffice.CTComplex getComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTComplex target = null;
            target = (schemasMicrosoftComOfficeOffice.CTComplex)get_store().find_element_user(COMPLEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "complex" element
     */
    public void setComplex(schemasMicrosoftComOfficeOffice.CTComplex complex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTComplex target = null;
            target = (schemasMicrosoftComOfficeOffice.CTComplex)get_store().find_element_user(COMPLEX$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTComplex)get_store().add_element_user(COMPLEX$0);
            }
            target.set(complex);
        }
    }
    
    /**
     * Appends and returns a new empty "complex" element
     */
    public schemasMicrosoftComOfficeOffice.CTComplex addNewComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTComplex target = null;
            target = (schemasMicrosoftComOfficeOffice.CTComplex)get_store().add_element_user(COMPLEX$0);
            return target;
        }
    }
}
