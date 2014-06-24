/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class vegdiag_env {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected vegdiag_env(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(vegdiag_env obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_vegdiag_env(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBtran(double value) {
    temcoreJNI.vegdiag_env_btran_set(swigCPtr, this, value);
  }

  public double getBtran() {
    return temcoreJNI.vegdiag_env_btran_get(swigCPtr, this);
  }

  public void setRc(double value) {
    temcoreJNI.vegdiag_env_rc_set(swigCPtr, this, value);
  }

  public double getRc() {
    return temcoreJNI.vegdiag_env_rc_get(swigCPtr, this);
  }

  public void setCc(double value) {
    temcoreJNI.vegdiag_env_cc_set(swigCPtr, this, value);
  }

  public double getCc() {
    return temcoreJNI.vegdiag_env_cc_get(swigCPtr, this);
  }

  public void setM_ppfd(double value) {
    temcoreJNI.vegdiag_env_m_ppfd_set(swigCPtr, this, value);
  }

  public double getM_ppfd() {
    return temcoreJNI.vegdiag_env_m_ppfd_get(swigCPtr, this);
  }

  public void setM_vpd(double value) {
    temcoreJNI.vegdiag_env_m_vpd_set(swigCPtr, this, value);
  }

  public double getM_vpd() {
    return temcoreJNI.vegdiag_env_m_vpd_get(swigCPtr, this);
  }

  public vegdiag_env() {
    this(temcoreJNI.new_vegdiag_env(), true);
  }

}
