/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class veg2atm_bgc {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected veg2atm_bgc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(veg2atm_bgc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_veg2atm_bgc(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRmall(double value) {
    temcoreJNI.veg2atm_bgc_rmall_set(swigCPtr, this, value);
  }

  public double getRmall() {
    return temcoreJNI.veg2atm_bgc_rmall_get(swigCPtr, this);
  }

  public void setRm(double[] value) {
    temcoreJNI.veg2atm_bgc_rm_set(swigCPtr, this, value);
  }

  public double[] getRm() {
    return temcoreJNI.veg2atm_bgc_rm_get(swigCPtr, this);
  }

  public void setRgall(double value) {
    temcoreJNI.veg2atm_bgc_rgall_set(swigCPtr, this, value);
  }

  public double getRgall() {
    return temcoreJNI.veg2atm_bgc_rgall_get(swigCPtr, this);
  }

  public void setRg(double[] value) {
    temcoreJNI.veg2atm_bgc_rg_set(swigCPtr, this, value);
  }

  public double[] getRg() {
    return temcoreJNI.veg2atm_bgc_rg_get(swigCPtr, this);
  }

  public veg2atm_bgc() {
    this(temcoreJNI.new_veg2atm_bgc(), true);
  }

}
