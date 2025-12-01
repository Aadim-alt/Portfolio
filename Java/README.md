# 🎬 Movies Manager

A sleek command-line application for managing your personal movie collection with ease. Built with pure Java, no dependencies required.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

## ✨ Features

- **Add Movies** - Create and populate your movie collection
- **Search Movies** - Instantly find any movie in your list with position tracking
- **Show Movies** - View your entire collection at a glance
- **Simple Interface** - Clean, menu-driven navigation

## 🚀 Quick Start

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any terminal/command prompt

### Installation

1. Clone the repository
```bash
git clone https://github.com/Aadim-alt/Portfolio
cd movies-manager
```

2. Compile the program
```bash
javac MoviesManager.java
```

3. Run the application
```bash
java MoviesManager
```

## 🎮 How to Use

When you launch the application, you'll see a simple menu:

```
---------------
Movies Manager
---------------
1 -> Add Movies
2 -> Search Movies
3 -> Show Movies
4 -> Exit
---------------
```

### Adding Movies
1. Select option `1`
2. Enter the number of movies you want to add
3. Type each movie name (case-insensitive, automatically converted to uppercase)

### Searching Movies
1. Select option `2`
2. Enter the movie name you're looking for
3. Get instant feedback on whether it exists and its position in your list

### Viewing All Movies
1. Select option `3`
2. See your complete collection displayed in a clean list format

## 💡 Example Usage

```
Enter Your Choice: 1
How Many Movies Do You want To enter: 3
Enter the movies Name: 
- The Matrix
- Inception
- Interstellar
---------------
Enter Your Choice: 2
Enter name of the Movie to Search for: inception
Your Movie is on The list.
Its in number 2
```

## 🛠️ Technical Details

- **Language**: Java
- **Architecture**: Procedural with static methods
- **Data Structure**: String array for movie storage
- **Input Handling**: Scanner class for user interaction
- **Case Handling**: All movie names normalized to uppercase for reliable searching

## 🤝 Contributing

Contributions are welcome! Feel free to:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 Future Enhancements

- [ ] Persistent storage (save/load from file)
- [ ] Delete movie functionality
- [ ] Edit existing movies
- [ ] Sort movies alphabetically
- [ ] Add movie ratings and genres
- [ ] Export collection to CSV

## 👨‍💻 Author

**Aadim**
- GitHub: [@Aadim-alt](https://github.com/Aadim-alt)

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

## 🌟 Show Your Support

Give a ⭐️ if this project helped you!

---

*Made with ☕ and Java*