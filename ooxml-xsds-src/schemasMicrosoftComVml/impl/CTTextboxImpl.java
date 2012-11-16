/*
 * XML Type:  CT_Textbox
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.CTTextbox
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml.impl;
/**
 * An XML CT_Textbox(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTTextboxImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComVml.CTTextbox
{
    
    public CTTextboxImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TXBXCONTENT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "txbxContent");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName STYLE$4 = 
        new javax.xml.namespace.QName("", "style");
    private static final javax.xml.namespace.QName INSET$6 = 
        new javax.xml.namespace.QName("", "inset");
    private static final javax.xml.namespace.QName SINGLECLICK$8 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "singleclick");
    private static final javax.xml.namespace.QName INSETMODE$10 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "insetmode");
    
    
    /**
     * Gets the "txbxContent" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent getTxbxContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent)get_store().find_element_user(TXBXCONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "txbxContent" element
     */
    public boolean isSetTxbxContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TXBXCONTENT$0) != 0;
        }
    }
    
    /**
     * Sets the "txbxContent" element
     */
    public void setTxbxContent(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent txbxContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent)get_store().find_element_user(TXBXCONTENT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent)get_store().add_element_user(TXBXCONTENT$0);
            }
            target.set(txbxContent);
        }
    }
    
    /**
     * Appends and returns a new empty "txbxContent" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent addNewTxbxContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent)get_store().add_element_user(TXBXCONTENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "txbxContent" element
     */
    public void unsetTxbxContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TXBXCONTENT$0, 0);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$2) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$2);
        }
    }
    
    /**
     * Gets the "style" attribute
     */
    public java.lang.String getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "style" attribute
     */
    public org.apache.xmlbeans.XmlString xgetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLE$4);
            return target;
        }
    }
    
    /**
     * True if has "style" attribute
     */
    public boolean isSetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STYLE$4) != null;
        }
    }
    
    /**
     * Sets the "style" attribute
     */
    public void setStyle(java.lang.String style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$4);
            }
            target.setStringValue(style);
        }
    }
    
    /**
     * Sets (as xml) the "style" attribute
     */
    public void xsetStyle(org.apache.xmlbeans.XmlString style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STYLE$4);
            }
            target.set(style);
        }
    }
    
    /**
     * Unsets the "style" attribute
     */
    public void unsetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STYLE$4);
        }
    }
    
    /**
     * Gets the "inset" attribute
     */
    public java.lang.String getInset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSET$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "inset" attribute
     */
    public org.apache.xmlbeans.XmlString xgetInset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INSET$6);
            return target;
        }
    }
    
    /**
     * True if has "inset" attribute
     */
    public boolean isSetInset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSET$6) != null;
        }
    }
    
    /**
     * Sets the "inset" attribute
     */
    public void setInset(java.lang.String inset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSET$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSET$6);
            }
            target.setStringValue(inset);
        }
    }
    
    /**
     * Sets (as xml) the "inset" attribute
     */
    public void xsetInset(org.apache.xmlbeans.XmlString inset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INSET$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INSET$6);
            }
            target.set(inset);
        }
    }
    
    /**
     * Unsets the "inset" attribute
     */
    public void unsetInset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSET$6);
        }
    }
    
    /**
     * Gets the "singleclick" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getSingleclick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SINGLECLICK$8);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "singleclick" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetSingleclick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(SINGLECLICK$8);
            return target;
        }
    }
    
    /**
     * True if has "singleclick" attribute
     */
    public boolean isSetSingleclick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SINGLECLICK$8) != null;
        }
    }
    
    /**
     * Sets the "singleclick" attribute
     */
    public void setSingleclick(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum singleclick)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SINGLECLICK$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SINGLECLICK$8);
            }
            target.setEnumValue(singleclick);
        }
    }
    
    /**
     * Sets (as xml) the "singleclick" attribute
     */
    public void xsetSingleclick(schemasMicrosoftComOfficeOffice.STTrueFalse singleclick)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(SINGLECLICK$8);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(SINGLECLICK$8);
            }
            target.set(singleclick);
        }
    }
    
    /**
     * Unsets the "singleclick" attribute
     */
    public void unsetSingleclick()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SINGLECLICK$8);
        }
    }
    
    /**
     * Gets the "insetmode" attribute
     */
    public schemasMicrosoftComOfficeOffice.STInsetMode.Enum getInsetmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSETMODE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INSETMODE$10);
            }
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STInsetMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "insetmode" attribute
     */
    public schemasMicrosoftComOfficeOffice.STInsetMode xgetInsetmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STInsetMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STInsetMode)get_store().find_attribute_user(INSETMODE$10);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STInsetMode)get_default_attribute_value(INSETMODE$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "insetmode" attribute
     */
    public boolean isSetInsetmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSETMODE$10) != null;
        }
    }
    
    /**
     * Sets the "insetmode" attribute
     */
    public void setInsetmode(schemasMicrosoftComOfficeOffice.STInsetMode.Enum insetmode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSETMODE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSETMODE$10);
            }
            target.setEnumValue(insetmode);
        }
    }
    
    /**
     * Sets (as xml) the "insetmode" attribute
     */
    public void xsetInsetmode(schemasMicrosoftComOfficeOffice.STInsetMode insetmode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STInsetMode target = null;
            target = (schemasMicrosoftComOfficeOffice.STInsetMode)get_store().find_attribute_user(INSETMODE$10);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STInsetMode)get_store().add_attribute_user(INSETMODE$10);
            }
            target.set(insetmode);
        }
    }
    
    /**
     * Unsets the "insetmode" attribute
     */
    public void unsetInsetmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSETMODE$10);
        }
    }
}
