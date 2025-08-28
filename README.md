# YouTubeScrapper

YouTubeScrapper is a Java Spring Boot application designed to scrape and display YouTube video details. The project is organized using the standard Maven structure and leverages Spring MVC for web functionality.

## Project Structure


├── mvnw, mvnw.cmd           # Maven wrapper scripts
├── pom.xml                  # Maven project configuration
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/ytscrapper/
│   │   │       ├── YtscrapperApplication.java      # Main Spring Boot application class
│   │   │       ├── config/
│   │   │       │   └── YtConfig.java              # Configuration for YouTube API or app settings
│   │   │       ├── controller/
│   │   │       │   └── YtController.java          # Handles HTTP requests and routes
│   │   │       ├── services/
│   │   │       │   └── YtService.java             # Business logic for scraping YouTube
│   │   ├── resources/
│   │   │   ├── application.properties             # App configuration properties
│   │   │   └── templates/
│   │   │       ├── index.html                     # Home page
│   │   │       ├── details.html                   # Video details page
│   │   │       └── error.html                     # Error page
│   ├── test/
│   │   ├── java/
│   │   │   └── com/example/ytscrapper/
│   │   │       └── YtscrapperApplicationTests.java # Unit tests for the application
├── target/                  # Compiled classes and build output


## Key Components

- *YtscrapperApplication.java*: Entry point for the Spring Boot application.
- *YtConfig.java*: Manages configuration, possibly for YouTube API keys or other settings.
- *YtController.java*: Defines REST endpoints and handles user requests.
- *YtService.java*: Contains the core logic for scraping YouTube data and processing results.
- *Templates*: HTML files for rendering the UI, including the main page, details, and error handling.
- *application.properties*: Stores configuration such as server port, API keys, etc.

## How It Works

1. *User Interaction*: Users interact with the web interface (index.html) to submit queries or requests.
2. *Controller Layer*: YtController receives HTTP requests and delegates processing to the service layer.
3. *Service Layer*: YtService performs YouTube scraping, data retrieval, and business logic.
4. *Configuration*: YtConfig provides necessary configuration for the service.
5. *View Rendering*: Results are rendered using Thymeleaf templates (details.html, error.html).

## Getting Started

### Prerequisites
- Java 8 or higher
- Maven

### Build and Run
1. Clone the repository:
   sh
   git clone https://github.com/Deeppati2005/YouTubeScrapper.git
   
2. Navigate to the project directory:
   sh
   cd YouTubeScrapper
   
3. Build the project:
   sh
   ./mvnw clean install
   
4. Run the application:
   sh
   ./mvnw spring-boot:run
   
5. Access the web interface at http://localhost:8080

## Testing
- Unit tests are located in src/test/java/com/example/ytscrapper/YtscrapperApplicationTests.java.
- Run tests with:
  sh
  ./mvnw test
  

## Configuration
- Edit src/main/resources/application.properties to set up API keys, server port, and other settings.

## License
This project is licensed under the MIT License.

## Author
- Deeppati2005

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## Screenshots

Below are screenshots demonstrating the application's functionality:

### Home Page
![Home Page](Screenshots/image1.png)

### Details Page
![Details Page](Screenshots/image2.png)
![Details Page](Screenshots/image3.png)
