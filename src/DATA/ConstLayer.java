package DATA;

import TEMJNI.temcore;

@SuppressWarnings("unused")
public class ConstLayer {
	
	public final static int MAX_SNW_LAY = 6; //temcore.getMAX_SNW_LAY(); //maximum number of Snow Layer
	
	public final static int MAX_MOS_LAY = 2; //temcore.getMAX_MOS_LAY(); // maximum number of moss Layer
	public final static int MAX_SLW_LAY = 3; //temcore.getMAX_SLW_LAY(); // maximum number of shallow organic Layer
	public final static int MAX_DEP_LAY = 3; //temcore.getMAX_DEP_LAY(); // maximum number of deep organic Layer
	public final static int MAX_MIN_LAY = 15; //temcore.getMAX_MIN_LAY(); // maximum number of mineral Layer (0.1, 0.2, 0.5, 1, 2)

	public final static double MINETHICK[] = {0.1,0.1,0.1, 0.1, 0.2,0.2,0.2, 0.3, 0.3, 0.3, 0.3, 0.5, 0.5, 1.0, 1.0}; //temcore.getMINETHICK();
	public final static int MINEZONE[] = {2, 6, 14}; //temcore.getMINEZONE();    //the mineral layer index (from 0) of THREE soil zones
	                                       // e.g., here: minea - 0~0.3m, mineb - 0.3~1.0m, minec - 1m~
	public final static int MAX_ROC_LAY = 5; //temcore.getMAX_ROC_LAY(); // maximum number of rock Layer (

	public final static int MAX_SOI_LAY = MAX_MOS_LAY+ MAX_SLW_LAY+MAX_DEP_LAY+MAX_MIN_LAY; //temcore.getMAX_SOI_LAY(); // maximum number of Soil Layer
	public final static int MAX_GRN_LAY = MAX_SNW_LAY + MAX_SOI_LAY+ MAX_ROC_LAY; //temcore.getMAX_GRN_LAY(); //maximumum number of Ground Layer
	
	public final static int MAX_NUM_FNT = 10; //temcore.getMAX_NUM_FNT(); // maximum number of fronts in ground
	
	public final static int MAX_ROT_LAY = 10; //temcore.getMAX_ROC_LAY();  //maximum number of fine root layers
	public final static double ROOTTHICK[] = {0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1}; //temcore.getROOTTHICK();
	
	public final static double MINSLWTHICK = 0.01;   //minium thickness (meter) for forming a shallow organic layer
	public final static double MINDEPTHICK = 0.01;   //minium thickness (meter) for forming a deep organic layer

}

