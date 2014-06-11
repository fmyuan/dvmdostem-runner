/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class CohortLookup {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CohortLookup(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CohortLookup obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_CohortLookup(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CohortLookup() {
    this(temcoreJNI.new_CohortLookup(), true);
  }

  public void setDir(String value) {
    temcoreJNI.CohortLookup_dir_set(swigCPtr, this, value);
  }

  public String getDir() {
    return temcoreJNI.CohortLookup_dir_get(swigCPtr, this);
  }

  public void setCmtcode(String value) {
    temcoreJNI.CohortLookup_cmtcode_set(swigCPtr, this, value);
  }

  public String getCmtcode() {
    return temcoreJNI.CohortLookup_cmtcode_get(swigCPtr, this);
  }

  public void init() {
    temcoreJNI.CohortLookup_init(swigCPtr, this);
  }

  public void assignBgcCalpar(SWIGTYPE_p_std__string dirname) {
    temcoreJNI.CohortLookup_assignBgcCalpar(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(dirname));
  }

  public void setCmax(double[] value) {
    temcoreJNI.CohortLookup_cmax_set(swigCPtr, this, value);
  }

  public double[] getCmax() {
    return temcoreJNI.CohortLookup_cmax_get(swigCPtr, this);
  }

  public void setNmax(double[] value) {
    temcoreJNI.CohortLookup_nmax_set(swigCPtr, this, value);
  }

  public double[] getNmax() {
    return temcoreJNI.CohortLookup_nmax_get(swigCPtr, this);
  }

  public void setCfall(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.CohortLookup_cfall_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getCfall() {
    long cPtr = temcoreJNI.CohortLookup_cfall_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setNfall(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.CohortLookup_nfall_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getNfall() {
    long cPtr = temcoreJNI.CohortLookup_nfall_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setKra(double[] value) {
    temcoreJNI.CohortLookup_kra_set(swigCPtr, this, value);
  }

  public double[] getKra() {
    return temcoreJNI.CohortLookup_kra_get(swigCPtr, this);
  }

  public void setKrb(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.CohortLookup_krb_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getKrb() {
    long cPtr = temcoreJNI.CohortLookup_krb_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setFrg(double[] value) {
    temcoreJNI.CohortLookup_frg_set(swigCPtr, this, value);
  }

  public double[] getFrg() {
    return temcoreJNI.CohortLookup_frg_get(swigCPtr, this);
  }

  public void setMicbnup(double value) {
    temcoreJNI.CohortLookup_micbnup_set(swigCPtr, this, value);
  }

  public double getMicbnup() {
    return temcoreJNI.CohortLookup_micbnup_get(swigCPtr, this);
  }

  public void setKdcmoss(double value) {
    temcoreJNI.CohortLookup_kdcmoss_set(swigCPtr, this, value);
  }

  public double getKdcmoss() {
    return temcoreJNI.CohortLookup_kdcmoss_get(swigCPtr, this);
  }

  public void setKdcrawc(double value) {
    temcoreJNI.CohortLookup_kdcrawc_set(swigCPtr, this, value);
  }

  public double getKdcrawc() {
    return temcoreJNI.CohortLookup_kdcrawc_get(swigCPtr, this);
  }

  public void setKdcsoma(double value) {
    temcoreJNI.CohortLookup_kdcsoma_set(swigCPtr, this, value);
  }

  public double getKdcsoma() {
    return temcoreJNI.CohortLookup_kdcsoma_get(swigCPtr, this);
  }

  public void setKdcsompr(double value) {
    temcoreJNI.CohortLookup_kdcsompr_set(swigCPtr, this, value);
  }

  public double getKdcsompr() {
    return temcoreJNI.CohortLookup_kdcsompr_get(swigCPtr, this);
  }

  public void setKdcsomcr(double value) {
    temcoreJNI.CohortLookup_kdcsomcr_set(swigCPtr, this, value);
  }

  public double getKdcsomcr() {
    return temcoreJNI.CohortLookup_kdcsomcr_get(swigCPtr, this);
  }

  public void setKdcratio4me(double value) {
    temcoreJNI.CohortLookup_kdcratio4me_set(swigCPtr, this, value);
  }

  public double getKdcratio4me() {
    return temcoreJNI.CohortLookup_kdcratio4me_get(swigCPtr, this);
  }

  public void setSla(double[] value) {
    temcoreJNI.CohortLookup_sla_set(swigCPtr, this, value);
  }

  public double[] getSla() {
    return temcoreJNI.CohortLookup_sla_get(swigCPtr, this);
  }

  public void setKlai(double[] value) {
    temcoreJNI.CohortLookup_klai_set(swigCPtr, this, value);
  }

  public double[] getKlai() {
    return temcoreJNI.CohortLookup_klai_get(swigCPtr, this);
  }

  public void setVegcov(double[] value) {
    temcoreJNI.CohortLookup_vegcov_set(swigCPtr, this, value);
  }

  public double[] getVegcov() {
    return temcoreJNI.CohortLookup_vegcov_get(swigCPtr, this);
  }

  public void setLai(double[] value) {
    temcoreJNI.CohortLookup_lai_set(swigCPtr, this, value);
  }

  public double[] getLai() {
    return temcoreJNI.CohortLookup_lai_get(swigCPtr, this);
  }

  public void setIfwoody(int[] value) {
    temcoreJNI.CohortLookup_ifwoody_set(swigCPtr, this, value);
  }

  public int[] getIfwoody() {
    return temcoreJNI.CohortLookup_ifwoody_get(swigCPtr, this);
  }

  public void setIfdeciwoody(int[] value) {
    temcoreJNI.CohortLookup_ifdeciwoody_set(swigCPtr, this, value);
  }

  public int[] getIfdeciwoody() {
    return temcoreJNI.CohortLookup_ifdeciwoody_get(swigCPtr, this);
  }

  public void setIfperenial(int[] value) {
    temcoreJNI.CohortLookup_ifperenial_set(swigCPtr, this, value);
  }

  public int[] getIfperenial() {
    return temcoreJNI.CohortLookup_ifperenial_get(swigCPtr, this);
  }

  public void setNonvascular(int[] value) {
    temcoreJNI.CohortLookup_nonvascular_set(swigCPtr, this, value);
  }

  public int[] getNonvascular() {
    return temcoreJNI.CohortLookup_nonvascular_get(swigCPtr, this);
  }

  public void setEnvlai(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.CohortLookup_envlai_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getEnvlai() {
    long cPtr = temcoreJNI.CohortLookup_envlai_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setFrootfrac(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.CohortLookup_frootfrac_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getFrootfrac() {
    long cPtr = temcoreJNI.CohortLookup_frootfrac_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setAerenchyma(double[] value) {
    temcoreJNI.CohortLookup_aerenchyma_set(swigCPtr, this, value);
  }

  public double[] getAerenchyma() {
    return temcoreJNI.CohortLookup_aerenchyma_get(swigCPtr, this);
  }

  public void setSnwdenmax(double value) {
    temcoreJNI.CohortLookup_snwdenmax_set(swigCPtr, this, value);
  }

  public double getSnwdenmax() {
    return temcoreJNI.CohortLookup_snwdenmax_get(swigCPtr, this);
  }

  public void setSnwdennew(double value) {
    temcoreJNI.CohortLookup_snwdennew_set(swigCPtr, this, value);
  }

  public double getSnwdennew() {
    return temcoreJNI.CohortLookup_snwdennew_get(swigCPtr, this);
  }

  public void setInitsnwthick(double value) {
    temcoreJNI.CohortLookup_initsnwthick_set(swigCPtr, this, value);
  }

  public double getInitsnwthick() {
    return temcoreJNI.CohortLookup_initsnwthick_get(swigCPtr, this);
  }

  public void setInitsnwdense(double value) {
    temcoreJNI.CohortLookup_initsnwdense_set(swigCPtr, this, value);
  }

  public double getInitsnwdense() {
    return temcoreJNI.CohortLookup_initsnwdense_get(swigCPtr, this);
  }

  public void setMaxdmossthick(double value) {
    temcoreJNI.CohortLookup_maxdmossthick_set(swigCPtr, this, value);
  }

  public double getMaxdmossthick() {
    return temcoreJNI.CohortLookup_maxdmossthick_get(swigCPtr, this);
  }

  public void setInitdmossthick(double value) {
    temcoreJNI.CohortLookup_initdmossthick_set(swigCPtr, this, value);
  }

  public double getInitdmossthick() {
    return temcoreJNI.CohortLookup_initdmossthick_get(swigCPtr, this);
  }

  public void setMosstype(int value) {
    temcoreJNI.CohortLookup_mosstype_set(swigCPtr, this, value);
  }

  public int getMosstype() {
    return temcoreJNI.CohortLookup_mosstype_get(swigCPtr, this);
  }

  public void setCoefmossa(double value) {
    temcoreJNI.CohortLookup_coefmossa_set(swigCPtr, this, value);
  }

  public double getCoefmossa() {
    return temcoreJNI.CohortLookup_coefmossa_get(swigCPtr, this);
  }

  public void setCoefmossb(double value) {
    temcoreJNI.CohortLookup_coefmossb_set(swigCPtr, this, value);
  }

  public double getCoefmossb() {
    return temcoreJNI.CohortLookup_coefmossb_get(swigCPtr, this);
  }

  public void setInitfibthick(double value) {
    temcoreJNI.CohortLookup_initfibthick_set(swigCPtr, this, value);
  }

  public double getInitfibthick() {
    return temcoreJNI.CohortLookup_initfibthick_get(swigCPtr, this);
  }

  public void setInithumthick(double value) {
    temcoreJNI.CohortLookup_inithumthick_set(swigCPtr, this, value);
  }

  public double getInithumthick() {
    return temcoreJNI.CohortLookup_inithumthick_get(swigCPtr, this);
  }

  public void setCoefshlwa(double value) {
    temcoreJNI.CohortLookup_coefshlwa_set(swigCPtr, this, value);
  }

  public double getCoefshlwa() {
    return temcoreJNI.CohortLookup_coefshlwa_get(swigCPtr, this);
  }

  public void setCoefshlwb(double value) {
    temcoreJNI.CohortLookup_coefshlwb_set(swigCPtr, this, value);
  }

  public double getCoefshlwb() {
    return temcoreJNI.CohortLookup_coefshlwb_get(swigCPtr, this);
  }

  public void setCoefdeepa(double value) {
    temcoreJNI.CohortLookup_coefdeepa_set(swigCPtr, this, value);
  }

  public double getCoefdeepa() {
    return temcoreJNI.CohortLookup_coefdeepa_get(swigCPtr, this);
  }

  public void setCoefdeepb(double value) {
    temcoreJNI.CohortLookup_coefdeepb_set(swigCPtr, this, value);
  }

  public double getCoefdeepb() {
    return temcoreJNI.CohortLookup_coefdeepb_get(swigCPtr, this);
  }

  public void setCoefminea(double value) {
    temcoreJNI.CohortLookup_coefminea_set(swigCPtr, this, value);
  }

  public double getCoefminea() {
    return temcoreJNI.CohortLookup_coefminea_get(swigCPtr, this);
  }

  public void setCoefmineb(double value) {
    temcoreJNI.CohortLookup_coefmineb_set(swigCPtr, this, value);
  }

  public double getCoefmineb() {
    return temcoreJNI.CohortLookup_coefmineb_get(swigCPtr, this);
  }

  public void setMinetexture(int[] value) {
    temcoreJNI.CohortLookup_minetexture_set(swigCPtr, this, value);
  }

  public int[] getMinetexture() {
    return temcoreJNI.CohortLookup_minetexture_get(swigCPtr, this);
  }

  public void setRtdp4gdd(double value) {
    temcoreJNI.CohortLookup_rtdp4gdd_set(swigCPtr, this, value);
  }

  public double getRtdp4gdd() {
    return temcoreJNI.CohortLookup_rtdp4gdd_get(swigCPtr, this);
  }

  public void setAlbvisnir(double[] value) {
    temcoreJNI.CohortLookup_albvisnir_set(swigCPtr, this, value);
  }

  public double[] getAlbvisnir() {
    return temcoreJNI.CohortLookup_albvisnir_get(swigCPtr, this);
  }

  public void setEr(double[] value) {
    temcoreJNI.CohortLookup_er_set(swigCPtr, this, value);
  }

  public double[] getEr() {
    return temcoreJNI.CohortLookup_er_get(swigCPtr, this);
  }

  public void setIrcoef(double[] value) {
    temcoreJNI.CohortLookup_ircoef_set(swigCPtr, this, value);
  }

  public double[] getIrcoef() {
    return temcoreJNI.CohortLookup_ircoef_get(swigCPtr, this);
  }

  public void setIscoef(double[] value) {
    temcoreJNI.CohortLookup_iscoef_set(swigCPtr, this, value);
  }

  public double[] getIscoef() {
    return temcoreJNI.CohortLookup_iscoef_get(swigCPtr, this);
  }

  public void setGlmax(double[] value) {
    temcoreJNI.CohortLookup_glmax_set(swigCPtr, this, value);
  }

  public double[] getGlmax() {
    return temcoreJNI.CohortLookup_glmax_get(swigCPtr, this);
  }

  public void setGl_bl(double[] value) {
    temcoreJNI.CohortLookup_gl_bl_set(swigCPtr, this, value);
  }

  public double[] getGl_bl() {
    return temcoreJNI.CohortLookup_gl_bl_get(swigCPtr, this);
  }

  public void setGl_c(double[] value) {
    temcoreJNI.CohortLookup_gl_c_set(swigCPtr, this, value);
  }

  public double[] getGl_c() {
    return temcoreJNI.CohortLookup_gl_c_get(swigCPtr, this);
  }

  public void setVpd_open(double[] value) {
    temcoreJNI.CohortLookup_vpd_open_set(swigCPtr, this, value);
  }

  public double[] getVpd_open() {
    return temcoreJNI.CohortLookup_vpd_open_get(swigCPtr, this);
  }

  public void setVpd_close(double[] value) {
    temcoreJNI.CohortLookup_vpd_close_set(swigCPtr, this, value);
  }

  public double[] getVpd_close() {
    return temcoreJNI.CohortLookup_vpd_close_get(swigCPtr, this);
  }

  public void setPpfd50(double[] value) {
    temcoreJNI.CohortLookup_ppfd50_set(swigCPtr, this, value);
  }

  public double[] getPpfd50() {
    return temcoreJNI.CohortLookup_ppfd50_get(swigCPtr, this);
  }

  public void setInitvegwater(double[] value) {
    temcoreJNI.CohortLookup_initvegwater_set(swigCPtr, this, value);
  }

  public double[] getInitvegwater() {
    return temcoreJNI.CohortLookup_initvegwater_get(swigCPtr, this);
  }

  public void setInitvegsnow(double[] value) {
    temcoreJNI.CohortLookup_initvegsnow_set(swigCPtr, this, value);
  }

  public double[] getInitvegsnow() {
    return temcoreJNI.CohortLookup_initvegsnow_get(swigCPtr, this);
  }

  public void setSnwalbmax(double value) {
    temcoreJNI.CohortLookup_snwalbmax_set(swigCPtr, this, value);
  }

  public double getSnwalbmax() {
    return temcoreJNI.CohortLookup_snwalbmax_get(swigCPtr, this);
  }

  public void setSnwalbmin(double value) {
    temcoreJNI.CohortLookup_snwalbmin_set(swigCPtr, this, value);
  }

  public double getSnwalbmin() {
    return temcoreJNI.CohortLookup_snwalbmin_get(swigCPtr, this);
  }

  public void setPsimax(double value) {
    temcoreJNI.CohortLookup_psimax_set(swigCPtr, this, value);
  }

  public double getPsimax() {
    return temcoreJNI.CohortLookup_psimax_get(swigCPtr, this);
  }

  public void setEvapmin(double value) {
    temcoreJNI.CohortLookup_evapmin_set(swigCPtr, this, value);
  }

  public double getEvapmin() {
    return temcoreJNI.CohortLookup_evapmin_get(swigCPtr, this);
  }

  public void setDrainmax(double value) {
    temcoreJNI.CohortLookup_drainmax_set(swigCPtr, this, value);
  }

  public double getDrainmax() {
    return temcoreJNI.CohortLookup_drainmax_get(swigCPtr, this);
  }

  public void setInitsnwtem(double value) {
    temcoreJNI.CohortLookup_initsnwtem_set(swigCPtr, this, value);
  }

  public double getInitsnwtem() {
    return temcoreJNI.CohortLookup_initsnwtem_get(swigCPtr, this);
  }

  public void setInitvwc(double[] value) {
    temcoreJNI.CohortLookup_initvwc_set(swigCPtr, this, value);
  }

  public double[] getInitvwc() {
    return temcoreJNI.CohortLookup_initvwc_get(swigCPtr, this);
  }

  public void setInitts(double[] value) {
    temcoreJNI.CohortLookup_initts_set(swigCPtr, this, value);
  }

  public double[] getInitts() {
    return temcoreJNI.CohortLookup_initts_get(swigCPtr, this);
  }

  public void setMinleaf(double[] value) {
    temcoreJNI.CohortLookup_minleaf_set(swigCPtr, this, value);
  }

  public double[] getMinleaf() {
    return temcoreJNI.CohortLookup_minleaf_get(swigCPtr, this);
  }

  public void setAleaf(double[] value) {
    temcoreJNI.CohortLookup_aleaf_set(swigCPtr, this, value);
  }

  public double[] getAleaf() {
    return temcoreJNI.CohortLookup_aleaf_get(swigCPtr, this);
  }

  public void setBleaf(double[] value) {
    temcoreJNI.CohortLookup_bleaf_set(swigCPtr, this, value);
  }

  public double[] getBleaf() {
    return temcoreJNI.CohortLookup_bleaf_get(swigCPtr, this);
  }

  public void setCleaf(double[] value) {
    temcoreJNI.CohortLookup_cleaf_set(swigCPtr, this, value);
  }

  public double[] getCleaf() {
    return temcoreJNI.CohortLookup_cleaf_get(swigCPtr, this);
  }

  public void setKfoliage(double[] value) {
    temcoreJNI.CohortLookup_kfoliage_set(swigCPtr, this, value);
  }

  public double[] getKfoliage() {
    return temcoreJNI.CohortLookup_kfoliage_get(swigCPtr, this);
  }

  public void setCov(double[] value) {
    temcoreJNI.CohortLookup_cov_set(swigCPtr, this, value);
  }

  public double[] getCov() {
    return temcoreJNI.CohortLookup_cov_get(swigCPtr, this);
  }

  public void setM1(double[] value) {
    temcoreJNI.CohortLookup_m1_set(swigCPtr, this, value);
  }

  public double[] getM1() {
    return temcoreJNI.CohortLookup_m1_get(swigCPtr, this);
  }

  public void setM2(double[] value) {
    temcoreJNI.CohortLookup_m2_set(swigCPtr, this, value);
  }

  public double[] getM2() {
    return temcoreJNI.CohortLookup_m2_get(swigCPtr, this);
  }

  public void setM3(double[] value) {
    temcoreJNI.CohortLookup_m3_set(swigCPtr, this, value);
  }

  public double[] getM3() {
    return temcoreJNI.CohortLookup_m3_get(swigCPtr, this);
  }

  public void setM4(double[] value) {
    temcoreJNI.CohortLookup_m4_set(swigCPtr, this, value);
  }

  public double[] getM4() {
    return temcoreJNI.CohortLookup_m4_get(swigCPtr, this);
  }

  public void setKc(double[] value) {
    temcoreJNI.CohortLookup_kc_set(swigCPtr, this, value);
  }

  public double[] getKc() {
    return temcoreJNI.CohortLookup_kc_get(swigCPtr, this);
  }

  public void setKi(double[] value) {
    temcoreJNI.CohortLookup_ki_set(swigCPtr, this, value);
  }

  public double[] getKi() {
    return temcoreJNI.CohortLookup_ki_get(swigCPtr, this);
  }

  public void setTmin(double[] value) {
    temcoreJNI.CohortLookup_tmin_set(swigCPtr, this, value);
  }

  public double[] getTmin() {
    return temcoreJNI.CohortLookup_tmin_get(swigCPtr, this);
  }

  public void setToptmin(double[] value) {
    temcoreJNI.CohortLookup_toptmin_set(swigCPtr, this, value);
  }

  public double[] getToptmin() {
    return temcoreJNI.CohortLookup_toptmin_get(swigCPtr, this);
  }

  public void setToptmax(double[] value) {
    temcoreJNI.CohortLookup_toptmax_set(swigCPtr, this, value);
  }

  public double[] getToptmax() {
    return temcoreJNI.CohortLookup_toptmax_get(swigCPtr, this);
  }

  public void setTmax(double[] value) {
    temcoreJNI.CohortLookup_tmax_set(swigCPtr, this, value);
  }

  public double[] getTmax() {
    return temcoreJNI.CohortLookup_tmax_get(swigCPtr, this);
  }

  public void setRaq10a0(double[] value) {
    temcoreJNI.CohortLookup_raq10a0_set(swigCPtr, this, value);
  }

  public double[] getRaq10a0() {
    return temcoreJNI.CohortLookup_raq10a0_get(swigCPtr, this);
  }

  public void setRaq10a1(double[] value) {
    temcoreJNI.CohortLookup_raq10a1_set(swigCPtr, this, value);
  }

  public double[] getRaq10a1() {
    return temcoreJNI.CohortLookup_raq10a1_get(swigCPtr, this);
  }

  public void setRaq10a2(double[] value) {
    temcoreJNI.CohortLookup_raq10a2_set(swigCPtr, this, value);
  }

  public double[] getRaq10a2() {
    return temcoreJNI.CohortLookup_raq10a2_get(swigCPtr, this);
  }

  public void setRaq10a3(double[] value) {
    temcoreJNI.CohortLookup_raq10a3_set(swigCPtr, this, value);
  }

  public double[] getRaq10a3() {
    return temcoreJNI.CohortLookup_raq10a3_get(swigCPtr, this);
  }

  public void setKnuptake(double[] value) {
    temcoreJNI.CohortLookup_knuptake_set(swigCPtr, this, value);
  }

  public double[] getKnuptake() {
    return temcoreJNI.CohortLookup_knuptake_get(swigCPtr, this);
  }

  public void setCpart(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.CohortLookup_cpart_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getCpart() {
    long cPtr = temcoreJNI.CohortLookup_cpart_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setInitc2neven(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.CohortLookup_initc2neven_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getInitc2neven() {
    long cPtr = temcoreJNI.CohortLookup_initc2neven_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setC2nmin(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.CohortLookup_c2nmin_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getC2nmin() {
    long cPtr = temcoreJNI.CohortLookup_c2nmin_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setC2na(double[] value) {
    temcoreJNI.CohortLookup_c2na_set(swigCPtr, this, value);
  }

  public double[] getC2na() {
    return temcoreJNI.CohortLookup_c2na_get(swigCPtr, this);
  }

  public void setC2nb(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.CohortLookup_c2nb_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getC2nb() {
    long cPtr = temcoreJNI.CohortLookup_c2nb_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setLabncon(double[] value) {
    temcoreJNI.CohortLookup_labncon_set(swigCPtr, this, value);
  }

  public double[] getLabncon() {
    return temcoreJNI.CohortLookup_labncon_get(swigCPtr, this);
  }

  public void setRhq10(double value) {
    temcoreJNI.CohortLookup_rhq10_set(swigCPtr, this, value);
  }

  public double getRhq10() {
    return temcoreJNI.CohortLookup_rhq10_get(swigCPtr, this);
  }

  public void setMoistmin(double value) {
    temcoreJNI.CohortLookup_moistmin_set(swigCPtr, this, value);
  }

  public double getMoistmin() {
    return temcoreJNI.CohortLookup_moistmin_get(swigCPtr, this);
  }

  public void setMoistopt(double value) {
    temcoreJNI.CohortLookup_moistopt_set(swigCPtr, this, value);
  }

  public double getMoistopt() {
    return temcoreJNI.CohortLookup_moistopt_get(swigCPtr, this);
  }

  public void setMoistmax(double value) {
    temcoreJNI.CohortLookup_moistmax_set(swigCPtr, this, value);
  }

  public double getMoistmax() {
    return temcoreJNI.CohortLookup_moistmax_get(swigCPtr, this);
  }

  public void setLcclnc(double value) {
    temcoreJNI.CohortLookup_lcclnc_set(swigCPtr, this, value);
  }

  public double getLcclnc() {
    return temcoreJNI.CohortLookup_lcclnc_get(swigCPtr, this);
  }

  public void setFsoma(double value) {
    temcoreJNI.CohortLookup_fsoma_set(swigCPtr, this, value);
  }

  public double getFsoma() {
    return temcoreJNI.CohortLookup_fsoma_get(swigCPtr, this);
  }

  public void setFsompr(double value) {
    temcoreJNI.CohortLookup_fsompr_set(swigCPtr, this, value);
  }

  public double getFsompr() {
    return temcoreJNI.CohortLookup_fsompr_get(swigCPtr, this);
  }

  public void setFsomcr(double value) {
    temcoreJNI.CohortLookup_fsomcr_set(swigCPtr, this, value);
  }

  public double getFsomcr() {
    return temcoreJNI.CohortLookup_fsomcr_get(swigCPtr, this);
  }

  public void setSom2co2(double value) {
    temcoreJNI.CohortLookup_som2co2_set(swigCPtr, this, value);
  }

  public double getSom2co2() {
    return temcoreJNI.CohortLookup_som2co2_get(swigCPtr, this);
  }

  public void setKn2(double value) {
    temcoreJNI.CohortLookup_kn2_set(swigCPtr, this, value);
  }

  public double getKn2() {
    return temcoreJNI.CohortLookup_kn2_get(swigCPtr, this);
  }

  public void setPropftos(double value) {
    temcoreJNI.CohortLookup_propftos_set(swigCPtr, this, value);
  }

  public double getPropftos() {
    return temcoreJNI.CohortLookup_propftos_get(swigCPtr, this);
  }

  public void setNmincnsoil(double value) {
    temcoreJNI.CohortLookup_nmincnsoil_set(swigCPtr, this, value);
  }

  public double getNmincnsoil() {
    return temcoreJNI.CohortLookup_nmincnsoil_get(swigCPtr, this);
  }

  public void setFnloss(double value) {
    temcoreJNI.CohortLookup_fnloss_set(swigCPtr, this, value);
  }

  public double getFnloss() {
    return temcoreJNI.CohortLookup_fnloss_get(swigCPtr, this);
  }

  public void setRebul(double value) {
    temcoreJNI.CohortLookup_rebul_set(swigCPtr, this, value);
  }

  public double getRebul() {
    return temcoreJNI.CohortLookup_rebul_get(swigCPtr, this);
  }

  public void setRp(double value) {
    temcoreJNI.CohortLookup_rp_set(swigCPtr, this, value);
  }

  public double getRp() {
    return temcoreJNI.CohortLookup_rp_get(swigCPtr, this);
  }

  public void setRoxid(double value) {
    temcoreJNI.CohortLookup_roxid_set(swigCPtr, this, value);
  }

  public double getRoxid() {
    return temcoreJNI.CohortLookup_roxid_get(swigCPtr, this);
  }

  public void setInitvegc(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.CohortLookup_initvegc_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getInitvegc() {
    long cPtr = temcoreJNI.CohortLookup_initvegc_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setInitvegn(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.CohortLookup_initvegn_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getInitvegn() {
    long cPtr = temcoreJNI.CohortLookup_initvegn_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setInitdeadc(double[] value) {
    temcoreJNI.CohortLookup_initdeadc_set(swigCPtr, this, value);
  }

  public double[] getInitdeadc() {
    return temcoreJNI.CohortLookup_initdeadc_get(swigCPtr, this);
  }

  public void setInitdeadn(double[] value) {
    temcoreJNI.CohortLookup_initdeadn_set(swigCPtr, this, value);
  }

  public double[] getInitdeadn() {
    return temcoreJNI.CohortLookup_initdeadn_get(swigCPtr, this);
  }

  public void setInitdmossc(double value) {
    temcoreJNI.CohortLookup_initdmossc_set(swigCPtr, this, value);
  }

  public double getInitdmossc() {
    return temcoreJNI.CohortLookup_initdmossc_get(swigCPtr, this);
  }

  public void setInitshlwc(double value) {
    temcoreJNI.CohortLookup_initshlwc_set(swigCPtr, this, value);
  }

  public double getInitshlwc() {
    return temcoreJNI.CohortLookup_initshlwc_get(swigCPtr, this);
  }

  public void setInitdeepc(double value) {
    temcoreJNI.CohortLookup_initdeepc_set(swigCPtr, this, value);
  }

  public double getInitdeepc() {
    return temcoreJNI.CohortLookup_initdeepc_get(swigCPtr, this);
  }

  public void setInitminec(double value) {
    temcoreJNI.CohortLookup_initminec_set(swigCPtr, this, value);
  }

  public double getInitminec() {
    return temcoreJNI.CohortLookup_initminec_get(swigCPtr, this);
  }

  public void setInitsoln(double value) {
    temcoreJNI.CohortLookup_initsoln_set(swigCPtr, this, value);
  }

  public double getInitsoln() {
    return temcoreJNI.CohortLookup_initsoln_get(swigCPtr, this);
  }

  public void setInitavln(double value) {
    temcoreJNI.CohortLookup_initavln_set(swigCPtr, this, value);
  }

  public double getInitavln() {
    return temcoreJNI.CohortLookup_initavln_get(swigCPtr, this);
  }

  public void setInitch4(double value) {
    temcoreJNI.CohortLookup_initch4_set(swigCPtr, this, value);
  }

  public double getInitch4() {
    return temcoreJNI.CohortLookup_initch4_get(swigCPtr, this);
  }

  public void setFvcombust(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.CohortLookup_fvcombust_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getFvcombust() {
    long cPtr = temcoreJNI.CohortLookup_fvcombust_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setFvslash(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.CohortLookup_fvslash_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getFvslash() {
    long cPtr = temcoreJNI.CohortLookup_fvslash_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public void setFoslburn(double[] value) {
    temcoreJNI.CohortLookup_foslburn_set(swigCPtr, this, value);
  }

  public double[] getFoslburn() {
    return temcoreJNI.CohortLookup_foslburn_get(swigCPtr, this);
  }

  public void setVsmburn(double value) {
    temcoreJNI.CohortLookup_vsmburn_set(swigCPtr, this, value);
  }

  public double getVsmburn() {
    return temcoreJNI.CohortLookup_vsmburn_get(swigCPtr, this);
  }

  public void setR_retain_c(double value) {
    temcoreJNI.CohortLookup_r_retain_c_set(swigCPtr, this, value);
  }

  public double getR_retain_c() {
    return temcoreJNI.CohortLookup_r_retain_c_get(swigCPtr, this);
  }

  public void setR_retain_n(double value) {
    temcoreJNI.CohortLookup_r_retain_n_set(swigCPtr, this, value);
  }

  public double getR_retain_n() {
    return temcoreJNI.CohortLookup_r_retain_n_get(swigCPtr, this);
  }

}
