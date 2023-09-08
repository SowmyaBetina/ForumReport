# ForumReport - ADMIN INTERFACE AND ANALYTICS

---

## Introduction

The Admin Interface is a critical component of our web application, and it plays a central role in managing the forum section. The interface manages posts and comments information and has the right to remove them if they don't follow guidelines. The Analtics displays the number of posts user uploaded and comments posted on user posts.

---
![MicrosoftTeams-image](https://github.com/SowmyaBetina/ForumReport/assets/141002741/99e77399-341f-4006-a565-e367f405c6d7)

<img width="478" alt="flowchart" src="https://github.com/SowmyaBetina/ForumReport/assets/141002741/2db5d277-47dc-4cc0-add0-684bfda0ab40">



## Functionality

### User Management

The interface takes care of user-related tasks, making it easy for individuals to become part of the forum community. It ensures secure access and user-friendly registration, allowing anyone to participate.

### Post and Comment Management

This aspect revolves around forum content. Users can create posts to initiate discussions and share their knowledge. Comments enable meaningful interactions within these posts, fostering a sense of community and collaboration.

### Reporting Comments

To maintain a positive and respectful forum environment, users have the power to report comments that may violate guidelines or exhibit disrespectful behavior. The interface ensures these reports are processed and addressed appropriately.

Reporting comments - 
/forum/post/{postId}/comment/{commentId}/report (POST): Allows users to report comments that violate community guidelines. Reports are stored for review.

Viewing report -
/forum/post/{postId}/comment/{commentId}/report/details (GET): Allows administrators to view details about reported comments and reported commentId.

### Analytics

Analytics functionality provide users with comprehensive insights into their profile's performance by tracking the number of posts uploaded and comments received on a daily, weekly, and monthly basis. This data helps users to gauge the reach of their profile and identify their most engaging and interacted posts, enabling informed content strategy decisions.

---

## Dependencies and Technologies

- Spring Framework
- Spring Security
- Java
- JPA (Java Persistence API)
- Thymeleaf (for HTML templates)
- MySql (DBeaver)

---

## Conclusion

This interface is the central managing unit that drives our forum, making it easy for users to share knowledge, engage in meaningful discussions, and community. Additionally, it ensures that the forum maintains a positive and respectful atmosphere. This admin's role is pivotal in delivering a user-friendly and enriching experience within our platform, where knowledge sharing and collaboration flourish.
