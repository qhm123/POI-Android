/*
 * XML Type:  CT_Drawing
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing
 * Java type: org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTDrawing
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl;
/**
 * An XML CT_Drawing(@http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing).
 *
 * This is a complex type.
 */
public class CTDrawingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTDrawing
{
    
    public CTDrawingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TWOCELLANCHOR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "twoCellAnchor");
    private static final javax.xml.namespace.QName ONECELLANCHOR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "oneCellAnchor");
    private static final javax.xml.namespace.QName ABSOLUTEANCHOR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "absoluteAnchor");
    
    
    /**
     * Gets a List of "twoCellAnchor" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor> getTwoCellAnchorList()
    {
        final class TwoCellAnchorList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor>
        {
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor get(int i)
                { return CTDrawingImpl.this.getTwoCellAnchorArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor set(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor o)
            {
                org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor old = CTDrawingImpl.this.getTwoCellAnchorArray(i);
                CTDrawingImpl.this.setTwoCellAnchorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor o)
                { CTDrawingImpl.this.insertNewTwoCellAnchor(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor old = CTDrawingImpl.this.getTwoCellAnchorArray(i);
                CTDrawingImpl.this.removeTwoCellAnchor(i);
                return old;
            }
            
            public int size()
                { return CTDrawingImpl.this.sizeOfTwoCellAnchorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TwoCellAnchorList();
        }
    }
    
    /**
     * Gets array of all "twoCellAnchor" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor[] getTwoCellAnchorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TWOCELLANCHOR$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor[] result = new org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "twoCellAnchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor getTwoCellAnchorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor)get_store().find_element_user(TWOCELLANCHOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "twoCellAnchor" element
     */
    public int sizeOfTwoCellAnchorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TWOCELLANCHOR$0);
        }
    }
    
    /**
     * Sets array of all "twoCellAnchor" element
     */
    public void setTwoCellAnchorArray(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor[] twoCellAnchorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(twoCellAnchorArray, TWOCELLANCHOR$0);
        }
    }
    
    /**
     * Sets ith "twoCellAnchor" element
     */
    public void setTwoCellAnchorArray(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor twoCellAnchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor)get_store().find_element_user(TWOCELLANCHOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(twoCellAnchor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "twoCellAnchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor insertNewTwoCellAnchor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor)get_store().insert_element_user(TWOCELLANCHOR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "twoCellAnchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor addNewTwoCellAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTTwoCellAnchor)get_store().add_element_user(TWOCELLANCHOR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "twoCellAnchor" element
     */
    public void removeTwoCellAnchor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TWOCELLANCHOR$0, i);
        }
    }
    
    /**
     * Gets a List of "oneCellAnchor" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor> getOneCellAnchorList()
    {
        final class OneCellAnchorList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor>
        {
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor get(int i)
                { return CTDrawingImpl.this.getOneCellAnchorArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor set(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor o)
            {
                org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor old = CTDrawingImpl.this.getOneCellAnchorArray(i);
                CTDrawingImpl.this.setOneCellAnchorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor o)
                { CTDrawingImpl.this.insertNewOneCellAnchor(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor old = CTDrawingImpl.this.getOneCellAnchorArray(i);
                CTDrawingImpl.this.removeOneCellAnchor(i);
                return old;
            }
            
            public int size()
                { return CTDrawingImpl.this.sizeOfOneCellAnchorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OneCellAnchorList();
        }
    }
    
    /**
     * Gets array of all "oneCellAnchor" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor[] getOneCellAnchorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ONECELLANCHOR$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor[] result = new org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "oneCellAnchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor getOneCellAnchorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor)get_store().find_element_user(ONECELLANCHOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "oneCellAnchor" element
     */
    public int sizeOfOneCellAnchorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ONECELLANCHOR$2);
        }
    }
    
    /**
     * Sets array of all "oneCellAnchor" element
     */
    public void setOneCellAnchorArray(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor[] oneCellAnchorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(oneCellAnchorArray, ONECELLANCHOR$2);
        }
    }
    
    /**
     * Sets ith "oneCellAnchor" element
     */
    public void setOneCellAnchorArray(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor oneCellAnchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor)get_store().find_element_user(ONECELLANCHOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(oneCellAnchor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "oneCellAnchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor insertNewOneCellAnchor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor)get_store().insert_element_user(ONECELLANCHOR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "oneCellAnchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor addNewOneCellAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTOneCellAnchor)get_store().add_element_user(ONECELLANCHOR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "oneCellAnchor" element
     */
    public void removeOneCellAnchor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ONECELLANCHOR$2, i);
        }
    }
    
    /**
     * Gets a List of "absoluteAnchor" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor> getAbsoluteAnchorList()
    {
        final class AbsoluteAnchorList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor>
        {
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor get(int i)
                { return CTDrawingImpl.this.getAbsoluteAnchorArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor set(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor o)
            {
                org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor old = CTDrawingImpl.this.getAbsoluteAnchorArray(i);
                CTDrawingImpl.this.setAbsoluteAnchorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor o)
                { CTDrawingImpl.this.insertNewAbsoluteAnchor(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor old = CTDrawingImpl.this.getAbsoluteAnchorArray(i);
                CTDrawingImpl.this.removeAbsoluteAnchor(i);
                return old;
            }
            
            public int size()
                { return CTDrawingImpl.this.sizeOfAbsoluteAnchorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AbsoluteAnchorList();
        }
    }
    
    /**
     * Gets array of all "absoluteAnchor" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor[] getAbsoluteAnchorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABSOLUTEANCHOR$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor[] result = new org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "absoluteAnchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor getAbsoluteAnchorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor)get_store().find_element_user(ABSOLUTEANCHOR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "absoluteAnchor" element
     */
    public int sizeOfAbsoluteAnchorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSOLUTEANCHOR$4);
        }
    }
    
    /**
     * Sets array of all "absoluteAnchor" element
     */
    public void setAbsoluteAnchorArray(org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor[] absoluteAnchorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(absoluteAnchorArray, ABSOLUTEANCHOR$4);
        }
    }
    
    /**
     * Sets ith "absoluteAnchor" element
     */
    public void setAbsoluteAnchorArray(int i, org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor absoluteAnchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor)get_store().find_element_user(ABSOLUTEANCHOR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(absoluteAnchor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "absoluteAnchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor insertNewAbsoluteAnchor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor)get_store().insert_element_user(ABSOLUTEANCHOR$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "absoluteAnchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor addNewAbsoluteAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAbsoluteAnchor)get_store().add_element_user(ABSOLUTEANCHOR$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "absoluteAnchor" element
     */
    public void removeAbsoluteAnchor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSOLUTEANCHOR$4, i);
        }
    }
}
