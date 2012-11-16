/*
 * XML Type:  CT_MetadataBlock
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_MetadataBlock(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTMetadataBlockImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataBlock
{
    
    public CTMetadataBlockImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RC$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rc");
    
    
    /**
     * Gets a List of "rc" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord> getRcList()
    {
        final class RcList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord get(int i)
                { return CTMetadataBlockImpl.this.getRcArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord old = CTMetadataBlockImpl.this.getRcArray(i);
                CTMetadataBlockImpl.this.setRcArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord o)
                { CTMetadataBlockImpl.this.insertNewRc(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord old = CTMetadataBlockImpl.this.getRcArray(i);
                CTMetadataBlockImpl.this.removeRc(i);
                return old;
            }
            
            public int size()
                { return CTMetadataBlockImpl.this.sizeOfRcArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RcList();
        }
    }
    
    /**
     * Gets array of all "rc" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord[] getRcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RC$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rc" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord getRcArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord)get_store().find_element_user(RC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rc" element
     */
    public int sizeOfRcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RC$0);
        }
    }
    
    /**
     * Sets array of all "rc" element
     */
    public void setRcArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord[] rcArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rcArray, RC$0);
        }
    }
    
    /**
     * Sets ith "rc" element
     */
    public void setRcArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord rc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord)get_store().find_element_user(RC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rc);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rc" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord insertNewRc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord)get_store().insert_element_user(RC$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rc" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord addNewRc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMetadataRecord)get_store().add_element_user(RC$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "rc" element
     */
    public void removeRc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RC$0, i);
        }
    }
}
