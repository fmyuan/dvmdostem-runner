dvmdostem-runner in Java
============
Java GUI (e.g. Calibrator and Runner) for running DVM-DOS-TEM core codes (c++ program). Currently the Calibrator is working well, and Runner is workable in Calbrator Tab for testing only.


Workflow
-----------

(1) copy the dynamical linked library from the wrapper, called "temcore.dll" (windows OS) or "libtemcore.dylib" (mac OS) or "libtemcore.so" (linux), upon the system you run 'swig'.

(2) this GUI is supposed to be platform independent (better with JRE 1.7 in which this was developed though - 2013/10/28). 


Documentation
-------------

Compile
---------
Requires a few Java external libraries, especially Netcdf-4 java library. For Mac OS, those libraries are in TEMcalibrator_mac_lib; while for Windows OS, they are packaged into the runnable jar. The purpose here is to give two kinds of methods.


Run
---------

A package of running TEM in Calibration version is included. It includes:
(1) TEMcalibrator_win32.jar, temcore.dll - The GUI and TEM core c++ library for Windows 32 bit OS, and it should be working under 64 bit;
(2) TEMcalibrator_mac.jar, libtemcore.dylib, and TEMcalibrator_mac_lib - The GUI and TEM core c++ library and java external libraries for Mac OS (64bit). 
(3) config/ - directory to hold all parameters and default initial conditions, and two txt files for calibration and a txt file for holding the final calibrated parameters;
(4) Test_DVMDOSTEM/ - demo data for testing the package.
