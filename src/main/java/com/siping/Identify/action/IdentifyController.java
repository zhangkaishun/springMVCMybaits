package com.siping.Identify.action;

import com.siping.Identify.bean.Identify;


    @Controller
    @RequestMapping("/identify")
    public class IdentifyController {
        @Autowired
        private IdentifyService identifyService;

        @RequestMapping("/get_identify")
        public ModelAndView getIdentify(HttpServletResponse response) {
            Identify identify = identifyService.getIdentifyByUserid(1);
            System.out.println(identify);
            return null;
        }
    }

