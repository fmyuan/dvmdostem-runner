/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class Region {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Region(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Region obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_Region(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Region() {
    this(temcoreJNI.new_Region(), true);
  }

  public void setRd(RegionData value) {
    temcoreJNI.Region_rd_set(swigCPtr, this, RegionData.getCPtr(value), value);
  }

  public RegionData getRd() {
    long cPtr = temcoreJNI.Region_rd_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RegionData(cPtr, false);
  }

  public void init() {
    temcoreJNI.Region_init(swigCPtr, this);
  }

  public void getinitco2() {
    temcoreJNI.Region_getinitco2(swigCPtr, this);
  }

}
