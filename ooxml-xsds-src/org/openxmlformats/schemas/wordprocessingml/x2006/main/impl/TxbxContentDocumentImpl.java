/*
 * An XML document type.
 * Localname: txbxContent
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.TxbxContentDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * A document containing one txbxContent(@http://schemas.openxmlformats.org/wordprocessingml/2006/main) element.
 *
 * This is a complex type.
 */
public class TxbxContentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.TxbxContentDocument
{
    
    public TxbxContentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TXBXCONTENT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "txbxContent");
    
    
    /**
     * Gets the "txbxContent" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent getTxbxContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent)get_store().find_element_user(TXBXCONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "txbxContent" element
     */
    public void setTxbxContent(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent txbxContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent)get_store().find_element_user(TXBXCONTENT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent)get_store().add_element_user(TXBXCONTENT$0);
            }
            target.set(txbxContent);
        }
    }
    
    /**
     * Appends and returns a new empty "txbxContent" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent addNewTxbxContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent)get_store().add_element_user(TXBXCONTENT$0);
            return target;
        }
    }
}
