# 🎓 Brain Bash - a Java Quiz Application

![White and Brown Minimalist Lesson Video Youtube Thumbnail](https://github.com/user-attachments/assets/55e785f6-29eb-49da-acef-d1b71f3bdb78)



This is a **graphical multiple-choice Quiz Application** developed in **Java using Swing**. It simulates a basic online quiz system where users can read rules, take a timed quiz, and view their final results. The project demonstrates GUI development, event handling, and object-oriented design in Java. It is ideal for educational use, training tests, or small-scale assessments.

---

## 📌 Table of Contents

- [Features](#features)
- [Screenshots](#screenshots)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [How to Run](#how-to-run)
- [Acknowledgments](#acknowledgments)

---

## ✅ Features

- ✨ **Interactive GUI** using Java Swing with a clean layout and responsive controls
- 📖 **Welcome and Rules screen** to display quiz instructions before the user starts
- ❓ **10 pre-defined multiple-choice questions**, each with 4 options
- 🔘 **Radio buttons** for selecting answers in a user-friendly format
- 🧭 **Question navigation**: users click "Next" or are moved automatically
- ⏱ **15-second timer per question**, automatically advances to next if time exceeds
- 🧠 **Answer memory**: selected answers are stored until submission
- 🛡 **50-50 Lifeline** to eliminate two incorrect options — can be used only once
- ❌ **Lifeline protection**: reusing the 50-50 shows an error message
- 📊 **Result screen** with animated **progress bar** to display final score
- 📝 **Score evaluation logic** to count correct answers on submission
- 🔄 **Resettable flow**: user can rerun the program for a new quiz attempt
- 📦 **Modular code structure** split across three classes (`Quiz`, `Rules`, `Result`)
- 🔒 **Simple and offline** – no network or backend dependency required
- 🪶 **Lightweight application**, ideal for quick deployments and demonstrations
- 💡 **Educational purpose**: ideal for beginners learning Java GUI and OOP

---

## 🖼 Screenshots

> - Welcome Screen
>   
>   ![image](https://github.com/user-attachments/assets/2355a03a-839b-4869-be4f-a29e4e655253)

> - Rules screen
>   
>   ![image](https://github.com/user-attachments/assets/d4110534-81a6-43b8-b8af-d6c3cbf5eb92)

> - Question screen with 50-50 lifeline and timer
>   
>   ![image](https://github.com/user-attachments/assets/5dccc493-0677-436e-af54-33256a0b4218)

> - Qustion screen with showing message that 50-50 lifeline is Used Once
>   
>   ![image](https://github.com/user-attachments/assets/f9d3216f-f056-4d89-94f3-3e592d5f32d2)

> - Final result screen with progress bar
>   
>   ![image](https://github.com/user-attachments/assets/7ffbe6f3-6f72-4a9a-a813-5fc1a985892a)
>   ![image](https://github.com/user-attachments/assets/1ef2770e-b637-40ac-afbe-f541585a7eb3)




---

## 🛠 Technologies Used

- **Java 8+ (Tested on JDK 22)**
- **Java Swing** for graphical user interface
- **AWT (Abstract Window Toolkit)** for layout management and event handling
- **Object-Oriented Programming (OOP)** principles and encapsulation

---

## 🚀 Getting Started

Follow these steps to get a local copy of the project up and running.

### Prerequisites

- Java JDK 8 or higher (Recommended: JDK 22)
- IDE (e.g., IntelliJ IDEA, Eclipse) or terminal with Java setup
- Git (optional)

---

## 📁 Project Structure

```
BrainBash-quiz-app/
│
├── Quiz.java       # Core quiz functionality, GUI, and question flow
├── Rules.java      # Displays instructions before starting the quiz
├── Result.java     # Displays user's final score and feedback
├── README.md       # Project documentation (this file)
```

---

## 🧪 How to Run

1. **Clone the repository**

```bash
git clone https://github.com/Darsh0002/BrainBash-Quiz-App.git
cd BrainBash-Quiz-App
```

2. **Compile the code**

```bash
javac WelcomePage.java Quiz.java Rules.java Result.java
```

3. **Run the application**

```bash
java WelcomePage
```

> 🟢 `WelcomePage.java` contains the `main` method and launches the GUI.



---

## 🙌 Acknowledgments

- Inspired by basic online quiz platforms and desktop learning tools  
- Built to demonstrate Java Swing and OOP in a practical scenario  
- Thanks to the open-source Java community for guidance and examples  
