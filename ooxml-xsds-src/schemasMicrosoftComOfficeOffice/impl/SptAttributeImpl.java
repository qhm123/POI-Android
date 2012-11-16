/*
 * An XML attribute type.
 * Localname: spt
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.SptAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one spt(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class SptAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.SptAttribute
{
    
    public SptAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "spt");
    
    
    /**
     * Gets the "spt" attribute
     */
    public float getSpt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPT$0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "spt" attribute
     */
    public org.apache.xmlbeans.XmlFloat xgetSpt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(SPT$0);
            return target;
        }
    }
    
    /**
     * True if has "spt" attribute
     */
    public boolean isSetSpt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPT$0) != null;
        }
    }
    
    /**
     * Sets the "spt" attribute
     */
    public void setSpt(float spt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPT$0);
            }
            target.setFloatValue(spt);
        }
    }
    
    /**
     * Sets (as xml) the "spt" attribute
     */
    public void xsetSpt(org.apache.xmlbeans.XmlFloat spt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(SPT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(SPT$0);
            }
            target.set(spt);
        }
    }
    
    /**
     * Unsets the "spt" attribute
     */
    public void unsetSpt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPT$0);
        }
    }
}
