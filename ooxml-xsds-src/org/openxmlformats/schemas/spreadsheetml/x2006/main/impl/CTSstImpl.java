/*
 * XML Type:  CT_Sst
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSst
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Sst(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSstImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSst
{
    
    public CTSstImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SI$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "si");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName COUNT$4 = 
        new javax.xml.namespace.QName("", "count");
    private static final javax.xml.namespace.QName UNIQUECOUNT$6 = 
        new javax.xml.namespace.QName("", "uniqueCount");
    
    
    /**
     * Gets a List of "si" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst> getSiList()
    {
        final class SiList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst get(int i)
                { return CTSstImpl.this.getSiArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst old = CTSstImpl.this.getSiArray(i);
                CTSstImpl.this.setSiArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst o)
                { CTSstImpl.this.insertNewSi(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst old = CTSstImpl.this.getSiArray(i);
                CTSstImpl.this.removeSi(i);
                return old;
            }
            
            public int size()
                { return CTSstImpl.this.sizeOfSiArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SiList();
        }
    }
    
    /**
     * Gets array of all "si" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst[] getSiArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SI$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "si" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst getSiArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst)get_store().find_element_user(SI$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "si" element
     */
    public int sizeOfSiArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SI$0);
        }
    }
    
    /**
     * Sets array of all "si" element
     */
    public void setSiArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst[] siArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(siArray, SI$0);
        }
    }
    
    /**
     * Sets ith "si" element
     */
    public void setSiArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst si)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst)get_store().find_element_user(SI$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(si);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "si" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst insertNewSi(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst)get_store().insert_element_user(SI$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "si" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst addNewSi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst)get_store().add_element_user(SI$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "si" element
     */
    public void removeSi(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SI$0, i);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$2) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$4);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$4);
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
            return get_store().find_attribute_user(COUNT$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$4);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$4);
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
            get_store().remove_attribute(COUNT$4);
        }
    }
    
    /**
     * Gets the "uniqueCount" attribute
     */
    public long getUniqueCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUECOUNT$6);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "uniqueCount" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetUniqueCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(UNIQUECOUNT$6);
            return target;
        }
    }
    
    /**
     * True if has "uniqueCount" attribute
     */
    public boolean isSetUniqueCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNIQUECOUNT$6) != null;
        }
    }
    
    /**
     * Sets the "uniqueCount" attribute
     */
    public void setUniqueCount(long uniqueCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUECOUNT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUECOUNT$6);
            }
            target.setLongValue(uniqueCount);
        }
    }
    
    /**
     * Sets (as xml) the "uniqueCount" attribute
     */
    public void xsetUniqueCount(org.apache.xmlbeans.XmlUnsignedInt uniqueCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(UNIQUECOUNT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(UNIQUECOUNT$6);
            }
            target.set(uniqueCount);
        }
    }
    
    /**
     * Unsets the "uniqueCount" attribute
     */
    public void unsetUniqueCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNIQUECOUNT$6);
        }
    }
}
