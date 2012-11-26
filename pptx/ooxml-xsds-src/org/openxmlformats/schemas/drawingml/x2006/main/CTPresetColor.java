/*
 * XML Type:  CT_PresetColor
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML CT_PresetColor(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPresetColor extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPresetColor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpresetcolora675type");
    
    /**
     * Gets a List of "tint" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage> getTintList();
    
    /**
     * Gets array of all "tint" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage[] getTintArray();
    
    /**
     * Gets ith "tint" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage getTintArray(int i);
    
    /**
     * Returns number of "tint" element
     */
    int sizeOfTintArray();
    
    /**
     * Sets array of all "tint" element
     */
    void setTintArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage[] tintArray);
    
    /**
     * Sets ith "tint" element
     */
    void setTintArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage tint);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tint" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage insertNewTint(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tint" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage addNewTint();
    
    /**
     * Removes the ith "tint" element
     */
    void removeTint(int i);
    
    /**
     * Gets a List of "shade" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage> getShadeList();
    
    /**
     * Gets array of all "shade" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage[] getShadeArray();
    
    /**
     * Gets ith "shade" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage getShadeArray(int i);
    
    /**
     * Returns number of "shade" element
     */
    int sizeOfShadeArray();
    
    /**
     * Sets array of all "shade" element
     */
    void setShadeArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage[] shadeArray);
    
    /**
     * Sets ith "shade" element
     */
    void setShadeArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage shade);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "shade" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage insertNewShade(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "shade" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage addNewShade();
    
    /**
     * Removes the ith "shade" element
     */
    void removeShade(int i);
    
    /**
     * Gets a List of "comp" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform> getCompList();
    
    /**
     * Gets array of all "comp" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform[] getCompArray();
    
    /**
     * Gets ith "comp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform getCompArray(int i);
    
    /**
     * Returns number of "comp" element
     */
    int sizeOfCompArray();
    
    /**
     * Sets array of all "comp" element
     */
    void setCompArray(org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform[] compArray);
    
    /**
     * Sets ith "comp" element
     */
    void setCompArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform comp);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "comp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform insertNewComp(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "comp" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform addNewComp();
    
    /**
     * Removes the ith "comp" element
     */
    void removeComp(int i);
    
    /**
     * Gets a List of "inv" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform> getInvList();
    
    /**
     * Gets array of all "inv" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform[] getInvArray();
    
    /**
     * Gets ith "inv" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform getInvArray(int i);
    
    /**
     * Returns number of "inv" element
     */
    int sizeOfInvArray();
    
    /**
     * Sets array of all "inv" element
     */
    void setInvArray(org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform[] invArray);
    
    /**
     * Sets ith "inv" element
     */
    void setInvArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform inv);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "inv" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform insertNewInv(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "inv" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform addNewInv();
    
    /**
     * Removes the ith "inv" element
     */
    void removeInv(int i);
    
    /**
     * Gets a List of "gray" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform> getGrayList();
    
    /**
     * Gets array of all "gray" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform[] getGrayArray();
    
    /**
     * Gets ith "gray" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform getGrayArray(int i);
    
    /**
     * Returns number of "gray" element
     */
    int sizeOfGrayArray();
    
    /**
     * Sets array of all "gray" element
     */
    void setGrayArray(org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform[] grayArray);
    
    /**
     * Sets ith "gray" element
     */
    void setGrayArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform gray);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gray" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform insertNewGray(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gray" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform addNewGray();
    
    /**
     * Removes the ith "gray" element
     */
    void removeGray(int i);
    
    /**
     * Gets a List of "alpha" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage> getAlphaList();
    
    /**
     * Gets array of all "alpha" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage[] getAlphaArray();
    
    /**
     * Gets ith "alpha" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage getAlphaArray(int i);
    
    /**
     * Returns number of "alpha" element
     */
    int sizeOfAlphaArray();
    
    /**
     * Sets array of all "alpha" element
     */
    void setAlphaArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage[] alphaArray);
    
    /**
     * Sets ith "alpha" element
     */
    void setAlphaArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage alpha);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alpha" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage insertNewAlpha(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alpha" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage addNewAlpha();
    
    /**
     * Removes the ith "alpha" element
     */
    void removeAlpha(int i);
    
    /**
     * Gets a List of "alphaOff" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage> getAlphaOffList();
    
    /**
     * Gets array of all "alphaOff" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage[] getAlphaOffArray();
    
    /**
     * Gets ith "alphaOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage getAlphaOffArray(int i);
    
    /**
     * Returns number of "alphaOff" element
     */
    int sizeOfAlphaOffArray();
    
    /**
     * Sets array of all "alphaOff" element
     */
    void setAlphaOffArray(org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage[] alphaOffArray);
    
    /**
     * Sets ith "alphaOff" element
     */
    void setAlphaOffArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage alphaOff);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alphaOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage insertNewAlphaOff(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alphaOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage addNewAlphaOff();
    
    /**
     * Removes the ith "alphaOff" element
     */
    void removeAlphaOff(int i);
    
    /**
     * Gets a List of "alphaMod" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage> getAlphaModList();
    
    /**
     * Gets array of all "alphaMod" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage[] getAlphaModArray();
    
    /**
     * Gets ith "alphaMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage getAlphaModArray(int i);
    
    /**
     * Returns number of "alphaMod" element
     */
    int sizeOfAlphaModArray();
    
    /**
     * Sets array of all "alphaMod" element
     */
    void setAlphaModArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage[] alphaModArray);
    
    /**
     * Sets ith "alphaMod" element
     */
    void setAlphaModArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage alphaMod);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alphaMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage insertNewAlphaMod(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alphaMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage addNewAlphaMod();
    
    /**
     * Removes the ith "alphaMod" element
     */
    void removeAlphaMod(int i);
    
    /**
     * Gets a List of "hue" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle> getHueList();
    
    /**
     * Gets array of all "hue" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle[] getHueArray();
    
    /**
     * Gets ith "hue" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle getHueArray(int i);
    
    /**
     * Returns number of "hue" element
     */
    int sizeOfHueArray();
    
    /**
     * Sets array of all "hue" element
     */
    void setHueArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle[] hueArray);
    
    /**
     * Sets ith "hue" element
     */
    void setHueArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle hue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hue" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle insertNewHue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hue" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle addNewHue();
    
    /**
     * Removes the ith "hue" element
     */
    void removeHue(int i);
    
    /**
     * Gets a List of "hueOff" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTAngle> getHueOffList();
    
    /**
     * Gets array of all "hueOff" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAngle[] getHueOffArray();
    
    /**
     * Gets ith "hueOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAngle getHueOffArray(int i);
    
    /**
     * Returns number of "hueOff" element
     */
    int sizeOfHueOffArray();
    
    /**
     * Sets array of all "hueOff" element
     */
    void setHueOffArray(org.openxmlformats.schemas.drawingml.x2006.main.CTAngle[] hueOffArray);
    
    /**
     * Sets ith "hueOff" element
     */
    void setHueOffArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTAngle hueOff);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hueOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAngle insertNewHueOff(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hueOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTAngle addNewHueOff();
    
    /**
     * Removes the ith "hueOff" element
     */
    void removeHueOff(int i);
    
    /**
     * Gets a List of "hueMod" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage> getHueModList();
    
    /**
     * Gets array of all "hueMod" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage[] getHueModArray();
    
    /**
     * Gets ith "hueMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage getHueModArray(int i);
    
    /**
     * Returns number of "hueMod" element
     */
    int sizeOfHueModArray();
    
    /**
     * Sets array of all "hueMod" element
     */
    void setHueModArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage[] hueModArray);
    
    /**
     * Sets ith "hueMod" element
     */
    void setHueModArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage hueMod);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hueMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage insertNewHueMod(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hueMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage addNewHueMod();
    
    /**
     * Removes the ith "hueMod" element
     */
    void removeHueMod(int i);
    
    /**
     * Gets a List of "sat" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getSatList();
    
    /**
     * Gets array of all "sat" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getSatArray();
    
    /**
     * Gets ith "sat" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getSatArray(int i);
    
    /**
     * Returns number of "sat" element
     */
    int sizeOfSatArray();
    
    /**
     * Sets array of all "sat" element
     */
    void setSatArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] satArray);
    
    /**
     * Sets ith "sat" element
     */
    void setSatArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage sat);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sat" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewSat(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sat" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewSat();
    
    /**
     * Removes the ith "sat" element
     */
    void removeSat(int i);
    
    /**
     * Gets a List of "satOff" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getSatOffList();
    
    /**
     * Gets array of all "satOff" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getSatOffArray();
    
    /**
     * Gets ith "satOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getSatOffArray(int i);
    
    /**
     * Returns number of "satOff" element
     */
    int sizeOfSatOffArray();
    
    /**
     * Sets array of all "satOff" element
     */
    void setSatOffArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] satOffArray);
    
    /**
     * Sets ith "satOff" element
     */
    void setSatOffArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage satOff);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "satOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewSatOff(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "satOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewSatOff();
    
    /**
     * Removes the ith "satOff" element
     */
    void removeSatOff(int i);
    
    /**
     * Gets a List of "satMod" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getSatModList();
    
    /**
     * Gets array of all "satMod" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getSatModArray();
    
    /**
     * Gets ith "satMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getSatModArray(int i);
    
    /**
     * Returns number of "satMod" element
     */
    int sizeOfSatModArray();
    
    /**
     * Sets array of all "satMod" element
     */
    void setSatModArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] satModArray);
    
    /**
     * Sets ith "satMod" element
     */
    void setSatModArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage satMod);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "satMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewSatMod(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "satMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewSatMod();
    
    /**
     * Removes the ith "satMod" element
     */
    void removeSatMod(int i);
    
    /**
     * Gets a List of "lum" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getLumList();
    
    /**
     * Gets array of all "lum" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getLumArray();
    
    /**
     * Gets ith "lum" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getLumArray(int i);
    
    /**
     * Returns number of "lum" element
     */
    int sizeOfLumArray();
    
    /**
     * Sets array of all "lum" element
     */
    void setLumArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] lumArray);
    
    /**
     * Sets ith "lum" element
     */
    void setLumArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage lum);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lum" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewLum(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lum" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewLum();
    
    /**
     * Removes the ith "lum" element
     */
    void removeLum(int i);
    
    /**
     * Gets a List of "lumOff" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getLumOffList();
    
    /**
     * Gets array of all "lumOff" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getLumOffArray();
    
    /**
     * Gets ith "lumOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getLumOffArray(int i);
    
    /**
     * Returns number of "lumOff" element
     */
    int sizeOfLumOffArray();
    
    /**
     * Sets array of all "lumOff" element
     */
    void setLumOffArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] lumOffArray);
    
    /**
     * Sets ith "lumOff" element
     */
    void setLumOffArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage lumOff);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lumOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewLumOff(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lumOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewLumOff();
    
    /**
     * Removes the ith "lumOff" element
     */
    void removeLumOff(int i);
    
    /**
     * Gets a List of "lumMod" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getLumModList();
    
    /**
     * Gets array of all "lumMod" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getLumModArray();
    
    /**
     * Gets ith "lumMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getLumModArray(int i);
    
    /**
     * Returns number of "lumMod" element
     */
    int sizeOfLumModArray();
    
    /**
     * Sets array of all "lumMod" element
     */
    void setLumModArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] lumModArray);
    
    /**
     * Sets ith "lumMod" element
     */
    void setLumModArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage lumMod);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lumMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewLumMod(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lumMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewLumMod();
    
    /**
     * Removes the ith "lumMod" element
     */
    void removeLumMod(int i);
    
    /**
     * Gets a List of "red" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getRedList();
    
    /**
     * Gets array of all "red" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getRedArray();
    
    /**
     * Gets ith "red" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getRedArray(int i);
    
    /**
     * Returns number of "red" element
     */
    int sizeOfRedArray();
    
    /**
     * Sets array of all "red" element
     */
    void setRedArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] redArray);
    
    /**
     * Sets ith "red" element
     */
    void setRedArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage red);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "red" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewRed(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "red" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewRed();
    
    /**
     * Removes the ith "red" element
     */
    void removeRed(int i);
    
    /**
     * Gets a List of "redOff" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getRedOffList();
    
    /**
     * Gets array of all "redOff" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getRedOffArray();
    
    /**
     * Gets ith "redOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getRedOffArray(int i);
    
    /**
     * Returns number of "redOff" element
     */
    int sizeOfRedOffArray();
    
    /**
     * Sets array of all "redOff" element
     */
    void setRedOffArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] redOffArray);
    
    /**
     * Sets ith "redOff" element
     */
    void setRedOffArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage redOff);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "redOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewRedOff(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "redOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewRedOff();
    
    /**
     * Removes the ith "redOff" element
     */
    void removeRedOff(int i);
    
    /**
     * Gets a List of "redMod" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getRedModList();
    
    /**
     * Gets array of all "redMod" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getRedModArray();
    
    /**
     * Gets ith "redMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getRedModArray(int i);
    
    /**
     * Returns number of "redMod" element
     */
    int sizeOfRedModArray();
    
    /**
     * Sets array of all "redMod" element
     */
    void setRedModArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] redModArray);
    
    /**
     * Sets ith "redMod" element
     */
    void setRedModArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage redMod);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "redMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewRedMod(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "redMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewRedMod();
    
    /**
     * Removes the ith "redMod" element
     */
    void removeRedMod(int i);
    
    /**
     * Gets a List of "green" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getGreenList();
    
    /**
     * Gets array of all "green" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getGreenArray();
    
    /**
     * Gets ith "green" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getGreenArray(int i);
    
    /**
     * Returns number of "green" element
     */
    int sizeOfGreenArray();
    
    /**
     * Sets array of all "green" element
     */
    void setGreenArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] greenArray);
    
    /**
     * Sets ith "green" element
     */
    void setGreenArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage green);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "green" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewGreen(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "green" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewGreen();
    
    /**
     * Removes the ith "green" element
     */
    void removeGreen(int i);
    
    /**
     * Gets a List of "greenOff" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getGreenOffList();
    
    /**
     * Gets array of all "greenOff" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getGreenOffArray();
    
    /**
     * Gets ith "greenOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getGreenOffArray(int i);
    
    /**
     * Returns number of "greenOff" element
     */
    int sizeOfGreenOffArray();
    
    /**
     * Sets array of all "greenOff" element
     */
    void setGreenOffArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] greenOffArray);
    
    /**
     * Sets ith "greenOff" element
     */
    void setGreenOffArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage greenOff);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "greenOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewGreenOff(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "greenOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewGreenOff();
    
    /**
     * Removes the ith "greenOff" element
     */
    void removeGreenOff(int i);
    
    /**
     * Gets a List of "greenMod" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getGreenModList();
    
    /**
     * Gets array of all "greenMod" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getGreenModArray();
    
    /**
     * Gets ith "greenMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getGreenModArray(int i);
    
    /**
     * Returns number of "greenMod" element
     */
    int sizeOfGreenModArray();
    
    /**
     * Sets array of all "greenMod" element
     */
    void setGreenModArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] greenModArray);
    
    /**
     * Sets ith "greenMod" element
     */
    void setGreenModArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage greenMod);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "greenMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewGreenMod(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "greenMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewGreenMod();
    
    /**
     * Removes the ith "greenMod" element
     */
    void removeGreenMod(int i);
    
    /**
     * Gets a List of "blue" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getBlueList();
    
    /**
     * Gets array of all "blue" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getBlueArray();
    
    /**
     * Gets ith "blue" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getBlueArray(int i);
    
    /**
     * Returns number of "blue" element
     */
    int sizeOfBlueArray();
    
    /**
     * Sets array of all "blue" element
     */
    void setBlueArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] blueArray);
    
    /**
     * Sets ith "blue" element
     */
    void setBlueArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage blue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "blue" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewBlue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "blue" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewBlue();
    
    /**
     * Removes the ith "blue" element
     */
    void removeBlue(int i);
    
    /**
     * Gets a List of "blueOff" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getBlueOffList();
    
    /**
     * Gets array of all "blueOff" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getBlueOffArray();
    
    /**
     * Gets ith "blueOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getBlueOffArray(int i);
    
    /**
     * Returns number of "blueOff" element
     */
    int sizeOfBlueOffArray();
    
    /**
     * Sets array of all "blueOff" element
     */
    void setBlueOffArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] blueOffArray);
    
    /**
     * Sets ith "blueOff" element
     */
    void setBlueOffArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage blueOff);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "blueOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewBlueOff(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "blueOff" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewBlueOff();
    
    /**
     * Removes the ith "blueOff" element
     */
    void removeBlueOff(int i);
    
    /**
     * Gets a List of "blueMod" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage> getBlueModList();
    
    /**
     * Gets array of all "blueMod" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] getBlueModArray();
    
    /**
     * Gets ith "blueMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage getBlueModArray(int i);
    
    /**
     * Returns number of "blueMod" element
     */
    int sizeOfBlueModArray();
    
    /**
     * Sets array of all "blueMod" element
     */
    void setBlueModArray(org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage[] blueModArray);
    
    /**
     * Sets ith "blueMod" element
     */
    void setBlueModArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage blueMod);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "blueMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage insertNewBlueMod(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "blueMod" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage addNewBlueMod();
    
    /**
     * Removes the ith "blueMod" element
     */
    void removeBlueMod(int i);
    
    /**
     * Gets a List of "gamma" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform> getGammaList();
    
    /**
     * Gets array of all "gamma" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform[] getGammaArray();
    
    /**
     * Gets ith "gamma" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform getGammaArray(int i);
    
    /**
     * Returns number of "gamma" element
     */
    int sizeOfGammaArray();
    
    /**
     * Sets array of all "gamma" element
     */
    void setGammaArray(org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform[] gammaArray);
    
    /**
     * Sets ith "gamma" element
     */
    void setGammaArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform gamma);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gamma" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform insertNewGamma(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gamma" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform addNewGamma();
    
    /**
     * Removes the ith "gamma" element
     */
    void removeGamma(int i);
    
    /**
     * Gets a List of "invGamma" elements
     */
    java.util.List<org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform> getInvGammaList();
    
    /**
     * Gets array of all "invGamma" elements
     * @deprecated
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform[] getInvGammaArray();
    
    /**
     * Gets ith "invGamma" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform getInvGammaArray(int i);
    
    /**
     * Returns number of "invGamma" element
     */
    int sizeOfInvGammaArray();
    
    /**
     * Sets array of all "invGamma" element
     */
    void setInvGammaArray(org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform[] invGammaArray);
    
    /**
     * Sets ith "invGamma" element
     */
    void setInvGammaArray(int i, org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform invGamma);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "invGamma" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform insertNewInvGamma(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "invGamma" element
     */
    org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform addNewInvGamma();
    
    /**
     * Removes the ith "invGamma" element
     */
    void removeInvGamma(int i);
    
    /**
     * Gets the "val" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPresetColorVal.Enum getVal();
    
    /**
     * Gets (as xml) the "val" attribute
     */
    org.openxmlformats.schemas.drawingml.x2006.main.STPresetColorVal xgetVal();
    
    /**
     * True if has "val" attribute
     */
    boolean isSetVal();
    
    /**
     * Sets the "val" attribute
     */
    void setVal(org.openxmlformats.schemas.drawingml.x2006.main.STPresetColorVal.Enum val);
    
    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(org.openxmlformats.schemas.drawingml.x2006.main.STPresetColorVal val);
    
    /**
     * Unsets the "val" attribute
     */
    void unsetVal();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
