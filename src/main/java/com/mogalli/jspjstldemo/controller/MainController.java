package com.mogalli.jspjstldemo.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.mogalli.jspjstldemo.services.PlanService;
import com.mogalli.jspjstldemo.services.ProjectService;

@Controller
public class MainController implements ErrorController {

	@Autowired
	public PlanService planServices;
	@Autowired
	public ProjectService projectService;

	private static final String PATH = "/error";

	@RequestMapping("/home")
	public String displayProjects(ModelMap modelmap) {

		modelmap.addAttribute("project", planServices.getPlan().getAutomate_plan());
		modelmap.addAttribute("max_allowed_parl_exec", planServices.getPlan().getTeam_parallel_sessions_max_allowed());
		modelmap.addAttribute("queues_sessions", planServices.getPlan().getQueued_sessions());
		modelmap.addAttribute("paralell_sessions_running", planServices.getPlan().getParallel_sessions_running());
		modelmap.addAttribute("projectService", projectService.getAllProjects());
		return "home";
	}

	@RequestMapping("/")
	public void backToHomePage(HttpServletResponse response) {
		try {
			response.sendRedirect("/home");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("/project")
	public String displayProjectByID(@RequestParam("id") int id, ModelMap modelMap) {

		modelMap.addAttribute("oneproid", projectService.getOneProject(id).getId());
		modelMap.addAttribute("oneproname", projectService.getOneProject(id).getName());
		modelMap.addAttribute("createdon", projectService.getOneProject(id).getCreated_at());
		modelMap.addAttribute("updatedon", projectService.getOneProject(id).getUpdated_at());
		modelMap.addAttribute("buildlist", projectService.getOneProject(id).getBuilds());

		return "project";
	}

	@RequestMapping("/builds")
	public String displayProjectByID(ModelMap modelMap) {

		modelMap.addAttribute("allbuilds", projectService.getAllBuilds());
		return "builds";
	}

	@RequestMapping("/sessions")
	public String displaySessions(@RequestParam("id") String id, ModelMap modelMap) {

		modelMap.addAttribute("allsessions", projectService.getAllSessions(id));
		return "session";
	}

	@RequestMapping(value = PATH)
	public String error() {
		return "error";
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}

}
