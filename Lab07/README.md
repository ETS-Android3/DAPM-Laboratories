### Exercise 1
The first exercise consists of a STT-TTS app. At the bottom of the screen, there is a a button "Tap To Open Mic", which starts the phone's Speech recognition service. The app then displays the recorded text and, when the user presses the "LISTEN IT!" button at the top, it reads aloud the text.

A recording of how the app works, with audio, is the "Exercise_1_demo.mp4" file.

**Difficulties:** When creating the TTS object, we have to set a language. I tried to obtain the language that Google uses to interpret what it hears when recording, so I could dynamically set the spoken language. Unfortunately, I didn't find any information regarding the language in the results returned by the SST intent; moreover, I discovered that Google uses the phone's settings to choose the recording language.


### Exercise 2
The second exercise illustrates the use of fragments. The app has two buttons, "FRAGMENT NO. 1" and "FRAGMENT NO. 2", and displays the according fragment when pressed.

A recording of how the app works is the "Exercise_2_demo.mp4" file.