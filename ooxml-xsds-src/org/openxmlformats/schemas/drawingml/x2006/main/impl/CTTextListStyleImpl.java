/*
 * XML Type:  CT_TextListStyle
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TextListStyle(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTextListStyleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle
{
    
    public CTTextListStyleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFPPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "defPPr");
    private static final javax.xml.namespace.QName LVL1PPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl1pPr");
    private static final javax.xml.namespace.QName LVL2PPR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl2pPr");
    private static final javax.xml.namespace.QName LVL3PPR$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl3pPr");
    private static final javax.xml.namespace.QName LVL4PPR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl4pPr");
    private static final javax.xml.namespace.QName LVL5PPR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl5pPr");
    private static final javax.xml.namespace.QName LVL6PPR$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl6pPr");
    private static final javax.xml.namespace.QName LVL7PPR$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl7pPr");
    private static final javax.xml.namespace.QName LVL8PPR$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl8pPr");
    private static final javax.xml.namespace.QName LVL9PPR$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl9pPr");
    private static final javax.xml.namespace.QName EXTLST$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    
    
    /**
     * Gets the "defPPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties getDefPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(DEFPPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "defPPr" element
     */
    public boolean isSetDefPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFPPR$0) != 0;
        }
    }
    
    /**
     * Sets the "defPPr" element
     */
    public void setDefPPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties defPPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(DEFPPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(DEFPPR$0);
            }
            target.set(defPPr);
        }
    }
    
    /**
     * Appends and returns a new empty "defPPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties addNewDefPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(DEFPPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "defPPr" element
     */
    public void unsetDefPPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFPPR$0, 0);
        }
    }
    
    /**
     * Gets the "lvl1pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties getLvl1PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(LVL1PPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lvl1pPr" element
     */
    public boolean isSetLvl1PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LVL1PPR$2) != 0;
        }
    }
    
    /**
     * Sets the "lvl1pPr" element
     */
    public void setLvl1PPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties lvl1PPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(LVL1PPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(LVL1PPR$2);
            }
            target.set(lvl1PPr);
        }
    }
    
    /**
     * Appends and returns a new empty "lvl1pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties addNewLvl1PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(LVL1PPR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "lvl1pPr" element
     */
    public void unsetLvl1PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LVL1PPR$2, 0);
        }
    }
    
    /**
     * Gets the "lvl2pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties getLvl2PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(LVL2PPR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lvl2pPr" element
     */
    public boolean isSetLvl2PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LVL2PPR$4) != 0;
        }
    }
    
    /**
     * Sets the "lvl2pPr" element
     */
    public void setLvl2PPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties lvl2PPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(LVL2PPR$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(LVL2PPR$4);
            }
            target.set(lvl2PPr);
        }
    }
    
    /**
     * Appends and returns a new empty "lvl2pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties addNewLvl2PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(LVL2PPR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "lvl2pPr" element
     */
    public void unsetLvl2PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LVL2PPR$4, 0);
        }
    }
    
    /**
     * Gets the "lvl3pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties getLvl3PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(LVL3PPR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lvl3pPr" element
     */
    public boolean isSetLvl3PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LVL3PPR$6) != 0;
        }
    }
    
    /**
     * Sets the "lvl3pPr" element
     */
    public void setLvl3PPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties lvl3PPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(LVL3PPR$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(LVL3PPR$6);
            }
            target.set(lvl3PPr);
        }
    }
    
    /**
     * Appends and returns a new empty "lvl3pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties addNewLvl3PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(LVL3PPR$6);
            return target;
        }
    }
    
    /**
     * Unsets the "lvl3pPr" element
     */
    public void unsetLvl3PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LVL3PPR$6, 0);
        }
    }
    
    /**
     * Gets the "lvl4pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties getLvl4PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(LVL4PPR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lvl4pPr" element
     */
    public boolean isSetLvl4PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LVL4PPR$8) != 0;
        }
    }
    
    /**
     * Sets the "lvl4pPr" element
     */
    public void setLvl4PPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties lvl4PPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(LVL4PPR$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(LVL4PPR$8);
            }
            target.set(lvl4PPr);
        }
    }
    
    /**
     * Appends and returns a new empty "lvl4pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties addNewLvl4PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(LVL4PPR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "lvl4pPr" element
     */
    public void unsetLvl4PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LVL4PPR$8, 0);
        }
    }
    
    /**
     * Gets the "lvl5pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties getLvl5PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(LVL5PPR$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lvl5pPr" element
     */
    public boolean isSetLvl5PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LVL5PPR$10) != 0;
        }
    }
    
    /**
     * Sets the "lvl5pPr" element
     */
    public void setLvl5PPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties lvl5PPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(LVL5PPR$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(LVL5PPR$10);
            }
            target.set(lvl5PPr);
        }
    }
    
    /**
     * Appends and returns a new empty "lvl5pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties addNewLvl5PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(LVL5PPR$10);
            return target;
        }
    }
    
    /**
     * Unsets the "lvl5pPr" element
     */
    public void unsetLvl5PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LVL5PPR$10, 0);
        }
    }
    
    /**
     * Gets the "lvl6pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties getLvl6PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(LVL6PPR$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lvl6pPr" element
     */
    public boolean isSetLvl6PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LVL6PPR$12) != 0;
        }
    }
    
    /**
     * Sets the "lvl6pPr" element
     */
    public void setLvl6PPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties lvl6PPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(LVL6PPR$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(LVL6PPR$12);
            }
            target.set(lvl6PPr);
        }
    }
    
    /**
     * Appends and returns a new empty "lvl6pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties addNewLvl6PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(LVL6PPR$12);
            return target;
        }
    }
    
    /**
     * Unsets the "lvl6pPr" element
     */
    public void unsetLvl6PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LVL6PPR$12, 0);
        }
    }
    
    /**
     * Gets the "lvl7pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties getLvl7PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(LVL7PPR$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lvl7pPr" element
     */
    public boolean isSetLvl7PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LVL7PPR$14) != 0;
        }
    }
    
    /**
     * Sets the "lvl7pPr" element
     */
    public void setLvl7PPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties lvl7PPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(LVL7PPR$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(LVL7PPR$14);
            }
            target.set(lvl7PPr);
        }
    }
    
    /**
     * Appends and returns a new empty "lvl7pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties addNewLvl7PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(LVL7PPR$14);
            return target;
        }
    }
    
    /**
     * Unsets the "lvl7pPr" element
     */
    public void unsetLvl7PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LVL7PPR$14, 0);
        }
    }
    
    /**
     * Gets the "lvl8pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties getLvl8PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(LVL8PPR$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lvl8pPr" element
     */
    public boolean isSetLvl8PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LVL8PPR$16) != 0;
        }
    }
    
    /**
     * Sets the "lvl8pPr" element
     */
    public void setLvl8PPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties lvl8PPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(LVL8PPR$16, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(LVL8PPR$16);
            }
            target.set(lvl8PPr);
        }
    }
    
    /**
     * Appends and returns a new empty "lvl8pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties addNewLvl8PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(LVL8PPR$16);
            return target;
        }
    }
    
    /**
     * Unsets the "lvl8pPr" element
     */
    public void unsetLvl8PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LVL8PPR$16, 0);
        }
    }
    
    /**
     * Gets the "lvl9pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties getLvl9PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(LVL9PPR$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lvl9pPr" element
     */
    public boolean isSetLvl9PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LVL9PPR$18) != 0;
        }
    }
    
    /**
     * Sets the "lvl9pPr" element
     */
    public void setLvl9PPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties lvl9PPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().find_element_user(LVL9PPR$18, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(LVL9PPR$18);
            }
            target.set(lvl9PPr);
        }
    }
    
    /**
     * Appends and returns a new empty "lvl9pPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties addNewLvl9PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties)get_store().add_element_user(LVL9PPR$18);
            return target;
        }
    }
    
    /**
     * Unsets the "lvl9pPr" element
     */
    public void unsetLvl9PPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LVL9PPR$18, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$20, 0);
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
            return get_store().count_elements(EXTLST$20) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$20, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$20);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$20);
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
            get_store().remove_element(EXTLST$20, 0);
        }
    }
}
