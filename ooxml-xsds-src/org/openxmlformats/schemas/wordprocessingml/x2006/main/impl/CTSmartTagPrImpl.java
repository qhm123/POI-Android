/*
 * XML Type:  CT_SmartTagPr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_SmartTagPr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTSmartTagPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagPr
{
    
    public CTSmartTagPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "attr");
    
    
    /**
     * Gets a List of "attr" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr> getAttrList()
    {
        final class AttrList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr get(int i)
                { return CTSmartTagPrImpl.this.getAttrArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr old = CTSmartTagPrImpl.this.getAttrArray(i);
                CTSmartTagPrImpl.this.setAttrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr o)
                { CTSmartTagPrImpl.this.insertNewAttr(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr old = CTSmartTagPrImpl.this.getAttrArray(i);
                CTSmartTagPrImpl.this.removeAttr(i);
                return old;
            }
            
            public int size()
                { return CTSmartTagPrImpl.this.sizeOfAttrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AttrList();
        }
    }
    
    /**
     * Gets array of all "attr" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr[] getAttrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTR$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "attr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr getAttrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr)get_store().find_element_user(ATTR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "attr" element
     */
    public int sizeOfAttrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTR$0);
        }
    }
    
    /**
     * Sets array of all "attr" element
     */
    public void setAttrArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr[] attrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attrArray, ATTR$0);
        }
    }
    
    /**
     * Sets ith "attr" element
     */
    public void setAttrArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr attr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr)get_store().find_element_user(ATTR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr insertNewAttr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr)get_store().insert_element_user(ATTR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr addNewAttr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAttr)get_store().add_element_user(ATTR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "attr" element
     */
    public void removeAttr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTR$0, i);
        }
    }
}
