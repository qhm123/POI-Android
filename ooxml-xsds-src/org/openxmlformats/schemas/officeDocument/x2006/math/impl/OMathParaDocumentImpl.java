/*
 * An XML document type.
 * Localname: oMathPara
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.OMathParaDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math.impl;
/**
 * A document containing one oMathPara(@http://schemas.openxmlformats.org/officeDocument/2006/math) element.
 *
 * This is a complex type.
 */
public class OMathParaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.math.OMathParaDocument
{
    
    public OMathParaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OMATHPARA$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "oMathPara");
    
    
    /**
     * Gets the "oMathPara" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara getOMathPara()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara)get_store().find_element_user(OMATHPARA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "oMathPara" element
     */
    public void setOMathPara(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara oMathPara)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara)get_store().find_element_user(OMATHPARA$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara)get_store().add_element_user(OMATHPARA$0);
            }
            target.set(oMathPara);
        }
    }
    
    /**
     * Appends and returns a new empty "oMathPara" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara addNewOMathPara()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara)get_store().add_element_user(OMATHPARA$0);
            return target;
        }
    }
}
