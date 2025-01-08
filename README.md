# Movie Database and Review Storage Application

## Project Description
This project is a **full-stack application** designed to manage movie databases and user-generated reviews. It provides a seamless user experience for browsing movies, reading reviews, and contributing feedback. The project is built using:

- **Frontend**: React (with Material-UI for design components)
- **Backend**: Spring Boot (Java-based RESTful APIs)
- **Database**: MongoDB (NoSQL database for efficient data storage and retrieval)

---

## Technologies Used
### Frontend
- **React**: For building the user interface.
- **Material-UI**: For pre-styled components and responsive design.

### Backend
- **Spring Boot**: For developing REST APIs and business logic.
- **Spring Security**: For authentication and authorization.

### Database
- **MongoDB**: NoSQL database for storing movie and review data.

---

## Setup Instructions

### Prerequisites
1. **Node.js** and **npm** installed on your machine.
2. **Java JDK 17+** and **Maven** for the backend.
3. **MongoDB** installed or access to a cloud-based MongoDB instance.

### Frontend Setup
1. Navigate to the frontend directory:
   ```bash
   cd movies-frontend
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Start the development server:
   ```bash
   npm start
   ```

### Backend Setup
1. Navigate to the backend directory:
   ```bash
   cd movies-backend
   ```
2. Build the project:
   ```bash
   mvn clean install
   ```
3. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```

### MongoDB Setup
1. Start MongoDB on your local machine or configure access to a remote MongoDB instance.
2. Update the backend's `application.properties` file with the MongoDB connection string:
   ```properties
   spring.data.mongodb.uri=mongodb:uri
   ```

---

## API Endpoints
### Movie Endpoints
- `GET /api/movies` - Fetch all movies.
- `POST /api/movies` - Add a new movie (Admin only).

### Review Endpoints
- `GET /api/reviews/{movieId}` - Fetch reviews for a movie.
- `POST /api/reviews/{movieId}` - Add a review for a movie.


