/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class snwstate_env {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected snwstate_env(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(snwstate_env obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_snwstate_env(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTsnw(double[] value) {
    temcoreJNI.snwstate_env_tsnw_set(swigCPtr, this, value);
  }

  public double[] getTsnw() {
    return temcoreJNI.snwstate_env_tsnw_get(swigCPtr, this);
  }

  public void setSwe(double[] value) {
    temcoreJNI.snwstate_env_swe_set(swigCPtr, this, value);
  }

  public double[] getSwe() {
    return temcoreJNI.snwstate_env_swe_get(swigCPtr, this);
  }

  public void setSnwliq(double[] value) {
    temcoreJNI.snwstate_env_snwliq_set(swigCPtr, this, value);
  }

  public double[] getSnwliq() {
    return temcoreJNI.snwstate_env_snwliq_get(swigCPtr, this);
  }

  public void setSnwice(double[] value) {
    temcoreJNI.snwstate_env_snwice_set(swigCPtr, this, value);
  }

  public double[] getSnwice() {
    return temcoreJNI.snwstate_env_snwice_get(swigCPtr, this);
  }

  public void setExtraswe(double value) {
    temcoreJNI.snwstate_env_extraswe_set(swigCPtr, this, value);
  }

  public double getExtraswe() {
    return temcoreJNI.snwstate_env_extraswe_get(swigCPtr, this);
  }

  public void setSwesum(double value) {
    temcoreJNI.snwstate_env_swesum_set(swigCPtr, this, value);
  }

  public double getSwesum() {
    return temcoreJNI.snwstate_env_swesum_get(swigCPtr, this);
  }

  public void setTsnwave(double value) {
    temcoreJNI.snwstate_env_tsnwave_set(swigCPtr, this, value);
  }

  public double getTsnwave() {
    return temcoreJNI.snwstate_env_tsnwave_get(swigCPtr, this);
  }

  public snwstate_env() {
    this(temcoreJNI.new_snwstate_env(), true);
  }

}
