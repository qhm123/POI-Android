/*
 * XML Type:  CT_FFCheckBox
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_FFCheckBox(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFFCheckBoxImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox
{
    
    public CTFFCheckBoxImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIZE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "size");
    private static final javax.xml.namespace.QName SIZEAUTO$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sizeAuto");
    private static final javax.xml.namespace.QName DEFAULT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "default");
    private static final javax.xml.namespace.QName CHECKED$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "checked");
    
    
    /**
     * Gets the "size" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure getSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().find_element_user(SIZE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "size" element
     */
    public boolean isSetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIZE$0) != 0;
        }
    }
    
    /**
     * Sets the "size" element
     */
    public void setSize(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().find_element_user(SIZE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().add_element_user(SIZE$0);
            }
            target.set(size);
        }
    }
    
    /**
     * Appends and returns a new empty "size" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure addNewSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().add_element_user(SIZE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "size" element
     */
    public void unsetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIZE$0, 0);
        }
    }
    
    /**
     * Gets the "sizeAuto" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getSizeAuto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SIZEAUTO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sizeAuto" element
     */
    public boolean isSetSizeAuto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIZEAUTO$2) != 0;
        }
    }
    
    /**
     * Sets the "sizeAuto" element
     */
    public void setSizeAuto(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff sizeAuto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SIZEAUTO$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SIZEAUTO$2);
            }
            target.set(sizeAuto);
        }
    }
    
    /**
     * Appends and returns a new empty "sizeAuto" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewSizeAuto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SIZEAUTO$2);
            return target;
        }
    }
    
    /**
     * Unsets the "sizeAuto" element
     */
    public void unsetSizeAuto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIZEAUTO$2, 0);
        }
    }
    
    /**
     * Gets the "default" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DEFAULT$4, 0);
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
            return get_store().count_elements(DEFAULT$4) != 0;
        }
    }
    
    /**
     * Sets the "default" element
     */
    public void setDefault(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DEFAULT$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DEFAULT$4);
            }
            target.set(xdefault);
        }
    }
    
    /**
     * Appends and returns a new empty "default" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DEFAULT$4);
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
            get_store().remove_element(DEFAULT$4, 0);
        }
    }
    
    /**
     * Gets the "checked" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getChecked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(CHECKED$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "checked" element
     */
    public boolean isSetChecked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHECKED$6) != 0;
        }
    }
    
    /**
     * Sets the "checked" element
     */
    public void setChecked(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff checked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(CHECKED$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(CHECKED$6);
            }
            target.set(checked);
        }
    }
    
    /**
     * Appends and returns a new empty "checked" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewChecked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(CHECKED$6);
            return target;
        }
    }
    
    /**
     * Unsets the "checked" element
     */
    public void unsetChecked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHECKED$6, 0);
        }
    }
}
