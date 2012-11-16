/*
 * An XML attribute type.
 * Localname: master
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.MasterAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one master(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class MasterAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.MasterAttribute
{
    
    public MasterAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MASTER$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "master");
    
    
    /**
     * Gets the "master" attribute
     */
    public java.lang.String getMaster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MASTER$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "master" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMaster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MASTER$0);
            return target;
        }
    }
    
    /**
     * True if has "master" attribute
     */
    public boolean isSetMaster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MASTER$0) != null;
        }
    }
    
    /**
     * Sets the "master" attribute
     */
    public void setMaster(java.lang.String master)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MASTER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MASTER$0);
            }
            target.setStringValue(master);
        }
    }
    
    /**
     * Sets (as xml) the "master" attribute
     */
    public void xsetMaster(org.apache.xmlbeans.XmlString master)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MASTER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MASTER$0);
            }
            target.set(master);
        }
    }
    
    /**
     * Unsets the "master" attribute
     */
    public void unsetMaster()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MASTER$0);
        }
    }
}
