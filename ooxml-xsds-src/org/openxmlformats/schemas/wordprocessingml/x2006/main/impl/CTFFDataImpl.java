/*
 * XML Type:  CT_FFData
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_FFData(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFFDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData
{
    
    public CTFFDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "name");
    private static final javax.xml.namespace.QName ENABLED$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "enabled");
    private static final javax.xml.namespace.QName CALCONEXIT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "calcOnExit");
    private static final javax.xml.namespace.QName ENTRYMACRO$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "entryMacro");
    private static final javax.xml.namespace.QName EXITMACRO$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "exitMacro");
    private static final javax.xml.namespace.QName HELPTEXT$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "helpText");
    private static final javax.xml.namespace.QName STATUSTEXT$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "statusText");
    private static final javax.xml.namespace.QName CHECKBOX$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "checkBox");
    private static final javax.xml.namespace.QName DDLIST$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ddList");
    private static final javax.xml.namespace.QName TEXTINPUT$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "textInput");
    
    
    /**
     * Gets a List of "name" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName> getNameList()
    {
        final class NameList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName get(int i)
                { return CTFFDataImpl.this.getNameArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName old = CTFFDataImpl.this.getNameArray(i);
                CTFFDataImpl.this.setNameArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName o)
                { CTFFDataImpl.this.insertNewName(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName old = CTFFDataImpl.this.getNameArray(i);
                CTFFDataImpl.this.removeName(i);
                return old;
            }
            
            public int size()
                { return CTFFDataImpl.this.sizeOfNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NameList();
        }
    }
    
    /**
     * Gets array of all "name" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAME$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "name" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName getNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName)get_store().find_element_user(NAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "name" element
     */
    public int sizeOfNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0);
        }
    }
    
    /**
     * Sets array of all "name" element
     */
    public void setNameArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName[] nameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nameArray, NAME$0);
        }
    }
    
    /**
     * Sets ith "name" element
     */
    public void setNameArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName)get_store().find_element_user(NAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(name);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName insertNewName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName)get_store().insert_element_user(NAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "name" element
     */
    public void removeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, i);
        }
    }
    
    /**
     * Gets a List of "enabled" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getEnabledList()
    {
        final class EnabledList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTFFDataImpl.this.getEnabledArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTFFDataImpl.this.getEnabledArray(i);
                CTFFDataImpl.this.setEnabledArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTFFDataImpl.this.insertNewEnabled(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTFFDataImpl.this.getEnabledArray(i);
                CTFFDataImpl.this.removeEnabled(i);
                return old;
            }
            
            public int size()
                { return CTFFDataImpl.this.sizeOfEnabledArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EnabledList();
        }
    }
    
    /**
     * Gets array of all "enabled" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getEnabledArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENABLED$2, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "enabled" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getEnabledArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(ENABLED$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "enabled" element
     */
    public int sizeOfEnabledArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENABLED$2);
        }
    }
    
    /**
     * Sets array of all "enabled" element
     */
    public void setEnabledArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] enabledArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(enabledArray, ENABLED$2);
        }
    }
    
    /**
     * Sets ith "enabled" element
     */
    public void setEnabledArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff enabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(ENABLED$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(enabled);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "enabled" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewEnabled(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(ENABLED$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "enabled" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(ENABLED$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "enabled" element
     */
    public void removeEnabled(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENABLED$2, i);
        }
    }
    
    /**
     * Gets a List of "calcOnExit" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getCalcOnExitList()
    {
        final class CalcOnExitList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTFFDataImpl.this.getCalcOnExitArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTFFDataImpl.this.getCalcOnExitArray(i);
                CTFFDataImpl.this.setCalcOnExitArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTFFDataImpl.this.insertNewCalcOnExit(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTFFDataImpl.this.getCalcOnExitArray(i);
                CTFFDataImpl.this.removeCalcOnExit(i);
                return old;
            }
            
            public int size()
                { return CTFFDataImpl.this.sizeOfCalcOnExitArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CalcOnExitList();
        }
    }
    
    /**
     * Gets array of all "calcOnExit" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getCalcOnExitArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CALCONEXIT$4, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "calcOnExit" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getCalcOnExitArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(CALCONEXIT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "calcOnExit" element
     */
    public int sizeOfCalcOnExitArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALCONEXIT$4);
        }
    }
    
    /**
     * Sets array of all "calcOnExit" element
     */
    public void setCalcOnExitArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] calcOnExitArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(calcOnExitArray, CALCONEXIT$4);
        }
    }
    
    /**
     * Sets ith "calcOnExit" element
     */
    public void setCalcOnExitArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff calcOnExit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(CALCONEXIT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(calcOnExit);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "calcOnExit" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewCalcOnExit(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(CALCONEXIT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "calcOnExit" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewCalcOnExit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(CALCONEXIT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "calcOnExit" element
     */
    public void removeCalcOnExit(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALCONEXIT$4, i);
        }
    }
    
    /**
     * Gets a List of "entryMacro" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName> getEntryMacroList()
    {
        final class EntryMacroList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName get(int i)
                { return CTFFDataImpl.this.getEntryMacroArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName old = CTFFDataImpl.this.getEntryMacroArray(i);
                CTFFDataImpl.this.setEntryMacroArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName o)
                { CTFFDataImpl.this.insertNewEntryMacro(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName old = CTFFDataImpl.this.getEntryMacroArray(i);
                CTFFDataImpl.this.removeEntryMacro(i);
                return old;
            }
            
            public int size()
                { return CTFFDataImpl.this.sizeOfEntryMacroArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EntryMacroList();
        }
    }
    
    /**
     * Gets array of all "entryMacro" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName[] getEntryMacroArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTRYMACRO$6, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entryMacro" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName getEntryMacroArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName)get_store().find_element_user(ENTRYMACRO$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entryMacro" element
     */
    public int sizeOfEntryMacroArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTRYMACRO$6);
        }
    }
    
    /**
     * Sets array of all "entryMacro" element
     */
    public void setEntryMacroArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName[] entryMacroArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entryMacroArray, ENTRYMACRO$6);
        }
    }
    
    /**
     * Sets ith "entryMacro" element
     */
    public void setEntryMacroArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName entryMacro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName)get_store().find_element_user(ENTRYMACRO$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entryMacro);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entryMacro" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName insertNewEntryMacro(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName)get_store().insert_element_user(ENTRYMACRO$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entryMacro" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName addNewEntryMacro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName)get_store().add_element_user(ENTRYMACRO$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "entryMacro" element
     */
    public void removeEntryMacro(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTRYMACRO$6, i);
        }
    }
    
    /**
     * Gets a List of "exitMacro" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName> getExitMacroList()
    {
        final class ExitMacroList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName get(int i)
                { return CTFFDataImpl.this.getExitMacroArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName old = CTFFDataImpl.this.getExitMacroArray(i);
                CTFFDataImpl.this.setExitMacroArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName o)
                { CTFFDataImpl.this.insertNewExitMacro(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName old = CTFFDataImpl.this.getExitMacroArray(i);
                CTFFDataImpl.this.removeExitMacro(i);
                return old;
            }
            
            public int size()
                { return CTFFDataImpl.this.sizeOfExitMacroArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ExitMacroList();
        }
    }
    
    /**
     * Gets array of all "exitMacro" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName[] getExitMacroArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXITMACRO$8, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "exitMacro" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName getExitMacroArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName)get_store().find_element_user(EXITMACRO$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "exitMacro" element
     */
    public int sizeOfExitMacroArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXITMACRO$8);
        }
    }
    
    /**
     * Sets array of all "exitMacro" element
     */
    public void setExitMacroArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName[] exitMacroArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(exitMacroArray, EXITMACRO$8);
        }
    }
    
    /**
     * Sets ith "exitMacro" element
     */
    public void setExitMacroArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName exitMacro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName)get_store().find_element_user(EXITMACRO$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(exitMacro);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "exitMacro" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName insertNewExitMacro(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName)get_store().insert_element_user(EXITMACRO$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "exitMacro" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName addNewExitMacro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName)get_store().add_element_user(EXITMACRO$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "exitMacro" element
     */
    public void removeExitMacro(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXITMACRO$8, i);
        }
    }
    
    /**
     * Gets a List of "helpText" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText> getHelpTextList()
    {
        final class HelpTextList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText get(int i)
                { return CTFFDataImpl.this.getHelpTextArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText old = CTFFDataImpl.this.getHelpTextArray(i);
                CTFFDataImpl.this.setHelpTextArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText o)
                { CTFFDataImpl.this.insertNewHelpText(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText old = CTFFDataImpl.this.getHelpTextArray(i);
                CTFFDataImpl.this.removeHelpText(i);
                return old;
            }
            
            public int size()
                { return CTFFDataImpl.this.sizeOfHelpTextArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HelpTextList();
        }
    }
    
    /**
     * Gets array of all "helpText" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText[] getHelpTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HELPTEXT$10, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "helpText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText getHelpTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText)get_store().find_element_user(HELPTEXT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "helpText" element
     */
    public int sizeOfHelpTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HELPTEXT$10);
        }
    }
    
    /**
     * Sets array of all "helpText" element
     */
    public void setHelpTextArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText[] helpTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(helpTextArray, HELPTEXT$10);
        }
    }
    
    /**
     * Sets ith "helpText" element
     */
    public void setHelpTextArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText helpText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText)get_store().find_element_user(HELPTEXT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(helpText);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "helpText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText insertNewHelpText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText)get_store().insert_element_user(HELPTEXT$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "helpText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText addNewHelpText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText)get_store().add_element_user(HELPTEXT$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "helpText" element
     */
    public void removeHelpText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HELPTEXT$10, i);
        }
    }
    
    /**
     * Gets a List of "statusText" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText> getStatusTextList()
    {
        final class StatusTextList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText get(int i)
                { return CTFFDataImpl.this.getStatusTextArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText old = CTFFDataImpl.this.getStatusTextArray(i);
                CTFFDataImpl.this.setStatusTextArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText o)
                { CTFFDataImpl.this.insertNewStatusText(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText old = CTFFDataImpl.this.getStatusTextArray(i);
                CTFFDataImpl.this.removeStatusText(i);
                return old;
            }
            
            public int size()
                { return CTFFDataImpl.this.sizeOfStatusTextArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new StatusTextList();
        }
    }
    
    /**
     * Gets array of all "statusText" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText[] getStatusTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STATUSTEXT$12, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "statusText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText getStatusTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText)get_store().find_element_user(STATUSTEXT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "statusText" element
     */
    public int sizeOfStatusTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSTEXT$12);
        }
    }
    
    /**
     * Sets array of all "statusText" element
     */
    public void setStatusTextArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText[] statusTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(statusTextArray, STATUSTEXT$12);
        }
    }
    
    /**
     * Sets ith "statusText" element
     */
    public void setStatusTextArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText statusText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText)get_store().find_element_user(STATUSTEXT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(statusText);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "statusText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText insertNewStatusText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText)get_store().insert_element_user(STATUSTEXT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "statusText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText addNewStatusText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText)get_store().add_element_user(STATUSTEXT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "statusText" element
     */
    public void removeStatusText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSTEXT$12, i);
        }
    }
    
    /**
     * Gets a List of "checkBox" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox> getCheckBoxList()
    {
        final class CheckBoxList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox get(int i)
                { return CTFFDataImpl.this.getCheckBoxArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox old = CTFFDataImpl.this.getCheckBoxArray(i);
                CTFFDataImpl.this.setCheckBoxArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox o)
                { CTFFDataImpl.this.insertNewCheckBox(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox old = CTFFDataImpl.this.getCheckBoxArray(i);
                CTFFDataImpl.this.removeCheckBox(i);
                return old;
            }
            
            public int size()
                { return CTFFDataImpl.this.sizeOfCheckBoxArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CheckBoxList();
        }
    }
    
    /**
     * Gets array of all "checkBox" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox[] getCheckBoxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHECKBOX$14, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "checkBox" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox getCheckBoxArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox)get_store().find_element_user(CHECKBOX$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "checkBox" element
     */
    public int sizeOfCheckBoxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHECKBOX$14);
        }
    }
    
    /**
     * Sets array of all "checkBox" element
     */
    public void setCheckBoxArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox[] checkBoxArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(checkBoxArray, CHECKBOX$14);
        }
    }
    
    /**
     * Sets ith "checkBox" element
     */
    public void setCheckBoxArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox checkBox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox)get_store().find_element_user(CHECKBOX$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(checkBox);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "checkBox" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox insertNewCheckBox(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox)get_store().insert_element_user(CHECKBOX$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "checkBox" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox addNewCheckBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox)get_store().add_element_user(CHECKBOX$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "checkBox" element
     */
    public void removeCheckBox(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHECKBOX$14, i);
        }
    }
    
    /**
     * Gets a List of "ddList" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList> getDdListList()
    {
        final class DdListList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList get(int i)
                { return CTFFDataImpl.this.getDdListArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList old = CTFFDataImpl.this.getDdListArray(i);
                CTFFDataImpl.this.setDdListArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList o)
                { CTFFDataImpl.this.insertNewDdList(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList old = CTFFDataImpl.this.getDdListArray(i);
                CTFFDataImpl.this.removeDdList(i);
                return old;
            }
            
            public int size()
                { return CTFFDataImpl.this.sizeOfDdListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DdListList();
        }
    }
    
    /**
     * Gets array of all "ddList" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList[] getDdListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DDLIST$16, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ddList" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList getDdListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList)get_store().find_element_user(DDLIST$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ddList" element
     */
    public int sizeOfDdListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DDLIST$16);
        }
    }
    
    /**
     * Sets array of all "ddList" element
     */
    public void setDdListArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList[] ddListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ddListArray, DDLIST$16);
        }
    }
    
    /**
     * Sets ith "ddList" element
     */
    public void setDdListArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList ddList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList)get_store().find_element_user(DDLIST$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ddList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ddList" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList insertNewDdList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList)get_store().insert_element_user(DDLIST$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ddList" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList addNewDdList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList)get_store().add_element_user(DDLIST$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "ddList" element
     */
    public void removeDdList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DDLIST$16, i);
        }
    }
    
    /**
     * Gets a List of "textInput" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput> getTextInputList()
    {
        final class TextInputList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput get(int i)
                { return CTFFDataImpl.this.getTextInputArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput old = CTFFDataImpl.this.getTextInputArray(i);
                CTFFDataImpl.this.setTextInputArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput o)
                { CTFFDataImpl.this.insertNewTextInput(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput old = CTFFDataImpl.this.getTextInputArray(i);
                CTFFDataImpl.this.removeTextInput(i);
                return old;
            }
            
            public int size()
                { return CTFFDataImpl.this.sizeOfTextInputArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TextInputList();
        }
    }
    
    /**
     * Gets array of all "textInput" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput[] getTextInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TEXTINPUT$18, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "textInput" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput getTextInputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput)get_store().find_element_user(TEXTINPUT$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "textInput" element
     */
    public int sizeOfTextInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTINPUT$18);
        }
    }
    
    /**
     * Sets array of all "textInput" element
     */
    public void setTextInputArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput[] textInputArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(textInputArray, TEXTINPUT$18);
        }
    }
    
    /**
     * Sets ith "textInput" element
     */
    public void setTextInputArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput textInput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput)get_store().find_element_user(TEXTINPUT$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(textInput);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "textInput" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput insertNewTextInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput)get_store().insert_element_user(TEXTINPUT$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "textInput" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput addNewTextInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput)get_store().add_element_user(TEXTINPUT$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "textInput" element
     */
    public void removeTextInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTINPUT$18, i);
        }
    }
}
