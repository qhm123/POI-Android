/*
 * XML Type:  CT_ServerFormats
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormats
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ServerFormats(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTServerFormatsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormats
{
    
    public CTServerFormatsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVERFORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "serverFormat");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "serverFormat" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat> getServerFormatList()
    {
        final class ServerFormatList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat get(int i)
                { return CTServerFormatsImpl.this.getServerFormatArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat old = CTServerFormatsImpl.this.getServerFormatArray(i);
                CTServerFormatsImpl.this.setServerFormatArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat o)
                { CTServerFormatsImpl.this.insertNewServerFormat(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat old = CTServerFormatsImpl.this.getServerFormatArray(i);
                CTServerFormatsImpl.this.removeServerFormat(i);
                return old;
            }
            
            public int size()
                { return CTServerFormatsImpl.this.sizeOfServerFormatArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ServerFormatList();
        }
    }
    
    /**
     * Gets array of all "serverFormat" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat[] getServerFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVERFORMAT$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "serverFormat" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat getServerFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat)get_store().find_element_user(SERVERFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "serverFormat" element
     */
    public int sizeOfServerFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVERFORMAT$0);
        }
    }
    
    /**
     * Sets array of all "serverFormat" element
     */
    public void setServerFormatArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat[] serverFormatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serverFormatArray, SERVERFORMAT$0);
        }
    }
    
    /**
     * Sets ith "serverFormat" element
     */
    public void setServerFormatArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat serverFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat)get_store().find_element_user(SERVERFORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(serverFormat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "serverFormat" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat insertNewServerFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat)get_store().insert_element_user(SERVERFORMAT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "serverFormat" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat addNewServerFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTServerFormat)get_store().add_element_user(SERVERFORMAT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "serverFormat" element
     */
    public void removeServerFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVERFORMAT$0, i);
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
