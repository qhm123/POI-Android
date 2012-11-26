/*
 * XML Type:  CT_GradientStopList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_GradientStopList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTGradientStopListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList
{
    
    public CTGradientStopListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gs");
    
    
    /**
     * Gets a List of "gs" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop> getGsList()
    {
        final class GsList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop get(int i)
                { return CTGradientStopListImpl.this.getGsArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop old = CTGradientStopListImpl.this.getGsArray(i);
                CTGradientStopListImpl.this.setGsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop o)
                { CTGradientStopListImpl.this.insertNewGs(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop old = CTGradientStopListImpl.this.getGsArray(i);
                CTGradientStopListImpl.this.removeGs(i);
                return old;
            }
            
            public int size()
                { return CTGradientStopListImpl.this.sizeOfGsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GsList();
        }
    }
    
    /**
     * Gets array of all "gs" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop[] getGsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GS$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "gs" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop getGsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop)get_store().find_element_user(GS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "gs" element
     */
    public int sizeOfGsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GS$0);
        }
    }
    
    /**
     * Sets array of all "gs" element
     */
    public void setGsArray(org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop[] gsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(gsArray, GS$0);
        }
    }
    
    /**
     * Sets ith "gs" element
     */
    public void setGsArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop gs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop)get_store().find_element_user(GS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(gs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gs" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop insertNewGs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop)get_store().insert_element_user(GS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gs" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop addNewGs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop)get_store().add_element_user(GS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "gs" element
     */
    public void removeGs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GS$0, i);
        }
    }
}
