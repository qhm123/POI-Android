/*
 * An XML attribute type.
 * Localname: tablelimits
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.TablelimitsAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one tablelimits(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class TablelimitsAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.TablelimitsAttribute
{
    
    public TablelimitsAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABLELIMITS$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "tablelimits");
    
    
    /**
     * Gets the "tablelimits" attribute
     */
    public java.lang.String getTablelimits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLELIMITS$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tablelimits" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTablelimits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TABLELIMITS$0);
            return target;
        }
    }
    
    /**
     * True if has "tablelimits" attribute
     */
    public boolean isSetTablelimits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TABLELIMITS$0) != null;
        }
    }
    
    /**
     * Sets the "tablelimits" attribute
     */
    public void setTablelimits(java.lang.String tablelimits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLELIMITS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TABLELIMITS$0);
            }
            target.setStringValue(tablelimits);
        }
    }
    
    /**
     * Sets (as xml) the "tablelimits" attribute
     */
    public void xsetTablelimits(org.apache.xmlbeans.XmlString tablelimits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TABLELIMITS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TABLELIMITS$0);
            }
            target.set(tablelimits);
        }
    }
    
    /**
     * Unsets the "tablelimits" attribute
     */
    public void unsetTablelimits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TABLELIMITS$0);
        }
    }
}
