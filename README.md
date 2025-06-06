# AIBattleBots

A simple Java game where two AI-controlled bots battle each other on a canvas


## Features

- **AI Bots:** Two bots move randomly and attack each other.
- **Health System:** Each bot has a health bar (HP).
- **Winning Condition:** The game ends when one bot runs out of health.
- **Visual Feedback:** Real-time HP display and visual representation of bots.

---

## Requirements

- **Java Development Kit (JDK) 8 or newer**
- **JRE (Java Runtime Environment) for running the application**

---

## Installation

1. **Clone the repository:**
git clone https://github.com/your-username/AIBattleBots.git

2. **Navigate to the project directory:**
cd AIBattleBots


---

## Usage

1. **Compile the code:**
javac AIBattleBots.java

3. **Enjoy the battle!**

---

## How It Works

- **Bots:** Two bots (red and blue) move randomly within the window.
- **Movement:** Bots change direction every 200ms.
- **Attacks:** If bots are within 20 pixels of each other, they attack and reduce HP.
- **Endgame:** The game ends when a bot's HP reaches zero, and a winner is announced.

---

## Code Structure

- **AIBattleBots:** Main class, handles GUI and game loop.
- **Bot:** Inner class, manages bot state (position, color, HP) and logic (movement, attacks).

---

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a Pull Request.

---

## License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.
