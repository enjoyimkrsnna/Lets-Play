# LetsPlay Android App

## Overview

The LetsPlay app is a fun and interactive Android application featuring two games: Flying Fish and Tic-Tac-Toe. It allows users to play games and view their scores. Additionally, it includes social media integration to connect with Instagram and LinkedIn profiles.

## Features

- **Flying Fish Game**: Navigate a fish through obstacles and collect points.
- **Tic-Tac-Toe Game**: Play a classic game of Tic-Tac-Toe with two players.


## Getting Started

### Prerequisites

- Android Studio
- A physical or virtual Android device

### Installation

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/yourusername/letsplay.git
   ```
   
2. **Open in Android Studio**:
   - Launch Android Studio.
   - Select "Open an existing Android Studio project".
   - Navigate to the cloned repository directory and select it.

3. **Build and Run**:
   - Click on "Run" or use `Shift + F10` to build and run the app on your device or emulator.

## Game Descriptions

### Flying Fish

- **Objective**: Navigate the fish through obstacles to gain points.
- **Controls**: Tap on the screen to move the fish up. Avoid red obstacles and collect yellow and green balls for points.
- **Game Over**: When all lives are lost, the game ends and displays the final score.

### Tic-Tac-Toe

- **Objective**: Play a game of Tic-Tac-Toe with a second player.
- **Controls**: Tap on the buttons to place X or O. The game checks for a winner or a draw.
- **Reset**: Click "Start Again" to reset the game or "Home" to return to the main menu.

## File Structure

- `MainActivity.java`: Main activity with buttons to navigate to different games and social media links.
- `flyingfishmain.java`: Activity for the Flying Fish game.
- `flyingfishview.java`: Custom view for the Flying Fish game rendering and logic.
- `gameoveractivity.java`: Activity that displays when the Flying Fish game ends.
- `gettingplayers.java`: Activity to enter player names for the Tic-Tac-Toe game.
- `splashactivity.java`: Splash screen activity displayed on app startup.
- `tictactoe.java`: Activity for the Tic-Tac-Toe game.

## Dependencies

- `io.github.muddz:styleabletoast`: For styled toast messages.

## Contributing

Feel free to submit issues or pull requests if you want to contribute to this project.
