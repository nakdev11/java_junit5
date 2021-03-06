package tddbc;

public class Ichigo {

    private String hinsyu;

	public String getHinsyu() {
		return hinsyu;
	}

	public void setHinsyu(String hinsyu) throws Exception {
		this.hinsyu = hinsyu;
		throw new Exception();
	}


}
