/*
 * An XML attribute type.
 * Localname: ole
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.OleAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one ole(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class OleAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.OleAttribute
{
    
    public OleAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OLE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "ole");
    
    
    /**
     * Gets the "ole" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalseBlank.Enum getOle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLE$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ole" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalseBlank xgetOle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalseBlank target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalseBlank)get_store().find_attribute_user(OLE$0);
            return target;
        }
    }
    
    /**
     * True if has "ole" attribute
     */
    public boolean isSetOle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLE$0) != null;
        }
    }
    
    /**
     * Sets the "ole" attribute
     */
    public void setOle(schemasMicrosoftComOfficeOffice.STTrueFalseBlank.Enum ole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLE$0);
            }
            target.setEnumValue(ole);
        }
    }
    
    /**
     * Sets (as xml) the "ole" attribute
     */
    public void xsetOle(schemasMicrosoftComOfficeOffice.STTrueFalseBlank ole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalseBlank target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalseBlank)get_store().find_attribute_user(OLE$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalseBlank)get_store().add_attribute_user(OLE$0);
            }
            target.set(ole);
        }
    }
    
    /**
     * Unsets the "ole" attribute
     */
    public void unsetOle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLE$0);
        }
    }
}
