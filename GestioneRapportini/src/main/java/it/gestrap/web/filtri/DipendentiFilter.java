package it.gestrap.web.filtri;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import it.gestrap.util.Costanti;
import it.gestrap.web.controller.Utente;
@WebFilter(urlPatterns = "/dipendenti/*", dispatcherTypes = {DispatcherType.REQUEST})
public class DipendentiFilter implements Filter  {
	
	@Autowired
	private Utente utenteBean;
	
    @Override
    public void destroy() {
        // ...
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //
    }
    
    
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		Utente utente=(Utente) ((HttpServletRequest) request).getSession().getAttribute("utente");
		if(null!=utente && utente.getStato().equals(Costanti.UTENTE_LOGGATO)) {
			 chain.doFilter(request, response);
		}
		else {
			String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
			//metto in sessione la pagina che volevo raggiungere, così da esservi reindirizzato automaticamente dopo l'operazione di login
			req.getSession().setAttribute(Costanti.URL_RICHIESTO, requestUrl);
			String msg = "Devi fare l'accesso per poter accedere alla pagina";
			req.setAttribute("msg", msg);
			req.getRequestDispatcher("login").forward(req, resp);
		}
	       
		
	}
    
}