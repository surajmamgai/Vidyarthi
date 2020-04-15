
package admin;


class User {
      private String name,isbn,writter,code;
      public User(String name,String writter,String isbn,String code)
      {
         this.code=code;
         this.isbn=isbn;
         this.name=name;
         this.writter=writter;
      }
      public String get_name()
      {
          return name;
      }
       public String get_Writter()
      {
          return writter;
      }
        public String get_isbn()
      {
          return isbn;
      }
         public String get_code()
      {
          return code;
      }
}
