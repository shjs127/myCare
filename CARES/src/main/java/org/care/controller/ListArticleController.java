package org.care.controller;

import javax.inject.Inject;

import org.care.domain.BoardInfo;
import org.care.domain.Criteria;
import org.care.domain.PageMaker;
import org.care.service.ListArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/board")
public class ListArticleController {

	private static final Logger logger = LoggerFactory.getLogger(ListArticleController.class);

	@Inject
	private ListArticleService listArticleService;

	/*
	 * @Resource(name = "uploadPath") private String uploadPath;
	 */

	@RequestMapping(value = "/listArticle", method = RequestMethod.GET)
	public String mainPage(@ModelAttribute("cri") Criteria cri, BoardInfo bInfo, Model model) throws Exception {

		logger.info(cri.toString());
		
		model.addAttribute("articleList", listArticleService.listCriteria(cri));
		PageMaker pageMaker=new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(listArticleService.listCountCriteria(cri));
		model.addAttribute("pageMaker", pageMaker);

		return "board/listArticle";
	}

}