/*
 * XML Type:  CT_Drawing
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Drawing(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDrawingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing
{
    
    public CTDrawingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANCHOR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "anchor");
    private static final javax.xml.namespace.QName INLINE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "inline");
    
    
    /**
     * Gets a List of "anchor" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor> getAnchorList()
    {
        final class AnchorList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor>
        {
            public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor get(int i)
                { return CTDrawingImpl.this.getAnchorArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor set(int i, org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor o)
            {
                org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor old = CTDrawingImpl.this.getAnchorArray(i);
                CTDrawingImpl.this.setAnchorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor o)
                { CTDrawingImpl.this.insertNewAnchor(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor old = CTDrawingImpl.this.getAnchorArray(i);
                CTDrawingImpl.this.removeAnchor(i);
                return old;
            }
            
            public int size()
                { return CTDrawingImpl.this.sizeOfAnchorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AnchorList();
        }
    }
    
    /**
     * Gets array of all "anchor" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor[] getAnchorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ANCHOR$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor[] result = new org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "anchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor getAnchorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor)get_store().find_element_user(ANCHOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "anchor" element
     */
    public int sizeOfAnchorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANCHOR$0);
        }
    }
    
    /**
     * Sets array of all "anchor" element
     */
    public void setAnchorArray(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor[] anchorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(anchorArray, ANCHOR$0);
        }
    }
    
    /**
     * Sets ith "anchor" element
     */
    public void setAnchorArray(int i, org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor anchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor)get_store().find_element_user(ANCHOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(anchor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "anchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor insertNewAnchor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor)get_store().insert_element_user(ANCHOR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "anchor" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor addNewAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor)get_store().add_element_user(ANCHOR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "anchor" element
     */
    public void removeAnchor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANCHOR$0, i);
        }
    }
    
    /**
     * Gets a List of "inline" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline> getInlineList()
    {
        final class InlineList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline>
        {
            public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline get(int i)
                { return CTDrawingImpl.this.getInlineArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline set(int i, org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline o)
            {
                org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline old = CTDrawingImpl.this.getInlineArray(i);
                CTDrawingImpl.this.setInlineArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline o)
                { CTDrawingImpl.this.insertNewInline(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline old = CTDrawingImpl.this.getInlineArray(i);
                CTDrawingImpl.this.removeInline(i);
                return old;
            }
            
            public int size()
                { return CTDrawingImpl.this.sizeOfInlineArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InlineList();
        }
    }
    
    /**
     * Gets array of all "inline" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline[] getInlineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INLINE$2, targetList);
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline[] result = new org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "inline" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline getInlineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline)get_store().find_element_user(INLINE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "inline" element
     */
    public int sizeOfInlineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INLINE$2);
        }
    }
    
    /**
     * Sets array of all "inline" element
     */
    public void setInlineArray(org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline[] inlineArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(inlineArray, INLINE$2);
        }
    }
    
    /**
     * Sets ith "inline" element
     */
    public void setInlineArray(int i, org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline inline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline)get_store().find_element_user(INLINE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(inline);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "inline" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline insertNewInline(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline)get_store().insert_element_user(INLINE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "inline" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline addNewInline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline)get_store().add_element_user(INLINE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "inline" element
     */
    public void removeInline(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INLINE$2, i);
        }
    }
}
