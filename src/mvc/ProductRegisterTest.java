package mvc;

public class ProductRegisterTest {
	
	public static void main(String[] args) {
		/*UserDTO user = new UserDTO("id01","pwd01","ÀÌ¸»¼÷");
		UserBiz biz = new UserBiz();
		biz.register(user);
		*/
		ProductDTO product = new ProductDTO(1,"82³â»ý ±èÁö¿µ",13000);
		ProductBiz biz1 = new ProductBiz();
		biz1.register(product);
		
	}
}
