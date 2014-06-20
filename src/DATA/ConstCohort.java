package DATA;

import TEMJNI.temcore;

@SuppressWarnings("unused")
public class ConstCohort {

	public final static int NUM_CMT      = 8; //temcore.getNUM_CMT(); //
	public final static int NUM_PFT      = 10; // temcore.getNUM_PFT(); //
	public final static int NUM_PFT_PART = 3; // temcore.getNUM_PFT_PART(); //
	public final static int MAX_DRG_TYPE = 2; // temcore.getMAX_DRG_TYPE(); //
	public final static int NUM_FSEVR    = 5; // temcore.getNUM_FSEVR(); //
	public final static int NUM_FSEASON  = 4; // temcore.getNUM_FSEASON(); //
	public final static int NUM_FSIZE    = 5; // temcore.getNUM_FSIZE(); //

	public final static int MISSING_I    = -9999; // temcore.getMISSING_I();    //missing value (INT) used in the code
	public final static float MISSING_F  = -9999.0f; // temcore.getMISSING_F();   //missing value (FLOAT) used in the code
	public final static double MISSING_D = -9999.0d; // temcore.getMISSING_D();   //missing value (DOUBLE) used in the code

}
