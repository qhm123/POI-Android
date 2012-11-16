/*
 * An XML attribute type.
 * Localname: dgmnodekind
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.DgmnodekindAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one dgmnodekind(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class DgmnodekindAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.DgmnodekindAttribute
{
    
    public DgmnodekindAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DGMNODEKIND$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "dgmnodekind");
    
    
    /**
     * Gets the "dgmnodekind" attribute
     */
    public java.math.BigInteger getDgmnodekind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMNODEKIND$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "dgmnodekind" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetDgmnodekind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMNODEKIND$0);
            return target;
        }
    }
    
    /**
     * True if has "dgmnodekind" attribute
     */
    public boolean isSetDgmnodekind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DGMNODEKIND$0) != null;
        }
    }
    
    /**
     * Sets the "dgmnodekind" attribute
     */
    public void setDgmnodekind(java.math.BigInteger dgmnodekind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMNODEKIND$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DGMNODEKIND$0);
            }
            target.setBigIntegerValue(dgmnodekind);
        }
    }
    
    /**
     * Sets (as xml) the "dgmnodekind" attribute
     */
    public void xsetDgmnodekind(org.apache.xmlbeans.XmlInteger dgmnodekind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMNODEKIND$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DGMNODEKIND$0);
            }
            target.set(dgmnodekind);
        }
    }
    
    /**
     * Unsets the "dgmnodekind" attribute
     */
    public void unsetDgmnodekind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DGMNODEKIND$0);
        }
    }
}
