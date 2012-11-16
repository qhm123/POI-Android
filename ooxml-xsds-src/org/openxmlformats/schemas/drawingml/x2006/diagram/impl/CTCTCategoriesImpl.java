/*
 * XML Type:  CT_CTCategories
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_CTCategories(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTCTCategoriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategories
{
    
    public CTCTCategoriesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "cat");
    
    
    /**
     * Gets a List of "cat" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory> getCatList()
    {
        final class CatList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory get(int i)
                { return CTCTCategoriesImpl.this.getCatArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory old = CTCTCategoriesImpl.this.getCatArray(i);
                CTCTCategoriesImpl.this.setCatArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory o)
                { CTCTCategoriesImpl.this.insertNewCat(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory old = CTCTCategoriesImpl.this.getCatArray(i);
                CTCTCategoriesImpl.this.removeCat(i);
                return old;
            }
            
            public int size()
                { return CTCTCategoriesImpl.this.sizeOfCatArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CatList();
        }
    }
    
    /**
     * Gets array of all "cat" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory[] getCatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAT$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cat" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory getCatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory)get_store().find_element_user(CAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cat" element
     */
    public int sizeOfCatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAT$0);
        }
    }
    
    /**
     * Sets array of all "cat" element
     */
    public void setCatArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory[] catArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(catArray, CAT$0);
        }
    }
    
    /**
     * Sets ith "cat" element
     */
    public void setCatArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory cat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory)get_store().find_element_user(CAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cat" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory insertNewCat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory)get_store().insert_element_user(CAT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cat" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory addNewCat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCTCategory)get_store().add_element_user(CAT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cat" element
     */
    public void removeCat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAT$0, i);
        }
    }
}
