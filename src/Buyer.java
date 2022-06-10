
public class Buyer extends User {
		private String BuyerID;
		private String Name;
		
		public Buyer(String username, String password, int phoneNum, String email, String address, String id, String name) {
			super();
			
			BuyerID = id;
			Name = name;
			
		}

		public String getBuyerID() {
			return BuyerID;
		}

		public void setBuyerID(String buyerID) {
			BuyerID = buyerID;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}
		
}
