/*
 * An XML attribute type.
 * Localname: tableproperties
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.TablepropertiesAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one tableproperties(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class TablepropertiesAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.TablepropertiesAttribute
{
    
    public TablepropertiesAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABLEPROPERTIES$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "tableproperties");
    
    
    /**
     * Gets the "tableproperties" attribute
     */
    public java.lang.String getTableproperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLEPROPERTIES$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tableproperties" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTableproperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TABLEPROPERTIES$0);
            return target;
        }
    }
    
    /**
     * True if has "tableproperties" attribute
     */
    public boolean isSetTableproperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TABLEPROPERTIES$0) != null;
        }
    }
    
    /**
     * Sets the "tableproperties" attribute
     */
    public void setTableproperties(java.lang.String tableproperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLEPROPERTIES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TABLEPROPERTIES$0);
            }
            target.setStringValue(tableproperties);
        }
    }
    
    /**
     * Sets (as xml) the "tableproperties" attribute
     */
    public void xsetTableproperties(org.apache.xmlbeans.XmlString tableproperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TABLEPROPERTIES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TABLEPROPERTIES$0);
            }
            target.set(tableproperties);
        }
    }
    
    /**
     * Unsets the "tableproperties" attribute
     */
    public void unsetTableproperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TABLEPROPERTIES$0);
        }
    }
}
