package com.bundesreport.component;

import org.springframework.context.MessageSource;

import com.bundesreport.domain.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SidebarBean extends MessageBean {

	public SidebarBean(MessageSource msgSrc, User user) {
		super(msgSrc, user);

		setTitle(getMsgUtil().getMessage("title"));
		home = getMsgUtil().getMessage("menu.home");
		menu = getMsgUtil().getMessage("menu.menu");
		board = getMsgUtil().getMessage("menu.board");
		freeBoard = getMsgUtil().getMessage("menu.freeBoard");
		abroadBoard = getMsgUtil().getMessage("menu.abroadBoard");
		livingQA = getMsgUtil().getMessage("menu.livingQA");
		fleaMarket = getMsgUtil().getMessage("menu.fleaMarket");
		jobSearch = getMsgUtil().getMessage("menu.jobSearch");
		club = getMsgUtil().getMessage("menu.club");
		eventNotification = getMsgUtil().getMessage("menu.eventNotification");
		recipe = getMsgUtil().getMessage("menu.recipe");
		gallery = getMsgUtil().getMessage("menu.gallery");
		event = getMsgUtil().getMessage("menu.event");
		miniGame = getMsgUtil().getMessage("menu.miniGame");
		rain = getMsgUtil().getMessage("menu.rain");
	}

	private String home;
	private String menu;
	private String board;
	private String freeBoard;
	private String abroadBoard;
	private String livingQA;
	private String fleaMarket;
	private String jobSearch;
	private String club;
	private String eventNotification;
	private String recipe;
	private String gallery;
	private String event;
	private String miniGame;
	private String rain;
}
