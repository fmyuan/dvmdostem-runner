/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class soi2soi_bgc {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected soi2soi_bgc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(soi2soi_bgc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_soi2soi_bgc(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setNetnmin(double[] value) {
    temcoreJNI.soi2soi_bgc_netnmin_set(swigCPtr, this, value);
  }

  public double[] getNetnmin() {
    return temcoreJNI.soi2soi_bgc_netnmin_get(swigCPtr, this);
  }

  public void setNimmob(double[] value) {
    temcoreJNI.soi2soi_bgc_nimmob_set(swigCPtr, this, value);
  }

  public double[] getNimmob() {
    return temcoreJNI.soi2soi_bgc_nimmob_get(swigCPtr, this);
  }

  public void setNetnminsum(double value) {
    temcoreJNI.soi2soi_bgc_netnminsum_set(swigCPtr, this, value);
  }

  public double getNetnminsum() {
    return temcoreJNI.soi2soi_bgc_netnminsum_get(swigCPtr, this);
  }

  public void setNimmobsum(double value) {
    temcoreJNI.soi2soi_bgc_nimmobsum_set(swigCPtr, this, value);
  }

  public double getNimmobsum() {
    return temcoreJNI.soi2soi_bgc_nimmobsum_get(swigCPtr, this);
  }

  public soi2soi_bgc() {
    this(temcoreJNI.new_soi2soi_bgc(), true);
  }

}
