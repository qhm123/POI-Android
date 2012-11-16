/*
 * XML Type:  CT_PivotAreaReferences
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReferences
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PivotAreaReferences(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPivotAreaReferencesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReferences
{
    
    public CTPivotAreaReferencesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "reference");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "reference" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference> getReferenceList()
    {
        final class ReferenceList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference get(int i)
                { return CTPivotAreaReferencesImpl.this.getReferenceArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference old = CTPivotAreaReferencesImpl.this.getReferenceArray(i);
                CTPivotAreaReferencesImpl.this.setReferenceArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference o)
                { CTPivotAreaReferencesImpl.this.insertNewReference(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference old = CTPivotAreaReferencesImpl.this.getReferenceArray(i);
                CTPivotAreaReferencesImpl.this.removeReference(i);
                return old;
            }
            
            public int size()
                { return CTPivotAreaReferencesImpl.this.sizeOfReferenceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ReferenceList();
        }
    }
    
    /**
     * Gets array of all "reference" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference[] getReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFERENCE$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "reference" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference getReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference)get_store().find_element_user(REFERENCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "reference" element
     */
    public int sizeOfReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCE$0);
        }
    }
    
    /**
     * Sets array of all "reference" element
     */
    public void setReferenceArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference[] referenceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(referenceArray, REFERENCE$0);
        }
    }
    
    /**
     * Sets ith "reference" element
     */
    public void setReferenceArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference reference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference)get_store().find_element_user(REFERENCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reference);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reference" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference insertNewReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference)get_store().insert_element_user(REFERENCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reference" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference addNewReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference)get_store().add_element_user(REFERENCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "reference" element
     */
    public void removeReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCE$0, i);
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
