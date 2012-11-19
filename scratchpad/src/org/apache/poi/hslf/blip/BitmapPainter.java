/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package org.apache.poi.hslf.blip;

import java.io.ByteArrayInputStream;

import net.pbdavey.awt.Graphics2D;

import org.apache.poi.hslf.model.Picture;
import org.apache.poi.hslf.model.Shape;
import org.apache.poi.hslf.model.SimpleShape;
import org.apache.poi.hslf.usermodel.PictureData;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

import and.awt.BufferedImage;
import and.awt.ImageIO;
import and.awt.Rectangle;
import android.util.Log;
/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

/**
 * Creates BufferedImage using vajax.imageio.ImageIO and draws it in the specified graphics.
 *
 * @author  Yegor Kozlov.
 */
public final class BitmapPainter implements ImagePainter {
    protected POILogger logger = POILogFactory.getLogger(this.getClass());

    public void paint(Graphics2D graphics, PictureData pict, Picture parent) {
        BufferedImage img;
        try {
			img = ImageIO.read(new ByteArrayInputStream(pict.getData()));
//        	if (bm == null) {
//        		logger.log(POILogger.WARN, "ImageIO failed to create image. image.type: " + pict.getType());
//        		return;
//        	}
        }
        catch (Exception e){
        	e.printStackTrace();
            logger.log(POILogger.WARN, "ImageIO failed to create image. image.type: " + pict.getType());
            return;
        }
        
        Rectangle anchor = parent.getLogicalAnchor2D().getBounds();
        Log.d("anchor", "anchor: " + anchor.toString());
        
        SimpleShape shape = parent;
        //flip vertical
        if(shape.getFlipVertical()){
            graphics.translate(anchor.getX(), anchor.getY() + anchor.getHeight());
            graphics.scale(1, -1);
            graphics.translate(-anchor.getX(), -anchor.getY());
        }
        //flip horizontal
        if(shape.getFlipHorizontal()){
            graphics.translate(anchor.getX() + anchor.getWidth(), anchor.getY());
            graphics.scale(-1, 1);
            graphics.translate(-anchor.getX() , -anchor.getY());
        }

        //rotate transform
        double angle = shape.getRotation();

        if(angle != 0){
            double centerX = anchor.getX() + anchor.getWidth()/2;
            double centerY = anchor.getY() + anchor.getHeight()/2;

            graphics.translate(centerX, centerY);
            graphics.rotate(Math.toRadians(angle));
            graphics.translate(-centerX, -centerY);
        }
        
        graphics.drawImage(img, anchor.x, anchor.y, anchor.width, anchor.height, null);
        
        if (img != null) {
        	img.bm.recycle();
        }
    }

}
