/*
 * An XML document type.
 * Localname: calcChain
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CalcChainDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one calcChain(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class CalcChainDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CalcChainDocument
{
    
    public CalcChainDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALCCHAIN$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "calcChain");
    
    
    /**
     * Gets the "calcChain" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcChain getCalcChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcChain target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcChain)get_store().find_element_user(CALCCHAIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "calcChain" element
     */
    public void setCalcChain(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcChain calcChain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcChain target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcChain)get_store().find_element_user(CALCCHAIN$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcChain)get_store().add_element_user(CALCCHAIN$0);
            }
            target.set(calcChain);
        }
    }
    
    /**
     * Appends and returns a new empty "calcChain" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcChain addNewCalcChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcChain target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcChain)get_store().add_element_user(CALCCHAIN$0);
            return target;
        }
    }
}
