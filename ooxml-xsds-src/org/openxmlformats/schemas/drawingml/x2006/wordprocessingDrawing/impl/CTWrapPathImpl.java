/*
 * XML Type:  CT_WrapPath
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapPath
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.impl;
/**
 * An XML CT_WrapPath(@http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing).
 *
 * This is a complex type.
 */
public class CTWrapPathImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapPath
{
    
    public CTWrapPathImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName START$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "start");
    private static final javax.xml.namespace.QName LINETO$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "lineTo");
    private static final javax.xml.namespace.QName EDITED$4 = 
        new javax.xml.namespace.QName("", "edited");
    
    
    /**
     * Gets the "start" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().find_element_user(START$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "start" element
     */
    public void setStart(org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().find_element_user(START$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().add_element_user(START$0);
            }
            target.set(start);
        }
    }
    
    /**
     * Appends and returns a new empty "start" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D addNewStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().add_element_user(START$0);
            return target;
        }
    }
    
    /**
     * Gets a List of "lineTo" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D> getLineToList()
    {
        final class LineToList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D get(int i)
                { return CTWrapPathImpl.this.getLineToArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D old = CTWrapPathImpl.this.getLineToArray(i);
                CTWrapPathImpl.this.setLineToArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D o)
                { CTWrapPathImpl.this.insertNewLineTo(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D old = CTWrapPathImpl.this.getLineToArray(i);
                CTWrapPathImpl.this.removeLineTo(i);
                return old;
            }
            
            public int size()
                { return CTWrapPathImpl.this.sizeOfLineToArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LineToList();
        }
    }
    
    /**
     * Gets array of all "lineTo" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D[] getLineToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINETO$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lineTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D getLineToArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().find_element_user(LINETO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lineTo" element
     */
    public int sizeOfLineToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINETO$2);
        }
    }
    
    /**
     * Sets array of all "lineTo" element
     */
    public void setLineToArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D[] lineToArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lineToArray, LINETO$2);
        }
    }
    
    /**
     * Sets ith "lineTo" element
     */
    public void setLineToArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D lineTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().find_element_user(LINETO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lineTo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lineTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D insertNewLineTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().insert_element_user(LINETO$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lineTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D addNewLineTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D)get_store().add_element_user(LINETO$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "lineTo" element
     */
    public void removeLineTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINETO$2, i);
        }
    }
    
    /**
     * Gets the "edited" attribute
     */
    public boolean getEdited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDITED$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "edited" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEdited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EDITED$4);
            return target;
        }
    }
    
    /**
     * True if has "edited" attribute
     */
    public boolean isSetEdited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EDITED$4) != null;
        }
    }
    
    /**
     * Sets the "edited" attribute
     */
    public void setEdited(boolean edited)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDITED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EDITED$4);
            }
            target.setBooleanValue(edited);
        }
    }
    
    /**
     * Sets (as xml) the "edited" attribute
     */
    public void xsetEdited(org.apache.xmlbeans.XmlBoolean edited)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EDITED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EDITED$4);
            }
            target.set(edited);
        }
    }
    
    /**
     * Unsets the "edited" attribute
     */
    public void unsetEdited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EDITED$4);
        }
    }
}
