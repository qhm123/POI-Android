/*
 * XML Type:  CT_Scenario
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Scenario(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTScenarioImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario
{
    
    public CTScenarioImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INPUTCELLS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "inputCells");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName LOCKED$4 = 
        new javax.xml.namespace.QName("", "locked");
    private static final javax.xml.namespace.QName HIDDEN$6 = 
        new javax.xml.namespace.QName("", "hidden");
    private static final javax.xml.namespace.QName COUNT$8 = 
        new javax.xml.namespace.QName("", "count");
    private static final javax.xml.namespace.QName USER$10 = 
        new javax.xml.namespace.QName("", "user");
    private static final javax.xml.namespace.QName COMMENT$12 = 
        new javax.xml.namespace.QName("", "comment");
    
    
    /**
     * Gets a List of "inputCells" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells> getInputCellsList()
    {
        final class InputCellsList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells get(int i)
                { return CTScenarioImpl.this.getInputCellsArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells old = CTScenarioImpl.this.getInputCellsArray(i);
                CTScenarioImpl.this.setInputCellsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells o)
                { CTScenarioImpl.this.insertNewInputCells(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells old = CTScenarioImpl.this.getInputCellsArray(i);
                CTScenarioImpl.this.removeInputCells(i);
                return old;
            }
            
            public int size()
                { return CTScenarioImpl.this.sizeOfInputCellsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InputCellsList();
        }
    }
    
    /**
     * Gets array of all "inputCells" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells[] getInputCellsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INPUTCELLS$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "inputCells" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells getInputCellsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells)get_store().find_element_user(INPUTCELLS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "inputCells" element
     */
    public int sizeOfInputCellsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUTCELLS$0);
        }
    }
    
    /**
     * Sets array of all "inputCells" element
     */
    public void setInputCellsArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells[] inputCellsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(inputCellsArray, INPUTCELLS$0);
        }
    }
    
    /**
     * Sets ith "inputCells" element
     */
    public void setInputCellsArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells inputCells)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells)get_store().find_element_user(INPUTCELLS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(inputCells);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "inputCells" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells insertNewInputCells(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells)get_store().insert_element_user(INPUTCELLS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "inputCells" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells addNewInputCells()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTInputCells)get_store().add_element_user(INPUTCELLS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "inputCells" element
     */
    public void removeInputCells(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUTCELLS$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$2);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "locked" attribute
     */
    public boolean getLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCKED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOCKED$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "locked" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCKED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LOCKED$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "locked" attribute
     */
    public boolean isSetLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCKED$4) != null;
        }
    }
    
    /**
     * Sets the "locked" attribute
     */
    public void setLocked(boolean locked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCKED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCKED$4);
            }
            target.setBooleanValue(locked);
        }
    }
    
    /**
     * Sets (as xml) the "locked" attribute
     */
    public void xsetLocked(org.apache.xmlbeans.XmlBoolean locked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCKED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOCKED$4);
            }
            target.set(locked);
        }
    }
    
    /**
     * Unsets the "locked" attribute
     */
    public void unsetLocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCKED$4);
        }
    }
    
    /**
     * Gets the "hidden" attribute
     */
    public boolean getHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDDEN$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hidden" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(HIDDEN$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "hidden" attribute
     */
    public boolean isSetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIDDEN$6) != null;
        }
    }
    
    /**
     * Sets the "hidden" attribute
     */
    public void setHidden(boolean hidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDDEN$6);
            }
            target.setBooleanValue(hidden);
        }
    }
    
    /**
     * Sets (as xml) the "hidden" attribute
     */
    public void xsetHidden(org.apache.xmlbeans.XmlBoolean hidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDDEN$6);
            }
            target.set(hidden);
        }
    }
    
    /**
     * Unsets the "hidden" attribute
     */
    public void unsetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIDDEN$6);
        }
    }
    
    /**
     * Gets the "count" attribute
     */
    public long getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$8);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "count" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$8);
            return target;
        }
    }
    
    /**
     * True if has "count" attribute
     */
    public boolean isSetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNT$8) != null;
        }
    }
    
    /**
     * Sets the "count" attribute
     */
    public void setCount(long count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$8);
            }
            target.setLongValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "count" attribute
     */
    public void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$8);
            }
            target.set(count);
        }
    }
    
    /**
     * Unsets the "count" attribute
     */
    public void unsetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNT$8);
        }
    }
    
    /**
     * Gets the "user" attribute
     */
    public java.lang.String getUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USER$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "user" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(USER$10);
            return target;
        }
    }
    
    /**
     * True if has "user" attribute
     */
    public boolean isSetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USER$10) != null;
        }
    }
    
    /**
     * Sets the "user" attribute
     */
    public void setUser(java.lang.String user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USER$10);
            }
            target.setStringValue(user);
        }
    }
    
    /**
     * Sets (as xml) the "user" attribute
     */
    public void xsetUser(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(USER$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(USER$10);
            }
            target.set(user);
        }
    }
    
    /**
     * Unsets the "user" attribute
     */
    public void unsetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USER$10);
        }
    }
    
    /**
     * Gets the "comment" attribute
     */
    public java.lang.String getComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMENT$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "comment" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(COMMENT$12);
            return target;
        }
    }
    
    /**
     * True if has "comment" attribute
     */
    public boolean isSetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMMENT$12) != null;
        }
    }
    
    /**
     * Sets the "comment" attribute
     */
    public void setComment(java.lang.String comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMENT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMMENT$12);
            }
            target.setStringValue(comment);
        }
    }
    
    /**
     * Sets (as xml) the "comment" attribute
     */
    public void xsetComment(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(COMMENT$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(COMMENT$12);
            }
            target.set(comment);
        }
    }
    
    /**
     * Unsets the "comment" attribute
     */
    public void unsetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMMENT$12);
        }
    }
}
