/*
 * XML Type:  CT_Choose
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_Choose(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTChooseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTChoose
{
    
    public CTChooseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IF$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "if");
    private static final javax.xml.namespace.QName ELSE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "else");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets a List of "if" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen> getIfList()
    {
        final class IfList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen get(int i)
                { return CTChooseImpl.this.getIfArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen old = CTChooseImpl.this.getIfArray(i);
                CTChooseImpl.this.setIfArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen o)
                { CTChooseImpl.this.insertNewIf(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen old = CTChooseImpl.this.getIfArray(i);
                CTChooseImpl.this.removeIf(i);
                return old;
            }
            
            public int size()
                { return CTChooseImpl.this.sizeOfIfArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IfList();
        }
    }
    
    /**
     * Gets array of all "if" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen[] getIfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IF$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "if" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen getIfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen)get_store().find_element_user(IF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "if" element
     */
    public int sizeOfIfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IF$0);
        }
    }
    
    /**
     * Sets array of all "if" element
     */
    public void setIfArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen[] xifArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xifArray, IF$0);
        }
    }
    
    /**
     * Sets ith "if" element
     */
    public void setIfArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen xif)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen)get_store().find_element_user(IF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xif);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "if" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen insertNewIf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen)get_store().insert_element_user(IF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "if" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen addNewIf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTWhen)get_store().add_element_user(IF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "if" element
     */
    public void removeIf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IF$0, i);
        }
    }
    
    /**
     * Gets the "else" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTOtherwise getElse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTOtherwise target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTOtherwise)get_store().find_element_user(ELSE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "else" element
     */
    public boolean isSetElse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELSE$2) != 0;
        }
    }
    
    /**
     * Sets the "else" element
     */
    public void setElse(org.openxmlformats.schemas.drawingml.x2006.diagram.CTOtherwise xelse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTOtherwise target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTOtherwise)get_store().find_element_user(ELSE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTOtherwise)get_store().add_element_user(ELSE$2);
            }
            target.set(xelse);
        }
    }
    
    /**
     * Appends and returns a new empty "else" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTOtherwise addNewElse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTOtherwise target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTOtherwise)get_store().add_element_user(ELSE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "else" element
     */
    public void unsetElse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELSE$2, 0);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NAME$4);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(NAME$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$4) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$4);
        }
    }
}
