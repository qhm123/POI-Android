/*
 * XML Type:  CT_Vector
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl;
/**
 * An XML CT_Vector(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes).
 *
 * This is a complex type.
 */
public class CTVectorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector
{
    
    public CTVectorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VARIANT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "variant");
    private static final javax.xml.namespace.QName I1$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i1");
    private static final javax.xml.namespace.QName I2$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i2");
    private static final javax.xml.namespace.QName I4$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i4");
    private static final javax.xml.namespace.QName I8$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i8");
    private static final javax.xml.namespace.QName UI1$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui1");
    private static final javax.xml.namespace.QName UI2$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui2");
    private static final javax.xml.namespace.QName UI4$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui4");
    private static final javax.xml.namespace.QName UI8$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui8");
    private static final javax.xml.namespace.QName R4$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "r4");
    private static final javax.xml.namespace.QName R8$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "r8");
    private static final javax.xml.namespace.QName LPSTR$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "lpstr");
    private static final javax.xml.namespace.QName LPWSTR$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "lpwstr");
    private static final javax.xml.namespace.QName BSTR$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "bstr");
    private static final javax.xml.namespace.QName DATE$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "date");
    private static final javax.xml.namespace.QName FILETIME$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "filetime");
    private static final javax.xml.namespace.QName BOOL$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "bool");
    private static final javax.xml.namespace.QName CY$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "cy");
    private static final javax.xml.namespace.QName ERROR$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "error");
    private static final javax.xml.namespace.QName CLSID$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "clsid");
    private static final javax.xml.namespace.QName CF$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "cf");
    private static final javax.xml.namespace.QName BASETYPE$42 = 
        new javax.xml.namespace.QName("", "baseType");
    private static final javax.xml.namespace.QName SIZE$44 = 
        new javax.xml.namespace.QName("", "size");
    
    
    /**
     * Gets a List of "variant" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant> getVariantList()
    {
        final class VariantList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant get(int i)
                { return CTVectorImpl.this.getVariantArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant set(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant old = CTVectorImpl.this.getVariantArray(i);
                CTVectorImpl.this.setVariantArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant o)
                { CTVectorImpl.this.insertNewVariant(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant old = CTVectorImpl.this.getVariantArray(i);
                CTVectorImpl.this.removeVariant(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfVariantArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new VariantList();
        }
    }
    
    /**
     * Gets array of all "variant" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant[] getVariantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VARIANT$0, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant[] result = new org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "variant" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant getVariantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant)get_store().find_element_user(VARIANT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "variant" element
     */
    public int sizeOfVariantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARIANT$0);
        }
    }
    
    /**
     * Sets array of all "variant" element
     */
    public void setVariantArray(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant[] variantArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(variantArray, VARIANT$0);
        }
    }
    
    /**
     * Sets ith "variant" element
     */
    public void setVariantArray(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant variant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant)get_store().find_element_user(VARIANT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(variant);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "variant" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant insertNewVariant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant)get_store().insert_element_user(VARIANT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "variant" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant addNewVariant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant)get_store().add_element_user(VARIANT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "variant" element
     */
    public void removeVariant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARIANT$0, i);
        }
    }
    
    /**
     * Gets a List of "i1" elements
     */
    public java.util.List<java.lang.Byte> getI1List()
    {
        final class I1List extends java.util.AbstractList<java.lang.Byte>
        {
            public java.lang.Byte get(int i)
                { return CTVectorImpl.this.getI1Array(i); }
            
            public java.lang.Byte set(int i, java.lang.Byte o)
            {
                java.lang.Byte old = CTVectorImpl.this.getI1Array(i);
                CTVectorImpl.this.setI1Array(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Byte o)
                { CTVectorImpl.this.insertI1(i, o); }
            
            public java.lang.Byte remove(int i)
            {
                java.lang.Byte old = CTVectorImpl.this.getI1Array(i);
                CTVectorImpl.this.removeI1(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfI1Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new I1List();
        }
    }
    
    /**
     * Gets array of all "i1" elements
     */
    public byte[] getI1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(I1$2, targetList);
            byte[] result = new byte[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getByteValue();
            return result;
        }
    }
    
    /**
     * Gets ith "i1" element
     */
    public byte getI1Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(I1$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getByteValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "i1" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlByte> xgetI1List()
    {
        final class I1List extends java.util.AbstractList<org.apache.xmlbeans.XmlByte>
        {
            public org.apache.xmlbeans.XmlByte get(int i)
                { return CTVectorImpl.this.xgetI1Array(i); }
            
            public org.apache.xmlbeans.XmlByte set(int i, org.apache.xmlbeans.XmlByte o)
            {
                org.apache.xmlbeans.XmlByte old = CTVectorImpl.this.xgetI1Array(i);
                CTVectorImpl.this.xsetI1Array(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlByte o)
                { CTVectorImpl.this.insertNewI1(i).set(o); }
            
            public org.apache.xmlbeans.XmlByte remove(int i)
            {
                org.apache.xmlbeans.XmlByte old = CTVectorImpl.this.xgetI1Array(i);
                CTVectorImpl.this.removeI1(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfI1Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new I1List();
        }
    }
    
    /**
     * Gets (as xml) array of all "i1" elements
     */
    public org.apache.xmlbeans.XmlByte[] xgetI1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(I1$2, targetList);
            org.apache.xmlbeans.XmlByte[] result = new org.apache.xmlbeans.XmlByte[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "i1" element
     */
    public org.apache.xmlbeans.XmlByte xgetI1Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(I1$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlByte)target;
        }
    }
    
    /**
     * Returns number of "i1" element
     */
    public int sizeOfI1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(I1$2);
        }
    }
    
    /**
     * Sets array of all "i1" element
     */
    public void setI1Array(byte[] i1Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(i1Array, I1$2);
        }
    }
    
    /**
     * Sets ith "i1" element
     */
    public void setI1Array(int i, byte i1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(I1$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setByteValue(i1);
        }
    }
    
    /**
     * Sets (as xml) array of all "i1" element
     */
    public void xsetI1Array(org.apache.xmlbeans.XmlByte[]i1Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(i1Array, I1$2);
        }
    }
    
    /**
     * Sets (as xml) ith "i1" element
     */
    public void xsetI1Array(int i, org.apache.xmlbeans.XmlByte i1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(I1$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(i1);
        }
    }
    
    /**
     * Inserts the value as the ith "i1" element
     */
    public void insertI1(int i, byte i1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(I1$2, i);
            target.setByteValue(i1);
        }
    }
    
    /**
     * Appends the value as the last "i1" element
     */
    public void addI1(byte i1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(I1$2);
            target.setByteValue(i1);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "i1" element
     */
    public org.apache.xmlbeans.XmlByte insertNewI1(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().insert_element_user(I1$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "i1" element
     */
    public org.apache.xmlbeans.XmlByte addNewI1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().add_element_user(I1$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "i1" element
     */
    public void removeI1(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(I1$2, i);
        }
    }
    
    /**
     * Gets a List of "i2" elements
     */
    public java.util.List<java.lang.Short> getI2List()
    {
        final class I2List extends java.util.AbstractList<java.lang.Short>
        {
            public java.lang.Short get(int i)
                { return CTVectorImpl.this.getI2Array(i); }
            
            public java.lang.Short set(int i, java.lang.Short o)
            {
                java.lang.Short old = CTVectorImpl.this.getI2Array(i);
                CTVectorImpl.this.setI2Array(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Short o)
                { CTVectorImpl.this.insertI2(i, o); }
            
            public java.lang.Short remove(int i)
            {
                java.lang.Short old = CTVectorImpl.this.getI2Array(i);
                CTVectorImpl.this.removeI2(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfI2Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new I2List();
        }
    }
    
    /**
     * Gets array of all "i2" elements
     */
    public short[] getI2Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(I2$4, targetList);
            short[] result = new short[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getShortValue();
            return result;
        }
    }
    
    /**
     * Gets ith "i2" element
     */
    public short getI2Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(I2$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "i2" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlShort> xgetI2List()
    {
        final class I2List extends java.util.AbstractList<org.apache.xmlbeans.XmlShort>
        {
            public org.apache.xmlbeans.XmlShort get(int i)
                { return CTVectorImpl.this.xgetI2Array(i); }
            
            public org.apache.xmlbeans.XmlShort set(int i, org.apache.xmlbeans.XmlShort o)
            {
                org.apache.xmlbeans.XmlShort old = CTVectorImpl.this.xgetI2Array(i);
                CTVectorImpl.this.xsetI2Array(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlShort o)
                { CTVectorImpl.this.insertNewI2(i).set(o); }
            
            public org.apache.xmlbeans.XmlShort remove(int i)
            {
                org.apache.xmlbeans.XmlShort old = CTVectorImpl.this.xgetI2Array(i);
                CTVectorImpl.this.removeI2(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfI2Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new I2List();
        }
    }
    
    /**
     * Gets (as xml) array of all "i2" elements
     */
    public org.apache.xmlbeans.XmlShort[] xgetI2Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(I2$4, targetList);
            org.apache.xmlbeans.XmlShort[] result = new org.apache.xmlbeans.XmlShort[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "i2" element
     */
    public org.apache.xmlbeans.XmlShort xgetI2Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(I2$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlShort)target;
        }
    }
    
    /**
     * Returns number of "i2" element
     */
    public int sizeOfI2Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(I2$4);
        }
    }
    
    /**
     * Sets array of all "i2" element
     */
    public void setI2Array(short[] i2Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(i2Array, I2$4);
        }
    }
    
    /**
     * Sets ith "i2" element
     */
    public void setI2Array(int i, short i2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(I2$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setShortValue(i2);
        }
    }
    
    /**
     * Sets (as xml) array of all "i2" element
     */
    public void xsetI2Array(org.apache.xmlbeans.XmlShort[]i2Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(i2Array, I2$4);
        }
    }
    
    /**
     * Sets (as xml) ith "i2" element
     */
    public void xsetI2Array(int i, org.apache.xmlbeans.XmlShort i2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(I2$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(i2);
        }
    }
    
    /**
     * Inserts the value as the ith "i2" element
     */
    public void insertI2(int i, short i2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(I2$4, i);
            target.setShortValue(i2);
        }
    }
    
    /**
     * Appends the value as the last "i2" element
     */
    public void addI2(short i2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(I2$4);
            target.setShortValue(i2);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "i2" element
     */
    public org.apache.xmlbeans.XmlShort insertNewI2(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().insert_element_user(I2$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "i2" element
     */
    public org.apache.xmlbeans.XmlShort addNewI2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(I2$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "i2" element
     */
    public void removeI2(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(I2$4, i);
        }
    }
    
    /**
     * Gets a List of "i4" elements
     */
    public java.util.List<java.lang.Integer> getI4List()
    {
        final class I4List extends java.util.AbstractList<java.lang.Integer>
        {
            public java.lang.Integer get(int i)
                { return CTVectorImpl.this.getI4Array(i); }
            
            public java.lang.Integer set(int i, java.lang.Integer o)
            {
                java.lang.Integer old = CTVectorImpl.this.getI4Array(i);
                CTVectorImpl.this.setI4Array(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Integer o)
                { CTVectorImpl.this.insertI4(i, o); }
            
            public java.lang.Integer remove(int i)
            {
                java.lang.Integer old = CTVectorImpl.this.getI4Array(i);
                CTVectorImpl.this.removeI4(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfI4Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new I4List();
        }
    }
    
    /**
     * Gets array of all "i4" elements
     */
    public int[] getI4Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(I4$6, targetList);
            int[] result = new int[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getIntValue();
            return result;
        }
    }
    
    /**
     * Gets ith "i4" element
     */
    public int getI4Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(I4$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "i4" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlInt> xgetI4List()
    {
        final class I4List extends java.util.AbstractList<org.apache.xmlbeans.XmlInt>
        {
            public org.apache.xmlbeans.XmlInt get(int i)
                { return CTVectorImpl.this.xgetI4Array(i); }
            
            public org.apache.xmlbeans.XmlInt set(int i, org.apache.xmlbeans.XmlInt o)
            {
                org.apache.xmlbeans.XmlInt old = CTVectorImpl.this.xgetI4Array(i);
                CTVectorImpl.this.xsetI4Array(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlInt o)
                { CTVectorImpl.this.insertNewI4(i).set(o); }
            
            public org.apache.xmlbeans.XmlInt remove(int i)
            {
                org.apache.xmlbeans.XmlInt old = CTVectorImpl.this.xgetI4Array(i);
                CTVectorImpl.this.removeI4(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfI4Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new I4List();
        }
    }
    
    /**
     * Gets (as xml) array of all "i4" elements
     */
    public org.apache.xmlbeans.XmlInt[] xgetI4Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(I4$6, targetList);
            org.apache.xmlbeans.XmlInt[] result = new org.apache.xmlbeans.XmlInt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "i4" element
     */
    public org.apache.xmlbeans.XmlInt xgetI4Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(I4$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlInt)target;
        }
    }
    
    /**
     * Returns number of "i4" element
     */
    public int sizeOfI4Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(I4$6);
        }
    }
    
    /**
     * Sets array of all "i4" element
     */
    public void setI4Array(int[] i4Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(i4Array, I4$6);
        }
    }
    
    /**
     * Sets ith "i4" element
     */
    public void setI4Array(int i, int i4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(I4$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setIntValue(i4);
        }
    }
    
    /**
     * Sets (as xml) array of all "i4" element
     */
    public void xsetI4Array(org.apache.xmlbeans.XmlInt[]i4Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(i4Array, I4$6);
        }
    }
    
    /**
     * Sets (as xml) ith "i4" element
     */
    public void xsetI4Array(int i, org.apache.xmlbeans.XmlInt i4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(I4$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(i4);
        }
    }
    
    /**
     * Inserts the value as the ith "i4" element
     */
    public void insertI4(int i, int i4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(I4$6, i);
            target.setIntValue(i4);
        }
    }
    
    /**
     * Appends the value as the last "i4" element
     */
    public void addI4(int i4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(I4$6);
            target.setIntValue(i4);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "i4" element
     */
    public org.apache.xmlbeans.XmlInt insertNewI4(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().insert_element_user(I4$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "i4" element
     */
    public org.apache.xmlbeans.XmlInt addNewI4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(I4$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "i4" element
     */
    public void removeI4(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(I4$6, i);
        }
    }
    
    /**
     * Gets a List of "i8" elements
     */
    public java.util.List<java.lang.Long> getI8List()
    {
        final class I8List extends java.util.AbstractList<java.lang.Long>
        {
            public java.lang.Long get(int i)
                { return CTVectorImpl.this.getI8Array(i); }
            
            public java.lang.Long set(int i, java.lang.Long o)
            {
                java.lang.Long old = CTVectorImpl.this.getI8Array(i);
                CTVectorImpl.this.setI8Array(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Long o)
                { CTVectorImpl.this.insertI8(i, o); }
            
            public java.lang.Long remove(int i)
            {
                java.lang.Long old = CTVectorImpl.this.getI8Array(i);
                CTVectorImpl.this.removeI8(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfI8Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new I8List();
        }
    }
    
    /**
     * Gets array of all "i8" elements
     */
    public long[] getI8Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(I8$8, targetList);
            long[] result = new long[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getLongValue();
            return result;
        }
    }
    
    /**
     * Gets ith "i8" element
     */
    public long getI8Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(I8$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "i8" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlLong> xgetI8List()
    {
        final class I8List extends java.util.AbstractList<org.apache.xmlbeans.XmlLong>
        {
            public org.apache.xmlbeans.XmlLong get(int i)
                { return CTVectorImpl.this.xgetI8Array(i); }
            
            public org.apache.xmlbeans.XmlLong set(int i, org.apache.xmlbeans.XmlLong o)
            {
                org.apache.xmlbeans.XmlLong old = CTVectorImpl.this.xgetI8Array(i);
                CTVectorImpl.this.xsetI8Array(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlLong o)
                { CTVectorImpl.this.insertNewI8(i).set(o); }
            
            public org.apache.xmlbeans.XmlLong remove(int i)
            {
                org.apache.xmlbeans.XmlLong old = CTVectorImpl.this.xgetI8Array(i);
                CTVectorImpl.this.removeI8(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfI8Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new I8List();
        }
    }
    
    /**
     * Gets (as xml) array of all "i8" elements
     */
    public org.apache.xmlbeans.XmlLong[] xgetI8Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(I8$8, targetList);
            org.apache.xmlbeans.XmlLong[] result = new org.apache.xmlbeans.XmlLong[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "i8" element
     */
    public org.apache.xmlbeans.XmlLong xgetI8Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(I8$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlLong)target;
        }
    }
    
    /**
     * Returns number of "i8" element
     */
    public int sizeOfI8Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(I8$8);
        }
    }
    
    /**
     * Sets array of all "i8" element
     */
    public void setI8Array(long[] i8Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(i8Array, I8$8);
        }
    }
    
    /**
     * Sets ith "i8" element
     */
    public void setI8Array(int i, long i8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(I8$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setLongValue(i8);
        }
    }
    
    /**
     * Sets (as xml) array of all "i8" element
     */
    public void xsetI8Array(org.apache.xmlbeans.XmlLong[]i8Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(i8Array, I8$8);
        }
    }
    
    /**
     * Sets (as xml) ith "i8" element
     */
    public void xsetI8Array(int i, org.apache.xmlbeans.XmlLong i8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(I8$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(i8);
        }
    }
    
    /**
     * Inserts the value as the ith "i8" element
     */
    public void insertI8(int i, long i8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(I8$8, i);
            target.setLongValue(i8);
        }
    }
    
    /**
     * Appends the value as the last "i8" element
     */
    public void addI8(long i8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(I8$8);
            target.setLongValue(i8);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "i8" element
     */
    public org.apache.xmlbeans.XmlLong insertNewI8(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().insert_element_user(I8$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "i8" element
     */
    public org.apache.xmlbeans.XmlLong addNewI8()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(I8$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "i8" element
     */
    public void removeI8(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(I8$8, i);
        }
    }
    
    /**
     * Gets a List of "ui1" elements
     */
    public java.util.List<java.lang.Short> getUi1List()
    {
        final class Ui1List extends java.util.AbstractList<java.lang.Short>
        {
            public java.lang.Short get(int i)
                { return CTVectorImpl.this.getUi1Array(i); }
            
            public java.lang.Short set(int i, java.lang.Short o)
            {
                java.lang.Short old = CTVectorImpl.this.getUi1Array(i);
                CTVectorImpl.this.setUi1Array(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Short o)
                { CTVectorImpl.this.insertUi1(i, o); }
            
            public java.lang.Short remove(int i)
            {
                java.lang.Short old = CTVectorImpl.this.getUi1Array(i);
                CTVectorImpl.this.removeUi1(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfUi1Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new Ui1List();
        }
    }
    
    /**
     * Gets array of all "ui1" elements
     */
    public short[] getUi1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UI1$10, targetList);
            short[] result = new short[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getShortValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ui1" element
     */
    public short getUi1Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UI1$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "ui1" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlUnsignedByte> xgetUi1List()
    {
        final class Ui1List extends java.util.AbstractList<org.apache.xmlbeans.XmlUnsignedByte>
        {
            public org.apache.xmlbeans.XmlUnsignedByte get(int i)
                { return CTVectorImpl.this.xgetUi1Array(i); }
            
            public org.apache.xmlbeans.XmlUnsignedByte set(int i, org.apache.xmlbeans.XmlUnsignedByte o)
            {
                org.apache.xmlbeans.XmlUnsignedByte old = CTVectorImpl.this.xgetUi1Array(i);
                CTVectorImpl.this.xsetUi1Array(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlUnsignedByte o)
                { CTVectorImpl.this.insertNewUi1(i).set(o); }
            
            public org.apache.xmlbeans.XmlUnsignedByte remove(int i)
            {
                org.apache.xmlbeans.XmlUnsignedByte old = CTVectorImpl.this.xgetUi1Array(i);
                CTVectorImpl.this.removeUi1(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfUi1Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new Ui1List();
        }
    }
    
    /**
     * Gets (as xml) array of all "ui1" elements
     */
    public org.apache.xmlbeans.XmlUnsignedByte[] xgetUi1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UI1$10, targetList);
            org.apache.xmlbeans.XmlUnsignedByte[] result = new org.apache.xmlbeans.XmlUnsignedByte[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ui1" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetUi1Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(UI1$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlUnsignedByte)target;
        }
    }
    
    /**
     * Returns number of "ui1" element
     */
    public int sizeOfUi1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UI1$10);
        }
    }
    
    /**
     * Sets array of all "ui1" element
     */
    public void setUi1Array(short[] ui1Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ui1Array, UI1$10);
        }
    }
    
    /**
     * Sets ith "ui1" element
     */
    public void setUi1Array(int i, short ui1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UI1$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setShortValue(ui1);
        }
    }
    
    /**
     * Sets (as xml) array of all "ui1" element
     */
    public void xsetUi1Array(org.apache.xmlbeans.XmlUnsignedByte[]ui1Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ui1Array, UI1$10);
        }
    }
    
    /**
     * Sets (as xml) ith "ui1" element
     */
    public void xsetUi1Array(int i, org.apache.xmlbeans.XmlUnsignedByte ui1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(UI1$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ui1);
        }
    }
    
    /**
     * Inserts the value as the ith "ui1" element
     */
    public void insertUi1(int i, short ui1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(UI1$10, i);
            target.setShortValue(ui1);
        }
    }
    
    /**
     * Appends the value as the last "ui1" element
     */
    public void addUi1(short ui1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UI1$10);
            target.setShortValue(ui1);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ui1" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte insertNewUi1(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().insert_element_user(UI1$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ui1" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte addNewUi1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(UI1$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "ui1" element
     */
    public void removeUi1(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UI1$10, i);
        }
    }
    
    /**
     * Gets a List of "ui2" elements
     */
    public java.util.List<java.lang.Integer> getUi2List()
    {
        final class Ui2List extends java.util.AbstractList<java.lang.Integer>
        {
            public java.lang.Integer get(int i)
                { return CTVectorImpl.this.getUi2Array(i); }
            
            public java.lang.Integer set(int i, java.lang.Integer o)
            {
                java.lang.Integer old = CTVectorImpl.this.getUi2Array(i);
                CTVectorImpl.this.setUi2Array(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Integer o)
                { CTVectorImpl.this.insertUi2(i, o); }
            
            public java.lang.Integer remove(int i)
            {
                java.lang.Integer old = CTVectorImpl.this.getUi2Array(i);
                CTVectorImpl.this.removeUi2(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfUi2Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new Ui2List();
        }
    }
    
    /**
     * Gets array of all "ui2" elements
     */
    public int[] getUi2Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UI2$12, targetList);
            int[] result = new int[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getIntValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ui2" element
     */
    public int getUi2Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UI2$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "ui2" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlUnsignedShort> xgetUi2List()
    {
        final class Ui2List extends java.util.AbstractList<org.apache.xmlbeans.XmlUnsignedShort>
        {
            public org.apache.xmlbeans.XmlUnsignedShort get(int i)
                { return CTVectorImpl.this.xgetUi2Array(i); }
            
            public org.apache.xmlbeans.XmlUnsignedShort set(int i, org.apache.xmlbeans.XmlUnsignedShort o)
            {
                org.apache.xmlbeans.XmlUnsignedShort old = CTVectorImpl.this.xgetUi2Array(i);
                CTVectorImpl.this.xsetUi2Array(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlUnsignedShort o)
                { CTVectorImpl.this.insertNewUi2(i).set(o); }
            
            public org.apache.xmlbeans.XmlUnsignedShort remove(int i)
            {
                org.apache.xmlbeans.XmlUnsignedShort old = CTVectorImpl.this.xgetUi2Array(i);
                CTVectorImpl.this.removeUi2(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfUi2Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new Ui2List();
        }
    }
    
    /**
     * Gets (as xml) array of all "ui2" elements
     */
    public org.apache.xmlbeans.XmlUnsignedShort[] xgetUi2Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UI2$12, targetList);
            org.apache.xmlbeans.XmlUnsignedShort[] result = new org.apache.xmlbeans.XmlUnsignedShort[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ui2" element
     */
    public org.apache.xmlbeans.XmlUnsignedShort xgetUi2Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(UI2$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlUnsignedShort)target;
        }
    }
    
    /**
     * Returns number of "ui2" element
     */
    public int sizeOfUi2Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UI2$12);
        }
    }
    
    /**
     * Sets array of all "ui2" element
     */
    public void setUi2Array(int[] ui2Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ui2Array, UI2$12);
        }
    }
    
    /**
     * Sets ith "ui2" element
     */
    public void setUi2Array(int i, int ui2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UI2$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setIntValue(ui2);
        }
    }
    
    /**
     * Sets (as xml) array of all "ui2" element
     */
    public void xsetUi2Array(org.apache.xmlbeans.XmlUnsignedShort[]ui2Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ui2Array, UI2$12);
        }
    }
    
    /**
     * Sets (as xml) ith "ui2" element
     */
    public void xsetUi2Array(int i, org.apache.xmlbeans.XmlUnsignedShort ui2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(UI2$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ui2);
        }
    }
    
    /**
     * Inserts the value as the ith "ui2" element
     */
    public void insertUi2(int i, int ui2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(UI2$12, i);
            target.setIntValue(ui2);
        }
    }
    
    /**
     * Appends the value as the last "ui2" element
     */
    public void addUi2(int ui2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UI2$12);
            target.setIntValue(ui2);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ui2" element
     */
    public org.apache.xmlbeans.XmlUnsignedShort insertNewUi2(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().insert_element_user(UI2$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ui2" element
     */
    public org.apache.xmlbeans.XmlUnsignedShort addNewUi2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_element_user(UI2$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "ui2" element
     */
    public void removeUi2(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UI2$12, i);
        }
    }
    
    /**
     * Gets a List of "ui4" elements
     */
    public java.util.List<java.lang.Long> getUi4List()
    {
        final class Ui4List extends java.util.AbstractList<java.lang.Long>
        {
            public java.lang.Long get(int i)
                { return CTVectorImpl.this.getUi4Array(i); }
            
            public java.lang.Long set(int i, java.lang.Long o)
            {
                java.lang.Long old = CTVectorImpl.this.getUi4Array(i);
                CTVectorImpl.this.setUi4Array(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Long o)
                { CTVectorImpl.this.insertUi4(i, o); }
            
            public java.lang.Long remove(int i)
            {
                java.lang.Long old = CTVectorImpl.this.getUi4Array(i);
                CTVectorImpl.this.removeUi4(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfUi4Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new Ui4List();
        }
    }
    
    /**
     * Gets array of all "ui4" elements
     */
    public long[] getUi4Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UI4$14, targetList);
            long[] result = new long[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getLongValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ui4" element
     */
    public long getUi4Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UI4$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "ui4" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlUnsignedInt> xgetUi4List()
    {
        final class Ui4List extends java.util.AbstractList<org.apache.xmlbeans.XmlUnsignedInt>
        {
            public org.apache.xmlbeans.XmlUnsignedInt get(int i)
                { return CTVectorImpl.this.xgetUi4Array(i); }
            
            public org.apache.xmlbeans.XmlUnsignedInt set(int i, org.apache.xmlbeans.XmlUnsignedInt o)
            {
                org.apache.xmlbeans.XmlUnsignedInt old = CTVectorImpl.this.xgetUi4Array(i);
                CTVectorImpl.this.xsetUi4Array(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlUnsignedInt o)
                { CTVectorImpl.this.insertNewUi4(i).set(o); }
            
            public org.apache.xmlbeans.XmlUnsignedInt remove(int i)
            {
                org.apache.xmlbeans.XmlUnsignedInt old = CTVectorImpl.this.xgetUi4Array(i);
                CTVectorImpl.this.removeUi4(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfUi4Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new Ui4List();
        }
    }
    
    /**
     * Gets (as xml) array of all "ui4" elements
     */
    public org.apache.xmlbeans.XmlUnsignedInt[] xgetUi4Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UI4$14, targetList);
            org.apache.xmlbeans.XmlUnsignedInt[] result = new org.apache.xmlbeans.XmlUnsignedInt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ui4" element
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetUi4Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(UI4$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlUnsignedInt)target;
        }
    }
    
    /**
     * Returns number of "ui4" element
     */
    public int sizeOfUi4Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UI4$14);
        }
    }
    
    /**
     * Sets array of all "ui4" element
     */
    public void setUi4Array(long[] ui4Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ui4Array, UI4$14);
        }
    }
    
    /**
     * Sets ith "ui4" element
     */
    public void setUi4Array(int i, long ui4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UI4$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setLongValue(ui4);
        }
    }
    
    /**
     * Sets (as xml) array of all "ui4" element
     */
    public void xsetUi4Array(org.apache.xmlbeans.XmlUnsignedInt[]ui4Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ui4Array, UI4$14);
        }
    }
    
    /**
     * Sets (as xml) ith "ui4" element
     */
    public void xsetUi4Array(int i, org.apache.xmlbeans.XmlUnsignedInt ui4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(UI4$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ui4);
        }
    }
    
    /**
     * Inserts the value as the ith "ui4" element
     */
    public void insertUi4(int i, long ui4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(UI4$14, i);
            target.setLongValue(ui4);
        }
    }
    
    /**
     * Appends the value as the last "ui4" element
     */
    public void addUi4(long ui4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UI4$14);
            target.setLongValue(ui4);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ui4" element
     */
    public org.apache.xmlbeans.XmlUnsignedInt insertNewUi4(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().insert_element_user(UI4$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ui4" element
     */
    public org.apache.xmlbeans.XmlUnsignedInt addNewUi4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(UI4$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "ui4" element
     */
    public void removeUi4(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UI4$14, i);
        }
    }
    
    /**
     * Gets a List of "ui8" elements
     */
    public java.util.List<java.math.BigInteger> getUi8List()
    {
        final class Ui8List extends java.util.AbstractList<java.math.BigInteger>
        {
            public java.math.BigInteger get(int i)
                { return CTVectorImpl.this.getUi8Array(i); }
            
            public java.math.BigInteger set(int i, java.math.BigInteger o)
            {
                java.math.BigInteger old = CTVectorImpl.this.getUi8Array(i);
                CTVectorImpl.this.setUi8Array(i, o);
                return old;
            }
            
            public void add(int i, java.math.BigInteger o)
                { CTVectorImpl.this.insertUi8(i, o); }
            
            public java.math.BigInteger remove(int i)
            {
                java.math.BigInteger old = CTVectorImpl.this.getUi8Array(i);
                CTVectorImpl.this.removeUi8(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfUi8Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new Ui8List();
        }
    }
    
    /**
     * Gets array of all "ui8" elements
     */
    public java.math.BigInteger[] getUi8Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UI8$16, targetList);
            java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ui8" element
     */
    public java.math.BigInteger getUi8Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UI8$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "ui8" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlUnsignedLong> xgetUi8List()
    {
        final class Ui8List extends java.util.AbstractList<org.apache.xmlbeans.XmlUnsignedLong>
        {
            public org.apache.xmlbeans.XmlUnsignedLong get(int i)
                { return CTVectorImpl.this.xgetUi8Array(i); }
            
            public org.apache.xmlbeans.XmlUnsignedLong set(int i, org.apache.xmlbeans.XmlUnsignedLong o)
            {
                org.apache.xmlbeans.XmlUnsignedLong old = CTVectorImpl.this.xgetUi8Array(i);
                CTVectorImpl.this.xsetUi8Array(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlUnsignedLong o)
                { CTVectorImpl.this.insertNewUi8(i).set(o); }
            
            public org.apache.xmlbeans.XmlUnsignedLong remove(int i)
            {
                org.apache.xmlbeans.XmlUnsignedLong old = CTVectorImpl.this.xgetUi8Array(i);
                CTVectorImpl.this.removeUi8(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfUi8Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new Ui8List();
        }
    }
    
    /**
     * Gets (as xml) array of all "ui8" elements
     */
    public org.apache.xmlbeans.XmlUnsignedLong[] xgetUi8Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UI8$16, targetList);
            org.apache.xmlbeans.XmlUnsignedLong[] result = new org.apache.xmlbeans.XmlUnsignedLong[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ui8" element
     */
    public org.apache.xmlbeans.XmlUnsignedLong xgetUi8Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_element_user(UI8$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlUnsignedLong)target;
        }
    }
    
    /**
     * Returns number of "ui8" element
     */
    public int sizeOfUi8Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UI8$16);
        }
    }
    
    /**
     * Sets array of all "ui8" element
     */
    public void setUi8Array(java.math.BigInteger[] ui8Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ui8Array, UI8$16);
        }
    }
    
    /**
     * Sets ith "ui8" element
     */
    public void setUi8Array(int i, java.math.BigInteger ui8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UI8$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(ui8);
        }
    }
    
    /**
     * Sets (as xml) array of all "ui8" element
     */
    public void xsetUi8Array(org.apache.xmlbeans.XmlUnsignedLong[]ui8Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ui8Array, UI8$16);
        }
    }
    
    /**
     * Sets (as xml) ith "ui8" element
     */
    public void xsetUi8Array(int i, org.apache.xmlbeans.XmlUnsignedLong ui8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_element_user(UI8$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ui8);
        }
    }
    
    /**
     * Inserts the value as the ith "ui8" element
     */
    public void insertUi8(int i, java.math.BigInteger ui8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(UI8$16, i);
            target.setBigIntegerValue(ui8);
        }
    }
    
    /**
     * Appends the value as the last "ui8" element
     */
    public void addUi8(java.math.BigInteger ui8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UI8$16);
            target.setBigIntegerValue(ui8);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ui8" element
     */
    public org.apache.xmlbeans.XmlUnsignedLong insertNewUi8(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().insert_element_user(UI8$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ui8" element
     */
    public org.apache.xmlbeans.XmlUnsignedLong addNewUi8()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().add_element_user(UI8$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "ui8" element
     */
    public void removeUi8(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UI8$16, i);
        }
    }
    
    /**
     * Gets a List of "r4" elements
     */
    public java.util.List<java.lang.Float> getR4List()
    {
        final class R4List extends java.util.AbstractList<java.lang.Float>
        {
            public java.lang.Float get(int i)
                { return CTVectorImpl.this.getR4Array(i); }
            
            public java.lang.Float set(int i, java.lang.Float o)
            {
                java.lang.Float old = CTVectorImpl.this.getR4Array(i);
                CTVectorImpl.this.setR4Array(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Float o)
                { CTVectorImpl.this.insertR4(i, o); }
            
            public java.lang.Float remove(int i)
            {
                java.lang.Float old = CTVectorImpl.this.getR4Array(i);
                CTVectorImpl.this.removeR4(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfR4Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new R4List();
        }
    }
    
    /**
     * Gets array of all "r4" elements
     */
    public float[] getR4Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(R4$18, targetList);
            float[] result = new float[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getFloatValue();
            return result;
        }
    }
    
    /**
     * Gets ith "r4" element
     */
    public float getR4Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(R4$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "r4" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlFloat> xgetR4List()
    {
        final class R4List extends java.util.AbstractList<org.apache.xmlbeans.XmlFloat>
        {
            public org.apache.xmlbeans.XmlFloat get(int i)
                { return CTVectorImpl.this.xgetR4Array(i); }
            
            public org.apache.xmlbeans.XmlFloat set(int i, org.apache.xmlbeans.XmlFloat o)
            {
                org.apache.xmlbeans.XmlFloat old = CTVectorImpl.this.xgetR4Array(i);
                CTVectorImpl.this.xsetR4Array(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlFloat o)
                { CTVectorImpl.this.insertNewR4(i).set(o); }
            
            public org.apache.xmlbeans.XmlFloat remove(int i)
            {
                org.apache.xmlbeans.XmlFloat old = CTVectorImpl.this.xgetR4Array(i);
                CTVectorImpl.this.removeR4(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfR4Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new R4List();
        }
    }
    
    /**
     * Gets (as xml) array of all "r4" elements
     */
    public org.apache.xmlbeans.XmlFloat[] xgetR4Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(R4$18, targetList);
            org.apache.xmlbeans.XmlFloat[] result = new org.apache.xmlbeans.XmlFloat[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "r4" element
     */
    public org.apache.xmlbeans.XmlFloat xgetR4Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(R4$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlFloat)target;
        }
    }
    
    /**
     * Returns number of "r4" element
     */
    public int sizeOfR4Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(R4$18);
        }
    }
    
    /**
     * Sets array of all "r4" element
     */
    public void setR4Array(float[] r4Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(r4Array, R4$18);
        }
    }
    
    /**
     * Sets ith "r4" element
     */
    public void setR4Array(int i, float r4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(R4$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setFloatValue(r4);
        }
    }
    
    /**
     * Sets (as xml) array of all "r4" element
     */
    public void xsetR4Array(org.apache.xmlbeans.XmlFloat[]r4Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(r4Array, R4$18);
        }
    }
    
    /**
     * Sets (as xml) ith "r4" element
     */
    public void xsetR4Array(int i, org.apache.xmlbeans.XmlFloat r4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(R4$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(r4);
        }
    }
    
    /**
     * Inserts the value as the ith "r4" element
     */
    public void insertR4(int i, float r4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(R4$18, i);
            target.setFloatValue(r4);
        }
    }
    
    /**
     * Appends the value as the last "r4" element
     */
    public void addR4(float r4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(R4$18);
            target.setFloatValue(r4);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "r4" element
     */
    public org.apache.xmlbeans.XmlFloat insertNewR4(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().insert_element_user(R4$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "r4" element
     */
    public org.apache.xmlbeans.XmlFloat addNewR4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(R4$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "r4" element
     */
    public void removeR4(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(R4$18, i);
        }
    }
    
    /**
     * Gets a List of "r8" elements
     */
    public java.util.List<java.lang.Double> getR8List()
    {
        final class R8List extends java.util.AbstractList<java.lang.Double>
        {
            public java.lang.Double get(int i)
                { return CTVectorImpl.this.getR8Array(i); }
            
            public java.lang.Double set(int i, java.lang.Double o)
            {
                java.lang.Double old = CTVectorImpl.this.getR8Array(i);
                CTVectorImpl.this.setR8Array(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Double o)
                { CTVectorImpl.this.insertR8(i, o); }
            
            public java.lang.Double remove(int i)
            {
                java.lang.Double old = CTVectorImpl.this.getR8Array(i);
                CTVectorImpl.this.removeR8(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfR8Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new R8List();
        }
    }
    
    /**
     * Gets array of all "r8" elements
     */
    public double[] getR8Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(R8$20, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "r8" element
     */
    public double getR8Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(R8$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "r8" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlDouble> xgetR8List()
    {
        final class R8List extends java.util.AbstractList<org.apache.xmlbeans.XmlDouble>
        {
            public org.apache.xmlbeans.XmlDouble get(int i)
                { return CTVectorImpl.this.xgetR8Array(i); }
            
            public org.apache.xmlbeans.XmlDouble set(int i, org.apache.xmlbeans.XmlDouble o)
            {
                org.apache.xmlbeans.XmlDouble old = CTVectorImpl.this.xgetR8Array(i);
                CTVectorImpl.this.xsetR8Array(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlDouble o)
                { CTVectorImpl.this.insertNewR8(i).set(o); }
            
            public org.apache.xmlbeans.XmlDouble remove(int i)
            {
                org.apache.xmlbeans.XmlDouble old = CTVectorImpl.this.xgetR8Array(i);
                CTVectorImpl.this.removeR8(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfR8Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new R8List();
        }
    }
    
    /**
     * Gets (as xml) array of all "r8" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetR8Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(R8$20, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "r8" element
     */
    public org.apache.xmlbeans.XmlDouble xgetR8Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(R8$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Returns number of "r8" element
     */
    public int sizeOfR8Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(R8$20);
        }
    }
    
    /**
     * Sets array of all "r8" element
     */
    public void setR8Array(double[] r8Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(r8Array, R8$20);
        }
    }
    
    /**
     * Sets ith "r8" element
     */
    public void setR8Array(int i, double r8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(R8$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(r8);
        }
    }
    
    /**
     * Sets (as xml) array of all "r8" element
     */
    public void xsetR8Array(org.apache.xmlbeans.XmlDouble[]r8Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(r8Array, R8$20);
        }
    }
    
    /**
     * Sets (as xml) ith "r8" element
     */
    public void xsetR8Array(int i, org.apache.xmlbeans.XmlDouble r8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(R8$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(r8);
        }
    }
    
    /**
     * Inserts the value as the ith "r8" element
     */
    public void insertR8(int i, double r8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(R8$20, i);
            target.setDoubleValue(r8);
        }
    }
    
    /**
     * Appends the value as the last "r8" element
     */
    public void addR8(double r8)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(R8$20);
            target.setDoubleValue(r8);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "r8" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewR8(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(R8$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "r8" element
     */
    public org.apache.xmlbeans.XmlDouble addNewR8()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(R8$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "r8" element
     */
    public void removeR8(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(R8$20, i);
        }
    }
    
    /**
     * Gets a List of "lpstr" elements
     */
    public java.util.List<java.lang.String> getLpstrList()
    {
        final class LpstrList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return CTVectorImpl.this.getLpstrArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CTVectorImpl.this.getLpstrArray(i);
                CTVectorImpl.this.setLpstrArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { CTVectorImpl.this.insertLpstr(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = CTVectorImpl.this.getLpstrArray(i);
                CTVectorImpl.this.removeLpstr(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfLpstrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LpstrList();
        }
    }
    
    /**
     * Gets array of all "lpstr" elements
     */
    public java.lang.String[] getLpstrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LPSTR$22, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "lpstr" element
     */
    public java.lang.String getLpstrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LPSTR$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "lpstr" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetLpstrList()
    {
        final class LpstrList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return CTVectorImpl.this.xgetLpstrArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = CTVectorImpl.this.xgetLpstrArray(i);
                CTVectorImpl.this.xsetLpstrArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { CTVectorImpl.this.insertNewLpstr(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = CTVectorImpl.this.xgetLpstrArray(i);
                CTVectorImpl.this.removeLpstr(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfLpstrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LpstrList();
        }
    }
    
    /**
     * Gets (as xml) array of all "lpstr" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetLpstrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LPSTR$22, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "lpstr" element
     */
    public org.apache.xmlbeans.XmlString xgetLpstrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LPSTR$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "lpstr" element
     */
    public int sizeOfLpstrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LPSTR$22);
        }
    }
    
    /**
     * Sets array of all "lpstr" element
     */
    public void setLpstrArray(java.lang.String[] lpstrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lpstrArray, LPSTR$22);
        }
    }
    
    /**
     * Sets ith "lpstr" element
     */
    public void setLpstrArray(int i, java.lang.String lpstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LPSTR$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(lpstr);
        }
    }
    
    /**
     * Sets (as xml) array of all "lpstr" element
     */
    public void xsetLpstrArray(org.apache.xmlbeans.XmlString[]lpstrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lpstrArray, LPSTR$22);
        }
    }
    
    /**
     * Sets (as xml) ith "lpstr" element
     */
    public void xsetLpstrArray(int i, org.apache.xmlbeans.XmlString lpstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LPSTR$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lpstr);
        }
    }
    
    /**
     * Inserts the value as the ith "lpstr" element
     */
    public void insertLpstr(int i, java.lang.String lpstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LPSTR$22, i);
            target.setStringValue(lpstr);
        }
    }
    
    /**
     * Appends the value as the last "lpstr" element
     */
    public void addLpstr(java.lang.String lpstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LPSTR$22);
            target.setStringValue(lpstr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lpstr" element
     */
    public org.apache.xmlbeans.XmlString insertNewLpstr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(LPSTR$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lpstr" element
     */
    public org.apache.xmlbeans.XmlString addNewLpstr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LPSTR$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "lpstr" element
     */
    public void removeLpstr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LPSTR$22, i);
        }
    }
    
    /**
     * Gets a List of "lpwstr" elements
     */
    public java.util.List<java.lang.String> getLpwstrList()
    {
        final class LpwstrList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return CTVectorImpl.this.getLpwstrArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CTVectorImpl.this.getLpwstrArray(i);
                CTVectorImpl.this.setLpwstrArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { CTVectorImpl.this.insertLpwstr(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = CTVectorImpl.this.getLpwstrArray(i);
                CTVectorImpl.this.removeLpwstr(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfLpwstrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LpwstrList();
        }
    }
    
    /**
     * Gets array of all "lpwstr" elements
     */
    public java.lang.String[] getLpwstrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LPWSTR$24, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "lpwstr" element
     */
    public java.lang.String getLpwstrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LPWSTR$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "lpwstr" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetLpwstrList()
    {
        final class LpwstrList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return CTVectorImpl.this.xgetLpwstrArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = CTVectorImpl.this.xgetLpwstrArray(i);
                CTVectorImpl.this.xsetLpwstrArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { CTVectorImpl.this.insertNewLpwstr(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = CTVectorImpl.this.xgetLpwstrArray(i);
                CTVectorImpl.this.removeLpwstr(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfLpwstrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LpwstrList();
        }
    }
    
    /**
     * Gets (as xml) array of all "lpwstr" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetLpwstrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LPWSTR$24, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "lpwstr" element
     */
    public org.apache.xmlbeans.XmlString xgetLpwstrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LPWSTR$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "lpwstr" element
     */
    public int sizeOfLpwstrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LPWSTR$24);
        }
    }
    
    /**
     * Sets array of all "lpwstr" element
     */
    public void setLpwstrArray(java.lang.String[] lpwstrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lpwstrArray, LPWSTR$24);
        }
    }
    
    /**
     * Sets ith "lpwstr" element
     */
    public void setLpwstrArray(int i, java.lang.String lpwstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LPWSTR$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(lpwstr);
        }
    }
    
    /**
     * Sets (as xml) array of all "lpwstr" element
     */
    public void xsetLpwstrArray(org.apache.xmlbeans.XmlString[]lpwstrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lpwstrArray, LPWSTR$24);
        }
    }
    
    /**
     * Sets (as xml) ith "lpwstr" element
     */
    public void xsetLpwstrArray(int i, org.apache.xmlbeans.XmlString lpwstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LPWSTR$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lpwstr);
        }
    }
    
    /**
     * Inserts the value as the ith "lpwstr" element
     */
    public void insertLpwstr(int i, java.lang.String lpwstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LPWSTR$24, i);
            target.setStringValue(lpwstr);
        }
    }
    
    /**
     * Appends the value as the last "lpwstr" element
     */
    public void addLpwstr(java.lang.String lpwstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LPWSTR$24);
            target.setStringValue(lpwstr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lpwstr" element
     */
    public org.apache.xmlbeans.XmlString insertNewLpwstr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(LPWSTR$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lpwstr" element
     */
    public org.apache.xmlbeans.XmlString addNewLpwstr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LPWSTR$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "lpwstr" element
     */
    public void removeLpwstr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LPWSTR$24, i);
        }
    }
    
    /**
     * Gets a List of "bstr" elements
     */
    public java.util.List<java.lang.String> getBstrList()
    {
        final class BstrList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return CTVectorImpl.this.getBstrArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CTVectorImpl.this.getBstrArray(i);
                CTVectorImpl.this.setBstrArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { CTVectorImpl.this.insertBstr(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = CTVectorImpl.this.getBstrArray(i);
                CTVectorImpl.this.removeBstr(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfBstrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BstrList();
        }
    }
    
    /**
     * Gets array of all "bstr" elements
     */
    public java.lang.String[] getBstrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BSTR$26, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "bstr" element
     */
    public java.lang.String getBstrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BSTR$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "bstr" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetBstrList()
    {
        final class BstrList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return CTVectorImpl.this.xgetBstrArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = CTVectorImpl.this.xgetBstrArray(i);
                CTVectorImpl.this.xsetBstrArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { CTVectorImpl.this.insertNewBstr(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = CTVectorImpl.this.xgetBstrArray(i);
                CTVectorImpl.this.removeBstr(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfBstrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BstrList();
        }
    }
    
    /**
     * Gets (as xml) array of all "bstr" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetBstrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BSTR$26, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "bstr" element
     */
    public org.apache.xmlbeans.XmlString xgetBstrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BSTR$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "bstr" element
     */
    public int sizeOfBstrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BSTR$26);
        }
    }
    
    /**
     * Sets array of all "bstr" element
     */
    public void setBstrArray(java.lang.String[] bstrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bstrArray, BSTR$26);
        }
    }
    
    /**
     * Sets ith "bstr" element
     */
    public void setBstrArray(int i, java.lang.String bstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BSTR$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(bstr);
        }
    }
    
    /**
     * Sets (as xml) array of all "bstr" element
     */
    public void xsetBstrArray(org.apache.xmlbeans.XmlString[]bstrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bstrArray, BSTR$26);
        }
    }
    
    /**
     * Sets (as xml) ith "bstr" element
     */
    public void xsetBstrArray(int i, org.apache.xmlbeans.XmlString bstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BSTR$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bstr);
        }
    }
    
    /**
     * Inserts the value as the ith "bstr" element
     */
    public void insertBstr(int i, java.lang.String bstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BSTR$26, i);
            target.setStringValue(bstr);
        }
    }
    
    /**
     * Appends the value as the last "bstr" element
     */
    public void addBstr(java.lang.String bstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BSTR$26);
            target.setStringValue(bstr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bstr" element
     */
    public org.apache.xmlbeans.XmlString insertNewBstr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(BSTR$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bstr" element
     */
    public org.apache.xmlbeans.XmlString addNewBstr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BSTR$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "bstr" element
     */
    public void removeBstr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BSTR$26, i);
        }
    }
    
    /**
     * Gets a List of "date" elements
     */
    public java.util.List<java.util.Calendar> getDateList()
    {
        final class DateList extends java.util.AbstractList<java.util.Calendar>
        {
            public java.util.Calendar get(int i)
                { return CTVectorImpl.this.getDateArray(i); }
            
            public java.util.Calendar set(int i, java.util.Calendar o)
            {
                java.util.Calendar old = CTVectorImpl.this.getDateArray(i);
                CTVectorImpl.this.setDateArray(i, o);
                return old;
            }
            
            public void add(int i, java.util.Calendar o)
                { CTVectorImpl.this.insertDate(i, o); }
            
            public java.util.Calendar remove(int i)
            {
                java.util.Calendar old = CTVectorImpl.this.getDateArray(i);
                CTVectorImpl.this.removeDate(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfDateArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DateList();
        }
    }
    
    /**
     * Gets array of all "date" elements
     */
    public java.util.Calendar[] getDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATE$28, targetList);
            java.util.Calendar[] result = new java.util.Calendar[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getCalendarValue();
            return result;
        }
    }
    
    /**
     * Gets ith "date" element
     */
    public java.util.Calendar getDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "date" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlDateTime> xgetDateList()
    {
        final class DateList extends java.util.AbstractList<org.apache.xmlbeans.XmlDateTime>
        {
            public org.apache.xmlbeans.XmlDateTime get(int i)
                { return CTVectorImpl.this.xgetDateArray(i); }
            
            public org.apache.xmlbeans.XmlDateTime set(int i, org.apache.xmlbeans.XmlDateTime o)
            {
                org.apache.xmlbeans.XmlDateTime old = CTVectorImpl.this.xgetDateArray(i);
                CTVectorImpl.this.xsetDateArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlDateTime o)
                { CTVectorImpl.this.insertNewDate(i).set(o); }
            
            public org.apache.xmlbeans.XmlDateTime remove(int i)
            {
                org.apache.xmlbeans.XmlDateTime old = CTVectorImpl.this.xgetDateArray(i);
                CTVectorImpl.this.removeDate(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfDateArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DateList();
        }
    }
    
    /**
     * Gets (as xml) array of all "date" elements
     */
    public org.apache.xmlbeans.XmlDateTime[] xgetDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATE$28, targetList);
            org.apache.xmlbeans.XmlDateTime[] result = new org.apache.xmlbeans.XmlDateTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "date" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDateTime)target;
        }
    }
    
    /**
     * Returns number of "date" element
     */
    public int sizeOfDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATE$28);
        }
    }
    
    /**
     * Sets array of all "date" element
     */
    public void setDateArray(java.util.Calendar[] dateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dateArray, DATE$28);
        }
    }
    
    /**
     * Sets ith "date" element
     */
    public void setDateArray(int i, java.util.Calendar date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setCalendarValue(date);
        }
    }
    
    /**
     * Sets (as xml) array of all "date" element
     */
    public void xsetDateArray(org.apache.xmlbeans.XmlDateTime[]dateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dateArray, DATE$28);
        }
    }
    
    /**
     * Sets (as xml) ith "date" element
     */
    public void xsetDateArray(int i, org.apache.xmlbeans.XmlDateTime date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(date);
        }
    }
    
    /**
     * Inserts the value as the ith "date" element
     */
    public void insertDate(int i, java.util.Calendar date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DATE$28, i);
            target.setCalendarValue(date);
        }
    }
    
    /**
     * Appends the value as the last "date" element
     */
    public void addDate(java.util.Calendar date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$28);
            target.setCalendarValue(date);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "date" element
     */
    public org.apache.xmlbeans.XmlDateTime insertNewDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().insert_element_user(DATE$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "date" element
     */
    public org.apache.xmlbeans.XmlDateTime addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATE$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "date" element
     */
    public void removeDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATE$28, i);
        }
    }
    
    /**
     * Gets a List of "filetime" elements
     */
    public java.util.List<java.util.Calendar> getFiletimeList()
    {
        final class FiletimeList extends java.util.AbstractList<java.util.Calendar>
        {
            public java.util.Calendar get(int i)
                { return CTVectorImpl.this.getFiletimeArray(i); }
            
            public java.util.Calendar set(int i, java.util.Calendar o)
            {
                java.util.Calendar old = CTVectorImpl.this.getFiletimeArray(i);
                CTVectorImpl.this.setFiletimeArray(i, o);
                return old;
            }
            
            public void add(int i, java.util.Calendar o)
                { CTVectorImpl.this.insertFiletime(i, o); }
            
            public java.util.Calendar remove(int i)
            {
                java.util.Calendar old = CTVectorImpl.this.getFiletimeArray(i);
                CTVectorImpl.this.removeFiletime(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfFiletimeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FiletimeList();
        }
    }
    
    /**
     * Gets array of all "filetime" elements
     */
    public java.util.Calendar[] getFiletimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILETIME$30, targetList);
            java.util.Calendar[] result = new java.util.Calendar[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getCalendarValue();
            return result;
        }
    }
    
    /**
     * Gets ith "filetime" element
     */
    public java.util.Calendar getFiletimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILETIME$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "filetime" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlDateTime> xgetFiletimeList()
    {
        final class FiletimeList extends java.util.AbstractList<org.apache.xmlbeans.XmlDateTime>
        {
            public org.apache.xmlbeans.XmlDateTime get(int i)
                { return CTVectorImpl.this.xgetFiletimeArray(i); }
            
            public org.apache.xmlbeans.XmlDateTime set(int i, org.apache.xmlbeans.XmlDateTime o)
            {
                org.apache.xmlbeans.XmlDateTime old = CTVectorImpl.this.xgetFiletimeArray(i);
                CTVectorImpl.this.xsetFiletimeArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlDateTime o)
                { CTVectorImpl.this.insertNewFiletime(i).set(o); }
            
            public org.apache.xmlbeans.XmlDateTime remove(int i)
            {
                org.apache.xmlbeans.XmlDateTime old = CTVectorImpl.this.xgetFiletimeArray(i);
                CTVectorImpl.this.removeFiletime(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfFiletimeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FiletimeList();
        }
    }
    
    /**
     * Gets (as xml) array of all "filetime" elements
     */
    public org.apache.xmlbeans.XmlDateTime[] xgetFiletimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILETIME$30, targetList);
            org.apache.xmlbeans.XmlDateTime[] result = new org.apache.xmlbeans.XmlDateTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "filetime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetFiletimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FILETIME$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDateTime)target;
        }
    }
    
    /**
     * Returns number of "filetime" element
     */
    public int sizeOfFiletimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILETIME$30);
        }
    }
    
    /**
     * Sets array of all "filetime" element
     */
    public void setFiletimeArray(java.util.Calendar[] filetimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(filetimeArray, FILETIME$30);
        }
    }
    
    /**
     * Sets ith "filetime" element
     */
    public void setFiletimeArray(int i, java.util.Calendar filetime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILETIME$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setCalendarValue(filetime);
        }
    }
    
    /**
     * Sets (as xml) array of all "filetime" element
     */
    public void xsetFiletimeArray(org.apache.xmlbeans.XmlDateTime[]filetimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(filetimeArray, FILETIME$30);
        }
    }
    
    /**
     * Sets (as xml) ith "filetime" element
     */
    public void xsetFiletimeArray(int i, org.apache.xmlbeans.XmlDateTime filetime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FILETIME$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(filetime);
        }
    }
    
    /**
     * Inserts the value as the ith "filetime" element
     */
    public void insertFiletime(int i, java.util.Calendar filetime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FILETIME$30, i);
            target.setCalendarValue(filetime);
        }
    }
    
    /**
     * Appends the value as the last "filetime" element
     */
    public void addFiletime(java.util.Calendar filetime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILETIME$30);
            target.setCalendarValue(filetime);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "filetime" element
     */
    public org.apache.xmlbeans.XmlDateTime insertNewFiletime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().insert_element_user(FILETIME$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filetime" element
     */
    public org.apache.xmlbeans.XmlDateTime addNewFiletime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FILETIME$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "filetime" element
     */
    public void removeFiletime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILETIME$30, i);
        }
    }
    
    /**
     * Gets a List of "bool" elements
     */
    public java.util.List<java.lang.Boolean> getBoolList()
    {
        final class BoolList extends java.util.AbstractList<java.lang.Boolean>
        {
            public java.lang.Boolean get(int i)
                { return CTVectorImpl.this.getBoolArray(i); }
            
            public java.lang.Boolean set(int i, java.lang.Boolean o)
            {
                java.lang.Boolean old = CTVectorImpl.this.getBoolArray(i);
                CTVectorImpl.this.setBoolArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Boolean o)
                { CTVectorImpl.this.insertBool(i, o); }
            
            public java.lang.Boolean remove(int i)
            {
                java.lang.Boolean old = CTVectorImpl.this.getBoolArray(i);
                CTVectorImpl.this.removeBool(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfBoolArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BoolList();
        }
    }
    
    /**
     * Gets array of all "bool" elements
     */
    public boolean[] getBoolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BOOL$32, targetList);
            boolean[] result = new boolean[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBooleanValue();
            return result;
        }
    }
    
    /**
     * Gets ith "bool" element
     */
    public boolean getBoolArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOL$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "bool" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlBoolean> xgetBoolList()
    {
        final class BoolList extends java.util.AbstractList<org.apache.xmlbeans.XmlBoolean>
        {
            public org.apache.xmlbeans.XmlBoolean get(int i)
                { return CTVectorImpl.this.xgetBoolArray(i); }
            
            public org.apache.xmlbeans.XmlBoolean set(int i, org.apache.xmlbeans.XmlBoolean o)
            {
                org.apache.xmlbeans.XmlBoolean old = CTVectorImpl.this.xgetBoolArray(i);
                CTVectorImpl.this.xsetBoolArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlBoolean o)
                { CTVectorImpl.this.insertNewBool(i).set(o); }
            
            public org.apache.xmlbeans.XmlBoolean remove(int i)
            {
                org.apache.xmlbeans.XmlBoolean old = CTVectorImpl.this.xgetBoolArray(i);
                CTVectorImpl.this.removeBool(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfBoolArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BoolList();
        }
    }
    
    /**
     * Gets (as xml) array of all "bool" elements
     */
    public org.apache.xmlbeans.XmlBoolean[] xgetBoolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BOOL$32, targetList);
            org.apache.xmlbeans.XmlBoolean[] result = new org.apache.xmlbeans.XmlBoolean[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "bool" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBoolArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOL$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlBoolean)target;
        }
    }
    
    /**
     * Returns number of "bool" element
     */
    public int sizeOfBoolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOL$32);
        }
    }
    
    /**
     * Sets array of all "bool" element
     */
    public void setBoolArray(boolean[] boolArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(boolArray, BOOL$32);
        }
    }
    
    /**
     * Sets ith "bool" element
     */
    public void setBoolArray(int i, boolean bool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOL$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBooleanValue(bool);
        }
    }
    
    /**
     * Sets (as xml) array of all "bool" element
     */
    public void xsetBoolArray(org.apache.xmlbeans.XmlBoolean[]boolArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(boolArray, BOOL$32);
        }
    }
    
    /**
     * Sets (as xml) ith "bool" element
     */
    public void xsetBoolArray(int i, org.apache.xmlbeans.XmlBoolean bool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOL$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bool);
        }
    }
    
    /**
     * Inserts the value as the ith "bool" element
     */
    public void insertBool(int i, boolean bool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BOOL$32, i);
            target.setBooleanValue(bool);
        }
    }
    
    /**
     * Appends the value as the last "bool" element
     */
    public void addBool(boolean bool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOL$32);
            target.setBooleanValue(bool);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bool" element
     */
    public org.apache.xmlbeans.XmlBoolean insertNewBool(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().insert_element_user(BOOL$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bool" element
     */
    public org.apache.xmlbeans.XmlBoolean addNewBool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BOOL$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "bool" element
     */
    public void removeBool(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOL$32, i);
        }
    }
    
    /**
     * Gets a List of "cy" elements
     */
    public java.util.List<java.lang.String> getCyList()
    {
        final class CyList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return CTVectorImpl.this.getCyArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CTVectorImpl.this.getCyArray(i);
                CTVectorImpl.this.setCyArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { CTVectorImpl.this.insertCy(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = CTVectorImpl.this.getCyArray(i);
                CTVectorImpl.this.removeCy(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfCyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CyList();
        }
    }
    
    /**
     * Gets array of all "cy" elements
     */
    public java.lang.String[] getCyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CY$34, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "cy" element
     */
    public java.lang.String getCyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CY$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "cy" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy> xgetCyList()
    {
        final class CyList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy get(int i)
                { return CTVectorImpl.this.xgetCyArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy set(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy old = CTVectorImpl.this.xgetCyArray(i);
                CTVectorImpl.this.xsetCyArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy o)
                { CTVectorImpl.this.insertNewCy(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy old = CTVectorImpl.this.xgetCyArray(i);
                CTVectorImpl.this.removeCy(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfCyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CyList();
        }
    }
    
    /**
     * Gets (as xml) array of all "cy" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy[] xgetCyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CY$34, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy[] result = new org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "cy" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy xgetCyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)get_store().find_element_user(CY$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)target;
        }
    }
    
    /**
     * Returns number of "cy" element
     */
    public int sizeOfCyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CY$34);
        }
    }
    
    /**
     * Sets array of all "cy" element
     */
    public void setCyArray(java.lang.String[] cyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cyArray, CY$34);
        }
    }
    
    /**
     * Sets ith "cy" element
     */
    public void setCyArray(int i, java.lang.String cy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CY$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(cy);
        }
    }
    
    /**
     * Sets (as xml) array of all "cy" element
     */
    public void xsetCyArray(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy[]cyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cyArray, CY$34);
        }
    }
    
    /**
     * Sets (as xml) ith "cy" element
     */
    public void xsetCyArray(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy cy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)get_store().find_element_user(CY$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cy);
        }
    }
    
    /**
     * Inserts the value as the ith "cy" element
     */
    public void insertCy(int i, java.lang.String cy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CY$34, i);
            target.setStringValue(cy);
        }
    }
    
    /**
     * Appends the value as the last "cy" element
     */
    public void addCy(java.lang.String cy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CY$34);
            target.setStringValue(cy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cy" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy insertNewCy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)get_store().insert_element_user(CY$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cy" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy addNewCy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)get_store().add_element_user(CY$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "cy" element
     */
    public void removeCy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CY$34, i);
        }
    }
    
    /**
     * Gets a List of "error" elements
     */
    public java.util.List<java.lang.String> getErrorList()
    {
        final class ErrorList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return CTVectorImpl.this.getErrorArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CTVectorImpl.this.getErrorArray(i);
                CTVectorImpl.this.setErrorArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { CTVectorImpl.this.insertError(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = CTVectorImpl.this.getErrorArray(i);
                CTVectorImpl.this.removeError(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfErrorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ErrorList();
        }
    }
    
    /**
     * Gets array of all "error" elements
     */
    public java.lang.String[] getErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ERROR$36, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "error" element
     */
    public java.lang.String getErrorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "error" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError> xgetErrorList()
    {
        final class ErrorList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError get(int i)
                { return CTVectorImpl.this.xgetErrorArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError set(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError old = CTVectorImpl.this.xgetErrorArray(i);
                CTVectorImpl.this.xsetErrorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError o)
                { CTVectorImpl.this.insertNewError(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError old = CTVectorImpl.this.xgetErrorArray(i);
                CTVectorImpl.this.removeError(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfErrorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ErrorList();
        }
    }
    
    /**
     * Gets (as xml) array of all "error" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError[] xgetErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ERROR$36, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError[] result = new org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "error" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError xgetErrorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)get_store().find_element_user(ERROR$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)target;
        }
    }
    
    /**
     * Returns number of "error" element
     */
    public int sizeOfErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERROR$36);
        }
    }
    
    /**
     * Sets array of all "error" element
     */
    public void setErrorArray(java.lang.String[] errorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(errorArray, ERROR$36);
        }
    }
    
    /**
     * Sets ith "error" element
     */
    public void setErrorArray(int i, java.lang.String error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(error);
        }
    }
    
    /**
     * Sets (as xml) array of all "error" element
     */
    public void xsetErrorArray(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError[]errorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(errorArray, ERROR$36);
        }
    }
    
    /**
     * Sets (as xml) ith "error" element
     */
    public void xsetErrorArray(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)get_store().find_element_user(ERROR$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(error);
        }
    }
    
    /**
     * Inserts the value as the ith "error" element
     */
    public void insertError(int i, java.lang.String error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ERROR$36, i);
            target.setStringValue(error);
        }
    }
    
    /**
     * Appends the value as the last "error" element
     */
    public void addError(java.lang.String error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERROR$36);
            target.setStringValue(error);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "error" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError insertNewError(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)get_store().insert_element_user(ERROR$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "error" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError addNewError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)get_store().add_element_user(ERROR$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "error" element
     */
    public void removeError(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERROR$36, i);
        }
    }
    
    /**
     * Gets a List of "clsid" elements
     */
    public java.util.List<java.lang.String> getClsidList()
    {
        final class ClsidList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return CTVectorImpl.this.getClsidArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CTVectorImpl.this.getClsidArray(i);
                CTVectorImpl.this.setClsidArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { CTVectorImpl.this.insertClsid(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = CTVectorImpl.this.getClsidArray(i);
                CTVectorImpl.this.removeClsid(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfClsidArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ClsidList();
        }
    }
    
    /**
     * Gets array of all "clsid" elements
     */
    public java.lang.String[] getClsidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLSID$38, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "clsid" element
     */
    public java.lang.String getClsidArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSID$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "clsid" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid> xgetClsidList()
    {
        final class ClsidList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid get(int i)
                { return CTVectorImpl.this.xgetClsidArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid set(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid old = CTVectorImpl.this.xgetClsidArray(i);
                CTVectorImpl.this.xsetClsidArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid o)
                { CTVectorImpl.this.insertNewClsid(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid old = CTVectorImpl.this.xgetClsidArray(i);
                CTVectorImpl.this.removeClsid(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfClsidArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ClsidList();
        }
    }
    
    /**
     * Gets (as xml) array of all "clsid" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid[] xgetClsidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLSID$38, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid[] result = new org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "clsid" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid xgetClsidArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid)get_store().find_element_user(CLSID$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid)target;
        }
    }
    
    /**
     * Returns number of "clsid" element
     */
    public int sizeOfClsidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLSID$38);
        }
    }
    
    /**
     * Sets array of all "clsid" element
     */
    public void setClsidArray(java.lang.String[] clsidArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(clsidArray, CLSID$38);
        }
    }
    
    /**
     * Sets ith "clsid" element
     */
    public void setClsidArray(int i, java.lang.String clsid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLSID$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(clsid);
        }
    }
    
    /**
     * Sets (as xml) array of all "clsid" element
     */
    public void xsetClsidArray(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid[]clsidArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(clsidArray, CLSID$38);
        }
    }
    
    /**
     * Sets (as xml) ith "clsid" element
     */
    public void xsetClsidArray(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid clsid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid)get_store().find_element_user(CLSID$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(clsid);
        }
    }
    
    /**
     * Inserts the value as the ith "clsid" element
     */
    public void insertClsid(int i, java.lang.String clsid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CLSID$38, i);
            target.setStringValue(clsid);
        }
    }
    
    /**
     * Appends the value as the last "clsid" element
     */
    public void addClsid(java.lang.String clsid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLSID$38);
            target.setStringValue(clsid);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "clsid" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid insertNewClsid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid)get_store().insert_element_user(CLSID$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "clsid" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid addNewClsid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid)get_store().add_element_user(CLSID$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "clsid" element
     */
    public void removeClsid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLSID$38, i);
        }
    }
    
    /**
     * Gets a List of "cf" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf> getCfList()
    {
        final class CfList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf get(int i)
                { return CTVectorImpl.this.getCfArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf set(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf old = CTVectorImpl.this.getCfArray(i);
                CTVectorImpl.this.setCfArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf o)
                { CTVectorImpl.this.insertNewCf(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf old = CTVectorImpl.this.getCfArray(i);
                CTVectorImpl.this.removeCf(i);
                return old;
            }
            
            public int size()
                { return CTVectorImpl.this.sizeOfCfArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CfList();
        }
    }
    
    /**
     * Gets array of all "cf" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf[] getCfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CF$40, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf[] result = new org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cf" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf getCfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf)get_store().find_element_user(CF$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cf" element
     */
    public int sizeOfCfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CF$40);
        }
    }
    
    /**
     * Sets array of all "cf" element
     */
    public void setCfArray(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf[] cfArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cfArray, CF$40);
        }
    }
    
    /**
     * Sets ith "cf" element
     */
    public void setCfArray(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf cf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf)get_store().find_element_user(CF$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cf);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cf" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf insertNewCf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf)get_store().insert_element_user(CF$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cf" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf addNewCf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf)get_store().add_element_user(CF$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "cf" element
     */
    public void removeCf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CF$40, i);
        }
    }
    
    /**
     * Gets the "baseType" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType.Enum getBaseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASETYPE$42);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "baseType" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType xgetBaseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType)get_store().find_attribute_user(BASETYPE$42);
            return target;
        }
    }
    
    /**
     * Sets the "baseType" attribute
     */
    public void setBaseType(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType.Enum baseType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASETYPE$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASETYPE$42);
            }
            target.setEnumValue(baseType);
        }
    }
    
    /**
     * Sets (as xml) the "baseType" attribute
     */
    public void xsetBaseType(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType baseType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType)get_store().find_attribute_user(BASETYPE$42);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType)get_store().add_attribute_user(BASETYPE$42);
            }
            target.set(baseType);
        }
    }
    
    /**
     * Gets the "size" attribute
     */
    public long getSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$44);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "size" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SIZE$44);
            return target;
        }
    }
    
    /**
     * Sets the "size" attribute
     */
    public void setSize(long size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIZE$44);
            }
            target.setLongValue(size);
        }
    }
    
    /**
     * Sets (as xml) the "size" attribute
     */
    public void xsetSize(org.apache.xmlbeans.XmlUnsignedInt size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SIZE$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SIZE$44);
            }
            target.set(size);
        }
    }
}
