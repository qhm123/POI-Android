/*
 * XML Type:  CT_Path2DQuadBezierTo
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_Path2DQuadBezierTo(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPath2DQuadBezierToImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo
{
    
    public CTPath2DQuadBezierToImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pt");
    
    
    /**
     * Gets a List of "pt" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D> getPtList()
    {
        final class PtList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D get(int i)
                { return CTPath2DQuadBezierToImpl.this.getPtArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D old = CTPath2DQuadBezierToImpl.this.getPtArray(i);
                CTPath2DQuadBezierToImpl.this.setPtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D o)
                { CTPath2DQuadBezierToImpl.this.insertNewPt(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D old = CTPath2DQuadBezierToImpl.this.getPtArray(i);
                CTPath2DQuadBezierToImpl.this.removePt(i);
                return old;
            }
            
            public int size()
                { return CTPath2DQuadBezierToImpl.this.sizeOfPtArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PtList();
        }
    }
    
    /**
     * Gets array of all "pt" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D[] getPtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PT$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D getPtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D)get_store().find_element_user(PT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pt" element
     */
    public int sizeOfPtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PT$0);
        }
    }
    
    /**
     * Sets array of all "pt" element
     */
    public void setPtArray(org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D[] ptArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ptArray, PT$0);
        }
    }
    
    /**
     * Sets ith "pt" element
     */
    public void setPtArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D pt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D)get_store().find_element_user(PT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D insertNewPt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D)get_store().insert_element_user(PT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pt" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D addNewPt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D)get_store().add_element_user(PT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "pt" element
     */
    public void removePt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PT$0, i);
        }
    }
}
