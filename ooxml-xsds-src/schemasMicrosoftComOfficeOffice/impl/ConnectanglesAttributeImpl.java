/*
 * An XML attribute type.
 * Localname: connectangles
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ConnectanglesAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one connectangles(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class ConnectanglesAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.ConnectanglesAttribute
{
    
    public ConnectanglesAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTANGLES$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "connectangles");
    
    
    /**
     * Gets the "connectangles" attribute
     */
    public java.lang.String getConnectangles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTANGLES$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "connectangles" attribute
     */
    public org.apache.xmlbeans.XmlString xgetConnectangles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONNECTANGLES$0);
            return target;
        }
    }
    
    /**
     * True if has "connectangles" attribute
     */
    public boolean isSetConnectangles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONNECTANGLES$0) != null;
        }
    }
    
    /**
     * Sets the "connectangles" attribute
     */
    public void setConnectangles(java.lang.String connectangles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTANGLES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTANGLES$0);
            }
            target.setStringValue(connectangles);
        }
    }
    
    /**
     * Sets (as xml) the "connectangles" attribute
     */
    public void xsetConnectangles(org.apache.xmlbeans.XmlString connectangles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONNECTANGLES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONNECTANGLES$0);
            }
            target.set(connectangles);
        }
    }
    
    /**
     * Unsets the "connectangles" attribute
     */
    public void unsetConnectangles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONNECTANGLES$0);
        }
    }
}
