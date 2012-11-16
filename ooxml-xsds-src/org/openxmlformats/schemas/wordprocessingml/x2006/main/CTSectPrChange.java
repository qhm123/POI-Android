/*
 * XML Type:  CT_SectPrChange
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrChange
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_SectPrChange(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTSectPrChange extends org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTSectPrChange.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctsectprchangee2d3type");
    
    /**
     * Gets the "sectPr" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrBase getSectPr();
    
    /**
     * True if has "sectPr" element
     */
    boolean isSetSectPr();
    
    /**
     * Sets the "sectPr" element
     */
    void setSectPr(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrBase sectPr);
    
    /**
     * Appends and returns a new empty "sectPr" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrBase addNewSectPr();
    
    /**
     * Unsets the "sectPr" element
     */
    void unsetSectPr();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
