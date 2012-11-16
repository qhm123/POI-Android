/*
 * XML Type:  CT_Property
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/custom-properties
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.customProperties.impl;
/**
 * An XML CT_Property(@http://schemas.openxmlformats.org/officeDocument/2006/custom-properties).
 *
 * This is a complex type.
 */
public class CTPropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty
{
    
    public CTPropertyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VECTOR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "vector");
    private static final javax.xml.namespace.QName ARRAY$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "array");
    private static final javax.xml.namespace.QName BLOB$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "blob");
    private static final javax.xml.namespace.QName OBLOB$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "oblob");
    private static final javax.xml.namespace.QName EMPTY$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "empty");
    private static final javax.xml.namespace.QName NULL$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "null");
    private static final javax.xml.namespace.QName I1$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i1");
    private static final javax.xml.namespace.QName I2$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i2");
    private static final javax.xml.namespace.QName I4$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i4");
    private static final javax.xml.namespace.QName I8$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i8");
    private static final javax.xml.namespace.QName INT$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "int");
    private static final javax.xml.namespace.QName UI1$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui1");
    private static final javax.xml.namespace.QName UI2$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui2");
    private static final javax.xml.namespace.QName UI4$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui4");
    private static final javax.xml.namespace.QName UI8$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui8");
    private static final javax.xml.namespace.QName UINT$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "uint");
    private static final javax.xml.namespace.QName R4$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "r4");
    private static final javax.xml.namespace.QName R8$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "r8");
    private static final javax.xml.namespace.QName DECIMAL$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "decimal");
    private static final javax.xml.namespace.QName LPSTR$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "lpstr");
    private static final javax.xml.namespace.QName LPWSTR$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "lpwstr");
    private static final javax.xml.namespace.QName BSTR$42 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "bstr");
    private static final javax.xml.namespace.QName DATE$44 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "date");
    private static final javax.xml.namespace.QName FILETIME$46 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "filetime");
    private static final javax.xml.namespace.QName BOOL$48 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "bool");
    private static final javax.xml.namespace.QName CY$50 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "cy");
    private static final javax.xml.namespace.QName ERROR$52 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "error");
    private static final javax.xml.namespace.QName STREAM$54 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "stream");
    private static final javax.xml.namespace.QName OSTREAM$56 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ostream");
    private static final javax.xml.namespace.QName STORAGE$58 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "storage");
    private static final javax.xml.namespace.QName OSTORAGE$60 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ostorage");
    private static final javax.xml.namespace.QName VSTREAM$62 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "vstream");
    private static final javax.xml.namespace.QName CLSID$64 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "clsid");
    private static final javax.xml.namespace.QName CF$66 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "cf");
    private static final javax.xml.namespace.QName FMTID$68 = 
        new javax.xml.namespace.QName("", "fmtid");
    private static final javax.xml.namespace.QName PID$70 = 
        new javax.xml.namespace.QName("", "pid");
    private static final javax.xml.namespace.QName NAME$72 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName LINKTARGET$74 = 
        new javax.xml.namespace.QName("", "linkTarget");
    
    
    /**
     * Gets the "vector" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector getVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector)get_store().find_element_user(VECTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "vector" element
     */
    public boolean isSetVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VECTOR$0) != 0;
        }
    }
    
    /**
     * Sets the "vector" element
     */
    public void setVector(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector vector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector)get_store().find_element_user(VECTOR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector)get_store().add_element_user(VECTOR$0);
            }
            target.set(vector);
        }
    }
    
    /**
     * Appends and returns a new empty "vector" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector addNewVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector)get_store().add_element_user(VECTOR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "vector" element
     */
    public void unsetVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VECTOR$0, 0);
        }
    }
    
    /**
     * Gets the "array" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray getArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray)get_store().find_element_user(ARRAY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "array" element
     */
    public boolean isSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAY$2) != 0;
        }
    }
    
    /**
     * Sets the "array" element
     */
    public void setArray(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray)get_store().find_element_user(ARRAY$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray)get_store().add_element_user(ARRAY$2);
            }
            target.set(array);
        }
    }
    
    /**
     * Appends and returns a new empty "array" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray addNewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray)get_store().add_element_user(ARRAY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "array" element
     */
    public void unsetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAY$2, 0);
        }
    }
    
    /**
     * Gets the "blob" element
     */
    public byte[] getBlob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOB$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "blob" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetBlob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(BLOB$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "blob" element
     */
    public boolean isSetBlob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLOB$4) != 0;
        }
    }
    
    /**
     * Sets the "blob" element
     */
    public void setBlob(byte[] blob)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOB$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLOB$4);
            }
            target.setByteArrayValue(blob);
        }
    }
    
    /**
     * Sets (as xml) the "blob" element
     */
    public void xsetBlob(org.apache.xmlbeans.XmlBase64Binary blob)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(BLOB$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(BLOB$4);
            }
            target.set(blob);
        }
    }
    
    /**
     * Unsets the "blob" element
     */
    public void unsetBlob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLOB$4, 0);
        }
    }
    
    /**
     * Gets the "oblob" element
     */
    public byte[] getOblob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBLOB$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "oblob" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetOblob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(OBLOB$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "oblob" element
     */
    public boolean isSetOblob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBLOB$6) != 0;
        }
    }
    
    /**
     * Sets the "oblob" element
     */
    public void setOblob(byte[] oblob)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBLOB$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBLOB$6);
            }
            target.setByteArrayValue(oblob);
        }
    }
    
    /**
     * Sets (as xml) the "oblob" element
     */
    public void xsetOblob(org.apache.xmlbeans.XmlBase64Binary oblob)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(OBLOB$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(OBLOB$6);
            }
            target.set(oblob);
        }
    }
    
    /**
     * Unsets the "oblob" element
     */
    public void unsetOblob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBLOB$6, 0);
        }
    }
    
    /**
     * Gets the "empty" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty getEmpty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty)get_store().find_element_user(EMPTY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "empty" element
     */
    public boolean isSetEmpty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMPTY$8) != 0;
        }
    }
    
    /**
     * Sets the "empty" element
     */
    public void setEmpty(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty empty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty)get_store().find_element_user(EMPTY$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty)get_store().add_element_user(EMPTY$8);
            }
            target.set(empty);
        }
    }
    
    /**
     * Appends and returns a new empty "empty" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty addNewEmpty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty)get_store().add_element_user(EMPTY$8);
            return target;
        }
    }
    
    /**
     * Unsets the "empty" element
     */
    public void unsetEmpty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMPTY$8, 0);
        }
    }
    
    /**
     * Gets the "null" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull getNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull)get_store().find_element_user(NULL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "null" element
     */
    public boolean isSetNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NULL$10) != 0;
        }
    }
    
    /**
     * Sets the "null" element
     */
    public void setNull(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull)get_store().find_element_user(NULL$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull)get_store().add_element_user(NULL$10);
            }
            target.set(xnull);
        }
    }
    
    /**
     * Appends and returns a new empty "null" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull addNewNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull)get_store().add_element_user(NULL$10);
            return target;
        }
    }
    
    /**
     * Unsets the "null" element
     */
    public void unsetNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NULL$10, 0);
        }
    }
    
    /**
     * Gets the "i1" element
     */
    public byte getI1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(I1$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getByteValue();
        }
    }
    
    /**
     * Gets (as xml) the "i1" element
     */
    public org.apache.xmlbeans.XmlByte xgetI1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(I1$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "i1" element
     */
    public boolean isSetI1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(I1$12) != 0;
        }
    }
    
    /**
     * Sets the "i1" element
     */
    public void setI1(byte i1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(I1$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(I1$12);
            }
            target.setByteValue(i1);
        }
    }
    
    /**
     * Sets (as xml) the "i1" element
     */
    public void xsetI1(org.apache.xmlbeans.XmlByte i1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(I1$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlByte)get_store().add_element_user(I1$12);
            }
            target.set(i1);
        }
    }
    
    /**
     * Unsets the "i1" element
     */
    public void unsetI1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(I1$12, 0);
        }
    }
    
    /**
     * Gets the "i2" element
     */
    public short getI2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(I2$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "i2" element
     */
    public org.apache.xmlbeans.XmlShort xgetI2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(I2$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "i2" element
     */
    public boolean isSetI2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(I2$14) != 0;
        }
    }
    
    /**
     * Sets the "i2" element
     */
    public void setI2(short i2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(I2$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(I2$14);
            }
            target.setShortValue(i2);
        }
    }
    
    /**
     * Sets (as xml) the "i2" element
     */
    public void xsetI2(org.apache.xmlbeans.XmlShort i2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(I2$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(I2$14);
            }
            target.set(i2);
        }
    }
    
    /**
     * Unsets the "i2" element
     */
    public void unsetI2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(I2$14, 0);
        }
    }
    
    /**
     * Gets the "i4" element
     */
    public int getI4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(I4$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "i4" element
     */
    public org.apache.xmlbeans.XmlInt xgetI4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(I4$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "i4" element
     */
    public boolean isSetI4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(I4$16) != 0;
        }
    }
    
    /**
     * Sets the "i4" element
     */
    public void setI4(int i4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(I4$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(I4$16);
            }
            target.setIntValue(i4);
        }
    }
    
    /**
     * Sets (as xml) the "i4" element
     */
    public void xsetI4(org.apache.xmlbeans.XmlInt i4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(I4$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(I4$16);
            }
            target.set(i4);
        }
    }
    
    /**
     * Unsets the "i4" element
     */
    public void unsetI4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(I4$16, 0);
        }
    }
    
    /**
     * Gets the "i8" element
     */
    public long getI8()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(I8$18, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "i8" element
     */
    public org.apache.xmlbeans.XmlLong xgetI8()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(I8$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "i8" element
     */
    public boolean isSetI8()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(I8$18) != 0;
        }
    }
    
    /**
     * Sets the "i8" element
     */
    public void setI8(long i8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(I8$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(I8$18);
            }
            target.setLongValue(i8);
        }
    }
    
    /**
     * Sets (as xml) the "i8" element
     */
    public void xsetI8(org.apache.xmlbeans.XmlLong i8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(I8$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(I8$18);
            }
            target.set(i8);
        }
    }
    
    /**
     * Unsets the "i8" element
     */
    public void unsetI8()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(I8$18, 0);
        }
    }
    
    /**
     * Gets the "int" element
     */
    public int getInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INT$20, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "int" element
     */
    public org.apache.xmlbeans.XmlInt xgetInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INT$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "int" element
     */
    public boolean isSetInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INT$20) != 0;
        }
    }
    
    /**
     * Sets the "int" element
     */
    public void setInt(int xint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INT$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INT$20);
            }
            target.setIntValue(xint);
        }
    }
    
    /**
     * Sets (as xml) the "int" element
     */
    public void xsetInt(org.apache.xmlbeans.XmlInt xint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INT$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INT$20);
            }
            target.set(xint);
        }
    }
    
    /**
     * Unsets the "int" element
     */
    public void unsetInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INT$20, 0);
        }
    }
    
    /**
     * Gets the "ui1" element
     */
    public short getUi1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UI1$22, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "ui1" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetUi1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(UI1$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "ui1" element
     */
    public boolean isSetUi1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UI1$22) != 0;
        }
    }
    
    /**
     * Sets the "ui1" element
     */
    public void setUi1(short ui1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UI1$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UI1$22);
            }
            target.setShortValue(ui1);
        }
    }
    
    /**
     * Sets (as xml) the "ui1" element
     */
    public void xsetUi1(org.apache.xmlbeans.XmlUnsignedByte ui1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(UI1$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(UI1$22);
            }
            target.set(ui1);
        }
    }
    
    /**
     * Unsets the "ui1" element
     */
    public void unsetUi1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UI1$22, 0);
        }
    }
    
    /**
     * Gets the "ui2" element
     */
    public int getUi2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UI2$24, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ui2" element
     */
    public org.apache.xmlbeans.XmlUnsignedShort xgetUi2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(UI2$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "ui2" element
     */
    public boolean isSetUi2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UI2$24) != 0;
        }
    }
    
    /**
     * Sets the "ui2" element
     */
    public void setUi2(int ui2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UI2$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UI2$24);
            }
            target.setIntValue(ui2);
        }
    }
    
    /**
     * Sets (as xml) the "ui2" element
     */
    public void xsetUi2(org.apache.xmlbeans.XmlUnsignedShort ui2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(UI2$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_element_user(UI2$24);
            }
            target.set(ui2);
        }
    }
    
    /**
     * Unsets the "ui2" element
     */
    public void unsetUi2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UI2$24, 0);
        }
    }
    
    /**
     * Gets the "ui4" element
     */
    public long getUi4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UI4$26, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "ui4" element
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetUi4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(UI4$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "ui4" element
     */
    public boolean isSetUi4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UI4$26) != 0;
        }
    }
    
    /**
     * Sets the "ui4" element
     */
    public void setUi4(long ui4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UI4$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UI4$26);
            }
            target.setLongValue(ui4);
        }
    }
    
    /**
     * Sets (as xml) the "ui4" element
     */
    public void xsetUi4(org.apache.xmlbeans.XmlUnsignedInt ui4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(UI4$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(UI4$26);
            }
            target.set(ui4);
        }
    }
    
    /**
     * Unsets the "ui4" element
     */
    public void unsetUi4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UI4$26, 0);
        }
    }
    
    /**
     * Gets the "ui8" element
     */
    public java.math.BigInteger getUi8()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UI8$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "ui8" element
     */
    public org.apache.xmlbeans.XmlUnsignedLong xgetUi8()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_element_user(UI8$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "ui8" element
     */
    public boolean isSetUi8()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UI8$28) != 0;
        }
    }
    
    /**
     * Sets the "ui8" element
     */
    public void setUi8(java.math.BigInteger ui8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UI8$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UI8$28);
            }
            target.setBigIntegerValue(ui8);
        }
    }
    
    /**
     * Sets (as xml) the "ui8" element
     */
    public void xsetUi8(org.apache.xmlbeans.XmlUnsignedLong ui8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_element_user(UI8$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().add_element_user(UI8$28);
            }
            target.set(ui8);
        }
    }
    
    /**
     * Unsets the "ui8" element
     */
    public void unsetUi8()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UI8$28, 0);
        }
    }
    
    /**
     * Gets the "uint" element
     */
    public long getUint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UINT$30, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "uint" element
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetUint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(UINT$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "uint" element
     */
    public boolean isSetUint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UINT$30) != 0;
        }
    }
    
    /**
     * Sets the "uint" element
     */
    public void setUint(long uint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UINT$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UINT$30);
            }
            target.setLongValue(uint);
        }
    }
    
    /**
     * Sets (as xml) the "uint" element
     */
    public void xsetUint(org.apache.xmlbeans.XmlUnsignedInt uint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(UINT$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(UINT$30);
            }
            target.set(uint);
        }
    }
    
    /**
     * Unsets the "uint" element
     */
    public void unsetUint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UINT$30, 0);
        }
    }
    
    /**
     * Gets the "r4" element
     */
    public float getR4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(R4$32, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "r4" element
     */
    public org.apache.xmlbeans.XmlFloat xgetR4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(R4$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "r4" element
     */
    public boolean isSetR4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(R4$32) != 0;
        }
    }
    
    /**
     * Sets the "r4" element
     */
    public void setR4(float r4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(R4$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(R4$32);
            }
            target.setFloatValue(r4);
        }
    }
    
    /**
     * Sets (as xml) the "r4" element
     */
    public void xsetR4(org.apache.xmlbeans.XmlFloat r4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(R4$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(R4$32);
            }
            target.set(r4);
        }
    }
    
    /**
     * Unsets the "r4" element
     */
    public void unsetR4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(R4$32, 0);
        }
    }
    
    /**
     * Gets the "r8" element
     */
    public double getR8()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(R8$34, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "r8" element
     */
    public org.apache.xmlbeans.XmlDouble xgetR8()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(R8$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "r8" element
     */
    public boolean isSetR8()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(R8$34) != 0;
        }
    }
    
    /**
     * Sets the "r8" element
     */
    public void setR8(double r8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(R8$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(R8$34);
            }
            target.setDoubleValue(r8);
        }
    }
    
    /**
     * Sets (as xml) the "r8" element
     */
    public void xsetR8(org.apache.xmlbeans.XmlDouble r8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(R8$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(R8$34);
            }
            target.set(r8);
        }
    }
    
    /**
     * Unsets the "r8" element
     */
    public void unsetR8()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(R8$34, 0);
        }
    }
    
    /**
     * Gets the "decimal" element
     */
    public java.math.BigDecimal getDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMAL$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "decimal" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(DECIMAL$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "decimal" element
     */
    public boolean isSetDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECIMAL$36) != 0;
        }
    }
    
    /**
     * Sets the "decimal" element
     */
    public void setDecimal(java.math.BigDecimal decimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMAL$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECIMAL$36);
            }
            target.setBigDecimalValue(decimal);
        }
    }
    
    /**
     * Sets (as xml) the "decimal" element
     */
    public void xsetDecimal(org.apache.xmlbeans.XmlDecimal decimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(DECIMAL$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(DECIMAL$36);
            }
            target.set(decimal);
        }
    }
    
    /**
     * Unsets the "decimal" element
     */
    public void unsetDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECIMAL$36, 0);
        }
    }
    
    /**
     * Gets the "lpstr" element
     */
    public java.lang.String getLpstr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LPSTR$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lpstr" element
     */
    public org.apache.xmlbeans.XmlString xgetLpstr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LPSTR$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "lpstr" element
     */
    public boolean isSetLpstr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LPSTR$38) != 0;
        }
    }
    
    /**
     * Sets the "lpstr" element
     */
    public void setLpstr(java.lang.String lpstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LPSTR$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LPSTR$38);
            }
            target.setStringValue(lpstr);
        }
    }
    
    /**
     * Sets (as xml) the "lpstr" element
     */
    public void xsetLpstr(org.apache.xmlbeans.XmlString lpstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LPSTR$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LPSTR$38);
            }
            target.set(lpstr);
        }
    }
    
    /**
     * Unsets the "lpstr" element
     */
    public void unsetLpstr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LPSTR$38, 0);
        }
    }
    
    /**
     * Gets the "lpwstr" element
     */
    public java.lang.String getLpwstr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LPWSTR$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lpwstr" element
     */
    public org.apache.xmlbeans.XmlString xgetLpwstr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LPWSTR$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "lpwstr" element
     */
    public boolean isSetLpwstr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LPWSTR$40) != 0;
        }
    }
    
    /**
     * Sets the "lpwstr" element
     */
    public void setLpwstr(java.lang.String lpwstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LPWSTR$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LPWSTR$40);
            }
            target.setStringValue(lpwstr);
        }
    }
    
    /**
     * Sets (as xml) the "lpwstr" element
     */
    public void xsetLpwstr(org.apache.xmlbeans.XmlString lpwstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LPWSTR$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LPWSTR$40);
            }
            target.set(lpwstr);
        }
    }
    
    /**
     * Unsets the "lpwstr" element
     */
    public void unsetLpwstr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LPWSTR$40, 0);
        }
    }
    
    /**
     * Gets the "bstr" element
     */
    public java.lang.String getBstr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BSTR$42, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bstr" element
     */
    public org.apache.xmlbeans.XmlString xgetBstr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BSTR$42, 0);
            return target;
        }
    }
    
    /**
     * True if has "bstr" element
     */
    public boolean isSetBstr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BSTR$42) != 0;
        }
    }
    
    /**
     * Sets the "bstr" element
     */
    public void setBstr(java.lang.String bstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BSTR$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BSTR$42);
            }
            target.setStringValue(bstr);
        }
    }
    
    /**
     * Sets (as xml) the "bstr" element
     */
    public void xsetBstr(org.apache.xmlbeans.XmlString bstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BSTR$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BSTR$42);
            }
            target.set(bstr);
        }
    }
    
    /**
     * Unsets the "bstr" element
     */
    public void unsetBstr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BSTR$42, 0);
        }
    }
    
    /**
     * Gets the "date" element
     */
    public java.util.Calendar getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$44, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "date" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATE$44, 0);
            return target;
        }
    }
    
    /**
     * True if has "date" element
     */
    public boolean isSetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATE$44) != 0;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(java.util.Calendar date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$44);
            }
            target.setCalendarValue(date);
        }
    }
    
    /**
     * Sets (as xml) the "date" element
     */
    public void xsetDate(org.apache.xmlbeans.XmlDateTime date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATE$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATE$44);
            }
            target.set(date);
        }
    }
    
    /**
     * Unsets the "date" element
     */
    public void unsetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATE$44, 0);
        }
    }
    
    /**
     * Gets the "filetime" element
     */
    public java.util.Calendar getFiletime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILETIME$46, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "filetime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetFiletime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FILETIME$46, 0);
            return target;
        }
    }
    
    /**
     * True if has "filetime" element
     */
    public boolean isSetFiletime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILETIME$46) != 0;
        }
    }
    
    /**
     * Sets the "filetime" element
     */
    public void setFiletime(java.util.Calendar filetime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILETIME$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILETIME$46);
            }
            target.setCalendarValue(filetime);
        }
    }
    
    /**
     * Sets (as xml) the "filetime" element
     */
    public void xsetFiletime(org.apache.xmlbeans.XmlDateTime filetime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FILETIME$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FILETIME$46);
            }
            target.set(filetime);
        }
    }
    
    /**
     * Unsets the "filetime" element
     */
    public void unsetFiletime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILETIME$46, 0);
        }
    }
    
    /**
     * Gets the "bool" element
     */
    public boolean getBool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOL$48, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "bool" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOL$48, 0);
            return target;
        }
    }
    
    /**
     * True if has "bool" element
     */
    public boolean isSetBool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOL$48) != 0;
        }
    }
    
    /**
     * Sets the "bool" element
     */
    public void setBool(boolean bool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOL$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOL$48);
            }
            target.setBooleanValue(bool);
        }
    }
    
    /**
     * Sets (as xml) the "bool" element
     */
    public void xsetBool(org.apache.xmlbeans.XmlBoolean bool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOL$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BOOL$48);
            }
            target.set(bool);
        }
    }
    
    /**
     * Unsets the "bool" element
     */
    public void unsetBool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOL$48, 0);
        }
    }
    
    /**
     * Gets the "cy" element
     */
    public java.lang.String getCy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CY$50, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cy" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy xgetCy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)get_store().find_element_user(CY$50, 0);
            return target;
        }
    }
    
    /**
     * True if has "cy" element
     */
    public boolean isSetCy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CY$50) != 0;
        }
    }
    
    /**
     * Sets the "cy" element
     */
    public void setCy(java.lang.String cy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CY$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CY$50);
            }
            target.setStringValue(cy);
        }
    }
    
    /**
     * Sets (as xml) the "cy" element
     */
    public void xsetCy(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy cy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)get_store().find_element_user(CY$50, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)get_store().add_element_user(CY$50);
            }
            target.set(cy);
        }
    }
    
    /**
     * Unsets the "cy" element
     */
    public void unsetCy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CY$50, 0);
        }
    }
    
    /**
     * Gets the "error" element
     */
    public java.lang.String getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$52, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "error" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError xgetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)get_store().find_element_user(ERROR$52, 0);
            return target;
        }
    }
    
    /**
     * True if has "error" element
     */
    public boolean isSetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERROR$52) != 0;
        }
    }
    
    /**
     * Sets the "error" element
     */
    public void setError(java.lang.String error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERROR$52);
            }
            target.setStringValue(error);
        }
    }
    
    /**
     * Sets (as xml) the "error" element
     */
    public void xsetError(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)get_store().find_element_user(ERROR$52, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)get_store().add_element_user(ERROR$52);
            }
            target.set(error);
        }
    }
    
    /**
     * Unsets the "error" element
     */
    public void unsetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERROR$52, 0);
        }
    }
    
    /**
     * Gets the "stream" element
     */
    public byte[] getStream()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREAM$54, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "stream" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetStream()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(STREAM$54, 0);
            return target;
        }
    }
    
    /**
     * True if has "stream" element
     */
    public boolean isSetStream()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREAM$54) != 0;
        }
    }
    
    /**
     * Sets the "stream" element
     */
    public void setStream(byte[] stream)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREAM$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREAM$54);
            }
            target.setByteArrayValue(stream);
        }
    }
    
    /**
     * Sets (as xml) the "stream" element
     */
    public void xsetStream(org.apache.xmlbeans.XmlBase64Binary stream)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(STREAM$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(STREAM$54);
            }
            target.set(stream);
        }
    }
    
    /**
     * Unsets the "stream" element
     */
    public void unsetStream()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREAM$54, 0);
        }
    }
    
    /**
     * Gets the "ostream" element
     */
    public byte[] getOstream()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OSTREAM$56, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "ostream" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetOstream()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(OSTREAM$56, 0);
            return target;
        }
    }
    
    /**
     * True if has "ostream" element
     */
    public boolean isSetOstream()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OSTREAM$56) != 0;
        }
    }
    
    /**
     * Sets the "ostream" element
     */
    public void setOstream(byte[] ostream)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OSTREAM$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OSTREAM$56);
            }
            target.setByteArrayValue(ostream);
        }
    }
    
    /**
     * Sets (as xml) the "ostream" element
     */
    public void xsetOstream(org.apache.xmlbeans.XmlBase64Binary ostream)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(OSTREAM$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(OSTREAM$56);
            }
            target.set(ostream);
        }
    }
    
    /**
     * Unsets the "ostream" element
     */
    public void unsetOstream()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OSTREAM$56, 0);
        }
    }
    
    /**
     * Gets the "storage" element
     */
    public byte[] getStorage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STORAGE$58, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "storage" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetStorage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(STORAGE$58, 0);
            return target;
        }
    }
    
    /**
     * True if has "storage" element
     */
    public boolean isSetStorage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STORAGE$58) != 0;
        }
    }
    
    /**
     * Sets the "storage" element
     */
    public void setStorage(byte[] storage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STORAGE$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STORAGE$58);
            }
            target.setByteArrayValue(storage);
        }
    }
    
    /**
     * Sets (as xml) the "storage" element
     */
    public void xsetStorage(org.apache.xmlbeans.XmlBase64Binary storage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(STORAGE$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(STORAGE$58);
            }
            target.set(storage);
        }
    }
    
    /**
     * Unsets the "storage" element
     */
    public void unsetStorage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STORAGE$58, 0);
        }
    }
    
    /**
     * Gets the "ostorage" element
     */
    public byte[] getOstorage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OSTORAGE$60, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "ostorage" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetOstorage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(OSTORAGE$60, 0);
            return target;
        }
    }
    
    /**
     * True if has "ostorage" element
     */
    public boolean isSetOstorage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OSTORAGE$60) != 0;
        }
    }
    
    /**
     * Sets the "ostorage" element
     */
    public void setOstorage(byte[] ostorage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OSTORAGE$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OSTORAGE$60);
            }
            target.setByteArrayValue(ostorage);
        }
    }
    
    /**
     * Sets (as xml) the "ostorage" element
     */
    public void xsetOstorage(org.apache.xmlbeans.XmlBase64Binary ostorage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(OSTORAGE$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(OSTORAGE$60);
            }
            target.set(ostorage);
        }
    }
    
    /**
     * Unsets the "ostorage" element
     */
    public void unsetOstorage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OSTORAGE$60, 0);
        }
    }
    
    /**
     * Gets the "vstream" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream getVstream()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream)get_store().find_element_user(VSTREAM$62, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "vstream" element
     */
    public boolean isSetVstream()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VSTREAM$62) != 0;
        }
    }
    
    /**
     * Sets the "vstream" element
     */
    public void setVstream(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream vstream)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream)get_store().find_element_user(VSTREAM$62, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream)get_store().add_element_user(VSTREAM$62);
            }
            target.set(vstream);
        }
    }
    
    /**
     * Appends and returns a new empty "vstream" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream addNewVstream()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream)get_store().add_element_user(VSTREAM$62);
            return target;
        }
    }
    
    /**
     * Unsets the "vstream" element
     */
    public void unsetVstream()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VSTREAM$62, 0);
        }
    }
    
    /**
     * Gets the "clsid" element
     */
    public java.lang.String getClsid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSID$64, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "clsid" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid xgetClsid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid)get_store().find_element_user(CLSID$64, 0);
            return target;
        }
    }
    
    /**
     * True if has "clsid" element
     */
    public boolean isSetClsid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLSID$64) != 0;
        }
    }
    
    /**
     * Sets the "clsid" element
     */
    public void setClsid(java.lang.String clsid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSID$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLSID$64);
            }
            target.setStringValue(clsid);
        }
    }
    
    /**
     * Sets (as xml) the "clsid" element
     */
    public void xsetClsid(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid clsid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid)get_store().find_element_user(CLSID$64, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid)get_store().add_element_user(CLSID$64);
            }
            target.set(clsid);
        }
    }
    
    /**
     * Unsets the "clsid" element
     */
    public void unsetClsid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLSID$64, 0);
        }
    }
    
    /**
     * Gets the "cf" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf getCf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf)get_store().find_element_user(CF$66, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cf" element
     */
    public boolean isSetCf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CF$66) != 0;
        }
    }
    
    /**
     * Sets the "cf" element
     */
    public void setCf(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf cf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf)get_store().find_element_user(CF$66, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf)get_store().add_element_user(CF$66);
            }
            target.set(cf);
        }
    }
    
    /**
     * Appends and returns a new empty "cf" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf addNewCf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf)get_store().add_element_user(CF$66);
            return target;
        }
    }
    
    /**
     * Unsets the "cf" element
     */
    public void unsetCf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CF$66, 0);
        }
    }
    
    /**
     * Gets the "fmtid" attribute
     */
    public java.lang.String getFmtid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FMTID$68);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmtid" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid xgetFmtid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid)get_store().find_attribute_user(FMTID$68);
            return target;
        }
    }
    
    /**
     * Sets the "fmtid" attribute
     */
    public void setFmtid(java.lang.String fmtid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FMTID$68);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FMTID$68);
            }
            target.setStringValue(fmtid);
        }
    }
    
    /**
     * Sets (as xml) the "fmtid" attribute
     */
    public void xsetFmtid(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid fmtid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid)get_store().find_attribute_user(FMTID$68);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid)get_store().add_attribute_user(FMTID$68);
            }
            target.set(fmtid);
        }
    }
    
    /**
     * Gets the "pid" attribute
     */
    public int getPid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PID$70);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "pid" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetPid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PID$70);
            return target;
        }
    }
    
    /**
     * Sets the "pid" attribute
     */
    public void setPid(int pid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PID$70);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PID$70);
            }
            target.setIntValue(pid);
        }
    }
    
    /**
     * Sets (as xml) the "pid" attribute
     */
    public void xsetPid(org.apache.xmlbeans.XmlInt pid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PID$70);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PID$70);
            }
            target.set(pid);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$72);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$72);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$72) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$72);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$72);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$72);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$72);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$72);
        }
    }
    
    /**
     * Gets the "linkTarget" attribute
     */
    public java.lang.String getLinkTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINKTARGET$74);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "linkTarget" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLinkTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LINKTARGET$74);
            return target;
        }
    }
    
    /**
     * True if has "linkTarget" attribute
     */
    public boolean isSetLinkTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LINKTARGET$74) != null;
        }
    }
    
    /**
     * Sets the "linkTarget" attribute
     */
    public void setLinkTarget(java.lang.String linkTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINKTARGET$74);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINKTARGET$74);
            }
            target.setStringValue(linkTarget);
        }
    }
    
    /**
     * Sets (as xml) the "linkTarget" attribute
     */
    public void xsetLinkTarget(org.apache.xmlbeans.XmlString linkTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LINKTARGET$74);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LINKTARGET$74);
            }
            target.set(linkTarget);
        }
    }
    
    /**
     * Unsets the "linkTarget" attribute
     */
    public void unsetLinkTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LINKTARGET$74);
        }
    }
}
