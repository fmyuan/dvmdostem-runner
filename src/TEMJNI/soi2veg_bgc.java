/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class soi2veg_bgc {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected soi2veg_bgc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(soi2veg_bgc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_soi2veg_bgc(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInnuptake(double value) {
    temcoreJNI.soi2veg_bgc_innuptake_set(swigCPtr, this, value);
  }

  public double getInnuptake() {
    return temcoreJNI.soi2veg_bgc_innuptake_get(swigCPtr, this);
  }

  public void setLnuptake(double value) {
    temcoreJNI.soi2veg_bgc_lnuptake_set(swigCPtr, this, value);
  }

  public double getLnuptake() {
    return temcoreJNI.soi2veg_bgc_lnuptake_get(swigCPtr, this);
  }

  public void setSnuptakeall(double value) {
    temcoreJNI.soi2veg_bgc_snuptakeall_set(swigCPtr, this, value);
  }

  public double getSnuptakeall() {
    return temcoreJNI.soi2veg_bgc_snuptakeall_get(swigCPtr, this);
  }

  public void setSnuptake(double[] value) {
    temcoreJNI.soi2veg_bgc_snuptake_set(swigCPtr, this, value);
  }

  public double[] getSnuptake() {
    return temcoreJNI.soi2veg_bgc_snuptake_get(swigCPtr, this);
  }

  public void setNextract(double[] value) {
    temcoreJNI.soi2veg_bgc_nextract_set(swigCPtr, this, value);
  }

  public double[] getNextract() {
    return temcoreJNI.soi2veg_bgc_nextract_get(swigCPtr, this);
  }

  public soi2veg_bgc() {
    this(temcoreJNI.new_soi2veg_bgc(), true);
  }

}
