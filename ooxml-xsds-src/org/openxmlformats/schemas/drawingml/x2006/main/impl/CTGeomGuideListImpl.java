/*
 * XML Type:  CT_GeomGuideList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_GeomGuideList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTGeomGuideListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList
{
    
    public CTGeomGuideListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GD$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gd");
    
    
    /**
     * Gets a List of "gd" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide> getGdList()
    {
        final class GdList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide get(int i)
                { return CTGeomGuideListImpl.this.getGdArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide old = CTGeomGuideListImpl.this.getGdArray(i);
                CTGeomGuideListImpl.this.setGdArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide o)
                { CTGeomGuideListImpl.this.insertNewGd(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide old = CTGeomGuideListImpl.this.getGdArray(i);
                CTGeomGuideListImpl.this.removeGd(i);
                return old;
            }
            
            public int size()
                { return CTGeomGuideListImpl.this.sizeOfGdArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GdList();
        }
    }
    
    /**
     * Gets array of all "gd" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide[] getGdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GD$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "gd" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide getGdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide)get_store().find_element_user(GD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "gd" element
     */
    public int sizeOfGdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GD$0);
        }
    }
    
    /**
     * Sets array of all "gd" element
     */
    public void setGdArray(org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide[] gdArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(gdArray, GD$0);
        }
    }
    
    /**
     * Sets ith "gd" element
     */
    public void setGdArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide gd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide)get_store().find_element_user(GD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(gd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gd" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide insertNewGd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide)get_store().insert_element_user(GD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gd" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide addNewGd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide)get_store().add_element_user(GD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "gd" element
     */
    public void removeGd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GD$0, i);
        }
    }
}
