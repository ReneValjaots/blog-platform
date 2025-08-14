# Blog Platform

## Project Overview
This project is a full-stack blog platform built with Spring Boot (Java) and a React frontend with Vite.

## Thought process and reasoning

### Backend
For the backend, I used Spring Boot and implemented some design patterns:
- **Service Layer:** Business logic is isolated in service classes, ensuring separation of concerns from the web and data layers.
- **Repository Pattern:** This pattern abstracts the data access layer, decoupling business logic from the specifics of the database implementation.
- **DTOs (Data Transfer Objects)** DTOs are used to control the data exposed to the client, preventing over-exposure of internal data.
- **JWT Authentication:** The application uses JSON Web Tokens (JWT) allowing users to log in and perform authenticated actions.

### Database
The application uses PostgreSQL as the database.

### Frontend
The frontend is a modern single-page application built with React and a fast development server provided by Vite. The configuration is designed to be flexible, using environment variables to correctly route API calls whether the application is running locally or inside a Docker container.

### Application Design
The application provides fundamental CRUD (Create, Read, Update, Delete) functionality for blog content, including categories, tags, and posts.

### API Endpoints

**Authentication endpoints:**
| Method | Endpoint                | Description                                   |
|--------|-------------------------|-----------------------------------------------|
| POST    | /api/v1/auth/login             | 	Authenticate a user and receive a JWT.                            |

**Categories endpoints:**

| Method | Endpoint                | Description                                   |
|--------|-------------------------|-----------------------------------------------|
| GET    | /api/v1/categories            | 	Get all categories.                           |
| POST    | 	/api/v1/categories             | 	Create a new category (requires authentication).                            |
| DELETE    | /api/v1/categories/{id}	      | Delete a specific category (requires authentication).|

**Posts endpoints:**
| Method | Endpoint                | Description                                   |
|--------|-------------------------|-----------------------------------------------|
| GET    | /api/v1/posts         | Get all published posts.             |
| POST    | /api/v1/posts      | 	Create a new post (requires authentication).                    |
| GET    | 	/api/v1/posts/{id}         | 	Get a single post by its ID.            |
| GET    | 		/api/v1/posts/drafts         | 	Get all draft posts (requires authentication).            |
| PUT    | 			/api/v1/posts/{id}       | 		Update a post (requires authentication).            |
| DELETE | /api/v1/posts/{id}         | 	Delete a specific post (requires authentication).                      |

**Tags endpoints:**
| Method | Endpoint                | Description                                   |
|--------|-------------------------|-----------------------------------------------|
| GET    | 	/api/v1/tags | Get all tasks.    |
| POST   | 	/api/v1/tags               | 		Create new tags (requires authentication).                             |
| DELETE   | /api/v1/tags/{id}              | Delete a specific tag (requires authentication).                           |

---

## Step-by-step guide to run
1) **Clone the repository**  Run the following command in your terminal:
  ```bash
  git clone https://github.com/ReneValjaots/blog-platform.git
  ```

2) **Move to directory**  Run the following command in your terminal:
  ```bash
  cd blog
  ```

3) **Docker compose build**  Run the following command in your terminal:
  ```bash
  docker-compose up --build
  ```

4) **Application url** After the containers are running, the frontend should be accessible at: http://localhost:5173/
5) **Test user** For testing purposes, you can log in with the following credentials:
   - **Email:** `user@test.com`
   - **Password:** `password`
