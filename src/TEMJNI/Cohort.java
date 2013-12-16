/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class Cohort {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Cohort(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Cohort obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_Cohort(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Cohort() {
    this(temcoreJNI.new_Cohort(), true);
  }

  public void setErrorid(int value) {
    temcoreJNI.Cohort_errorid_set(swigCPtr, this, value);
  }

  public int getErrorid() {
    return temcoreJNI.Cohort_errorid_get(swigCPtr, this);
  }

  public void setFailed(boolean value) {
    temcoreJNI.Cohort_failed_set(swigCPtr, this, value);
  }

  public boolean getFailed() {
    return temcoreJNI.Cohort_failed_get(swigCPtr, this);
  }

  public void setTimer(Timer value) {
    temcoreJNI.Cohort_timer_set(swigCPtr, this, Timer.getCPtr(value), value);
  }

  public Timer getTimer() {
    long cPtr = temcoreJNI.Cohort_timer_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Timer(cPtr, false);
  }

  public void setChtlu(CohortLookup value) {
    temcoreJNI.Cohort_chtlu_set(swigCPtr, this, CohortLookup.getCPtr(value), value);
  }

  public CohortLookup getChtlu() {
    long cPtr = temcoreJNI.Cohort_chtlu_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CohortLookup(cPtr, false);
  }

  public void setAtm(SWIGTYPE_p_Atmosphere value) {
    temcoreJNI.Cohort_atm_set(swigCPtr, this, SWIGTYPE_p_Atmosphere.getCPtr(value));
  }

  public SWIGTYPE_p_Atmosphere getAtm() {
    return new SWIGTYPE_p_Atmosphere(temcoreJNI.Cohort_atm_get(swigCPtr, this), true);
  }

  public void setVeg(SWIGTYPE_p_Vegetation value) {
    temcoreJNI.Cohort_veg_set(swigCPtr, this, SWIGTYPE_p_Vegetation.getCPtr(value));
  }

  public SWIGTYPE_p_Vegetation getVeg() {
    return new SWIGTYPE_p_Vegetation(temcoreJNI.Cohort_veg_get(swigCPtr, this), true);
  }

  public void setGround(SWIGTYPE_p_Ground value) {
    temcoreJNI.Cohort_ground_set(swigCPtr, this, SWIGTYPE_p_Ground.getCPtr(value));
  }

  public SWIGTYPE_p_Ground getGround() {
    return new SWIGTYPE_p_Ground(temcoreJNI.Cohort_ground_get(swigCPtr, this), true);
  }

  public void setVegenv(SWIGTYPE_p_Vegetation_Env value) {
    temcoreJNI.Cohort_vegenv_set(swigCPtr, this, SWIGTYPE_p_Vegetation_Env.getCPtr(value));
  }

  public SWIGTYPE_p_Vegetation_Env getVegenv() {
    long cPtr = temcoreJNI.Cohort_vegenv_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Vegetation_Env(cPtr, false);
  }

  public void setSnowenv(SWIGTYPE_p_Snow_Env value) {
    temcoreJNI.Cohort_snowenv_set(swigCPtr, this, SWIGTYPE_p_Snow_Env.getCPtr(value));
  }

  public SWIGTYPE_p_Snow_Env getSnowenv() {
    return new SWIGTYPE_p_Snow_Env(temcoreJNI.Cohort_snowenv_get(swigCPtr, this), true);
  }

  public void setSoilenv(SWIGTYPE_p_Soil_Env value) {
    temcoreJNI.Cohort_soilenv_set(swigCPtr, this, SWIGTYPE_p_Soil_Env.getCPtr(value));
  }

  public SWIGTYPE_p_Soil_Env getSoilenv() {
    return new SWIGTYPE_p_Soil_Env(temcoreJNI.Cohort_soilenv_get(swigCPtr, this), true);
  }

  public void setSolprntenv(SWIGTYPE_p_SoilParent_Env value) {
    temcoreJNI.Cohort_solprntenv_set(swigCPtr, this, SWIGTYPE_p_SoilParent_Env.getCPtr(value));
  }

  public SWIGTYPE_p_SoilParent_Env getSolprntenv() {
    return new SWIGTYPE_p_SoilParent_Env(temcoreJNI.Cohort_solprntenv_get(swigCPtr, this), true);
  }

  public void setVegbgc(SWIGTYPE_p_Vegetation_Bgc value) {
    temcoreJNI.Cohort_vegbgc_set(swigCPtr, this, SWIGTYPE_p_Vegetation_Bgc.getCPtr(value));
  }

  public SWIGTYPE_p_Vegetation_Bgc getVegbgc() {
    long cPtr = temcoreJNI.Cohort_vegbgc_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Vegetation_Bgc(cPtr, false);
  }

  public void setSoilbgc(SWIGTYPE_p_Soil_Bgc value) {
    temcoreJNI.Cohort_soilbgc_set(swigCPtr, this, SWIGTYPE_p_Soil_Bgc.getCPtr(value));
  }

  public SWIGTYPE_p_Soil_Bgc getSoilbgc() {
    return new SWIGTYPE_p_Soil_Bgc(temcoreJNI.Cohort_soilbgc_get(swigCPtr, this), true);
  }

  public void setFire(SWIGTYPE_p_WildFire value) {
    temcoreJNI.Cohort_fire_set(swigCPtr, this, SWIGTYPE_p_WildFire.getCPtr(value));
  }

  public SWIGTYPE_p_WildFire getFire() {
    return new SWIGTYPE_p_WildFire(temcoreJNI.Cohort_fire_get(swigCPtr, this), true);
  }

  public void setOutbuffer(OutRetrive value) {
    temcoreJNI.Cohort_outbuffer_set(swigCPtr, this, OutRetrive.getCPtr(value), value);
  }

  public OutRetrive getOutbuffer() {
    long cPtr = temcoreJNI.Cohort_outbuffer_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OutRetrive(cPtr, false);
  }

  public void setEd(EnvData value) {
    temcoreJNI.Cohort_ed_set(swigCPtr, this, EnvData.getCPtr(value), value);
  }

  public EnvData getEd() {
    long cPtr = temcoreJNI.Cohort_ed_get(swigCPtr, this);
    return (cPtr == 0) ? null : new EnvData(cPtr, false);
  }

  public void setBd(BgcData value) {
    temcoreJNI.Cohort_bd_set(swigCPtr, this, BgcData.getCPtr(value), value);
  }

  public BgcData getBd() {
    long cPtr = temcoreJNI.Cohort_bd_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BgcData(cPtr, false);
  }

  public void setEdall(EnvData value) {
    temcoreJNI.Cohort_edall_set(swigCPtr, this, EnvData.getCPtr(value), value);
  }

  public EnvData getEdall() {
    long cPtr = temcoreJNI.Cohort_edall_get(swigCPtr, this);
    return (cPtr == 0) ? null : new EnvData(cPtr, false);
  }

  public void setBdall(BgcData value) {
    temcoreJNI.Cohort_bdall_set(swigCPtr, this, BgcData.getCPtr(value), value);
  }

  public BgcData getBdall() {
    long cPtr = temcoreJNI.Cohort_bdall_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BgcData(cPtr, false);
  }

  public void setFd(FirData value) {
    temcoreJNI.Cohort_fd_set(swigCPtr, this, FirData.getCPtr(value), value);
  }

  public FirData getFd() {
    long cPtr = temcoreJNI.Cohort_fd_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FirData(cPtr, false);
  }

  public void setMd(ModelData value) {
    temcoreJNI.Cohort_md_set(swigCPtr, this, ModelData.getCPtr(value), value);
  }

  public ModelData getMd() {
    long cPtr = temcoreJNI.Cohort_md_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelData(cPtr, false);
  }

  public void setRd(RegionData value) {
    temcoreJNI.Cohort_rd_set(swigCPtr, this, RegionData.getCPtr(value), value);
  }

  public RegionData getRd() {
    long cPtr = temcoreJNI.Cohort_rd_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RegionData(cPtr, false);
  }

  public void setGd(GridData value) {
    temcoreJNI.Cohort_gd_set(swigCPtr, this, GridData.getCPtr(value), value);
  }

  public GridData getGd() {
    long cPtr = temcoreJNI.Cohort_gd_get(swigCPtr, this);
    return (cPtr == 0) ? null : new GridData(cPtr, false);
  }

  public void setCd(CohortData value) {
    temcoreJNI.Cohort_cd_set(swigCPtr, this, CohortData.getCPtr(value), value);
  }

  public CohortData getCd() {
    long cPtr = temcoreJNI.Cohort_cd_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CohortData(cPtr, false);
  }

  public void setResid(RestartData value) {
    temcoreJNI.Cohort_resid_set(swigCPtr, this, RestartData.getCPtr(value), value);
  }

  public RestartData getResid() {
    long cPtr = temcoreJNI.Cohort_resid_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RestartData(cPtr, false);
  }

  public void initSubmodules() {
    temcoreJNI.Cohort_initSubmodules(swigCPtr, this);
  }

  public void setTime(Timer timerp) {
    temcoreJNI.Cohort_setTime(swigCPtr, this, Timer.getCPtr(timerp), timerp);
  }

  public void setModelData(ModelData md) {
    temcoreJNI.Cohort_setModelData(swigCPtr, this, ModelData.getCPtr(md), md);
  }

  public void setInputData(RegionData rd, GridData gd) {
    temcoreJNI.Cohort_setInputData(swigCPtr, this, RegionData.getCPtr(rd), rd, GridData.getCPtr(gd), gd);
  }

  public void setProcessData(EnvData alledp, BgcData allbdp, FirData fdp) {
    temcoreJNI.Cohort_setProcessData(swigCPtr, this, EnvData.getCPtr(alledp), alledp, BgcData.getCPtr(allbdp), allbdp, FirData.getCPtr(fdp), fdp);
  }

  public void initStatePar() {
    temcoreJNI.Cohort_initStatePar(swigCPtr, this);
  }

  public void prepareAllDrivingData() {
    temcoreJNI.Cohort_prepareAllDrivingData(swigCPtr, this);
  }

  public void prepareDayDrivingData(int yrcnt, int usedatmyr) {
    temcoreJNI.Cohort_prepareDayDrivingData(swigCPtr, this, yrcnt, usedatmyr);
  }

  public void updateMonthly(int yrcnt, int currmind, int dinmcurr) {
    temcoreJNI.Cohort_updateMonthly(swigCPtr, this, yrcnt, currmind, dinmcurr);
  }

}
