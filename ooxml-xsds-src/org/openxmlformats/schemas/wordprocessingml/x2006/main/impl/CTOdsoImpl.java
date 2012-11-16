/*
 * XML Type:  CT_Odso
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdso
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Odso(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTOdsoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdso
{
    
    public CTOdsoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UDL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "udl");
    private static final javax.xml.namespace.QName TABLE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "table");
    private static final javax.xml.namespace.QName SRC$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "src");
    private static final javax.xml.namespace.QName COLDELIM$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "colDelim");
    private static final javax.xml.namespace.QName TYPE$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "type");
    private static final javax.xml.namespace.QName FHDR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fHdr");
    private static final javax.xml.namespace.QName FIELDMAPDATA$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fieldMapData");
    private static final javax.xml.namespace.QName RECIPIENTDATA$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "recipientData");
    
    
    /**
     * Gets the "udl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getUdl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(UDL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "udl" element
     */
    public boolean isSetUdl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UDL$0) != 0;
        }
    }
    
    /**
     * Sets the "udl" element
     */
    public void setUdl(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString udl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(UDL$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(UDL$0);
            }
            target.set(udl);
        }
    }
    
    /**
     * Appends and returns a new empty "udl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewUdl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(UDL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "udl" element
     */
    public void unsetUdl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UDL$0, 0);
        }
    }
    
    /**
     * Gets the "table" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(TABLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "table" element
     */
    public boolean isSetTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABLE$2) != 0;
        }
    }
    
    /**
     * Sets the "table" element
     */
    public void setTable(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString table)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(TABLE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(TABLE$2);
            }
            target.set(table);
        }
    }
    
    /**
     * Appends and returns a new empty "table" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(TABLE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "table" element
     */
    public void unsetTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABLE$2, 0);
        }
    }
    
    /**
     * Gets the "src" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel getSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(SRC$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "src" element
     */
    public boolean isSetSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SRC$4) != 0;
        }
    }
    
    /**
     * Sets the "src" element
     */
    public void setSrc(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel src)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(SRC$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().add_element_user(SRC$4);
            }
            target.set(src);
        }
    }
    
    /**
     * Appends and returns a new empty "src" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel addNewSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().add_element_user(SRC$4);
            return target;
        }
    }
    
    /**
     * Unsets the "src" element
     */
    public void unsetSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SRC$4, 0);
        }
    }
    
    /**
     * Gets the "colDelim" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getColDelim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(COLDELIM$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "colDelim" element
     */
    public boolean isSetColDelim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLDELIM$6) != 0;
        }
    }
    
    /**
     * Sets the "colDelim" element
     */
    public void setColDelim(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber colDelim)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(COLDELIM$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(COLDELIM$6);
            }
            target.set(colDelim);
        }
    }
    
    /**
     * Appends and returns a new empty "colDelim" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewColDelim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(COLDELIM$6);
            return target;
        }
    }
    
    /**
     * Unsets the "colDelim" element
     */
    public void unsetColDelim()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLDELIM$6, 0);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeSourceType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeSourceType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeSourceType)get_store().find_element_user(TYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$8) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeSourceType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeSourceType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeSourceType)get_store().find_element_user(TYPE$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeSourceType)get_store().add_element_user(TYPE$8);
            }
            target.set(type);
        }
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeSourceType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeSourceType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMergeSourceType)get_store().add_element_user(TYPE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$8, 0);
        }
    }
    
    /**
     * Gets the "fHdr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getFHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(FHDR$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fHdr" element
     */
    public boolean isSetFHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FHDR$10) != 0;
        }
    }
    
    /**
     * Sets the "fHdr" element
     */
    public void setFHdr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff fHdr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(FHDR$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(FHDR$10);
            }
            target.set(fHdr);
        }
    }
    
    /**
     * Appends and returns a new empty "fHdr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewFHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(FHDR$10);
            return target;
        }
    }
    
    /**
     * Unsets the "fHdr" element
     */
    public void unsetFHdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FHDR$10, 0);
        }
    }
    
    /**
     * Gets a List of "fieldMapData" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData> getFieldMapDataList()
    {
        final class FieldMapDataList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData get(int i)
                { return CTOdsoImpl.this.getFieldMapDataArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData old = CTOdsoImpl.this.getFieldMapDataArray(i);
                CTOdsoImpl.this.setFieldMapDataArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData o)
                { CTOdsoImpl.this.insertNewFieldMapData(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData old = CTOdsoImpl.this.getFieldMapDataArray(i);
                CTOdsoImpl.this.removeFieldMapData(i);
                return old;
            }
            
            public int size()
                { return CTOdsoImpl.this.sizeOfFieldMapDataArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FieldMapDataList();
        }
    }
    
    /**
     * Gets array of all "fieldMapData" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData[] getFieldMapDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FIELDMAPDATA$12, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fieldMapData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData getFieldMapDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData)get_store().find_element_user(FIELDMAPDATA$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fieldMapData" element
     */
    public int sizeOfFieldMapDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIELDMAPDATA$12);
        }
    }
    
    /**
     * Sets array of all "fieldMapData" element
     */
    public void setFieldMapDataArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData[] fieldMapDataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fieldMapDataArray, FIELDMAPDATA$12);
        }
    }
    
    /**
     * Sets ith "fieldMapData" element
     */
    public void setFieldMapDataArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData fieldMapData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData)get_store().find_element_user(FIELDMAPDATA$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fieldMapData);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fieldMapData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData insertNewFieldMapData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData)get_store().insert_element_user(FIELDMAPDATA$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fieldMapData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData addNewFieldMapData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOdsoFieldMapData)get_store().add_element_user(FIELDMAPDATA$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "fieldMapData" element
     */
    public void removeFieldMapData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIELDMAPDATA$12, i);
        }
    }
    
    /**
     * Gets a List of "recipientData" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel> getRecipientDataList()
    {
        final class RecipientDataList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel get(int i)
                { return CTOdsoImpl.this.getRecipientDataArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel old = CTOdsoImpl.this.getRecipientDataArray(i);
                CTOdsoImpl.this.setRecipientDataArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel o)
                { CTOdsoImpl.this.insertNewRecipientData(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel old = CTOdsoImpl.this.getRecipientDataArray(i);
                CTOdsoImpl.this.removeRecipientData(i);
                return old;
            }
            
            public int size()
                { return CTOdsoImpl.this.sizeOfRecipientDataArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RecipientDataList();
        }
    }
    
    /**
     * Gets array of all "recipientData" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel[] getRecipientDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RECIPIENTDATA$14, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "recipientData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel getRecipientDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(RECIPIENTDATA$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "recipientData" element
     */
    public int sizeOfRecipientDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECIPIENTDATA$14);
        }
    }
    
    /**
     * Sets array of all "recipientData" element
     */
    public void setRecipientDataArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel[] recipientDataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(recipientDataArray, RECIPIENTDATA$14);
        }
    }
    
    /**
     * Sets ith "recipientData" element
     */
    public void setRecipientDataArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel recipientData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(RECIPIENTDATA$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(recipientData);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recipientData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel insertNewRecipientData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().insert_element_user(RECIPIENTDATA$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recipientData" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel addNewRecipientData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().add_element_user(RECIPIENTDATA$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "recipientData" element
     */
    public void removeRecipientData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECIPIENTDATA$14, i);
        }
    }
}
