/*
 * XML Type:  CT_LineStyleList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTLineStyleList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_LineStyleList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTLineStyleListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTLineStyleList
{
    
    public CTLineStyleListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LN$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ln");
    
    
    /**
     * Gets a List of "ln" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties> getLnList()
    {
        final class LnList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties get(int i)
                { return CTLineStyleListImpl.this.getLnArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties old = CTLineStyleListImpl.this.getLnArray(i);
                CTLineStyleListImpl.this.setLnArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties o)
                { CTLineStyleListImpl.this.insertNewLn(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties old = CTLineStyleListImpl.this.getLnArray(i);
                CTLineStyleListImpl.this.removeLn(i);
                return old;
            }
            
            public int size()
                { return CTLineStyleListImpl.this.sizeOfLnArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LnList();
        }
    }
    
    /**
     * Gets array of all "ln" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties[] getLnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LN$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ln" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties getLnArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ln" element
     */
    public int sizeOfLnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LN$0);
        }
    }
    
    /**
     * Sets array of all "ln" element
     */
    public void setLnArray(org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties[] lnArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lnArray, LN$0);
        }
    }
    
    /**
     * Sets ith "ln" element
     */
    public void setLnArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties ln)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().find_element_user(LN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ln);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ln" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties insertNewLn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().insert_element_user(LN$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ln" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties addNewLn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties)get_store().add_element_user(LN$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ln" element
     */
    public void removeLn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LN$0, i);
        }
    }
}
