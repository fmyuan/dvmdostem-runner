/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class snwpar_env {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected snwpar_env(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(snwpar_env obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_snwpar_env(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAlbmax(double value) {
    temcoreJNI.snwpar_env_albmax_set(swigCPtr, this, value);
  }

  public double getAlbmax() {
    return temcoreJNI.snwpar_env_albmax_get(swigCPtr, this);
  }

  public void setAlbmin(double value) {
    temcoreJNI.snwpar_env_albmin_set(swigCPtr, this, value);
  }

  public double getAlbmin() {
    return temcoreJNI.snwpar_env_albmin_get(swigCPtr, this);
  }

  public snwpar_env() {
    this(temcoreJNI.new_snwpar_env(), true);
  }

}
