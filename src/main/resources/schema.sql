CREATE TABLE parent
(
  parent_no BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
  name      VARCHAR2(30)                      NULL,
);

CREATE TABLE child
(
  child_no  BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
  parent_no BIGINT                            not null,
  name      VARCHAR2(30)
);
