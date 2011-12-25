/*
  JWildfire - an image and animation processor written in Java 
  Copyright (C) 1995-2011 Andreas Maschke

  This is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser 
  General Public License as published by the Free Software Foundation; either version 2.1 of the 
  License, or (at your option) any later version.
 
  This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without 
  even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
  Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public License along with this software; 
  if not, write to the Free Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
  02110-1301 USA, or see the FSF site: http://www.fsf.org.
*/
package org.jwildfire.create.tina.variation;

import org.jwildfire.create.tina.random.RandomNumberGenerator;

public class XFormTransformationContextImpl implements XFormTransformationContext {
  private final FlameTransformationContext parentContext;
  private double color;

  public XFormTransformationContextImpl(FlameTransformationContext pParentContext) {
    parentContext = pParentContext;
  }

  @Override
  public RandomNumberGenerator getRandomNumberGenerator() {
    return parentContext.getRandomNumberGenerator();
  }

  @Override
  public void setColor(double pColor) {
    color = pColor;
  }

  @Override
  public double getColor() {
    return color;
  }

  //  public double getRasterIntensity(double pX,double pY);
  //    
  //  }
  //  
  //{
  //  int xIdx = (int) (renderer.bws * p.x + 0.5);
  //  int yIdx = (int) (renderer.bhs * p.y + 0.5);
  //  RasterPoint rp = renderer.raster[yIdx][xIdx];
  //
  //  rp.red;
  //  rp.green;
  //  rp.blue;
  //  rp.count++;
  //}

}
