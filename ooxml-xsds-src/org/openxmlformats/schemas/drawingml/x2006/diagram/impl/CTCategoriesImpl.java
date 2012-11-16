/*
 * XML Type:  CT_Categories
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategories
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_Categories(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTCategoriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategories
{
    
    public CTCategoriesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "cat");
    
    
    /**
     * Gets a List of "cat" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory> getCatList()
    {
        final class CatList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory get(int i)
                { return CTCategoriesImpl.this.getCatArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory old = CTCategoriesImpl.this.getCatArray(i);
                CTCategoriesImpl.this.setCatArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory o)
                { CTCategoriesImpl.this.insertNewCat(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory old = CTCategoriesImpl.this.getCatArray(i);
                CTCategoriesImpl.this.removeCat(i);
                return old;
            }
            
            public int size()
                { return CTCategoriesImpl.this.sizeOfCatArray(); }
            
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
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory[] getCatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAT$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cat" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory getCatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory)get_store().find_element_user(CAT$0, i);
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
    public void setCatArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory[] catArray)
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
    public void setCatArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory cat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory)get_store().find_element_user(CAT$0, i);
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
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory insertNewCat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory)get_store().insert_element_user(CAT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cat" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory addNewCat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTCategory)get_store().add_element_user(CAT$0);
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
