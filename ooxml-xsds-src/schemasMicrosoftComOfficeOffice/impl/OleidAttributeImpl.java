/*
 * An XML attribute type.
 * Localname: oleid
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.OleidAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one oleid(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class OleidAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.OleidAttribute
{
    
    public OleidAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OLEID$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "oleid");
    
    
    /**
     * Gets the "oleid" attribute
     */
    public float getOleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLEID$0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "oleid" attribute
     */
    public org.apache.xmlbeans.XmlFloat xgetOleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(OLEID$0);
            return target;
        }
    }
    
    /**
     * True if has "oleid" attribute
     */
    public boolean isSetOleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLEID$0) != null;
        }
    }
    
    /**
     * Sets the "oleid" attribute
     */
    public void setOleid(float oleid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLEID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLEID$0);
            }
            target.setFloatValue(oleid);
        }
    }
    
    /**
     * Sets (as xml) the "oleid" attribute
     */
    public void xsetOleid(org.apache.xmlbeans.XmlFloat oleid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_attribute_user(OLEID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_attribute_user(OLEID$0);
            }
            target.set(oleid);
        }
    }
    
    /**
     * Unsets the "oleid" attribute
     */
    public void unsetOleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLEID$0);
        }
    }
}
