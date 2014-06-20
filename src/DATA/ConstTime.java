package DATA;

import TEMJNI.temcore;

@SuppressWarnings("unused")
public class ConstTime{
	public final static int DYINY = 365; //temcore.getDINY(); 
	public final static int MINY  = 12; //temcore.getMINY();	

	public final static int DINM[] = {31,  28,  31,  30,  31,  30,  31,  31,  30,  31,  30,  31};
	public final static int DOYINDFST[] ={ 0,  31,  59,  90, 120, 151, 181, 212, 243, 273, 304, 334};
	
	public final static int MAX_FSIZE_DRV_YR    = 109; //temcore.getMAX_FSIZE_DRV_YR(); // maximum number of years of fire size history;

	public final static int MAX_CO2_DRV_YR = 109; //temcore.getMAX_CO2_DRV_YR(); // maximum number of years of atmopsheric CO2 data
	public final static int MAX_ATM_DRV_YR = 109; //temcore.getMAX_ATM_DRV_YR(); // maximum number of years of atmopsheric driving data
	public final static int MAX_ATM_NOM_YR = 30;  //temcore.getMAX_ATM_NOM_YR(); 
	
	public final static int MAX_VEG_SET = 15; // temcore.getMAX_VEG_SET();

	public final static int MIN_EQ_YR = 2000;   // temcore.getMIN_EQ_YR(); // minimum number of years for equilibrium run
	public final static int MAX_EQ_YR = 20000;  // temcore.getMAX_EQ_YR(); // maximum number of years for equilibrium run
	public final static int MAX_SP_YR = 900;    // temcore.getMAX_SP_YR(); // maximum number of years of spinup run;
	
	public final static int BEG_TR_YR = 1901; // temcore.getBEG_TR_YR(); // starting year of transient
	public final static int END_TR_YR = 2009; // temcore.getEND_TR_YR(); // endting year of transient
	public final static int BEG_SC_YR = 2010; // temcore.getBEG_SC_YR(); // starting year of scenario
	public final static int END_SC_YR = 2100; // temcore.getEND_SC_YR(); // ending year of scenario

	public final static int END_SP_YR = BEG_TR_YR - 1; //temcore.getBEG_SP_YR(); // starting year of spin-up
	public final static int BEG_SP_YR = END_SP_YR - MAX_SP_YR+1;   //temcore.getEND_SP_YR(); // ending year of spin-up
	
	public final static int MAX_TR_YR = END_TR_YR-BEG_TR_YR+1; //temcore.getMAX_TR_YR(); // maximum number of years of transient run;
	public final static int MAX_SC_YR = END_SC_YR-BEG_SC_YR+1; //temcore.getMAX_SC_YR();
	
	public final static int MAX_FIR_OCRNUM = 30; //temcore.getMAX_FIR_OCRNUM(); // maximum number of fire occurrence in transient run

}



