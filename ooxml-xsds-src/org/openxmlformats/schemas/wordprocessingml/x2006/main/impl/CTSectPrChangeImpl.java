/*
 * XML Type:  CT_SectPrChange
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrChange
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_SectPrChange(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTSectPrChangeImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrackChangeImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrChange
{
    
    public CTSectPrChangeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECTPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sectPr");
    
    
    /**
     * Gets the "sectPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrBase getSectPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrBase)get_store().find_element_user(SECTPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sectPr" element
     */
    public boolean isSetSectPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECTPR$0) != 0;
        }
    }
    
    /**
     * Sets the "sectPr" element
     */
    public void setSectPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrBase sectPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrBase)get_store().find_element_user(SECTPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrBase)get_store().add_element_user(SECTPR$0);
            }
            target.set(sectPr);
        }
    }
    
    /**
     * Appends and returns a new empty "sectPr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrBase addNewSectPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrBase target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrBase)get_store().add_element_user(SECTPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "sectPr" element
     */
    public void unsetSectPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECTPR$0, 0);
        }
    }
}
