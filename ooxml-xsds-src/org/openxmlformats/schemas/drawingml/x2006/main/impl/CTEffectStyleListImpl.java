/*
 * XML Type:  CT_EffectStyleList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_EffectStyleList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTEffectStyleListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleList
{
    
    public CTEffectStyleListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EFFECTSTYLE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectStyle");
    
    
    /**
     * Gets a List of "effectStyle" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem> getEffectStyleList()
    {
        final class EffectStyleList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem get(int i)
                { return CTEffectStyleListImpl.this.getEffectStyleArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem old = CTEffectStyleListImpl.this.getEffectStyleArray(i);
                CTEffectStyleListImpl.this.setEffectStyleArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem o)
                { CTEffectStyleListImpl.this.insertNewEffectStyle(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem old = CTEffectStyleListImpl.this.getEffectStyleArray(i);
                CTEffectStyleListImpl.this.removeEffectStyle(i);
                return old;
            }
            
            public int size()
                { return CTEffectStyleListImpl.this.sizeOfEffectStyleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EffectStyleList();
        }
    }
    
    /**
     * Gets array of all "effectStyle" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem[] getEffectStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EFFECTSTYLE$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "effectStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem getEffectStyleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem)get_store().find_element_user(EFFECTSTYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "effectStyle" element
     */
    public int sizeOfEffectStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTSTYLE$0);
        }
    }
    
    /**
     * Sets array of all "effectStyle" element
     */
    public void setEffectStyleArray(org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem[] effectStyleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(effectStyleArray, EFFECTSTYLE$0);
        }
    }
    
    /**
     * Sets ith "effectStyle" element
     */
    public void setEffectStyleArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem effectStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem)get_store().find_element_user(EFFECTSTYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(effectStyle);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "effectStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem insertNewEffectStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem)get_store().insert_element_user(EFFECTSTYLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "effectStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem addNewEffectStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem)get_store().add_element_user(EFFECTSTYLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "effectStyle" element
     */
    public void removeEffectStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTSTYLE$0, i);
        }
    }
}
