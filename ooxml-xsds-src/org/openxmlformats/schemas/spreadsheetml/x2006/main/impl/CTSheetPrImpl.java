/*
 * XML Type:  CT_SheetPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_SheetPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTSheetPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr
{
    
    public CTSheetPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABCOLOR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tabColor");
    private static final javax.xml.namespace.QName OUTLINEPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "outlinePr");
    private static final javax.xml.namespace.QName PAGESETUPPR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageSetUpPr");
    private static final javax.xml.namespace.QName SYNCHORIZONTAL$6 = 
        new javax.xml.namespace.QName("", "syncHorizontal");
    private static final javax.xml.namespace.QName SYNCVERTICAL$8 = 
        new javax.xml.namespace.QName("", "syncVertical");
    private static final javax.xml.namespace.QName SYNCREF$10 = 
        new javax.xml.namespace.QName("", "syncRef");
    private static final javax.xml.namespace.QName TRANSITIONEVALUATION$12 = 
        new javax.xml.namespace.QName("", "transitionEvaluation");
    private static final javax.xml.namespace.QName TRANSITIONENTRY$14 = 
        new javax.xml.namespace.QName("", "transitionEntry");
    private static final javax.xml.namespace.QName PUBLISHED$16 = 
        new javax.xml.namespace.QName("", "published");
    private static final javax.xml.namespace.QName CODENAME$18 = 
        new javax.xml.namespace.QName("", "codeName");
    private static final javax.xml.namespace.QName FILTERMODE$20 = 
        new javax.xml.namespace.QName("", "filterMode");
    private static final javax.xml.namespace.QName ENABLEFORMATCONDITIONSCALCULATION$22 = 
        new javax.xml.namespace.QName("", "enableFormatConditionsCalculation");
    
    
    /**
     * Gets the "tabColor" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor getTabColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(TABCOLOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tabColor" element
     */
    public boolean isSetTabColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABCOLOR$0) != 0;
        }
    }
    
    /**
     * Sets the "tabColor" element
     */
    public void setTabColor(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor tabColor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(TABCOLOR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().add_element_user(TABCOLOR$0);
            }
            target.set(tabColor);
        }
    }
    
    /**
     * Appends and returns a new empty "tabColor" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor addNewTabColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().add_element_user(TABCOLOR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "tabColor" element
     */
    public void unsetTabColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABCOLOR$0, 0);
        }
    }
    
    /**
     * Gets the "outlinePr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOutlinePr getOutlinePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOutlinePr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOutlinePr)get_store().find_element_user(OUTLINEPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "outlinePr" element
     */
    public boolean isSetOutlinePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTLINEPR$2) != 0;
        }
    }
    
    /**
     * Sets the "outlinePr" element
     */
    public void setOutlinePr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOutlinePr outlinePr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOutlinePr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOutlinePr)get_store().find_element_user(OUTLINEPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOutlinePr)get_store().add_element_user(OUTLINEPR$2);
            }
            target.set(outlinePr);
        }
    }
    
    /**
     * Appends and returns a new empty "outlinePr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOutlinePr addNewOutlinePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOutlinePr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOutlinePr)get_store().add_element_user(OUTLINEPR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "outlinePr" element
     */
    public void unsetOutlinePr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTLINEPR$2, 0);
        }
    }
    
    /**
     * Gets the "pageSetUpPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetUpPr getPageSetUpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetUpPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetUpPr)get_store().find_element_user(PAGESETUPPR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pageSetUpPr" element
     */
    public boolean isSetPageSetUpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGESETUPPR$4) != 0;
        }
    }
    
    /**
     * Sets the "pageSetUpPr" element
     */
    public void setPageSetUpPr(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetUpPr pageSetUpPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetUpPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetUpPr)get_store().find_element_user(PAGESETUPPR$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetUpPr)get_store().add_element_user(PAGESETUPPR$4);
            }
            target.set(pageSetUpPr);
        }
    }
    
    /**
     * Appends and returns a new empty "pageSetUpPr" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetUpPr addNewPageSetUpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetUpPr target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetUpPr)get_store().add_element_user(PAGESETUPPR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "pageSetUpPr" element
     */
    public void unsetPageSetUpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGESETUPPR$4, 0);
        }
    }
    
    /**
     * Gets the "syncHorizontal" attribute
     */
    public boolean getSyncHorizontal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCHORIZONTAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SYNCHORIZONTAL$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "syncHorizontal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSyncHorizontal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SYNCHORIZONTAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SYNCHORIZONTAL$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "syncHorizontal" attribute
     */
    public boolean isSetSyncHorizontal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SYNCHORIZONTAL$6) != null;
        }
    }
    
    /**
     * Sets the "syncHorizontal" attribute
     */
    public void setSyncHorizontal(boolean syncHorizontal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCHORIZONTAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCHORIZONTAL$6);
            }
            target.setBooleanValue(syncHorizontal);
        }
    }
    
    /**
     * Sets (as xml) the "syncHorizontal" attribute
     */
    public void xsetSyncHorizontal(org.apache.xmlbeans.XmlBoolean syncHorizontal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SYNCHORIZONTAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SYNCHORIZONTAL$6);
            }
            target.set(syncHorizontal);
        }
    }
    
    /**
     * Unsets the "syncHorizontal" attribute
     */
    public void unsetSyncHorizontal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SYNCHORIZONTAL$6);
        }
    }
    
    /**
     * Gets the "syncVertical" attribute
     */
    public boolean getSyncVertical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCVERTICAL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SYNCVERTICAL$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "syncVertical" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSyncVertical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SYNCVERTICAL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SYNCVERTICAL$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "syncVertical" attribute
     */
    public boolean isSetSyncVertical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SYNCVERTICAL$8) != null;
        }
    }
    
    /**
     * Sets the "syncVertical" attribute
     */
    public void setSyncVertical(boolean syncVertical)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCVERTICAL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCVERTICAL$8);
            }
            target.setBooleanValue(syncVertical);
        }
    }
    
    /**
     * Sets (as xml) the "syncVertical" attribute
     */
    public void xsetSyncVertical(org.apache.xmlbeans.XmlBoolean syncVertical)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SYNCVERTICAL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SYNCVERTICAL$8);
            }
            target.set(syncVertical);
        }
    }
    
    /**
     * Unsets the "syncVertical" attribute
     */
    public void unsetSyncVertical()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SYNCVERTICAL$8);
        }
    }
    
    /**
     * Gets the "syncRef" attribute
     */
    public java.lang.String getSyncRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCREF$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "syncRef" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef xgetSyncRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(SYNCREF$10);
            return target;
        }
    }
    
    /**
     * True if has "syncRef" attribute
     */
    public boolean isSetSyncRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SYNCREF$10) != null;
        }
    }
    
    /**
     * Sets the "syncRef" attribute
     */
    public void setSyncRef(java.lang.String syncRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYNCREF$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYNCREF$10);
            }
            target.setStringValue(syncRef);
        }
    }
    
    /**
     * Sets (as xml) the "syncRef" attribute
     */
    public void xsetSyncRef(org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef syncRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().find_attribute_user(SYNCREF$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef)get_store().add_attribute_user(SYNCREF$10);
            }
            target.set(syncRef);
        }
    }
    
    /**
     * Unsets the "syncRef" attribute
     */
    public void unsetSyncRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SYNCREF$10);
        }
    }
    
    /**
     * Gets the "transitionEvaluation" attribute
     */
    public boolean getTransitionEvaluation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSITIONEVALUATION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TRANSITIONEVALUATION$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "transitionEvaluation" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTransitionEvaluation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRANSITIONEVALUATION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TRANSITIONEVALUATION$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "transitionEvaluation" attribute
     */
    public boolean isSetTransitionEvaluation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TRANSITIONEVALUATION$12) != null;
        }
    }
    
    /**
     * Sets the "transitionEvaluation" attribute
     */
    public void setTransitionEvaluation(boolean transitionEvaluation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSITIONEVALUATION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSITIONEVALUATION$12);
            }
            target.setBooleanValue(transitionEvaluation);
        }
    }
    
    /**
     * Sets (as xml) the "transitionEvaluation" attribute
     */
    public void xsetTransitionEvaluation(org.apache.xmlbeans.XmlBoolean transitionEvaluation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRANSITIONEVALUATION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TRANSITIONEVALUATION$12);
            }
            target.set(transitionEvaluation);
        }
    }
    
    /**
     * Unsets the "transitionEvaluation" attribute
     */
    public void unsetTransitionEvaluation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TRANSITIONEVALUATION$12);
        }
    }
    
    /**
     * Gets the "transitionEntry" attribute
     */
    public boolean getTransitionEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSITIONENTRY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TRANSITIONENTRY$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "transitionEntry" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTransitionEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRANSITIONENTRY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TRANSITIONENTRY$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "transitionEntry" attribute
     */
    public boolean isSetTransitionEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TRANSITIONENTRY$14) != null;
        }
    }
    
    /**
     * Sets the "transitionEntry" attribute
     */
    public void setTransitionEntry(boolean transitionEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSITIONENTRY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSITIONENTRY$14);
            }
            target.setBooleanValue(transitionEntry);
        }
    }
    
    /**
     * Sets (as xml) the "transitionEntry" attribute
     */
    public void xsetTransitionEntry(org.apache.xmlbeans.XmlBoolean transitionEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRANSITIONENTRY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TRANSITIONENTRY$14);
            }
            target.set(transitionEntry);
        }
    }
    
    /**
     * Unsets the "transitionEntry" attribute
     */
    public void unsetTransitionEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TRANSITIONENTRY$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PUBLISHED$16);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PUBLISHED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PUBLISHED$16);
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
            return get_store().find_attribute_user(PUBLISHED$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLISHED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLISHED$16);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PUBLISHED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PUBLISHED$16);
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
            get_store().remove_attribute(PUBLISHED$16);
        }
    }
    
    /**
     * Gets the "codeName" attribute
     */
    public java.lang.String getCodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODENAME$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codeName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODENAME$18);
            return target;
        }
    }
    
    /**
     * True if has "codeName" attribute
     */
    public boolean isSetCodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODENAME$18) != null;
        }
    }
    
    /**
     * Sets the "codeName" attribute
     */
    public void setCodeName(java.lang.String codeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODENAME$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODENAME$18);
            }
            target.setStringValue(codeName);
        }
    }
    
    /**
     * Sets (as xml) the "codeName" attribute
     */
    public void xsetCodeName(org.apache.xmlbeans.XmlString codeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODENAME$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODENAME$18);
            }
            target.set(codeName);
        }
    }
    
    /**
     * Unsets the "codeName" attribute
     */
    public void unsetCodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODENAME$18);
        }
    }
    
    /**
     * Gets the "filterMode" attribute
     */
    public boolean getFilterMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTERMODE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FILTERMODE$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "filterMode" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFilterMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FILTERMODE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FILTERMODE$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "filterMode" attribute
     */
    public boolean isSetFilterMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILTERMODE$20) != null;
        }
    }
    
    /**
     * Sets the "filterMode" attribute
     */
    public void setFilterMode(boolean filterMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTERMODE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILTERMODE$20);
            }
            target.setBooleanValue(filterMode);
        }
    }
    
    /**
     * Sets (as xml) the "filterMode" attribute
     */
    public void xsetFilterMode(org.apache.xmlbeans.XmlBoolean filterMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FILTERMODE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FILTERMODE$20);
            }
            target.set(filterMode);
        }
    }
    
    /**
     * Unsets the "filterMode" attribute
     */
    public void unsetFilterMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILTERMODE$20);
        }
    }
    
    /**
     * Gets the "enableFormatConditionsCalculation" attribute
     */
    public boolean getEnableFormatConditionsCalculation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLEFORMATCONDITIONSCALCULATION$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENABLEFORMATCONDITIONSCALCULATION$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "enableFormatConditionsCalculation" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEnableFormatConditionsCalculation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLEFORMATCONDITIONSCALCULATION$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ENABLEFORMATCONDITIONSCALCULATION$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "enableFormatConditionsCalculation" attribute
     */
    public boolean isSetEnableFormatConditionsCalculation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENABLEFORMATCONDITIONSCALCULATION$22) != null;
        }
    }
    
    /**
     * Sets the "enableFormatConditionsCalculation" attribute
     */
    public void setEnableFormatConditionsCalculation(boolean enableFormatConditionsCalculation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLEFORMATCONDITIONSCALCULATION$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENABLEFORMATCONDITIONSCALCULATION$22);
            }
            target.setBooleanValue(enableFormatConditionsCalculation);
        }
    }
    
    /**
     * Sets (as xml) the "enableFormatConditionsCalculation" attribute
     */
    public void xsetEnableFormatConditionsCalculation(org.apache.xmlbeans.XmlBoolean enableFormatConditionsCalculation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLEFORMATCONDITIONSCALCULATION$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ENABLEFORMATCONDITIONSCALCULATION$22);
            }
            target.set(enableFormatConditionsCalculation);
        }
    }
    
    /**
     * Unsets the "enableFormatConditionsCalculation" attribute
     */
    public void unsetEnableFormatConditionsCalculation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENABLEFORMATCONDITIONSCALCULATION$22);
        }
    }
}
