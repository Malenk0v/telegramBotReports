package Method;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

public class AnswerKeybordRepost {
    public static void answer(Update update, InlineKeyboardMarkup inlineKeyboardMarkup, String login){
        String ans = update.getCallbackQuery().getData();
        if(ans.equals("/365")){

            String LOG = "LOG";
            String DATA = "DATA";
            String byMonts365Year = "https://direct.yandex.ru/registered/main.pl?show_stat=1&cmd=showStat&stat_periods=&ulogin="+LOG+"&stat_type=mol&group_by_date=none&page_size=100&"+DATA+"&goals=0&attribution_model=last_yandex_direct_click&columns=shows%2Cclicks%2Cctr%2Csum%2Cav_sum%2Cavg_cpm%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalincome%2Cagoals_profit&group_by=campaign&columns_positions=shows%2Ceshows%2Cclicks%2Cctr%2Cectr%2Csum%2Cav_sum%2Cavg_bid%2Cfp_shows_avg_pos%2Cavg_x%2Cfp_clicks_avg_pos%2Cwinrate%2Cbounce_ratio%2Cavg_cpm%2Cuniq_viewers%2Cavg_view_freq%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalcrr%2Cagoalincome%2Cagoals_profit%2Caprgoodmultigoal%2Caprgoodmultigoal_cpa%2Caprgoodmultigoal_conv_rate%2Cavg_time_to_conv%2Cvideo_first_quartile%2Cvideo_midpoint%2Cvideo_third_quartile%2Cvideo_complete%2Cvideo_first_quartile_rate%2Cvideo_midpoint_rate%2Cvideo_third_quartile_rate%2Cvideo_complete_rate%2Ccpcv%2Cviewable_impressions_mrc%2Cnonviewable_impressions_mrc%2Cundetermined_impressions_mrc%2Cmeasured_rate_mrc%2Cviewable_rate_mrc&group_by_positions=campaign_type%2Ccampaign%2Ctags%2Cadgroup%2Cbanner%2Cbanner_type%2Ccontextcond_orig%2Ccontexttype_orig%2Cmatch_type%2Cretargeting_coef%2Ctargettype%2Cpage_group%2Cturbo_page_type%2Cssp%2Cregion%2Cphysical_region%2Cposition%2Cclick_place%2Cbanner_image_type%2Cimage_size%2Cdevice_type%2Cdetailed_device_type%2Cconnection_type%2Cgender%2Ctargeting_category%2Cprisma_income_grade%2Cage%2Cinventory_type%2Ccontent_targeting&report_id=ed1861de8e6511ec920e294eed75b397";
            String urls = byMonts365Year;
            CreateKeybordRepost.answerRepost(inlineKeyboardMarkup,login, urls);
        }
        else if(ans.equals("/comp")){

            String LOG = "LOG";
            String DATA = "DATA";
            String byCompany = "https://direct.yandex.ru/registered/main.pl?show_stat=1&cmd=showStat&stat_periods=&ulogin="+LOG+"&stat_type=mol&group_by_date=none&page_size=100&"+DATA+"&goals=0&attribution_model=last_yandex_direct_click&columns=shows%2Cclicks%2Cctr%2Csum%2Cav_sum%2Cavg_bid%2Cfp_shows_avg_pos%2Cavg_x%2Cfp_clicks_avg_pos%2Cbounce_ratio%2Cuniq_viewers%2Cagoalcost%2Cagoalnum&group_by=targettype&columns_positions=shows%2Ceshows%2Cclicks%2Cctr%2Cectr%2Csum%2Cav_sum%2Cavg_bid%2Cfp_shows_avg_pos%2Cavg_x%2Cfp_clicks_avg_pos%2Cwinrate%2Cbounce_ratio%2Cavg_cpm%2Cuniq_viewers%2Cavg_view_freq%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalcrr%2Cagoalincome%2Cagoals_profit%2Caprgoodmultigoal%2Caprgoodmultigoal_cpa%2Caprgoodmultigoal_conv_rate%2Cavg_time_to_conv%2Cvideo_first_quartile%2Cvideo_midpoint%2Cvideo_third_quartile%2Cvideo_complete%2Cvideo_first_quartile_rate%2Cvideo_midpoint_rate%2Cvideo_third_quartile_rate%2Cvideo_complete_rate%2Ccpcv%2Cviewable_impressions_mrc%2Cnonviewable_impressions_mrc%2Cundetermined_impressions_mrc%2Cmeasured_rate_mrc%2Cviewable_rate_mrc&group_by_positions=campaign_type%2Ccampaign%2Ctags%2Cadgroup%2Cbanner%2Cbanner_type%2Ccontextcond_orig%2Ccontexttype_orig%2Cmatch_type%2Cretargeting_coef%2Ctargettype%2Cpage_group%2Cturbo_page_type%2Cssp%2Cregion%2Cphysical_region%2Cposition%2Cclick_place%2Cbanner_image_type%2Cimage_size%2Cdevice_type%2Cdetailed_device_type%2Cconnection_type%2Cgender%2Ctargeting_category%2Cprisma_income_grade%2Cage%2Cinventory_type%2Ccontent_targeting&report_id=4e1741da88cb11eca37098208821f0b8";
            String urls = byCompany;
            CreateKeybordRepost.answerRepost(inlineKeyboardMarkup,login, urls);
        }
        else if(ans.equals("/form")){

            String LOG = "LOG";
            String DATA = "DATA";
            String Form = "https://direct.yandex.ru/registered/main.pl?show_stat=1&cmd=showStat&stat_periods=&ulogin="+LOG+"&stat_type=mol&group_by_date=none&page_size=100&"+DATA+"&goals=0&attribution_model=last_yandex_direct_click&columns=shows%2Cclicks%2Cctr%2Csum%2Cav_sum%2Cavg_bid%2Cfp_shows_avg_pos%2Cavg_x%2Cfp_clicks_avg_pos%2Cbounce_ratio%2Cavg_cpm%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalincome%2Cagoals_profit&group_by=banner_image_type&columns_positions=shows%2Ceshows%2Cclicks%2Cctr%2Cectr%2Csum%2Cav_sum%2Cavg_bid%2Cfp_shows_avg_pos%2Cavg_x%2Cfp_clicks_avg_pos%2Cwinrate%2Cbounce_ratio%2Cavg_cpm%2Cuniq_viewers%2Cavg_view_freq%2Cadepth%2Caconv%2Cagoalcost%2Cagoalnum%2Cagoalroi%2Cagoalcrr%2Cagoalincome%2Cagoals_profit%2Caprgoodmultigoal%2Caprgoodmultigoal_cpa%2Caprgoodmultigoal_conv_rate%2Cavg_time_to_conv%2Cvideo_first_quartile%2Cvideo_midpoint%2Cvideo_third_quartile%2Cvideo_complete%2Cvideo_first_quartile_rate%2Cvideo_midpoint_rate%2Cvideo_third_quartile_rate%2Cvideo_complete_rate%2Ccpcv%2Cviewable_impressions_mrc%2Cnonviewable_impressions_mrc%2Cundetermined_impressions_mrc%2Cmeasured_rate_mrc%2Cviewable_rate_mrc&group_by_positions=campaign_type%2Ccampaign%2Ctags%2Cadgroup%2Cbanner%2Cbanner_type%2Ccontextcond_orig%2Ccontexttype_orig%2Cmatch_type%2Cretargeting_coef%2Ctargettype%2Cpage_group%2Cturbo_page_type%2Cssp%2Cregion%2Cphysical_region%2Cposition%2Cclick_place%2Cbanner_image_type%2Cimage_size%2Cdevice_type%2Cdetailed_device_type%2Cconnection_type%2Cgender%2Ctargeting_category%2Cprisma_income_grade%2Cage%2Cinventory_type%2Ccontent_targeting&report_id=ed1861de8e6511ec920e294eed75b397";
            String urls = Form;
            CreateKeybordRepost.answerRepost(inlineKeyboardMarkup,login, urls);
        }
    }
}