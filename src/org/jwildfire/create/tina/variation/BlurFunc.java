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

import static org.jwildfire.base.mathlib.MathLib.M_PI;
import static org.jwildfire.base.mathlib.MathLib.sinAndCos;
import odk.lang.DoubleWrapper;

import org.jwildfire.create.tina.base.XForm;
import org.jwildfire.create.tina.base.XYZPoint;

public class BlurFunc extends SimpleVariationFunc {
  private static final long serialVersionUID = 1L;

  private DoubleWrapper sina = new DoubleWrapper();
  private DoubleWrapper cosa = new DoubleWrapper();

  @Override
  public void transform(FlameTransformationContext pContext, XForm pXForm, XYZPoint pAffineTP, XYZPoint pVarTP, double pAmount) {
    double r = pContext.random() * (M_PI + M_PI);
    sinAndCos(r, sina, cosa);
    double r2 = pAmount * pContext.random();
    pVarTP.x += r2 * cosa.value;
    pVarTP.y += r2 * sina.value;
    pVarTP.z = pAmount * pAffineTP.z;
  }

  @Override
  public String getName() {
    return "blur";
  }

}
