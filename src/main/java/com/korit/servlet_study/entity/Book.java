package com.korit.servlet_study.entity;

<<<<<<< HEAD
=======

>>>>>>> 71d2df522bfa1462034a33ebac4bddb92618d6d9
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    private int bookId;
    private String bookName;
    private String isbn;
    private int authorId;
    private int publisherId;
    private int categoryId;
    private String bookImgUrl;

    private Author author;
    private Publisher publisher;
<<<<<<< HEAD
    private BookCategory bookCategory;
=======
    private BookCategory category;
>>>>>>> 71d2df522bfa1462034a33ebac4bddb92618d6d9
}
