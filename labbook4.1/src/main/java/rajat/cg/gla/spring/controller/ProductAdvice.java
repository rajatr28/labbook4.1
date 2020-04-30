package rajat.cg.gla.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import rajat.cg.gla.spring.exception.ProductException;

@RestControllerAdvice
public class ProductAdvice {
	@ExceptionHandler(value = ProductException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ModelAndView handleException(Exception exception, Model model) {
		ModelAndView mav = new ModelAndView("exceptionpage");
		model.addAttribute("ex", exception);
		return mav;
	}
}
