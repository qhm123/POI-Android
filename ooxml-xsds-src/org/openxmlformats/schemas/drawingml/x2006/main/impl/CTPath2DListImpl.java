/*
 * XML Type:  CT_Path2DList
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_Path2DList(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPath2DListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DList
{
    
    public CTPath2DListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATH$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "path");
    
    
    /**
     * Gets a List of "path" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D> getPathList()
    {
        final class PathList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D get(int i)
                { return CTPath2DListImpl.this.getPathArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D old = CTPath2DListImpl.this.getPathArray(i);
                CTPath2DListImpl.this.setPathArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D o)
                { CTPath2DListImpl.this.insertNewPath(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D old = CTPath2DListImpl.this.getPathArray(i);
                CTPath2DListImpl.this.removePath(i);
                return old;
            }
            
            public int size()
                { return CTPath2DListImpl.this.sizeOfPathArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PathList();
        }
    }
    
    /**
     * Gets array of all "path" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D[] getPathArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PATH$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "path" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D getPathArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D)get_store().find_element_user(PATH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "path" element
     */
    public int sizeOfPathArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATH$0);
        }
    }
    
    /**
     * Sets array of all "path" element
     */
    public void setPathArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D[] pathArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pathArray, PATH$0);
        }
    }
    
    /**
     * Sets ith "path" element
     */
    public void setPathArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D)get_store().find_element_user(PATH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(path);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "path" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D insertNewPath(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D)get_store().insert_element_user(PATH$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "path" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D addNewPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D)get_store().add_element_user(PATH$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "path" element
     */
    public void removePath(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATH$0, i);
        }
    }
}
