/*
 * An XML attribute type.
 * Localname: connectlocs
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ConnectlocsAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one connectlocs(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class ConnectlocsAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.ConnectlocsAttribute
{
    
    public ConnectlocsAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTLOCS$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "connectlocs");
    
    
    /**
     * Gets the "connectlocs" attribute
     */
    public java.lang.String getConnectlocs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTLOCS$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "connectlocs" attribute
     */
    public org.apache.xmlbeans.XmlString xgetConnectlocs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONNECTLOCS$0);
            return target;
        }
    }
    
    /**
     * True if has "connectlocs" attribute
     */
    public boolean isSetConnectlocs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONNECTLOCS$0) != null;
        }
    }
    
    /**
     * Sets the "connectlocs" attribute
     */
    public void setConnectlocs(java.lang.String connectlocs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTLOCS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTLOCS$0);
            }
            target.setStringValue(connectlocs);
        }
    }
    
    /**
     * Sets (as xml) the "connectlocs" attribute
     */
    public void xsetConnectlocs(org.apache.xmlbeans.XmlString connectlocs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONNECTLOCS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONNECTLOCS$0);
            }
            target.set(connectlocs);
        }
    }
    
    /**
     * Unsets the "connectlocs" attribute
     */
    public void unsetConnectlocs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONNECTLOCS$0);
        }
    }
}
