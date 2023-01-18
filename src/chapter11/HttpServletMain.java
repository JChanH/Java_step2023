package chapter11;

public class HttpServletMain {
	public void serv(HttpServlet httpServlet) {
		httpServlet.service();

	}

	public static void main(String[] args) {
		HttpServletMain obj = new HttpServletMain();
		obj.serv(new FileDownloadService());
		obj.serv(new Loginservice());

	}
}
