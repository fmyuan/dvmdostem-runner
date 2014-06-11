/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class snwstate_dim {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected snwstate_dim(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(snwstate_dim obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_snwstate_dim(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setNumsnwl(int value) {
    temcoreJNI.snwstate_dim_numsnwl_set(swigCPtr, this, value);
  }

  public int getNumsnwl() {
    return temcoreJNI.snwstate_dim_numsnwl_get(swigCPtr, this);
  }

  public void setOlds(double value) {
    temcoreJNI.snwstate_dim_olds_set(swigCPtr, this, value);
  }

  public double getOlds() {
    return temcoreJNI.snwstate_dim_olds_get(swigCPtr, this);
  }

  public void setThick(double value) {
    temcoreJNI.snwstate_dim_thick_set(swigCPtr, this, value);
  }

  public double getThick() {
    return temcoreJNI.snwstate_dim_thick_get(swigCPtr, this);
  }

  public void setDense(double value) {
    temcoreJNI.snwstate_dim_dense_set(swigCPtr, this, value);
  }

  public double getDense() {
    return temcoreJNI.snwstate_dim_dense_get(swigCPtr, this);
  }

  public void setExtramass(double value) {
    temcoreJNI.snwstate_dim_extramass_set(swigCPtr, this, value);
  }

  public double getExtramass() {
    return temcoreJNI.snwstate_dim_extramass_get(swigCPtr, this);
  }

  public void setDz(double[] value) {
    temcoreJNI.snwstate_dim_dz_set(swigCPtr, this, value);
  }

  public double[] getDz() {
    return temcoreJNI.snwstate_dim_dz_get(swigCPtr, this);
  }

  public void setAge(double[] value) {
    temcoreJNI.snwstate_dim_age_set(swigCPtr, this, value);
  }

  public double[] getAge() {
    return temcoreJNI.snwstate_dim_age_get(swigCPtr, this);
  }

  public void setRho(double[] value) {
    temcoreJNI.snwstate_dim_rho_set(swigCPtr, this, value);
  }

  public double[] getRho() {
    return temcoreJNI.snwstate_dim_rho_get(swigCPtr, this);
  }

  public void setPor(double[] value) {
    temcoreJNI.snwstate_dim_por_set(swigCPtr, this, value);
  }

  public double[] getPor() {
    return temcoreJNI.snwstate_dim_por_get(swigCPtr, this);
  }

  public snwstate_dim() {
    this(temcoreJNI.new_snwstate_dim(), true);
  }

}
