/*
 * XML Type:  CT_TLBehaviorAttributeNameList
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLBehaviorAttributeNameList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLBehaviorAttributeNameList(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLBehaviorAttributeNameListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLBehaviorAttributeNameList
{
    
    public CTTLBehaviorAttributeNameListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "attrName");
    
    
    /**
     * Gets a List of "attrName" elements
     */
    public java.util.List<java.lang.String> getAttrNameList()
    {
        final class AttrNameList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return CTTLBehaviorAttributeNameListImpl.this.getAttrNameArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CTTLBehaviorAttributeNameListImpl.this.getAttrNameArray(i);
                CTTLBehaviorAttributeNameListImpl.this.setAttrNameArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { CTTLBehaviorAttributeNameListImpl.this.insertAttrName(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = CTTLBehaviorAttributeNameListImpl.this.getAttrNameArray(i);
                CTTLBehaviorAttributeNameListImpl.this.removeAttrName(i);
                return old;
            }
            
            public int size()
                { return CTTLBehaviorAttributeNameListImpl.this.sizeOfAttrNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AttrNameList();
        }
    }
    
    /**
     * Gets array of all "attrName" elements
     */
    public java.lang.String[] getAttrNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRNAME$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "attrName" element
     */
    public java.lang.String getAttrNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "attrName" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetAttrNameList()
    {
        final class AttrNameList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return CTTLBehaviorAttributeNameListImpl.this.xgetAttrNameArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = CTTLBehaviorAttributeNameListImpl.this.xgetAttrNameArray(i);
                CTTLBehaviorAttributeNameListImpl.this.xsetAttrNameArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { CTTLBehaviorAttributeNameListImpl.this.insertNewAttrName(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = CTTLBehaviorAttributeNameListImpl.this.xgetAttrNameArray(i);
                CTTLBehaviorAttributeNameListImpl.this.removeAttrName(i);
                return old;
            }
            
            public int size()
                { return CTTLBehaviorAttributeNameListImpl.this.sizeOfAttrNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AttrNameList();
        }
    }
    
    /**
     * Gets (as xml) array of all "attrName" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetAttrNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRNAME$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "attrName" element
     */
    public org.apache.xmlbeans.XmlString xgetAttrNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "attrName" element
     */
    public int sizeOfAttrNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRNAME$0);
        }
    }
    
    /**
     * Sets array of all "attrName" element
     */
    public void setAttrNameArray(java.lang.String[] attrNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attrNameArray, ATTRNAME$0);
        }
    }
    
    /**
     * Sets ith "attrName" element
     */
    public void setAttrNameArray(int i, java.lang.String attrName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(attrName);
        }
    }
    
    /**
     * Sets (as xml) array of all "attrName" element
     */
    public void xsetAttrNameArray(org.apache.xmlbeans.XmlString[]attrNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attrNameArray, ATTRNAME$0);
        }
    }
    
    /**
     * Sets (as xml) ith "attrName" element
     */
    public void xsetAttrNameArray(int i, org.apache.xmlbeans.XmlString attrName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attrName);
        }
    }
    
    /**
     * Inserts the value as the ith "attrName" element
     */
    public void insertAttrName(int i, java.lang.String attrName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ATTRNAME$0, i);
            target.setStringValue(attrName);
        }
    }
    
    /**
     * Appends the value as the last "attrName" element
     */
    public void addAttrName(java.lang.String attrName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRNAME$0);
            target.setStringValue(attrName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attrName" element
     */
    public org.apache.xmlbeans.XmlString insertNewAttrName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ATTRNAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attrName" element
     */
    public org.apache.xmlbeans.XmlString addNewAttrName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRNAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "attrName" element
     */
    public void removeAttrName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRNAME$0, i);
        }
    }
}
