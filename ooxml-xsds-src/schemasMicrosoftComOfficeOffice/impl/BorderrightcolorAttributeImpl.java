/*
 * An XML attribute type.
 * Localname: borderrightcolor
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.BorderrightcolorAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one borderrightcolor(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class BorderrightcolorAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.BorderrightcolorAttribute
{
    
    public BorderrightcolorAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BORDERRIGHTCOLOR$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "borderrightcolor");
    
    
    /**
     * Gets the "borderrightcolor" attribute
     */
    public java.lang.String getBorderrightcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERRIGHTCOLOR$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "borderrightcolor" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBorderrightcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERRIGHTCOLOR$0);
            return target;
        }
    }
    
    /**
     * True if has "borderrightcolor" attribute
     */
    public boolean isSetBorderrightcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BORDERRIGHTCOLOR$0) != null;
        }
    }
    
    /**
     * Sets the "borderrightcolor" attribute
     */
    public void setBorderrightcolor(java.lang.String borderrightcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERRIGHTCOLOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDERRIGHTCOLOR$0);
            }
            target.setStringValue(borderrightcolor);
        }
    }
    
    /**
     * Sets (as xml) the "borderrightcolor" attribute
     */
    public void xsetBorderrightcolor(org.apache.xmlbeans.XmlString borderrightcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERRIGHTCOLOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BORDERRIGHTCOLOR$0);
            }
            target.set(borderrightcolor);
        }
    }
    
    /**
     * Unsets the "borderrightcolor" attribute
     */
    public void unsetBorderrightcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BORDERRIGHTCOLOR$0);
        }
    }
}
