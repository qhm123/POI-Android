/*
 * XML Type:  CT_CustomColorList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColorList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_CustomColorList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTCustomColorListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColorList
{
    
    public CTCustomColorListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTCLR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "custClr");
    
    
    /**
     * Gets a List of "custClr" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor> getCustClrList()
    {
        final class CustClrList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor get(int i)
                { return CTCustomColorListImpl.this.getCustClrArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor old = CTCustomColorListImpl.this.getCustClrArray(i);
                CTCustomColorListImpl.this.setCustClrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor o)
                { CTCustomColorListImpl.this.insertNewCustClr(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor old = CTCustomColorListImpl.this.getCustClrArray(i);
                CTCustomColorListImpl.this.removeCustClr(i);
                return old;
            }
            
            public int size()
                { return CTCustomColorListImpl.this.sizeOfCustClrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustClrList();
        }
    }
    
    /**
     * Gets array of all "custClr" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor[] getCustClrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTCLR$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "custClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor getCustClrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor)get_store().find_element_user(CUSTCLR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "custClr" element
     */
    public int sizeOfCustClrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTCLR$0);
        }
    }
    
    /**
     * Sets array of all "custClr" element
     */
    public void setCustClrArray(org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor[] custClrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(custClrArray, CUSTCLR$0);
        }
    }
    
    /**
     * Sets ith "custClr" element
     */
    public void setCustClrArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor custClr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor)get_store().find_element_user(CUSTCLR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(custClr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "custClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor insertNewCustClr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor)get_store().insert_element_user(CUSTCLR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "custClr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor addNewCustClr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTCustomColor)get_store().add_element_user(CUSTCLR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "custClr" element
     */
    public void removeCustClr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTCLR$0, i);
        }
    }
}
