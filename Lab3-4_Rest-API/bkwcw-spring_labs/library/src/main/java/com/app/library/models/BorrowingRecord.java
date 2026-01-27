package com.app.library.models;

// LAB 3: annotated for Lab 3 identification

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BorrowingRecord {

	private Long id;

	@JsonProperty("bookId")
	private Long bookId;
    
	@JsonProperty("memberId")
	private Long memberId;

    private LocalDate borrowDate;
    private LocalDate returnDate;
    private LocalDate dueDate;

    // Default constructor
    public BorrowingRecord() {}

    // Parameterized constructor
    // Construct a borrowing record. `id` is expected to be assigned externally.
    public BorrowingRecord(Long bookId, Long memberId, LocalDate borrowDate, LocalDate dueDate) {
        this.bookId = bookId;
        this.memberId = memberId;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookId() {
        return bookId;
    }

    package com.app.library.models;

    // LAB 3: annotated for Lab 3 identification

    import java.time.LocalDate;

    /**
     * Model: BorrowingRecord
     * Responsibility: represent a borrowing transaction linking a Book and a Member
     * According to lab spec this object contains `Book book` and `Member member`.
     */
    public class BorrowingRecord {

        private Long id;

        // The actual Book and Member objects involved in this record
        private Book book;
        private Member member;

        private LocalDate borrowDate;
        private LocalDate returnDate;
        private LocalDate dueDate;

        public BorrowingRecord() {}

        public BorrowingRecord(Book book, Member member, LocalDate borrowDate, LocalDate dueDate) {
            this.book = book;
            this.member = member;
            this.borrowDate = borrowDate;
            this.dueDate = dueDate;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Book getBook() {
            return book;
        }

        public void setBook(Book book) {
            this.book = book;
        }

        public Member getMember() {
            return member;
        }

        public void setMember(Member member) {
            this.member = member;
        }

        public LocalDate getBorrowDate() {
            return borrowDate;
        }

        public void setBorrowDate(LocalDate borrowDate) {
            this.borrowDate = borrowDate;
        }

        public LocalDate getReturnDate() {
            return returnDate;
        }

        public void setReturnDate(LocalDate returnDate) {
            this.returnDate = returnDate;
        }

        public LocalDate getDueDate() {
            return dueDate;
        }

        public void setDueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
        }

        @Override
        public String toString() {
            return "BorrowingRecord{" +
                    "id=" + id +
                    ", book=" + (book != null ? book.getId() : null) +
                    ", member=" + (member != null ? member.getId() : null) +
                    ", borrowDate=" + borrowDate +
                    ", returnDate=" + returnDate +
                    ", dueDate=" + dueDate +
                    '}';
        }
    }