/*
 * An XML document type.
 * Localname: signatureline
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.SignaturelineDocument
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one signatureline(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class SignaturelineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.SignaturelineDocument
{
    
    public SignaturelineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGNATURELINE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "signatureline");
    
    
    /**
     * Gets the "signatureline" element
     */
    public schemasMicrosoftComOfficeOffice.CTSignatureLine getSignatureline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTSignatureLine target = null;
            target = (schemasMicrosoftComOfficeOffice.CTSignatureLine)get_store().find_element_user(SIGNATURELINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "signatureline" element
     */
    public void setSignatureline(schemasMicrosoftComOfficeOffice.CTSignatureLine signatureline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTSignatureLine target = null;
            target = (schemasMicrosoftComOfficeOffice.CTSignatureLine)get_store().find_element_user(SIGNATURELINE$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTSignatureLine)get_store().add_element_user(SIGNATURELINE$0);
            }
            target.set(signatureline);
        }
    }
    
    /**
     * Appends and returns a new empty "signatureline" element
     */
    public schemasMicrosoftComOfficeOffice.CTSignatureLine addNewSignatureline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTSignatureLine target = null;
            target = (schemasMicrosoftComOfficeOffice.CTSignatureLine)get_store().add_element_user(SIGNATURELINE$0);
            return target;
        }
    }
}
