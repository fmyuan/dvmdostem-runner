/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class vegpar_bgc {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected vegpar_bgc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(vegpar_bgc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_vegpar_bgc(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCpart(double[] value) {
    temcoreJNI.vegpar_bgc_cpart_set(swigCPtr, this, value);
  }

  public double[] getCpart() {
    return temcoreJNI.vegpar_bgc_cpart_get(swigCPtr, this);
  }

  public void setC2neven(double[] value) {
    temcoreJNI.vegpar_bgc_c2neven_set(swigCPtr, this, value);
  }

  public double[] getC2neven() {
    return temcoreJNI.vegpar_bgc_c2neven_get(swigCPtr, this);
  }

  public void setC2na(double value) {
    temcoreJNI.vegpar_bgc_c2na_set(swigCPtr, this, value);
  }

  public double getC2na() {
    return temcoreJNI.vegpar_bgc_c2na_get(swigCPtr, this);
  }

  public void setC2nb(double[] value) {
    temcoreJNI.vegpar_bgc_c2nb_set(swigCPtr, this, value);
  }

  public double[] getC2nb() {
    return temcoreJNI.vegpar_bgc_c2nb_get(swigCPtr, this);
  }

  public void setC2nmin(double[] value) {
    temcoreJNI.vegpar_bgc_c2nmin_set(swigCPtr, this, value);
  }

  public double[] getC2nmin() {
    return temcoreJNI.vegpar_bgc_c2nmin_get(swigCPtr, this);
  }

  public void setDc2n(double value) {
    temcoreJNI.vegpar_bgc_dc2n_set(swigCPtr, this, value);
  }

  public double getDc2n() {
    return temcoreJNI.vegpar_bgc_dc2n_get(swigCPtr, this);
  }

  public void setLabncon(double value) {
    temcoreJNI.vegpar_bgc_labncon_set(swigCPtr, this, value);
  }

  public double getLabncon() {
    return temcoreJNI.vegpar_bgc_labncon_get(swigCPtr, this);
  }

  public void setRaq10a0(double value) {
    temcoreJNI.vegpar_bgc_raq10a0_set(swigCPtr, this, value);
  }

  public double getRaq10a0() {
    return temcoreJNI.vegpar_bgc_raq10a0_get(swigCPtr, this);
  }

  public void setRaq10a1(double value) {
    temcoreJNI.vegpar_bgc_raq10a1_set(swigCPtr, this, value);
  }

  public double getRaq10a1() {
    return temcoreJNI.vegpar_bgc_raq10a1_get(swigCPtr, this);
  }

  public void setRaq10a2(double value) {
    temcoreJNI.vegpar_bgc_raq10a2_set(swigCPtr, this, value);
  }

  public double getRaq10a2() {
    return temcoreJNI.vegpar_bgc_raq10a2_get(swigCPtr, this);
  }

  public void setRaq10a3(double value) {
    temcoreJNI.vegpar_bgc_raq10a3_set(swigCPtr, this, value);
  }

  public double getRaq10a3() {
    return temcoreJNI.vegpar_bgc_raq10a3_get(swigCPtr, this);
  }

  public void setKc(double value) {
    temcoreJNI.vegpar_bgc_kc_set(swigCPtr, this, value);
  }

  public double getKc() {
    return temcoreJNI.vegpar_bgc_kc_get(swigCPtr, this);
  }

  public void setKi(double value) {
    temcoreJNI.vegpar_bgc_ki_set(swigCPtr, this, value);
  }

  public double getKi() {
    return temcoreJNI.vegpar_bgc_ki_get(swigCPtr, this);
  }

  public void setTmin(double value) {
    temcoreJNI.vegpar_bgc_tmin_set(swigCPtr, this, value);
  }

  public double getTmin() {
    return temcoreJNI.vegpar_bgc_tmin_get(swigCPtr, this);
  }

  public void setTmax(double value) {
    temcoreJNI.vegpar_bgc_tmax_set(swigCPtr, this, value);
  }

  public double getTmax() {
    return temcoreJNI.vegpar_bgc_tmax_get(swigCPtr, this);
  }

  public void setToptmin(double value) {
    temcoreJNI.vegpar_bgc_toptmin_set(swigCPtr, this, value);
  }

  public double getToptmin() {
    return temcoreJNI.vegpar_bgc_toptmin_get(swigCPtr, this);
  }

  public void setToptmax(double value) {
    temcoreJNI.vegpar_bgc_toptmax_set(swigCPtr, this, value);
  }

  public double getToptmax() {
    return temcoreJNI.vegpar_bgc_toptmax_get(swigCPtr, this);
  }

  public void setKnuptake(double value) {
    temcoreJNI.vegpar_bgc_knuptake_set(swigCPtr, this, value);
  }

  public double getKnuptake() {
    return temcoreJNI.vegpar_bgc_knuptake_get(swigCPtr, this);
  }

  public vegpar_bgc() {
    this(temcoreJNI.new_vegpar_bgc(), true);
  }

}
