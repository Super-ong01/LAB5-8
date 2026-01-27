# LAB3-4_REST-API
ตั้งใจทำกันหน่อยครับน้องๆ

## วิธีรันโปรเจค

1. ติดตั้ง Java 17+ และ Maven
2. เข้าไปที่โฟลเดอร์ `bkwcw-spring_labs/library`
3. รันคำสั่ง build:

```bash
mvn -DskipTests package
```

4. รันแอป (ตัวอย่าง):

```bash
java -jar target/library-0.0.1-SNAPSHOT.jar
```

แอปจะรันที่พอร์ต `8080` (ค่าเริ่มต้น)

## ตัวอย่าง API และคำสั่งทดสอบ (curl)

ฐาน URL: `http://localhost:8080/api`

- สร้าง Book (POST /api/books)

```bash
curl -s -X POST http://localhost:8080/api/books \
	-H 'Content-Type: application/json' \
	-d '{"title":"Clean Code","author":"Robert C. Martin","publicationYear":2008,"genre":"Programming","availableCopies":3}'
```

- สร้าง Member (POST /api/members)

```bash
curl -s -X POST http://localhost:8080/api/members \
	-H 'Content-Type: application/json' \
	-d '{"name":"Somchai","email":"somchai@example.com","phoneNumber":"0812345678","startDate":"2026-01-01","endDate":"2027-01-01"}'
```

- ยืมหนังสือ (POST /api/borrow) — ต้องมี `book.id` และ `member.id` ที่มีอยู่แล้ว

```bash
curl -s -X POST http://localhost:8080/api/borrow \
	-H 'Content-Type: application/json' \
	-d '{"book":{"id":1},"member":{"id":1}}'
```

- คืนหนังสือ (PUT /api/return/{recordId})

```bash
curl -s -X PUT http://localhost:8080/api/return/1
```

## Postman collection (ตัวอย่าง)

ไฟล์ตัวอย่าง Postman collection อยู่ที่ `postman/Library.postman_collection.json` ใน repo นี้ — นำเข้าใน Postman แล้วรันตามลำดับ:

- Create Book
- Create Member
- Borrow
- Return

---
### หมายเหตุ
- โปรเจคนี้ออกแบบให้เก็บข้อมูลในหน่วยความจำ (List) ตามข้อกำหนดของ Lab — ข้อมูลจะหายเมื่อหยุดแอป
- หากต้องการทดสอบครั้งต่อไป ให้สร้าง Book/Member ใหม่ก่อนการยืม

