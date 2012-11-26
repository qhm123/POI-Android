/*
 * XML Type:  CT_Path2D
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_Path2D(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPath2DImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D
{
    
    public CTPath2DImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "close");
    private static final javax.xml.namespace.QName MOVETO$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "moveTo");
    private static final javax.xml.namespace.QName LNTO$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnTo");
    private static final javax.xml.namespace.QName ARCTO$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "arcTo");
    private static final javax.xml.namespace.QName QUADBEZTO$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "quadBezTo");
    private static final javax.xml.namespace.QName CUBICBEZTO$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cubicBezTo");
    private static final javax.xml.namespace.QName W$12 = 
        new javax.xml.namespace.QName("", "w");
    private static final javax.xml.namespace.QName H$14 = 
        new javax.xml.namespace.QName("", "h");
    private static final javax.xml.namespace.QName FILL$16 = 
        new javax.xml.namespace.QName("", "fill");
    private static final javax.xml.namespace.QName STROKE$18 = 
        new javax.xml.namespace.QName("", "stroke");
    private static final javax.xml.namespace.QName EXTRUSIONOK$20 = 
        new javax.xml.namespace.QName("", "extrusionOk");
    
    
    /**
     * Gets a List of "close" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose> getCloseList()
    {
        final class CloseList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose get(int i)
                { return CTPath2DImpl.this.getCloseArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose old = CTPath2DImpl.this.getCloseArray(i);
                CTPath2DImpl.this.setCloseArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose o)
                { CTPath2DImpl.this.insertNewClose(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose old = CTPath2DImpl.this.getCloseArray(i);
                CTPath2DImpl.this.removeClose(i);
                return old;
            }
            
            public int size()
                { return CTPath2DImpl.this.sizeOfCloseArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CloseList();
        }
    }
    
    /**
     * Gets array of all "close" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose[] getCloseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLOSE$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "close" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose getCloseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose)get_store().find_element_user(CLOSE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "close" element
     */
    public int sizeOfCloseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLOSE$0);
        }
    }
    
    /**
     * Sets array of all "close" element
     */
    public void setCloseArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose[] closeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(closeArray, CLOSE$0);
        }
    }
    
    /**
     * Sets ith "close" element
     */
    public void setCloseArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose close)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose)get_store().find_element_user(CLOSE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(close);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "close" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose insertNewClose(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose)get_store().insert_element_user(CLOSE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "close" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose addNewClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose)get_store().add_element_user(CLOSE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "close" element
     */
    public void removeClose(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLOSE$0, i);
        }
    }
    
    /**
     * Gets a List of "moveTo" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo> getMoveToList()
    {
        final class MoveToList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo get(int i)
                { return CTPath2DImpl.this.getMoveToArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo old = CTPath2DImpl.this.getMoveToArray(i);
                CTPath2DImpl.this.setMoveToArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo o)
                { CTPath2DImpl.this.insertNewMoveTo(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo old = CTPath2DImpl.this.getMoveToArray(i);
                CTPath2DImpl.this.removeMoveTo(i);
                return old;
            }
            
            public int size()
                { return CTPath2DImpl.this.sizeOfMoveToArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MoveToList();
        }
    }
    
    /**
     * Gets array of all "moveTo" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo[] getMoveToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MOVETO$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "moveTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo getMoveToArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo)get_store().find_element_user(MOVETO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "moveTo" element
     */
    public int sizeOfMoveToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOVETO$2);
        }
    }
    
    /**
     * Sets array of all "moveTo" element
     */
    public void setMoveToArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo[] moveToArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(moveToArray, MOVETO$2);
        }
    }
    
    /**
     * Sets ith "moveTo" element
     */
    public void setMoveToArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo moveTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo)get_store().find_element_user(MOVETO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(moveTo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "moveTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo insertNewMoveTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo)get_store().insert_element_user(MOVETO$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "moveTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo addNewMoveTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo)get_store().add_element_user(MOVETO$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "moveTo" element
     */
    public void removeMoveTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOVETO$2, i);
        }
    }
    
    /**
     * Gets a List of "lnTo" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo> getLnToList()
    {
        final class LnToList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo get(int i)
                { return CTPath2DImpl.this.getLnToArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo old = CTPath2DImpl.this.getLnToArray(i);
                CTPath2DImpl.this.setLnToArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo o)
                { CTPath2DImpl.this.insertNewLnTo(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo old = CTPath2DImpl.this.getLnToArray(i);
                CTPath2DImpl.this.removeLnTo(i);
                return old;
            }
            
            public int size()
                { return CTPath2DImpl.this.sizeOfLnToArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LnToList();
        }
    }
    
    /**
     * Gets array of all "lnTo" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo[] getLnToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LNTO$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lnTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo getLnToArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo)get_store().find_element_user(LNTO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lnTo" element
     */
    public int sizeOfLnToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LNTO$4);
        }
    }
    
    /**
     * Sets array of all "lnTo" element
     */
    public void setLnToArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo[] lnToArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lnToArray, LNTO$4);
        }
    }
    
    /**
     * Sets ith "lnTo" element
     */
    public void setLnToArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo lnTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo)get_store().find_element_user(LNTO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lnTo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lnTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo insertNewLnTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo)get_store().insert_element_user(LNTO$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lnTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo addNewLnTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo)get_store().add_element_user(LNTO$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "lnTo" element
     */
    public void removeLnTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LNTO$4, i);
        }
    }
    
    /**
     * Gets a List of "arcTo" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo> getArcToList()
    {
        final class ArcToList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo get(int i)
                { return CTPath2DImpl.this.getArcToArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo old = CTPath2DImpl.this.getArcToArray(i);
                CTPath2DImpl.this.setArcToArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo o)
                { CTPath2DImpl.this.insertNewArcTo(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo old = CTPath2DImpl.this.getArcToArray(i);
                CTPath2DImpl.this.removeArcTo(i);
                return old;
            }
            
            public int size()
                { return CTPath2DImpl.this.sizeOfArcToArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ArcToList();
        }
    }
    
    /**
     * Gets array of all "arcTo" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo[] getArcToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARCTO$6, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "arcTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo getArcToArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo)get_store().find_element_user(ARCTO$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "arcTo" element
     */
    public int sizeOfArcToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARCTO$6);
        }
    }
    
    /**
     * Sets array of all "arcTo" element
     */
    public void setArcToArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo[] arcToArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(arcToArray, ARCTO$6);
        }
    }
    
    /**
     * Sets ith "arcTo" element
     */
    public void setArcToArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo arcTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo)get_store().find_element_user(ARCTO$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arcTo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "arcTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo insertNewArcTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo)get_store().insert_element_user(ARCTO$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "arcTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo addNewArcTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DArcTo)get_store().add_element_user(ARCTO$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "arcTo" element
     */
    public void removeArcTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARCTO$6, i);
        }
    }
    
    /**
     * Gets a List of "quadBezTo" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo> getQuadBezToList()
    {
        final class QuadBezToList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo get(int i)
                { return CTPath2DImpl.this.getQuadBezToArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo old = CTPath2DImpl.this.getQuadBezToArray(i);
                CTPath2DImpl.this.setQuadBezToArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo o)
                { CTPath2DImpl.this.insertNewQuadBezTo(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo old = CTPath2DImpl.this.getQuadBezToArray(i);
                CTPath2DImpl.this.removeQuadBezTo(i);
                return old;
            }
            
            public int size()
                { return CTPath2DImpl.this.sizeOfQuadBezToArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new QuadBezToList();
        }
    }
    
    /**
     * Gets array of all "quadBezTo" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo[] getQuadBezToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUADBEZTO$8, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "quadBezTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo getQuadBezToArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo)get_store().find_element_user(QUADBEZTO$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "quadBezTo" element
     */
    public int sizeOfQuadBezToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUADBEZTO$8);
        }
    }
    
    /**
     * Sets array of all "quadBezTo" element
     */
    public void setQuadBezToArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo[] quadBezToArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(quadBezToArray, QUADBEZTO$8);
        }
    }
    
    /**
     * Sets ith "quadBezTo" element
     */
    public void setQuadBezToArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo quadBezTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo)get_store().find_element_user(QUADBEZTO$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(quadBezTo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "quadBezTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo insertNewQuadBezTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo)get_store().insert_element_user(QUADBEZTO$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "quadBezTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo addNewQuadBezTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo)get_store().add_element_user(QUADBEZTO$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "quadBezTo" element
     */
    public void removeQuadBezTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUADBEZTO$8, i);
        }
    }
    
    /**
     * Gets a List of "cubicBezTo" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo> getCubicBezToList()
    {
        final class CubicBezToList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo get(int i)
                { return CTPath2DImpl.this.getCubicBezToArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo old = CTPath2DImpl.this.getCubicBezToArray(i);
                CTPath2DImpl.this.setCubicBezToArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo o)
                { CTPath2DImpl.this.insertNewCubicBezTo(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo old = CTPath2DImpl.this.getCubicBezToArray(i);
                CTPath2DImpl.this.removeCubicBezTo(i);
                return old;
            }
            
            public int size()
                { return CTPath2DImpl.this.sizeOfCubicBezToArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CubicBezToList();
        }
    }
    
    /**
     * Gets array of all "cubicBezTo" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo[] getCubicBezToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUBICBEZTO$10, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cubicBezTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo getCubicBezToArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo)get_store().find_element_user(CUBICBEZTO$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cubicBezTo" element
     */
    public int sizeOfCubicBezToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUBICBEZTO$10);
        }
    }
    
    /**
     * Sets array of all "cubicBezTo" element
     */
    public void setCubicBezToArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo[] cubicBezToArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cubicBezToArray, CUBICBEZTO$10);
        }
    }
    
    /**
     * Sets ith "cubicBezTo" element
     */
    public void setCubicBezToArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo cubicBezTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo)get_store().find_element_user(CUBICBEZTO$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cubicBezTo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cubicBezTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo insertNewCubicBezTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo)get_store().insert_element_user(CUBICBEZTO$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cubicBezTo" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo addNewCubicBezTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo)get_store().add_element_user(CUBICBEZTO$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "cubicBezTo" element
     */
    public void removeCubicBezTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUBICBEZTO$10, i);
        }
    }
    
    /**
     * Gets the "w" attribute
     */
    public long getW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(W$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(W$12);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "w" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(W$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_default_attribute_value(W$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "w" attribute
     */
    public boolean isSetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(W$12) != null;
        }
    }
    
    /**
     * Sets the "w" attribute
     */
    public void setW(long w)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(W$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(W$12);
            }
            target.setLongValue(w);
        }
    }
    
    /**
     * Sets (as xml) the "w" attribute
     */
    public void xsetW(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate w)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(W$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().add_attribute_user(W$12);
            }
            target.set(w);
        }
    }
    
    /**
     * Unsets the "w" attribute
     */
    public void unsetW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(W$12);
        }
    }
    
    /**
     * Gets the "h" attribute
     */
    public long getH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(H$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(H$14);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "h" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate xgetH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(H$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_default_attribute_value(H$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "h" attribute
     */
    public boolean isSetH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(H$14) != null;
        }
    }
    
    /**
     * Sets the "h" attribute
     */
    public void setH(long h)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(H$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(H$14);
            }
            target.setLongValue(h);
        }
    }
    
    /**
     * Sets (as xml) the "h" attribute
     */
    public void xsetH(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate h)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().find_attribute_user(H$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate)get_store().add_attribute_user(H$14);
            }
            target.set(h);
        }
    }
    
    /**
     * Unsets the "h" attribute
     */
    public void unsetH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(H$14);
        }
    }
    
    /**
     * Gets the "fill" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPathFillMode.Enum getFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FILL$16);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STPathFillMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "fill" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPathFillMode xgetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPathFillMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPathFillMode)get_store().find_attribute_user(FILL$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPathFillMode)get_default_attribute_value(FILL$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "fill" attribute
     */
    public boolean isSetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILL$16) != null;
        }
    }
    
    /**
     * Sets the "fill" attribute
     */
    public void setFill(org.openxmlformats.schemas.drawingml.x2006.main.STPathFillMode.Enum fill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILL$16);
            }
            target.setEnumValue(fill);
        }
    }
    
    /**
     * Sets (as xml) the "fill" attribute
     */
    public void xsetFill(org.openxmlformats.schemas.drawingml.x2006.main.STPathFillMode fill)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPathFillMode target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPathFillMode)get_store().find_attribute_user(FILL$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPathFillMode)get_store().add_attribute_user(FILL$16);
            }
            target.set(fill);
        }
    }
    
    /**
     * Unsets the "fill" attribute
     */
    public void unsetFill()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILL$16);
        }
    }
    
    /**
     * Gets the "stroke" attribute
     */
    public boolean getStroke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STROKE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STROKE$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "stroke" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetStroke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(STROKE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(STROKE$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "stroke" attribute
     */
    public boolean isSetStroke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STROKE$18) != null;
        }
    }
    
    /**
     * Sets the "stroke" attribute
     */
    public void setStroke(boolean stroke)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STROKE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STROKE$18);
            }
            target.setBooleanValue(stroke);
        }
    }
    
    /**
     * Sets (as xml) the "stroke" attribute
     */
    public void xsetStroke(org.apache.xmlbeans.XmlBoolean stroke)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(STROKE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(STROKE$18);
            }
            target.set(stroke);
        }
    }
    
    /**
     * Unsets the "stroke" attribute
     */
    public void unsetStroke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STROKE$18);
        }
    }
    
    /**
     * Gets the "extrusionOk" attribute
     */
    public boolean getExtrusionOk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTRUSIONOK$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXTRUSIONOK$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "extrusionOk" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetExtrusionOk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXTRUSIONOK$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXTRUSIONOK$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "extrusionOk" attribute
     */
    public boolean isSetExtrusionOk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXTRUSIONOK$20) != null;
        }
    }
    
    /**
     * Sets the "extrusionOk" attribute
     */
    public void setExtrusionOk(boolean extrusionOk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTRUSIONOK$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTRUSIONOK$20);
            }
            target.setBooleanValue(extrusionOk);
        }
    }
    
    /**
     * Sets (as xml) the "extrusionOk" attribute
     */
    public void xsetExtrusionOk(org.apache.xmlbeans.XmlBoolean extrusionOk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXTRUSIONOK$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXTRUSIONOK$20);
            }
            target.set(extrusionOk);
        }
    }
    
    /**
     * Unsets the "extrusionOk" attribute
     */
    public void unsetExtrusionOk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXTRUSIONOK$20);
        }
    }
}
