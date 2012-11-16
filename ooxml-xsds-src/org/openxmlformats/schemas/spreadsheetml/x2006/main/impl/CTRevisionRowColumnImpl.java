/*
 * XML Type:  CT_RevisionRowColumn
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_RevisionRowColumn(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRevisionRowColumnImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionRowColumn
{
    
    public CTRevisionRowColumnImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNDO$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "undo");
    private static final javax.xml.namespace.QName RCC$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rcc");
    private static final javax.xml.namespace.QName RFMT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rfmt");
    private static final javax.xml.namespace.QName RID$6 = 
        new javax.xml.namespace.QName("", "rId");
    private static final javax.xml.namespace.QName UA$8 = 
        new javax.xml.namespace.QName("", "ua");
    private static final javax.xml.namespace.QName RA$10 = 
        new javax.xml.namespace.QName("", "ra");
    private static final javax.xml.namespace.QName SID$12 = 
        new javax.xml.namespace.QName("", "sId");
    private static final javax.xml.namespace.QName EOL$14 = 
        new javax.xml.namespace.QName("", "eol");
    private static final javax.xml.namespace.QName REF$16 = 
        new javax.xml.namespace.QName("", "ref");
    private static final javax.xml.namespace.QName ACTION$18 = 
        new javax.xml.namespace.QName("", "action");
    private static final javax.xml.namespace.QName EDGE$20 = 
        new javax.xml.namespace.QName("", "edge");
    
    
    /**
     * Gets a List of "undo" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo> getUndoList()
    {
        final class UndoList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo get(int i)
                { return CTRevisionRowColumnImpl.this.getUndoArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo old = CTRevisionRowColumnImpl.this.getUndoArray(i);
                CTRevisionRowColumnImpl.this.setUndoArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo o)
                { CTRevisionRowColumnImpl.this.insertNewUndo(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo old = CTRevisionRowColumnImpl.this.getUndoArray(i);
                CTRevisionRowColumnImpl.this.removeUndo(i);
                return old;
            }
            
            public int size()
                { return CTRevisionRowColumnImpl.this.sizeOfUndoArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UndoList();
        }
    }
    
    /**
     * Gets array of all "undo" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo[] getUndoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UNDO$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "undo" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo getUndoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo)get_store().find_element_user(UNDO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "undo" element
     */
    public int sizeOfUndoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNDO$0);
        }
    }
    
    /**
     * Sets array of all "undo" element
     */
    public void setUndoArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo[] undoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(undoArray, UNDO$0);
        }
    }
    
    /**
     * Sets ith "undo" element
     */
    public void setUndoArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo undo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo)get_store().find_element_user(UNDO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(undo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "undo" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo insertNewUndo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo)get_store().insert_element_user(UNDO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "undo" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo addNewUndo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUndoInfo)get_store().add_element_user(UNDO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "undo" element
     */
    public void removeUndo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNDO$0, i);
        }
    }
    
    /**
     * Gets a List of "rcc" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange> getRccList()
    {
        final class RccList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange get(int i)
                { return CTRevisionRowColumnImpl.this.getRccArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange old = CTRevisionRowColumnImpl.this.getRccArray(i);
                CTRevisionRowColumnImpl.this.setRccArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange o)
                { CTRevisionRowColumnImpl.this.insertNewRcc(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange old = CTRevisionRowColumnImpl.this.getRccArray(i);
                CTRevisionRowColumnImpl.this.removeRcc(i);
                return old;
            }
            
            public int size()
                { return CTRevisionRowColumnImpl.this.sizeOfRccArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RccList();
        }
    }
    
    /**
     * Gets array of all "rcc" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange[] getRccArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RCC$2, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rcc" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange getRccArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange)get_store().find_element_user(RCC$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rcc" element
     */
    public int sizeOfRccArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RCC$2);
        }
    }
    
    /**
     * Sets array of all "rcc" element
     */
    public void setRccArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange[] rccArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rccArray, RCC$2);
        }
    }
    
    /**
     * Sets ith "rcc" element
     */
    public void setRccArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange rcc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange)get_store().find_element_user(RCC$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rcc);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rcc" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange insertNewRcc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange)get_store().insert_element_user(RCC$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rcc" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange addNewRcc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange)get_store().add_element_user(RCC$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "rcc" element
     */
    public void removeRcc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RCC$2, i);
        }
    }
    
    /**
     * Gets a List of "rfmt" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting> getRfmtList()
    {
        final class RfmtList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting get(int i)
                { return CTRevisionRowColumnImpl.this.getRfmtArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting old = CTRevisionRowColumnImpl.this.getRfmtArray(i);
                CTRevisionRowColumnImpl.this.setRfmtArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting o)
                { CTRevisionRowColumnImpl.this.insertNewRfmt(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting old = CTRevisionRowColumnImpl.this.getRfmtArray(i);
                CTRevisionRowColumnImpl.this.removeRfmt(i);
                return old;
            }
            
            public int size()
                { return CTRevisionRowColumnImpl.this.sizeOfRfmtArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RfmtList();
        }
    }
    
    /**
     * Gets array of all "rfmt" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting[] getRfmtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RFMT$4, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rfmt" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting getRfmtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting)get_store().find_element_user(RFMT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rfmt" element
     */
    public int sizeOfRfmtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RFMT$4);
        }
    }
    
    /**
     * Sets array of all "rfmt" element
     */
    public void setRfmtArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting[] rfmtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rfmtArray, RFMT$4);
        }
    }
    
    /**
     * Sets ith "rfmt" element
     */
    public void setRfmtArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting rfmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting)get_store().find_element_user(RFMT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rfmt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rfmt" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting insertNewRfmt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting)get_store().insert_element_user(RFMT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rfmt" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting addNewRfmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting)get_store().add_element_user(RFMT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "rfmt" element
     */
    public void removeRfmt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RFMT$4, i);
        }
    }
    
    /**
     * Gets the "rId" attribute
     */
    public long getRId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RID$6);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "rId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetRId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(RID$6);
            return target;
        }
    }
    
    /**
     * Sets the "rId" attribute
     */
    public void setRId(long rId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RID$6);
            }
            target.setLongValue(rId);
        }
    }
    
    /**
     * Sets (as xml) the "rId" attribute
     */
    public void xsetRId(org.apache.xmlbeans.XmlUnsignedInt rId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(RID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(RID$6);
            }
            target.set(rId);
        }
    }
    
    /**
     * Gets the "ua" attribute
     */
    public boolean getUa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UA$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UA$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ua" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UA$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(UA$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "ua" attribute
     */
    public boolean isSetUa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UA$8) != null;
        }
    }
    
    /**
     * Sets the "ua" attribute
     */
    public void setUa(boolean ua)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UA$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UA$8);
            }
            target.setBooleanValue(ua);
        }
    }
    
    /**
     * Sets (as xml) the "ua" attribute
     */
    public void xsetUa(org.apache.xmlbeans.XmlBoolean ua)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UA$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UA$8);
            }
            target.set(ua);
        }
    }
    
    /**
     * Unsets the "ua" attribute
     */
    public void unsetUa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UA$8);
        }
    }
    
    /**
     * Gets the "ra" attribute
     */
    public boolean getRa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RA$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RA$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ra" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RA$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(RA$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "ra" attribute
     */
    public boolean isSetRa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RA$10) != null;
        }
    }
    
    /**
     * Sets the "ra" attribute
     */
    public void setRa(boolean ra)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RA$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RA$10);
            }
            target.setBooleanValue(ra);
        }
    }
    
    /**
     * Sets (as xml) the "ra" attribute
     */
    public void xsetRa(org.apache.xmlbeans.XmlBoolean ra)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RA$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RA$10);
            }
            target.set(ra);
        }
    }
    
    /**
     * Unsets the "ra" attribute
     */
    public void unsetRa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RA$10);
        }
    }
    
    /**
     * Gets the "sId" attribute
     */
    public long getSId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SID$12);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "sId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetSId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SID$12);
            return target;
        }
    }
    
    /**
     * Sets the "sId" attribute
     */
    public void setSId(long sId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SID$12);
            }
            target.setLongValue(sId);
        }
    }
    
    /**
     * Sets (as xml) the "sId" attribute
     */
    public void xsetSId(org.apache.xmlbeans.XmlUnsignedInt sId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SID$12);
            }
            target.set(sId);
        }
    }
    
    /**
     * Gets the "eol" attribute
     */
    public boolean getEol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EOL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EOL$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "eol" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EOL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EOL$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "eol" attribute
     */
    public boolean isSetEol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EOL$14) != null;
        }
    }
    
    /**
     * Sets the "eol" attribute
     */
    public void setEol(boolean eol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EOL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EOL$14);
            }
            target.setBooleanValue(eol);
        }
    }
    
    /**
     * Sets (as xml) the "eol" attribute
     */
    public void xsetEol(org.apache.xmlbeans.XmlBoolean eol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EOL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EOL$14);
            }
            target.set(eol);
        }
    }
    
    /**
     * Unsets the "eol" attribute
     */
    public void unsetEol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EOL$14);
        }
    }
    
    /**
     * Gets the "ref" attribute
     */
    public java.lang.String getRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ref" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(REF$16);
            return target;
        }
    }
    
    /**
     * Sets the "ref" attribute
     */
    public void setRef(java.lang.String ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$16);
            }
            target.setStringValue(ref);
        }
    }
    
    /**
     * Sets (as xml) the "ref" attribute
     */
    public void xsetRef(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(REF$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().add_attribute_user(REF$16);
            }
            target.set(ref);
        }
    }
    
    /**
     * Gets the "action" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRwColActionType.Enum getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$18);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRwColActionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "action" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRwColActionType xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRwColActionType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRwColActionType)get_store().find_attribute_user(ACTION$18);
            return target;
        }
    }
    
    /**
     * Sets the "action" attribute
     */
    public void setAction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRwColActionType.Enum action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$18);
            }
            target.setEnumValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "action" attribute
     */
    public void xsetAction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRwColActionType action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRwColActionType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRwColActionType)get_store().find_attribute_user(ACTION$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRwColActionType)get_store().add_attribute_user(ACTION$18);
            }
            target.set(action);
        }
    }
    
    /**
     * Gets the "edge" attribute
     */
    public boolean getEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDGE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EDGE$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "edge" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EDGE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EDGE$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "edge" attribute
     */
    public boolean isSetEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EDGE$20) != null;
        }
    }
    
    /**
     * Sets the "edge" attribute
     */
    public void setEdge(boolean edge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDGE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EDGE$20);
            }
            target.setBooleanValue(edge);
        }
    }
    
    /**
     * Sets (as xml) the "edge" attribute
     */
    public void xsetEdge(org.apache.xmlbeans.XmlBoolean edge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EDGE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EDGE$20);
            }
            target.set(edge);
        }
    }
    
    /**
     * Unsets the "edge" attribute
     */
    public void unsetEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EDGE$20);
        }
    }
}
