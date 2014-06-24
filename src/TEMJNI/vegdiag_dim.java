/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class vegdiag_dim {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected vegdiag_dim(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(vegdiag_dim obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_vegdiag_dim(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFpcsum(double value) {
    temcoreJNI.vegdiag_dim_fpcsum_set(swigCPtr, this, value);
  }

  public double getFpcsum() {
    return temcoreJNI.vegdiag_dim_fpcsum_get(swigCPtr, this);
  }

  public void setGrowingttime(double[] value) {
    temcoreJNI.vegdiag_dim_growingttime_set(swigCPtr, this, value);
  }

  public double[] getGrowingttime() {
    return temcoreJNI.vegdiag_dim_growingttime_get(swigCPtr, this);
  }

  public void setMaxleafc(double[] value) {
    temcoreJNI.vegdiag_dim_maxleafc_set(swigCPtr, this, value);
  }

  public double[] getMaxleafc() {
    return temcoreJNI.vegdiag_dim_maxleafc_get(swigCPtr, this);
  }

  public void setFleaf(double[] value) {
    temcoreJNI.vegdiag_dim_fleaf_set(swigCPtr, this, value);
  }

  public double[] getFleaf() {
    return temcoreJNI.vegdiag_dim_fleaf_get(swigCPtr, this);
  }

  public void setUnnormleaf(double[] value) {
    temcoreJNI.vegdiag_dim_unnormleaf_set(swigCPtr, this, value);
  }

  public double[] getUnnormleaf() {
    return temcoreJNI.vegdiag_dim_unnormleaf_get(swigCPtr, this);
  }

  public void setEetmx(double[] value) {
    temcoreJNI.vegdiag_dim_eetmx_set(swigCPtr, this, value);
  }

  public double[] getEetmx() {
    return temcoreJNI.vegdiag_dim_eetmx_get(swigCPtr, this);
  }

  public void setUnnormleafmx(double[] value) {
    temcoreJNI.vegdiag_dim_unnormleafmx_set(swigCPtr, this, value);
  }

  public double[] getUnnormleafmx() {
    return temcoreJNI.vegdiag_dim_unnormleafmx_get(swigCPtr, this);
  }

  public void setTopt(double[] value) {
    temcoreJNI.vegdiag_dim_topt_set(swigCPtr, this, value);
  }

  public double[] getTopt() {
    return temcoreJNI.vegdiag_dim_topt_get(swigCPtr, this);
  }

  public void setFfoliage(double[] value) {
    temcoreJNI.vegdiag_dim_ffoliage_set(swigCPtr, this, value);
  }

  public double[] getFfoliage() {
    return temcoreJNI.vegdiag_dim_ffoliage_get(swigCPtr, this);
  }

  public void setFoliagemx(double[] value) {
    temcoreJNI.vegdiag_dim_foliagemx_set(swigCPtr, this, value);
  }

  public double[] getFoliagemx() {
    return temcoreJNI.vegdiag_dim_foliagemx_get(swigCPtr, this);
  }

  public vegdiag_dim() {
    this(temcoreJNI.new_vegdiag_dim(), true);
  }

}
