package com.myproject;

import java.io.IOException;


import java.lang.reflect.Field;

import javax.servlet.http.*;

import com.myproject.Store;
import com.myproject.Salon;

@SuppressWarnings("serial")
public class SeventhServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
			resp.setContentType("text/html");
			resp.setCharacterEncoding("UTF-8");
		if (req.getParameter("flag").equals("1")) {
				Store[] renostores = {
						new Store("РОЛЬФ RENAULT", "Sandero NEW", 
								"Санкт-Петербург, ул. Савушкина, д. 103.",
								"319 000 руб.",
								"8 (800) 550-23-30",
								"«РОЛЬФ Лахта» Renault - официальный дилер Renault в Санкт-Петербурге"
								+ " который располагается на севере города в районе Лахта."
								+ " Клиентом РОЛЬФ быть выгодно!",
								"http://rolf-renault.ru/content/13166/42235")};
				Store[] hyndstores = {
						new Store("ИСТ МАРКЕТ МОТОРС", "Hyundai ix35", 
								"Санкт-Петербург, ул. Планерная, 7",
								"997 900 руб.",
								"8 (812) 430-11-11",
								"«Ист Маркет Моторс» — Первый Официальный Дилер HYUNDAI в Санкт-Петербурге."
								+ " Мы работаем уже более 20 лет. "
								+ "Предлагаем автомобили всего модельного ряда автомобилей марки HYUNDAI "
								+ "а также комплекс работ по сервисному и техническому обслуживанию автомобилей.",
								"http://www.hyundai-eastmarket.ru/promo/ix35")};
				Store[] toyostores = {
						new Store("Тойота Центр Невский", "Toyota Land Cruiser Prado",
								" Санкт-Петербург, пр. Дальневосточный, дом 41",
								"1 999 000 руб.",
								"8 (812) 449-99-33",
								"Официальный дилер ООО «Tойота Мотор». Весь модельный ряд. Автомобили с пробегом. "
								+ "Сервисное обслуживание. Запчасти и аксессуары. "
								+ "Кузовной ремонт. Удаленное урегулирование убытков. Аэрография.",
								"http://toyota-nevsky.ru/new-cars/land-cruiser/index.json")};
				Store[] mazdstores = {
						new Store("Евросиб-Авто на Пулковском", "Mazda3", 
								"Санкт-Петербург, Пулковское шоссе 36, корпус 3а",
								"917 000 руб.", 
								"8 (812) 740-20-00",
								"Первый официальный дилер Mazda в России. Продажа новых автомобилей. Сервисный центр. "
								+ "Гарантийное и послегарантийное обслуживание. Кредит. Страхование.",
								"http://www.mazdaspb.ru/cars/mazda3/hatchback/overview/")};
				Store[] volkstores = {
						new Store("Аксель-Сити Юг", "Volkswagen Tiguan",
								"Санкт-Петербург, ул. Тельмана, 29.",
								"1 113 000 руб.",
								"8 (812) 740-20-00",
								"Официальный дилер Volkswagen в Санкт-Петербурге. "
								+ "Продажа легковых и коммерческих автомобилей Volkswagen."
								+ " Продажа автомобилей с пробегом."
								+ " Техническое обслуживание автомобилей Volkswagen. Кредит. Лизинг. Страхование."
								+ " Спецпредложения",
								"http://www.volkswagen-axsel.ru/models/tiguan/specials/")};
				Store[] swedstores = {
						new Store("Swed-Mobil", "Volvo XC60",
								"Санкт-Петербург, пр. Энергетиков, д.59, корп.3",
								"1 950 000 руб.",
								"8 (812) 303-85-85",
								"Продажа автомобилей с пробегом от компании Swed-Mobil официального дилера VOLVO."
								+ " Срочный выкуп. Комиссия. Обмен.",
								"http://swedmobil-tradein.ru/buy/cars-in-stock/3201")};
				Store[] bmwstores = {
						new Store("BMW БалтАвтоТрейд", "BMW X3",
								"Санкт-Петербург, Шкиперский проток, 21",
								"2 200 000 руб.",
								"8 (812) 325-52-52",
								"«БалтАвтоТрейд» - один из крупнейших дилерских центров BMW в Санкт-Петербурге."
								+ " В центре предоставляется полный спектр услуг в области продаж и "
								+ "сервисного обслуживания автомобилей BMW."
								+ " Система Trade-In и комиссия - быстро - дорого - удобно для Вас.",
								"http://www.bmw-balttrade.ru/")};
				Salon[] salons = { new Salon("Рено", renostores),
						new Salon("Хёндай", hyndstores),
						new Salon("Тойота", toyostores),
						new Salon("Мазда", mazdstores),
						new Salon("Фольцваген", volkstores),
						new Salon("Свид мобил", swedstores),
						new Salon("БМВ", bmwstores)};
				
				
				resp.getWriter().print("<table>");
				resp.getWriter().print("<tr>");
				for (Field field : salons[Integer.parseInt(req.getParameter("salon"))].stores[0].getClass().getDeclaredFields()) {
					resp.getWriter().print("<th>" + field.getName() + "</th>");
				}
				resp.getWriter().print("</tr>");
				for (int i = 0; i < salons[Integer.parseInt(req.getParameter("salon"))].stores.length; i++) {
					resp.getWriter().print("<tr>");
					for (Field field : salons[Integer.parseInt(req.getParameter("salon"))].stores[i].getClass()
							.getDeclaredFields()) {
						try {
							resp.getWriter()
									.print("<td>" + field.get(salons[Integer.parseInt(req.getParameter("salon"))].stores[i])
											+ "</td>");
						} catch (IllegalArgumentException
								| IllegalAccessException e) {
							e.printStackTrace();
						}
					}
					resp.getWriter().print("</tr>");
				}
				resp.getWriter().print("</table>");

		} else if (req.getParameter("flag").equals("0")) {
			resp.getWriter().println("");
		}
	}
}