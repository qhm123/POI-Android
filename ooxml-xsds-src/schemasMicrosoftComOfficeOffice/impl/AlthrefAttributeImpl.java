/*
 * An XML attribute type.
 * Localname: althref
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.AlthrefAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one althref(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class AlthrefAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.AlthrefAttribute
{
    
    public AlthrefAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTHREF$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "althref");
    
    
    /**
     * Gets the "althref" attribute
     */
    public java.lang.String getAlthref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALTHREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "althref" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAlthref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALTHREF$0);
            return target;
        }
    }
    
    /**
     * True if has "althref" attribute
     */
    public boolean isSetAlthref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALTHREF$0) != null;
        }
    }
    
    /**
     * Sets the "althref" attribute
     */
    public void setAlthref(java.lang.String althref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALTHREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALTHREF$0);
            }
            target.setStringValue(althref);
        }
    }
    
    /**
     * Sets (as xml) the "althref" attribute
     */
    public void xsetAlthref(org.apache.xmlbeans.XmlString althref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALTHREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ALTHREF$0);
            }
            target.set(althref);
        }
    }
    
    /**
     * Unsets the "althref" attribute
     */
    public void unsetAlthref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALTHREF$0);
        }
    }
}
