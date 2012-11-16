/*
 * An XML attribute type.
 * Localname: dgmlayoutmru
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.DgmlayoutmruAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one dgmlayoutmru(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class DgmlayoutmruAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.DgmlayoutmruAttribute
{
    
    public DgmlayoutmruAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DGMLAYOUTMRU$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "dgmlayoutmru");
    
    
    /**
     * Gets the "dgmlayoutmru" attribute
     */
    public java.math.BigInteger getDgmlayoutmru()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMLAYOUTMRU$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "dgmlayoutmru" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetDgmlayoutmru()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMLAYOUTMRU$0);
            return target;
        }
    }
    
    /**
     * True if has "dgmlayoutmru" attribute
     */
    public boolean isSetDgmlayoutmru()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DGMLAYOUTMRU$0) != null;
        }
    }
    
    /**
     * Sets the "dgmlayoutmru" attribute
     */
    public void setDgmlayoutmru(java.math.BigInteger dgmlayoutmru)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMLAYOUTMRU$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DGMLAYOUTMRU$0);
            }
            target.setBigIntegerValue(dgmlayoutmru);
        }
    }
    
    /**
     * Sets (as xml) the "dgmlayoutmru" attribute
     */
    public void xsetDgmlayoutmru(org.apache.xmlbeans.XmlInteger dgmlayoutmru)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMLAYOUTMRU$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DGMLAYOUTMRU$0);
            }
            target.set(dgmlayoutmru);
        }
    }
    
    /**
     * Unsets the "dgmlayoutmru" attribute
     */
    public void unsetDgmlayoutmru()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DGMLAYOUTMRU$0);
        }
    }
}
