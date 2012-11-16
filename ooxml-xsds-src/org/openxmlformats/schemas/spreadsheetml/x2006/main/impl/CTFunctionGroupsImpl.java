/*
 * XML Type:  CT_FunctionGroups
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroups
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_FunctionGroups(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFunctionGroupsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroups
{
    
    public CTFunctionGroupsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FUNCTIONGROUP$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "functionGroup");
    private static final javax.xml.namespace.QName BUILTINGROUPCOUNT$2 = 
        new javax.xml.namespace.QName("", "builtInGroupCount");
    
    
    /**
     * Gets a List of "functionGroup" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup> getFunctionGroupList()
    {
        final class FunctionGroupList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup get(int i)
                { return CTFunctionGroupsImpl.this.getFunctionGroupArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup old = CTFunctionGroupsImpl.this.getFunctionGroupArray(i);
                CTFunctionGroupsImpl.this.setFunctionGroupArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup o)
                { CTFunctionGroupsImpl.this.insertNewFunctionGroup(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup old = CTFunctionGroupsImpl.this.getFunctionGroupArray(i);
                CTFunctionGroupsImpl.this.removeFunctionGroup(i);
                return old;
            }
            
            public int size()
                { return CTFunctionGroupsImpl.this.sizeOfFunctionGroupArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FunctionGroupList();
        }
    }
    
    /**
     * Gets array of all "functionGroup" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup[] getFunctionGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FUNCTIONGROUP$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "functionGroup" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup getFunctionGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup)get_store().find_element_user(FUNCTIONGROUP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "functionGroup" element
     */
    public int sizeOfFunctionGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FUNCTIONGROUP$0);
        }
    }
    
    /**
     * Sets array of all "functionGroup" element
     */
    public void setFunctionGroupArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup[] functionGroupArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(functionGroupArray, FUNCTIONGROUP$0);
        }
    }
    
    /**
     * Sets ith "functionGroup" element
     */
    public void setFunctionGroupArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup functionGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup)get_store().find_element_user(FUNCTIONGROUP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(functionGroup);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "functionGroup" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup insertNewFunctionGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup)get_store().insert_element_user(FUNCTIONGROUP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "functionGroup" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup addNewFunctionGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFunctionGroup)get_store().add_element_user(FUNCTIONGROUP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "functionGroup" element
     */
    public void removeFunctionGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FUNCTIONGROUP$0, i);
        }
    }
    
    /**
     * Gets the "builtInGroupCount" attribute
     */
    public long getBuiltInGroupCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUILTINGROUPCOUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BUILTINGROUPCOUNT$2);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "builtInGroupCount" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetBuiltInGroupCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(BUILTINGROUPCOUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(BUILTINGROUPCOUNT$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "builtInGroupCount" attribute
     */
    public boolean isSetBuiltInGroupCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BUILTINGROUPCOUNT$2) != null;
        }
    }
    
    /**
     * Sets the "builtInGroupCount" attribute
     */
    public void setBuiltInGroupCount(long builtInGroupCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BUILTINGROUPCOUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BUILTINGROUPCOUNT$2);
            }
            target.setLongValue(builtInGroupCount);
        }
    }
    
    /**
     * Sets (as xml) the "builtInGroupCount" attribute
     */
    public void xsetBuiltInGroupCount(org.apache.xmlbeans.XmlUnsignedInt builtInGroupCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(BUILTINGROUPCOUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(BUILTINGROUPCOUNT$2);
            }
            target.set(builtInGroupCount);
        }
    }
    
    /**
     * Unsets the "builtInGroupCount" attribute
     */
    public void unsetBuiltInGroupCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BUILTINGROUPCOUNT$2);
        }
    }
}
