/*
 * An XML attribute type.
 * Localname: dgmlayout
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.DgmlayoutAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one dgmlayout(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class DgmlayoutAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.DgmlayoutAttribute
{
    
    public DgmlayoutAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DGMLAYOUT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "dgmlayout");
    
    
    /**
     * Gets the "dgmlayout" attribute
     */
    public java.math.BigInteger getDgmlayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMLAYOUT$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "dgmlayout" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetDgmlayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMLAYOUT$0);
            return target;
        }
    }
    
    /**
     * True if has "dgmlayout" attribute
     */
    public boolean isSetDgmlayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DGMLAYOUT$0) != null;
        }
    }
    
    /**
     * Sets the "dgmlayout" attribute
     */
    public void setDgmlayout(java.math.BigInteger dgmlayout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMLAYOUT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DGMLAYOUT$0);
            }
            target.setBigIntegerValue(dgmlayout);
        }
    }
    
    /**
     * Sets (as xml) the "dgmlayout" attribute
     */
    public void xsetDgmlayout(org.apache.xmlbeans.XmlInteger dgmlayout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMLAYOUT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DGMLAYOUT$0);
            }
            target.set(dgmlayout);
        }
    }
    
    /**
     * Unsets the "dgmlayout" attribute
     */
    public void unsetDgmlayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DGMLAYOUT$0);
        }
    }
}
