/*
 * XML Type:  CT_Ink
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTInk
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * An XML CT_Ink(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTInkImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CTInk
{
    
    public CTInkImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName I$0 = 
        new javax.xml.namespace.QName("", "i");
    private static final javax.xml.namespace.QName ANNOTATION$2 = 
        new javax.xml.namespace.QName("", "annotation");
    
    
    /**
     * Gets the "i" attribute
     */
    public byte[] getI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(I$0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "i" attribute
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(I$0);
            return target;
        }
    }
    
    /**
     * True if has "i" attribute
     */
    public boolean isSetI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(I$0) != null;
        }
    }
    
    /**
     * Sets the "i" attribute
     */
    public void setI(byte[] iValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(I$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(I$0);
            }
            target.setByteArrayValue(iValue);
        }
    }
    
    /**
     * Sets (as xml) the "i" attribute
     */
    public void xsetI(org.apache.xmlbeans.XmlBase64Binary iValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(I$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_attribute_user(I$0);
            }
            target.set(iValue);
        }
    }
    
    /**
     * Unsets the "i" attribute
     */
    public void unsetI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(I$0);
        }
    }
    
    /**
     * Gets the "annotation" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANNOTATION$2);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "annotation" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ANNOTATION$2);
            return target;
        }
    }
    
    /**
     * True if has "annotation" attribute
     */
    public boolean isSetAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ANNOTATION$2) != null;
        }
    }
    
    /**
     * Sets the "annotation" attribute
     */
    public void setAnnotation(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum annotation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANNOTATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANNOTATION$2);
            }
            target.setEnumValue(annotation);
        }
    }
    
    /**
     * Sets (as xml) the "annotation" attribute
     */
    public void xsetAnnotation(schemasMicrosoftComOfficeOffice.STTrueFalse annotation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(ANNOTATION$2);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(ANNOTATION$2);
            }
            target.set(annotation);
        }
    }
    
    /**
     * Unsets the "annotation" attribute
     */
    public void unsetAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ANNOTATION$2);
        }
    }
}
