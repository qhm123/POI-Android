/*
 * XML Type:  CT_MetadataTypes
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataTypes
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_MetadataTypes(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMetadataTypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataTypes
{
    
    public CTMetadataTypesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATATYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "metadataType");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "metadataType" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType> getMetadataTypeList()
    {
        final class MetadataTypeList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType get(int i)
                { return CTMetadataTypesImpl.this.getMetadataTypeArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType old = CTMetadataTypesImpl.this.getMetadataTypeArray(i);
                CTMetadataTypesImpl.this.setMetadataTypeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType o)
                { CTMetadataTypesImpl.this.insertNewMetadataType(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType old = CTMetadataTypesImpl.this.getMetadataTypeArray(i);
                CTMetadataTypesImpl.this.removeMetadataType(i);
                return old;
            }
            
            public int size()
                { return CTMetadataTypesImpl.this.sizeOfMetadataTypeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MetadataTypeList();
        }
    }
    
    /**
     * Gets array of all "metadataType" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType[] getMetadataTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATATYPE$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "metadataType" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType getMetadataTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType)get_store().find_element_user(METADATATYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "metadataType" element
     */
    public int sizeOfMetadataTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATATYPE$0);
        }
    }
    
    /**
     * Sets array of all "metadataType" element
     */
    public void setMetadataTypeArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType[] metadataTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataTypeArray, METADATATYPE$0);
        }
    }
    
    /**
     * Sets ith "metadataType" element
     */
    public void setMetadataTypeArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType metadataType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType)get_store().find_element_user(METADATATYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "metadataType" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType insertNewMetadataType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType)get_store().insert_element_user(METADATATYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "metadataType" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType addNewMetadataType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataType)get_store().add_element_user(METADATATYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "metadataType" element
     */
    public void removeMetadataType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATATYPE$0, i);
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
