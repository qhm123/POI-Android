/*
 * An XML document type.
 * Localname: styleSheet
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.StyleSheetDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one styleSheet(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class StyleSheetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.StyleSheetDocument
{
    
    public StyleSheetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYLESHEET$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "styleSheet");
    
    
    /**
     * Gets the "styleSheet" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet getStyleSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet)get_store().find_element_user(STYLESHEET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "styleSheet" element
     */
    public void setStyleSheet(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet styleSheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet)get_store().find_element_user(STYLESHEET$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet)get_store().add_element_user(STYLESHEET$0);
            }
            target.set(styleSheet);
        }
    }
    
    /**
     * Appends and returns a new empty "styleSheet" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet addNewStyleSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet)get_store().add_element_user(STYLESHEET$0);
            return target;
        }
    }
}
