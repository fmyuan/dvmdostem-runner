/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public final class VPARTKEY {
  public final static VPARTKEY I_leaf = new VPARTKEY("I_leaf", temcoreJNI.I_leaf_get());
  public final static VPARTKEY I_stem = new VPARTKEY("I_stem");
  public final static VPARTKEY I_root = new VPARTKEY("I_root");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static VPARTKEY swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + VPARTKEY.class + " with value " + swigValue);
  }

  private VPARTKEY(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private VPARTKEY(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private VPARTKEY(String swigName, VPARTKEY swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static VPARTKEY[] swigValues = { I_leaf, I_stem, I_root };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

