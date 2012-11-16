/*
 * XML Type:  CT_TableColumn
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_TableColumn(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTTableColumnImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn
{
    
    public CTTableColumnImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALCULATEDCOLUMNFORMULA$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "calculatedColumnFormula");
    private static final javax.xml.namespace.QName TOTALSROWFORMULA$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "totalsRowFormula");
    private static final javax.xml.namespace.QName XMLCOLUMNPR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "xmlColumnPr");
    private static final javax.xml.namespace.QName EXTLST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName UNIQUENAME$10 = 
        new javax.xml.namespace.QName("", "uniqueName");
    private static final javax.xml.namespace.QName NAME$12 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName TOTALSROWFUNCTION$14 = 
        new javax.xml.namespace.QName("", "totalsRowFunction");
    private static final javax.xml.namespace.QName TOTALSROWLABEL$16 = 
        new javax.xml.namespace.QName("", "totalsRowLabel");
    private static final javax.xml.namespace.QName QUERYTABLEFIELDID$18 = 
        new javax.xml.namespace.QName("", "queryTableFieldId");
    private static final javax.xml.namespace.QName HEADERROWDXFID$20 = 
        new javax.xml.namespace.QName("", "headerRowDxfId");
    private static final javax.xml.namespace.QName DATADXFID$22 = 
        new javax.xml.namespace.QName("", "dataDxfId");
    private static final javax.xml.namespace.QName TOTALSROWDXFID$24 = 
        new javax.xml.namespace.QName("", "totalsRowDxfId");
    private static final javax.xml.namespace.QName HEADERROWCELLSTYLE$26 = 
        new javax.xml.namespace.QName("", "headerRowCellStyle");
    private static final javax.xml.namespace.QName DATACELLSTYLE$28 = 
        new javax.xml.namespace.QName("", "dataCellStyle");
    private static final javax.xml.namespace.QName TOTALSROWCELLSTYLE$30 = 
        new javax.xml.namespace.QName("", "totalsRowCellStyle");
    
    
    /**
     * Gets the "calculatedColumnFormula" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula getCalculatedColumnFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula)get_store().find_element_user(CALCULATEDCOLUMNFORMULA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "calculatedColumnFormula" element
     */
    public boolean isSetCalculatedColumnFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALCULATEDCOLUMNFORMULA$0) != 0;
        }
    }
    
    /**
     * Sets the "calculatedColumnFormula" element
     */
    public void setCalculatedColumnFormula(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula calculatedColumnFormula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula)get_store().find_element_user(CALCULATEDCOLUMNFORMULA$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula)get_store().add_element_user(CALCULATEDCOLUMNFORMULA$0);
            }
            target.set(calculatedColumnFormula);
        }
    }
    
    /**
     * Appends and returns a new empty "calculatedColumnFormula" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula addNewCalculatedColumnFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula)get_store().add_element_user(CALCULATEDCOLUMNFORMULA$0);
            return target;
        }
    }
    
    /**
     * Unsets the "calculatedColumnFormula" element
     */
    public void unsetCalculatedColumnFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALCULATEDCOLUMNFORMULA$0, 0);
        }
    }
    
    /**
     * Gets the "totalsRowFormula" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula getTotalsRowFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula)get_store().find_element_user(TOTALSROWFORMULA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totalsRowFormula" element
     */
    public boolean isSetTotalsRowFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALSROWFORMULA$2) != 0;
        }
    }
    
    /**
     * Sets the "totalsRowFormula" element
     */
    public void setTotalsRowFormula(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula totalsRowFormula)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula)get_store().find_element_user(TOTALSROWFORMULA$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula)get_store().add_element_user(TOTALSROWFORMULA$2);
            }
            target.set(totalsRowFormula);
        }
    }
    
    /**
     * Appends and returns a new empty "totalsRowFormula" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula addNewTotalsRowFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula)get_store().add_element_user(TOTALSROWFORMULA$2);
            return target;
        }
    }
    
    /**
     * Unsets the "totalsRowFormula" element
     */
    public void unsetTotalsRowFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALSROWFORMULA$2, 0);
        }
    }
    
    /**
     * Gets the "xmlColumnPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlColumnPr getXmlColumnPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlColumnPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlColumnPr)get_store().find_element_user(XMLCOLUMNPR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "xmlColumnPr" element
     */
    public boolean isSetXmlColumnPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XMLCOLUMNPR$4) != 0;
        }
    }
    
    /**
     * Sets the "xmlColumnPr" element
     */
    public void setXmlColumnPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlColumnPr xmlColumnPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlColumnPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlColumnPr)get_store().find_element_user(XMLCOLUMNPR$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlColumnPr)get_store().add_element_user(XMLCOLUMNPR$4);
            }
            target.set(xmlColumnPr);
        }
    }
    
    /**
     * Appends and returns a new empty "xmlColumnPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlColumnPr addNewXmlColumnPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlColumnPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlColumnPr)get_store().add_element_user(XMLCOLUMNPR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "xmlColumnPr" element
     */
    public void unsetXmlColumnPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XMLCOLUMNPR$4, 0);
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
     * Gets the "id" attribute
     */
    public long getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(ID$8);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "uniqueName" attribute
     */
    public java.lang.String getUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUENAME$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uniqueName" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(UNIQUENAME$10);
            return target;
        }
    }
    
    /**
     * True if has "uniqueName" attribute
     */
    public boolean isSetUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNIQUENAME$10) != null;
        }
    }
    
    /**
     * Sets the "uniqueName" attribute
     */
    public void setUniqueName(java.lang.String uniqueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUENAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUENAME$10);
            }
            target.setStringValue(uniqueName);
        }
    }
    
    /**
     * Sets (as xml) the "uniqueName" attribute
     */
    public void xsetUniqueName(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring uniqueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(UNIQUENAME$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(UNIQUENAME$10);
            }
            target.set(uniqueName);
        }
    }
    
    /**
     * Unsets the "uniqueName" attribute
     */
    public void unsetUniqueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNIQUENAME$10);
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
     * Gets the "totalsRowFunction" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction.Enum getTotalsRowFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSROWFUNCTION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TOTALSROWFUNCTION$14);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "totalsRowFunction" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction xgetTotalsRowFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction)get_store().find_attribute_user(TOTALSROWFUNCTION$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction)get_default_attribute_value(TOTALSROWFUNCTION$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "totalsRowFunction" attribute
     */
    public boolean isSetTotalsRowFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOTALSROWFUNCTION$14) != null;
        }
    }
    
    /**
     * Sets the "totalsRowFunction" attribute
     */
    public void setTotalsRowFunction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction.Enum totalsRowFunction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSROWFUNCTION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALSROWFUNCTION$14);
            }
            target.setEnumValue(totalsRowFunction);
        }
    }
    
    /**
     * Sets (as xml) the "totalsRowFunction" attribute
     */
    public void xsetTotalsRowFunction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction totalsRowFunction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction)get_store().find_attribute_user(TOTALSROWFUNCTION$14);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction)get_store().add_attribute_user(TOTALSROWFUNCTION$14);
            }
            target.set(totalsRowFunction);
        }
    }
    
    /**
     * Unsets the "totalsRowFunction" attribute
     */
    public void unsetTotalsRowFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOTALSROWFUNCTION$14);
        }
    }
    
    /**
     * Gets the "totalsRowLabel" attribute
     */
    public java.lang.String getTotalsRowLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSROWLABEL$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "totalsRowLabel" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetTotalsRowLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(TOTALSROWLABEL$16);
            return target;
        }
    }
    
    /**
     * True if has "totalsRowLabel" attribute
     */
    public boolean isSetTotalsRowLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOTALSROWLABEL$16) != null;
        }
    }
    
    /**
     * Sets the "totalsRowLabel" attribute
     */
    public void setTotalsRowLabel(java.lang.String totalsRowLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSROWLABEL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALSROWLABEL$16);
            }
            target.setStringValue(totalsRowLabel);
        }
    }
    
    /**
     * Sets (as xml) the "totalsRowLabel" attribute
     */
    public void xsetTotalsRowLabel(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring totalsRowLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(TOTALSROWLABEL$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(TOTALSROWLABEL$16);
            }
            target.set(totalsRowLabel);
        }
    }
    
    /**
     * Unsets the "totalsRowLabel" attribute
     */
    public void unsetTotalsRowLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOTALSROWLABEL$16);
        }
    }
    
    /**
     * Gets the "queryTableFieldId" attribute
     */
    public long getQueryTableFieldId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUERYTABLEFIELDID$18);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "queryTableFieldId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetQueryTableFieldId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(QUERYTABLEFIELDID$18);
            return target;
        }
    }
    
    /**
     * True if has "queryTableFieldId" attribute
     */
    public boolean isSetQueryTableFieldId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(QUERYTABLEFIELDID$18) != null;
        }
    }
    
    /**
     * Sets the "queryTableFieldId" attribute
     */
    public void setQueryTableFieldId(long queryTableFieldId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUERYTABLEFIELDID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUERYTABLEFIELDID$18);
            }
            target.setLongValue(queryTableFieldId);
        }
    }
    
    /**
     * Sets (as xml) the "queryTableFieldId" attribute
     */
    public void xsetQueryTableFieldId(org.apache.xmlbeans.XmlUnsignedInt queryTableFieldId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(QUERYTABLEFIELDID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(QUERYTABLEFIELDID$18);
            }
            target.set(queryTableFieldId);
        }
    }
    
    /**
     * Unsets the "queryTableFieldId" attribute
     */
    public void unsetQueryTableFieldId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(QUERYTABLEFIELDID$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERROWDXFID$20);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(HEADERROWDXFID$20);
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
            return get_store().find_attribute_user(HEADERROWDXFID$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERROWDXFID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADERROWDXFID$20);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(HEADERROWDXFID$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().add_attribute_user(HEADERROWDXFID$20);
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
            get_store().remove_attribute(HEADERROWDXFID$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATADXFID$22);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(DATADXFID$22);
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
            return get_store().find_attribute_user(DATADXFID$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATADXFID$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATADXFID$22);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(DATADXFID$22);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().add_attribute_user(DATADXFID$22);
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
            get_store().remove_attribute(DATADXFID$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSROWDXFID$24);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(TOTALSROWDXFID$24);
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
            return get_store().find_attribute_user(TOTALSROWDXFID$24) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSROWDXFID$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALSROWDXFID$24);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(TOTALSROWDXFID$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().add_attribute_user(TOTALSROWDXFID$24);
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
            get_store().remove_attribute(TOTALSROWDXFID$24);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERROWCELLSTYLE$26);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(HEADERROWCELLSTYLE$26);
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
            return get_store().find_attribute_user(HEADERROWCELLSTYLE$26) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERROWCELLSTYLE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADERROWCELLSTYLE$26);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(HEADERROWCELLSTYLE$26);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(HEADERROWCELLSTYLE$26);
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
            get_store().remove_attribute(HEADERROWCELLSTYLE$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATACELLSTYLE$28);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DATACELLSTYLE$28);
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
            return get_store().find_attribute_user(DATACELLSTYLE$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATACELLSTYLE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATACELLSTYLE$28);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(DATACELLSTYLE$28);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(DATACELLSTYLE$28);
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
            get_store().remove_attribute(DATACELLSTYLE$28);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSROWCELLSTYLE$30);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(TOTALSROWCELLSTYLE$30);
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
            return get_store().find_attribute_user(TOTALSROWCELLSTYLE$30) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALSROWCELLSTYLE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALSROWCELLSTYLE$30);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(TOTALSROWCELLSTYLE$30);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(TOTALSROWCELLSTYLE$30);
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
            get_store().remove_attribute(TOTALSROWCELLSTYLE$30);
        }
    }
}
