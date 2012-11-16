/*
 * XML Type:  CT_RevisionCellChange
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_RevisionCellChange(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRevisionCellChangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionCellChange
{
    
    public CTRevisionCellChangeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OC$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oc");
    private static final javax.xml.namespace.QName NC$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "nc");
    private static final javax.xml.namespace.QName ODXF$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "odxf");
    private static final javax.xml.namespace.QName NDXF$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "ndxf");
    private static final javax.xml.namespace.QName EXTLST$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName RID$10 = 
        new javax.xml.namespace.QName("", "rId");
    private static final javax.xml.namespace.QName UA$12 = 
        new javax.xml.namespace.QName("", "ua");
    private static final javax.xml.namespace.QName RA$14 = 
        new javax.xml.namespace.QName("", "ra");
    private static final javax.xml.namespace.QName SID$16 = 
        new javax.xml.namespace.QName("", "sId");
    private static final javax.xml.namespace.QName ODXF2$18 = 
        new javax.xml.namespace.QName("", "odxf");
    private static final javax.xml.namespace.QName XFDXF$20 = 
        new javax.xml.namespace.QName("", "xfDxf");
    private static final javax.xml.namespace.QName S$22 = 
        new javax.xml.namespace.QName("", "s");
    private static final javax.xml.namespace.QName DXF$24 = 
        new javax.xml.namespace.QName("", "dxf");
    private static final javax.xml.namespace.QName NUMFMTID$26 = 
        new javax.xml.namespace.QName("", "numFmtId");
    private static final javax.xml.namespace.QName QUOTEPREFIX$28 = 
        new javax.xml.namespace.QName("", "quotePrefix");
    private static final javax.xml.namespace.QName OLDQUOTEPREFIX$30 = 
        new javax.xml.namespace.QName("", "oldQuotePrefix");
    private static final javax.xml.namespace.QName PH$32 = 
        new javax.xml.namespace.QName("", "ph");
    private static final javax.xml.namespace.QName OLDPH$34 = 
        new javax.xml.namespace.QName("", "oldPh");
    private static final javax.xml.namespace.QName ENDOFLISTFORMULAUPDATE$36 = 
        new javax.xml.namespace.QName("", "endOfListFormulaUpdate");
    
    
    /**
     * Gets the "oc" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell getOc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell)get_store().find_element_user(OC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "oc" element
     */
    public boolean isSetOc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OC$0) != 0;
        }
    }
    
    /**
     * Sets the "oc" element
     */
    public void setOc(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell oc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell)get_store().find_element_user(OC$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell)get_store().add_element_user(OC$0);
            }
            target.set(oc);
        }
    }
    
    /**
     * Appends and returns a new empty "oc" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell addNewOc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell)get_store().add_element_user(OC$0);
            return target;
        }
    }
    
    /**
     * Unsets the "oc" element
     */
    public void unsetOc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OC$0, 0);
        }
    }
    
    /**
     * Gets the "nc" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell getNc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell)get_store().find_element_user(NC$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nc" element
     */
    public void setNc(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell nc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell)get_store().find_element_user(NC$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell)get_store().add_element_user(NC$2);
            }
            target.set(nc);
        }
    }
    
    /**
     * Appends and returns a new empty "nc" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell addNewNc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell)get_store().add_element_user(NC$2);
            return target;
        }
    }
    
    /**
     * Gets the "odxf" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf getOdxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf)get_store().find_element_user(ODXF$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "odxf" element
     */
    public boolean isSetOdxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ODXF$4) != 0;
        }
    }
    
    /**
     * Sets the "odxf" element
     */
    public void setOdxf(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf odxf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf)get_store().find_element_user(ODXF$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf)get_store().add_element_user(ODXF$4);
            }
            target.set(odxf);
        }
    }
    
    /**
     * Appends and returns a new empty "odxf" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf addNewOdxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf)get_store().add_element_user(ODXF$4);
            return target;
        }
    }
    
    /**
     * Unsets the "odxf" element
     */
    public void unsetOdxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ODXF$4, 0);
        }
    }
    
    /**
     * Gets the "ndxf" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf getNdxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf)get_store().find_element_user(NDXF$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ndxf" element
     */
    public boolean isSetNdxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NDXF$6) != 0;
        }
    }
    
    /**
     * Sets the "ndxf" element
     */
    public void setNdxf(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf ndxf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf)get_store().find_element_user(NDXF$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf)get_store().add_element_user(NDXF$6);
            }
            target.set(ndxf);
        }
    }
    
    /**
     * Appends and returns a new empty "ndxf" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf addNewNdxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf)get_store().add_element_user(NDXF$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ndxf" element
     */
    public void unsetNdxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NDXF$6, 0);
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
     * Gets the "rId" attribute
     */
    public long getRId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RID$10);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(RID$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RID$10);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(RID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(RID$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UA$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UA$12);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UA$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(UA$12);
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
            return get_store().find_attribute_user(UA$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UA$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UA$12);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UA$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UA$12);
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
            get_store().remove_attribute(UA$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RA$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RA$14);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RA$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(RA$14);
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
            return get_store().find_attribute_user(RA$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RA$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RA$14);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RA$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RA$14);
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
            get_store().remove_attribute(RA$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SID$16);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SID$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SID$16);
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
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SID$16);
            }
            target.set(sId);
        }
    }
    
    /**
     * Gets the "odxf" attribute
     */
    public boolean getOdxf2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ODXF2$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ODXF2$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "odxf" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOdxf2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ODXF2$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ODXF2$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "odxf" attribute
     */
    public boolean isSetOdxf2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ODXF2$18) != null;
        }
    }
    
    /**
     * Sets the "odxf" attribute
     */
    public void setOdxf2(boolean odxf2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ODXF2$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ODXF2$18);
            }
            target.setBooleanValue(odxf2);
        }
    }
    
    /**
     * Sets (as xml) the "odxf" attribute
     */
    public void xsetOdxf2(org.apache.xmlbeans.XmlBoolean odxf2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ODXF2$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ODXF2$18);
            }
            target.set(odxf2);
        }
    }
    
    /**
     * Unsets the "odxf" attribute
     */
    public void unsetOdxf2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ODXF2$18);
        }
    }
    
    /**
     * Gets the "xfDxf" attribute
     */
    public boolean getXfDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XFDXF$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(XFDXF$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "xfDxf" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetXfDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(XFDXF$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(XFDXF$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "xfDxf" attribute
     */
    public boolean isSetXfDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XFDXF$20) != null;
        }
    }
    
    /**
     * Sets the "xfDxf" attribute
     */
    public void setXfDxf(boolean xfDxf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XFDXF$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XFDXF$20);
            }
            target.setBooleanValue(xfDxf);
        }
    }
    
    /**
     * Sets (as xml) the "xfDxf" attribute
     */
    public void xsetXfDxf(org.apache.xmlbeans.XmlBoolean xfDxf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(XFDXF$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(XFDXF$20);
            }
            target.set(xfDxf);
        }
    }
    
    /**
     * Unsets the "xfDxf" attribute
     */
    public void unsetXfDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XFDXF$20);
        }
    }
    
    /**
     * Gets the "s" attribute
     */
    public boolean getS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(S$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(S$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "s" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(S$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(S$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "s" attribute
     */
    public boolean isSetS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(S$22) != null;
        }
    }
    
    /**
     * Sets the "s" attribute
     */
    public void setS(boolean s)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(S$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(S$22);
            }
            target.setBooleanValue(s);
        }
    }
    
    /**
     * Sets (as xml) the "s" attribute
     */
    public void xsetS(org.apache.xmlbeans.XmlBoolean s)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(S$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(S$22);
            }
            target.set(s);
        }
    }
    
    /**
     * Unsets the "s" attribute
     */
    public void unsetS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(S$22);
        }
    }
    
    /**
     * Gets the "dxf" attribute
     */
    public boolean getDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DXF$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DXF$24);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dxf" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DXF$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DXF$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "dxf" attribute
     */
    public boolean isSetDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DXF$24) != null;
        }
    }
    
    /**
     * Sets the "dxf" attribute
     */
    public void setDxf(boolean dxf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DXF$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DXF$24);
            }
            target.setBooleanValue(dxf);
        }
    }
    
    /**
     * Sets (as xml) the "dxf" attribute
     */
    public void xsetDxf(org.apache.xmlbeans.XmlBoolean dxf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DXF$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DXF$24);
            }
            target.set(dxf);
        }
    }
    
    /**
     * Unsets the "dxf" attribute
     */
    public void unsetDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DXF$24);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMFMTID$26);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId)get_store().find_attribute_user(NUMFMTID$26);
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
            return get_store().find_attribute_user(NUMFMTID$26) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMFMTID$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMFMTID$26);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId)get_store().find_attribute_user(NUMFMTID$26);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId)get_store().add_attribute_user(NUMFMTID$26);
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
            get_store().remove_attribute(NUMFMTID$26);
        }
    }
    
    /**
     * Gets the "quotePrefix" attribute
     */
    public boolean getQuotePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUOTEPREFIX$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(QUOTEPREFIX$28);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "quotePrefix" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetQuotePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(QUOTEPREFIX$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(QUOTEPREFIX$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "quotePrefix" attribute
     */
    public boolean isSetQuotePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(QUOTEPREFIX$28) != null;
        }
    }
    
    /**
     * Sets the "quotePrefix" attribute
     */
    public void setQuotePrefix(boolean quotePrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUOTEPREFIX$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUOTEPREFIX$28);
            }
            target.setBooleanValue(quotePrefix);
        }
    }
    
    /**
     * Sets (as xml) the "quotePrefix" attribute
     */
    public void xsetQuotePrefix(org.apache.xmlbeans.XmlBoolean quotePrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(QUOTEPREFIX$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(QUOTEPREFIX$28);
            }
            target.set(quotePrefix);
        }
    }
    
    /**
     * Unsets the "quotePrefix" attribute
     */
    public void unsetQuotePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(QUOTEPREFIX$28);
        }
    }
    
    /**
     * Gets the "oldQuotePrefix" attribute
     */
    public boolean getOldQuotePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDQUOTEPREFIX$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OLDQUOTEPREFIX$30);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "oldQuotePrefix" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOldQuotePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OLDQUOTEPREFIX$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OLDQUOTEPREFIX$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "oldQuotePrefix" attribute
     */
    public boolean isSetOldQuotePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLDQUOTEPREFIX$30) != null;
        }
    }
    
    /**
     * Sets the "oldQuotePrefix" attribute
     */
    public void setOldQuotePrefix(boolean oldQuotePrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDQUOTEPREFIX$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLDQUOTEPREFIX$30);
            }
            target.setBooleanValue(oldQuotePrefix);
        }
    }
    
    /**
     * Sets (as xml) the "oldQuotePrefix" attribute
     */
    public void xsetOldQuotePrefix(org.apache.xmlbeans.XmlBoolean oldQuotePrefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OLDQUOTEPREFIX$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OLDQUOTEPREFIX$30);
            }
            target.set(oldQuotePrefix);
        }
    }
    
    /**
     * Unsets the "oldQuotePrefix" attribute
     */
    public void unsetOldQuotePrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLDQUOTEPREFIX$30);
        }
    }
    
    /**
     * Gets the "ph" attribute
     */
    public boolean getPh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PH$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PH$32);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ph" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PH$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PH$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "ph" attribute
     */
    public boolean isSetPh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PH$32) != null;
        }
    }
    
    /**
     * Sets the "ph" attribute
     */
    public void setPh(boolean ph)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PH$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PH$32);
            }
            target.setBooleanValue(ph);
        }
    }
    
    /**
     * Sets (as xml) the "ph" attribute
     */
    public void xsetPh(org.apache.xmlbeans.XmlBoolean ph)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PH$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PH$32);
            }
            target.set(ph);
        }
    }
    
    /**
     * Unsets the "ph" attribute
     */
    public void unsetPh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PH$32);
        }
    }
    
    /**
     * Gets the "oldPh" attribute
     */
    public boolean getOldPh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDPH$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OLDPH$34);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "oldPh" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOldPh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OLDPH$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OLDPH$34);
            }
            return target;
        }
    }
    
    /**
     * True if has "oldPh" attribute
     */
    public boolean isSetOldPh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OLDPH$34) != null;
        }
    }
    
    /**
     * Sets the "oldPh" attribute
     */
    public void setOldPh(boolean oldPh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OLDPH$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OLDPH$34);
            }
            target.setBooleanValue(oldPh);
        }
    }
    
    /**
     * Sets (as xml) the "oldPh" attribute
     */
    public void xsetOldPh(org.apache.xmlbeans.XmlBoolean oldPh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OLDPH$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OLDPH$34);
            }
            target.set(oldPh);
        }
    }
    
    /**
     * Unsets the "oldPh" attribute
     */
    public void unsetOldPh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OLDPH$34);
        }
    }
    
    /**
     * Gets the "endOfListFormulaUpdate" attribute
     */
    public boolean getEndOfListFormulaUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDOFLISTFORMULAUPDATE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENDOFLISTFORMULAUPDATE$36);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "endOfListFormulaUpdate" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEndOfListFormulaUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENDOFLISTFORMULAUPDATE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ENDOFLISTFORMULAUPDATE$36);
            }
            return target;
        }
    }
    
    /**
     * True if has "endOfListFormulaUpdate" attribute
     */
    public boolean isSetEndOfListFormulaUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENDOFLISTFORMULAUPDATE$36) != null;
        }
    }
    
    /**
     * Sets the "endOfListFormulaUpdate" attribute
     */
    public void setEndOfListFormulaUpdate(boolean endOfListFormulaUpdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDOFLISTFORMULAUPDATE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDOFLISTFORMULAUPDATE$36);
            }
            target.setBooleanValue(endOfListFormulaUpdate);
        }
    }
    
    /**
     * Sets (as xml) the "endOfListFormulaUpdate" attribute
     */
    public void xsetEndOfListFormulaUpdate(org.apache.xmlbeans.XmlBoolean endOfListFormulaUpdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENDOFLISTFORMULAUPDATE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ENDOFLISTFORMULAUPDATE$36);
            }
            target.set(endOfListFormulaUpdate);
        }
    }
    
    /**
     * Unsets the "endOfListFormulaUpdate" attribute
     */
    public void unsetEndOfListFormulaUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENDOFLISTFORMULAUPDATE$36);
        }
    }
}
