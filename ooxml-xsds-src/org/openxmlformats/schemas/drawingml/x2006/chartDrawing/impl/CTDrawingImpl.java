/*
 * XML Type:  CT_Drawing
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chartDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTDrawing
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chartDrawing.impl;
/**
 * An XML CT_Drawing(@http://schemas.openxmlformats.org/drawingml/2006/chartDrawing).
 *
 * This is a complex type.
 */
public class CTDrawingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTDrawing
{
    
    public CTDrawingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELSIZEANCHOR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "relSizeAnchor");
    private static final javax.xml.namespace.QName ABSSIZEANCHOR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing", "absSizeAnchor");
    
    
    /**
     * Gets a List of "relSizeAnchor" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor> getRelSizeAnchorList()
    {
        final class RelSizeAnchorList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor get(int i)
                { return CTDrawingImpl.this.getRelSizeAnchorArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor set(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor old = CTDrawingImpl.this.getRelSizeAnchorArray(i);
                CTDrawingImpl.this.setRelSizeAnchorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor o)
                { CTDrawingImpl.this.insertNewRelSizeAnchor(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor old = CTDrawingImpl.this.getRelSizeAnchorArray(i);
                CTDrawingImpl.this.removeRelSizeAnchor(i);
                return old;
            }
            
            public int size()
                { return CTDrawingImpl.this.sizeOfRelSizeAnchorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RelSizeAnchorList();
        }
    }
    
    /**
     * Gets array of all "relSizeAnchor" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor[] getRelSizeAnchorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELSIZEANCHOR$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor[] result = new org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "relSizeAnchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor getRelSizeAnchorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor)get_store().find_element_user(RELSIZEANCHOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "relSizeAnchor" element
     */
    public int sizeOfRelSizeAnchorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELSIZEANCHOR$0);
        }
    }
    
    /**
     * Sets array of all "relSizeAnchor" element
     */
    public void setRelSizeAnchorArray(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor[] relSizeAnchorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relSizeAnchorArray, RELSIZEANCHOR$0);
        }
    }
    
    /**
     * Sets ith "relSizeAnchor" element
     */
    public void setRelSizeAnchorArray(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor relSizeAnchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor)get_store().find_element_user(RELSIZEANCHOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relSizeAnchor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relSizeAnchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor insertNewRelSizeAnchor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor)get_store().insert_element_user(RELSIZEANCHOR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relSizeAnchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor addNewRelSizeAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTRelSizeAnchor)get_store().add_element_user(RELSIZEANCHOR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "relSizeAnchor" element
     */
    public void removeRelSizeAnchor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELSIZEANCHOR$0, i);
        }
    }
    
    /**
     * Gets a List of "absSizeAnchor" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor> getAbsSizeAnchorList()
    {
        final class AbsSizeAnchorList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor>
        {
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor get(int i)
                { return CTDrawingImpl.this.getAbsSizeAnchorArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor set(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor o)
            {
                org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor old = CTDrawingImpl.this.getAbsSizeAnchorArray(i);
                CTDrawingImpl.this.setAbsSizeAnchorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor o)
                { CTDrawingImpl.this.insertNewAbsSizeAnchor(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor old = CTDrawingImpl.this.getAbsSizeAnchorArray(i);
                CTDrawingImpl.this.removeAbsSizeAnchor(i);
                return old;
            }
            
            public int size()
                { return CTDrawingImpl.this.sizeOfAbsSizeAnchorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AbsSizeAnchorList();
        }
    }
    
    /**
     * Gets array of all "absSizeAnchor" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor[] getAbsSizeAnchorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSSIZEANCHOR$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor[] result = new org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "absSizeAnchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor getAbsSizeAnchorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor)get_store().find_element_user(ABSSIZEANCHOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "absSizeAnchor" element
     */
    public int sizeOfAbsSizeAnchorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSSIZEANCHOR$2);
        }
    }
    
    /**
     * Sets array of all "absSizeAnchor" element
     */
    public void setAbsSizeAnchorArray(org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor[] absSizeAnchorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(absSizeAnchorArray, ABSSIZEANCHOR$2);
        }
    }
    
    /**
     * Sets ith "absSizeAnchor" element
     */
    public void setAbsSizeAnchorArray(int i, org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor absSizeAnchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor)get_store().find_element_user(ABSSIZEANCHOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(absSizeAnchor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "absSizeAnchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor insertNewAbsSizeAnchor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor)get_store().insert_element_user(ABSSIZEANCHOR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "absSizeAnchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor addNewAbsSizeAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chartDrawing.CTAbsSizeAnchor)get_store().add_element_user(ABSSIZEANCHOR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "absSizeAnchor" element
     */
    public void removeAbsSizeAnchor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSSIZEANCHOR$2, i);
        }
    }
}
