/*
 * XML Type:  CT_TextBody
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TextBody(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTextBodyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody
{
    
    public CTTextBodyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BODYPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "bodyPr");
    private static final javax.xml.namespace.QName LSTSTYLE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lstStyle");
    private static final javax.xml.namespace.QName P$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "p");
    
    
    /**
     * Gets the "bodyPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties getBodyPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties)get_store().find_element_user(BODYPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "bodyPr" element
     */
    public void setBodyPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties bodyPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties)get_store().find_element_user(BODYPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties)get_store().add_element_user(BODYPR$0);
            }
            target.set(bodyPr);
        }
    }
    
    /**
     * Appends and returns a new empty "bodyPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties addNewBodyPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties)get_store().add_element_user(BODYPR$0);
            return target;
        }
    }
    
    /**
     * Gets the "lstStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle getLstStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().find_element_user(LSTSTYLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lstStyle" element
     */
    public boolean isSetLstStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LSTSTYLE$2) != 0;
        }
    }
    
    /**
     * Sets the "lstStyle" element
     */
    public void setLstStyle(org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle lstStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().find_element_user(LSTSTYLE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().add_element_user(LSTSTYLE$2);
            }
            target.set(lstStyle);
        }
    }
    
    /**
     * Appends and returns a new empty "lstStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle addNewLstStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().add_element_user(LSTSTYLE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "lstStyle" element
     */
    public void unsetLstStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LSTSTYLE$2, 0);
        }
    }
    
    /**
     * Gets a List of "p" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph> getPList()
    {
        final class PList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph>
        {
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph get(int i)
                { return CTTextBodyImpl.this.getPArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph set(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph o)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph old = CTTextBodyImpl.this.getPArray(i);
                CTTextBodyImpl.this.setPArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph o)
                { CTTextBodyImpl.this.insertNewP(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph old = CTTextBodyImpl.this.getPArray(i);
                CTTextBodyImpl.this.removeP(i);
                return old;
            }
            
            public int size()
                { return CTTextBodyImpl.this.sizeOfPArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PList();
        }
    }
    
    /**
     * Gets array of all "p" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph[] getPArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(P$4, targetList);
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph[] result = new org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "p" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph getPArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph)get_store().find_element_user(P$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "p" element
     */
    public int sizeOfPArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(P$4);
        }
    }
    
    /**
     * Sets array of all "p" element
     */
    public void setPArray(org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph[] pArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pArray, P$4);
        }
    }
    
    /**
     * Sets ith "p" element
     */
    public void setPArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph p)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph)get_store().find_element_user(P$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(p);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "p" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph insertNewP(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph)get_store().insert_element_user(P$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "p" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph addNewP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph)get_store().add_element_user(P$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "p" element
     */
    public void removeP(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(P$4, i);
        }
    }
}
