/*
 * XML Type:  CT_AbstractNum
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_AbstractNum(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTAbstractNumImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum
{
    
    public CTAbstractNumImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NSID$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "nsid");
    private static final javax.xml.namespace.QName MULTILEVELTYPE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "multiLevelType");
    private static final javax.xml.namespace.QName TMPL$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tmpl");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "name");
    private static final javax.xml.namespace.QName STYLELINK$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "styleLink");
    private static final javax.xml.namespace.QName NUMSTYLELINK$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numStyleLink");
    private static final javax.xml.namespace.QName LVL$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lvl");
    private static final javax.xml.namespace.QName ABSTRACTNUMID$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "abstractNumId");
    
    
    /**
     * Gets the "nsid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber getNsid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().find_element_user(NSID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "nsid" element
     */
    public boolean isSetNsid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NSID$0) != 0;
        }
    }
    
    /**
     * Sets the "nsid" element
     */
    public void setNsid(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber nsid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().find_element_user(NSID$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().add_element_user(NSID$0);
            }
            target.set(nsid);
        }
    }
    
    /**
     * Appends and returns a new empty "nsid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber addNewNsid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().add_element_user(NSID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "nsid" element
     */
    public void unsetNsid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NSID$0, 0);
        }
    }
    
    /**
     * Gets the "multiLevelType" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMultiLevelType getMultiLevelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMultiLevelType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMultiLevelType)get_store().find_element_user(MULTILEVELTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "multiLevelType" element
     */
    public boolean isSetMultiLevelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MULTILEVELTYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "multiLevelType" element
     */
    public void setMultiLevelType(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMultiLevelType multiLevelType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMultiLevelType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMultiLevelType)get_store().find_element_user(MULTILEVELTYPE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMultiLevelType)get_store().add_element_user(MULTILEVELTYPE$2);
            }
            target.set(multiLevelType);
        }
    }
    
    /**
     * Appends and returns a new empty "multiLevelType" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMultiLevelType addNewMultiLevelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMultiLevelType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMultiLevelType)get_store().add_element_user(MULTILEVELTYPE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "multiLevelType" element
     */
    public void unsetMultiLevelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MULTILEVELTYPE$2, 0);
        }
    }
    
    /**
     * Gets the "tmpl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber getTmpl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().find_element_user(TMPL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tmpl" element
     */
    public boolean isSetTmpl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TMPL$4) != 0;
        }
    }
    
    /**
     * Sets the "tmpl" element
     */
    public void setTmpl(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber tmpl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().find_element_user(TMPL$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().add_element_user(TMPL$4);
            }
            target.set(tmpl);
        }
    }
    
    /**
     * Appends and returns a new empty "tmpl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber addNewTmpl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLongHexNumber)get_store().add_element_user(TMPL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "tmpl" element
     */
    public void unsetTmpl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TMPL$4, 0);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$6) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(NAME$6);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(NAME$6);
            return target;
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$6, 0);
        }
    }
    
    /**
     * Gets the "styleLink" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getStyleLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(STYLELINK$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "styleLink" element
     */
    public boolean isSetStyleLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLELINK$8) != 0;
        }
    }
    
    /**
     * Sets the "styleLink" element
     */
    public void setStyleLink(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString styleLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(STYLELINK$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(STYLELINK$8);
            }
            target.set(styleLink);
        }
    }
    
    /**
     * Appends and returns a new empty "styleLink" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewStyleLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(STYLELINK$8);
            return target;
        }
    }
    
    /**
     * Unsets the "styleLink" element
     */
    public void unsetStyleLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLELINK$8, 0);
        }
    }
    
    /**
     * Gets the "numStyleLink" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getNumStyleLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(NUMSTYLELINK$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "numStyleLink" element
     */
    public boolean isSetNumStyleLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMSTYLELINK$10) != 0;
        }
    }
    
    /**
     * Sets the "numStyleLink" element
     */
    public void setNumStyleLink(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString numStyleLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(NUMSTYLELINK$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(NUMSTYLELINK$10);
            }
            target.set(numStyleLink);
        }
    }
    
    /**
     * Appends and returns a new empty "numStyleLink" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewNumStyleLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(NUMSTYLELINK$10);
            return target;
        }
    }
    
    /**
     * Unsets the "numStyleLink" element
     */
    public void unsetNumStyleLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMSTYLELINK$10, 0);
        }
    }
    
    /**
     * Gets a List of "lvl" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl> getLvlList()
    {
        final class LvlList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl get(int i)
                { return CTAbstractNumImpl.this.getLvlArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl old = CTAbstractNumImpl.this.getLvlArray(i);
                CTAbstractNumImpl.this.setLvlArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl o)
                { CTAbstractNumImpl.this.insertNewLvl(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl old = CTAbstractNumImpl.this.getLvlArray(i);
                CTAbstractNumImpl.this.removeLvl(i);
                return old;
            }
            
            public int size()
                { return CTAbstractNumImpl.this.sizeOfLvlArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LvlList();
        }
    }
    
    /**
     * Gets array of all "lvl" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl[] getLvlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LVL$12, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lvl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl getLvlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl)get_store().find_element_user(LVL$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lvl" element
     */
    public int sizeOfLvlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LVL$12);
        }
    }
    
    /**
     * Sets array of all "lvl" element
     */
    public void setLvlArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl[] lvlArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lvlArray, LVL$12);
        }
    }
    
    /**
     * Sets ith "lvl" element
     */
    public void setLvlArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl lvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl)get_store().find_element_user(LVL$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lvl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lvl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl insertNewLvl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl)get_store().insert_element_user(LVL$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lvl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl addNewLvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl)get_store().add_element_user(LVL$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "lvl" element
     */
    public void removeLvl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LVL$12, i);
        }
    }
    
    /**
     * Gets the "abstractNumId" attribute
     */
    public java.math.BigInteger getAbstractNumId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACTNUMID$14);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "abstractNumId" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetAbstractNumId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(ABSTRACTNUMID$14);
            return target;
        }
    }
    
    /**
     * Sets the "abstractNumId" attribute
     */
    public void setAbstractNumId(java.math.BigInteger abstractNumId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACTNUMID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABSTRACTNUMID$14);
            }
            target.setBigIntegerValue(abstractNumId);
        }
    }
    
    /**
     * Sets (as xml) the "abstractNumId" attribute
     */
    public void xsetAbstractNumId(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber abstractNumId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(ABSTRACTNUMID$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(ABSTRACTNUMID$14);
            }
            target.set(abstractNumId);
        }
    }
}
