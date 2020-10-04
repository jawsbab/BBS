package common;

public class ActionForward {
	private String path; // url 경로 저장!
	private boolean redirect; // 주소 처리!
	
	public ActionForward() {
		
	}
	
	public ActionForward(String path, boolean redirect) {
		this.path = path;
		this.redirect = redirect;
	}
	
	// get & set Attributes
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isRedirect() {
		return redirect;
	}

	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
}
