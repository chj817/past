package mvc;

public class ProductDao {
	public ProductDao() {}
	public void ProductInsert(ProductDTO product) {
		System.out.println("DB에 product입력");
		System.out.println(product);
		System.out.println("입력완료");
	}
	public void productDelete(int id) {
		System.out.println("DB에 ID 삭제");
		System.out.println(id);
		System.out.println("삭제 완료");
	}
	public void productUpdate(ProductDTO product) {
		System.out.println("DB에 ID 업데이트");
		System.out.println(product);
		System.out.println("업데이트 완료");
	}
}
