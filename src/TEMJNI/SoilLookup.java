/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class SoilLookup {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SoilLookup(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SoilLookup obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_SoilLookup(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SoilLookup() {
    this(temcoreJNI.new_SoilLookup(), true);
  }

  public void setSand(int[] value) {
    temcoreJNI.SoilLookup_sand_set(swigCPtr, this, value);
  }

  public int[] getSand() {
    return temcoreJNI.SoilLookup_sand_get(swigCPtr, this);
  }

  public void setSilt(int[] value) {
    temcoreJNI.SoilLookup_silt_set(swigCPtr, this, value);
  }

  public int[] getSilt() {
    return temcoreJNI.SoilLookup_silt_get(swigCPtr, this);
  }

  public void setClay(int[] value) {
    temcoreJNI.SoilLookup_clay_set(swigCPtr, this, value);
  }

  public int[] getClay() {
    return temcoreJNI.SoilLookup_clay_get(swigCPtr, this);
  }

  public void setKsolids(float[] value) {
    temcoreJNI.SoilLookup_Ksolids_set(swigCPtr, this, value);
  }

  public float[] getKsolids() {
    return temcoreJNI.SoilLookup_Ksolids_get(swigCPtr, this);
  }

  public void setCsolids(float[] value) {
    temcoreJNI.SoilLookup_Csolids_set(swigCPtr, this, value);
  }

  public float[] getCsolids() {
    return temcoreJNI.SoilLookup_Csolids_get(swigCPtr, this);
  }

  public void setKsat(float[] value) {
    temcoreJNI.SoilLookup_Ksat_set(swigCPtr, this, value);
  }

  public float[] getKsat() {
    return temcoreJNI.SoilLookup_Ksat_get(swigCPtr, this);
  }

  public void setPsisat(float[] value) {
    temcoreJNI.SoilLookup_Psisat_set(swigCPtr, this, value);
  }

  public float[] getPsisat() {
    return temcoreJNI.SoilLookup_Psisat_get(swigCPtr, this);
  }

  public void setPoro(float[] value) {
    temcoreJNI.SoilLookup_poro_set(swigCPtr, this, value);
  }

  public float[] getPoro() {
    return temcoreJNI.SoilLookup_poro_get(swigCPtr, this);
  }

  public void setB(float[] value) {
    temcoreJNI.SoilLookup_b_set(swigCPtr, this, value);
  }

  public float[] getB() {
    return temcoreJNI.SoilLookup_b_get(swigCPtr, this);
  }

  public void setColor(float[] value) {
    temcoreJNI.SoilLookup_color_set(swigCPtr, this, value);
  }

  public float[] getColor() {
    return temcoreJNI.SoilLookup_color_get(swigCPtr, this);
  }

  public void setBulkden(float[] value) {
    temcoreJNI.SoilLookup_bulkden_set(swigCPtr, this, value);
  }

  public float[] getBulkden() {
    return temcoreJNI.SoilLookup_bulkden_get(swigCPtr, this);
  }

  public void setWiltp(float[] value) {
    temcoreJNI.SoilLookup_wiltp_set(swigCPtr, this, value);
  }

  public float[] getWiltp() {
    return temcoreJNI.SoilLookup_wiltp_get(swigCPtr, this);
  }

  public void setFieldcap(float[] value) {
    temcoreJNI.SoilLookup_fieldcap_set(swigCPtr, this, value);
  }

  public float[] getFieldcap() {
    return temcoreJNI.SoilLookup_fieldcap_get(swigCPtr, this);
  }

  public void setTcunfsat(float[] value) {
    temcoreJNI.SoilLookup_tcunfsat_set(swigCPtr, this, value);
  }

  public float[] getTcunfsat() {
    return temcoreJNI.SoilLookup_tcunfsat_get(swigCPtr, this);
  }

  public void setTcfrzsat(float[] value) {
    temcoreJNI.SoilLookup_tcfrzsat_set(swigCPtr, this, value);
  }

  public float[] getTcfrzsat() {
    return temcoreJNI.SoilLookup_tcfrzsat_get(swigCPtr, this);
  }

  public void setTcdry(float[] value) {
    temcoreJNI.SoilLookup_tcdry_set(swigCPtr, this, value);
  }

  public float[] getTcdry() {
    return temcoreJNI.SoilLookup_tcdry_get(swigCPtr, this);
  }

  public void setAlbsatvis(float[] value) {
    temcoreJNI.SoilLookup_albsatvis_set(swigCPtr, this, value);
  }

  public float[] getAlbsatvis() {
    return temcoreJNI.SoilLookup_albsatvis_get(swigCPtr, this);
  }

  public void setAlbsatnir(float[] value) {
    temcoreJNI.SoilLookup_albsatnir_set(swigCPtr, this, value);
  }

  public float[] getAlbsatnir() {
    return temcoreJNI.SoilLookup_albsatnir_get(swigCPtr, this);
  }

  public void setAlbdryvis(float[] value) {
    temcoreJNI.SoilLookup_albdryvis_set(swigCPtr, this, value);
  }

  public float[] getAlbdryvis() {
    return temcoreJNI.SoilLookup_albdryvis_get(swigCPtr, this);
  }

  public void setAlbdrynir(float[] value) {
    temcoreJNI.SoilLookup_albdrynir_set(swigCPtr, this, value);
  }

  public float[] getAlbdrynir() {
    return temcoreJNI.SoilLookup_albdrynir_get(swigCPtr, this);
  }

  public void setHk(SWIGTYPE_p_a_MAX_SM__float value) {
    temcoreJNI.SoilLookup_hk_set(swigCPtr, this, SWIGTYPE_p_a_MAX_SM__float.getCPtr(value));
  }

  public SWIGTYPE_p_a_MAX_SM__float getHk() {
    long cPtr = temcoreJNI.SoilLookup_hk_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_MAX_SM__float(cPtr, false);
  }

  public void setPsi(SWIGTYPE_p_a_MAX_SM__float value) {
    temcoreJNI.SoilLookup_psi_set(swigCPtr, this, SWIGTYPE_p_a_MAX_SM__float.getCPtr(value));
  }

  public SWIGTYPE_p_a_MAX_SM__float getPsi() {
    long cPtr = temcoreJNI.SoilLookup_psi_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_MAX_SM__float(cPtr, false);
  }

}
