/*
 * XML Type:  CT_Constraints
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram.impl;
/**
 * An XML CT_Constraints(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is a complex type.
 */
public class CTConstraintsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraints
{
    
    public CTConstraintsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSTR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/diagram", "constr");
    
    
    /**
     * Gets a List of "constr" elements
     */
    public java.util.List<org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint> getConstrList()
    {
        final class ConstrList extends java.util.AbstractList<org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint>
        {
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint get(int i)
                { return CTConstraintsImpl.this.getConstrArray(i); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint set(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint o)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint old = CTConstraintsImpl.this.getConstrArray(i);
                CTConstraintsImpl.this.setConstrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint o)
                { CTConstraintsImpl.this.insertNewConstr(i).set(o); }
            
            public org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint remove(int i)
            {
                org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint old = CTConstraintsImpl.this.getConstrArray(i);
                CTConstraintsImpl.this.removeConstr(i);
                return old;
            }
            
            public int size()
                { return CTConstraintsImpl.this.sizeOfConstrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ConstrList();
        }
    }
    
    /**
     * Gets array of all "constr" elements
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint[] getConstrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONSTR$0, targetList);
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint[] result = new org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "constr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint getConstrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint)get_store().find_element_user(CONSTR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "constr" element
     */
    public int sizeOfConstrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSTR$0);
        }
    }
    
    /**
     * Sets array of all "constr" element
     */
    public void setConstrArray(org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint[] constrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(constrArray, CONSTR$0);
        }
    }
    
    /**
     * Sets ith "constr" element
     */
    public void setConstrArray(int i, org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint constr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint)get_store().find_element_user(CONSTR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(constr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "constr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint insertNewConstr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint)get_store().insert_element_user(CONSTR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "constr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint addNewConstr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.diagram.CTConstraint)get_store().add_element_user(CONSTR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "constr" element
     */
    public void removeConstr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSTR$0, i);
        }
    }
}
