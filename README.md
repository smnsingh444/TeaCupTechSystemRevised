# TeaCupTechSystemRevised

##Steps to follow :

Clone the project on local git repiository And add below jars in classpath:

1.junit-4.13
2.hamcrest-core-1.3

Run StartFan.java class.

##Assumption :
The unit has 2 pull cords:
One increases the speed each time it is pulled.  There are 3 speed settings, and an “off” (speed 0) setting. 
If the cord is pulled on speed 3, the fan returns to the “off” setting.
One reverses the direction of the fan at the current speed setting.
Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.
You can assume the unit is always powered (no wall switch).
