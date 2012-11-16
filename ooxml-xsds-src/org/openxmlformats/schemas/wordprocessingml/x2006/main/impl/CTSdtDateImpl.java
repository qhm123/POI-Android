/*
 * XML Type:  CT_SdtDate
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_SdtDate(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTSdtDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate
{
    
    public CTSdtDateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATEFORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dateFormat");
    private static final javax.xml.namespace.QName LID$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lid");
    private static final javax.xml.namespace.QName STOREMAPPEDDATAAS$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "storeMappedDataAs");
    private static final javax.xml.namespace.QName CALENDAR$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "calendar");
    private static final javax.xml.namespace.QName FULLDATE$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fullDate");
    
    
    /**
     * Gets the "dateFormat" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getDateFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(DATEFORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dateFormat" element
     */
    public boolean isSetDateFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEFORMAT$0) != 0;
        }
    }
    
    /**
     * Sets the "dateFormat" element
     */
    public void setDateFormat(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString dateFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(DATEFORMAT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(DATEFORMAT$0);
            }
            target.set(dateFormat);
        }
    }
    
    /**
     * Appends and returns a new empty "dateFormat" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewDateFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(DATEFORMAT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "dateFormat" element
     */
    public void unsetDateFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEFORMAT$0, 0);
        }
    }
    
    /**
     * Gets the "lid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang getLid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang)get_store().find_element_user(LID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lid" element
     */
    public boolean isSetLid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LID$2) != 0;
        }
    }
    
    /**
     * Sets the "lid" element
     */
    public void setLid(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang lid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang)get_store().find_element_user(LID$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang)get_store().add_element_user(LID$2);
            }
            target.set(lid);
        }
    }
    
    /**
     * Appends and returns a new empty "lid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang addNewLid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLang)get_store().add_element_user(LID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "lid" element
     */
    public void unsetLid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LID$2, 0);
        }
    }
    
    /**
     * Gets the "storeMappedDataAs" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDateMappingType getStoreMappedDataAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDateMappingType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDateMappingType)get_store().find_element_user(STOREMAPPEDDATAAS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "storeMappedDataAs" element
     */
    public boolean isSetStoreMappedDataAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STOREMAPPEDDATAAS$4) != 0;
        }
    }
    
    /**
     * Sets the "storeMappedDataAs" element
     */
    public void setStoreMappedDataAs(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDateMappingType storeMappedDataAs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDateMappingType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDateMappingType)get_store().find_element_user(STOREMAPPEDDATAAS$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDateMappingType)get_store().add_element_user(STOREMAPPEDDATAAS$4);
            }
            target.set(storeMappedDataAs);
        }
    }
    
    /**
     * Appends and returns a new empty "storeMappedDataAs" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDateMappingType addNewStoreMappedDataAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDateMappingType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDateMappingType)get_store().add_element_user(STOREMAPPEDDATAAS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "storeMappedDataAs" element
     */
    public void unsetStoreMappedDataAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STOREMAPPEDDATAAS$4, 0);
        }
    }
    
    /**
     * Gets the "calendar" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCalendarType getCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCalendarType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCalendarType)get_store().find_element_user(CALENDAR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "calendar" element
     */
    public boolean isSetCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALENDAR$6) != 0;
        }
    }
    
    /**
     * Sets the "calendar" element
     */
    public void setCalendar(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCalendarType calendar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCalendarType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCalendarType)get_store().find_element_user(CALENDAR$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCalendarType)get_store().add_element_user(CALENDAR$6);
            }
            target.set(calendar);
        }
    }
    
    /**
     * Appends and returns a new empty "calendar" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCalendarType addNewCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCalendarType target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCalendarType)get_store().add_element_user(CALENDAR$6);
            return target;
        }
    }
    
    /**
     * Unsets the "calendar" element
     */
    public void unsetCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALENDAR$6, 0);
        }
    }
    
    /**
     * Gets the "fullDate" attribute
     */
    public java.util.Calendar getFullDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLDATE$8);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "fullDate" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime xgetFullDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime)get_store().find_attribute_user(FULLDATE$8);
            return target;
        }
    }
    
    /**
     * True if has "fullDate" attribute
     */
    public boolean isSetFullDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FULLDATE$8) != null;
        }
    }
    
    /**
     * Sets the "fullDate" attribute
     */
    public void setFullDate(java.util.Calendar fullDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLDATE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FULLDATE$8);
            }
            target.setCalendarValue(fullDate);
        }
    }
    
    /**
     * Sets (as xml) the "fullDate" attribute
     */
    public void xsetFullDate(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime fullDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime)get_store().find_attribute_user(FULLDATE$8);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime)get_store().add_attribute_user(FULLDATE$8);
            }
            target.set(fullDate);
        }
    }
    
    /**
     * Unsets the "fullDate" attribute
     */
    public void unsetFullDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FULLDATE$8);
        }
    }
}
