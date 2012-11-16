/*
 * An XML attribute type.
 * Localname: bordertopcolor
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.BordertopcolorAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one bordertopcolor(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class BordertopcolorAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.BordertopcolorAttribute
{
    
    public BordertopcolorAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BORDERTOPCOLOR$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "bordertopcolor");
    
    
    /**
     * Gets the "bordertopcolor" attribute
     */
    public java.lang.String getBordertopcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERTOPCOLOR$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bordertopcolor" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBordertopcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERTOPCOLOR$0);
            return target;
        }
    }
    
    /**
     * True if has "bordertopcolor" attribute
     */
    public boolean isSetBordertopcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BORDERTOPCOLOR$0) != null;
        }
    }
    
    /**
     * Sets the "bordertopcolor" attribute
     */
    public void setBordertopcolor(java.lang.String bordertopcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERTOPCOLOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDERTOPCOLOR$0);
            }
            target.setStringValue(bordertopcolor);
        }
    }
    
    /**
     * Sets (as xml) the "bordertopcolor" attribute
     */
    public void xsetBordertopcolor(org.apache.xmlbeans.XmlString bordertopcolor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDERTOPCOLOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BORDERTOPCOLOR$0);
            }
            target.set(bordertopcolor);
        }
    }
    
    /**
     * Unsets the "bordertopcolor" attribute
     */
    public void unsetBordertopcolor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BORDERTOPCOLOR$0);
        }
    }
}
