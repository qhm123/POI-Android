/*
 * An XML attribute type.
 * Localname: borderbottomcolor
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.BorderbottomcolorAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one borderbottomcolor(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class BorderbottomcolorAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.BorderbottomcolorAttribute
{
    
    public BorderbottomcolorAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BORDERBOTTOMCOLOR$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "borderbottomcolor");
    
    
    /**
     * Gets the "borderbottomcolor" attribute
     */
    public java.lang.String getBorderbottomcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERBOTTOMCOLOR$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "borderbottomcolor" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBorderbottomcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERBOTTOMCOLOR$0);
            return target;
        }
    }
    
    /**
     * True if has "borderbottomcolor" attribute
     */
    public boolean isSetBorderbottomcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BORDERBOTTOMCOLOR$0) != null;
        }
    }
    
    /**
     * Sets the "borderbottomcolor" attribute
     */
    public void setBorderbottomcolor(java.lang.String borderbottomcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERBOTTOMCOLOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDERBOTTOMCOLOR$0);
            }
            target.setStringValue(borderbottomcolor);
        }
    }
    
    /**
     * Sets (as xml) the "borderbottomcolor" attribute
     */
    public void xsetBorderbottomcolor(org.apache.xmlbeans.XmlString borderbottomcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERBOTTOMCOLOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BORDERBOTTOMCOLOR$0);
            }
            target.set(borderbottomcolor);
        }
    }
    
    /**
     * Unsets the "borderbottomcolor" attribute
     */
    public void unsetBorderbottomcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BORDERBOTTOMCOLOR$0);
        }
    }
}
