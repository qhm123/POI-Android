/*
 * An XML document type.
 * Localname: mathPr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.MathPrDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * A document containing one mathPr(@http://schemas.openxmlformats.org/officeDocument/2006/math) element.
 *
 * This is a complex type.
 */
public class MathPrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.MathPrDocument
{
    
    public MathPrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATHPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "mathPr");
    
    
    /**
     * Gets the "mathPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr getMathPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr)get_store().find_element_user(MATHPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mathPr" element
     */
    public void setMathPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr mathPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr)get_store().find_element_user(MATHPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr)get_store().add_element_user(MATHPR$0);
            }
            target.set(mathPr);
        }
    }
    
    /**
     * Appends and returns a new empty "mathPr" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr addNewMathPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr)get_store().add_element_user(MATHPR$0);
            return target;
        }
    }
}
