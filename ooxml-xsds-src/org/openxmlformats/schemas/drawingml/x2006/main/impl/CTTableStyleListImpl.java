/*
 * XML Type:  CT_TableStyleList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TableStyleList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTableStyleListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleList
{
    
    public CTTableStyleListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TBLSTYLE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tblStyle");
    private static final javax.xml.namespace.QName DEF$2 = 
        new javax.xml.namespace.QName("", "def");
    
    
    /**
     * Gets a List of "tblStyle" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle> getTblStyleList()
    {
        final class TblStyleList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle get(int i)
                { return CTTableStyleListImpl.this.getTblStyleArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle old = CTTableStyleListImpl.this.getTblStyleArray(i);
                CTTableStyleListImpl.this.setTblStyleArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle o)
                { CTTableStyleListImpl.this.insertNewTblStyle(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle old = CTTableStyleListImpl.this.getTblStyleArray(i);
                CTTableStyleListImpl.this.removeTblStyle(i);
                return old;
            }
            
            public int size()
                { return CTTableStyleListImpl.this.sizeOfTblStyleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TblStyleList();
        }
    }
    
    /**
     * Gets array of all "tblStyle" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle[] getTblStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TBLSTYLE$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tblStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle getTblStyleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle)get_store().find_element_user(TBLSTYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tblStyle" element
     */
    public int sizeOfTblStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBLSTYLE$0);
        }
    }
    
    /**
     * Sets array of all "tblStyle" element
     */
    public void setTblStyleArray(org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle[] tblStyleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tblStyleArray, TBLSTYLE$0);
        }
    }
    
    /**
     * Sets ith "tblStyle" element
     */
    public void setTblStyleArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle tblStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle)get_store().find_element_user(TBLSTYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tblStyle);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tblStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle insertNewTblStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle)get_store().insert_element_user(TBLSTYLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tblStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle addNewTblStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle)get_store().add_element_user(TBLSTYLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tblStyle" element
     */
    public void removeTblStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBLSTYLE$0, i);
        }
    }
    
    /**
     * Gets the "def" attribute
     */
    public java.lang.String getDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEF$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "def" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STGuid xgetDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGuid)get_store().find_attribute_user(DEF$2);
            return target;
        }
    }
    
    /**
     * Sets the "def" attribute
     */
    public void setDef(java.lang.String def)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEF$2);
            }
            target.setStringValue(def);
        }
    }
    
    /**
     * Sets (as xml) the "def" attribute
     */
    public void xsetDef(org.openxmlformats.schemas.drawingml.x2006.main.STGuid def)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGuid target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGuid)get_store().find_attribute_user(DEF$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STGuid)get_store().add_attribute_user(DEF$2);
            }
            target.set(def);
        }
    }
}
