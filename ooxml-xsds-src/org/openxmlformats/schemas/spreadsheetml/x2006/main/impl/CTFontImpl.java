/*
 * XML Type:  CT_Font
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Font(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFontImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont
{
    
    public CTFontImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "name");
    private static final javax.xml.namespace.QName CHARSET$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "charset");
    private static final javax.xml.namespace.QName FAMILY$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "family");
    private static final javax.xml.namespace.QName B$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "b");
    private static final javax.xml.namespace.QName I$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "i");
    private static final javax.xml.namespace.QName STRIKE$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "strike");
    private static final javax.xml.namespace.QName OUTLINE$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "outline");
    private static final javax.xml.namespace.QName SHADOW$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "shadow");
    private static final javax.xml.namespace.QName CONDENSE$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "condense");
    private static final javax.xml.namespace.QName EXTEND$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extend");
    private static final javax.xml.namespace.QName COLOR$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "color");
    private static final javax.xml.namespace.QName SZ$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sz");
    private static final javax.xml.namespace.QName U$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "u");
    private static final javax.xml.namespace.QName VERTALIGN$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "vertAlign");
    private static final javax.xml.namespace.QName SCHEME$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "scheme");
    
    
    /**
     * Gets a List of "name" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName> getNameList()
    {
        final class NameList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName get(int i)
                { return CTFontImpl.this.getNameArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName old = CTFontImpl.this.getNameArray(i);
                CTFontImpl.this.setNameArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName o)
                { CTFontImpl.this.insertNewName(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName old = CTFontImpl.this.getNameArray(i);
                CTFontImpl.this.removeName(i);
                return old;
            }
            
            public int size()
                { return CTFontImpl.this.sizeOfNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NameList();
        }
    }
    
    /**
     * Gets array of all "name" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAME$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "name" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName getNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName)get_store().find_element_user(NAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "name" element
     */
    public int sizeOfNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0);
        }
    }
    
    /**
     * Sets array of all "name" element
     */
    public void setNameArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName[] nameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nameArray, NAME$0);
        }
    }
    
    /**
     * Sets ith "name" element
     */
    public void setNameArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName)get_store().find_element_user(NAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(name);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName insertNewName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName)get_store().insert_element_user(NAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontName)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "name" element
     */
    public void removeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, i);
        }
    }
    
    /**
     * Gets a List of "charset" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty> getCharsetList()
    {
        final class CharsetList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty get(int i)
                { return CTFontImpl.this.getCharsetArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty old = CTFontImpl.this.getCharsetArray(i);
                CTFontImpl.this.setCharsetArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty o)
                { CTFontImpl.this.insertNewCharset(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty old = CTFontImpl.this.getCharsetArray(i);
                CTFontImpl.this.removeCharset(i);
                return old;
            }
            
            public int size()
                { return CTFontImpl.this.sizeOfCharsetArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CharsetList();
        }
    }
    
    /**
     * Gets array of all "charset" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty[] getCharsetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHARSET$2, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "charset" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty getCharsetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty)get_store().find_element_user(CHARSET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "charset" element
     */
    public int sizeOfCharsetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARSET$2);
        }
    }
    
    /**
     * Sets array of all "charset" element
     */
    public void setCharsetArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty[] charsetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(charsetArray, CHARSET$2);
        }
    }
    
    /**
     * Sets ith "charset" element
     */
    public void setCharsetArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty charset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty)get_store().find_element_user(CHARSET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(charset);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "charset" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty insertNewCharset(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty)get_store().insert_element_user(CHARSET$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "charset" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty addNewCharset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty)get_store().add_element_user(CHARSET$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "charset" element
     */
    public void removeCharset(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARSET$2, i);
        }
    }
    
    /**
     * Gets a List of "family" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty> getFamilyList()
    {
        final class FamilyList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty get(int i)
                { return CTFontImpl.this.getFamilyArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty old = CTFontImpl.this.getFamilyArray(i);
                CTFontImpl.this.setFamilyArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty o)
                { CTFontImpl.this.insertNewFamily(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty old = CTFontImpl.this.getFamilyArray(i);
                CTFontImpl.this.removeFamily(i);
                return old;
            }
            
            public int size()
                { return CTFontImpl.this.sizeOfFamilyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FamilyList();
        }
    }
    
    /**
     * Gets array of all "family" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty[] getFamilyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FAMILY$4, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "family" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty getFamilyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty)get_store().find_element_user(FAMILY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "family" element
     */
    public int sizeOfFamilyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAMILY$4);
        }
    }
    
    /**
     * Sets array of all "family" element
     */
    public void setFamilyArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty[] familyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(familyArray, FAMILY$4);
        }
    }
    
    /**
     * Sets ith "family" element
     */
    public void setFamilyArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty family)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty)get_store().find_element_user(FAMILY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(family);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "family" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty insertNewFamily(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty)get_store().insert_element_user(FAMILY$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "family" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty addNewFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIntProperty)get_store().add_element_user(FAMILY$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "family" element
     */
    public void removeFamily(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAMILY$4, i);
        }
    }
    
    /**
     * Gets a List of "b" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty> getBList()
    {
        final class BList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty get(int i)
                { return CTFontImpl.this.getBArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty old = CTFontImpl.this.getBArray(i);
                CTFontImpl.this.setBArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty o)
                { CTFontImpl.this.insertNewB(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty old = CTFontImpl.this.getBArray(i);
                CTFontImpl.this.removeB(i);
                return old;
            }
            
            public int size()
                { return CTFontImpl.this.sizeOfBArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BList();
        }
    }
    
    /**
     * Gets array of all "b" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] getBArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(B$6, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "b" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getBArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(B$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "b" element
     */
    public int sizeOfBArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(B$6);
        }
    }
    
    /**
     * Sets array of all "b" element
     */
    public void setBArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] bArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bArray, B$6);
        }
    }
    
    /**
     * Sets ith "b" element
     */
    public void setBArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty b)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(B$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(b);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "b" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty insertNewB(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().insert_element_user(B$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "b" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().add_element_user(B$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "b" element
     */
    public void removeB(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(B$6, i);
        }
    }
    
    /**
     * Gets a List of "i" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty> getIList()
    {
        final class IList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty get(int i)
                { return CTFontImpl.this.getIArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty old = CTFontImpl.this.getIArray(i);
                CTFontImpl.this.setIArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty o)
                { CTFontImpl.this.insertNewI(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty old = CTFontImpl.this.getIArray(i);
                CTFontImpl.this.removeI(i);
                return old;
            }
            
            public int size()
                { return CTFontImpl.this.sizeOfIArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IList();
        }
    }
    
    /**
     * Gets array of all "i" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] getIArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(I$8, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "i" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getIArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(I$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "i" element
     */
    public int sizeOfIArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(I$8);
        }
    }
    
    /**
     * Sets array of all "i" element
     */
    public void setIArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] iValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(iValueArray, I$8);
        }
    }
    
    /**
     * Sets ith "i" element
     */
    public void setIArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty iValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(I$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(iValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "i" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty insertNewI(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().insert_element_user(I$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "i" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().add_element_user(I$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "i" element
     */
    public void removeI(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(I$8, i);
        }
    }
    
    /**
     * Gets a List of "strike" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty> getStrikeList()
    {
        final class StrikeList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty get(int i)
                { return CTFontImpl.this.getStrikeArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty old = CTFontImpl.this.getStrikeArray(i);
                CTFontImpl.this.setStrikeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty o)
                { CTFontImpl.this.insertNewStrike(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty old = CTFontImpl.this.getStrikeArray(i);
                CTFontImpl.this.removeStrike(i);
                return old;
            }
            
            public int size()
                { return CTFontImpl.this.sizeOfStrikeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new StrikeList();
        }
    }
    
    /**
     * Gets array of all "strike" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] getStrikeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRIKE$10, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "strike" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getStrikeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(STRIKE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "strike" element
     */
    public int sizeOfStrikeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRIKE$10);
        }
    }
    
    /**
     * Sets array of all "strike" element
     */
    public void setStrikeArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] strikeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(strikeArray, STRIKE$10);
        }
    }
    
    /**
     * Sets ith "strike" element
     */
    public void setStrikeArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty strike)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(STRIKE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(strike);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "strike" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty insertNewStrike(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().insert_element_user(STRIKE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "strike" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewStrike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().add_element_user(STRIKE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "strike" element
     */
    public void removeStrike(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRIKE$10, i);
        }
    }
    
    /**
     * Gets a List of "outline" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty> getOutlineList()
    {
        final class OutlineList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty get(int i)
                { return CTFontImpl.this.getOutlineArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty old = CTFontImpl.this.getOutlineArray(i);
                CTFontImpl.this.setOutlineArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty o)
                { CTFontImpl.this.insertNewOutline(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty old = CTFontImpl.this.getOutlineArray(i);
                CTFontImpl.this.removeOutline(i);
                return old;
            }
            
            public int size()
                { return CTFontImpl.this.sizeOfOutlineArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OutlineList();
        }
    }
    
    /**
     * Gets array of all "outline" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] getOutlineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTLINE$12, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "outline" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getOutlineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(OUTLINE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "outline" element
     */
    public int sizeOfOutlineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTLINE$12);
        }
    }
    
    /**
     * Sets array of all "outline" element
     */
    public void setOutlineArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] outlineArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(outlineArray, OUTLINE$12);
        }
    }
    
    /**
     * Sets ith "outline" element
     */
    public void setOutlineArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty outline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(OUTLINE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(outline);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "outline" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty insertNewOutline(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().insert_element_user(OUTLINE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "outline" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewOutline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().add_element_user(OUTLINE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "outline" element
     */
    public void removeOutline(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTLINE$12, i);
        }
    }
    
    /**
     * Gets a List of "shadow" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty> getShadowList()
    {
        final class ShadowList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty get(int i)
                { return CTFontImpl.this.getShadowArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty old = CTFontImpl.this.getShadowArray(i);
                CTFontImpl.this.setShadowArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty o)
                { CTFontImpl.this.insertNewShadow(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty old = CTFontImpl.this.getShadowArray(i);
                CTFontImpl.this.removeShadow(i);
                return old;
            }
            
            public int size()
                { return CTFontImpl.this.sizeOfShadowArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ShadowList();
        }
    }
    
    /**
     * Gets array of all "shadow" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] getShadowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHADOW$14, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "shadow" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getShadowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(SHADOW$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "shadow" element
     */
    public int sizeOfShadowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHADOW$14);
        }
    }
    
    /**
     * Sets array of all "shadow" element
     */
    public void setShadowArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] shadowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(shadowArray, SHADOW$14);
        }
    }
    
    /**
     * Sets ith "shadow" element
     */
    public void setShadowArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty shadow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(SHADOW$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(shadow);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "shadow" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty insertNewShadow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().insert_element_user(SHADOW$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "shadow" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewShadow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().add_element_user(SHADOW$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "shadow" element
     */
    public void removeShadow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHADOW$14, i);
        }
    }
    
    /**
     * Gets a List of "condense" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty> getCondenseList()
    {
        final class CondenseList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty get(int i)
                { return CTFontImpl.this.getCondenseArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty old = CTFontImpl.this.getCondenseArray(i);
                CTFontImpl.this.setCondenseArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty o)
                { CTFontImpl.this.insertNewCondense(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty old = CTFontImpl.this.getCondenseArray(i);
                CTFontImpl.this.removeCondense(i);
                return old;
            }
            
            public int size()
                { return CTFontImpl.this.sizeOfCondenseArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CondenseList();
        }
    }
    
    /**
     * Gets array of all "condense" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] getCondenseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONDENSE$16, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "condense" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getCondenseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(CONDENSE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "condense" element
     */
    public int sizeOfCondenseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDENSE$16);
        }
    }
    
    /**
     * Sets array of all "condense" element
     */
    public void setCondenseArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] condenseArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(condenseArray, CONDENSE$16);
        }
    }
    
    /**
     * Sets ith "condense" element
     */
    public void setCondenseArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty condense)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(CONDENSE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(condense);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "condense" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty insertNewCondense(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().insert_element_user(CONDENSE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "condense" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewCondense()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().add_element_user(CONDENSE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "condense" element
     */
    public void removeCondense(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDENSE$16, i);
        }
    }
    
    /**
     * Gets a List of "extend" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty> getExtendList()
    {
        final class ExtendList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty get(int i)
                { return CTFontImpl.this.getExtendArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty old = CTFontImpl.this.getExtendArray(i);
                CTFontImpl.this.setExtendArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty o)
                { CTFontImpl.this.insertNewExtend(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty old = CTFontImpl.this.getExtendArray(i);
                CTFontImpl.this.removeExtend(i);
                return old;
            }
            
            public int size()
                { return CTFontImpl.this.sizeOfExtendArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ExtendList();
        }
    }
    
    /**
     * Gets array of all "extend" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] getExtendArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTEND$18, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "extend" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty getExtendArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(EXTEND$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "extend" element
     */
    public int sizeOfExtendArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTEND$18);
        }
    }
    
    /**
     * Sets array of all "extend" element
     */
    public void setExtendArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty[] extendArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(extendArray, EXTEND$18);
        }
    }
    
    /**
     * Sets ith "extend" element
     */
    public void setExtendArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty extend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().find_element_user(EXTEND$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(extend);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extend" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty insertNewExtend(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().insert_element_user(EXTEND$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extend" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty addNewExtend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBooleanProperty)get_store().add_element_user(EXTEND$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "extend" element
     */
    public void removeExtend(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTEND$18, i);
        }
    }
    
    /**
     * Gets a List of "color" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor> getColorList()
    {
        final class ColorList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor get(int i)
                { return CTFontImpl.this.getColorArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor old = CTFontImpl.this.getColorArray(i);
                CTFontImpl.this.setColorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor o)
                { CTFontImpl.this.insertNewColor(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor old = CTFontImpl.this.getColorArray(i);
                CTFontImpl.this.removeColor(i);
                return old;
            }
            
            public int size()
                { return CTFontImpl.this.sizeOfColorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ColorList();
        }
    }
    
    /**
     * Gets array of all "color" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor[] getColorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLOR$20, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "color" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor getColorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(COLOR$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "color" element
     */
    public int sizeOfColorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLOR$20);
        }
    }
    
    /**
     * Sets array of all "color" element
     */
    public void setColorArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor[] colorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colorArray, COLOR$20);
        }
    }
    
    /**
     * Sets ith "color" element
     */
    public void setColorArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor color)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().find_element_user(COLOR$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(color);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "color" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor insertNewColor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().insert_element_user(COLOR$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "color" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor addNewColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor)get_store().add_element_user(COLOR$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "color" element
     */
    public void removeColor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLOR$20, i);
        }
    }
    
    /**
     * Gets a List of "sz" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize> getSzList()
    {
        final class SzList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize get(int i)
                { return CTFontImpl.this.getSzArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize old = CTFontImpl.this.getSzArray(i);
                CTFontImpl.this.setSzArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize o)
                { CTFontImpl.this.insertNewSz(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize old = CTFontImpl.this.getSzArray(i);
                CTFontImpl.this.removeSz(i);
                return old;
            }
            
            public int size()
                { return CTFontImpl.this.sizeOfSzArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SzList();
        }
    }
    
    /**
     * Gets array of all "sz" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize[] getSzArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SZ$22, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sz" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize getSzArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize)get_store().find_element_user(SZ$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sz" element
     */
    public int sizeOfSzArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SZ$22);
        }
    }
    
    /**
     * Sets array of all "sz" element
     */
    public void setSzArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize[] szArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(szArray, SZ$22);
        }
    }
    
    /**
     * Sets ith "sz" element
     */
    public void setSzArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize sz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize)get_store().find_element_user(SZ$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sz);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sz" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize insertNewSz(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize)get_store().insert_element_user(SZ$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sz" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize addNewSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontSize)get_store().add_element_user(SZ$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "sz" element
     */
    public void removeSz(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SZ$22, i);
        }
    }
    
    /**
     * Gets a List of "u" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty> getUList()
    {
        final class UList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty get(int i)
                { return CTFontImpl.this.getUArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty old = CTFontImpl.this.getUArray(i);
                CTFontImpl.this.setUArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty o)
                { CTFontImpl.this.insertNewU(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty old = CTFontImpl.this.getUArray(i);
                CTFontImpl.this.removeU(i);
                return old;
            }
            
            public int size()
                { return CTFontImpl.this.sizeOfUArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UList();
        }
    }
    
    /**
     * Gets array of all "u" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty[] getUArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(U$24, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "u" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty getUArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty)get_store().find_element_user(U$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "u" element
     */
    public int sizeOfUArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(U$24);
        }
    }
    
    /**
     * Sets array of all "u" element
     */
    public void setUArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty[] uArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(uArray, U$24);
        }
    }
    
    /**
     * Sets ith "u" element
     */
    public void setUArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty u)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty)get_store().find_element_user(U$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(u);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "u" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty insertNewU(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty)get_store().insert_element_user(U$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "u" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty addNewU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty)get_store().add_element_user(U$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "u" element
     */
    public void removeU(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(U$24, i);
        }
    }
    
    /**
     * Gets a List of "vertAlign" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty> getVertAlignList()
    {
        final class VertAlignList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty get(int i)
                { return CTFontImpl.this.getVertAlignArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty old = CTFontImpl.this.getVertAlignArray(i);
                CTFontImpl.this.setVertAlignArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty o)
                { CTFontImpl.this.insertNewVertAlign(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty old = CTFontImpl.this.getVertAlignArray(i);
                CTFontImpl.this.removeVertAlign(i);
                return old;
            }
            
            public int size()
                { return CTFontImpl.this.sizeOfVertAlignArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new VertAlignList();
        }
    }
    
    /**
     * Gets array of all "vertAlign" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty[] getVertAlignArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VERTALIGN$26, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "vertAlign" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty getVertAlignArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty)get_store().find_element_user(VERTALIGN$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "vertAlign" element
     */
    public int sizeOfVertAlignArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERTALIGN$26);
        }
    }
    
    /**
     * Sets array of all "vertAlign" element
     */
    public void setVertAlignArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty[] vertAlignArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(vertAlignArray, VERTALIGN$26);
        }
    }
    
    /**
     * Sets ith "vertAlign" element
     */
    public void setVertAlignArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty vertAlign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty)get_store().find_element_user(VERTALIGN$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(vertAlign);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "vertAlign" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty insertNewVertAlign(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty)get_store().insert_element_user(VERTALIGN$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "vertAlign" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty addNewVertAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTVerticalAlignFontProperty)get_store().add_element_user(VERTALIGN$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "vertAlign" element
     */
    public void removeVertAlign(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERTALIGN$26, i);
        }
    }
    
    /**
     * Gets a List of "scheme" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme> getSchemeList()
    {
        final class SchemeList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme get(int i)
                { return CTFontImpl.this.getSchemeArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme old = CTFontImpl.this.getSchemeArray(i);
                CTFontImpl.this.setSchemeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme o)
                { CTFontImpl.this.insertNewScheme(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme old = CTFontImpl.this.getSchemeArray(i);
                CTFontImpl.this.removeScheme(i);
                return old;
            }
            
            public int size()
                { return CTFontImpl.this.sizeOfSchemeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SchemeList();
        }
    }
    
    /**
     * Gets array of all "scheme" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme[] getSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCHEME$28, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "scheme" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme getSchemeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme)get_store().find_element_user(SCHEME$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "scheme" element
     */
    public int sizeOfSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEME$28);
        }
    }
    
    /**
     * Sets array of all "scheme" element
     */
    public void setSchemeArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme[] schemeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(schemeArray, SCHEME$28);
        }
    }
    
    /**
     * Sets ith "scheme" element
     */
    public void setSchemeArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme scheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme)get_store().find_element_user(SCHEME$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(scheme);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "scheme" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme insertNewScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme)get_store().insert_element_user(SCHEME$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "scheme" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme addNewScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFontScheme)get_store().add_element_user(SCHEME$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "scheme" element
     */
    public void removeScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEME$28, i);
        }
    }
}
