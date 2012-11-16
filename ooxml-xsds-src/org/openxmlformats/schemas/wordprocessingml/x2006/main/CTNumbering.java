/*
 * XML Type:  CT_Numbering
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main;


/**
 * An XML CT_Numbering(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTNumbering extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTNumbering.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctnumberingfdf9type");
    
    /**
     * Gets a List of "numPicBullet" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet> getNumPicBulletList();
    
    /**
     * Gets array of all "numPicBullet" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet[] getNumPicBulletArray();
    
    /**
     * Gets ith "numPicBullet" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet getNumPicBulletArray(int i);
    
    /**
     * Returns number of "numPicBullet" element
     */
    int sizeOfNumPicBulletArray();
    
    /**
     * Sets array of all "numPicBullet" element
     */
    void setNumPicBulletArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet[] numPicBulletArray);
    
    /**
     * Sets ith "numPicBullet" element
     */
    void setNumPicBulletArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet numPicBullet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "numPicBullet" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet insertNewNumPicBullet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "numPicBullet" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet addNewNumPicBullet();
    
    /**
     * Removes the ith "numPicBullet" element
     */
    void removeNumPicBullet(int i);
    
    /**
     * Gets a List of "abstractNum" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum> getAbstractNumList();
    
    /**
     * Gets array of all "abstractNum" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum[] getAbstractNumArray();
    
    /**
     * Gets ith "abstractNum" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum getAbstractNumArray(int i);
    
    /**
     * Returns number of "abstractNum" element
     */
    int sizeOfAbstractNumArray();
    
    /**
     * Sets array of all "abstractNum" element
     */
    void setAbstractNumArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum[] abstractNumArray);
    
    /**
     * Sets ith "abstractNum" element
     */
    void setAbstractNumArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum abstractNum);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "abstractNum" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum insertNewAbstractNum(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "abstractNum" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum addNewAbstractNum();
    
    /**
     * Removes the ith "abstractNum" element
     */
    void removeAbstractNum(int i);
    
    /**
     * Gets a List of "num" elements
     */
    java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum> getNumList();
    
    /**
     * Gets array of all "num" elements
     * @deprecated
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum[] getNumArray();
    
    /**
     * Gets ith "num" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum getNumArray(int i);
    
    /**
     * Returns number of "num" element
     */
    int sizeOfNumArray();
    
    /**
     * Sets array of all "num" element
     */
    void setNumArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum[] numArray);
    
    /**
     * Sets ith "num" element
     */
    void setNumArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum num);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "num" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum insertNewNum(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "num" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum addNewNum();
    
    /**
     * Removes the ith "num" element
     */
    void removeNum(int i);
    
    /**
     * Gets the "numIdMacAtCleanup" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getNumIdMacAtCleanup();
    
    /**
     * True if has "numIdMacAtCleanup" element
     */
    boolean isSetNumIdMacAtCleanup();
    
    /**
     * Sets the "numIdMacAtCleanup" element
     */
    void setNumIdMacAtCleanup(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber numIdMacAtCleanup);
    
    /**
     * Appends and returns a new empty "numIdMacAtCleanup" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewNumIdMacAtCleanup();
    
    /**
     * Unsets the "numIdMacAtCleanup" element
     */
    void unsetNumIdMacAtCleanup();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
