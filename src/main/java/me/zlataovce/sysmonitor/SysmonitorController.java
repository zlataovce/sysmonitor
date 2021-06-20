package me.zlataovce.sysmonitor;

import me.zlataovce.sysmonitor.utils.ConfigManager;
import me.zlataovce.sysmonitor.wrappers.MachineWrapper;
import me.zlataovce.sysmonitor.wrappers.WrapperFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@SpringBootApplication
@RestController
public class SysmonitorController {
	private final WrapperFactory gatherer = new WrapperFactory();
	private final ConfigManager manager = new ConfigManager();
	private final Logger logger = LoggerFactory.getLogger(SysmonitorController.class);

	public static void main(String[] args) {
		SpringApplication.run(SysmonitorController.class, args);
	}

	@RequestMapping(value = "/api", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MachineWrapper> getMachineInfo(@RequestParam(value = "key") String key) {
		if (!Objects.equals(key, manager.getProp().getProperty("apitoken"))) {
			if (Boolean.parseBoolean(manager.getProp().getProperty("debug"))) {
				logger.warn("The supplied API key was " + key + ", while the saved one is " + manager.getProp().getProperty("apitoken") + ".");
			}
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
		return new ResponseEntity<>(gatherer.wrapMachine(), HttpStatus.OK);
	}
}
