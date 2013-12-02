/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class RestartData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RestartData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RestartData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_RestartData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RestartData() {
    this(temcoreJNI.new_RestartData(), true);
  }

  public void reinitValue() {
    temcoreJNI.RestartData_reinitValue(swigCPtr, this);
  }

  public void setChtid(int value) {
    temcoreJNI.RestartData_chtid_set(swigCPtr, this, value);
  }

  public int getChtid() {
    return temcoreJNI.RestartData_chtid_get(swigCPtr, this);
  }

  public void setDsr(int value) {
    temcoreJNI.RestartData_dsr_set(swigCPtr, this, value);
  }

  public int getDsr() {
    return temcoreJNI.RestartData_dsr_get(swigCPtr, this);
  }

  public void setFirea2sorgn(double value) {
    temcoreJNI.RestartData_firea2sorgn_set(swigCPtr, this, value);
  }

  public double getFirea2sorgn() {
    return temcoreJNI.RestartData_firea2sorgn_get(swigCPtr, this);
  }

  public void setYrsdist(int value) {
    temcoreJNI.RestartData_yrsdist_set(swigCPtr, this, value);
  }

  public int getYrsdist() {
    return temcoreJNI.RestartData_yrsdist_get(swigCPtr, this);
  }

  public void setIfwoody(int[] value) {
    temcoreJNI.RestartData_ifwoody_set(swigCPtr, this, value);
  }

  public int[] getIfwoody() {
    return temcoreJNI.RestartData_ifwoody_get(swigCPtr, this);
  }

  public void setIfdeciwoody(int[] value) {
    temcoreJNI.RestartData_ifdeciwoody_set(swigCPtr, this, value);
  }

  public int[] getIfdeciwoody() {
    return temcoreJNI.RestartData_ifdeciwoody_get(swigCPtr, this);
  }

  public void setIfperenial(int[] value) {
    temcoreJNI.RestartData_ifperenial_set(swigCPtr, this, value);
  }

  public int[] getIfperenial() {
    return temcoreJNI.RestartData_ifperenial_get(swigCPtr, this);
  }

  public void setNonvascular(int[] value) {
    temcoreJNI.RestartData_nonvascular_set(swigCPtr, this, value);
  }

  public int[] getNonvascular() {
    return temcoreJNI.RestartData_nonvascular_get(swigCPtr, this);
  }

  public void setVegage(int[] value) {
    temcoreJNI.RestartData_vegage_set(swigCPtr, this, value);
  }

  public int[] getVegage() {
    return temcoreJNI.RestartData_vegage_get(swigCPtr, this);
  }

  public void setVegcov(double[] value) {
    temcoreJNI.RestartData_vegcov_set(swigCPtr, this, value);
  }

  public double[] getVegcov() {
    return temcoreJNI.RestartData_vegcov_get(swigCPtr, this);
  }

  public void setLai(double[] value) {
    temcoreJNI.RestartData_lai_set(swigCPtr, this, value);
  }

  public double[] getLai() {
    return temcoreJNI.RestartData_lai_get(swigCPtr, this);
  }

  public void setRootfrac(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.RestartData_rootfrac_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getRootfrac() {
    long cPtr = temcoreJNI.RestartData_rootfrac_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setVegwater(double[] value) {
    temcoreJNI.RestartData_vegwater_set(swigCPtr, this, value);
  }

  public double[] getVegwater() {
    return temcoreJNI.RestartData_vegwater_get(swigCPtr, this);
  }

  public void setVegsnow(double[] value) {
    temcoreJNI.RestartData_vegsnow_set(swigCPtr, this, value);
  }

  public double[] getVegsnow() {
    return temcoreJNI.RestartData_vegsnow_get(swigCPtr, this);
  }

  public void setVegc(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.RestartData_vegc_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getVegc() {
    long cPtr = temcoreJNI.RestartData_vegc_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setLabn(double[] value) {
    temcoreJNI.RestartData_labn_set(swigCPtr, this, value);
  }

  public double[] getLabn() {
    return temcoreJNI.RestartData_labn_get(swigCPtr, this);
  }

  public void setStrn(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.RestartData_strn_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getStrn() {
    long cPtr = temcoreJNI.RestartData_strn_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setDeadc(double[] value) {
    temcoreJNI.RestartData_deadc_set(swigCPtr, this, value);
  }

  public double[] getDeadc() {
    return temcoreJNI.RestartData_deadc_get(swigCPtr, this);
  }

  public void setDeadn(double[] value) {
    temcoreJNI.RestartData_deadn_set(swigCPtr, this, value);
  }

  public double[] getDeadn() {
    return temcoreJNI.RestartData_deadn_get(swigCPtr, this);
  }

  public void setTopt(double[] value) {
    temcoreJNI.RestartData_topt_set(swigCPtr, this, value);
  }

  public double[] getTopt() {
    return temcoreJNI.RestartData_topt_get(swigCPtr, this);
  }

  public void setEetmx(double[] value) {
    temcoreJNI.RestartData_eetmx_set(swigCPtr, this, value);
  }

  public double[] getEetmx() {
    return temcoreJNI.RestartData_eetmx_get(swigCPtr, this);
  }

  public void setUnnormleafmx(double[] value) {
    temcoreJNI.RestartData_unnormleafmx_set(swigCPtr, this, value);
  }

  public double[] getUnnormleafmx() {
    return temcoreJNI.RestartData_unnormleafmx_get(swigCPtr, this);
  }

  public void setGrowingttime(double[] value) {
    temcoreJNI.RestartData_growingttime_set(swigCPtr, this, value);
  }

  public double[] getGrowingttime() {
    return temcoreJNI.RestartData_growingttime_get(swigCPtr, this);
  }

  public void setFoliagemx(double[] value) {
    temcoreJNI.RestartData_foliagemx_set(swigCPtr, this, value);
  }

  public double[] getFoliagemx() {
    return temcoreJNI.RestartData_foliagemx_get(swigCPtr, this);
  }

  public void setToptA(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.RestartData_toptA_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getToptA() {
    long cPtr = temcoreJNI.RestartData_toptA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setEetmxA(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.RestartData_eetmxA_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getEetmxA() {
    long cPtr = temcoreJNI.RestartData_eetmxA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setUnnormleafmxA(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.RestartData_unnormleafmxA_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getUnnormleafmxA() {
    long cPtr = temcoreJNI.RestartData_unnormleafmxA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setGrowingttimeA(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.RestartData_growingttimeA_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getGrowingttimeA() {
    long cPtr = temcoreJNI.RestartData_growingttimeA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setNumsnwl(int value) {
    temcoreJNI.RestartData_numsnwl_set(swigCPtr, this, value);
  }

  public int getNumsnwl() {
    return temcoreJNI.RestartData_numsnwl_get(swigCPtr, this);
  }

  public void setSnwextramass(double value) {
    temcoreJNI.RestartData_snwextramass_set(swigCPtr, this, value);
  }

  public double getSnwextramass() {
    return temcoreJNI.RestartData_snwextramass_get(swigCPtr, this);
  }

  public void setTSsnow(double[] value) {
    temcoreJNI.RestartData_TSsnow_set(swigCPtr, this, value);
  }

  public double[] getTSsnow() {
    return temcoreJNI.RestartData_TSsnow_get(swigCPtr, this);
  }

  public void setDZsnow(double[] value) {
    temcoreJNI.RestartData_DZsnow_set(swigCPtr, this, value);
  }

  public double[] getDZsnow() {
    return temcoreJNI.RestartData_DZsnow_get(swigCPtr, this);
  }

  public void setLIQsnow(double[] value) {
    temcoreJNI.RestartData_LIQsnow_set(swigCPtr, this, value);
  }

  public double[] getLIQsnow() {
    return temcoreJNI.RestartData_LIQsnow_get(swigCPtr, this);
  }

  public void setRHOsnow(double[] value) {
    temcoreJNI.RestartData_RHOsnow_set(swigCPtr, this, value);
  }

  public double[] getRHOsnow() {
    return temcoreJNI.RestartData_RHOsnow_get(swigCPtr, this);
  }

  public void setICEsnow(double[] value) {
    temcoreJNI.RestartData_ICEsnow_set(swigCPtr, this, value);
  }

  public double[] getICEsnow() {
    return temcoreJNI.RestartData_ICEsnow_get(swigCPtr, this);
  }

  public void setAGEsnow(double[] value) {
    temcoreJNI.RestartData_AGEsnow_set(swigCPtr, this, value);
  }

  public double[] getAGEsnow() {
    return temcoreJNI.RestartData_AGEsnow_get(swigCPtr, this);
  }

  public void setNumsl(int value) {
    temcoreJNI.RestartData_numsl_set(swigCPtr, this, value);
  }

  public int getNumsl() {
    return temcoreJNI.RestartData_numsl_get(swigCPtr, this);
  }

  public void setMonthsfrozen(double value) {
    temcoreJNI.RestartData_monthsfrozen_set(swigCPtr, this, value);
  }

  public double getMonthsfrozen() {
    return temcoreJNI.RestartData_monthsfrozen_get(swigCPtr, this);
  }

  public void setRtfrozendays(int value) {
    temcoreJNI.RestartData_rtfrozendays_set(swigCPtr, this, value);
  }

  public int getRtfrozendays() {
    return temcoreJNI.RestartData_rtfrozendays_get(swigCPtr, this);
  }

  public void setRtunfrozendays(int value) {
    temcoreJNI.RestartData_rtunfrozendays_set(swigCPtr, this, value);
  }

  public int getRtunfrozendays() {
    return temcoreJNI.RestartData_rtunfrozendays_get(swigCPtr, this);
  }

  public void setWatertab(double value) {
    temcoreJNI.RestartData_watertab_set(swigCPtr, this, value);
  }

  public double getWatertab() {
    return temcoreJNI.RestartData_watertab_get(swigCPtr, this);
  }

  public void setDZsoil(double[] value) {
    temcoreJNI.RestartData_DZsoil_set(swigCPtr, this, value);
  }

  public double[] getDZsoil() {
    return temcoreJNI.RestartData_DZsoil_get(swigCPtr, this);
  }

  public void setTYPEsoil(int[] value) {
    temcoreJNI.RestartData_TYPEsoil_set(swigCPtr, this, value);
  }

  public int[] getTYPEsoil() {
    return temcoreJNI.RestartData_TYPEsoil_get(swigCPtr, this);
  }

  public void setAGEsoil(int[] value) {
    temcoreJNI.RestartData_AGEsoil_set(swigCPtr, this, value);
  }

  public int[] getAGEsoil() {
    return temcoreJNI.RestartData_AGEsoil_get(swigCPtr, this);
  }

  public void setTSsoil(double[] value) {
    temcoreJNI.RestartData_TSsoil_set(swigCPtr, this, value);
  }

  public double[] getTSsoil() {
    return temcoreJNI.RestartData_TSsoil_get(swigCPtr, this);
  }

  public void setLIQsoil(double[] value) {
    temcoreJNI.RestartData_LIQsoil_set(swigCPtr, this, value);
  }

  public double[] getLIQsoil() {
    return temcoreJNI.RestartData_LIQsoil_get(swigCPtr, this);
  }

  public void setICEsoil(double[] value) {
    temcoreJNI.RestartData_ICEsoil_set(swigCPtr, this, value);
  }

  public double[] getICEsoil() {
    return temcoreJNI.RestartData_ICEsoil_get(swigCPtr, this);
  }

  public void setFROZENsoil(int[] value) {
    temcoreJNI.RestartData_FROZENsoil_set(swigCPtr, this, value);
  }

  public int[] getFROZENsoil() {
    return temcoreJNI.RestartData_FROZENsoil_get(swigCPtr, this);
  }

  public void setFROZENFRACsoil(double[] value) {
    temcoreJNI.RestartData_FROZENFRACsoil_set(swigCPtr, this, value);
  }

  public double[] getFROZENFRACsoil() {
    return temcoreJNI.RestartData_FROZENFRACsoil_get(swigCPtr, this);
  }

  public void setTEXTUREsoil(int[] value) {
    temcoreJNI.RestartData_TEXTUREsoil_set(swigCPtr, this, value);
  }

  public int[] getTEXTUREsoil() {
    return temcoreJNI.RestartData_TEXTUREsoil_get(swigCPtr, this);
  }

  public void setTSrock(double[] value) {
    temcoreJNI.RestartData_TSrock_set(swigCPtr, this, value);
  }

  public double[] getTSrock() {
    return temcoreJNI.RestartData_TSrock_get(swigCPtr, this);
  }

  public void setDZrock(double[] value) {
    temcoreJNI.RestartData_DZrock_set(swigCPtr, this, value);
  }

  public double[] getDZrock() {
    return temcoreJNI.RestartData_DZrock_get(swigCPtr, this);
  }

  public void setFrontZ(double[] value) {
    temcoreJNI.RestartData_frontZ_set(swigCPtr, this, value);
  }

  public double[] getFrontZ() {
    return temcoreJNI.RestartData_frontZ_get(swigCPtr, this);
  }

  public void setFrontFT(int[] value) {
    temcoreJNI.RestartData_frontFT_set(swigCPtr, this, value);
  }

  public int[] getFrontFT() {
    return temcoreJNI.RestartData_frontFT_get(swigCPtr, this);
  }

  public void setWdebrisc(double value) {
    temcoreJNI.RestartData_wdebrisc_set(swigCPtr, this, value);
  }

  public double getWdebrisc() {
    return temcoreJNI.RestartData_wdebrisc_get(swigCPtr, this);
  }

  public void setDmossc(double value) {
    temcoreJNI.RestartData_dmossc_set(swigCPtr, this, value);
  }

  public double getDmossc() {
    return temcoreJNI.RestartData_dmossc_get(swigCPtr, this);
  }

  public void setRawc(double[] value) {
    temcoreJNI.RestartData_rawc_set(swigCPtr, this, value);
  }

  public double[] getRawc() {
    return temcoreJNI.RestartData_rawc_get(swigCPtr, this);
  }

  public void setSoma(double[] value) {
    temcoreJNI.RestartData_soma_set(swigCPtr, this, value);
  }

  public double[] getSoma() {
    return temcoreJNI.RestartData_soma_get(swigCPtr, this);
  }

  public void setSompr(double[] value) {
    temcoreJNI.RestartData_sompr_set(swigCPtr, this, value);
  }

  public double[] getSompr() {
    return temcoreJNI.RestartData_sompr_get(swigCPtr, this);
  }

  public void setSomcr(double[] value) {
    temcoreJNI.RestartData_somcr_set(swigCPtr, this, value);
  }

  public double[] getSomcr() {
    return temcoreJNI.RestartData_somcr_get(swigCPtr, this);
  }

  public void setWdebrisn(double value) {
    temcoreJNI.RestartData_wdebrisn_set(swigCPtr, this, value);
  }

  public double getWdebrisn() {
    return temcoreJNI.RestartData_wdebrisn_get(swigCPtr, this);
  }

  public void setDmossn(double value) {
    temcoreJNI.RestartData_dmossn_set(swigCPtr, this, value);
  }

  public double getDmossn() {
    return temcoreJNI.RestartData_dmossn_get(swigCPtr, this);
  }

  public void setOrgn(double[] value) {
    temcoreJNI.RestartData_orgn_set(swigCPtr, this, value);
  }

  public double[] getOrgn() {
    return temcoreJNI.RestartData_orgn_get(swigCPtr, this);
  }

  public void setAvln(double[] value) {
    temcoreJNI.RestartData_avln_set(swigCPtr, this, value);
  }

  public double[] getAvln() {
    return temcoreJNI.RestartData_avln_get(swigCPtr, this);
  }

  public void setPrvltrfcnA(SWIGTYPE_p_a_MAX_SOI_LAY__double value) {
    temcoreJNI.RestartData_prvltrfcnA_set(swigCPtr, this, SWIGTYPE_p_a_MAX_SOI_LAY__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_MAX_SOI_LAY__double getPrvltrfcnA() {
    long cPtr = temcoreJNI.RestartData_prvltrfcnA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_MAX_SOI_LAY__double(cPtr, false);
  }

}
