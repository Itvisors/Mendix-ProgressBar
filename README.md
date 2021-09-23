## ProgressBar
Widget used to show the progress of a certain task based on a value.

## Features
- Show progress based on a value
- Color can be changed based on a hex value
- Labels can be turned on or off
- Start and end values of the progress bar can be adjusted while still ensuring the % and the progress is valid
- The progress and % is based on a calculation. This calculation is based on the start and end value and the filled in value.

## Typical usage scenario
- When you want to measure the progress of a certain task while being able to manipulate the color of the progress bar

## Configuration
### General
- Default mendix behavior for labeling, visibility and editability.
- value: the value that the task is currently at
- Start value: the start value the progressbar should start on
- End value: the end value the progress bar should end at
- Color: the color based on a hex code the progress should get
