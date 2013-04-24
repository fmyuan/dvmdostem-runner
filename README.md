dvmdostem-runner in Java
============
Java GUI (e.g. Calibrator and Runner) for running DVM-DOS-TEM core codes (c++ program)


Workflow
-----------

(1) copy the dynamical linked library from the wrapper, called "temcore.dll" (windows OS) or "libtemcore.dylib" (mac OS) or "libtemcore.so" (linux), upon the system you run 'swig'.

(2) this GUI is supposed to be platform independent (better with JRE 1.6 in which this was developed though). 


Documentation
-------------

Compile
---------
Requires a few Java external libraries, especially Netcdf-4 java library. Please refer to the project library directory.


Run
---------

A package of running TEM in Calibratin version is included. It's tested in Windows OS 32bit. It includes:
(1) TEMcalibrator.jar - The GUI from this project;
(2) TEMcalibrator_lib - The java external *.jar libraries used by this GUI;
(3) temcore.dll - the TEM core codes compiled in a .dll for calling by TEMcalibrator.jar;
(4) config/ - directory to hold all parameters and default initial conditions, and two txt files for calibration and a txt file for holding the final calibrated parameters;
(5) Test_DVMDOSTEM/ - demo data for testing the package.
