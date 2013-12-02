/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class BgcData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected BgcData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BgcData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_BgcData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BgcData() {
    this(temcoreJNI.new_BgcData(), true);
  }

  public void clear() {
    temcoreJNI.BgcData_clear(swigCPtr, this);
  }

  public void setCd(CohortData value) {
    temcoreJNI.BgcData_cd_set(swigCPtr, this, CohortData.getCPtr(value), value);
  }

  public CohortData getCd() {
    long cPtr = temcoreJNI.BgcData_cd_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CohortData(cPtr, false);
  }

  public void setM_vegs(vegstate_bgc value) {
    temcoreJNI.BgcData_m_vegs_set(swigCPtr, this, vegstate_bgc.getCPtr(value), value);
  }

  public vegstate_bgc getM_vegs() {
    long cPtr = temcoreJNI.BgcData_m_vegs_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vegstate_bgc(cPtr, false);
  }

  public void setM_sois(soistate_bgc value) {
    temcoreJNI.BgcData_m_sois_set(swigCPtr, this, soistate_bgc.getCPtr(value), value);
  }

  public soistate_bgc getM_sois() {
    long cPtr = temcoreJNI.BgcData_m_sois_get(swigCPtr, this);
    return (cPtr == 0) ? null : new soistate_bgc(cPtr, false);
  }

  public void setM_vegd(vegdiag_bgc value) {
    temcoreJNI.BgcData_m_vegd_set(swigCPtr, this, vegdiag_bgc.getCPtr(value), value);
  }

  public vegdiag_bgc getM_vegd() {
    long cPtr = temcoreJNI.BgcData_m_vegd_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vegdiag_bgc(cPtr, false);
  }

  public void setM_soid(soidiag_bgc value) {
    temcoreJNI.BgcData_m_soid_set(swigCPtr, this, soidiag_bgc.getCPtr(value), value);
  }

  public soidiag_bgc getM_soid() {
    long cPtr = temcoreJNI.BgcData_m_soid_get(swigCPtr, this);
    return (cPtr == 0) ? null : new soidiag_bgc(cPtr, false);
  }

  public void setM_l2a(lnd2atm_bgc value) {
    temcoreJNI.BgcData_m_l2a_set(swigCPtr, this, lnd2atm_bgc.getCPtr(value), value);
  }

  public lnd2atm_bgc getM_l2a() {
    long cPtr = temcoreJNI.BgcData_m_l2a_get(swigCPtr, this);
    return (cPtr == 0) ? null : new lnd2atm_bgc(cPtr, false);
  }

  public void setM_a2v(atm2veg_bgc value) {
    temcoreJNI.BgcData_m_a2v_set(swigCPtr, this, atm2veg_bgc.getCPtr(value), value);
  }

  public atm2veg_bgc getM_a2v() {
    long cPtr = temcoreJNI.BgcData_m_a2v_get(swigCPtr, this);
    return (cPtr == 0) ? null : new atm2veg_bgc(cPtr, false);
  }

  public void setM_v2a(veg2atm_bgc value) {
    temcoreJNI.BgcData_m_v2a_set(swigCPtr, this, veg2atm_bgc.getCPtr(value), value);
  }

  public veg2atm_bgc getM_v2a() {
    long cPtr = temcoreJNI.BgcData_m_v2a_get(swigCPtr, this);
    return (cPtr == 0) ? null : new veg2atm_bgc(cPtr, false);
  }

  public void setM_v2soi(veg2soi_bgc value) {
    temcoreJNI.BgcData_m_v2soi_set(swigCPtr, this, veg2soi_bgc.getCPtr(value), value);
  }

  public veg2soi_bgc getM_v2soi() {
    long cPtr = temcoreJNI.BgcData_m_v2soi_get(swigCPtr, this);
    return (cPtr == 0) ? null : new veg2soi_bgc(cPtr, false);
  }

  public void setM_soi2v(soi2veg_bgc value) {
    temcoreJNI.BgcData_m_soi2v_set(swigCPtr, this, soi2veg_bgc.getCPtr(value), value);
  }

  public soi2veg_bgc getM_soi2v() {
    long cPtr = temcoreJNI.BgcData_m_soi2v_get(swigCPtr, this);
    return (cPtr == 0) ? null : new soi2veg_bgc(cPtr, false);
  }

  public void setM_v2v(veg2veg_bgc value) {
    temcoreJNI.BgcData_m_v2v_set(swigCPtr, this, veg2veg_bgc.getCPtr(value), value);
  }

  public veg2veg_bgc getM_v2v() {
    long cPtr = temcoreJNI.BgcData_m_v2v_get(swigCPtr, this);
    return (cPtr == 0) ? null : new veg2veg_bgc(cPtr, false);
  }

  public void setM_soi2l(soi2lnd_bgc value) {
    temcoreJNI.BgcData_m_soi2l_set(swigCPtr, this, soi2lnd_bgc.getCPtr(value), value);
  }

  public soi2lnd_bgc getM_soi2l() {
    long cPtr = temcoreJNI.BgcData_m_soi2l_get(swigCPtr, this);
    return (cPtr == 0) ? null : new soi2lnd_bgc(cPtr, false);
  }

  public void setM_soi2a(soi2atm_bgc value) {
    temcoreJNI.BgcData_m_soi2a_set(swigCPtr, this, soi2atm_bgc.getCPtr(value), value);
  }

  public soi2atm_bgc getM_soi2a() {
    long cPtr = temcoreJNI.BgcData_m_soi2a_get(swigCPtr, this);
    return (cPtr == 0) ? null : new soi2atm_bgc(cPtr, false);
  }

  public void setM_a2soi(atm2soi_bgc value) {
    temcoreJNI.BgcData_m_a2soi_set(swigCPtr, this, atm2soi_bgc.getCPtr(value), value);
  }

  public atm2soi_bgc getM_a2soi() {
    long cPtr = temcoreJNI.BgcData_m_a2soi_get(swigCPtr, this);
    return (cPtr == 0) ? null : new atm2soi_bgc(cPtr, false);
  }

  public void setM_soi2soi(soi2soi_bgc value) {
    temcoreJNI.BgcData_m_soi2soi_set(swigCPtr, this, soi2soi_bgc.getCPtr(value), value);
  }

  public soi2soi_bgc getM_soi2soi() {
    long cPtr = temcoreJNI.BgcData_m_soi2soi_get(swigCPtr, this);
    return (cPtr == 0) ? null : new soi2soi_bgc(cPtr, false);
  }

  public void setY_vegs(vegstate_bgc value) {
    temcoreJNI.BgcData_y_vegs_set(swigCPtr, this, vegstate_bgc.getCPtr(value), value);
  }

  public vegstate_bgc getY_vegs() {
    long cPtr = temcoreJNI.BgcData_y_vegs_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vegstate_bgc(cPtr, false);
  }

  public void setY_sois(soistate_bgc value) {
    temcoreJNI.BgcData_y_sois_set(swigCPtr, this, soistate_bgc.getCPtr(value), value);
  }

  public soistate_bgc getY_sois() {
    long cPtr = temcoreJNI.BgcData_y_sois_get(swigCPtr, this);
    return (cPtr == 0) ? null : new soistate_bgc(cPtr, false);
  }

  public void setY_vegd(vegdiag_bgc value) {
    temcoreJNI.BgcData_y_vegd_set(swigCPtr, this, vegdiag_bgc.getCPtr(value), value);
  }

  public vegdiag_bgc getY_vegd() {
    long cPtr = temcoreJNI.BgcData_y_vegd_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vegdiag_bgc(cPtr, false);
  }

  public void setY_soid(soidiag_bgc value) {
    temcoreJNI.BgcData_y_soid_set(swigCPtr, this, soidiag_bgc.getCPtr(value), value);
  }

  public soidiag_bgc getY_soid() {
    long cPtr = temcoreJNI.BgcData_y_soid_get(swigCPtr, this);
    return (cPtr == 0) ? null : new soidiag_bgc(cPtr, false);
  }

  public void setY_l2a(lnd2atm_bgc value) {
    temcoreJNI.BgcData_y_l2a_set(swigCPtr, this, lnd2atm_bgc.getCPtr(value), value);
  }

  public lnd2atm_bgc getY_l2a() {
    long cPtr = temcoreJNI.BgcData_y_l2a_get(swigCPtr, this);
    return (cPtr == 0) ? null : new lnd2atm_bgc(cPtr, false);
  }

  public void setY_a2v(atm2veg_bgc value) {
    temcoreJNI.BgcData_y_a2v_set(swigCPtr, this, atm2veg_bgc.getCPtr(value), value);
  }

  public atm2veg_bgc getY_a2v() {
    long cPtr = temcoreJNI.BgcData_y_a2v_get(swigCPtr, this);
    return (cPtr == 0) ? null : new atm2veg_bgc(cPtr, false);
  }

  public void setY_v2a(veg2atm_bgc value) {
    temcoreJNI.BgcData_y_v2a_set(swigCPtr, this, veg2atm_bgc.getCPtr(value), value);
  }

  public veg2atm_bgc getY_v2a() {
    long cPtr = temcoreJNI.BgcData_y_v2a_get(swigCPtr, this);
    return (cPtr == 0) ? null : new veg2atm_bgc(cPtr, false);
  }

  public void setY_v2soi(veg2soi_bgc value) {
    temcoreJNI.BgcData_y_v2soi_set(swigCPtr, this, veg2soi_bgc.getCPtr(value), value);
  }

  public veg2soi_bgc getY_v2soi() {
    long cPtr = temcoreJNI.BgcData_y_v2soi_get(swigCPtr, this);
    return (cPtr == 0) ? null : new veg2soi_bgc(cPtr, false);
  }

  public void setY_soi2v(soi2veg_bgc value) {
    temcoreJNI.BgcData_y_soi2v_set(swigCPtr, this, soi2veg_bgc.getCPtr(value), value);
  }

  public soi2veg_bgc getY_soi2v() {
    long cPtr = temcoreJNI.BgcData_y_soi2v_get(swigCPtr, this);
    return (cPtr == 0) ? null : new soi2veg_bgc(cPtr, false);
  }

  public void setY_v2v(veg2veg_bgc value) {
    temcoreJNI.BgcData_y_v2v_set(swigCPtr, this, veg2veg_bgc.getCPtr(value), value);
  }

  public veg2veg_bgc getY_v2v() {
    long cPtr = temcoreJNI.BgcData_y_v2v_get(swigCPtr, this);
    return (cPtr == 0) ? null : new veg2veg_bgc(cPtr, false);
  }

  public void setY_soi2l(soi2lnd_bgc value) {
    temcoreJNI.BgcData_y_soi2l_set(swigCPtr, this, soi2lnd_bgc.getCPtr(value), value);
  }

  public soi2lnd_bgc getY_soi2l() {
    long cPtr = temcoreJNI.BgcData_y_soi2l_get(swigCPtr, this);
    return (cPtr == 0) ? null : new soi2lnd_bgc(cPtr, false);
  }

  public void setY_soi2a(soi2atm_bgc value) {
    temcoreJNI.BgcData_y_soi2a_set(swigCPtr, this, soi2atm_bgc.getCPtr(value), value);
  }

  public soi2atm_bgc getY_soi2a() {
    long cPtr = temcoreJNI.BgcData_y_soi2a_get(swigCPtr, this);
    return (cPtr == 0) ? null : new soi2atm_bgc(cPtr, false);
  }

  public void setY_a2soi(atm2soi_bgc value) {
    temcoreJNI.BgcData_y_a2soi_set(swigCPtr, this, atm2soi_bgc.getCPtr(value), value);
  }

  public atm2soi_bgc getY_a2soi() {
    long cPtr = temcoreJNI.BgcData_y_a2soi_get(swigCPtr, this);
    return (cPtr == 0) ? null : new atm2soi_bgc(cPtr, false);
  }

  public void setY_soi2soi(soi2soi_bgc value) {
    temcoreJNI.BgcData_y_soi2soi_set(swigCPtr, this, soi2soi_bgc.getCPtr(value), value);
  }

  public soi2soi_bgc getY_soi2soi() {
    long cPtr = temcoreJNI.BgcData_y_soi2soi_get(swigCPtr, this);
    return (cPtr == 0) ? null : new soi2soi_bgc(cPtr, false);
  }

  public void setPrvltrfcnque(SWIGTYPE_p_dequeT_double_t value) {
    temcoreJNI.BgcData_prvltrfcnque_set(swigCPtr, this, SWIGTYPE_p_dequeT_double_t.getCPtr(value));
  }

  public SWIGTYPE_p_dequeT_double_t getPrvltrfcnque() {
    long cPtr = temcoreJNI.BgcData_prvltrfcnque_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_dequeT_double_t(cPtr, false);
  }

  public void land_beginOfYear() {
    temcoreJNI.BgcData_land_beginOfYear(swigCPtr, this);
  }

  public void land_endOfMonth() {
    temcoreJNI.BgcData_land_endOfMonth(swigCPtr, this);
  }

  public void veg_beginOfYear() {
    temcoreJNI.BgcData_veg_beginOfYear(swigCPtr, this);
  }

  public void veg_beginOfMonth() {
    temcoreJNI.BgcData_veg_beginOfMonth(swigCPtr, this);
  }

  public void veg_endOfMonth() {
    temcoreJNI.BgcData_veg_endOfMonth(swigCPtr, this);
  }

  public void veg_endOfYear() {
    temcoreJNI.BgcData_veg_endOfYear(swigCPtr, this);
  }

  public void soil_beginOfYear() {
    temcoreJNI.BgcData_soil_beginOfYear(swigCPtr, this);
  }

  public void soil_beginOfMonth() {
    temcoreJNI.BgcData_soil_beginOfMonth(swigCPtr, this);
  }

  public void soil_endOfMonth() {
    temcoreJNI.BgcData_soil_endOfMonth(swigCPtr, this);
  }

}
