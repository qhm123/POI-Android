/*
 * XML Type:  CT_Scenarios
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenarios
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Scenarios(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTScenariosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenarios
{
    
    public CTScenariosImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCENARIO$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "scenario");
    private static final javax.xml.namespace.QName CURRENT$2 = 
        new javax.xml.namespace.QName("", "current");
    private static final javax.xml.namespace.QName SHOW$4 = 
        new javax.xml.namespace.QName("", "show");
    private static final javax.xml.namespace.QName SQREF$6 = 
        new javax.xml.namespace.QName("", "sqref");
    
    
    /**
     * Gets a List of "scenario" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario> getScenarioList()
    {
        final class ScenarioList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario get(int i)
                { return CTScenariosImpl.this.getScenarioArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario old = CTScenariosImpl.this.getScenarioArray(i);
                CTScenariosImpl.this.setScenarioArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario o)
                { CTScenariosImpl.this.insertNewScenario(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario old = CTScenariosImpl.this.getScenarioArray(i);
                CTScenariosImpl.this.removeScenario(i);
                return old;
            }
            
            public int size()
                { return CTScenariosImpl.this.sizeOfScenarioArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ScenarioList();
        }
    }
    
    /**
     * Gets array of all "scenario" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario[] getScenarioArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCENARIO$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "scenario" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario getScenarioArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario)get_store().find_element_user(SCENARIO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "scenario" element
     */
    public int sizeOfScenarioArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCENARIO$0);
        }
    }
    
    /**
     * Sets array of all "scenario" element
     */
    public void setScenarioArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario[] scenarioArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(scenarioArray, SCENARIO$0);
        }
    }
    
    /**
     * Sets ith "scenario" element
     */
    public void setScenarioArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario scenario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario)get_store().find_element_user(SCENARIO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(scenario);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "scenario" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario insertNewScenario(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario)get_store().insert_element_user(SCENARIO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "scenario" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario addNewScenario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenario)get_store().add_element_user(SCENARIO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "scenario" element
     */
    public void removeScenario(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCENARIO$0, i);
        }
    }
    
    /**
     * Gets the "current" attribute
     */
    public long getCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENT$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "current" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CURRENT$2);
            return target;
        }
    }
    
    /**
     * True if has "current" attribute
     */
    public boolean isSetCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CURRENT$2) != null;
        }
    }
    
    /**
     * Sets the "current" attribute
     */
    public void setCurrent(long current)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURRENT$2);
            }
            target.setLongValue(current);
        }
    }
    
    /**
     * Sets (as xml) the "current" attribute
     */
    public void xsetCurrent(org.apache.xmlbeans.XmlUnsignedInt current)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CURRENT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(CURRENT$2);
            }
            target.set(current);
        }
    }
    
    /**
     * Unsets the "current" attribute
     */
    public void unsetCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CURRENT$2);
        }
    }
    
    /**
     * Gets the "show" attribute
     */
    public long getShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOW$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "show" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SHOW$4);
            return target;
        }
    }
    
    /**
     * True if has "show" attribute
     */
    public boolean isSetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOW$4) != null;
        }
    }
    
    /**
     * Sets the "show" attribute
     */
    public void setShow(long show)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOW$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOW$4);
            }
            target.setLongValue(show);
        }
    }
    
    /**
     * Sets (as xml) the "show" attribute
     */
    public void xsetShow(org.apache.xmlbeans.XmlUnsignedInt show)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SHOW$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SHOW$4);
            }
            target.set(show);
        }
    }
    
    /**
     * Unsets the "show" attribute
     */
    public void unsetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOW$4);
        }
    }
    
    /**
     * Gets the "sqref" attribute
     */
    public java.util.List getSqref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQREF$6);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "sqref" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref xgetSqref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().find_attribute_user(SQREF$6);
            return target;
        }
    }
    
    /**
     * True if has "sqref" attribute
     */
    public boolean isSetSqref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SQREF$6) != null;
        }
    }
    
    /**
     * Sets the "sqref" attribute
     */
    public void setSqref(java.util.List sqref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQREF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SQREF$6);
            }
            target.setListValue(sqref);
        }
    }
    
    /**
     * Sets (as xml) the "sqref" attribute
     */
    public void xsetSqref(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref sqref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().find_attribute_user(SQREF$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().add_attribute_user(SQREF$6);
            }
            target.set(sqref);
        }
    }
    
    /**
     * Unsets the "sqref" attribute
     */
    public void unsetSqref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SQREF$6);
        }
    }
}
