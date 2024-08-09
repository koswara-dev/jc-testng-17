## Materi: Grup Tes dan Parameterisasi Tes di TestNG

### 1. Grup Tes
Grup tes adalah fitur di TestNG yang memungkinkan kita untuk mengelompokkan kasus uji menjadi beberapa kategori. Ini sangat berguna saat kita ingin menjalankan subset dari semua tes.

#### Contoh Penggunaan Grup Tes
1. **Menentukan Grup dalam Metode Tes:**
   ```java
   import org.testng.annotations.Test;

   public class GroupTestExample {

       @Test(groups = { "sanity" })
       public void test1() {
           System.out.println("Sanity Test - test1");
       }

       @Test(groups = { "regression" })
       public void test2() {
           System.out.println("Regression Test - test2");
       }

       @Test(groups = { "sanity", "regression" })
       public void test3() {
           System.out.println("Sanity and Regression Test - test3");
       }
   }
   ```

2. **Menjalankan Grup Tertentu melalui XML:**
   ```xml
   <!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
   <suite name="Suite1">
       <test name="TestGroup">
           <groups>
               <run>
                   <include name="sanity"/>
               </run>
           </groups>
           <classes>
               <class name="GroupTestExample" />
           </classes>
       </test>
   </suite>
   ```

3. **Menjalankan Grup Tertentu melalui Command Line:**
   ```sh
   mvn test -Dgroups="sanity"
   ```

### 2. Parameterisasi Tes
Parameterisasi adalah teknik untuk menjalankan metode tes dengan berbagai data input tanpa menduplikasi kode tes.

#### Contoh Parameterisasi Menggunakan XML
1. **Menentukan Parameter di XML:**
   ```xml
   <!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
   <suite name="Suite1">
       <test name="ParameterizedTest">
           <parameter name="username" value="user1"/>
           <parameter name="password" value="pass123"/>
           <classes>
               <class name="ParameterizedTestExample" />
           </classes>
       </test>
   </suite>
   ```

2. **Menggunakan Parameter di Kode Tes:**
   ```java
   import org.testng.annotations.Parameters;
   import org.testng.annotations.Test;

   public class ParameterizedTestExample {

       @Test
       @Parameters({ "username", "password" })
       public void loginTest(String username, String password) {
           System.out.println("Username: " + username);
           System.out.println("Password: " + password);
       }
   }
   ```

#### Contoh Parameterisasi Menggunakan DataProvider
1. **Mendefinisikan DataProvider:**
   ```java
   import org.testng.annotations.DataProvider;
   import org.testng.annotations.Test;

   public class DataProviderTestExample {

       @DataProvider(name = "loginData")
       public Object[][] getData() {
           return new Object[][]{
               {"user1", "pass123"},
               {"user2", "pass456"}
           };
       }

       @Test(dataProvider = "loginData")
       public void loginTest(String username, String password) {
           System.out.println("Username: " + username);
           System.out.println("Password: " + password);
       }
   }
   ```

### Studi Kasus
1. **Membuat Uji Gruplokalasi:**
    - Buat kelas tes dengan metode yang dikelompokkan ke dalam grup "sanity" dan "regression".
    - Jalankan hanya grup “sanity” menggunakan file XML atau command line.

2. **Parameterisasi Tes Login:**
    - Buat metode tes login yang membutuhkan username dan password.
    - Parameterisasi tes tersebut dengan nilai yang berbeda menggunakan DataProvider.

### Latihan Mandiri
1. **Buat proyek baru dengan TestNG.**
2. **Tulis beberapa tes dan kelompokkan mereka dalam berbagai grup.**
3. **Eksperimen dengan pengaturan parameter menggunakan XML dan DataProvider.**

Dengan memahami konsep grup tes dan parameterisasi tes, Anda akan dapat menulis tes yang lebih terstruktur, fleksibel, dan mudah dipelihara menggunakan TestNG.
