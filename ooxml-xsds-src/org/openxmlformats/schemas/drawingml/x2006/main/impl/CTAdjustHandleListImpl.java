/*
 * XML Type:  CT_AdjustHandleList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_AdjustHandleList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTAdjustHandleListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTAdjustHandleList
{
    
    public CTAdjustHandleListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AHXY$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ahXY");
    private static final javax.xml.namespace.QName AHPOLAR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ahPolar");
    
    
    /**
     * Gets a List of "ahXY" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle> getAhXYList()
    {
        final class AhXYList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle get(int i)
                { return CTAdjustHandleListImpl.this.getAhXYArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle old = CTAdjustHandleListImpl.this.getAhXYArray(i);
                CTAdjustHandleListImpl.this.setAhXYArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle o)
                { CTAdjustHandleListImpl.this.insertNewAhXY(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle old = CTAdjustHandleListImpl.this.getAhXYArray(i);
                CTAdjustHandleListImpl.this.removeAhXY(i);
                return old;
            }
            
            public int size()
                { return CTAdjustHandleListImpl.this.sizeOfAhXYArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AhXYList();
        }
    }
    
    /**
     * Gets array of all "ahXY" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle[] getAhXYArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AHXY$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ahXY" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle getAhXYArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle)get_store().find_element_user(AHXY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ahXY" element
     */
    public int sizeOfAhXYArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AHXY$0);
        }
    }
    
    /**
     * Sets array of all "ahXY" element
     */
    public void setAhXYArray(org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle[] ahXYArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ahXYArray, AHXY$0);
        }
    }
    
    /**
     * Sets ith "ahXY" element
     */
    public void setAhXYArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle ahXY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle)get_store().find_element_user(AHXY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ahXY);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ahXY" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle insertNewAhXY(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle)get_store().insert_element_user(AHXY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ahXY" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle addNewAhXY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTXYAdjustHandle)get_store().add_element_user(AHXY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ahXY" element
     */
    public void removeAhXY(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AHXY$0, i);
        }
    }
    
    /**
     * Gets a List of "ahPolar" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle> getAhPolarList()
    {
        final class AhPolarList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle get(int i)
                { return CTAdjustHandleListImpl.this.getAhPolarArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle old = CTAdjustHandleListImpl.this.getAhPolarArray(i);
                CTAdjustHandleListImpl.this.setAhPolarArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle o)
                { CTAdjustHandleListImpl.this.insertNewAhPolar(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle old = CTAdjustHandleListImpl.this.getAhPolarArray(i);
                CTAdjustHandleListImpl.this.removeAhPolar(i);
                return old;
            }
            
            public int size()
                { return CTAdjustHandleListImpl.this.sizeOfAhPolarArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AhPolarList();
        }
    }
    
    /**
     * Gets array of all "ahPolar" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle[] getAhPolarArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AHPOLAR$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ahPolar" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle getAhPolarArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle)get_store().find_element_user(AHPOLAR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ahPolar" element
     */
    public int sizeOfAhPolarArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AHPOLAR$2);
        }
    }
    
    /**
     * Sets array of all "ahPolar" element
     */
    public void setAhPolarArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle[] ahPolarArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ahPolarArray, AHPOLAR$2);
        }
    }
    
    /**
     * Sets ith "ahPolar" element
     */
    public void setAhPolarArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle ahPolar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle)get_store().find_element_user(AHPOLAR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ahPolar);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ahPolar" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle insertNewAhPolar(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle)get_store().insert_element_user(AHPOLAR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ahPolar" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle addNewAhPolar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPolarAdjustHandle)get_store().add_element_user(AHPOLAR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ahPolar" element
     */
    public void removeAhPolar(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AHPOLAR$2, i);
        }
    }
}
