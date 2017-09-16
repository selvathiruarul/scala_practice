package retail

/**
  * Created by selva on 9/13/17.
  */
class Departmeny(
                departmentId:Int,
                departmentName:String
                ){
  override def toString() = "Department(" +
    departmentId +
    "," +
    departmentName +
    ")"

}

class Category(
                categoryId: Int,
                categoryDepartmentId: Int,
                categoryName: String
              ) {
  override def toString() = "Category(" +
    categoryId +
    "," +
    categoryDepartmentId +
    "," +
    categoryName

  ")"
}
class Product(
               productId: Int,
               productCategoryId: Int,
               productName: String,
               productDescription: String,
               productPrice: Float,
               productImage: String
             ) {
  override def toString() = "Product(" +
    productId +
    "," +
    productCategoryId +
    "," +
    productName +
    "," +
    productDescription +
    "," +
    productPrice +
    "," +
    productImage +
    ")"
}
class Customer(
                customerId: Int,
                customerFname: String,
                customerLname: String,
                customerEmail: String,
                customerPassword: String,
                customerStreet: String,
                customerCity: String,
                customerState: String,
                customerZipcode: String
              ) {
  override def toString: String = "Customer(" +
    customerId +
    "," +
    customerFname +
    "," +
    customerLname +
    "," +
    customerEmail +
    "," +
    customerPassword +
    "," +
    customerStreet +
    "," +
    customerCity +
    "," +
    customerState +
    "," +
    customerZipcode +
    ")"
}
class Order(
             orderId: Int,
             orderDate: String,
             orderCustomerId: Int,
             orderStatus: String
           ) {
  override def toString: String = "Order(" +
    orderId +
    "," +
    orderDate +
    "," +
    orderCustomerId +
    "," +
    orderStatus +
    ")"
}
class OrderItems(
                 orderItemId: Int,
                 orderItemOrderId: Int,
                 orderItemProductId: Int,
                 orderItemQuantity: Int,
                 orderItemSubtotal: Float,
                 orderItemProductPrice: Float
               ) {
  require(
    orderItemSubtotal == orderItemQuantity * orderItemProductPrice, "Invalid orderItemSubtotal " + orderItemSubtotal
  )

  //Additional constructor
  def this(
            orderItemId: Int,
            orderItemOrderId: Int,
            orderItemProductId: Int,
            orderItemQuantity: Int,
            orderItemProductPrice: Float
          ) = {
    //Invoking default constructor
    this(orderItemId,
      orderItemOrderId,
      orderItemProductId,
      orderItemQuantity,
      orderItemQuantity * orderItemProductPrice,
      orderItemProductPrice)
  }

  override def toString: String = "OrderItem(" +
    orderItemId +
    "," +
    orderItemOrderId +
    "," +
    orderItemProductId +
    "," +
    orderItemQuantity +
    "," +
    orderItemSubtotal +
    "," +
    orderItemProductPrice +
    ")"
}

object retail {
  def main(args: Array[String]) = {
    val oi = new OrderItems(1, 1, 1, 2, 100, 50)
    println(oi)
    val ordItem = new OrderItems(2, 1, 3, 3, 50)
    println(ordItem)
  }
}