/*
 * XML Type:  CT_TextBodyProperties
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TextBodyProperties(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTextBodyPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties
{
    
    public CTTextBodyPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRSTTXWARP$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "prstTxWarp");
    private static final javax.xml.namespace.QName NOAUTOFIT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "noAutofit");
    private static final javax.xml.namespace.QName NORMAUTOFIT$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "normAutofit");
    private static final javax.xml.namespace.QName SPAUTOFIT$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "spAutoFit");
    private static final javax.xml.namespace.QName SCENE3D$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "scene3d");
    private static final javax.xml.namespace.QName SP3D$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sp3d");
    private static final javax.xml.namespace.QName FLATTX$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "flatTx");
    private static final javax.xml.namespace.QName EXTLST$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    private static final javax.xml.namespace.QName ROT$16 = 
        new javax.xml.namespace.QName("", "rot");
    private static final javax.xml.namespace.QName SPCFIRSTLASTPARA$18 = 
        new javax.xml.namespace.QName("", "spcFirstLastPara");
    private static final javax.xml.namespace.QName VERTOVERFLOW$20 = 
        new javax.xml.namespace.QName("", "vertOverflow");
    private static final javax.xml.namespace.QName HORZOVERFLOW$22 = 
        new javax.xml.namespace.QName("", "horzOverflow");
    private static final javax.xml.namespace.QName VERT$24 = 
        new javax.xml.namespace.QName("", "vert");
    private static final javax.xml.namespace.QName WRAP$26 = 
        new javax.xml.namespace.QName("", "wrap");
    private static final javax.xml.namespace.QName LINS$28 = 
        new javax.xml.namespace.QName("", "lIns");
    private static final javax.xml.namespace.QName TINS$30 = 
        new javax.xml.namespace.QName("", "tIns");
    private static final javax.xml.namespace.QName RINS$32 = 
        new javax.xml.namespace.QName("", "rIns");
    private static final javax.xml.namespace.QName BINS$34 = 
        new javax.xml.namespace.QName("", "bIns");
    private static final javax.xml.namespace.QName NUMCOL$36 = 
        new javax.xml.namespace.QName("", "numCol");
    private static final javax.xml.namespace.QName SPCCOL$38 = 
        new javax.xml.namespace.QName("", "spcCol");
    private static final javax.xml.namespace.QName RTLCOL$40 = 
        new javax.xml.namespace.QName("", "rtlCol");
    private static final javax.xml.namespace.QName FROMWORDART$42 = 
        new javax.xml.namespace.QName("", "fromWordArt");
    private static final javax.xml.namespace.QName ANCHOR$44 = 
        new javax.xml.namespace.QName("", "anchor");
    private static final javax.xml.namespace.QName ANCHORCTR$46 = 
        new javax.xml.namespace.QName("", "anchorCtr");
    private static final javax.xml.namespace.QName FORCEAA$48 = 
        new javax.xml.namespace.QName("", "forceAA");
    private static final javax.xml.namespace.QName UPRIGHT$50 = 
        new javax.xml.namespace.QName("", "upright");
    private static final javax.xml.namespace.QName COMPATLNSPC$52 = 
        new javax.xml.namespace.QName("", "compatLnSpc");
    
    
    /**
     * Gets the "prstTxWarp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetTextShape getPrstTxWarp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetTextShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetTextShape)get_store().find_element_user(PRSTTXWARP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "prstTxWarp" element
     */
    public boolean isSetPrstTxWarp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRSTTXWARP$0) != 0;
        }
    }
    
    /**
     * Sets the "prstTxWarp" element
     */
    public void setPrstTxWarp(org.openxmlformats.schemas.drawingml.x2006.main.CTPresetTextShape prstTxWarp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetTextShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetTextShape)get_store().find_element_user(PRSTTXWARP$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetTextShape)get_store().add_element_user(PRSTTXWARP$0);
            }
            target.set(prstTxWarp);
        }
    }
    
    /**
     * Appends and returns a new empty "prstTxWarp" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPresetTextShape addNewPrstTxWarp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPresetTextShape target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPresetTextShape)get_store().add_element_user(PRSTTXWARP$0);
            return target;
        }
    }
    
    /**
     * Unsets the "prstTxWarp" element
     */
    public void unsetPrstTxWarp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRSTTXWARP$0, 0);
        }
    }
    
    /**
     * Gets the "noAutofit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoAutofit getNoAutofit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoAutofit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoAutofit)get_store().find_element_user(NOAUTOFIT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "noAutofit" element
     */
    public boolean isSetNoAutofit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOAUTOFIT$2) != 0;
        }
    }
    
    /**
     * Sets the "noAutofit" element
     */
    public void setNoAutofit(org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoAutofit noAutofit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoAutofit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoAutofit)get_store().find_element_user(NOAUTOFIT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoAutofit)get_store().add_element_user(NOAUTOFIT$2);
            }
            target.set(noAutofit);
        }
    }
    
    /**
     * Appends and returns a new empty "noAutofit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoAutofit addNewNoAutofit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoAutofit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoAutofit)get_store().add_element_user(NOAUTOFIT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "noAutofit" element
     */
    public void unsetNoAutofit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOAUTOFIT$2, 0);
        }
    }
    
    /**
     * Gets the "normAutofit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextNormalAutofit getNormAutofit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextNormalAutofit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextNormalAutofit)get_store().find_element_user(NORMAUTOFIT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "normAutofit" element
     */
    public boolean isSetNormAutofit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NORMAUTOFIT$4) != 0;
        }
    }
    
    /**
     * Sets the "normAutofit" element
     */
    public void setNormAutofit(org.openxmlformats.schemas.drawingml.x2006.main.CTTextNormalAutofit normAutofit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextNormalAutofit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextNormalAutofit)get_store().find_element_user(NORMAUTOFIT$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextNormalAutofit)get_store().add_element_user(NORMAUTOFIT$4);
            }
            target.set(normAutofit);
        }
    }
    
    /**
     * Appends and returns a new empty "normAutofit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextNormalAutofit addNewNormAutofit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextNormalAutofit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextNormalAutofit)get_store().add_element_user(NORMAUTOFIT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "normAutofit" element
     */
    public void unsetNormAutofit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NORMAUTOFIT$4, 0);
        }
    }
    
    /**
     * Gets the "spAutoFit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextShapeAutofit getSpAutoFit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextShapeAutofit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextShapeAutofit)get_store().find_element_user(SPAUTOFIT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "spAutoFit" element
     */
    public boolean isSetSpAutoFit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPAUTOFIT$6) != 0;
        }
    }
    
    /**
     * Sets the "spAutoFit" element
     */
    public void setSpAutoFit(org.openxmlformats.schemas.drawingml.x2006.main.CTTextShapeAutofit spAutoFit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextShapeAutofit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextShapeAutofit)get_store().find_element_user(SPAUTOFIT$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextShapeAutofit)get_store().add_element_user(SPAUTOFIT$6);
            }
            target.set(spAutoFit);
        }
    }
    
    /**
     * Appends and returns a new empty "spAutoFit" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextShapeAutofit addNewSpAutoFit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextShapeAutofit target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextShapeAutofit)get_store().add_element_user(SPAUTOFIT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "spAutoFit" element
     */
    public void unsetSpAutoFit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPAUTOFIT$6, 0);
        }
    }
    
    /**
     * Gets the "scene3d" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D getScene3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D)get_store().find_element_user(SCENE3D$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "scene3d" element
     */
    public boolean isSetScene3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCENE3D$8) != 0;
        }
    }
    
    /**
     * Sets the "scene3d" element
     */
    public void setScene3D(org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D scene3D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D)get_store().find_element_user(SCENE3D$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D)get_store().add_element_user(SCENE3D$8);
            }
            target.set(scene3D);
        }
    }
    
    /**
     * Appends and returns a new empty "scene3d" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D addNewScene3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D)get_store().add_element_user(SCENE3D$8);
            return target;
        }
    }
    
    /**
     * Unsets the "scene3d" element
     */
    public void unsetScene3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCENE3D$8, 0);
        }
    }
    
    /**
     * Gets the "sp3d" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D getSp3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D)get_store().find_element_user(SP3D$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sp3d" element
     */
    public boolean isSetSp3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SP3D$10) != 0;
        }
    }
    
    /**
     * Sets the "sp3d" element
     */
    public void setSp3D(org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D sp3D)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D)get_store().find_element_user(SP3D$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D)get_store().add_element_user(SP3D$10);
            }
            target.set(sp3D);
        }
    }
    
    /**
     * Appends and returns a new empty "sp3d" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D addNewSp3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D)get_store().add_element_user(SP3D$10);
            return target;
        }
    }
    
    /**
     * Unsets the "sp3d" element
     */
    public void unsetSp3D()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SP3D$10, 0);
        }
    }
    
    /**
     * Gets the "flatTx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText getFlatTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText)get_store().find_element_user(FLATTX$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "flatTx" element
     */
    public boolean isSetFlatTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLATTX$12) != 0;
        }
    }
    
    /**
     * Sets the "flatTx" element
     */
    public void setFlatTx(org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText flatTx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText)get_store().find_element_user(FLATTX$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText)get_store().add_element_user(FLATTX$12);
            }
            target.set(flatTx);
        }
    }
    
    /**
     * Appends and returns a new empty "flatTx" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText addNewFlatTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTFlatText)get_store().add_element_user(FLATTX$12);
            return target;
        }
    }
    
    /**
     * Unsets the "flatTx" element
     */
    public void unsetFlatTx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLATTX$12, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$14) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$14);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$14);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$14, 0);
        }
    }
    
    /**
     * Gets the "rot" attribute
     */
    public int getRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROT$16);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "rot" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STAngle xgetRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAngle)get_store().find_attribute_user(ROT$16);
            return target;
        }
    }
    
    /**
     * True if has "rot" attribute
     */
    public boolean isSetRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROT$16) != null;
        }
    }
    
    /**
     * Sets the "rot" attribute
     */
    public void setRot(int rot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROT$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROT$16);
            }
            target.setIntValue(rot);
        }
    }
    
    /**
     * Sets (as xml) the "rot" attribute
     */
    public void xsetRot(org.openxmlformats.schemas.drawingml.x2006.main.STAngle rot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STAngle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STAngle)get_store().find_attribute_user(ROT$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STAngle)get_store().add_attribute_user(ROT$16);
            }
            target.set(rot);
        }
    }
    
    /**
     * Unsets the "rot" attribute
     */
    public void unsetRot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROT$16);
        }
    }
    
    /**
     * Gets the "spcFirstLastPara" attribute
     */
    public boolean getSpcFirstLastPara()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPCFIRSTLASTPARA$18);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "spcFirstLastPara" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSpcFirstLastPara()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SPCFIRSTLASTPARA$18);
            return target;
        }
    }
    
    /**
     * True if has "spcFirstLastPara" attribute
     */
    public boolean isSetSpcFirstLastPara()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPCFIRSTLASTPARA$18) != null;
        }
    }
    
    /**
     * Sets the "spcFirstLastPara" attribute
     */
    public void setSpcFirstLastPara(boolean spcFirstLastPara)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPCFIRSTLASTPARA$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPCFIRSTLASTPARA$18);
            }
            target.setBooleanValue(spcFirstLastPara);
        }
    }
    
    /**
     * Sets (as xml) the "spcFirstLastPara" attribute
     */
    public void xsetSpcFirstLastPara(org.apache.xmlbeans.XmlBoolean spcFirstLastPara)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SPCFIRSTLASTPARA$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SPCFIRSTLASTPARA$18);
            }
            target.set(spcFirstLastPara);
        }
    }
    
    /**
     * Unsets the "spcFirstLastPara" attribute
     */
    public void unsetSpcFirstLastPara()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPCFIRSTLASTPARA$18);
        }
    }
    
    /**
     * Gets the "vertOverflow" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextVertOverflowType.Enum getVertOverflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTOVERFLOW$20);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STTextVertOverflowType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "vertOverflow" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextVertOverflowType xgetVertOverflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextVertOverflowType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextVertOverflowType)get_store().find_attribute_user(VERTOVERFLOW$20);
            return target;
        }
    }
    
    /**
     * True if has "vertOverflow" attribute
     */
    public boolean isSetVertOverflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERTOVERFLOW$20) != null;
        }
    }
    
    /**
     * Sets the "vertOverflow" attribute
     */
    public void setVertOverflow(org.openxmlformats.schemas.drawingml.x2006.main.STTextVertOverflowType.Enum vertOverflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERTOVERFLOW$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERTOVERFLOW$20);
            }
            target.setEnumValue(vertOverflow);
        }
    }
    
    /**
     * Sets (as xml) the "vertOverflow" attribute
     */
    public void xsetVertOverflow(org.openxmlformats.schemas.drawingml.x2006.main.STTextVertOverflowType vertOverflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextVertOverflowType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextVertOverflowType)get_store().find_attribute_user(VERTOVERFLOW$20);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextVertOverflowType)get_store().add_attribute_user(VERTOVERFLOW$20);
            }
            target.set(vertOverflow);
        }
    }
    
    /**
     * Unsets the "vertOverflow" attribute
     */
    public void unsetVertOverflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERTOVERFLOW$20);
        }
    }
    
    /**
     * Gets the "horzOverflow" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType.Enum getHorzOverflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORZOVERFLOW$22);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "horzOverflow" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType xgetHorzOverflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType)get_store().find_attribute_user(HORZOVERFLOW$22);
            return target;
        }
    }
    
    /**
     * True if has "horzOverflow" attribute
     */
    public boolean isSetHorzOverflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HORZOVERFLOW$22) != null;
        }
    }
    
    /**
     * Sets the "horzOverflow" attribute
     */
    public void setHorzOverflow(org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType.Enum horzOverflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HORZOVERFLOW$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HORZOVERFLOW$22);
            }
            target.setEnumValue(horzOverflow);
        }
    }
    
    /**
     * Sets (as xml) the "horzOverflow" attribute
     */
    public void xsetHorzOverflow(org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType horzOverflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType)get_store().find_attribute_user(HORZOVERFLOW$22);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextHorzOverflowType)get_store().add_attribute_user(HORZOVERFLOW$22);
            }
            target.set(horzOverflow);
        }
    }
    
    /**
     * Unsets the "horzOverflow" attribute
     */
    public void unsetHorzOverflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HORZOVERFLOW$22);
        }
    }
    
    /**
     * Gets the "vert" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType.Enum getVert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERT$24);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "vert" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType xgetVert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType)get_store().find_attribute_user(VERT$24);
            return target;
        }
    }
    
    /**
     * True if has "vert" attribute
     */
    public boolean isSetVert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERT$24) != null;
        }
    }
    
    /**
     * Sets the "vert" attribute
     */
    public void setVert(org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType.Enum vert)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERT$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERT$24);
            }
            target.setEnumValue(vert);
        }
    }
    
    /**
     * Sets (as xml) the "vert" attribute
     */
    public void xsetVert(org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType vert)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType)get_store().find_attribute_user(VERT$24);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType)get_store().add_attribute_user(VERT$24);
            }
            target.set(vert);
        }
    }
    
    /**
     * Unsets the "vert" attribute
     */
    public void unsetVert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERT$24);
        }
    }
    
    /**
     * Gets the "wrap" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextWrappingType.Enum getWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRAP$26);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STTextWrappingType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "wrap" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextWrappingType xgetWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextWrappingType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextWrappingType)get_store().find_attribute_user(WRAP$26);
            return target;
        }
    }
    
    /**
     * True if has "wrap" attribute
     */
    public boolean isSetWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WRAP$26) != null;
        }
    }
    
    /**
     * Sets the "wrap" attribute
     */
    public void setWrap(org.openxmlformats.schemas.drawingml.x2006.main.STTextWrappingType.Enum wrap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRAP$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WRAP$26);
            }
            target.setEnumValue(wrap);
        }
    }
    
    /**
     * Sets (as xml) the "wrap" attribute
     */
    public void xsetWrap(org.openxmlformats.schemas.drawingml.x2006.main.STTextWrappingType wrap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextWrappingType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextWrappingType)get_store().find_attribute_user(WRAP$26);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextWrappingType)get_store().add_attribute_user(WRAP$26);
            }
            target.set(wrap);
        }
    }
    
    /**
     * Unsets the "wrap" attribute
     */
    public void unsetWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WRAP$26);
        }
    }
    
    /**
     * Gets the "lIns" attribute
     */
    public int getLIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINS$28);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "lIns" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 xgetLIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(LINS$28);
            return target;
        }
    }
    
    /**
     * True if has "lIns" attribute
     */
    public boolean isSetLIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LINS$28) != null;
        }
    }
    
    /**
     * Sets the "lIns" attribute
     */
    public void setLIns(int lIns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINS$28);
            }
            target.setIntValue(lIns);
        }
    }
    
    /**
     * Sets (as xml) the "lIns" attribute
     */
    public void xsetLIns(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 lIns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(LINS$28);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().add_attribute_user(LINS$28);
            }
            target.set(lIns);
        }
    }
    
    /**
     * Unsets the "lIns" attribute
     */
    public void unsetLIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LINS$28);
        }
    }
    
    /**
     * Gets the "tIns" attribute
     */
    public int getTIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TINS$30);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "tIns" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 xgetTIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(TINS$30);
            return target;
        }
    }
    
    /**
     * True if has "tIns" attribute
     */
    public boolean isSetTIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TINS$30) != null;
        }
    }
    
    /**
     * Sets the "tIns" attribute
     */
    public void setTIns(int tIns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TINS$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TINS$30);
            }
            target.setIntValue(tIns);
        }
    }
    
    /**
     * Sets (as xml) the "tIns" attribute
     */
    public void xsetTIns(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 tIns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(TINS$30);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().add_attribute_user(TINS$30);
            }
            target.set(tIns);
        }
    }
    
    /**
     * Unsets the "tIns" attribute
     */
    public void unsetTIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TINS$30);
        }
    }
    
    /**
     * Gets the "rIns" attribute
     */
    public int getRIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RINS$32);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "rIns" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 xgetRIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(RINS$32);
            return target;
        }
    }
    
    /**
     * True if has "rIns" attribute
     */
    public boolean isSetRIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RINS$32) != null;
        }
    }
    
    /**
     * Sets the "rIns" attribute
     */
    public void setRIns(int rIns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RINS$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RINS$32);
            }
            target.setIntValue(rIns);
        }
    }
    
    /**
     * Sets (as xml) the "rIns" attribute
     */
    public void xsetRIns(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 rIns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(RINS$32);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().add_attribute_user(RINS$32);
            }
            target.set(rIns);
        }
    }
    
    /**
     * Unsets the "rIns" attribute
     */
    public void unsetRIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RINS$32);
        }
    }
    
    /**
     * Gets the "bIns" attribute
     */
    public int getBIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BINS$34);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "bIns" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 xgetBIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(BINS$34);
            return target;
        }
    }
    
    /**
     * True if has "bIns" attribute
     */
    public boolean isSetBIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BINS$34) != null;
        }
    }
    
    /**
     * Sets the "bIns" attribute
     */
    public void setBIns(int bIns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BINS$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BINS$34);
            }
            target.setIntValue(bIns);
        }
    }
    
    /**
     * Sets (as xml) the "bIns" attribute
     */
    public void xsetBIns(org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 bIns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().find_attribute_user(BINS$34);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32)get_store().add_attribute_user(BINS$34);
            }
            target.set(bIns);
        }
    }
    
    /**
     * Unsets the "bIns" attribute
     */
    public void unsetBIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BINS$34);
        }
    }
    
    /**
     * Gets the "numCol" attribute
     */
    public int getNumCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMCOL$36);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "numCol" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextColumnCount xgetNumCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextColumnCount target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextColumnCount)get_store().find_attribute_user(NUMCOL$36);
            return target;
        }
    }
    
    /**
     * True if has "numCol" attribute
     */
    public boolean isSetNumCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NUMCOL$36) != null;
        }
    }
    
    /**
     * Sets the "numCol" attribute
     */
    public void setNumCol(int numCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMCOL$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMCOL$36);
            }
            target.setIntValue(numCol);
        }
    }
    
    /**
     * Sets (as xml) the "numCol" attribute
     */
    public void xsetNumCol(org.openxmlformats.schemas.drawingml.x2006.main.STTextColumnCount numCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextColumnCount target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextColumnCount)get_store().find_attribute_user(NUMCOL$36);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextColumnCount)get_store().add_attribute_user(NUMCOL$36);
            }
            target.set(numCol);
        }
    }
    
    /**
     * Unsets the "numCol" attribute
     */
    public void unsetNumCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NUMCOL$36);
        }
    }
    
    /**
     * Gets the "spcCol" attribute
     */
    public int getSpcCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPCCOL$38);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "spcCol" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32 xgetSpcCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32)get_store().find_attribute_user(SPCCOL$38);
            return target;
        }
    }
    
    /**
     * True if has "spcCol" attribute
     */
    public boolean isSetSpcCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SPCCOL$38) != null;
        }
    }
    
    /**
     * Sets the "spcCol" attribute
     */
    public void setSpcCol(int spcCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPCCOL$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPCCOL$38);
            }
            target.setIntValue(spcCol);
        }
    }
    
    /**
     * Sets (as xml) the "spcCol" attribute
     */
    public void xsetSpcCol(org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32 spcCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32 target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32)get_store().find_attribute_user(SPCCOL$38);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate32)get_store().add_attribute_user(SPCCOL$38);
            }
            target.set(spcCol);
        }
    }
    
    /**
     * Unsets the "spcCol" attribute
     */
    public void unsetSpcCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SPCCOL$38);
        }
    }
    
    /**
     * Gets the "rtlCol" attribute
     */
    public boolean getRtlCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RTLCOL$40);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "rtlCol" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRtlCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RTLCOL$40);
            return target;
        }
    }
    
    /**
     * True if has "rtlCol" attribute
     */
    public boolean isSetRtlCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RTLCOL$40) != null;
        }
    }
    
    /**
     * Sets the "rtlCol" attribute
     */
    public void setRtlCol(boolean rtlCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RTLCOL$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RTLCOL$40);
            }
            target.setBooleanValue(rtlCol);
        }
    }
    
    /**
     * Sets (as xml) the "rtlCol" attribute
     */
    public void xsetRtlCol(org.apache.xmlbeans.XmlBoolean rtlCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RTLCOL$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RTLCOL$40);
            }
            target.set(rtlCol);
        }
    }
    
    /**
     * Unsets the "rtlCol" attribute
     */
    public void unsetRtlCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RTLCOL$40);
        }
    }
    
    /**
     * Gets the "fromWordArt" attribute
     */
    public boolean getFromWordArt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROMWORDART$42);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fromWordArt" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFromWordArt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FROMWORDART$42);
            return target;
        }
    }
    
    /**
     * True if has "fromWordArt" attribute
     */
    public boolean isSetFromWordArt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FROMWORDART$42) != null;
        }
    }
    
    /**
     * Sets the "fromWordArt" attribute
     */
    public void setFromWordArt(boolean fromWordArt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROMWORDART$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FROMWORDART$42);
            }
            target.setBooleanValue(fromWordArt);
        }
    }
    
    /**
     * Sets (as xml) the "fromWordArt" attribute
     */
    public void xsetFromWordArt(org.apache.xmlbeans.XmlBoolean fromWordArt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FROMWORDART$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FROMWORDART$42);
            }
            target.set(fromWordArt);
        }
    }
    
    /**
     * Unsets the "fromWordArt" attribute
     */
    public void unsetFromWordArt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FROMWORDART$42);
        }
    }
    
    /**
     * Gets the "anchor" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType.Enum getAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANCHOR$44);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "anchor" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType xgetAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType)get_store().find_attribute_user(ANCHOR$44);
            return target;
        }
    }
    
    /**
     * True if has "anchor" attribute
     */
    public boolean isSetAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ANCHOR$44) != null;
        }
    }
    
    /**
     * Sets the "anchor" attribute
     */
    public void setAnchor(org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType.Enum anchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANCHOR$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANCHOR$44);
            }
            target.setEnumValue(anchor);
        }
    }
    
    /**
     * Sets (as xml) the "anchor" attribute
     */
    public void xsetAnchor(org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType anchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType)get_store().find_attribute_user(ANCHOR$44);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType)get_store().add_attribute_user(ANCHOR$44);
            }
            target.set(anchor);
        }
    }
    
    /**
     * Unsets the "anchor" attribute
     */
    public void unsetAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ANCHOR$44);
        }
    }
    
    /**
     * Gets the "anchorCtr" attribute
     */
    public boolean getAnchorCtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANCHORCTR$46);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "anchorCtr" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAnchorCtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ANCHORCTR$46);
            return target;
        }
    }
    
    /**
     * True if has "anchorCtr" attribute
     */
    public boolean isSetAnchorCtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ANCHORCTR$46) != null;
        }
    }
    
    /**
     * Sets the "anchorCtr" attribute
     */
    public void setAnchorCtr(boolean anchorCtr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANCHORCTR$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANCHORCTR$46);
            }
            target.setBooleanValue(anchorCtr);
        }
    }
    
    /**
     * Sets (as xml) the "anchorCtr" attribute
     */
    public void xsetAnchorCtr(org.apache.xmlbeans.XmlBoolean anchorCtr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ANCHORCTR$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ANCHORCTR$46);
            }
            target.set(anchorCtr);
        }
    }
    
    /**
     * Unsets the "anchorCtr" attribute
     */
    public void unsetAnchorCtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ANCHORCTR$46);
        }
    }
    
    /**
     * Gets the "forceAA" attribute
     */
    public boolean getForceAA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORCEAA$48);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "forceAA" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetForceAA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FORCEAA$48);
            return target;
        }
    }
    
    /**
     * True if has "forceAA" attribute
     */
    public boolean isSetForceAA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORCEAA$48) != null;
        }
    }
    
    /**
     * Sets the "forceAA" attribute
     */
    public void setForceAA(boolean forceAA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORCEAA$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORCEAA$48);
            }
            target.setBooleanValue(forceAA);
        }
    }
    
    /**
     * Sets (as xml) the "forceAA" attribute
     */
    public void xsetForceAA(org.apache.xmlbeans.XmlBoolean forceAA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FORCEAA$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FORCEAA$48);
            }
            target.set(forceAA);
        }
    }
    
    /**
     * Unsets the "forceAA" attribute
     */
    public void unsetForceAA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORCEAA$48);
        }
    }
    
    /**
     * Gets the "upright" attribute
     */
    public boolean getUpright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPRIGHT$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UPRIGHT$50);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "upright" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUpright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UPRIGHT$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(UPRIGHT$50);
            }
            return target;
        }
    }
    
    /**
     * True if has "upright" attribute
     */
    public boolean isSetUpright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UPRIGHT$50) != null;
        }
    }
    
    /**
     * Sets the "upright" attribute
     */
    public void setUpright(boolean upright)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPRIGHT$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPRIGHT$50);
            }
            target.setBooleanValue(upright);
        }
    }
    
    /**
     * Sets (as xml) the "upright" attribute
     */
    public void xsetUpright(org.apache.xmlbeans.XmlBoolean upright)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UPRIGHT$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UPRIGHT$50);
            }
            target.set(upright);
        }
    }
    
    /**
     * Unsets the "upright" attribute
     */
    public void unsetUpright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UPRIGHT$50);
        }
    }
    
    /**
     * Gets the "compatLnSpc" attribute
     */
    public boolean getCompatLnSpc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPATLNSPC$52);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "compatLnSpc" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCompatLnSpc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COMPATLNSPC$52);
            return target;
        }
    }
    
    /**
     * True if has "compatLnSpc" attribute
     */
    public boolean isSetCompatLnSpc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMPATLNSPC$52) != null;
        }
    }
    
    /**
     * Sets the "compatLnSpc" attribute
     */
    public void setCompatLnSpc(boolean compatLnSpc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPATLNSPC$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPATLNSPC$52);
            }
            target.setBooleanValue(compatLnSpc);
        }
    }
    
    /**
     * Sets (as xml) the "compatLnSpc" attribute
     */
    public void xsetCompatLnSpc(org.apache.xmlbeans.XmlBoolean compatLnSpc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COMPATLNSPC$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COMPATLNSPC$52);
            }
            target.set(compatLnSpc);
        }
    }
    
    /**
     * Unsets the "compatLnSpc" attribute
     */
    public void unsetCompatLnSpc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMPATLNSPC$52);
        }
    }
}
