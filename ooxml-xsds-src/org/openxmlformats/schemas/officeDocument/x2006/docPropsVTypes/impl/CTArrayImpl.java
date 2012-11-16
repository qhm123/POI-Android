/*
 * XML Type:  CT_Array
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl;
/**
 * An XML CT_Array(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes).
 *
 * This is a complex type.
 */
public class CTArrayImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray
{
    
    public CTArrayImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName INT$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "int");
    private static final javax.xml.namespace.QName UI1$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui1");
    private static final javax.xml.namespace.QName UI2$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui2");
    private static final javax.xml.namespace.QName UI4$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui4");
    private static final javax.xml.namespace.QName UINT$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "uint");
    private static final javax.xml.namespace.QName R4$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "r4");
    private static final javax.xml.namespace.QName R8$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "r8");
    private static final javax.xml.namespace.QName DECIMAL$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "decimal");
    private static final javax.xml.namespace.QName BSTR$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "bstr");
    private static final javax.xml.namespace.QName DATE$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "date");
    private static final javax.xml.namespace.QName BOOL$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "bool");
    private static final javax.xml.namespace.QName ERROR$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "error");
    private static final javax.xml.namespace.QName CY$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "cy");
    private static final javax.xml.namespace.QName LBOUNDS$34 = 
        new javax.xml.namespace.QName("", "lBounds");
    private static final javax.xml.namespace.QName UBOUNDS$36 = 
        new javax.xml.namespace.QName("", "uBounds");
    private static final javax.xml.namespace.QName BASETYPE$38 = 
        new javax.xml.namespace.QName("", "baseType");
    
    
    /**
     * Gets a List of "variant" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant> getVariantList()
    {
        final class VariantList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant get(int i)
                { return CTArrayImpl.this.getVariantArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant set(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant old = CTArrayImpl.this.getVariantArray(i);
                CTArrayImpl.this.setVariantArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant o)
                { CTArrayImpl.this.insertNewVariant(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant old = CTArrayImpl.this.getVariantArray(i);
                CTArrayImpl.this.removeVariant(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfVariantArray(); }
            
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
                { return CTArrayImpl.this.getI1Array(i); }
            
            public java.lang.Byte set(int i, java.lang.Byte o)
            {
                java.lang.Byte old = CTArrayImpl.this.getI1Array(i);
                CTArrayImpl.this.setI1Array(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Byte o)
                { CTArrayImpl.this.insertI1(i, o); }
            
            public java.lang.Byte remove(int i)
            {
                java.lang.Byte old = CTArrayImpl.this.getI1Array(i);
                CTArrayImpl.this.removeI1(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfI1Array(); }
            
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
                { return CTArrayImpl.this.xgetI1Array(i); }
            
            public org.apache.xmlbeans.XmlByte set(int i, org.apache.xmlbeans.XmlByte o)
            {
                org.apache.xmlbeans.XmlByte old = CTArrayImpl.this.xgetI1Array(i);
                CTArrayImpl.this.xsetI1Array(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlByte o)
                { CTArrayImpl.this.insertNewI1(i).set(o); }
            
            public org.apache.xmlbeans.XmlByte remove(int i)
            {
                org.apache.xmlbeans.XmlByte old = CTArrayImpl.this.xgetI1Array(i);
                CTArrayImpl.this.removeI1(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfI1Array(); }
            
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
                { return CTArrayImpl.this.getI2Array(i); }
            
            public java.lang.Short set(int i, java.lang.Short o)
            {
                java.lang.Short old = CTArrayImpl.this.getI2Array(i);
                CTArrayImpl.this.setI2Array(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Short o)
                { CTArrayImpl.this.insertI2(i, o); }
            
            public java.lang.Short remove(int i)
            {
                java.lang.Short old = CTArrayImpl.this.getI2Array(i);
                CTArrayImpl.this.removeI2(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfI2Array(); }
            
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
                { return CTArrayImpl.this.xgetI2Array(i); }
            
            public org.apache.xmlbeans.XmlShort set(int i, org.apache.xmlbeans.XmlShort o)
            {
                org.apache.xmlbeans.XmlShort old = CTArrayImpl.this.xgetI2Array(i);
                CTArrayImpl.this.xsetI2Array(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlShort o)
                { CTArrayImpl.this.insertNewI2(i).set(o); }
            
            public org.apache.xmlbeans.XmlShort remove(int i)
            {
                org.apache.xmlbeans.XmlShort old = CTArrayImpl.this.xgetI2Array(i);
                CTArrayImpl.this.removeI2(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfI2Array(); }
            
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
                { return CTArrayImpl.this.getI4Array(i); }
            
            public java.lang.Integer set(int i, java.lang.Integer o)
            {
                java.lang.Integer old = CTArrayImpl.this.getI4Array(i);
                CTArrayImpl.this.setI4Array(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Integer o)
                { CTArrayImpl.this.insertI4(i, o); }
            
            public java.lang.Integer remove(int i)
            {
                java.lang.Integer old = CTArrayImpl.this.getI4Array(i);
                CTArrayImpl.this.removeI4(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfI4Array(); }
            
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
                { return CTArrayImpl.this.xgetI4Array(i); }
            
            public org.apache.xmlbeans.XmlInt set(int i, org.apache.xmlbeans.XmlInt o)
            {
                org.apache.xmlbeans.XmlInt old = CTArrayImpl.this.xgetI4Array(i);
                CTArrayImpl.this.xsetI4Array(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlInt o)
                { CTArrayImpl.this.insertNewI4(i).set(o); }
            
            public org.apache.xmlbeans.XmlInt remove(int i)
            {
                org.apache.xmlbeans.XmlInt old = CTArrayImpl.this.xgetI4Array(i);
                CTArrayImpl.this.removeI4(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfI4Array(); }
            
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
     * Gets a List of "int" elements
     */
    public java.util.List<java.lang.Integer> getIntList()
    {
        final class IntList extends java.util.AbstractList<java.lang.Integer>
        {
            public java.lang.Integer get(int i)
                { return CTArrayImpl.this.getIntArray(i); }
            
            public java.lang.Integer set(int i, java.lang.Integer o)
            {
                java.lang.Integer old = CTArrayImpl.this.getIntArray(i);
                CTArrayImpl.this.setIntArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Integer o)
                { CTArrayImpl.this.insertInt(i, o); }
            
            public java.lang.Integer remove(int i)
            {
                java.lang.Integer old = CTArrayImpl.this.getIntArray(i);
                CTArrayImpl.this.removeInt(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfIntArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IntList();
        }
    }
    
    /**
     * Gets array of all "int" elements
     */
    public int[] getIntArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INT$8, targetList);
            int[] result = new int[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getIntValue();
            return result;
        }
    }
    
    /**
     * Gets ith "int" element
     */
    public int getIntArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "int" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlInt> xgetIntList()
    {
        final class IntList extends java.util.AbstractList<org.apache.xmlbeans.XmlInt>
        {
            public org.apache.xmlbeans.XmlInt get(int i)
                { return CTArrayImpl.this.xgetIntArray(i); }
            
            public org.apache.xmlbeans.XmlInt set(int i, org.apache.xmlbeans.XmlInt o)
            {
                org.apache.xmlbeans.XmlInt old = CTArrayImpl.this.xgetIntArray(i);
                CTArrayImpl.this.xsetIntArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlInt o)
                { CTArrayImpl.this.insertNewInt(i).set(o); }
            
            public org.apache.xmlbeans.XmlInt remove(int i)
            {
                org.apache.xmlbeans.XmlInt old = CTArrayImpl.this.xgetIntArray(i);
                CTArrayImpl.this.removeInt(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfIntArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IntList();
        }
    }
    
    /**
     * Gets (as xml) array of all "int" elements
     */
    public org.apache.xmlbeans.XmlInt[] xgetIntArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INT$8, targetList);
            org.apache.xmlbeans.XmlInt[] result = new org.apache.xmlbeans.XmlInt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "int" element
     */
    public org.apache.xmlbeans.XmlInt xgetIntArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlInt)target;
        }
    }
    
    /**
     * Returns number of "int" element
     */
    public int sizeOfIntArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INT$8);
        }
    }
    
    /**
     * Sets array of all "int" element
     */
    public void setIntArray(int[] xintArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xintArray, INT$8);
        }
    }
    
    /**
     * Sets ith "int" element
     */
    public void setIntArray(int i, int xint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setIntValue(xint);
        }
    }
    
    /**
     * Sets (as xml) array of all "int" element
     */
    public void xsetIntArray(org.apache.xmlbeans.XmlInt[]xintArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xintArray, INT$8);
        }
    }
    
    /**
     * Sets (as xml) ith "int" element
     */
    public void xsetIntArray(int i, org.apache.xmlbeans.XmlInt xint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xint);
        }
    }
    
    /**
     * Inserts the value as the ith "int" element
     */
    public void insertInt(int i, int xint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INT$8, i);
            target.setIntValue(xint);
        }
    }
    
    /**
     * Appends the value as the last "int" element
     */
    public void addInt(int xint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INT$8);
            target.setIntValue(xint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "int" element
     */
    public org.apache.xmlbeans.XmlInt insertNewInt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().insert_element_user(INT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "int" element
     */
    public org.apache.xmlbeans.XmlInt addNewInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "int" element
     */
    public void removeInt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INT$8, i);
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
                { return CTArrayImpl.this.getUi1Array(i); }
            
            public java.lang.Short set(int i, java.lang.Short o)
            {
                java.lang.Short old = CTArrayImpl.this.getUi1Array(i);
                CTArrayImpl.this.setUi1Array(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Short o)
                { CTArrayImpl.this.insertUi1(i, o); }
            
            public java.lang.Short remove(int i)
            {
                java.lang.Short old = CTArrayImpl.this.getUi1Array(i);
                CTArrayImpl.this.removeUi1(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfUi1Array(); }
            
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
                { return CTArrayImpl.this.xgetUi1Array(i); }
            
            public org.apache.xmlbeans.XmlUnsignedByte set(int i, org.apache.xmlbeans.XmlUnsignedByte o)
            {
                org.apache.xmlbeans.XmlUnsignedByte old = CTArrayImpl.this.xgetUi1Array(i);
                CTArrayImpl.this.xsetUi1Array(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlUnsignedByte o)
                { CTArrayImpl.this.insertNewUi1(i).set(o); }
            
            public org.apache.xmlbeans.XmlUnsignedByte remove(int i)
            {
                org.apache.xmlbeans.XmlUnsignedByte old = CTArrayImpl.this.xgetUi1Array(i);
                CTArrayImpl.this.removeUi1(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfUi1Array(); }
            
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
                { return CTArrayImpl.this.getUi2Array(i); }
            
            public java.lang.Integer set(int i, java.lang.Integer o)
            {
                java.lang.Integer old = CTArrayImpl.this.getUi2Array(i);
                CTArrayImpl.this.setUi2Array(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Integer o)
                { CTArrayImpl.this.insertUi2(i, o); }
            
            public java.lang.Integer remove(int i)
            {
                java.lang.Integer old = CTArrayImpl.this.getUi2Array(i);
                CTArrayImpl.this.removeUi2(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfUi2Array(); }
            
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
                { return CTArrayImpl.this.xgetUi2Array(i); }
            
            public org.apache.xmlbeans.XmlUnsignedShort set(int i, org.apache.xmlbeans.XmlUnsignedShort o)
            {
                org.apache.xmlbeans.XmlUnsignedShort old = CTArrayImpl.this.xgetUi2Array(i);
                CTArrayImpl.this.xsetUi2Array(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlUnsignedShort o)
                { CTArrayImpl.this.insertNewUi2(i).set(o); }
            
            public org.apache.xmlbeans.XmlUnsignedShort remove(int i)
            {
                org.apache.xmlbeans.XmlUnsignedShort old = CTArrayImpl.this.xgetUi2Array(i);
                CTArrayImpl.this.removeUi2(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfUi2Array(); }
            
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
                { return CTArrayImpl.this.getUi4Array(i); }
            
            public java.lang.Long set(int i, java.lang.Long o)
            {
                java.lang.Long old = CTArrayImpl.this.getUi4Array(i);
                CTArrayImpl.this.setUi4Array(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Long o)
                { CTArrayImpl.this.insertUi4(i, o); }
            
            public java.lang.Long remove(int i)
            {
                java.lang.Long old = CTArrayImpl.this.getUi4Array(i);
                CTArrayImpl.this.removeUi4(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfUi4Array(); }
            
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
                { return CTArrayImpl.this.xgetUi4Array(i); }
            
            public org.apache.xmlbeans.XmlUnsignedInt set(int i, org.apache.xmlbeans.XmlUnsignedInt o)
            {
                org.apache.xmlbeans.XmlUnsignedInt old = CTArrayImpl.this.xgetUi4Array(i);
                CTArrayImpl.this.xsetUi4Array(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlUnsignedInt o)
                { CTArrayImpl.this.insertNewUi4(i).set(o); }
            
            public org.apache.xmlbeans.XmlUnsignedInt remove(int i)
            {
                org.apache.xmlbeans.XmlUnsignedInt old = CTArrayImpl.this.xgetUi4Array(i);
                CTArrayImpl.this.removeUi4(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfUi4Array(); }
            
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
     * Gets a List of "uint" elements
     */
    public java.util.List<java.lang.Long> getUintList()
    {
        final class UintList extends java.util.AbstractList<java.lang.Long>
        {
            public java.lang.Long get(int i)
                { return CTArrayImpl.this.getUintArray(i); }
            
            public java.lang.Long set(int i, java.lang.Long o)
            {
                java.lang.Long old = CTArrayImpl.this.getUintArray(i);
                CTArrayImpl.this.setUintArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Long o)
                { CTArrayImpl.this.insertUint(i, o); }
            
            public java.lang.Long remove(int i)
            {
                java.lang.Long old = CTArrayImpl.this.getUintArray(i);
                CTArrayImpl.this.removeUint(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfUintArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UintList();
        }
    }
    
    /**
     * Gets array of all "uint" elements
     */
    public long[] getUintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UINT$16, targetList);
            long[] result = new long[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getLongValue();
            return result;
        }
    }
    
    /**
     * Gets ith "uint" element
     */
    public long getUintArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UINT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "uint" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlUnsignedInt> xgetUintList()
    {
        final class UintList extends java.util.AbstractList<org.apache.xmlbeans.XmlUnsignedInt>
        {
            public org.apache.xmlbeans.XmlUnsignedInt get(int i)
                { return CTArrayImpl.this.xgetUintArray(i); }
            
            public org.apache.xmlbeans.XmlUnsignedInt set(int i, org.apache.xmlbeans.XmlUnsignedInt o)
            {
                org.apache.xmlbeans.XmlUnsignedInt old = CTArrayImpl.this.xgetUintArray(i);
                CTArrayImpl.this.xsetUintArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlUnsignedInt o)
                { CTArrayImpl.this.insertNewUint(i).set(o); }
            
            public org.apache.xmlbeans.XmlUnsignedInt remove(int i)
            {
                org.apache.xmlbeans.XmlUnsignedInt old = CTArrayImpl.this.xgetUintArray(i);
                CTArrayImpl.this.removeUint(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfUintArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UintList();
        }
    }
    
    /**
     * Gets (as xml) array of all "uint" elements
     */
    public org.apache.xmlbeans.XmlUnsignedInt[] xgetUintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UINT$16, targetList);
            org.apache.xmlbeans.XmlUnsignedInt[] result = new org.apache.xmlbeans.XmlUnsignedInt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "uint" element
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetUintArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(UINT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlUnsignedInt)target;
        }
    }
    
    /**
     * Returns number of "uint" element
     */
    public int sizeOfUintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UINT$16);
        }
    }
    
    /**
     * Sets array of all "uint" element
     */
    public void setUintArray(long[] uintArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(uintArray, UINT$16);
        }
    }
    
    /**
     * Sets ith "uint" element
     */
    public void setUintArray(int i, long uint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UINT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setLongValue(uint);
        }
    }
    
    /**
     * Sets (as xml) array of all "uint" element
     */
    public void xsetUintArray(org.apache.xmlbeans.XmlUnsignedInt[]uintArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(uintArray, UINT$16);
        }
    }
    
    /**
     * Sets (as xml) ith "uint" element
     */
    public void xsetUintArray(int i, org.apache.xmlbeans.XmlUnsignedInt uint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(UINT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(uint);
        }
    }
    
    /**
     * Inserts the value as the ith "uint" element
     */
    public void insertUint(int i, long uint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(UINT$16, i);
            target.setLongValue(uint);
        }
    }
    
    /**
     * Appends the value as the last "uint" element
     */
    public void addUint(long uint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UINT$16);
            target.setLongValue(uint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "uint" element
     */
    public org.apache.xmlbeans.XmlUnsignedInt insertNewUint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().insert_element_user(UINT$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "uint" element
     */
    public org.apache.xmlbeans.XmlUnsignedInt addNewUint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(UINT$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "uint" element
     */
    public void removeUint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UINT$16, i);
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
                { return CTArrayImpl.this.getR4Array(i); }
            
            public java.lang.Float set(int i, java.lang.Float o)
            {
                java.lang.Float old = CTArrayImpl.this.getR4Array(i);
                CTArrayImpl.this.setR4Array(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Float o)
                { CTArrayImpl.this.insertR4(i, o); }
            
            public java.lang.Float remove(int i)
            {
                java.lang.Float old = CTArrayImpl.this.getR4Array(i);
                CTArrayImpl.this.removeR4(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfR4Array(); }
            
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
                { return CTArrayImpl.this.xgetR4Array(i); }
            
            public org.apache.xmlbeans.XmlFloat set(int i, org.apache.xmlbeans.XmlFloat o)
            {
                org.apache.xmlbeans.XmlFloat old = CTArrayImpl.this.xgetR4Array(i);
                CTArrayImpl.this.xsetR4Array(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlFloat o)
                { CTArrayImpl.this.insertNewR4(i).set(o); }
            
            public org.apache.xmlbeans.XmlFloat remove(int i)
            {
                org.apache.xmlbeans.XmlFloat old = CTArrayImpl.this.xgetR4Array(i);
                CTArrayImpl.this.removeR4(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfR4Array(); }
            
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
                { return CTArrayImpl.this.getR8Array(i); }
            
            public java.lang.Double set(int i, java.lang.Double o)
            {
                java.lang.Double old = CTArrayImpl.this.getR8Array(i);
                CTArrayImpl.this.setR8Array(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Double o)
                { CTArrayImpl.this.insertR8(i, o); }
            
            public java.lang.Double remove(int i)
            {
                java.lang.Double old = CTArrayImpl.this.getR8Array(i);
                CTArrayImpl.this.removeR8(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfR8Array(); }
            
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
                { return CTArrayImpl.this.xgetR8Array(i); }
            
            public org.apache.xmlbeans.XmlDouble set(int i, org.apache.xmlbeans.XmlDouble o)
            {
                org.apache.xmlbeans.XmlDouble old = CTArrayImpl.this.xgetR8Array(i);
                CTArrayImpl.this.xsetR8Array(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlDouble o)
                { CTArrayImpl.this.insertNewR8(i).set(o); }
            
            public org.apache.xmlbeans.XmlDouble remove(int i)
            {
                org.apache.xmlbeans.XmlDouble old = CTArrayImpl.this.xgetR8Array(i);
                CTArrayImpl.this.removeR8(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfR8Array(); }
            
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
     * Gets a List of "decimal" elements
     */
    public java.util.List<java.math.BigDecimal> getDecimalList()
    {
        final class DecimalList extends java.util.AbstractList<java.math.BigDecimal>
        {
            public java.math.BigDecimal get(int i)
                { return CTArrayImpl.this.getDecimalArray(i); }
            
            public java.math.BigDecimal set(int i, java.math.BigDecimal o)
            {
                java.math.BigDecimal old = CTArrayImpl.this.getDecimalArray(i);
                CTArrayImpl.this.setDecimalArray(i, o);
                return old;
            }
            
            public void add(int i, java.math.BigDecimal o)
                { CTArrayImpl.this.insertDecimal(i, o); }
            
            public java.math.BigDecimal remove(int i)
            {
                java.math.BigDecimal old = CTArrayImpl.this.getDecimalArray(i);
                CTArrayImpl.this.removeDecimal(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfDecimalArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DecimalList();
        }
    }
    
    /**
     * Gets array of all "decimal" elements
     */
    public java.math.BigDecimal[] getDecimalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DECIMAL$22, targetList);
            java.math.BigDecimal[] result = new java.math.BigDecimal[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigDecimalValue();
            return result;
        }
    }
    
    /**
     * Gets ith "decimal" element
     */
    public java.math.BigDecimal getDecimalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMAL$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "decimal" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlDecimal> xgetDecimalList()
    {
        final class DecimalList extends java.util.AbstractList<org.apache.xmlbeans.XmlDecimal>
        {
            public org.apache.xmlbeans.XmlDecimal get(int i)
                { return CTArrayImpl.this.xgetDecimalArray(i); }
            
            public org.apache.xmlbeans.XmlDecimal set(int i, org.apache.xmlbeans.XmlDecimal o)
            {
                org.apache.xmlbeans.XmlDecimal old = CTArrayImpl.this.xgetDecimalArray(i);
                CTArrayImpl.this.xsetDecimalArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlDecimal o)
                { CTArrayImpl.this.insertNewDecimal(i).set(o); }
            
            public org.apache.xmlbeans.XmlDecimal remove(int i)
            {
                org.apache.xmlbeans.XmlDecimal old = CTArrayImpl.this.xgetDecimalArray(i);
                CTArrayImpl.this.removeDecimal(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfDecimalArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DecimalList();
        }
    }
    
    /**
     * Gets (as xml) array of all "decimal" elements
     */
    public org.apache.xmlbeans.XmlDecimal[] xgetDecimalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DECIMAL$22, targetList);
            org.apache.xmlbeans.XmlDecimal[] result = new org.apache.xmlbeans.XmlDecimal[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "decimal" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetDecimalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(DECIMAL$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDecimal)target;
        }
    }
    
    /**
     * Returns number of "decimal" element
     */
    public int sizeOfDecimalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECIMAL$22);
        }
    }
    
    /**
     * Sets array of all "decimal" element
     */
    public void setDecimalArray(java.math.BigDecimal[] decimalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(decimalArray, DECIMAL$22);
        }
    }
    
    /**
     * Sets ith "decimal" element
     */
    public void setDecimalArray(int i, java.math.BigDecimal decimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMAL$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBigDecimalValue(decimal);
        }
    }
    
    /**
     * Sets (as xml) array of all "decimal" element
     */
    public void xsetDecimalArray(org.apache.xmlbeans.XmlDecimal[]decimalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(decimalArray, DECIMAL$22);
        }
    }
    
    /**
     * Sets (as xml) ith "decimal" element
     */
    public void xsetDecimalArray(int i, org.apache.xmlbeans.XmlDecimal decimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(DECIMAL$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(decimal);
        }
    }
    
    /**
     * Inserts the value as the ith "decimal" element
     */
    public void insertDecimal(int i, java.math.BigDecimal decimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DECIMAL$22, i);
            target.setBigDecimalValue(decimal);
        }
    }
    
    /**
     * Appends the value as the last "decimal" element
     */
    public void addDecimal(java.math.BigDecimal decimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECIMAL$22);
            target.setBigDecimalValue(decimal);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "decimal" element
     */
    public org.apache.xmlbeans.XmlDecimal insertNewDecimal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().insert_element_user(DECIMAL$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "decimal" element
     */
    public org.apache.xmlbeans.XmlDecimal addNewDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(DECIMAL$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "decimal" element
     */
    public void removeDecimal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECIMAL$22, i);
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
                { return CTArrayImpl.this.getBstrArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CTArrayImpl.this.getBstrArray(i);
                CTArrayImpl.this.setBstrArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { CTArrayImpl.this.insertBstr(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = CTArrayImpl.this.getBstrArray(i);
                CTArrayImpl.this.removeBstr(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfBstrArray(); }
            
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
            get_store().find_all_element_users(BSTR$24, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BSTR$24, i);
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
                { return CTArrayImpl.this.xgetBstrArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = CTArrayImpl.this.xgetBstrArray(i);
                CTArrayImpl.this.xsetBstrArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { CTArrayImpl.this.insertNewBstr(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = CTArrayImpl.this.xgetBstrArray(i);
                CTArrayImpl.this.removeBstr(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfBstrArray(); }
            
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
            get_store().find_all_element_users(BSTR$24, targetList);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BSTR$24, i);
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
            return get_store().count_elements(BSTR$24);
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
            arraySetterHelper(bstrArray, BSTR$24);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BSTR$24, i);
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
            arraySetterHelper(bstrArray, BSTR$24);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BSTR$24, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BSTR$24, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BSTR$24);
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
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(BSTR$24, i);
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
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BSTR$24);
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
            get_store().remove_element(BSTR$24, i);
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
                { return CTArrayImpl.this.getDateArray(i); }
            
            public java.util.Calendar set(int i, java.util.Calendar o)
            {
                java.util.Calendar old = CTArrayImpl.this.getDateArray(i);
                CTArrayImpl.this.setDateArray(i, o);
                return old;
            }
            
            public void add(int i, java.util.Calendar o)
                { CTArrayImpl.this.insertDate(i, o); }
            
            public java.util.Calendar remove(int i)
            {
                java.util.Calendar old = CTArrayImpl.this.getDateArray(i);
                CTArrayImpl.this.removeDate(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfDateArray(); }
            
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
            get_store().find_all_element_users(DATE$26, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$26, i);
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
                { return CTArrayImpl.this.xgetDateArray(i); }
            
            public org.apache.xmlbeans.XmlDateTime set(int i, org.apache.xmlbeans.XmlDateTime o)
            {
                org.apache.xmlbeans.XmlDateTime old = CTArrayImpl.this.xgetDateArray(i);
                CTArrayImpl.this.xsetDateArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlDateTime o)
                { CTArrayImpl.this.insertNewDate(i).set(o); }
            
            public org.apache.xmlbeans.XmlDateTime remove(int i)
            {
                org.apache.xmlbeans.XmlDateTime old = CTArrayImpl.this.xgetDateArray(i);
                CTArrayImpl.this.removeDate(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfDateArray(); }
            
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
            get_store().find_all_element_users(DATE$26, targetList);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATE$26, i);
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
            return get_store().count_elements(DATE$26);
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
            arraySetterHelper(dateArray, DATE$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$26, i);
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
            arraySetterHelper(dateArray, DATE$26);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATE$26, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DATE$26, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$26);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().insert_element_user(DATE$26, i);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATE$26);
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
            get_store().remove_element(DATE$26, i);
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
                { return CTArrayImpl.this.getBoolArray(i); }
            
            public java.lang.Boolean set(int i, java.lang.Boolean o)
            {
                java.lang.Boolean old = CTArrayImpl.this.getBoolArray(i);
                CTArrayImpl.this.setBoolArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Boolean o)
                { CTArrayImpl.this.insertBool(i, o); }
            
            public java.lang.Boolean remove(int i)
            {
                java.lang.Boolean old = CTArrayImpl.this.getBoolArray(i);
                CTArrayImpl.this.removeBool(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfBoolArray(); }
            
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
            get_store().find_all_element_users(BOOL$28, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOL$28, i);
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
                { return CTArrayImpl.this.xgetBoolArray(i); }
            
            public org.apache.xmlbeans.XmlBoolean set(int i, org.apache.xmlbeans.XmlBoolean o)
            {
                org.apache.xmlbeans.XmlBoolean old = CTArrayImpl.this.xgetBoolArray(i);
                CTArrayImpl.this.xsetBoolArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlBoolean o)
                { CTArrayImpl.this.insertNewBool(i).set(o); }
            
            public org.apache.xmlbeans.XmlBoolean remove(int i)
            {
                org.apache.xmlbeans.XmlBoolean old = CTArrayImpl.this.xgetBoolArray(i);
                CTArrayImpl.this.removeBool(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfBoolArray(); }
            
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
            get_store().find_all_element_users(BOOL$28, targetList);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOL$28, i);
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
            return get_store().count_elements(BOOL$28);
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
            arraySetterHelper(boolArray, BOOL$28);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOL$28, i);
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
            arraySetterHelper(boolArray, BOOL$28);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOL$28, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BOOL$28, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOL$28);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().insert_element_user(BOOL$28, i);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BOOL$28);
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
            get_store().remove_element(BOOL$28, i);
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
                { return CTArrayImpl.this.getErrorArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CTArrayImpl.this.getErrorArray(i);
                CTArrayImpl.this.setErrorArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { CTArrayImpl.this.insertError(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = CTArrayImpl.this.getErrorArray(i);
                CTArrayImpl.this.removeError(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfErrorArray(); }
            
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
            get_store().find_all_element_users(ERROR$30, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$30, i);
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
                { return CTArrayImpl.this.xgetErrorArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError set(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError old = CTArrayImpl.this.xgetErrorArray(i);
                CTArrayImpl.this.xsetErrorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError o)
                { CTArrayImpl.this.insertNewError(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError old = CTArrayImpl.this.xgetErrorArray(i);
                CTArrayImpl.this.removeError(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfErrorArray(); }
            
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
            get_store().find_all_element_users(ERROR$30, targetList);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)get_store().find_element_user(ERROR$30, i);
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
            return get_store().count_elements(ERROR$30);
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
            arraySetterHelper(errorArray, ERROR$30);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$30, i);
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
            arraySetterHelper(errorArray, ERROR$30);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)get_store().find_element_user(ERROR$30, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ERROR$30, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERROR$30);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)get_store().insert_element_user(ERROR$30, i);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)get_store().add_element_user(ERROR$30);
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
            get_store().remove_element(ERROR$30, i);
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
                { return CTArrayImpl.this.getCyArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = CTArrayImpl.this.getCyArray(i);
                CTArrayImpl.this.setCyArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { CTArrayImpl.this.insertCy(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = CTArrayImpl.this.getCyArray(i);
                CTArrayImpl.this.removeCy(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfCyArray(); }
            
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
            get_store().find_all_element_users(CY$32, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CY$32, i);
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
                { return CTArrayImpl.this.xgetCyArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy set(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy old = CTArrayImpl.this.xgetCyArray(i);
                CTArrayImpl.this.xsetCyArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy o)
                { CTArrayImpl.this.insertNewCy(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy old = CTArrayImpl.this.xgetCyArray(i);
                CTArrayImpl.this.removeCy(i);
                return old;
            }
            
            public int size()
                { return CTArrayImpl.this.sizeOfCyArray(); }
            
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
            get_store().find_all_element_users(CY$32, targetList);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)get_store().find_element_user(CY$32, i);
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
            return get_store().count_elements(CY$32);
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
            arraySetterHelper(cyArray, CY$32);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CY$32, i);
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
            arraySetterHelper(cyArray, CY$32);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)get_store().find_element_user(CY$32, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CY$32, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CY$32);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)get_store().insert_element_user(CY$32, i);
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
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)get_store().add_element_user(CY$32);
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
            get_store().remove_element(CY$32, i);
        }
    }
    
    /**
     * Gets the "lBounds" attribute
     */
    public int getLBounds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LBOUNDS$34);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "lBounds" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetLBounds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(LBOUNDS$34);
            return target;
        }
    }
    
    /**
     * Sets the "lBounds" attribute
     */
    public void setLBounds(int lBounds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LBOUNDS$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LBOUNDS$34);
            }
            target.setIntValue(lBounds);
        }
    }
    
    /**
     * Sets (as xml) the "lBounds" attribute
     */
    public void xsetLBounds(org.apache.xmlbeans.XmlInt lBounds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(LBOUNDS$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(LBOUNDS$34);
            }
            target.set(lBounds);
        }
    }
    
    /**
     * Gets the "uBounds" attribute
     */
    public int getUBounds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UBOUNDS$36);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "uBounds" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetUBounds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(UBOUNDS$36);
            return target;
        }
    }
    
    /**
     * Sets the "uBounds" attribute
     */
    public void setUBounds(int uBounds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UBOUNDS$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UBOUNDS$36);
            }
            target.setIntValue(uBounds);
        }
    }
    
    /**
     * Sets (as xml) the "uBounds" attribute
     */
    public void xsetUBounds(org.apache.xmlbeans.XmlInt uBounds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(UBOUNDS$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(UBOUNDS$36);
            }
            target.set(uBounds);
        }
    }
    
    /**
     * Gets the "baseType" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STArrayBaseType.Enum getBaseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASETYPE$38);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STArrayBaseType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "baseType" attribute
     */
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STArrayBaseType xgetBaseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STArrayBaseType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STArrayBaseType)get_store().find_attribute_user(BASETYPE$38);
            return target;
        }
    }
    
    /**
     * Sets the "baseType" attribute
     */
    public void setBaseType(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STArrayBaseType.Enum baseType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASETYPE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASETYPE$38);
            }
            target.setEnumValue(baseType);
        }
    }
    
    /**
     * Sets (as xml) the "baseType" attribute
     */
    public void xsetBaseType(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STArrayBaseType baseType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STArrayBaseType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STArrayBaseType)get_store().find_attribute_user(BASETYPE$38);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STArrayBaseType)get_store().add_attribute_user(BASETYPE$38);
            }
            target.set(baseType);
        }
    }
}
