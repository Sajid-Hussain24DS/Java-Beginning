// -- Create database
CREATE DATABASE IF NOT EXISTS water_management_db;
USE water_management_db;


// table _1
//-- Products table
CREATE TABLE IF NOT EXISTS products (
  //--product_id
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    size VARCHAR(50),
    type VARCHAR(50),
    price DECIMAL(10,2),
    status VARCHAR(20),
    remarks TEXT
);
table 2
CREATE TABLE product_price_history()

table 3
CREATE TABLE bussiness_area(
    ba_id INT,
    bussiness_area 
)
table 4
CREATE TABLE sub_area_bussiness(

sba_id 
bussiness_area _ id,
sub_area_bussiness

)


table 5
//-- Clients table
CREATE TABLE IF NOT EXISTS clients (
//-- client_id, client_name,delivery_location,service_area(seprate),
//-- 
    client_id INT AUTO_INCREMENT PRIMARY KEY,
    client_name VARCHAR(100) NOT NULL,
    delivery_location VARCHAR(100),
    area VARCHAR(100),
    contact VARCHAR(20),
    status VARCHAR(20) DEFAULT 'Active'
    sub_area_bussiness id
);


table 6
//-- Orders table
CREATE TABLE IF NOT EXISTS orders (

//-- order_id,,,,price auto,total_amount,order_status(pending,partial_delivery,full_delivery,canceled)
    order_id VARCHAR(36) PRIMARY KEY,
     client_id INT NOT NULL,
         product_id INT NOT NULL,
         order_units INT,
        delivered_units INT,
        remaining_units
        unit_price,
        units_amount INT,
        order_status //(pending,partial,fullFilled,canceled)
        date DATE NOT NULL,
    
      remarks TEXT,
    FOREIGN KEY (client_id) REFERENCES clients(id),
     FOREIGN KEY (product_id) REFERENCES products(id)
        );


        //Table 7

        CREATE TABLE invoice(
            invoice_id,
            order_id,

        )

table 8
//-- Payments table (simplified)
CREATE TABLE IF NOT EXISTS payments (
//-- payment_mode (csah on delivery ,monthly),payment_id,payment_mode,
//-- payment_id,invoice_id,net_amount,paid_amount,dues,payment_status(paid,partial,not_paid),payment_date,remarks.
    payment_id INT AUTO_INCREMENT PRIMARY KEY,
    invoice_id,
    order_id VARCHAR(36),
    net_amount,
    previous_dues,
    payable_amount,
    paid_amount,
    dues,
    payment_date DATE NOT NULL,
    payment_mode (cash on delivery ,monthly)
    payment_status, // pending,partial,paid
    remarks TEXT,
    FOREIGN KEY (order_id) REFERENCES orders(id)
);


table 9
CREATE TABLE employee()


table 10
CREATE TABLE 