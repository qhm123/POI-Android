/*
 * XML Type:  CT_MetadataStrings
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStrings
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_MetadataStrings(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMetadataStringsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataStrings
{
    
    public CTMetadataStringsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName S$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "s");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "s" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement> getSList()
    {
        final class SList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement get(int i)
                { return CTMetadataStringsImpl.this.getSArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement old = CTMetadataStringsImpl.this.getSArray(i);
                CTMetadataStringsImpl.this.setSArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement o)
                { CTMetadataStringsImpl.this.insertNewS(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement old = CTMetadataStringsImpl.this.getSArray(i);
                CTMetadataStringsImpl.this.removeS(i);
                return old;
            }
            
            public int size()
                { return CTMetadataStringsImpl.this.sizeOfSArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SList();
        }
    }
    
    /**
     * Gets array of all "s" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement[] getSArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(S$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "s" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement getSArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement)get_store().find_element_user(S$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "s" element
     */
    public int sizeOfSArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(S$0);
        }
    }
    
    /**
     * Sets array of all "s" element
     */
    public void setSArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement[] sArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sArray, S$0);
        }
    }
    
    /**
     * Sets ith "s" element
     */
    public void setSArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement s)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement)get_store().find_element_user(S$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(s);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "s" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement insertNewS(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement)get_store().insert_element_user(S$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "s" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement addNewS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXStringElement)get_store().add_element_user(S$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "s" element
     */
    public void removeS(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(S$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COUNT$2);
            }
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(COUNT$2);
            }
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
            return get_store().find_attribute_user(COUNT$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$2);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$2);
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
            get_store().remove_attribute(COUNT$2);
        }
    }
}
