/*
 * XML Type:  CT_Controls
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControls
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Controls(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTControlsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControls
{
    
    public CTControlsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTROL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "control");
    
    
    /**
     * Gets a List of "control" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl> getControlList()
    {
        final class ControlList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl get(int i)
                { return CTControlsImpl.this.getControlArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl old = CTControlsImpl.this.getControlArray(i);
                CTControlsImpl.this.setControlArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl o)
                { CTControlsImpl.this.insertNewControl(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl old = CTControlsImpl.this.getControlArray(i);
                CTControlsImpl.this.removeControl(i);
                return old;
            }
            
            public int size()
                { return CTControlsImpl.this.sizeOfControlArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ControlList();
        }
    }
    
    /**
     * Gets array of all "control" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl[] getControlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTROL$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "control" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl getControlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl)get_store().find_element_user(CONTROL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "control" element
     */
    public int sizeOfControlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTROL$0);
        }
    }
    
    /**
     * Sets array of all "control" element
     */
    public void setControlArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl[] controlArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(controlArray, CONTROL$0);
        }
    }
    
    /**
     * Sets ith "control" element
     */
    public void setControlArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl control)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl)get_store().find_element_user(CONTROL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(control);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "control" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl insertNewControl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl)get_store().insert_element_user(CONTROL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "control" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl addNewControl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControl)get_store().add_element_user(CONTROL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "control" element
     */
    public void removeControl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTROL$0, i);
        }
    }
}
