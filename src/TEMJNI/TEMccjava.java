/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class TEMccjava {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected TEMccjava(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TEMccjava obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_TEMccjava(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TEMccjava() {
    this(temcoreJNI.new_TEMccjava(), true);
  }

  public void setCht(Cohort value) {
    temcoreJNI.TEMccjava_cht_set(swigCPtr, this, Cohort.getCPtr(value), value);
  }

  public Cohort getCht() {
    long cPtr = temcoreJNI.TEMccjava_cht_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Cohort(cPtr, false);
  }

  public void setInitvegc(double[] value) {
    temcoreJNI.TEMccjava_initvegc_set(swigCPtr, this, value);
  }

  public double[] getInitvegc() {
    return temcoreJNI.TEMccjava_initvegc_get(swigCPtr, this);
  }

  public void setInitvegn(double[] value) {
    temcoreJNI.TEMccjava_initvegn_set(swigCPtr, this, value);
  }

  public double[] getInitvegn() {
    return temcoreJNI.TEMccjava_initvegn_get(swigCPtr, this);
  }

  public void setInitdeadc(double value) {
    temcoreJNI.TEMccjava_initdeadc_set(swigCPtr, this, value);
  }

  public double getInitdeadc() {
    return temcoreJNI.TEMccjava_initdeadc_get(swigCPtr, this);
  }

  public void setInitdeadn(double value) {
    temcoreJNI.TEMccjava_initdeadn_set(swigCPtr, this, value);
  }

  public double getInitdeadn() {
    return temcoreJNI.TEMccjava_initdeadn_get(swigCPtr, this);
  }

  public void setInitdmossthick(double value) {
    temcoreJNI.TEMccjava_initdmossthick_set(swigCPtr, this, value);
  }

  public double getInitdmossthick() {
    return temcoreJNI.TEMccjava_initdmossthick_get(swigCPtr, this);
  }

  public void setInitfibthick(double value) {
    temcoreJNI.TEMccjava_initfibthick_set(swigCPtr, this, value);
  }

  public double getInitfibthick() {
    return temcoreJNI.TEMccjava_initfibthick_get(swigCPtr, this);
  }

  public void setInithumthick(double value) {
    temcoreJNI.TEMccjava_inithumthick_set(swigCPtr, this, value);
  }

  public double getInithumthick() {
    return temcoreJNI.TEMccjava_inithumthick_get(swigCPtr, this);
  }

  public void setInitdmossc(double value) {
    temcoreJNI.TEMccjava_initdmossc_set(swigCPtr, this, value);
  }

  public double getInitdmossc() {
    return temcoreJNI.TEMccjava_initdmossc_get(swigCPtr, this);
  }

  public void setInitshlwc(double value) {
    temcoreJNI.TEMccjava_initshlwc_set(swigCPtr, this, value);
  }

  public double getInitshlwc() {
    return temcoreJNI.TEMccjava_initshlwc_get(swigCPtr, this);
  }

  public void setInitdeepc(double value) {
    temcoreJNI.TEMccjava_initdeepc_set(swigCPtr, this, value);
  }

  public double getInitdeepc() {
    return temcoreJNI.TEMccjava_initdeepc_get(swigCPtr, this);
  }

  public void setInitminec(double value) {
    temcoreJNI.TEMccjava_initminec_set(swigCPtr, this, value);
  }

  public double getInitminec() {
    return temcoreJNI.TEMccjava_initminec_get(swigCPtr, this);
  }

  public void setInitsoln(double value) {
    temcoreJNI.TEMccjava_initsoln_set(swigCPtr, this, value);
  }

  public double getInitsoln() {
    return temcoreJNI.TEMccjava_initsoln_get(swigCPtr, this);
  }

  public void setInitavln(double value) {
    temcoreJNI.TEMccjava_initavln_set(swigCPtr, this, value);
  }

  public double getInitavln() {
    return temcoreJNI.TEMccjava_initavln_get(swigCPtr, this);
  }

  public void setEd1pft(EnvData value) {
    temcoreJNI.TEMccjava_ed1pft_set(swigCPtr, this, EnvData.getCPtr(value), value);
  }

  public EnvData getEd1pft() {
    long cPtr = temcoreJNI.TEMccjava_ed1pft_get(swigCPtr, this);
    return (cPtr == 0) ? null : new EnvData(cPtr, false);
  }

  public void setBd1pft(BgcData value) {
    temcoreJNI.TEMccjava_bd1pft_set(swigCPtr, this, BgcData.getCPtr(value), value);
  }

  public BgcData getBd1pft() {
    long cPtr = temcoreJNI.TEMccjava_bd1pft_get(swigCPtr, this);
    return (cPtr == 0) ? null : new BgcData(cPtr, false);
  }

  public void setCd(CohortData value) {
    temcoreJNI.TEMccjava_cd_set(swigCPtr, this, CohortData.getCPtr(value), value);
  }

  public CohortData getCd() {
    long cPtr = temcoreJNI.TEMccjava_cd_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CohortData(cPtr, false);
  }

  public void setVcalpar1pft(vegpar_cal value) {
    temcoreJNI.TEMccjava_vcalpar1pft_set(swigCPtr, this, vegpar_cal.getCPtr(value), value);
  }

  public vegpar_cal getVcalpar1pft() {
    long cPtr = temcoreJNI.TEMccjava_vcalpar1pft_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vegpar_cal(cPtr, false);
  }

  public void setScalpar(soipar_cal value) {
    temcoreJNI.TEMccjava_scalpar_set(swigCPtr, this, soipar_cal.getCPtr(value), value);
  }

  public soipar_cal getScalpar() {
    long cPtr = temcoreJNI.TEMccjava_scalpar_get(swigCPtr, this);
    return (cPtr == 0) ? null : new soipar_cal(cPtr, false);
  }

  public void setCohort(Cohort cht) {
    temcoreJNI.TEMccjava_setCohort(swigCPtr, this, Cohort.getCPtr(cht), cht);
  }

  public void setInitVbState1pft(int ipft) {
    temcoreJNI.TEMccjava_setInitVbState1pft(swigCPtr, this, ipft);
  }

  public void setInitSbState() {
    temcoreJNI.TEMccjava_setInitSbState(swigCPtr, this);
  }

  public void setVbCalPar1pft(int ipft, vegpar_cal jvcalpar) {
    temcoreJNI.TEMccjava_setVbCalPar1pft(swigCPtr, this, ipft, vegpar_cal.getCPtr(jvcalpar), jvcalpar);
  }

  public void setSbCalPar(soipar_cal jscalpar) {
    temcoreJNI.TEMccjava_setSbCalPar(swigCPtr, this, soipar_cal.getCPtr(jscalpar), jscalpar);
  }

  public void getInitVbState1pft(int ipft) {
    temcoreJNI.TEMccjava_getInitVbState1pft(swigCPtr, this, ipft);
  }

  public void getInitSbState() {
    temcoreJNI.TEMccjava_getInitSbState(swigCPtr, this);
  }

  public void getVbCalPar1pft(int ipft) {
    temcoreJNI.TEMccjava_getVbCalPar1pft(swigCPtr, this, ipft);
  }

  public void getSbCalPar() {
    temcoreJNI.TEMccjava_getSbCalPar(swigCPtr, this);
  }

  public void getData1pft(int ipft) {
    temcoreJNI.TEMccjava_getData1pft(swigCPtr, this, ipft);
  }

}
