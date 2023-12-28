<h1 align="center">Url Shortner</h1>

<p align="center">
  <img src="./assets/cs50-harvard-banner.png" />
</p>

<p align="center">
Project developed during <a href="https://cs50.harvard.edu/x/2023/">Harvard CS50</a>
</p>

## Overview

This is a full-stack web application for URL shortening, built with modern technologies. The front end is developed using ReactJS with Vite and TypeScript, providing a responsive and efficient user interface. On the backend, the application leverages Java with Spring Boot, ensuring a robust and scalable server-side architecture. MongoDB serves as the database, facilitating data storage and retrieval.

## Demo

TODO

## Features

- **URL Shortening**: Easily create shortened versions of long URLs for convenient sharing.
- **User-Friendly Interface**: A clean and intuitive front-end design built with ReactJS to enhance user experience.
- **Secure Backend**: The backend, powered by Java and Spring Boot, ensures a secure and reliable server environment.
- **Data Storage with MongoDB**: Persistent storage of URL mappings in a MongoDB database for seamless access and retrieval.
- **Dockerized Environment**: Utilizes Docker Compose to provide a containerized setup, including a MongoDB instance and a Mongo Express server for database management.

## Techs Used

- ReactJS
- Vite
- TypeScript
- Java
- Spring Boot
- MongoDB
- Docker Compose

## Project Structure

```
.
├── apps
│    ├── web
│    └── api
└── docker-compose.yml
```

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/henriq4/url-shortner.git
   ```

2. Navigate to the project directory:

   ```bash
   cd url-shortner
   ```

3. Run the database setup with docker compose:

   ```bash
   docker compose up -d
   ```

   This will initialize the MongoDB instance and the Mongo Express server.

4. Start the web and api applications:

   - Web:

     ```bash
     cd web
     ```

     ```bash
     pnpm install
     ```

     ```bash
     pnpm run dev
     ```

   - Api:

     ```bash
     cd api
     ```

     ```bash
     ./gradlew bootRun
     ```

5. Access the application:

   - Web client: http://localhost:5173
   - Mongo Express: http://localhost:8081

## Contribution

Feel free to contribute to the project by creating issues or submitting pull requests. Your feedback and contributions are highly appreciated.

## License

This project is under MIT License and philosophy on [academic honesty](https://cs50.harvard.edu/x/2023/honesty/) from CS50.

## Author

<table>
  <tr>
    <td valign="top">
      <img src="https://github.com/henriq4.png?size=120" width=120>
    </td>
    <td valign="center">
      <p><b>@henriq4</b><br>Software Developer</p>
    </td>
    <td valign="center">
      <a href="https://henriquegc.com" target="_blank"><img src="https://img.shields.io/badge/henriquegc.com-black?&style=for-the-badge"></a>
      <a href="https://www.github.com/henriq4" target="_blank"><img src="https://img.shields.io/badge/GitHub-%23333333.svg?&style=for-the-badge&logo=github&logoColor=white" alt="GitHub"></a>
      <a href="https://www.linkedin.com/in/henriq4" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank" alt="LinkedIn"></a> 
    </td>
  </tr>
  </table>
