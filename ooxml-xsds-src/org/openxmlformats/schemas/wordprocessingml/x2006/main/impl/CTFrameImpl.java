/*
 * XML Type:  CT_Frame
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_Frame(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFrameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrame
{
    
    public CTFrameImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SZ$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sz");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "name");
    private static final javax.xml.namespace.QName SOURCEFILENAME$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sourceFileName");
    private static final javax.xml.namespace.QName MARW$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "marW");
    private static final javax.xml.namespace.QName MARH$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "marH");
    private static final javax.xml.namespace.QName SCROLLBAR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "scrollbar");
    private static final javax.xml.namespace.QName NORESIZEALLOWED$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "noResizeAllowed");
    private static final javax.xml.namespace.QName LINKEDTOFILE$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "linkedToFile");
    
    
    /**
     * Gets the "sz" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(SZ$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sz" element
     */
    public boolean isSetSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SZ$0) != 0;
        }
    }
    
    /**
     * Sets the "sz" element
     */
    public void setSz(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString sz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(SZ$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(SZ$0);
            }
            target.set(sz);
        }
    }
    
    /**
     * Appends and returns a new empty "sz" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(SZ$0);
            return target;
        }
    }
    
    /**
     * Unsets the "sz" element
     */
    public void unsetSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SZ$0, 0);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(NAME$2, 0);
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
            return get_store().count_elements(NAME$2) != 0;
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(NAME$2);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(NAME$2);
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
            get_store().remove_element(NAME$2, 0);
        }
    }
    
    /**
     * Gets the "sourceFileName" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel getSourceFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(SOURCEFILENAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sourceFileName" element
     */
    public boolean isSetSourceFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEFILENAME$4) != 0;
        }
    }
    
    /**
     * Sets the "sourceFileName" element
     */
    public void setSourceFileName(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel sourceFileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().find_element_user(SOURCEFILENAME$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().add_element_user(SOURCEFILENAME$4);
            }
            target.set(sourceFileName);
        }
    }
    
    /**
     * Appends and returns a new empty "sourceFileName" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel addNewSourceFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel)get_store().add_element_user(SOURCEFILENAME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "sourceFileName" element
     */
    public void unsetSourceFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEFILENAME$4, 0);
        }
    }
    
    /**
     * Gets the "marW" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure getMarW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure)get_store().find_element_user(MARW$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "marW" element
     */
    public boolean isSetMarW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MARW$6) != 0;
        }
    }
    
    /**
     * Sets the "marW" element
     */
    public void setMarW(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure marW)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure)get_store().find_element_user(MARW$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure)get_store().add_element_user(MARW$6);
            }
            target.set(marW);
        }
    }
    
    /**
     * Appends and returns a new empty "marW" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure addNewMarW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure)get_store().add_element_user(MARW$6);
            return target;
        }
    }
    
    /**
     * Unsets the "marW" element
     */
    public void unsetMarW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MARW$6, 0);
        }
    }
    
    /**
     * Gets the "marH" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure getMarH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure)get_store().find_element_user(MARH$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "marH" element
     */
    public boolean isSetMarH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MARH$8) != 0;
        }
    }
    
    /**
     * Sets the "marH" element
     */
    public void setMarH(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure marH)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure)get_store().find_element_user(MARH$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure)get_store().add_element_user(MARH$8);
            }
            target.set(marH);
        }
    }
    
    /**
     * Appends and returns a new empty "marH" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure addNewMarH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPixelsMeasure)get_store().add_element_user(MARH$8);
            return target;
        }
    }
    
    /**
     * Unsets the "marH" element
     */
    public void unsetMarH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MARH$8, 0);
        }
    }
    
    /**
     * Gets the "scrollbar" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameScrollbar getScrollbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameScrollbar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameScrollbar)get_store().find_element_user(SCROLLBAR$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "scrollbar" element
     */
    public boolean isSetScrollbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCROLLBAR$10) != 0;
        }
    }
    
    /**
     * Sets the "scrollbar" element
     */
    public void setScrollbar(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameScrollbar scrollbar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameScrollbar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameScrollbar)get_store().find_element_user(SCROLLBAR$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameScrollbar)get_store().add_element_user(SCROLLBAR$10);
            }
            target.set(scrollbar);
        }
    }
    
    /**
     * Appends and returns a new empty "scrollbar" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameScrollbar addNewScrollbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameScrollbar target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFrameScrollbar)get_store().add_element_user(SCROLLBAR$10);
            return target;
        }
    }
    
    /**
     * Unsets the "scrollbar" element
     */
    public void unsetScrollbar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCROLLBAR$10, 0);
        }
    }
    
    /**
     * Gets the "noResizeAllowed" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getNoResizeAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(NORESIZEALLOWED$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "noResizeAllowed" element
     */
    public boolean isSetNoResizeAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NORESIZEALLOWED$12) != 0;
        }
    }
    
    /**
     * Sets the "noResizeAllowed" element
     */
    public void setNoResizeAllowed(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff noResizeAllowed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(NORESIZEALLOWED$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(NORESIZEALLOWED$12);
            }
            target.set(noResizeAllowed);
        }
    }
    
    /**
     * Appends and returns a new empty "noResizeAllowed" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewNoResizeAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(NORESIZEALLOWED$12);
            return target;
        }
    }
    
    /**
     * Unsets the "noResizeAllowed" element
     */
    public void unsetNoResizeAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NORESIZEALLOWED$12, 0);
        }
    }
    
    /**
     * Gets the "linkedToFile" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getLinkedToFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(LINKEDTOFILE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "linkedToFile" element
     */
    public boolean isSetLinkedToFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKEDTOFILE$14) != 0;
        }
    }
    
    /**
     * Sets the "linkedToFile" element
     */
    public void setLinkedToFile(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff linkedToFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(LINKEDTOFILE$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(LINKEDTOFILE$14);
            }
            target.set(linkedToFile);
        }
    }
    
    /**
     * Appends and returns a new empty "linkedToFile" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewLinkedToFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(LINKEDTOFILE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "linkedToFile" element
     */
    public void unsetLinkedToFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKEDTOFILE$14, 0);
        }
    }
}
