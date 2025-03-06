# CryptoTracker App

CryptoTracker is an Android application built with **Kotlin** and **Jetpack Compose** that allows users to **sign in with Firebase** and view a **real-time list of cryptocurrency prices** using WebSockets from the **WhiteBit public API**.

---

## 📌 Features

- **Firebase Authentication** (Email & Password, Google Sign-In planned)
- **MVVM Architecture** for clean and scalable code
- **Hilt Dependency Injection** for easy dependency management
- **Room Database** for local caching of crypto prices
- **WebSocket (OkHttp)** for real-time cryptocurrency price updates
- **Jetpack Compose UI** for modern and declarative UI

---

## 🛠️ Tech Stack

- **Kotlin** (Primary Language)
- **Jetpack Compose** (UI Framework)
- **MVVM** (Architecture Pattern)
- **Hilt** (Dependency Injection)
- **Firebase Authentication** (User Sign-in/Sign-up)
- **OkHttp WebSocket** (Real-time crypto price updates)
- **Room Database** (Local storage for crypto data)
- **Coroutines & Flow** (Asynchronous data handling)

---

## 🚀 Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/CryptoTracker.git
   ```
2. Open the project in **Android Studio**.
3. Connect your Firebase project:
   - Add `google-services.json` inside `app/`.
4. Run the app on an emulator or a physical device.

---



## 🔌 API Integration

The app uses the **WhiteBit WebSocket API** for real-time cryptocurrency price updates.

- **WebSocket Endpoint:** `wss://api.whitebit.com/ws`.
- Example WebSocket request:
  ```json
  {
    "method": "subscribe",
    "params": { "channels": ["ticker.BTC_USDT"] },
    "id": 1
  }
  ```

---

## 📷 Screenshots

(Include some images of your app screens here)
![image](https://github.com/user-attachments/assets/a16e550c-6b45-4505-a59b-660726b01815)
![image](https://github.com/user-attachments/assets/3e5d8126-5b77-4624-b43a-85defabe8074)

---

## 👨‍💻 Contribution

Feel free to fork the project and submit PRs! 🚀

---

## 📜 License

MIT License © 2025 Your Name

