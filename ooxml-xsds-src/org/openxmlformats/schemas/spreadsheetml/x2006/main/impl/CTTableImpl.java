/*
 * XML Type:  CT_Table
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Table(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTTableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable
{
    
    public CTTableImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTOFILTER$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "autoFilter");
    private static final javax.xml.namespace.QName SORTSTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sortState");
    private static final javax.xml.namespace.QName TABLECOLUMNS$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tableColumns");
    private static final javax.xml.namespace.QName TABLESTYLEINFO$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tableStyleInfo");
    private static final javax.xml.namespace.QName EXTLST$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName NAME$12 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName DISPLAYNAME$14 = 
        new javax.xml.namespace.QName("", "displayName");
    private static final javax.xml.namespace.QName COMMENT$16 = 
        new javax.xml.namespace.QName("", "comment");
    private static final javax.xml.namespace.QName REF$18 = 
        new javax.xml.namespace.QName("", "ref");
    private static final javax.xml.namespace.QName TABLETYPE$20 = 
        new javax.xml.namespace.QName("", "tableType");
    private static final javax.xml.namespace.QName HEADERROWCOUNT$22 = 
        new javax.xml.namespace.QName("", "headerRowCount");
    private static final javax.xml.namespace.QName INSERTROW$24 = 
        new javax.xml.namespace.QName("", "insertRow");
    private static final javax.xml.namespace.QName INSERTROWSHIFT$26 = 
        new javax.xml.namespace.QName("", "insertRowShift");
    private static final javax.xml.namespace.QName TOTALSROWCOUNT$28 = 
        new javax.xml.namespace.QName("", "totalsRowCount");
    private static final javax.xml.namespace.QName TOTALSROWSHOWN$30 = 
        new javax.xml.namespace.QName("", "totalsRowShown");
    private static final javax.xml.namespace.QName PUBLISHED$32 = 
        new javax.xml.namespace.QName("", "published");
    private static final javax.xml.namespace.QName HEADERROWDXFID$34 = 
        new javax.xml.namespace.QName("", "headerRowDxfId");
    private static final javax.xml.namespace.QName DATADXFID$36 = 
        new javax.xml.namespace.QName("", "dataDxfId");
    private static final javax.xml.namespace.QName TOTALSROWDXFID$38 = 
        new javax.xml.namespace.QName("", "totalsRowDxfId");
    private static final javax.xml.namespace.QName HEADERROWBORDERDXFID$40 = 
        new javax.xml.namespace.QName("", "headerRowBorderDxfId");
    private static final javax.xml.namespace.QName TABLEBORDERDXFID$42 = 
        new javax.xml.namespace.QName("", "tableBorderDxfId");
    private static final javax.xml.namespace.QName TOTALSROWBORDERDXFID$44 = 
        new javax.xml.namespace.QName("", "totalsRowBorderDxfId");
    private static final javax.xml.namespace.QName HEADERROWCELLSTYLE$46 = 
        new javax.xml.namespace.QName("", "headerRowCellStyle");
    private static final javax.xml.namespace.QName DATACELLSTYLE$48 = 
        new javax.xml.namespace.QName("", "dataCellStyle");
    private static final javax.xml.namespace.QName TOTALSROWCELLSTYLE$50 = 
        new javax.xml.namespace.QName("", "totalsRowCellStyle");
    private static final javax.xml.namespace.QName CONNECTIONID$52 = 
        new javax.xml.namespace.QName("", "connectionId");
    
    
    /**
     * Gets the "autoFilter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter getAutoFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().find_element_user(AUTOFILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "autoFilter" element
     */
    public boolean isSetAutoFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOFILTER$0) != 0;
        }
    }
    
    /**
     * Sets the "autoFilter" element
     */
    public void setAutoFilter(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter autoFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().find_element_user(AUTOFILTER$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().add_element_user(AUTOFILTER$0);
            }
            target.set(autoFilter);
        }
    }
    
    /**
     * Appends and returns a new empty "autoFilter" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter addNewAutoFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter)get_store().add_element_user(AUTOFILTER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "autoFilter" element
     */
    public void unsetAutoFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOFILTER$0, 0);
        }
    }
    
    /**
     * Gets the "sortState" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState getSortState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().find_element_user(SORTSTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sortState" element
     */
    public boolean isSetSortState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SORTSTATE$2) != 0;
        }
    }
    
    /**
     * Sets the "sortState" element
     */
    public void setSortState(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState sortState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().find_element_user(SORTSTATE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().add_element_user(SORTSTATE$2);
            }
            target.set(sortState);
        }
    }
    
    /**
     * Appends and returns a new empty "sortState" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState addNewSortState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState)get_store().add_element_user(SORTSTATE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "sortState" element
     */
    public void unsetSortState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SORTSTATE$2, 0);
        }
    }
    
    /**
     * Gets the "tableColumns" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns getTableColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns)get_store().find_element_user(TABLECOLUMNS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tableColumns" element
     */
    public void setTableColumns(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns tableColumns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns)get_store().find_element_user(TABLECOLUMNS$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns)get_store().add_element_user(TABLECOLUMNS$4);
            }
            target.set(tableColumns);
        }
    }
    
    /**
     * Appends and returns a new empty "tableColumns" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns addNewTableColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns)get_store().add_element_user(TABLECOLUMNS$4);
            return target;
        }
    }
    
    /**
     * Gets the "tableStyleInfo" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo getTableStyleInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo)get_store().find_element_user(TABLESTYLEINFO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tableStyleInfo" element
     */
    public boolean isSetTableStyleInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABLESTYLEINFO$6) != 0;
        }
    }
    
    /**
     * Sets the "tableStyleInfo" element
     */
    public void setTableStyleInfo(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo tableStyleInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo)get_store().find_element_user(TABLESTYLEINFO$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo)get_store().add_element_user(TABLESTYLEINFO$6);
            }
            target.set(tableStyleInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "tableStyleInfo" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo addNewTableStyleInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo)get_store().add_element_user(TABLESTYLEINFO$6);
            return target;
        }
    }
    
    /**
     * Unsets the "tableStyleInfo" element
     */
    public void unsetTableStyleInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABLESTYLEINFO$6, 0);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$8, 0);
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
            return get_store().count_elements(EXTLST$8) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$8);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$8);
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
            get_store().remove_element(EXTLST$8, 0);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public long getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ID$10);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(long id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
            }
            target.setLongValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlUnsignedInt id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ID$10);
            }
            target.set(id);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$12);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$12);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$12);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(NAME$12);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(NAME$12);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$12);
        }
    }
    
    /**
     * Gets the "displayName" attribute
     */
    public java.lang.String getDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "displayName" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DISPLAYNAME$14);
            return target;
        }
    }
    
    /**
     * Sets the "displayName" attribute
     */
    public void setDisplayName(java.lang.String displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYNAME$14);
            }
            target.setStringValue(displayName);
        }
    }
    
    /**
     * Sets (as xml) the "displayName" attribute
     */
    public void xsetDisplayName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DISPLAYNAME$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DISPLAYNAME$14);
            }
            target.set(displayName);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMENT$16);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(COMMENT$16);
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
            return get_store().find_attribute_user(COMMENT$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMENT$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMMENT$16);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(COMMENT$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(COMMENT$16);
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
            get_store().remove_attribute(COMMENT$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$18);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(REF$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$18);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(REF$18);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().add_attribute_user(REF$18);
            }
            target.set(ref);
        }
    }
    
    /**
     * Gets the "tableType" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType.Enum getTableType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLETYPE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TABLETYPE$20);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "tableType" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType xgetTableType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType)get_store().find_attribute_user(TABLETYPE$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType)get_default_attribute_value(TABLETYPE$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "tableType" attribute
     */
    public boolean isSetTableType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TABLETYPE$20) != null;
        }
    }
    
    /**
     * Sets the "tableType" attribute
     */
    public void setTableType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType.Enum tableType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLETYPE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TABLETYPE$20);
            }
            target.setEnumValue(tableType);
        }
    }
    
    /**
     * Sets (as xml) the "tableType" attribute
     */
    public void xsetTableType(org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType tableType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType)get_store().find_attribute_user(TABLETYPE$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType)get_store().add_attribute_user(TABLETYPE$20);
            }
            target.set(tableType);
        }
    }
    
    /**
     * Unsets the "tableType" attribute
     */
    public void unsetTableType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TABLETYPE$20);
        }
    }
    
    /**
     * Gets the "headerRowCount" attribute
     */
    public long getHeaderRowCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERROWCOUNT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HEADERROWCOUNT$22);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "headerRowCount" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetHeaderRowCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(HEADERROWCOUNT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(HEADERROWCOUNT$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "headerRowCount" attribute
     */
    public boolean isSetHeaderRowCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HEADERROWCOUNT$22) != null;
        }
    }
    
    /**
     * Sets the "headerRowCount" attribute
     */
    public void setHeaderRowCount(long headerRowCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERROWCOUNT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADERROWCOUNT$22);
            }
            target.setLongValue(headerRowCount);
        }
    }
    
    /**
     * Sets (as xml) the "headerRowCount" attribute
     */
    public void xsetHeaderRowCount(org.apache.xmlbeans.XmlUnsignedInt headerRowCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(HEADERROWCOUNT$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(HEADERROWCOUNT$22);
            }
            target.set(headerRowCount);
        }
    }
    
    /**
     * Unsets the "headerRowCount" attribute
     */
    public void unsetHeaderRowCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HEADERROWCOUNT$22);
        }
    }
    
    /**
     * Gets the "insertRow" attribute
     */
    public boolean getInsertRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSERTROW$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INSERTROW$24);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "insertRow" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetInsertRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSERTROW$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INSERTROW$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "insertRow" attribute
     */
    public boolean isSetInsertRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSERTROW$24) != null;
        }
    }
    
    /**
     * Sets the "insertRow" attribute
     */
    public void setInsertRow(boolean insertRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSERTROW$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSERTROW$24);
            }
            target.setBooleanValue(insertRow);
        }
    }
    
    /**
     * Sets (as xml) the "insertRow" attribute
     */
    public void xsetInsertRow(org.apache.xmlbeans.XmlBoolean insertRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSERTROW$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INSERTROW$24);
            }
            target.set(insertRow);
        }
    }
    
    /**
     * Unsets the "insertRow" attribute
     */
    public void unsetInsertRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSERTROW$24);
        }
    }
    
    /**
     * Gets the "insertRowShift" attribute
     */
    public boolean getInsertRowShift()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSERTROWSHIFT$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INSERTROWSHIFT$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "insertRowShift" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetInsertRowShift()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSERTROWSHIFT$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INSERTROWSHIFT$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "insertRowShift" attribute
     */
    public boolean isSetInsertRowShift()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSERTROWSHIFT$26) != null;
        }
    }
    
    /**
     * Sets the "insertRowShift" attribute
     */
    public void setInsertRowShift(boolean insertRowShift)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSERTROWSHIFT$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSERTROWSHIFT$26);
            }
            target.setBooleanValue(insertRowShift);
        }
    }
    
    /**
     * Sets (as xml) the "insertRowShift" attribute
     */
    public void xsetInsertRowShift(org.apache.xmlbeans.XmlBoolean insertRowShift)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INSERTROWSHIFT$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INSERTROWSHIFT$26);
            }
            target.set(insertRowShift);
        }
    }
    
    /**
     * Unsets the "insertRowShift" attribute
     */
    public void unsetInsertRowShift()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSERTROWSHIFT$26);
        }
    }
    
    /**
     * Gets the "totalsRowCount" attribute
     */
    public long getTotalsRowCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSROWCOUNT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TOTALSROWCOUNT$28);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "totalsRowCount" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetTotalsRowCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(TOTALSROWCOUNT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(TOTALSROWCOUNT$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "totalsRowCount" attribute
     */
    public boolean isSetTotalsRowCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOTALSROWCOUNT$28) != null;
        }
    }
    
    /**
     * Sets the "totalsRowCount" attribute
     */
    public void setTotalsRowCount(long totalsRowCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSROWCOUNT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALSROWCOUNT$28);
            }
            target.setLongValue(totalsRowCount);
        }
    }
    
    /**
     * Sets (as xml) the "totalsRowCount" attribute
     */
    public void xsetTotalsRowCount(org.apache.xmlbeans.XmlUnsignedInt totalsRowCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(TOTALSROWCOUNT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(TOTALSROWCOUNT$28);
            }
            target.set(totalsRowCount);
        }
    }
    
    /**
     * Unsets the "totalsRowCount" attribute
     */
    public void unsetTotalsRowCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOTALSROWCOUNT$28);
        }
    }
    
    /**
     * Gets the "totalsRowShown" attribute
     */
    public boolean getTotalsRowShown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSROWSHOWN$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TOTALSROWSHOWN$30);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "totalsRowShown" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTotalsRowShown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TOTALSROWSHOWN$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TOTALSROWSHOWN$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "totalsRowShown" attribute
     */
    public boolean isSetTotalsRowShown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOTALSROWSHOWN$30) != null;
        }
    }
    
    /**
     * Sets the "totalsRowShown" attribute
     */
    public void setTotalsRowShown(boolean totalsRowShown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSROWSHOWN$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALSROWSHOWN$30);
            }
            target.setBooleanValue(totalsRowShown);
        }
    }
    
    /**
     * Sets (as xml) the "totalsRowShown" attribute
     */
    public void xsetTotalsRowShown(org.apache.xmlbeans.XmlBoolean totalsRowShown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TOTALSROWSHOWN$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TOTALSROWSHOWN$30);
            }
            target.set(totalsRowShown);
        }
    }
    
    /**
     * Unsets the "totalsRowShown" attribute
     */
    public void unsetTotalsRowShown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOTALSROWSHOWN$30);
        }
    }
    
    /**
     * Gets the "published" attribute
     */
    public boolean getPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHED$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PUBLISHED$32);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "published" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PUBLISHED$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PUBLISHED$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "published" attribute
     */
    public boolean isSetPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PUBLISHED$32) != null;
        }
    }
    
    /**
     * Sets the "published" attribute
     */
    public void setPublished(boolean published)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHED$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLISHED$32);
            }
            target.setBooleanValue(published);
        }
    }
    
    /**
     * Sets (as xml) the "published" attribute
     */
    public void xsetPublished(org.apache.xmlbeans.XmlBoolean published)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PUBLISHED$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PUBLISHED$32);
            }
            target.set(published);
        }
    }
    
    /**
     * Unsets the "published" attribute
     */
    public void unsetPublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PUBLISHED$32);
        }
    }
    
    /**
     * Gets the "headerRowDxfId" attribute
     */
    public long getHeaderRowDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERROWDXFID$34);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "headerRowDxfId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId xgetHeaderRowDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(HEADERROWDXFID$34);
            return target;
        }
    }
    
    /**
     * True if has "headerRowDxfId" attribute
     */
    public boolean isSetHeaderRowDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HEADERROWDXFID$34) != null;
        }
    }
    
    /**
     * Sets the "headerRowDxfId" attribute
     */
    public void setHeaderRowDxfId(long headerRowDxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERROWDXFID$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADERROWDXFID$34);
            }
            target.setLongValue(headerRowDxfId);
        }
    }
    
    /**
     * Sets (as xml) the "headerRowDxfId" attribute
     */
    public void xsetHeaderRowDxfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId headerRowDxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(HEADERROWDXFID$34);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().add_attribute_user(HEADERROWDXFID$34);
            }
            target.set(headerRowDxfId);
        }
    }
    
    /**
     * Unsets the "headerRowDxfId" attribute
     */
    public void unsetHeaderRowDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HEADERROWDXFID$34);
        }
    }
    
    /**
     * Gets the "dataDxfId" attribute
     */
    public long getDataDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATADXFID$36);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataDxfId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId xgetDataDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(DATADXFID$36);
            return target;
        }
    }
    
    /**
     * True if has "dataDxfId" attribute
     */
    public boolean isSetDataDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATADXFID$36) != null;
        }
    }
    
    /**
     * Sets the "dataDxfId" attribute
     */
    public void setDataDxfId(long dataDxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATADXFID$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATADXFID$36);
            }
            target.setLongValue(dataDxfId);
        }
    }
    
    /**
     * Sets (as xml) the "dataDxfId" attribute
     */
    public void xsetDataDxfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId dataDxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(DATADXFID$36);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().add_attribute_user(DATADXFID$36);
            }
            target.set(dataDxfId);
        }
    }
    
    /**
     * Unsets the "dataDxfId" attribute
     */
    public void unsetDataDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATADXFID$36);
        }
    }
    
    /**
     * Gets the "totalsRowDxfId" attribute
     */
    public long getTotalsRowDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSROWDXFID$38);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "totalsRowDxfId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId xgetTotalsRowDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(TOTALSROWDXFID$38);
            return target;
        }
    }
    
    /**
     * True if has "totalsRowDxfId" attribute
     */
    public boolean isSetTotalsRowDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOTALSROWDXFID$38) != null;
        }
    }
    
    /**
     * Sets the "totalsRowDxfId" attribute
     */
    public void setTotalsRowDxfId(long totalsRowDxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSROWDXFID$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALSROWDXFID$38);
            }
            target.setLongValue(totalsRowDxfId);
        }
    }
    
    /**
     * Sets (as xml) the "totalsRowDxfId" attribute
     */
    public void xsetTotalsRowDxfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId totalsRowDxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(TOTALSROWDXFID$38);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().add_attribute_user(TOTALSROWDXFID$38);
            }
            target.set(totalsRowDxfId);
        }
    }
    
    /**
     * Unsets the "totalsRowDxfId" attribute
     */
    public void unsetTotalsRowDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOTALSROWDXFID$38);
        }
    }
    
    /**
     * Gets the "headerRowBorderDxfId" attribute
     */
    public long getHeaderRowBorderDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERROWBORDERDXFID$40);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "headerRowBorderDxfId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId xgetHeaderRowBorderDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(HEADERROWBORDERDXFID$40);
            return target;
        }
    }
    
    /**
     * True if has "headerRowBorderDxfId" attribute
     */
    public boolean isSetHeaderRowBorderDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HEADERROWBORDERDXFID$40) != null;
        }
    }
    
    /**
     * Sets the "headerRowBorderDxfId" attribute
     */
    public void setHeaderRowBorderDxfId(long headerRowBorderDxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERROWBORDERDXFID$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADERROWBORDERDXFID$40);
            }
            target.setLongValue(headerRowBorderDxfId);
        }
    }
    
    /**
     * Sets (as xml) the "headerRowBorderDxfId" attribute
     */
    public void xsetHeaderRowBorderDxfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId headerRowBorderDxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(HEADERROWBORDERDXFID$40);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().add_attribute_user(HEADERROWBORDERDXFID$40);
            }
            target.set(headerRowBorderDxfId);
        }
    }
    
    /**
     * Unsets the "headerRowBorderDxfId" attribute
     */
    public void unsetHeaderRowBorderDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HEADERROWBORDERDXFID$40);
        }
    }
    
    /**
     * Gets the "tableBorderDxfId" attribute
     */
    public long getTableBorderDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLEBORDERDXFID$42);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "tableBorderDxfId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId xgetTableBorderDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(TABLEBORDERDXFID$42);
            return target;
        }
    }
    
    /**
     * True if has "tableBorderDxfId" attribute
     */
    public boolean isSetTableBorderDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TABLEBORDERDXFID$42) != null;
        }
    }
    
    /**
     * Sets the "tableBorderDxfId" attribute
     */
    public void setTableBorderDxfId(long tableBorderDxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABLEBORDERDXFID$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TABLEBORDERDXFID$42);
            }
            target.setLongValue(tableBorderDxfId);
        }
    }
    
    /**
     * Sets (as xml) the "tableBorderDxfId" attribute
     */
    public void xsetTableBorderDxfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId tableBorderDxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(TABLEBORDERDXFID$42);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().add_attribute_user(TABLEBORDERDXFID$42);
            }
            target.set(tableBorderDxfId);
        }
    }
    
    /**
     * Unsets the "tableBorderDxfId" attribute
     */
    public void unsetTableBorderDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TABLEBORDERDXFID$42);
        }
    }
    
    /**
     * Gets the "totalsRowBorderDxfId" attribute
     */
    public long getTotalsRowBorderDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSROWBORDERDXFID$44);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "totalsRowBorderDxfId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId xgetTotalsRowBorderDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(TOTALSROWBORDERDXFID$44);
            return target;
        }
    }
    
    /**
     * True if has "totalsRowBorderDxfId" attribute
     */
    public boolean isSetTotalsRowBorderDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOTALSROWBORDERDXFID$44) != null;
        }
    }
    
    /**
     * Sets the "totalsRowBorderDxfId" attribute
     */
    public void setTotalsRowBorderDxfId(long totalsRowBorderDxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSROWBORDERDXFID$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALSROWBORDERDXFID$44);
            }
            target.setLongValue(totalsRowBorderDxfId);
        }
    }
    
    /**
     * Sets (as xml) the "totalsRowBorderDxfId" attribute
     */
    public void xsetTotalsRowBorderDxfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId totalsRowBorderDxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(TOTALSROWBORDERDXFID$44);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().add_attribute_user(TOTALSROWBORDERDXFID$44);
            }
            target.set(totalsRowBorderDxfId);
        }
    }
    
    /**
     * Unsets the "totalsRowBorderDxfId" attribute
     */
    public void unsetTotalsRowBorderDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOTALSROWBORDERDXFID$44);
        }
    }
    
    /**
     * Gets the "headerRowCellStyle" attribute
     */
    public java.lang.String getHeaderRowCellStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERROWCELLSTYLE$46);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "headerRowCellStyle" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetHeaderRowCellStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(HEADERROWCELLSTYLE$46);
            return target;
        }
    }
    
    /**
     * True if has "headerRowCellStyle" attribute
     */
    public boolean isSetHeaderRowCellStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HEADERROWCELLSTYLE$46) != null;
        }
    }
    
    /**
     * Sets the "headerRowCellStyle" attribute
     */
    public void setHeaderRowCellStyle(java.lang.String headerRowCellStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERROWCELLSTYLE$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADERROWCELLSTYLE$46);
            }
            target.setStringValue(headerRowCellStyle);
        }
    }
    
    /**
     * Sets (as xml) the "headerRowCellStyle" attribute
     */
    public void xsetHeaderRowCellStyle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring headerRowCellStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(HEADERROWCELLSTYLE$46);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(HEADERROWCELLSTYLE$46);
            }
            target.set(headerRowCellStyle);
        }
    }
    
    /**
     * Unsets the "headerRowCellStyle" attribute
     */
    public void unsetHeaderRowCellStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HEADERROWCELLSTYLE$46);
        }
    }
    
    /**
     * Gets the "dataCellStyle" attribute
     */
    public java.lang.String getDataCellStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATACELLSTYLE$48);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataCellStyle" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetDataCellStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DATACELLSTYLE$48);
            return target;
        }
    }
    
    /**
     * True if has "dataCellStyle" attribute
     */
    public boolean isSetDataCellStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATACELLSTYLE$48) != null;
        }
    }
    
    /**
     * Sets the "dataCellStyle" attribute
     */
    public void setDataCellStyle(java.lang.String dataCellStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATACELLSTYLE$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATACELLSTYLE$48);
            }
            target.setStringValue(dataCellStyle);
        }
    }
    
    /**
     * Sets (as xml) the "dataCellStyle" attribute
     */
    public void xsetDataCellStyle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring dataCellStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DATACELLSTYLE$48);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DATACELLSTYLE$48);
            }
            target.set(dataCellStyle);
        }
    }
    
    /**
     * Unsets the "dataCellStyle" attribute
     */
    public void unsetDataCellStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATACELLSTYLE$48);
        }
    }
    
    /**
     * Gets the "totalsRowCellStyle" attribute
     */
    public java.lang.String getTotalsRowCellStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSROWCELLSTYLE$50);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "totalsRowCellStyle" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetTotalsRowCellStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(TOTALSROWCELLSTYLE$50);
            return target;
        }
    }
    
    /**
     * True if has "totalsRowCellStyle" attribute
     */
    public boolean isSetTotalsRowCellStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOTALSROWCELLSTYLE$50) != null;
        }
    }
    
    /**
     * Sets the "totalsRowCellStyle" attribute
     */
    public void setTotalsRowCellStyle(java.lang.String totalsRowCellStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSROWCELLSTYLE$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALSROWCELLSTYLE$50);
            }
            target.setStringValue(totalsRowCellStyle);
        }
    }
    
    /**
     * Sets (as xml) the "totalsRowCellStyle" attribute
     */
    public void xsetTotalsRowCellStyle(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring totalsRowCellStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(TOTALSROWCELLSTYLE$50);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(TOTALSROWCELLSTYLE$50);
            }
            target.set(totalsRowCellStyle);
        }
    }
    
    /**
     * Unsets the "totalsRowCellStyle" attribute
     */
    public void unsetTotalsRowCellStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOTALSROWCELLSTYLE$50);
        }
    }
    
    /**
     * Gets the "connectionId" attribute
     */
    public long getConnectionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTIONID$52);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "connectionId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetConnectionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CONNECTIONID$52);
            return target;
        }
    }
    
    /**
     * True if has "connectionId" attribute
     */
    public boolean isSetConnectionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONNECTIONID$52) != null;
        }
    }
    
    /**
     * Sets the "connectionId" attribute
     */
    public void setConnectionId(long connectionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTIONID$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTIONID$52);
            }
            target.setLongValue(connectionId);
        }
    }
    
    /**
     * Sets (as xml) the "connectionId" attribute
     */
    public void xsetConnectionId(org.apache.xmlbeans.XmlUnsignedInt connectionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(CONNECTIONID$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(CONNECTIONID$52);
            }
            target.set(connectionId);
        }
    }
    
    /**
     * Unsets the "connectionId" attribute
     */
    public void unsetConnectionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONNECTIONID$52);
        }
    }
}
