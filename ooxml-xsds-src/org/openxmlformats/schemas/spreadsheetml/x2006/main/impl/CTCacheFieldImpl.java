/*
 * XML Type:  CT_CacheField
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_CacheField(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTCacheFieldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField
{
    
    public CTCacheFieldImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHAREDITEMS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sharedItems");
    private static final javax.xml.namespace.QName FIELDGROUP$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fieldGroup");
    private static final javax.xml.namespace.QName MPMAP$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "mpMap");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName CAPTION$10 = 
        new javax.xml.namespace.QName("", "caption");
    private static final javax.xml.namespace.QName PROPERTYNAME$12 = 
        new javax.xml.namespace.QName("", "propertyName");
    private static final javax.xml.namespace.QName SERVERFIELD$14 = 
        new javax.xml.namespace.QName("", "serverField");
    private static final javax.xml.namespace.QName UNIQUELIST$16 = 
        new javax.xml.namespace.QName("", "uniqueList");
    private static final javax.xml.namespace.QName NUMFMTID$18 = 
        new javax.xml.namespace.QName("", "numFmtId");
    private static final javax.xml.namespace.QName FORMULA$20 = 
        new javax.xml.namespace.QName("", "formula");
    private static final javax.xml.namespace.QName SQLTYPE$22 = 
        new javax.xml.namespace.QName("", "sqlType");
    private static final javax.xml.namespace.QName HIERARCHY$24 = 
        new javax.xml.namespace.QName("", "hierarchy");
    private static final javax.xml.namespace.QName LEVEL$26 = 
        new javax.xml.namespace.QName("", "level");
    private static final javax.xml.namespace.QName DATABASEFIELD$28 = 
        new javax.xml.namespace.QName("", "databaseField");
    private static final javax.xml.namespace.QName MAPPINGCOUNT$30 = 
        new javax.xml.namespace.QName("", "mappingCount");
    private static final javax.xml.namespace.QName MEMBERPROPERTYFIELD$32 = 
        new javax.xml.namespace.QName("", "memberPropertyField");
    
    
    /**
     * Gets the "sharedItems" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedItems getSharedItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedItems)get_store().find_element_user(SHAREDITEMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sharedItems" element
     */
    public boolean isSetSharedItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHAREDITEMS$0) != 0;
        }
    }
    
    /**
     * Sets the "sharedItems" element
     */
    public void setSharedItems(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedItems sharedItems)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedItems)get_store().find_element_user(SHAREDITEMS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedItems)get_store().add_element_user(SHAREDITEMS$0);
            }
            target.set(sharedItems);
        }
    }
    
    /**
     * Appends and returns a new empty "sharedItems" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedItems addNewSharedItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedItems target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedItems)get_store().add_element_user(SHAREDITEMS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "sharedItems" element
     */
    public void unsetSharedItems()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHAREDITEMS$0, 0);
        }
    }
    
    /**
     * Gets the "fieldGroup" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldGroup getFieldGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldGroup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldGroup)get_store().find_element_user(FIELDGROUP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fieldGroup" element
     */
    public boolean isSetFieldGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIELDGROUP$2) != 0;
        }
    }
    
    /**
     * Sets the "fieldGroup" element
     */
    public void setFieldGroup(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldGroup fieldGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldGroup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldGroup)get_store().find_element_user(FIELDGROUP$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldGroup)get_store().add_element_user(FIELDGROUP$2);
            }
            target.set(fieldGroup);
        }
    }
    
    /**
     * Appends and returns a new empty "fieldGroup" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldGroup addNewFieldGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldGroup target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldGroup)get_store().add_element_user(FIELDGROUP$2);
            return target;
        }
    }
    
    /**
     * Unsets the "fieldGroup" element
     */
    public void unsetFieldGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIELDGROUP$2, 0);
        }
    }
    
    /**
     * Gets a List of "mpMap" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX> getMpMapList()
    {
        final class MpMapList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX get(int i)
                { return CTCacheFieldImpl.this.getMpMapArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX old = CTCacheFieldImpl.this.getMpMapArray(i);
                CTCacheFieldImpl.this.setMpMapArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX o)
                { CTCacheFieldImpl.this.insertNewMpMap(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX old = CTCacheFieldImpl.this.getMpMapArray(i);
                CTCacheFieldImpl.this.removeMpMap(i);
                return old;
            }
            
            public int size()
                { return CTCacheFieldImpl.this.sizeOfMpMapArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MpMapList();
        }
    }
    
    /**
     * Gets array of all "mpMap" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX[] getMpMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MPMAP$4, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mpMap" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX getMpMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX)get_store().find_element_user(MPMAP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mpMap" element
     */
    public int sizeOfMpMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MPMAP$4);
        }
    }
    
    /**
     * Sets array of all "mpMap" element
     */
    public void setMpMapArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX[] mpMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mpMapArray, MPMAP$4);
        }
    }
    
    /**
     * Sets ith "mpMap" element
     */
    public void setMpMapArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX mpMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX)get_store().find_element_user(MPMAP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mpMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mpMap" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX insertNewMpMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX)get_store().insert_element_user(MPMAP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mpMap" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX addNewMpMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX)get_store().add_element_user(MPMAP$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "mpMap" element
     */
    public void removeMpMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MPMAP$4, i);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$6) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$6);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$6);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$8);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$8);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "caption" attribute
     */
    public java.lang.String getCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAPTION$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "caption" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CAPTION$10);
            return target;
        }
    }
    
    /**
     * True if has "caption" attribute
     */
    public boolean isSetCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CAPTION$10) != null;
        }
    }
    
    /**
     * Sets the "caption" attribute
     */
    public void setCaption(java.lang.String caption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAPTION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CAPTION$10);
            }
            target.setStringValue(caption);
        }
    }
    
    /**
     * Sets (as xml) the "caption" attribute
     */
    public void xsetCaption(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring caption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CAPTION$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(CAPTION$10);
            }
            target.set(caption);
        }
    }
    
    /**
     * Unsets the "caption" attribute
     */
    public void unsetCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CAPTION$10);
        }
    }
    
    /**
     * Gets the "propertyName" attribute
     */
    public java.lang.String getPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTYNAME$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "propertyName" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(PROPERTYNAME$12);
            return target;
        }
    }
    
    /**
     * True if has "propertyName" attribute
     */
    public boolean isSetPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTYNAME$12) != null;
        }
    }
    
    /**
     * Sets the "propertyName" attribute
     */
    public void setPropertyName(java.lang.String propertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTYNAME$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTYNAME$12);
            }
            target.setStringValue(propertyName);
        }
    }
    
    /**
     * Sets (as xml) the "propertyName" attribute
     */
    public void xsetPropertyName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring propertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(PROPERTYNAME$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(PROPERTYNAME$12);
            }
            target.set(propertyName);
        }
    }
    
    /**
     * Unsets the "propertyName" attribute
     */
    public void unsetPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROPERTYNAME$12);
        }
    }
    
    /**
     * Gets the "serverField" attribute
     */
    public boolean getServerField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERFIELD$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SERVERFIELD$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "serverField" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetServerField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SERVERFIELD$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SERVERFIELD$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "serverField" attribute
     */
    public boolean isSetServerField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SERVERFIELD$14) != null;
        }
    }
    
    /**
     * Sets the "serverField" attribute
     */
    public void setServerField(boolean serverField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERFIELD$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVERFIELD$14);
            }
            target.setBooleanValue(serverField);
        }
    }
    
    /**
     * Sets (as xml) the "serverField" attribute
     */
    public void xsetServerField(org.apache.xmlbeans.XmlBoolean serverField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SERVERFIELD$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SERVERFIELD$14);
            }
            target.set(serverField);
        }
    }
    
    /**
     * Unsets the "serverField" attribute
     */
    public void unsetServerField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SERVERFIELD$14);
        }
    }
    
    /**
     * Gets the "uniqueList" attribute
     */
    public boolean getUniqueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUELIST$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UNIQUELIST$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "uniqueList" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUniqueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNIQUELIST$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(UNIQUELIST$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "uniqueList" attribute
     */
    public boolean isSetUniqueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNIQUELIST$16) != null;
        }
    }
    
    /**
     * Sets the "uniqueList" attribute
     */
    public void setUniqueList(boolean uniqueList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUELIST$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUELIST$16);
            }
            target.setBooleanValue(uniqueList);
        }
    }
    
    /**
     * Sets (as xml) the "uniqueList" attribute
     */
    public void xsetUniqueList(org.apache.xmlbeans.XmlBoolean uniqueList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNIQUELIST$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UNIQUELIST$16);
            }
            target.set(uniqueList);
        }
    }
    
    /**
     * Unsets the "uniqueList" attribute
     */
    public void unsetUniqueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNIQUELIST$16);
        }
    }
    
    /**
     * Gets the "numFmtId" attribute
     */
    public long getNumFmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMFMTID$18);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "numFmtId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId xgetNumFmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId)get_store().find_attribute_user(NUMFMTID$18);
            return target;
        }
    }
    
    /**
     * True if has "numFmtId" attribute
     */
    public boolean isSetNumFmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NUMFMTID$18) != null;
        }
    }
    
    /**
     * Sets the "numFmtId" attribute
     */
    public void setNumFmtId(long numFmtId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMFMTID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMFMTID$18);
            }
            target.setLongValue(numFmtId);
        }
    }
    
    /**
     * Sets (as xml) the "numFmtId" attribute
     */
    public void xsetNumFmtId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId numFmtId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId)get_store().find_attribute_user(NUMFMTID$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId)get_store().add_attribute_user(NUMFMTID$18);
            }
            target.set(numFmtId);
        }
    }
    
    /**
     * Unsets the "numFmtId" attribute
     */
    public void unsetNumFmtId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NUMFMTID$18);
        }
    }
    
    /**
     * Gets the "formula" attribute
     */
    public java.lang.String getFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMULA$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "formula" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(FORMULA$20);
            return target;
        }
    }
    
    /**
     * True if has "formula" attribute
     */
    public boolean isSetFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORMULA$20) != null;
        }
    }
    
    /**
     * Sets the "formula" attribute
     */
    public void setFormula(java.lang.String formula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMULA$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMULA$20);
            }
            target.setStringValue(formula);
        }
    }
    
    /**
     * Sets (as xml) the "formula" attribute
     */
    public void xsetFormula(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring formula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(FORMULA$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(FORMULA$20);
            }
            target.set(formula);
        }
    }
    
    /**
     * Unsets the "formula" attribute
     */
    public void unsetFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORMULA$20);
        }
    }
    
    /**
     * Gets the "sqlType" attribute
     */
    public int getSqlType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQLTYPE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SQLTYPE$22);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "sqlType" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetSqlType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(SQLTYPE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(SQLTYPE$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "sqlType" attribute
     */
    public boolean isSetSqlType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SQLTYPE$22) != null;
        }
    }
    
    /**
     * Sets the "sqlType" attribute
     */
    public void setSqlType(int sqlType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQLTYPE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SQLTYPE$22);
            }
            target.setIntValue(sqlType);
        }
    }
    
    /**
     * Sets (as xml) the "sqlType" attribute
     */
    public void xsetSqlType(org.apache.xmlbeans.XmlInt sqlType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(SQLTYPE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(SQLTYPE$22);
            }
            target.set(sqlType);
        }
    }
    
    /**
     * Unsets the "sqlType" attribute
     */
    public void unsetSqlType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SQLTYPE$22);
        }
    }
    
    /**
     * Gets the "hierarchy" attribute
     */
    public int getHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIERARCHY$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIERARCHY$24);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "hierarchy" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(HIERARCHY$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(HIERARCHY$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "hierarchy" attribute
     */
    public boolean isSetHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HIERARCHY$24) != null;
        }
    }
    
    /**
     * Sets the "hierarchy" attribute
     */
    public void setHierarchy(int hierarchy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIERARCHY$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIERARCHY$24);
            }
            target.setIntValue(hierarchy);
        }
    }
    
    /**
     * Sets (as xml) the "hierarchy" attribute
     */
    public void xsetHierarchy(org.apache.xmlbeans.XmlInt hierarchy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(HIERARCHY$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(HIERARCHY$24);
            }
            target.set(hierarchy);
        }
    }
    
    /**
     * Unsets the "hierarchy" attribute
     */
    public void unsetHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HIERARCHY$24);
        }
    }
    
    /**
     * Gets the "level" attribute
     */
    public long getLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LEVEL$26);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "level" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(LEVEL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(LEVEL$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "level" attribute
     */
    public boolean isSetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEVEL$26) != null;
        }
    }
    
    /**
     * Sets the "level" attribute
     */
    public void setLevel(long level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVEL$26);
            }
            target.setLongValue(level);
        }
    }
    
    /**
     * Sets (as xml) the "level" attribute
     */
    public void xsetLevel(org.apache.xmlbeans.XmlUnsignedInt level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(LEVEL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(LEVEL$26);
            }
            target.set(level);
        }
    }
    
    /**
     * Unsets the "level" attribute
     */
    public void unsetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEVEL$26);
        }
    }
    
    /**
     * Gets the "databaseField" attribute
     */
    public boolean getDatabaseField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATABASEFIELD$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DATABASEFIELD$28);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "databaseField" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDatabaseField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DATABASEFIELD$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DATABASEFIELD$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "databaseField" attribute
     */
    public boolean isSetDatabaseField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATABASEFIELD$28) != null;
        }
    }
    
    /**
     * Sets the "databaseField" attribute
     */
    public void setDatabaseField(boolean databaseField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATABASEFIELD$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATABASEFIELD$28);
            }
            target.setBooleanValue(databaseField);
        }
    }
    
    /**
     * Sets (as xml) the "databaseField" attribute
     */
    public void xsetDatabaseField(org.apache.xmlbeans.XmlBoolean databaseField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DATABASEFIELD$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DATABASEFIELD$28);
            }
            target.set(databaseField);
        }
    }
    
    /**
     * Unsets the "databaseField" attribute
     */
    public void unsetDatabaseField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATABASEFIELD$28);
        }
    }
    
    /**
     * Gets the "mappingCount" attribute
     */
    public long getMappingCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAPPINGCOUNT$30);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "mappingCount" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetMappingCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MAPPINGCOUNT$30);
            return target;
        }
    }
    
    /**
     * True if has "mappingCount" attribute
     */
    public boolean isSetMappingCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAPPINGCOUNT$30) != null;
        }
    }
    
    /**
     * Sets the "mappingCount" attribute
     */
    public void setMappingCount(long mappingCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAPPINGCOUNT$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAPPINGCOUNT$30);
            }
            target.setLongValue(mappingCount);
        }
    }
    
    /**
     * Sets (as xml) the "mappingCount" attribute
     */
    public void xsetMappingCount(org.apache.xmlbeans.XmlUnsignedInt mappingCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(MAPPINGCOUNT$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(MAPPINGCOUNT$30);
            }
            target.set(mappingCount);
        }
    }
    
    /**
     * Unsets the "mappingCount" attribute
     */
    public void unsetMappingCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAPPINGCOUNT$30);
        }
    }
    
    /**
     * Gets the "memberPropertyField" attribute
     */
    public boolean getMemberPropertyField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEMBERPROPERTYFIELD$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MEMBERPROPERTYFIELD$32);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "memberPropertyField" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMemberPropertyField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MEMBERPROPERTYFIELD$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MEMBERPROPERTYFIELD$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "memberPropertyField" attribute
     */
    public boolean isSetMemberPropertyField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MEMBERPROPERTYFIELD$32) != null;
        }
    }
    
    /**
     * Sets the "memberPropertyField" attribute
     */
    public void setMemberPropertyField(boolean memberPropertyField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEMBERPROPERTYFIELD$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEMBERPROPERTYFIELD$32);
            }
            target.setBooleanValue(memberPropertyField);
        }
    }
    
    /**
     * Sets (as xml) the "memberPropertyField" attribute
     */
    public void xsetMemberPropertyField(org.apache.xmlbeans.XmlBoolean memberPropertyField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MEMBERPROPERTYFIELD$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MEMBERPROPERTYFIELD$32);
            }
            target.set(memberPropertyField);
        }
    }
    
    /**
     * Unsets the "memberPropertyField" attribute
     */
    public void unsetMemberPropertyField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MEMBERPROPERTYFIELD$32);
        }
    }
}
