package Method;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

public class AnswerKeybordRepost {
    public static String nameRepost = "name";

    public static String getNameRepost() {
        return nameRepost;
    }

    public static void answer(Update update, InlineKeyboardMarkup inlineKeyboardMarkup, String login){
        String ans = update.getCallbackQuery().getData();
        if(ans.equals("/365")){
            nameRepost = "365 by months";
            String LOG = "LOG";
            String DATA = "DATA";
            String byMonts365Year = "https://direct.yandex.ru/registered/main.pl?show_stat=1&cmd=showStat&stat_periods=2021-02-08%3A2022-02-08%2C2020-01-01%3A2022-02-28%2C2021-10-01%3A2022-02-28&ulogin="+login+"&stat_type=mol&group_by_date=month&page_size=100&"+DATA+"&goals=0&attribution_model=last_yandex_direct_click&columns=shows%2Cclicks%2Cctr%2Csum%2Cav_sum%2Cavg_cpm%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalincome%2Cagoals_profit&group_by=&columns_positions=shows%2Ceshows%2Cclicks%2Cctr%2Cectr%2Csum%2Cav_sum%2Cavg_bid%2Cfp_shows_avg_pos%2Cavg_x%2Cfp_clicks_avg_pos%2Cwinrate%2Cbounce_ratio%2Cavg_cpm%2Cuniq_viewers%2Cavg_view_freq%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalcrr%2Cagoalincome%2Cagoals_profit%2Caprgoodmultigoal%2Caprgoodmultigoal_cpa%2Caprgoodmultigoal_conv_rate%2Cavg_time_to_conv%2Cvideo_first_quartile%2Cvideo_midpoint%2Cvideo_third_quartile%2Cvideo_complete%2Cvideo_first_quartile_rate%2Cvideo_midpoint_rate%2Cvideo_third_quartile_rate%2Cvideo_complete_rate%2Ccpcv%2Cviewable_impressions_mrc%2Cnonviewable_impressions_mrc%2Cundetermined_impressions_mrc%2Cmeasured_rate_mrc%2Cviewable_rate_mrc&group_by_positions=campaign_type%2Ccampaign%2Ctags%2Cadgroup%2Cbanner%2Cbanner_type%2Ccontextcond_orig%2Ccontexttype_orig%2Cmatch_type%2Cretargeting_coef%2Ctargettype%2Cpage_group%2Cturbo_page_type%2Cssp%2Cregion%2Cphysical_region%2Cposition%2Cclick_place%2Cbanner_image_type%2Cimage_size%2Cdevice_type%2Cdetailed_device_type%2Cconnection_type%2Cgender%2Ctargeting_category%2Cprisma_income_grade%2Cage%2Cinventory_type%2Ccontent_targeting&report_id=4e1741da88cb11eca37098208821f0b8";
            String urls = byMonts365Year;

            CreateKeybordRepost.answerRepost365(inlineKeyboardMarkup,login, urls);
        }
        else if(ans.equals("/plosh")){
            nameRepost = "По типу площадки";
            String LOG = "LOG";
            String DATA = "DATA";
            String byCompany = "https://direct.yandex.ru/registered/main.pl?show_stat=1&cmd=showStat&stat_periods=&ulogin="+LOG+"&stat_type=mol&group_by_date=none&page_size=100&"+DATA+"&goals=0&attribution_model=last_yandex_direct_click&columns=shows%2Cclicks%2Cctr%2Csum%2Cav_sum%2Cavg_bid%2Cfp_shows_avg_pos%2Cavg_x%2Cfp_clicks_avg_pos%2Cbounce_ratio%2Cuniq_viewers%2Cagoalcost%2Cagoalnum&group_by=targettype&columns_positions=shows%2Ceshows%2Cclicks%2Cctr%2Cectr%2Csum%2Cav_sum%2Cavg_bid%2Cfp_shows_avg_pos%2Cavg_x%2Cfp_clicks_avg_pos%2Cwinrate%2Cbounce_ratio%2Cavg_cpm%2Cuniq_viewers%2Cavg_view_freq%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalcrr%2Cagoalincome%2Cagoals_profit%2Caprgoodmultigoal%2Caprgoodmultigoal_cpa%2Caprgoodmultigoal_conv_rate%2Cavg_time_to_conv%2Cvideo_first_quartile%2Cvideo_midpoint%2Cvideo_third_quartile%2Cvideo_complete%2Cvideo_first_quartile_rate%2Cvideo_midpoint_rate%2Cvideo_third_quartile_rate%2Cvideo_complete_rate%2Ccpcv%2Cviewable_impressions_mrc%2Cnonviewable_impressions_mrc%2Cundetermined_impressions_mrc%2Cmeasured_rate_mrc%2Cviewable_rate_mrc&group_by_positions=campaign_type%2Ccampaign%2Ctags%2Cadgroup%2Cbanner%2Cbanner_type%2Ccontextcond_orig%2Ccontexttype_orig%2Cmatch_type%2Cretargeting_coef%2Ctargettype%2Cpage_group%2Cturbo_page_type%2Cssp%2Cregion%2Cphysical_region%2Cposition%2Cclick_place%2Cbanner_image_type%2Cimage_size%2Cdevice_type%2Cdetailed_device_type%2Cconnection_type%2Cgender%2Ctargeting_category%2Cprisma_income_grade%2Cage%2Cinventory_type%2Ccontent_targeting&report_id=4e1741da88cb11eca37098208821f0b8";
            String urls = byCompany;
            CreateKeybordRepost.answerRepost(inlineKeyboardMarkup,login, urls);
        }
        else if(ans.equals("/form")){
            nameRepost = "Форматы";
            String LOG = "LOG";
            String DATA = "DATA";
            String Form = "https://direct.yandex.ru/registered/main.pl?show_stat=1&cmd=showStat&stat_periods=&ulogin="+LOG+"&stat_type=mol&group_by_date=none&page_size=100&"+DATA+"&goals=0&attribution_model=last_yandex_direct_click&columns=shows%2Cclicks%2Cctr%2Csum%2Cav_sum%2Cavg_bid%2Cfp_shows_avg_pos%2Cavg_x%2Cfp_clicks_avg_pos%2Cbounce_ratio%2Cavg_cpm%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalincome%2Cagoals_profit&group_by=banner_image_type&columns_positions=shows%2Ceshows%2Cclicks%2Cctr%2Cectr%2Csum%2Cav_sum%2Cavg_bid%2Cfp_shows_avg_pos%2Cavg_x%2Cfp_clicks_avg_pos%2Cwinrate%2Cbounce_ratio%2Cavg_cpm%2Cuniq_viewers%2Cavg_view_freq%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalcrr%2Cagoalincome%2Cagoals_profit%2Caprgoodmultigoal%2Caprgoodmultigoal_cpa%2Caprgoodmultigoal_conv_rate%2Cavg_time_to_conv%2Cvideo_first_quartile%2Cvideo_midpoint%2Cvideo_third_quartile%2Cvideo_complete%2Cvideo_first_quartile_rate%2Cvideo_midpoint_rate%2Cvideo_third_quartile_rate%2Cvideo_complete_rate%2Ccpcv%2Cviewable_impressions_mrc%2Cnonviewable_impressions_mrc%2Cundetermined_impressions_mrc%2Cmeasured_rate_mrc%2Cviewable_rate_mrc&group_by_positions=campaign_type%2Ccampaign%2Ctags%2Cadgroup%2Cbanner%2Cbanner_type%2Ccontextcond_orig%2Ccontexttype_orig%2Cmatch_type%2Cretargeting_coef%2Ctargettype%2Cpage_group%2Cturbo_page_type%2Cssp%2Cregion%2Cphysical_region%2Cposition%2Cclick_place%2Cbanner_image_type%2Cimage_size%2Cdevice_type%2Cdetailed_device_type%2Cconnection_type%2Cgender%2Ctargeting_category%2Cprisma_income_grade%2Cage%2Cinventory_type%2Ccontent_targeting&report_id=ed1861de8e6511ec920e294eed75b397";
            String urls = Form;
            CreateKeybordRepost.answerRepost(inlineKeyboardMarkup,login, urls);
        }
        else if(ans.equals("/Comp")){
            nameRepost = "По кампаниям";
            String LOG = "LOG";
            String DATA = "DATA";
            String comp = "https://direct.yandex.ru/registered/main.pl?show_stat=1&cmd=showStat&stat_periods=&ulogin="+LOG+"&stat_type=mol&sort=shows&reverse=1&group_by_date=none&page_size=100&"+DATA+"&goals=0&attribution_model=last_yandex_direct_click&columns=shows%2Cclicks%2Cctr%2Csum%2Cav_sum%2Cavg_cpm%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalincome%2Cagoals_profit&group_by=campaign&columns_positions=shows%2Ceshows%2Cclicks%2Cctr%2Cectr%2Csum%2Cav_sum%2Cavg_bid%2Cfp_shows_avg_pos%2Cavg_x%2Cfp_clicks_avg_pos%2Cwinrate%2Cbounce_ratio%2Cavg_cpm%2Cuniq_viewers%2Cavg_view_freq%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalcrr%2Cagoalincome%2Cagoals_profit%2Caprgoodmultigoal%2Caprgoodmultigoal_cpa%2Caprgoodmultigoal_conv_rate%2Cavg_time_to_conv%2Cvideo_first_quartile%2Cvideo_midpoint%2Cvideo_third_quartile%2Cvideo_complete%2Cvideo_first_quartile_rate%2Cvideo_midpoint_rate%2Cvideo_third_quartile_rate%2Cvideo_complete_rate%2Ccpcv%2Cviewable_impressions_mrc%2Cnonviewable_impressions_mrc%2Cundetermined_impressions_mrc%2Cmeasured_rate_mrc%2Cviewable_rate_mrc&group_by_positions=campaign_type%2Ccampaign%2Ctags%2Cadgroup%2Cbanner%2Cbanner_type%2Ccontextcond_orig%2Ccontexttype_orig%2Cmatch_type%2Cretargeting_coef%2Ctargettype%2Cpage_group%2Cturbo_page_type%2Cssp%2Cregion%2Cphysical_region%2Cposition%2Cclick_place%2Cbanner_image_type%2Cimage_size%2Cdevice_type%2Cdetailed_device_type%2Cconnection_type%2Cgender%2Ctargeting_category%2Cprisma_income_grade%2Cage%2Cinventory_type%2Ccontent_targeting&report_id=4e1741da88cb11eca37098208821f0b8";
            String urls = comp;
            CreateKeybordRepost.answerRepost(inlineKeyboardMarkup,login, urls);
        }
        else if(ans.equals("/AB")){
            nameRepost = "А/B сравнение периодов";
            String LOG = "LOG";
            String ADATA = "ADATA";
            String BDATA = "BDATA";
            String AB = "https://direct.yandex.ru/registered/main.pl?show_stat=1&cmd=showStat&stat_periods=&ulogin="+LOG+"&stat_type=mol&group_by_date=none&page_size=100&"+ADATA+"&goals=0&attribution_model=last_yandex_direct_click&compare_periods=1&"+BDATA+"&columns=shows%2Cclicks%2Cctr%2Csum%2Cav_sum%2Cavg_cpm%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalincome%2Cagoals_profit&group_by=&columns_positions=shows%2Ceshows%2Cclicks%2Cctr%2Cectr%2Csum%2Cav_sum%2Cavg_bid%2Cfp_shows_avg_pos%2Cavg_x%2Cfp_clicks_avg_pos%2Cwinrate%2Cbounce_ratio%2Cavg_cpm%2Cuniq_viewers%2Cavg_view_freq%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalcrr%2Cagoalincome%2Cagoals_profit%2Caprgoodmultigoal%2Caprgoodmultigoal_cpa%2Caprgoodmultigoal_conv_rate%2Cavg_time_to_conv%2Cvideo_first_quartile%2Cvideo_midpoint%2Cvideo_third_quartile%2Cvideo_complete%2Cvideo_first_quartile_rate%2Cvideo_midpoint_rate%2Cvideo_third_quartile_rate%2Cvideo_complete_rate%2Ccpcv%2Cviewable_impressions_mrc%2Cnonviewable_impressions_mrc%2Cundetermined_impressions_mrc%2Cmeasured_rate_mrc%2Cviewable_rate_mrc&group_by_positions=campaign_type%2Ccampaign%2Ctags%2Cadgroup%2Cbanner%2Cbanner_type%2Ccontextcond_orig%2Ccontexttype_orig%2Cmatch_type%2Cretargeting_coef%2Ctargettype%2Cpage_group%2Cturbo_page_type%2Cssp%2Cregion%2Cphysical_region%2Cposition%2Cclick_place%2Cbanner_image_type%2Cimage_size%2Cdevice_type%2Cdetailed_device_type%2Cconnection_type%2Cgender%2Ctargeting_category%2Cprisma_income_grade%2Cage%2Cinventory_type%2Ccontent_targeting&report_id=4e1741da88cb11eca37098208821f0b8";
            String urls = AB;
            CreateKeybordRepost.answerRepostAB(inlineKeyboardMarkup,login, urls);
        }
        else if(ans.equals("/Uslov")){
            nameRepost = "По условию показа";
            String LOG = "LOG";
            String DATA = "DATA";
            String uslov= "https://direct.yandex.ru/registered/main.pl?show_stat=1&cmd=showStat&stat_periods=&ulogin="+LOG+"=mol&sort=shows&reverse=1&group_by_date=none&page_size=100&"+DATA+"&goals=0&attribution_model=last_yandex_direct_click&columns=shows%2Cclicks%2Cctr%2Csum%2Cav_sum%2Cavg_cpm%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalincome%2Cagoals_profit&group_by=contextcond_orig%2Ccontexttype_orig%2Cmatch_type&columns_positions=shows%2Ceshows%2Cclicks%2Cctr%2Cectr%2Csum%2Cav_sum%2Cavg_bid%2Cfp_shows_avg_pos%2Cavg_x%2Cfp_clicks_avg_pos%2Cwinrate%2Cbounce_ratio%2Cavg_cpm%2Cuniq_viewers%2Cavg_view_freq%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalcrr%2Cagoalincome%2Cagoals_profit%2Caprgoodmultigoal%2Caprgoodmultigoal_cpa%2Caprgoodmultigoal_conv_rate%2Cavg_time_to_conv%2Cvideo_first_quartile%2Cvideo_midpoint%2Cvideo_third_quartile%2Cvideo_complete%2Cvideo_first_quartile_rate%2Cvideo_midpoint_rate%2Cvideo_third_quartile_rate%2Cvideo_complete_rate%2Ccpcv%2Cviewable_impressions_mrc%2Cnonviewable_impressions_mrc%2Cundetermined_impressions_mrc%2Cmeasured_rate_mrc%2Cviewable_rate_mrc&group_by_positions=campaign_type%2Ccampaign%2Ctags%2Cadgroup%2Cbanner%2Cbanner_type%2Ccontextcond_orig%2Ccontexttype_orig%2Cmatch_type%2Cretargeting_coef%2Ctargettype%2Cpage_group%2Cturbo_page_type%2Cssp%2Cregion%2Cphysical_region%2Cposition%2Cclick_place%2Cbanner_image_type%2Cimage_size%2Cdevice_type%2Cdetailed_device_type%2Cconnection_type%2Cgender%2Ctargeting_category%2Cprisma_income_grade%2Cage%2Cinventory_type%2Ccontent_targeting&report_id=4e1741da88cb11eca37098208821f0b8";
            String urls = uslov;
            CreateKeybordRepost.answerRepost(inlineKeyboardMarkup,login, urls);
        }
        else if(ans.equals("/TUslov")){
            nameRepost = "По типу условию показа";
            String LOG = "LOG";
            String DATA = "DATA";
            String tuslov= "https://direct.yandex.ru/registered/main.pl?show_stat=1&cmd=showStat&stat_periods=&ulogin="+LOG+"&sort=shows&reverse=1&stat_type=mol&group_by_date=none&page_size=100&"+DATA+"&goals=0&attribution_model=last_yandex_direct_click&columns=shows%2Cclicks%2Cctr%2Csum%2Cav_sum%2Cavg_cpm%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalincome%2Cagoals_profit&group_by=contexttype_orig%2Cmatch_type&columns_positions=shows%2Ceshows%2Cclicks%2Cctr%2Cectr%2Csum%2Cav_sum%2Cavg_bid%2Cfp_shows_avg_pos%2Cavg_x%2Cfp_clicks_avg_pos%2Cwinrate%2Cbounce_ratio%2Cavg_cpm%2Cuniq_viewers%2Cavg_view_freq%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalcrr%2Cagoalincome%2Cagoals_profit%2Caprgoodmultigoal%2Caprgoodmultigoal_cpa%2Caprgoodmultigoal_conv_rate%2Cavg_time_to_conv%2Cvideo_first_quartile%2Cvideo_midpoint%2Cvideo_third_quartile%2Cvideo_complete%2Cvideo_first_quartile_rate%2Cvideo_midpoint_rate%2Cvideo_third_quartile_rate%2Cvideo_complete_rate%2Ccpcv%2Cviewable_impressions_mrc%2Cnonviewable_impressions_mrc%2Cundetermined_impressions_mrc%2Cmeasured_rate_mrc%2Cviewable_rate_mrc&group_by_positions=campaign_type%2Ccampaign%2Ctags%2Cadgroup%2Cbanner%2Cbanner_type%2Ccontextcond_orig%2Ccontexttype_orig%2Cmatch_type%2Cretargeting_coef%2Ctargettype%2Cpage_group%2Cturbo_page_type%2Cssp%2Cregion%2Cphysical_region%2Cposition%2Cclick_place%2Cbanner_image_type%2Cimage_size%2Cdevice_type%2Cdetailed_device_type%2Cconnection_type%2Cgender%2Ctargeting_category%2Cprisma_income_grade%2Cage%2Cinventory_type%2Ccontent_targeting&report_id=4e1741da88cb11eca37098208821f0b8";
            String urls = tuslov;
            CreateKeybordRepost.answerRepost(inlineKeyboardMarkup,login, urls);
        }
        else if(ans.equals("/NamePlosh")){
            nameRepost = "По названию площадок";
            String LOG = "LOG";
            String DATA = "DATA";
            String NamePlosh= "https://direct.yandex.ru/registered/main.pl?show_stat=1&cmd=showStat&stat_periods=&ulogin="+LOG+"&sort=shows&reverse=1&stat_type=mol&group_by_date=none&page_size=100&"+DATA+"&goals=0&attribution_model=last_yandex_direct_click&columns=shows%2Cclicks%2Cctr%2Csum%2Cav_sum%2Cavg_cpm%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalincome%2Cagoals_profit&group_by=targettype%2Cpage_group&columns_positions=shows%2Ceshows%2Cclicks%2Cctr%2Cectr%2Csum%2Cav_sum%2Cavg_bid%2Cfp_shows_avg_pos%2Cavg_x%2Cfp_clicks_avg_pos%2Cwinrate%2Cbounce_ratio%2Cavg_cpm%2Cuniq_viewers%2Cavg_view_freq%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalcrr%2Cagoalincome%2Cagoals_profit%2Caprgoodmultigoal%2Caprgoodmultigoal_cpa%2Caprgoodmultigoal_conv_rate%2Cavg_time_to_conv%2Cvideo_first_quartile%2Cvideo_midpoint%2Cvideo_third_quartile%2Cvideo_complete%2Cvideo_first_quartile_rate%2Cvideo_midpoint_rate%2Cvideo_third_quartile_rate%2Cvideo_complete_rate%2Ccpcv%2Cviewable_impressions_mrc%2Cnonviewable_impressions_mrc%2Cundetermined_impressions_mrc%2Cmeasured_rate_mrc%2Cviewable_rate_mrc&group_by_positions=campaign_type%2Ccampaign%2Ctags%2Cadgroup%2Cbanner%2Cbanner_type%2Ccontextcond_orig%2Ccontexttype_orig%2Cmatch_type%2Cretargeting_coef%2Ctargettype%2Cpage_group%2Cturbo_page_type%2Cssp%2Cregion%2Cphysical_region%2Cposition%2Cclick_place%2Cbanner_image_type%2Cimage_size%2Cdevice_type%2Cdetailed_device_type%2Cconnection_type%2Cgender%2Ctargeting_category%2Cprisma_income_grade%2Cage%2Cinventory_type%2Ccontent_targeting&report_id=4e1741da88cb11eca37098208821f0b8";
            String urls = NamePlosh;
            CreateKeybordRepost.answerRepost(inlineKeyboardMarkup,login, urls);
        }
        else if(ans.equals("/regtarget")){
            nameRepost = "По региону таргетинг";
            String LOG = "LOG";
            String DATA = "DATA";
            String regtarget= "https://direct.yandex.ru/registered/main.pl?show_stat=1&cmd=showStat&stat_periods=&ulogin="+LOG+"&sort=shows&reverse=1&stat_type=mol&group_by_date=none&page_size=100&"+DATA+"&goals=0&attribution_model=last_yandex_direct_click&columns=shows%2Cclicks%2Cctr%2Csum%2Cav_sum%2Cavg_cpm%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalincome%2Cagoals_profit&group_by=region&columns_positions=shows%2Ceshows%2Cclicks%2Cctr%2Cectr%2Csum%2Cav_sum%2Cavg_bid%2Cfp_shows_avg_pos%2Cavg_x%2Cfp_clicks_avg_pos%2Cwinrate%2Cbounce_ratio%2Cavg_cpm%2Cuniq_viewers%2Cavg_view_freq%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalcrr%2Cagoalincome%2Cagoals_profit%2Caprgoodmultigoal%2Caprgoodmultigoal_cpa%2Caprgoodmultigoal_conv_rate%2Cavg_time_to_conv%2Cvideo_first_quartile%2Cvideo_midpoint%2Cvideo_third_quartile%2Cvideo_complete%2Cvideo_first_quartile_rate%2Cvideo_midpoint_rate%2Cvideo_third_quartile_rate%2Cvideo_complete_rate%2Ccpcv%2Cviewable_impressions_mrc%2Cnonviewable_impressions_mrc%2Cundetermined_impressions_mrc%2Cmeasured_rate_mrc%2Cviewable_rate_mrc&group_by_positions=campaign_type%2Ccampaign%2Ctags%2Cadgroup%2Cbanner%2Cbanner_type%2Ccontextcond_orig%2Ccontexttype_orig%2Cmatch_type%2Cretargeting_coef%2Ctargettype%2Cpage_group%2Cturbo_page_type%2Cssp%2Cregion%2Cphysical_region%2Cposition%2Cclick_place%2Cbanner_image_type%2Cimage_size%2Cdevice_type%2Cdetailed_device_type%2Cconnection_type%2Cgender%2Ctargeting_category%2Cprisma_income_grade%2Cage%2Cinventory_type%2Ccontent_targeting&report_id=4e1741da88cb11eca37098208821f0b8";
            String urls = regtarget;
            CreateKeybordRepost.answerRepost(inlineKeyboardMarkup,login, urls);
        }
        else if(ans.equals("/dem")){
            nameRepost = "По региону таргетинг";
            String LOG = "LOG";
            String DATA = "DATA";
            String dem= "https://direct.yandex.ru/registered/main.pl?show_stat=1&cmd=showStat&stat_periods=&ulogin="+LOG+"&sort=shows&reverse=1&stat_type=mol&group_by_date=none&page_size=100&"+DATA+"&goals=0&attribution_model=last_yandex_direct_click&columns=shows%2Cclicks%2Cctr%2Csum%2Cav_sum%2Cavg_cpm%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalincome%2Cagoals_profit&group_by=gender%2Cprisma_income_grade%2Cage&columns_positions=shows%2Ceshows%2Cclicks%2Cctr%2Cectr%2Csum%2Cav_sum%2Cavg_bid%2Cfp_shows_avg_pos%2Cavg_x%2Cfp_clicks_avg_pos%2Cwinrate%2Cbounce_ratio%2Cavg_cpm%2Cuniq_viewers%2Cavg_view_freq%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalcrr%2Cagoalincome%2Cagoals_profit%2Caprgoodmultigoal%2Caprgoodmultigoal_cpa%2Caprgoodmultigoal_conv_rate%2Cavg_time_to_conv%2Cvideo_first_quartile%2Cvideo_midpoint%2Cvideo_third_quartile%2Cvideo_complete%2Cvideo_first_quartile_rate%2Cvideo_midpoint_rate%2Cvideo_third_quartile_rate%2Cvideo_complete_rate%2Ccpcv%2Cviewable_impressions_mrc%2Cnonviewable_impressions_mrc%2Cundetermined_impressions_mrc%2Cmeasured_rate_mrc%2Cviewable_rate_mrc&group_by_positions=campaign_type%2Ccampaign%2Ctags%2Cadgroup%2Cbanner%2Cbanner_type%2Ccontextcond_orig%2Ccontexttype_orig%2Cmatch_type%2Cretargeting_coef%2Ctargettype%2Cpage_group%2Cturbo_page_type%2Cssp%2Cregion%2Cphysical_region%2Cposition%2Cclick_place%2Cbanner_image_type%2Cimage_size%2Cdevice_type%2Cdetailed_device_type%2Cconnection_type%2Cgender%2Ctargeting_category%2Cprisma_income_grade%2Cage%2Cinventory_type%2Ccontent_targeting&report_id=4e1741da88cb11eca37098208821f0b8";
            String urls = dem;
            CreateKeybordRepost.answerRepost(inlineKeyboardMarkup,login, urls);
        }
    }
}
