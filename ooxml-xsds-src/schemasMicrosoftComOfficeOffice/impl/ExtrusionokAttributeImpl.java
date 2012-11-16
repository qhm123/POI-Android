/*
 * An XML attribute type.
 * Localname: extrusionok
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.ExtrusionokAttribute
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * A document containing one extrusionok(@urn:schemas-microsoft-com:office:office) attribute.
 *
 * This is a complex type.
 */
public class ExtrusionokAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.ExtrusionokAttribute
{
    
    public ExtrusionokAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTRUSIONOK$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "extrusionok");
    
    
    /**
     * Gets the "extrusionok" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getExtrusionok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTRUSIONOK$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "extrusionok" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetExtrusionok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(EXTRUSIONOK$0);
            return target;
        }
    }
    
    /**
     * True if has "extrusionok" attribute
     */
    public boolean isSetExtrusionok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXTRUSIONOK$0) != null;
        }
    }
    
    /**
     * Sets the "extrusionok" attribute
     */
    public void setExtrusionok(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum extrusionok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTRUSIONOK$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTRUSIONOK$0);
            }
            target.setEnumValue(extrusionok);
        }
    }
    
    /**
     * Sets (as xml) the "extrusionok" attribute
     */
    public void xsetExtrusionok(schemasMicrosoftComOfficeOffice.STTrueFalse extrusionok)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(EXTRUSIONOK$0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(EXTRUSIONOK$0);
            }
            target.set(extrusionok);
        }
    }
    
    /**
     * Unsets the "extrusionok" attribute
     */
    public void unsetExtrusionok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXTRUSIONOK$0);
        }
    }
}
