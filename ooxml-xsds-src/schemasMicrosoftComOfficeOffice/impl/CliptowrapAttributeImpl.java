/*
 * An XML attribute type.
 * Localname: cliptowrap
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CliptowrapAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one cliptowrap(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class CliptowrapAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CliptowrapAttribute
{
    
    public CliptowrapAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIPTOWRAP$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "cliptowrap");
    
    
    /**
     * Gets the "cliptowrap" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getCliptowrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIPTOWRAP$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "cliptowrap" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetCliptowrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(CLIPTOWRAP$0);
            return target;
        }
    }
    
    /**
     * True if has "cliptowrap" attribute
     */
    public boolean isSetCliptowrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLIPTOWRAP$0) != null;
        }
    }
    
    /**
     * Sets the "cliptowrap" attribute
     */
    public void setCliptowrap(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum cliptowrap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIPTOWRAP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIPTOWRAP$0);
            }
            target.setEnumValue(cliptowrap);
        }
    }
    
    /**
     * Sets (as xml) the "cliptowrap" attribute
     */
    public void xsetCliptowrap(schemasMicrosoftComOfficeOffice.STTrueFalse cliptowrap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(CLIPTOWRAP$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(CLIPTOWRAP$0);
            }
            target.set(cliptowrap);
        }
    }
    
    /**
     * Unsets the "cliptowrap" attribute
     */
    public void unsetCliptowrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLIPTOWRAP$0);
        }
    }
}
