1. Mobile - Enable USB Debugging
	Tap on Build number 7 times
	Open Debugging options and enable USB debugging
	Check Screenshot attached for Debugging Settings
2. Download Android Studio which auto downloads Android SDK
	Android Studio 4.0.1
	Build #AI-193.6911.18.40.6626763, built on June 25, 2020
	Runtime version: 1.8.0_242-release-1644-b01 amd64
3. Add Environment Variables 
	Path - C:\Users\User\AppData\Local\Android\Sdk\tools ; C:\Users\User\AppData\Local\Android\Sdk\platform-tools
4. Java JDK 1.8
5. Open Android Device Monitor on Android Studio
	- View - Tool Windows - Device File Explorer
	- Do on Terminal
			 cd C:\Users\User\AppData\Local\Android\Sdk\tools
			 monitor
6. To make wireless device wireless connection 
	Connect the device and enter commands 
		adb devices
		adb tcpip 5555
	Disconnect the device and enter 
		adb connect IPAdressOfMobile
7. Add in capabilities
	capabilities.setCapability("deviceId", "IPAdressOfMobile");
    capabilities.setCapability("noReset",true);
			
