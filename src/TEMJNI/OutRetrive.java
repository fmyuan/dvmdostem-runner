/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class OutRetrive {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OutRetrive(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OutRetrive obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_OutRetrive(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public OutRetrive() {
    this(temcoreJNI.new_OutRetrive(), true);
  }

  public void setCohortcount(int value) {
    temcoreJNI.OutRetrive_cohortcount_set(swigCPtr, this, value);
  }

  public int getCohortcount() {
    return temcoreJNI.OutRetrive_cohortcount_get(swigCPtr, this);
  }

  public void setRegnod(OutDataRegn value) {
    temcoreJNI.OutRetrive_regnod_set(swigCPtr, this, OutDataRegn.getCPtr(value), value);
  }

  public OutDataRegn getRegnod() {
    long cPtr = temcoreJNI.OutRetrive_regnod_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OutDataRegn(cPtr, false);
  }

  public void setResod(RestartData value) {
    temcoreJNI.OutRetrive_resod_set(swigCPtr, this, RestartData.getCPtr(value), value);
  }

  public RestartData getResod() {
    long cPtr = temcoreJNI.OutRetrive_resod_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RestartData(cPtr, false);
  }

  public void setDimensionData(CohortData cdp) {
    temcoreJNI.OutRetrive_setDimensionData(swigCPtr, this, CohortData.getCPtr(cdp), cdp);
  }

  public void setProcessData(int ip, EnvData edp, BgcData bdp) {
    temcoreJNI.OutRetrive_setProcessData(swigCPtr, this, ip, EnvData.getCPtr(edp), edp, BgcData.getCPtr(bdp), bdp);
  }

  public void setFireData(FirData fdp) {
    temcoreJNI.OutRetrive_setFireData(swigCPtr, this, FirData.getCPtr(fdp), fdp);
  }

  public void setRegnOutData(OutDataRegn regnodp) {
    temcoreJNI.OutRetrive_setRegnOutData(swigCPtr, this, OutDataRegn.getCPtr(regnodp), regnodp);
  }

  public void setRestartOutData(RestartData resodp) {
    temcoreJNI.OutRetrive_setRestartOutData(swigCPtr, this, RestartData.getCPtr(resodp), resodp);
  }

  public void updateRegnOutputBuffer(int im, int idoy) {
    temcoreJNI.OutRetrive_updateRegnOutputBuffer(swigCPtr, this, im, idoy);
  }

  public void updateRestartOutputBuffer(ModelData md) {
    temcoreJNI.OutRetrive_updateRestartOutputBuffer(swigCPtr, this, ModelData.getCPtr(md), md);
  }

}
