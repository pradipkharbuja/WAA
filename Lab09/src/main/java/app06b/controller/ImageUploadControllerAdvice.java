package app06b.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import app06b.exception.InvalidImageUploadException;

@ControllerAdvice
public class ImageUploadControllerAdvice {

	@ExceptionHandler(InvalidImageUploadException.class)
	public ModelAndView handleError(HttpServletRequest request, InvalidImageUploadException exception) {

		ModelAndView mav = new ModelAndView();

		mav.addObject("invalidImage", exception.getFullMessage());
		mav.setViewName("image-upload-error");

		return mav;
	}
}
