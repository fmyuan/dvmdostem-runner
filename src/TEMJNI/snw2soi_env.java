/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class snw2soi_env {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected snw2soi_env(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(snw2soi_env obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_snw2soi_env(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMelt(double value) {
    temcoreJNI.snw2soi_env_melt_set(swigCPtr, this, value);
  }

  public double getMelt() {
    return temcoreJNI.snw2soi_env_melt_get(swigCPtr, this);
  }

  public snw2soi_env() {
    this(temcoreJNI.new_snw2soi_env(), true);
  }

}
