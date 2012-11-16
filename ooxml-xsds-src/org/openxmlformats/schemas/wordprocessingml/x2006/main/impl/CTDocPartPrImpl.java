/*
 * XML Type:  CT_DocPartPr
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_DocPartPr(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDocPartPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartPr
{
    
    public CTDocPartPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "name");
    private static final javax.xml.namespace.QName STYLE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "style");
    private static final javax.xml.namespace.QName CATEGORY$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "category");
    private static final javax.xml.namespace.QName TYPES$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "types");
    private static final javax.xml.namespace.QName BEHAVIORS$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "behaviors");
    private static final javax.xml.namespace.QName DESCRIPTION$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "description");
    private static final javax.xml.namespace.QName GUID$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "guid");
    
    
    /**
     * Gets a List of "name" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName> getNameList()
    {
        final class NameList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName get(int i)
                { return CTDocPartPrImpl.this.getNameArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName old = CTDocPartPrImpl.this.getNameArray(i);
                CTDocPartPrImpl.this.setNameArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName o)
                { CTDocPartPrImpl.this.insertNewName(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName old = CTDocPartPrImpl.this.getNameArray(i);
                CTDocPartPrImpl.this.removeName(i);
                return old;
            }
            
            public int size()
                { return CTDocPartPrImpl.this.sizeOfNameArray(); }
            
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
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAME$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "name" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName getNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName)get_store().find_element_user(NAME$0, i);
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
    public void setNameArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName[] nameArray)
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
    public void setNameArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName)get_store().find_element_user(NAME$0, i);
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
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName insertNewName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName)get_store().insert_element_user(NAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartName)get_store().add_element_user(NAME$0);
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
     * Gets a List of "style" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString> getStyleList()
    {
        final class StyleList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString get(int i)
                { return CTDocPartPrImpl.this.getStyleArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString old = CTDocPartPrImpl.this.getStyleArray(i);
                CTDocPartPrImpl.this.setStyleArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString o)
                { CTDocPartPrImpl.this.insertNewStyle(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString old = CTDocPartPrImpl.this.getStyleArray(i);
                CTDocPartPrImpl.this.removeStyle(i);
                return old;
            }
            
            public int size()
                { return CTDocPartPrImpl.this.sizeOfStyleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new StyleList();
        }
    }
    
    /**
     * Gets array of all "style" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] getStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STYLE$2, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "style" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getStyleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(STYLE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "style" element
     */
    public int sizeOfStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLE$2);
        }
    }
    
    /**
     * Sets array of all "style" element
     */
    public void setStyleArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] styleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(styleArray, STYLE$2);
        }
    }
    
    /**
     * Sets ith "style" element
     */
    public void setStyleArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(STYLE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(style);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "style" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString insertNewStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().insert_element_user(STYLE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "style" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(STYLE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "style" element
     */
    public void removeStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLE$2, i);
        }
    }
    
    /**
     * Gets a List of "category" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory> getCategoryList()
    {
        final class CategoryList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory get(int i)
                { return CTDocPartPrImpl.this.getCategoryArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory old = CTDocPartPrImpl.this.getCategoryArray(i);
                CTDocPartPrImpl.this.setCategoryArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory o)
                { CTDocPartPrImpl.this.insertNewCategory(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory old = CTDocPartPrImpl.this.getCategoryArray(i);
                CTDocPartPrImpl.this.removeCategory(i);
                return old;
            }
            
            public int size()
                { return CTDocPartPrImpl.this.sizeOfCategoryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CategoryList();
        }
    }
    
    /**
     * Gets array of all "category" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory[] getCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORY$4, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "category" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory getCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory)get_store().find_element_user(CATEGORY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "category" element
     */
    public int sizeOfCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$4);
        }
    }
    
    /**
     * Sets array of all "category" element
     */
    public void setCategoryArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory[] categoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryArray, CATEGORY$4);
        }
    }
    
    /**
     * Sets ith "category" element
     */
    public void setCategoryArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory)get_store().find_element_user(CATEGORY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(category);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "category" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory insertNewCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory)get_store().insert_element_user(CATEGORY$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "category" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartCategory)get_store().add_element_user(CATEGORY$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "category" element
     */
    public void removeCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$4, i);
        }
    }
    
    /**
     * Gets a List of "types" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes> getTypesList()
    {
        final class TypesList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes get(int i)
                { return CTDocPartPrImpl.this.getTypesArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes old = CTDocPartPrImpl.this.getTypesArray(i);
                CTDocPartPrImpl.this.setTypesArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes o)
                { CTDocPartPrImpl.this.insertNewTypes(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes old = CTDocPartPrImpl.this.getTypesArray(i);
                CTDocPartPrImpl.this.removeTypes(i);
                return old;
            }
            
            public int size()
                { return CTDocPartPrImpl.this.sizeOfTypesArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TypesList();
        }
    }
    
    /**
     * Gets array of all "types" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes[] getTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TYPES$6, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "types" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes getTypesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes)get_store().find_element_user(TYPES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "types" element
     */
    public int sizeOfTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPES$6);
        }
    }
    
    /**
     * Sets array of all "types" element
     */
    public void setTypesArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes[] typesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(typesArray, TYPES$6);
        }
    }
    
    /**
     * Sets ith "types" element
     */
    public void setTypesArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes types)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes)get_store().find_element_user(TYPES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(types);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "types" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes insertNewTypes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes)get_store().insert_element_user(TYPES$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "types" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes addNewTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartTypes)get_store().add_element_user(TYPES$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "types" element
     */
    public void removeTypes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPES$6, i);
        }
    }
    
    /**
     * Gets a List of "behaviors" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors> getBehaviorsList()
    {
        final class BehaviorsList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors get(int i)
                { return CTDocPartPrImpl.this.getBehaviorsArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors old = CTDocPartPrImpl.this.getBehaviorsArray(i);
                CTDocPartPrImpl.this.setBehaviorsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors o)
                { CTDocPartPrImpl.this.insertNewBehaviors(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors old = CTDocPartPrImpl.this.getBehaviorsArray(i);
                CTDocPartPrImpl.this.removeBehaviors(i);
                return old;
            }
            
            public int size()
                { return CTDocPartPrImpl.this.sizeOfBehaviorsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BehaviorsList();
        }
    }
    
    /**
     * Gets array of all "behaviors" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors[] getBehaviorsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BEHAVIORS$8, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "behaviors" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors getBehaviorsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors)get_store().find_element_user(BEHAVIORS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "behaviors" element
     */
    public int sizeOfBehaviorsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEHAVIORS$8);
        }
    }
    
    /**
     * Sets array of all "behaviors" element
     */
    public void setBehaviorsArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors[] behaviorsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(behaviorsArray, BEHAVIORS$8);
        }
    }
    
    /**
     * Sets ith "behaviors" element
     */
    public void setBehaviorsArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors behaviors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors)get_store().find_element_user(BEHAVIORS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(behaviors);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "behaviors" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors insertNewBehaviors(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors)get_store().insert_element_user(BEHAVIORS$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "behaviors" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors addNewBehaviors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocPartBehaviors)get_store().add_element_user(BEHAVIORS$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "behaviors" element
     */
    public void removeBehaviors(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEHAVIORS$8, i);
        }
    }
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString get(int i)
                { return CTDocPartPrImpl.this.getDescriptionArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString old = CTDocPartPrImpl.this.getDescriptionArray(i);
                CTDocPartPrImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString o)
                { CTDocPartPrImpl.this.insertNewDescription(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString old = CTDocPartPrImpl.this.getDescriptionArray(i);
                CTDocPartPrImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return CTDocPartPrImpl.this.sizeOfDescriptionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DescriptionList();
        }
    }
    
    /**
     * Gets array of all "description" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESCRIPTION$10, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "description" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(DESCRIPTION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "description" element
     */
    public int sizeOfDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$10);
        }
    }
    
    /**
     * Sets array of all "description" element
     */
    public void setDescriptionArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] descriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$10);
        }
    }
    
    /**
     * Sets ith "description" element
     */
    public void setDescriptionArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(DESCRIPTION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(description);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().insert_element_user(DESCRIPTION$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(DESCRIPTION$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "description" element
     */
    public void removeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$10, i);
        }
    }
    
    /**
     * Gets a List of "guid" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid> getGuidList()
    {
        final class GuidList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid get(int i)
                { return CTDocPartPrImpl.this.getGuidArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid old = CTDocPartPrImpl.this.getGuidArray(i);
                CTDocPartPrImpl.this.setGuidArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid o)
                { CTDocPartPrImpl.this.insertNewGuid(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid old = CTDocPartPrImpl.this.getGuidArray(i);
                CTDocPartPrImpl.this.removeGuid(i);
                return old;
            }
            
            public int size()
                { return CTDocPartPrImpl.this.sizeOfGuidArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GuidList();
        }
    }
    
    /**
     * Gets array of all "guid" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid[] getGuidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GUID$12, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "guid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid getGuidArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid)get_store().find_element_user(GUID$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "guid" element
     */
    public int sizeOfGuidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GUID$12);
        }
    }
    
    /**
     * Sets array of all "guid" element
     */
    public void setGuidArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid[] guidArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(guidArray, GUID$12);
        }
    }
    
    /**
     * Sets ith "guid" element
     */
    public void setGuidArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid guid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid)get_store().find_element_user(GUID$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(guid);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "guid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid insertNewGuid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid)get_store().insert_element_user(GUID$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "guid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid addNewGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTGuid)get_store().add_element_user(GUID$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "guid" element
     */
    public void removeGuid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GUID$12, i);
        }
    }
}
