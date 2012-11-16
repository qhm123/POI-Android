/*
 * XML Type:  CT_MdxMetadata
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMetadata
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_MdxMetadata(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMdxMetadataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdxMetadata
{
    
    public CTMdxMetadataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MDX$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "mdx");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "mdx" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx> getMdxList()
    {
        final class MdxList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx get(int i)
                { return CTMdxMetadataImpl.this.getMdxArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx old = CTMdxMetadataImpl.this.getMdxArray(i);
                CTMdxMetadataImpl.this.setMdxArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx o)
                { CTMdxMetadataImpl.this.insertNewMdx(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx old = CTMdxMetadataImpl.this.getMdxArray(i);
                CTMdxMetadataImpl.this.removeMdx(i);
                return old;
            }
            
            public int size()
                { return CTMdxMetadataImpl.this.sizeOfMdxArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MdxList();
        }
    }
    
    /**
     * Gets array of all "mdx" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx[] getMdxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MDX$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mdx" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx getMdxArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx)get_store().find_element_user(MDX$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mdx" element
     */
    public int sizeOfMdxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MDX$0);
        }
    }
    
    /**
     * Sets array of all "mdx" element
     */
    public void setMdxArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx[] mdxArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mdxArray, MDX$0);
        }
    }
    
    /**
     * Sets ith "mdx" element
     */
    public void setMdxArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx mdx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx)get_store().find_element_user(MDX$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mdx);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mdx" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx insertNewMdx(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx)get_store().insert_element_user(MDX$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mdx" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx addNewMdx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMdx)get_store().add_element_user(MDX$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "mdx" element
     */
    public void removeMdx(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MDX$0, i);
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
