/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class Grid {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Grid(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Grid obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_Grid(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Grid() {
    this(temcoreJNI.new_Grid(), true);
  }

  public int reinit() {
    return temcoreJNI.Grid_reinit(swigCPtr, this);
  }

  public void setEnvData(EnvData ed) {
    temcoreJNI.Grid_setEnvData(swigCPtr, this, EnvData.getCPtr(ed), ed);
  }

  public void setBgcData(BgcData bd) {
    temcoreJNI.Grid_setBgcData(swigCPtr, this, BgcData.getCPtr(bd), bd);
  }

  public void setRegionData(RegionData rd) {
    temcoreJNI.Grid_setRegionData(swigCPtr, this, RegionData.getCPtr(rd), rd);
  }

  public void setGrded(EnvData value) {
    temcoreJNI.Grid_grded_set(swigCPtr, this, EnvData.getCPtr(value), value);
  }

  public EnvData getGrded() {
    long cPtr = temcoreJNI.Grid_grded_get(swigCPtr, this);
    return (cPtr == 0) ? null : new EnvData(cPtr, false);
  }

  public void setGrdbd(BgcData value) {
    temcoreJNI.Grid_grdbd_set(swigCPtr, this, BgcData.getCPtr(value), value);
  }

  public BgcData getGrdbd() {
    long cPtr = temcoreJNI.Grid_grdbd_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BgcData(cPtr, false);
  }

  public void setRd(RegionData value) {
    temcoreJNI.Grid_rd_set(swigCPtr, this, RegionData.getCPtr(value), value);
  }

  public RegionData getRd() {
    long cPtr = temcoreJNI.Grid_rd_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RegionData(cPtr, false);
  }

  public void setGd(GridData value) {
    temcoreJNI.Grid_gd_set(swigCPtr, this, GridData.getCPtr(value), value);
  }

  public GridData getGd() {
    long cPtr = temcoreJNI.Grid_gd_get(swigCPtr, this);
    return (cPtr == 0) ? null : new GridData(cPtr, false);
  }

}
