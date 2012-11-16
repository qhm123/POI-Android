/*
 * An XML attribute type.
 * Localname: regroupid
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.RegroupidAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one regroupid(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class RegroupidAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.RegroupidAttribute
{
    
    public RegroupidAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGROUPID$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "regroupid");
    
    
    /**
     * Gets the "regroupid" attribute
     */
    public java.math.BigInteger getRegroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REGROUPID$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "regroupid" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetRegroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REGROUPID$0);
            return target;
        }
    }
    
    /**
     * True if has "regroupid" attribute
     */
    public boolean isSetRegroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REGROUPID$0) != null;
        }
    }
    
    /**
     * Sets the "regroupid" attribute
     */
    public void setRegroupid(java.math.BigInteger regroupid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REGROUPID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REGROUPID$0);
            }
            target.setBigIntegerValue(regroupid);
        }
    }
    
    /**
     * Sets (as xml) the "regroupid" attribute
     */
    public void xsetRegroupid(org.apache.xmlbeans.XmlInteger regroupid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(REGROUPID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(REGROUPID$0);
            }
            target.set(regroupid);
        }
    }
    
    /**
     * Unsets the "regroupid" attribute
     */
    public void unsetRegroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REGROUPID$0);
        }
    }
}
