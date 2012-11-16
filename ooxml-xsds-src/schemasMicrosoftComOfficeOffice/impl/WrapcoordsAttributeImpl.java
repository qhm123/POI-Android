/*
 * An XML attribute type.
 * Localname: wrapcoords
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.WrapcoordsAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one wrapcoords(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class WrapcoordsAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.WrapcoordsAttribute
{
    
    public WrapcoordsAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WRAPCOORDS$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "wrapcoords");
    
    
    /**
     * Gets the "wrapcoords" attribute
     */
    public java.lang.String getWrapcoords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRAPCOORDS$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "wrapcoords" attribute
     */
    public org.apache.xmlbeans.XmlString xgetWrapcoords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WRAPCOORDS$0);
            return target;
        }
    }
    
    /**
     * True if has "wrapcoords" attribute
     */
    public boolean isSetWrapcoords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WRAPCOORDS$0) != null;
        }
    }
    
    /**
     * Sets the "wrapcoords" attribute
     */
    public void setWrapcoords(java.lang.String wrapcoords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRAPCOORDS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WRAPCOORDS$0);
            }
            target.setStringValue(wrapcoords);
        }
    }
    
    /**
     * Sets (as xml) the "wrapcoords" attribute
     */
    public void xsetWrapcoords(org.apache.xmlbeans.XmlString wrapcoords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WRAPCOORDS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WRAPCOORDS$0);
            }
            target.set(wrapcoords);
        }
    }
    
    /**
     * Unsets the "wrapcoords" attribute
     */
    public void unsetWrapcoords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WRAPCOORDS$0);
        }
    }
}
