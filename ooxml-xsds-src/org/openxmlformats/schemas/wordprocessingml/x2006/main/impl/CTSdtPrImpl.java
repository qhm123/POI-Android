/*
 * XML Type:  CT_SdtPr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_SdtPr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTSdtPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtPr
{
    
    public CTSdtPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPr");
    private static final javax.xml.namespace.QName ALIAS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "alias");
    private static final javax.xml.namespace.QName LOCK$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lock");
    private static final javax.xml.namespace.QName PLACEHOLDER$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "placeholder");
    private static final javax.xml.namespace.QName SHOWINGPLCHDR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "showingPlcHdr");
    private static final javax.xml.namespace.QName DATABINDING$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dataBinding");
    private static final javax.xml.namespace.QName TEMPORARY$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "temporary");
    private static final javax.xml.namespace.QName ID$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "id");
    private static final javax.xml.namespace.QName TAG$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tag");
    private static final javax.xml.namespace.QName EQUATION$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "equation");
    private static final javax.xml.namespace.QName COMBOBOX$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "comboBox");
    private static final javax.xml.namespace.QName DATE$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "date");
    private static final javax.xml.namespace.QName DOCPARTOBJ$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docPartObj");
    private static final javax.xml.namespace.QName DOCPARTLIST$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docPartList");
    private static final javax.xml.namespace.QName DROPDOWNLIST$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dropDownList");
    private static final javax.xml.namespace.QName PICTURE$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "picture");
    private static final javax.xml.namespace.QName RICHTEXT$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "richText");
    private static final javax.xml.namespace.QName TEXT$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "text");
    private static final javax.xml.namespace.QName CITATION$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "citation");
    private static final javax.xml.namespace.QName GROUP$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "group");
    private static final javax.xml.namespace.QName BIBLIOGRAPHY$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bibliography");
    
    
    /**
     * Gets a List of "rPr" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr> getRPrList()
    {
        final class RPrList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr get(int i)
                { return CTSdtPrImpl.this.getRPrArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr old = CTSdtPrImpl.this.getRPrArray(i);
                CTSdtPrImpl.this.setRPrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr o)
                { CTSdtPrImpl.this.insertNewRPr(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr old = CTSdtPrImpl.this.getRPrArray(i);
                CTSdtPrImpl.this.removeRPr(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfRPrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RPrList();
        }
    }
    
    /**
     * Gets array of all "rPr" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr[] getRPrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RPR$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr getRPrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().find_element_user(RPR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rPr" element
     */
    public int sizeOfRPrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RPR$0);
        }
    }
    
    /**
     * Sets array of all "rPr" element
     */
    public void setRPrArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr[] rPrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rPrArray, RPR$0);
        }
    }
    
    /**
     * Sets ith "rPr" element
     */
    public void setRPrArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr rPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().find_element_user(RPR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rPr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr insertNewRPr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().insert_element_user(RPR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr addNewRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr)get_store().add_element_user(RPR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "rPr" element
     */
    public void removeRPr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RPR$0, i);
        }
    }
    
    /**
     * Gets a List of "alias" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString> getAliasList()
    {
        final class AliasList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString get(int i)
                { return CTSdtPrImpl.this.getAliasArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString old = CTSdtPrImpl.this.getAliasArray(i);
                CTSdtPrImpl.this.setAliasArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString o)
                { CTSdtPrImpl.this.insertNewAlias(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString old = CTSdtPrImpl.this.getAliasArray(i);
                CTSdtPrImpl.this.removeAlias(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfAliasArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AliasList();
        }
    }
    
    /**
     * Gets array of all "alias" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] getAliasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALIAS$2, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "alias" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getAliasArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(ALIAS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "alias" element
     */
    public int sizeOfAliasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALIAS$2);
        }
    }
    
    /**
     * Sets array of all "alias" element
     */
    public void setAliasArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] aliasArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(aliasArray, ALIAS$2);
        }
    }
    
    /**
     * Sets ith "alias" element
     */
    public void setAliasArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString alias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(ALIAS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alias);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alias" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString insertNewAlias(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().insert_element_user(ALIAS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alias" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(ALIAS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "alias" element
     */
    public void removeAlias(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALIAS$2, i);
        }
    }
    
    /**
     * Gets a List of "lock" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock> getLockList()
    {
        final class LockList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock get(int i)
                { return CTSdtPrImpl.this.getLockArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock old = CTSdtPrImpl.this.getLockArray(i);
                CTSdtPrImpl.this.setLockArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock o)
                { CTSdtPrImpl.this.insertNewLock(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock old = CTSdtPrImpl.this.getLockArray(i);
                CTSdtPrImpl.this.removeLock(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfLockArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LockList();
        }
    }
    
    /**
     * Gets array of all "lock" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock[] getLockArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCK$4, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lock" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock getLockArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock)get_store().find_element_user(LOCK$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lock" element
     */
    public int sizeOfLockArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCK$4);
        }
    }
    
    /**
     * Sets array of all "lock" element
     */
    public void setLockArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock[] lockArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lockArray, LOCK$4);
        }
    }
    
    /**
     * Sets ith "lock" element
     */
    public void setLockArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock lock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock)get_store().find_element_user(LOCK$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lock);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lock" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock insertNewLock(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock)get_store().insert_element_user(LOCK$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lock" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock addNewLock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock)get_store().add_element_user(LOCK$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "lock" element
     */
    public void removeLock(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCK$4, i);
        }
    }
    
    /**
     * Gets a List of "placeholder" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder> getPlaceholderList()
    {
        final class PlaceholderList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder get(int i)
                { return CTSdtPrImpl.this.getPlaceholderArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder old = CTSdtPrImpl.this.getPlaceholderArray(i);
                CTSdtPrImpl.this.setPlaceholderArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder o)
                { CTSdtPrImpl.this.insertNewPlaceholder(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder old = CTSdtPrImpl.this.getPlaceholderArray(i);
                CTSdtPrImpl.this.removePlaceholder(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfPlaceholderArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PlaceholderList();
        }
    }
    
    /**
     * Gets array of all "placeholder" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder[] getPlaceholderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PLACEHOLDER$6, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "placeholder" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder getPlaceholderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder)get_store().find_element_user(PLACEHOLDER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "placeholder" element
     */
    public int sizeOfPlaceholderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLACEHOLDER$6);
        }
    }
    
    /**
     * Sets array of all "placeholder" element
     */
    public void setPlaceholderArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder[] placeholderArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(placeholderArray, PLACEHOLDER$6);
        }
    }
    
    /**
     * Sets ith "placeholder" element
     */
    public void setPlaceholderArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder placeholder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder)get_store().find_element_user(PLACEHOLDER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(placeholder);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "placeholder" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder insertNewPlaceholder(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder)get_store().insert_element_user(PLACEHOLDER$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "placeholder" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder addNewPlaceholder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder)get_store().add_element_user(PLACEHOLDER$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "placeholder" element
     */
    public void removePlaceholder(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLACEHOLDER$6, i);
        }
    }
    
    /**
     * Gets a List of "showingPlcHdr" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getShowingPlcHdrList()
    {
        final class ShowingPlcHdrList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTSdtPrImpl.this.getShowingPlcHdrArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTSdtPrImpl.this.getShowingPlcHdrArray(i);
                CTSdtPrImpl.this.setShowingPlcHdrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTSdtPrImpl.this.insertNewShowingPlcHdr(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTSdtPrImpl.this.getShowingPlcHdrArray(i);
                CTSdtPrImpl.this.removeShowingPlcHdr(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfShowingPlcHdrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ShowingPlcHdrList();
        }
    }
    
    /**
     * Gets array of all "showingPlcHdr" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getShowingPlcHdrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHOWINGPLCHDR$8, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "showingPlcHdr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getShowingPlcHdrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SHOWINGPLCHDR$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "showingPlcHdr" element
     */
    public int sizeOfShowingPlcHdrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWINGPLCHDR$8);
        }
    }
    
    /**
     * Sets array of all "showingPlcHdr" element
     */
    public void setShowingPlcHdrArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] showingPlcHdrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(showingPlcHdrArray, SHOWINGPLCHDR$8);
        }
    }
    
    /**
     * Sets ith "showingPlcHdr" element
     */
    public void setShowingPlcHdrArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff showingPlcHdr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SHOWINGPLCHDR$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(showingPlcHdr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "showingPlcHdr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewShowingPlcHdr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(SHOWINGPLCHDR$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "showingPlcHdr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewShowingPlcHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SHOWINGPLCHDR$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "showingPlcHdr" element
     */
    public void removeShowingPlcHdr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWINGPLCHDR$8, i);
        }
    }
    
    /**
     * Gets a List of "dataBinding" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding> getDataBindingList()
    {
        final class DataBindingList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding get(int i)
                { return CTSdtPrImpl.this.getDataBindingArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding old = CTSdtPrImpl.this.getDataBindingArray(i);
                CTSdtPrImpl.this.setDataBindingArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding o)
                { CTSdtPrImpl.this.insertNewDataBinding(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding old = CTSdtPrImpl.this.getDataBindingArray(i);
                CTSdtPrImpl.this.removeDataBinding(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfDataBindingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DataBindingList();
        }
    }
    
    /**
     * Gets array of all "dataBinding" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding[] getDataBindingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATABINDING$10, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataBinding" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding getDataBindingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding)get_store().find_element_user(DATABINDING$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataBinding" element
     */
    public int sizeOfDataBindingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATABINDING$10);
        }
    }
    
    /**
     * Sets array of all "dataBinding" element
     */
    public void setDataBindingArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding[] dataBindingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataBindingArray, DATABINDING$10);
        }
    }
    
    /**
     * Sets ith "dataBinding" element
     */
    public void setDataBindingArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding dataBinding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding)get_store().find_element_user(DATABINDING$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataBinding);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataBinding" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding insertNewDataBinding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding)get_store().insert_element_user(DATABINDING$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataBinding" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding addNewDataBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding)get_store().add_element_user(DATABINDING$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataBinding" element
     */
    public void removeDataBinding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATABINDING$10, i);
        }
    }
    
    /**
     * Gets a List of "temporary" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getTemporaryList()
    {
        final class TemporaryList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTSdtPrImpl.this.getTemporaryArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTSdtPrImpl.this.getTemporaryArray(i);
                CTSdtPrImpl.this.setTemporaryArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTSdtPrImpl.this.insertNewTemporary(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTSdtPrImpl.this.getTemporaryArray(i);
                CTSdtPrImpl.this.removeTemporary(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfTemporaryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TemporaryList();
        }
    }
    
    /**
     * Gets array of all "temporary" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getTemporaryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TEMPORARY$12, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "temporary" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getTemporaryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(TEMPORARY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "temporary" element
     */
    public int sizeOfTemporaryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEMPORARY$12);
        }
    }
    
    /**
     * Sets array of all "temporary" element
     */
    public void setTemporaryArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] temporaryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(temporaryArray, TEMPORARY$12);
        }
    }
    
    /**
     * Sets ith "temporary" element
     */
    public void setTemporaryArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff temporary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(TEMPORARY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(temporary);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "temporary" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewTemporary(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(TEMPORARY$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "temporary" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewTemporary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(TEMPORARY$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "temporary" element
     */
    public void removeTemporary(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEMPORARY$12, i);
        }
    }
    
    /**
     * Gets a List of "id" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber> getIdList()
    {
        final class IdList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber get(int i)
                { return CTSdtPrImpl.this.getIdArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber old = CTSdtPrImpl.this.getIdArray(i);
                CTSdtPrImpl.this.setIdArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber o)
                { CTSdtPrImpl.this.insertNewId(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber old = CTSdtPrImpl.this.getIdArray(i);
                CTSdtPrImpl.this.removeId(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfIdArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IdList();
        }
    }
    
    /**
     * Gets array of all "id" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber[] getIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ID$14, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "id" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(ID$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "id" element
     */
    public int sizeOfIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$14);
        }
    }
    
    /**
     * Sets array of all "id" element
     */
    public void setIdArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber[] idArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(idArray, ID$14);
        }
    }
    
    /**
     * Sets ith "id" element
     */
    public void setIdArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(ID$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(id);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "id" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber insertNewId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().insert_element_user(ID$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "id" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(ID$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "id" element
     */
    public void removeId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$14, i);
        }
    }
    
    /**
     * Gets a List of "tag" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString> getTagList()
    {
        final class TagList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString get(int i)
                { return CTSdtPrImpl.this.getTagArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString old = CTSdtPrImpl.this.getTagArray(i);
                CTSdtPrImpl.this.setTagArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString o)
                { CTSdtPrImpl.this.insertNewTag(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString old = CTSdtPrImpl.this.getTagArray(i);
                CTSdtPrImpl.this.removeTag(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfTagArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TagList();
        }
    }
    
    /**
     * Gets array of all "tag" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] getTagArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TAG$16, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tag" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getTagArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(TAG$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tag" element
     */
    public int sizeOfTagArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAG$16);
        }
    }
    
    /**
     * Sets array of all "tag" element
     */
    public void setTagArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] tagArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tagArray, TAG$16);
        }
    }
    
    /**
     * Sets ith "tag" element
     */
    public void setTagArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString tag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(TAG$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tag);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tag" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString insertNewTag(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().insert_element_user(TAG$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tag" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(TAG$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "tag" element
     */
    public void removeTag(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAG$16, i);
        }
    }
    
    /**
     * Gets a List of "equation" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getEquationList()
    {
        final class EquationList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTSdtPrImpl.this.getEquationArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTSdtPrImpl.this.getEquationArray(i);
                CTSdtPrImpl.this.setEquationArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTSdtPrImpl.this.insertNewEquation(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTSdtPrImpl.this.getEquationArray(i);
                CTSdtPrImpl.this.removeEquation(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfEquationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EquationList();
        }
    }
    
    /**
     * Gets array of all "equation" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getEquationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EQUATION$18, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "equation" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getEquationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(EQUATION$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "equation" element
     */
    public int sizeOfEquationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EQUATION$18);
        }
    }
    
    /**
     * Sets array of all "equation" element
     */
    public void setEquationArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] equationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(equationArray, EQUATION$18);
        }
    }
    
    /**
     * Sets ith "equation" element
     */
    public void setEquationArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty equation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(EQUATION$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(equation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "equation" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewEquation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(EQUATION$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "equation" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewEquation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(EQUATION$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "equation" element
     */
    public void removeEquation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EQUATION$18, i);
        }
    }
    
    /**
     * Gets a List of "comboBox" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox> getComboBoxList()
    {
        final class ComboBoxList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox get(int i)
                { return CTSdtPrImpl.this.getComboBoxArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox old = CTSdtPrImpl.this.getComboBoxArray(i);
                CTSdtPrImpl.this.setComboBoxArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox o)
                { CTSdtPrImpl.this.insertNewComboBox(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox old = CTSdtPrImpl.this.getComboBoxArray(i);
                CTSdtPrImpl.this.removeComboBox(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfComboBoxArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ComboBoxList();
        }
    }
    
    /**
     * Gets array of all "comboBox" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox[] getComboBoxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMBOBOX$20, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "comboBox" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox getComboBoxArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox)get_store().find_element_user(COMBOBOX$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "comboBox" element
     */
    public int sizeOfComboBoxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMBOBOX$20);
        }
    }
    
    /**
     * Sets array of all "comboBox" element
     */
    public void setComboBoxArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox[] comboBoxArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(comboBoxArray, COMBOBOX$20);
        }
    }
    
    /**
     * Sets ith "comboBox" element
     */
    public void setComboBoxArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox comboBox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox)get_store().find_element_user(COMBOBOX$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(comboBox);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "comboBox" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox insertNewComboBox(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox)get_store().insert_element_user(COMBOBOX$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "comboBox" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox addNewComboBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox)get_store().add_element_user(COMBOBOX$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "comboBox" element
     */
    public void removeComboBox(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMBOBOX$20, i);
        }
    }
    
    /**
     * Gets a List of "date" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate> getDateList()
    {
        final class DateList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate get(int i)
                { return CTSdtPrImpl.this.getDateArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate old = CTSdtPrImpl.this.getDateArray(i);
                CTSdtPrImpl.this.setDateArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate o)
                { CTSdtPrImpl.this.insertNewDate(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate old = CTSdtPrImpl.this.getDateArray(i);
                CTSdtPrImpl.this.removeDate(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfDateArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DateList();
        }
    }
    
    /**
     * Gets array of all "date" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate[] getDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATE$22, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "date" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate getDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate)get_store().find_element_user(DATE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "date" element
     */
    public int sizeOfDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATE$22);
        }
    }
    
    /**
     * Sets array of all "date" element
     */
    public void setDateArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate[] dateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dateArray, DATE$22);
        }
    }
    
    /**
     * Sets ith "date" element
     */
    public void setDateArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate)get_store().find_element_user(DATE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(date);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "date" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate insertNewDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate)get_store().insert_element_user(DATE$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "date" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate)get_store().add_element_user(DATE$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "date" element
     */
    public void removeDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATE$22, i);
        }
    }
    
    /**
     * Gets a List of "docPartObj" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart> getDocPartObjList()
    {
        final class DocPartObjList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart get(int i)
                { return CTSdtPrImpl.this.getDocPartObjArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart old = CTSdtPrImpl.this.getDocPartObjArray(i);
                CTSdtPrImpl.this.setDocPartObjArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart o)
                { CTSdtPrImpl.this.insertNewDocPartObj(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart old = CTSdtPrImpl.this.getDocPartObjArray(i);
                CTSdtPrImpl.this.removeDocPartObj(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfDocPartObjArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DocPartObjList();
        }
    }
    
    /**
     * Gets array of all "docPartObj" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart[] getDocPartObjArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCPARTOBJ$24, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "docPartObj" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart getDocPartObjArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart)get_store().find_element_user(DOCPARTOBJ$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "docPartObj" element
     */
    public int sizeOfDocPartObjArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCPARTOBJ$24);
        }
    }
    
    /**
     * Sets array of all "docPartObj" element
     */
    public void setDocPartObjArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart[] docPartObjArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(docPartObjArray, DOCPARTOBJ$24);
        }
    }
    
    /**
     * Sets ith "docPartObj" element
     */
    public void setDocPartObjArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart docPartObj)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart)get_store().find_element_user(DOCPARTOBJ$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(docPartObj);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "docPartObj" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart insertNewDocPartObj(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart)get_store().insert_element_user(DOCPARTOBJ$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "docPartObj" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart addNewDocPartObj()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart)get_store().add_element_user(DOCPARTOBJ$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "docPartObj" element
     */
    public void removeDocPartObj(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCPARTOBJ$24, i);
        }
    }
    
    /**
     * Gets a List of "docPartList" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart> getDocPartListList()
    {
        final class DocPartListList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart get(int i)
                { return CTSdtPrImpl.this.getDocPartListArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart old = CTSdtPrImpl.this.getDocPartListArray(i);
                CTSdtPrImpl.this.setDocPartListArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart o)
                { CTSdtPrImpl.this.insertNewDocPartList(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart old = CTSdtPrImpl.this.getDocPartListArray(i);
                CTSdtPrImpl.this.removeDocPartList(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfDocPartListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DocPartListList();
        }
    }
    
    /**
     * Gets array of all "docPartList" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart[] getDocPartListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCPARTLIST$26, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "docPartList" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart getDocPartListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart)get_store().find_element_user(DOCPARTLIST$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "docPartList" element
     */
    public int sizeOfDocPartListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCPARTLIST$26);
        }
    }
    
    /**
     * Sets array of all "docPartList" element
     */
    public void setDocPartListArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart[] docPartListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(docPartListArray, DOCPARTLIST$26);
        }
    }
    
    /**
     * Sets ith "docPartList" element
     */
    public void setDocPartListArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart docPartList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart)get_store().find_element_user(DOCPARTLIST$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(docPartList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "docPartList" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart insertNewDocPartList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart)get_store().insert_element_user(DOCPARTLIST$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "docPartList" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart addNewDocPartList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart)get_store().add_element_user(DOCPARTLIST$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "docPartList" element
     */
    public void removeDocPartList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCPARTLIST$26, i);
        }
    }
    
    /**
     * Gets a List of "dropDownList" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList> getDropDownListList()
    {
        final class DropDownListList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList get(int i)
                { return CTSdtPrImpl.this.getDropDownListArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList old = CTSdtPrImpl.this.getDropDownListArray(i);
                CTSdtPrImpl.this.setDropDownListArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList o)
                { CTSdtPrImpl.this.insertNewDropDownList(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList old = CTSdtPrImpl.this.getDropDownListArray(i);
                CTSdtPrImpl.this.removeDropDownList(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfDropDownListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DropDownListList();
        }
    }
    
    /**
     * Gets array of all "dropDownList" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList[] getDropDownListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DROPDOWNLIST$28, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dropDownList" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList getDropDownListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList)get_store().find_element_user(DROPDOWNLIST$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dropDownList" element
     */
    public int sizeOfDropDownListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DROPDOWNLIST$28);
        }
    }
    
    /**
     * Sets array of all "dropDownList" element
     */
    public void setDropDownListArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList[] dropDownListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dropDownListArray, DROPDOWNLIST$28);
        }
    }
    
    /**
     * Sets ith "dropDownList" element
     */
    public void setDropDownListArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList dropDownList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList)get_store().find_element_user(DROPDOWNLIST$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dropDownList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dropDownList" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList insertNewDropDownList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList)get_store().insert_element_user(DROPDOWNLIST$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dropDownList" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList addNewDropDownList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList)get_store().add_element_user(DROPDOWNLIST$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "dropDownList" element
     */
    public void removeDropDownList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DROPDOWNLIST$28, i);
        }
    }
    
    /**
     * Gets a List of "picture" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getPictureList()
    {
        final class PictureList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTSdtPrImpl.this.getPictureArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTSdtPrImpl.this.getPictureArray(i);
                CTSdtPrImpl.this.setPictureArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTSdtPrImpl.this.insertNewPicture(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTSdtPrImpl.this.getPictureArray(i);
                CTSdtPrImpl.this.removePicture(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfPictureArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PictureList();
        }
    }
    
    /**
     * Gets array of all "picture" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getPictureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PICTURE$30, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "picture" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getPictureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(PICTURE$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "picture" element
     */
    public int sizeOfPictureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PICTURE$30);
        }
    }
    
    /**
     * Sets array of all "picture" element
     */
    public void setPictureArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] pictureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pictureArray, PICTURE$30);
        }
    }
    
    /**
     * Sets ith "picture" element
     */
    public void setPictureArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty picture)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(PICTURE$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(picture);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "picture" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewPicture(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(PICTURE$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "picture" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewPicture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(PICTURE$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "picture" element
     */
    public void removePicture(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PICTURE$30, i);
        }
    }
    
    /**
     * Gets a List of "richText" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getRichTextList()
    {
        final class RichTextList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTSdtPrImpl.this.getRichTextArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTSdtPrImpl.this.getRichTextArray(i);
                CTSdtPrImpl.this.setRichTextArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTSdtPrImpl.this.insertNewRichText(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTSdtPrImpl.this.getRichTextArray(i);
                CTSdtPrImpl.this.removeRichText(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfRichTextArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RichTextList();
        }
    }
    
    /**
     * Gets array of all "richText" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getRichTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RICHTEXT$32, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "richText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getRichTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(RICHTEXT$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "richText" element
     */
    public int sizeOfRichTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RICHTEXT$32);
        }
    }
    
    /**
     * Sets array of all "richText" element
     */
    public void setRichTextArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] richTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(richTextArray, RICHTEXT$32);
        }
    }
    
    /**
     * Sets ith "richText" element
     */
    public void setRichTextArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty richText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(RICHTEXT$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(richText);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "richText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewRichText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(RICHTEXT$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "richText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewRichText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(RICHTEXT$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "richText" element
     */
    public void removeRichText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RICHTEXT$32, i);
        }
    }
    
    /**
     * Gets a List of "text" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText> getTextList()
    {
        final class TextList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText get(int i)
                { return CTSdtPrImpl.this.getTextArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText old = CTSdtPrImpl.this.getTextArray(i);
                CTSdtPrImpl.this.setTextArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText o)
                { CTSdtPrImpl.this.insertNewText(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText old = CTSdtPrImpl.this.getTextArray(i);
                CTSdtPrImpl.this.removeText(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfTextArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TextList();
        }
    }
    
    /**
     * Gets array of all "text" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText[] getTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TEXT$34, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "text" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText getTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText)get_store().find_element_user(TEXT$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "text" element
     */
    public int sizeOfTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$34);
        }
    }
    
    /**
     * Sets array of all "text" element
     */
    public void setTextArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText[] textArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(textArray, TEXT$34);
        }
    }
    
    /**
     * Sets ith "text" element
     */
    public void setTextArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText)get_store().find_element_user(TEXT$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(text);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "text" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText insertNewText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText)get_store().insert_element_user(TEXT$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "text" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText)get_store().add_element_user(TEXT$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "text" element
     */
    public void removeText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$34, i);
        }
    }
    
    /**
     * Gets a List of "citation" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getCitationList()
    {
        final class CitationList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTSdtPrImpl.this.getCitationArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTSdtPrImpl.this.getCitationArray(i);
                CTSdtPrImpl.this.setCitationArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTSdtPrImpl.this.insertNewCitation(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTSdtPrImpl.this.getCitationArray(i);
                CTSdtPrImpl.this.removeCitation(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfCitationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CitationList();
        }
    }
    
    /**
     * Gets array of all "citation" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getCitationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CITATION$36, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "citation" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getCitationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(CITATION$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "citation" element
     */
    public int sizeOfCitationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITATION$36);
        }
    }
    
    /**
     * Sets array of all "citation" element
     */
    public void setCitationArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] citationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(citationArray, CITATION$36);
        }
    }
    
    /**
     * Sets ith "citation" element
     */
    public void setCitationArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty citation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(CITATION$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(citation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "citation" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewCitation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(CITATION$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "citation" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(CITATION$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "citation" element
     */
    public void removeCitation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITATION$36, i);
        }
    }
    
    /**
     * Gets a List of "group" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getGroupList()
    {
        final class GroupList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTSdtPrImpl.this.getGroupArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTSdtPrImpl.this.getGroupArray(i);
                CTSdtPrImpl.this.setGroupArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTSdtPrImpl.this.insertNewGroup(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTSdtPrImpl.this.getGroupArray(i);
                CTSdtPrImpl.this.removeGroup(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfGroupArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GroupList();
        }
    }
    
    /**
     * Gets array of all "group" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUP$38, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "group" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(GROUP$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "group" element
     */
    public int sizeOfGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$38);
        }
    }
    
    /**
     * Sets array of all "group" element
     */
    public void setGroupArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] groupArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(groupArray, GROUP$38);
        }
    }
    
    /**
     * Sets ith "group" element
     */
    public void setGroupArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(GROUP$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(group);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "group" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(GROUP$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "group" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(GROUP$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "group" element
     */
    public void removeGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$38, i);
        }
    }
    
    /**
     * Gets a List of "bibliography" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty> getBibliographyList()
    {
        final class BibliographyList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty get(int i)
                { return CTSdtPrImpl.this.getBibliographyArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTSdtPrImpl.this.getBibliographyArray(i);
                CTSdtPrImpl.this.setBibliographyArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty o)
                { CTSdtPrImpl.this.insertNewBibliography(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty old = CTSdtPrImpl.this.getBibliographyArray(i);
                CTSdtPrImpl.this.removeBibliography(i);
                return old;
            }
            
            public int size()
                { return CTSdtPrImpl.this.sizeOfBibliographyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BibliographyList();
        }
    }
    
    /**
     * Gets array of all "bibliography" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] getBibliographyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BIBLIOGRAPHY$40, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bibliography" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty getBibliographyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(BIBLIOGRAPHY$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bibliography" element
     */
    public int sizeOfBibliographyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIBLIOGRAPHY$40);
        }
    }
    
    /**
     * Sets array of all "bibliography" element
     */
    public void setBibliographyArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty[] bibliographyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bibliographyArray, BIBLIOGRAPHY$40);
        }
    }
    
    /**
     * Sets ith "bibliography" element
     */
    public void setBibliographyArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty bibliography)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().find_element_user(BIBLIOGRAPHY$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bibliography);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bibliography" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty insertNewBibliography(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().insert_element_user(BIBLIOGRAPHY$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bibliography" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty addNewBibliography()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty)get_store().add_element_user(BIBLIOGRAPHY$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "bibliography" element
     */
    public void removeBibliography(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIBLIOGRAPHY$40, i);
        }
    }
}
