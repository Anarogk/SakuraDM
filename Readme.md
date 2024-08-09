
# SakuraChat

This project is an advanced chat service built using Java and Spring Boot, incorporating Lombok, Spring Web, and WebSockets. The application offers real-time communication over TCP with a modern web interface and a robust publish/subscribe (pub/sub) architecture for efficient message distribution.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Architecture](#architecture)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Application](#running-the-application)
- [Usage](#usage)
- [Acknowledgements](#acknowledgements)

## Introduction

The WebSocket Chat Application is designed to facilitate real-time communication between users through a sleek and responsive web interface. Leveraging the power of WebSockets, it enables instant message delivery and dynamic updates, ensuring a seamless and interactive chat experience. The backend is built with Spring Boot, ensuring a scalable and maintainable architecture, while Lombok reduces boilerplate code to enhance productivity and maintain clean code standards.

## Features

- Real-Time Messaging: Instant message delivery and reception using WebSockets.
- User Notifications: Real-time user join and leave notifications to keep all participants informed.
- Scalable Architecture: Pub/Sub structure using STOMP for efficient and scalable message handling.
- Modern Web Interface: User-friendly and intuitive web interface for a seamless chat experience.
- Session Management: Efficient handling of user sessions and disconnections.
- Easy Configuration: Simple setup and configuration with Spring Boot and Lombok

## Architecture

The application is structured to follow best practices in software design, using controllers, configuration classes, and event listeners to manage WebSocket connections and message handling. The pub/sub mechanism is implemented using a message broker, which ensures efficient distribution of messages to all connected clients.

## Technologies Used
**Java** | **Spring Boot** | **Spring Web** | **Spring WebSocket** | **Lombok** | **SockJS** | **STOMP**

## Getting Started

### Prerequisites

- JDK 11 or higher
- Maven
- A web browser

### Installation

1. Clone the repository:

    ```sh
    git clone https://github.com/Anarogk/SakuraDM.git
    cd SakuraDM
    ```

2. Install the dependencies:

    ```sh
    mvn clean install
    ```

### Running the Application

1. Run the Spring Boot application:

    ```sh
    mvn spring-boot:run
    ```

2. Open your web browser and navigate to `http://localhost:8080`.

## Usage

Once the application is running, open the web interface in your browser. You can join the chat by entering a username. Send messages to the public chat, and see real-time updates as other users join, leave, or send messages.


## Acknowledgements

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Lombok](https://projectlombok.org/)
- [SockJS](https://github.com/sockjs/sockjs-client)
- [STOMP](https://stomp.github.io/)

