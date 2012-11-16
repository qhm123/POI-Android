/*
 * XML Type:  CT_DataValidations
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidations
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_DataValidations(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDataValidationsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidations
{
    
    public CTDataValidationsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAVALIDATION$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dataValidation");
    private static final javax.xml.namespace.QName DISABLEPROMPTS$2 = 
        new javax.xml.namespace.QName("", "disablePrompts");
    private static final javax.xml.namespace.QName XWINDOW$4 = 
        new javax.xml.namespace.QName("", "xWindow");
    private static final javax.xml.namespace.QName YWINDOW$6 = 
        new javax.xml.namespace.QName("", "yWindow");
    private static final javax.xml.namespace.QName COUNT$8 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "dataValidation" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation> getDataValidationList()
    {
        final class DataValidationList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation get(int i)
                { return CTDataValidationsImpl.this.getDataValidationArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation old = CTDataValidationsImpl.this.getDataValidationArray(i);
                CTDataValidationsImpl.this.setDataValidationArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation o)
                { CTDataValidationsImpl.this.insertNewDataValidation(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation old = CTDataValidationsImpl.this.getDataValidationArray(i);
                CTDataValidationsImpl.this.removeDataValidation(i);
                return old;
            }
            
            public int size()
                { return CTDataValidationsImpl.this.sizeOfDataValidationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DataValidationList();
        }
    }
    
    /**
     * Gets array of all "dataValidation" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation[] getDataValidationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAVALIDATION$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataValidation" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation getDataValidationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation)get_store().find_element_user(DATAVALIDATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataValidation" element
     */
    public int sizeOfDataValidationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAVALIDATION$0);
        }
    }
    
    /**
     * Sets array of all "dataValidation" element
     */
    public void setDataValidationArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation[] dataValidationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataValidationArray, DATAVALIDATION$0);
        }
    }
    
    /**
     * Sets ith "dataValidation" element
     */
    public void setDataValidationArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation dataValidation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation)get_store().find_element_user(DATAVALIDATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataValidation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataValidation" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation insertNewDataValidation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation)get_store().insert_element_user(DATAVALIDATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataValidation" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation addNewDataValidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation)get_store().add_element_user(DATAVALIDATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataValidation" element
     */
    public void removeDataValidation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAVALIDATION$0, i);
        }
    }
    
    /**
     * Gets the "disablePrompts" attribute
     */
    public boolean getDisablePrompts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLEPROMPTS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DISABLEPROMPTS$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "disablePrompts" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDisablePrompts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLEPROMPTS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DISABLEPROMPTS$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "disablePrompts" attribute
     */
    public boolean isSetDisablePrompts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISABLEPROMPTS$2) != null;
        }
    }
    
    /**
     * Sets the "disablePrompts" attribute
     */
    public void setDisablePrompts(boolean disablePrompts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLEPROMPTS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISABLEPROMPTS$2);
            }
            target.setBooleanValue(disablePrompts);
        }
    }
    
    /**
     * Sets (as xml) the "disablePrompts" attribute
     */
    public void xsetDisablePrompts(org.apache.xmlbeans.XmlBoolean disablePrompts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLEPROMPTS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DISABLEPROMPTS$2);
            }
            target.set(disablePrompts);
        }
    }
    
    /**
     * Unsets the "disablePrompts" attribute
     */
    public void unsetDisablePrompts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISABLEPROMPTS$2);
        }
    }
    
    /**
     * Gets the "xWindow" attribute
     */
    public long getXWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XWINDOW$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "xWindow" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetXWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(XWINDOW$4);
            return target;
        }
    }
    
    /**
     * True if has "xWindow" attribute
     */
    public boolean isSetXWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XWINDOW$4) != null;
        }
    }
    
    /**
     * Sets the "xWindow" attribute
     */
    public void setXWindow(long xWindow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XWINDOW$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XWINDOW$4);
            }
            target.setLongValue(xWindow);
        }
    }
    
    /**
     * Sets (as xml) the "xWindow" attribute
     */
    public void xsetXWindow(org.apache.xmlbeans.XmlUnsignedInt xWindow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(XWINDOW$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(XWINDOW$4);
            }
            target.set(xWindow);
        }
    }
    
    /**
     * Unsets the "xWindow" attribute
     */
    public void unsetXWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XWINDOW$4);
        }
    }
    
    /**
     * Gets the "yWindow" attribute
     */
    public long getYWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YWINDOW$6);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "yWindow" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetYWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(YWINDOW$6);
            return target;
        }
    }
    
    /**
     * True if has "yWindow" attribute
     */
    public boolean isSetYWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(YWINDOW$6) != null;
        }
    }
    
    /**
     * Sets the "yWindow" attribute
     */
    public void setYWindow(long yWindow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YWINDOW$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(YWINDOW$6);
            }
            target.setLongValue(yWindow);
        }
    }
    
    /**
     * Sets (as xml) the "yWindow" attribute
     */
    public void xsetYWindow(org.apache.xmlbeans.XmlUnsignedInt yWindow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(YWINDOW$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(YWINDOW$6);
            }
            target.set(yWindow);
        }
    }
    
    /**
     * Unsets the "yWindow" attribute
     */
    public void unsetYWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(YWINDOW$6);
        }
    }
    
    /**
     * Gets the "count" attribute
     */
    public long getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$8);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "count" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$8);
            return target;
        }
    }
    
    /**
     * True if has "count" attribute
     */
    public boolean isSetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNT$8) != null;
        }
    }
    
    /**
     * Sets the "count" attribute
     */
    public void setCount(long count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$8);
            }
            target.setLongValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "count" attribute
     */
    public void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$8);
            }
            target.set(count);
        }
    }
    
    /**
     * Unsets the "count" attribute
     */
    public void unsetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNT$8);
        }
    }
}
