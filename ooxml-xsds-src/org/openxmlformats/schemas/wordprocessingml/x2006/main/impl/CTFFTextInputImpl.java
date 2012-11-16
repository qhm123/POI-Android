/*
 * XML Type:  CT_FFTextInput
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_FFTextInput(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFFTextInputImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput
{
    
    public CTFFTextInputImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "type");
    private static final javax.xml.namespace.QName DEFAULT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "default");
    private static final javax.xml.namespace.QName MAXLENGTH$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "maxLength");
    private static final javax.xml.namespace.QName FORMAT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "format");
    
    
    /**
     * Gets the "type" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextType)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextType)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$0, 0);
        }
    }
    
    /**
     * Gets the "default" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(DEFAULT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "default" element
     */
    public boolean isSetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULT$2) != 0;
        }
    }
    
    /**
     * Sets the "default" element
     */
    public void setDefault(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(DEFAULT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(DEFAULT$2);
            }
            target.set(xdefault);
        }
    }
    
    /**
     * Appends and returns a new empty "default" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(DEFAULT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "default" element
     */
    public void unsetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULT$2, 0);
        }
    }
    
    /**
     * Gets the "maxLength" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(MAXLENGTH$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "maxLength" element
     */
    public boolean isSetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXLENGTH$4) != 0;
        }
    }
    
    /**
     * Sets the "maxLength" element
     */
    public void setMaxLength(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber maxLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(MAXLENGTH$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(MAXLENGTH$4);
            }
            target.set(maxLength);
        }
    }
    
    /**
     * Appends and returns a new empty "maxLength" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(MAXLENGTH$4);
            return target;
        }
    }
    
    /**
     * Unsets the "maxLength" element
     */
    public void unsetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXLENGTH$4, 0);
        }
    }
    
    /**
     * Gets the "format" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(FORMAT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "format" element
     */
    public boolean isSetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMAT$6) != 0;
        }
    }
    
    /**
     * Sets the "format" element
     */
    public void setFormat(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(FORMAT$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(FORMAT$6);
            }
            target.set(format);
        }
    }
    
    /**
     * Appends and returns a new empty "format" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(FORMAT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "format" element
     */
    public void unsetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMAT$6, 0);
        }
    }
}
