/**
 *
 * Copyright (c) 2006-2016, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.tool.resource;

import com.speedment.runtime.annotation.Api;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.InputStream;

import static java.util.Objects.requireNonNull;

/**
 * An enumeration of all the icons available in the Silk Icon package.
 *
 * @author  Emil Forslund
 * @since   2.2.0
 */
@Api(version="3.0")
public enum SilkIcon {
//	ACCEPT ("accept.png"),
//	ADD ("add.png"),
//	ANCHOR ("anchor.png"),
//	APPLICATION ("application.png"),
//	APPLICATION_ADD ("application_add.png"),
//	APPLICATION_CASCADE ("application_cascade.png"),
//	APPLICATION_DELETE ("application_delete.png"),
//	APPLICATION_DOUBLE ("application_double.png"),
//	APPLICATION_EDIT ("application_edit.png"),
//	APPLICATION_ERROR ("application_error.png"),
//	APPLICATION_FORM ("application_form.png"),
//	APPLICATION_FORM_ADD ("application_form_add.png"),
//	APPLICATION_FORM_DELETE ("application_form_delete.png"),
//	APPLICATION_FORM_EDIT ("application_form_edit.png"),
//	APPLICATION_FORM_MAGNIFY ("application_form_magnify.png"),
//	APPLICATION_GET ("application_get.png"),
//	APPLICATION_GO ("application_go.png"),
//	APPLICATION_HOME ("application_home.png"),
//	APPLICATION_KEY ("application_key.png"),
//	APPLICATION_LIGHTNING ("application_lightning.png"),
//	APPLICATION_LINK ("application_link.png"),
//	APPLICATION_OSX ("application_osx.png"),
//	APPLICATION_OSX_TERMINAL ("application_osx_terminal.png"),
//	APPLICATION_PUT ("application_put.png"),
//	APPLICATION_SIDE_BOXES ("application_side_boxes.png"),
//	APPLICATION_SIDE_CONTRACT ("application_side_contract.png"),
//	APPLICATION_SIDE_EXPAND ("application_side_expand.png"),
//	APPLICATION_SIDE_LIST ("application_side_list.png"),
//	APPLICATION_SIDE_TREE ("application_side_tree.png"),
//	APPLICATION_SPLIT ("application_split.png"),
//	APPLICATION_TILE_HORIZONTAL ("application_tile_horizontal.png"),
//	APPLICATION_TILE_VERTICAL ("application_tile_vertical.png"),
//	APPLICATION_VIEW_COLUMNS ("application_view_columns.png"),
//	APPLICATION_VIEW_DETAIL ("application_view_detail.png"),
//	APPLICATION_VIEW_GALLERY ("application_view_gallery.png"),
//	APPLICATION_VIEW_ICONS ("application_view_icons.png"),
//	APPLICATION_VIEW_LIST ("application_view_list.png"),
//	APPLICATION_VIEW_TILE ("application_view_tile.png"),
//	APPLICATION_XP ("application_xp.png"),
//	APPLICATION_XP_TERMINAL ("application_xp_terminal.png"),
//	ARROW_BRANCH ("arrow_branch.png"),
//	ARROW_DIVIDE ("arrow_divide.png"),
//	ARROW_DOWN ("arrow_down.png"),
//	ARROW_IN ("arrow_in.png"),
//	ARROW_INOUT ("arrow_inout.png"),
//	ARROW_JOIN ("arrow_join.png"),
//	ARROW_LEFT ("arrow_left.png"),
//	ARROW_MERGE ("arrow_merge.png"),
//	ARROW_OUT ("arrow_out.png"),
//	ARROW_REDO ("arrow_redo.png"),
//	ARROW_REFRESH ("arrow_refresh.png"),
//	ARROW_REFRESH_SMALL ("arrow_refresh_small.png"),
//	ARROW_RIGHT ("arrow_right.png"),
//	ARROW_ROTATE_ANTICLOCKWISE ("arrow_rotate_anticlockwise.png"),
//	ARROW_ROTATE_CLOCKWISE ("arrow_rotate_clockwise.png"),
//	ARROW_SWITCH ("arrow_switch.png"),
//	ARROW_TURN_LEFT ("arrow_turn_left.png"),
//	ARROW_TURN_RIGHT ("arrow_turn_right.png"),
//	ARROW_UNDO ("arrow_undo.png"),
//	ARROW_UP ("arrow_up.png"),
//	ASTERISK_ORANGE ("asterisk_orange.png"),
//	ASTERISK_YELLOW ("asterisk_yellow.png"),
//	ATTACH ("attach.png"),
//	AWARD_STAR_ADD ("award_star_add.png"),
//	AWARD_STAR_BRONZE_1 ("award_star_bronze_1.png"),
//	AWARD_STAR_BRONZE_2 ("award_star_bronze_2.png"),
//	AWARD_STAR_BRONZE_3 ("award_star_bronze_3.png"),
//	AWARD_STAR_DELETE ("award_star_delete.png"),
//	AWARD_STAR_GOLD_1 ("award_star_gold_1.png"),
//	AWARD_STAR_GOLD_2 ("award_star_gold_2.png"),
//	AWARD_STAR_GOLD_3 ("award_star_gold_3.png"),
//	AWARD_STAR_SILVER_1 ("award_star_silver_1.png"),
//	AWARD_STAR_SILVER_2 ("award_star_silver_2.png"),
//	AWARD_STAR_SILVER_3 ("award_star_silver_3.png"),
//	BASKET ("basket.png"),
//	BASKET_ADD ("basket_add.png"),
//	BASKET_DELETE ("basket_delete.png"),
//	BASKET_EDIT ("basket_edit.png"),
//	BASKET_ERROR ("basket_error.png"),
//	BASKET_GO ("basket_go.png"),
//	BASKET_PUT ("basket_put.png"),
//	BASKET_REMOVE ("basket_remove.png"),
//	BELL ("bell.png"),
//	BELL_ADD ("bell_add.png"),
//	BELL_DELETE ("bell_delete.png"),
//	BELL_ERROR ("bell_error.png"),
//	BELL_GO ("bell_go.png"),
//	BELL_LINK ("bell_link.png"),
//	BIN ("bin.png"),
//	BIN_CLOSED ("bin_closed.png"),
//	BIN_EMPTY ("bin_empty.png"),
//	BOMB ("bomb.png"),
//	BOOK ("book.png"),
//	BOOK_ADD ("book_add.png"),
//	BOOK_ADDRESSES ("book_addresses.png"),
//	BOOK_DELETE ("book_delete.png"),
//	BOOK_EDIT ("book_edit.png"),
//	BOOK_ERROR ("book_error.png"),
//	BOOK_GO ("book_go.png"),
//	BOOK_KEY ("book_key.png"),
//	BOOK_LINK ("book_link.png"),
//	BOOK_NEXT ("book_next.png"),
//	BOOK_OPEN ("book_open.png"),
//	BOOK_PREVIOUS ("book_previous.png"),
//	BOX ("box.png"),
//	BRICK ("brick.png"),
//	BRICKS ("bricks.png"),
//	BRICK_ADD ("brick_add.png"),
//	BRICK_DELETE ("brick_delete.png"),
//	BRICK_EDIT ("brick_edit.png"),
//	BRICK_ERROR ("brick_error.png"),
//	BRICK_GO ("brick_go.png"),
//	BRICK_LINK ("brick_link.png"),
//	BRIEFCASE ("briefcase.png"),
//	BUG ("bug.png"),
//	BUG_ADD ("bug_add.png"),
//	BUG_DELETE ("bug_delete.png"),
//	BUG_EDIT ("bug_edit.png"),
//	BUG_ERROR ("bug_error.png"),
//	BUG_GO ("bug_go.png"),
//	BUG_LINK ("bug_link.png"),
//	BUILDING ("building.png"),
//	BUILDING_ADD ("building_add.png"),
//	BUILDING_DELETE ("building_delete.png"),
//	BUILDING_EDIT ("building_edit.png"),
//	BUILDING_ERROR ("building_error.png"),
//	BUILDING_GO ("building_go.png"),
//	BUILDING_KEY ("building_key.png"),
//	BUILDING_LINK ("building_link.png"),
//	BULLET_ADD ("bullet_add.png"),
//	BULLET_ARROW_BOTTOM ("bullet_arrow_bottom.png"),
//	BULLET_ARROW_DOWN ("bullet_arrow_down.png"),
//	BULLET_ARROW_TOP ("bullet_arrow_top.png"),
//	BULLET_ARROW_UP ("bullet_arrow_up.png"),
//	BULLET_BLACK ("bullet_black.png"),
//	BULLET_BLUE ("bullet_blue.png"),
//	BULLET_DELETE ("bullet_delete.png"),
//	BULLET_DISK ("bullet_disk.png"),
//	BULLET_ERROR ("bullet_error.png"),
//	BULLET_FEED ("bullet_feed.png"),
//	BULLET_GO ("bullet_go.png"),
//	BULLET_GREEN ("bullet_green.png"),
//	BULLET_KEY ("bullet_key.png"),
//	BULLET_ORANGE ("bullet_orange.png"),
//	BULLET_PICTURE ("bullet_picture.png"),
//	BULLET_PINK ("bullet_pink.png"),
//	BULLET_PURPLE ("bullet_purple.png"),
//	BULLET_RED ("bullet_red.png"),
//	BULLET_STAR ("bullet_star.png"),
//	BULLET_TOGGLE_MINUS ("bullet_toggle_minus.png"),
//	BULLET_TOGGLE_PLUS ("bullet_toggle_plus.png"),
//	BULLET_WHITE ("bullet_white.png"),
//	BULLET_WRENCH ("bullet_wrench.png"),
//	BULLET_YELLOW ("bullet_yellow.png"),
//	CAKE ("cake.png"),
//	CALCULATOR ("calculator.png"),
//	CALCULATOR_ADD ("calculator_add.png"),
//	CALCULATOR_DELETE ("calculator_delete.png"),
//	CALCULATOR_EDIT ("calculator_edit.png"),
//	CALCULATOR_ERROR ("calculator_error.png"),
//	CALCULATOR_LINK ("calculator_link.png"),
//	CALENDAR ("calendar.png"),
//	CALENDAR_ADD ("calendar_add.png"),
//	CALENDAR_DELETE ("calendar_delete.png"),
//	CALENDAR_EDIT ("calendar_edit.png"),
//	CALENDAR_LINK ("calendar_link.png"),
//	CALENDAR_VIEW_DAY ("calendar_view_day.png"),
//	CALENDAR_VIEW_MONTH ("calendar_view_month.png"),
//	CALENDAR_VIEW_WEEK ("calendar_view_week.png"),
//	CAMERA ("camera.png"),
//	CAMERA_ADD ("camera_add.png"),
//	CAMERA_DELETE ("camera_delete.png"),
//	CAMERA_EDIT ("camera_edit.png"),
//	CAMERA_ERROR ("camera_error.png"),
//	CAMERA_GO ("camera_go.png"),
//	CAMERA_LINK ("camera_link.png"),
//	CAMERA_SMALL ("camera_small.png"),
//	CANCEL ("cancel.png"),
//	CAR ("car.png"),
//	CART ("cart.png"),
//	CART_ADD ("cart_add.png"),
//	CART_DELETE ("cart_delete.png"),
//	CART_EDIT ("cart_edit.png"),
//	CART_ERROR ("cart_error.png"),
//	CART_GO ("cart_go.png"),
//	CART_PUT ("cart_put.png"),
//	CART_REMOVE ("cart_remove.png"),
//	CAR_ADD ("car_add.png"),
//	CAR_DELETE ("car_delete.png"),
//	CD ("cd.png"),
//	CD_ADD ("cd_add.png"),
//	CD_BURN ("cd_burn.png"),
//	CD_DELETE ("cd_delete.png"),
//	CD_EDIT ("cd_edit.png"),
//	CD_EJECT ("cd_eject.png"),
//	CD_GO ("cd_go.png"),
//	CHART_BAR ("chart_bar.png"),
//	CHART_BAR_ADD ("chart_bar_add.png"),
//	CHART_BAR_DELETE ("chart_bar_delete.png"),
//	CHART_BAR_EDIT ("chart_bar_edit.png"),
//	CHART_BAR_ERROR ("chart_bar_error.png"),
//	CHART_BAR_LINK ("chart_bar_link.png"),
//	CHART_CURVE ("chart_curve.png"),
//	CHART_CURVE_ADD ("chart_curve_add.png"),
//	CHART_CURVE_DELETE ("chart_curve_delete.png"),
//	CHART_CURVE_EDIT ("chart_curve_edit.png"),
//	CHART_CURVE_ERROR ("chart_curve_error.png"),
//	CHART_CURVE_GO ("chart_curve_go.png"),
//	CHART_CURVE_LINK ("chart_curve_link.png"),
//	CHART_LINE ("chart_line.png"),
//	CHART_LINE_ADD ("chart_line_add.png"),
//	CHART_LINE_DELETE ("chart_line_delete.png"),
//	CHART_LINE_EDIT ("chart_line_edit.png"),
//	CHART_LINE_ERROR ("chart_line_error.png"),
//	CHART_LINE_LINK ("chart_line_link.png"),
//	CHART_ORGANISATION ("chart_organisation.png"),
//	CHART_ORGANISATION_ADD ("chart_organisation_add.png"),
//	CHART_ORGANISATION_DELETE ("chart_organisation_delete.png"),
//	CHART_PIE ("chart_pie.png"),
//	CHART_PIE_ADD ("chart_pie_add.png"),
//	CHART_PIE_DELETE ("chart_pie_delete.png"),
//	CHART_PIE_EDIT ("chart_pie_edit.png"),
//	CHART_PIE_ERROR ("chart_pie_error.png"),
//	CHART_PIE_LINK ("chart_pie_link.png"),
//	CLOCK ("clock.png"),
//	CLOCK_ADD ("clock_add.png"),
//	CLOCK_DELETE ("clock_delete.png"),
//	CLOCK_EDIT ("clock_edit.png"),
//	CLOCK_ERROR ("clock_error.png"),
//	CLOCK_GO ("clock_go.png"),
//	CLOCK_LINK ("clock_link.png"),
//	CLOCK_PAUSE ("clock_pause.png"),
//	CLOCK_PLAY ("clock_play.png"),
//	CLOCK_RED ("clock_red.png"),
//	CLOCK_STOP ("clock_stop.png"),
//	COG ("cog.png"),
//	COG_ADD ("cog_add.png"),
//	COG_DELETE ("cog_delete.png"),
//	COG_EDIT ("cog_edit.png"),
//	COG_ERROR ("cog_error.png"),
//	COG_GO ("cog_go.png"),
//	COINS ("coins.png"),
//	COINS_ADD ("coins_add.png"),
//	COINS_DELETE ("coins_delete.png"),
//	COLOR_SWATCH ("color_swatch.png"),
//	COLOR_WHEEL ("color_wheel.png"),
//	COMMENT ("comment.png"),
//	COMMENTS ("comments.png"),
//	COMMENTS_ADD ("comments_add.png"),
//	COMMENTS_DELETE ("comments_delete.png"),
//	COMMENT_ADD ("comment_add.png"),
//	COMMENT_DELETE ("comment_delete.png"),
//	COMMENT_EDIT ("comment_edit.png"),
//	COMPRESS ("compress.png"),
//	COMPUTER ("computer.png"),
//	COMPUTER_ADD ("computer_add.png"),
//	COMPUTER_DELETE ("computer_delete.png"),
//	COMPUTER_EDIT ("computer_edit.png"),
//	COMPUTER_ERROR ("computer_error.png"),
//	COMPUTER_GO ("computer_go.png"),
//	COMPUTER_KEY ("computer_key.png"),
//	COMPUTER_LINK ("computer_link.png"),
//	CONNECT ("connect.png"),
//	CONTRAST ("contrast.png"),
//	CONTRAST_DECREASE ("contrast_decrease.png"),
//	CONTRAST_HIGH ("contrast_high.png"),
//	CONTRAST_INCREASE ("contrast_increase.png"),
//	CONTRAST_LOW ("contrast_low.png"),
//	CONTROLLER ("controller.png"),
//	CONTROLLER_ADD ("controller_add.png"),
//	CONTROLLER_DELETE ("controller_delete.png"),
//	CONTROLLER_ERROR ("controller_error.png"),
//	CONTROL_EJECT ("control_eject.png"),
//	CONTROL_EJECT_BLUE ("control_eject_blue.png"),
//	CONTROL_END ("control_end.png"),
//	CONTROL_END_BLUE ("control_end_blue.png"),
//	CONTROL_EQUALIZER ("control_equalizer.png"),
//	CONTROL_EQUALIZER_BLUE ("control_equalizer_blue.png"),
//	CONTROL_FASTFORWARD ("control_fastforward.png"),
//	CONTROL_FASTFORWARD_BLUE ("control_fastforward_blue.png"),
//	CONTROL_PAUSE ("control_pause.png"),
//	CONTROL_PAUSE_BLUE ("control_pause_blue.png"),
//	CONTROL_PLAY ("control_play.png"),
//	CONTROL_PLAY_BLUE ("control_play_blue.png"),
//	CONTROL_REPEAT ("control_repeat.png"),
//	CONTROL_REPEAT_BLUE ("control_repeat_blue.png"),
//	CONTROL_REWIND ("control_rewind.png"),
//	CONTROL_REWIND_BLUE ("control_rewind_blue.png"),
//	CONTROL_START ("control_start.png"),
//	CONTROL_START_BLUE ("control_start_blue.png"),
//	CONTROL_STOP ("control_stop.png"),
//	CONTROL_STOP_BLUE ("control_stop_blue.png"),
//	CREDITCARDS ("creditcards.png"),
//	CROSS ("cross.png"),
//	CSS ("css.png"),
//	CSS_ADD ("css_add.png"),
//	CSS_DELETE ("css_delete.png"),
//	CSS_GO ("css_go.png"),
//	CSS_VALID ("css_valid.png"),
//	CUP ("cup.png"),
//	CUP_ADD ("cup_add.png"),
//	CUP_DELETE ("cup_delete.png"),
//	CUP_EDIT ("cup_edit.png"),
//	CUP_ERROR ("cup_error.png"),
//	CUP_GO ("cup_go.png"),
//	CUP_KEY ("cup_key.png"),
//	CUP_LINK ("cup_link.png"),
//	CURSOR ("cursor.png"),
//	CUT ("cut.png"),
//	CUT_RED ("cut_red.png"),
//	DATABASE ("database.png"),
//	DATABASE_ADD ("database_add.png"),
//	DATABASE_CONNECT ("database_connect.png"),
//	DATABASE_DELETE ("database_delete.png"),
//	DATABASE_EDIT ("database_edit.png"),
//	DATABASE_ERROR ("database_error.png"),
//	DATABASE_GEAR ("database_gear.png"),
//	DATABASE_GO ("database_go.png"),
//	DATABASE_KEY ("database_key.png"),
//	DATABASE_LIGHTNING ("database_lightning.png"),
//	DATABASE_LINK ("database_link.png"),
//	DATABASE_REFRESH ("database_refresh.png"),
//	DATABASE_SAVE ("database_save.png"),
//	DATABASE_TABLE ("database_table.png"),
//	DATE ("date.png"),
//	DATE_ADD ("date_add.png"),
//	DATE_DELETE ("date_delete.png"),
//	DATE_EDIT ("date_edit.png"),
//	DATE_ERROR ("date_error.png"),
//	DATE_GO ("date_go.png"),
//	DATE_LINK ("date_link.png"),
//	DATE_MAGNIFY ("date_magnify.png"),
//	DATE_NEXT ("date_next.png"),
//	DATE_PREVIOUS ("date_previous.png"),
//	DELETE ("delete.png"),
//	DISCONNECT ("disconnect.png"),
//	DISK ("disk.png"),
//	DISK_MULTIPLE ("disk_multiple.png"),
//	DOOR ("door.png"),
//	DOOR_IN ("door_in.png"),
//	DOOR_OPEN ("door_open.png"),
//	DOOR_OUT ("door_out.png"),
//	DRINK ("drink.png"),
//	DRINK_EMPTY ("drink_empty.png"),
//	DRIVE ("drive.png"),
//	DRIVE_ADD ("drive_add.png"),
//	DRIVE_BURN ("drive_burn.png"),
//	DRIVE_CD ("drive_cd.png"),
//	DRIVE_CD_EMPTY ("drive_cd_empty.png"),
//	DRIVE_DELETE ("drive_delete.png"),
//	DRIVE_DISK ("drive_disk.png"),
//	DRIVE_EDIT ("drive_edit.png"),
//	DRIVE_ERROR ("drive_error.png"),
//	DRIVE_GO ("drive_go.png"),
//	DRIVE_KEY ("drive_key.png"),
//	DRIVE_LINK ("drive_link.png"),
//	DRIVE_MAGNIFY ("drive_magnify.png"),
//	DRIVE_NETWORK ("drive_network.png"),
//	DRIVE_RENAME ("drive_rename.png"),
//	DRIVE_USER ("drive_user.png"),
//	DRIVE_WEB ("drive_web.png"),
//	DVD ("dvd.png"),
//	DVD_ADD ("dvd_add.png"),
//	DVD_DELETE ("dvd_delete.png"),
//	DVD_EDIT ("dvd_edit.png"),
//	DVD_ERROR ("dvd_error.png"),
//	DVD_GO ("dvd_go.png"),
//	DVD_KEY ("dvd_key.png"),
//	DVD_LINK ("dvd_link.png"),
//	EMAIL ("email.png"),
//	EMAIL_ADD ("email_add.png"),
//	EMAIL_ATTACH ("email_attach.png"),
//	EMAIL_DELETE ("email_delete.png"),
//	EMAIL_EDIT ("email_edit.png"),
//	EMAIL_ERROR ("email_error.png"),
//	EMAIL_GO ("email_go.png"),
//	EMAIL_LINK ("email_link.png"),
//	EMAIL_OPEN ("email_open.png"),
//	EMAIL_OPEN_IMAGE ("email_open_image.png"),
//	EMOTICON_EVILGRIN ("emoticon_evilgrin.png"),
//	EMOTICON_GRIN ("emoticon_grin.png"),
//	EMOTICON_HAPPY ("emoticon_happy.png"),
//	EMOTICON_SMILE ("emoticon_smile.png"),
//	EMOTICON_SURPRISED ("emoticon_surprised.png"),
//	EMOTICON_TONGUE ("emoticon_tongue.png"),
//	EMOTICON_UNHAPPY ("emoticon_unhappy.png"),
//	EMOTICON_WAII ("emoticon_waii.png"),
//	EMOTICON_WINK ("emoticon_wink.png"),
//	ERROR ("error.png"),
//	ERROR_ADD ("error_add.png"),
//	ERROR_DELETE ("error_delete.png"),
//	ERROR_GO ("error_go.png"),
//	EXCLAMATION ("exclamation.png"),
//	EYE ("eye.png"),
//	FEED ("feed.png"),
//	FEED_ADD ("feed_add.png"),
//	FEED_DELETE ("feed_delete.png"),
//	FEED_DISK ("feed_disk.png"),
//	FEED_EDIT ("feed_edit.png"),
//	FEED_ERROR ("feed_error.png"),
//	FEED_GO ("feed_go.png"),
//	FEED_KEY ("feed_key.png"),
//	FEED_LINK ("feed_link.png"),
//	FEED_MAGNIFY ("feed_magnify.png"),
//	FEMALE ("female.png"),
//	FILM ("film.png"),
//	FILM_ADD ("film_add.png"),
//	FILM_DELETE ("film_delete.png"),
//	FILM_EDIT ("film_edit.png"),
//	FILM_ERROR ("film_error.png"),
//	FILM_GO ("film_go.png"),
//	FILM_KEY ("film_key.png"),
//	FILM_LINK ("film_link.png"),
//	FILM_SAVE ("film_save.png"),
//	FIND ("find.png"),
//	FLAG_BLUE ("flag_blue.png"),
//	FLAG_GREEN ("flag_green.png"),
//	FLAG_ORANGE ("flag_orange.png"),
//	FLAG_PINK ("flag_pink.png"),
//	FLAG_PURPLE ("flag_purple.png"),
//	FLAG_RED ("flag_red.png"),
//	FLAG_YELLOW ("flag_yellow.png"),
//	FOLDER ("folder.png"),
//	FOLDER_ADD ("folder_add.png"),
//	FOLDER_BELL ("folder_bell.png"),
//	FOLDER_BRICK ("folder_brick.png"),
//	FOLDER_BUG ("folder_bug.png"),
//	FOLDER_CAMERA ("folder_camera.png"),
//	FOLDER_DATABASE ("folder_database.png"),
//	FOLDER_DELETE ("folder_delete.png"),
//	FOLDER_EDIT ("folder_edit.png"),
//	FOLDER_ERROR ("folder_error.png"),
//	FOLDER_EXPLORE ("folder_explore.png"),
//	FOLDER_FEED ("folder_feed.png"),
//	FOLDER_FIND ("folder_find.png"),
//	FOLDER_GO ("folder_go.png"),
//	FOLDER_HEART ("folder_heart.png"),
//	FOLDER_IMAGE ("folder_image.png"),
//	FOLDER_KEY ("folder_key.png"),
//	FOLDER_LIGHTBULB ("folder_lightbulb.png"),
//	FOLDER_LINK ("folder_link.png"),
//	FOLDER_MAGNIFY ("folder_magnify.png"),
//	FOLDER_PAGE ("folder_page.png"),
//	FOLDER_PAGE_WHITE ("folder_page_white.png"),
//	FOLDER_PALETTE ("folder_palette.png"),
//	FOLDER_PICTURE ("folder_picture.png"),
//	FOLDER_STAR ("folder_star.png"),
//	FOLDER_TABLE ("folder_table.png"),
//	FOLDER_USER ("folder_user.png"),
//	FOLDER_WRENCH ("folder_wrench.png"),
//	FONT ("font.png"),
//	FONT_ADD ("font_add.png"),
//	FONT_DELETE ("font_delete.png"),
//	FONT_GO ("font_go.png"),
//	GROUP ("group.png"),
//	GROUP_ADD ("group_add.png"),
//	GROUP_DELETE ("group_delete.png"),
//	GROUP_EDIT ("group_edit.png"),
//	GROUP_ERROR ("group_error.png"),
//	GROUP_GEAR ("group_gear.png"),
//	GROUP_GO ("group_go.png"),
//	GROUP_KEY ("group_key.png"),
//	GROUP_LINK ("group_link.png"),
//	HEART ("heart.png"),
//	HEART_ADD ("heart_add.png"),
//	HEART_DELETE ("heart_delete.png"),
//	HELP ("help.png"),
//	HOURGLASS ("hourglass.png"),
//	HOURGLASS_ADD ("hourglass_add.png"),
//	HOURGLASS_DELETE ("hourglass_delete.png"),
//	HOURGLASS_GO ("hourglass_go.png"),
//	HOURGLASS_LINK ("hourglass_link.png"),
//	HOUSE ("house.png"),
//	HOUSE_GO ("house_go.png"),
//	HOUSE_LINK ("house_link.png"),
//	HTML ("html.png"),
//	HTML_ADD ("html_add.png"),
//	HTML_DELETE ("html_delete.png"),
//	HTML_GO ("html_go.png"),
//	HTML_VALID ("html_valid.png"),
//	IMAGE ("image.png"),
//	IMAGES ("images.png"),
//	IMAGE_ADD ("image_add.png"),
//	IMAGE_DELETE ("image_delete.png"),
//	IMAGE_EDIT ("image_edit.png"),
//	IMAGE_LINK ("image_link.png"),
//	INFORMATION ("information.png"),
//	IPOD ("ipod.png"),
//	IPOD_CAST ("ipod_cast.png"),
//	IPOD_CAST_ADD ("ipod_cast_add.png"),
//	IPOD_CAST_DELETE ("ipod_cast_delete.png"),
//	IPOD_SOUND ("ipod_sound.png"),
//	JOYSTICK ("joystick.png"),
//	JOYSTICK_ADD ("joystick_add.png"),
//	JOYSTICK_DELETE ("joystick_delete.png"),
//	JOYSTICK_ERROR ("joystick_error.png"),
//	KEY ("key.png"),
//	KEYBOARD ("keyboard.png"),
//	KEYBOARD_ADD ("keyboard_add.png"),
//	KEYBOARD_DELETE ("keyboard_delete.png"),
//	KEYBOARD_MAGNIFY ("keyboard_magnify.png"),
//	KEY_ADD ("key_add.png"),
//	KEY_DELETE ("key_delete.png"),
//	KEY_GO ("key_go.png"),
//	LAYERS ("layers.png"),
//	LAYOUT ("layout.png"),
//	LAYOUT_ADD ("layout_add.png"),
//	LAYOUT_CONTENT ("layout_content.png"),
//	LAYOUT_DELETE ("layout_delete.png"),
//	LAYOUT_EDIT ("layout_edit.png"),
//	LAYOUT_ERROR ("layout_error.png"),
//	LAYOUT_HEADER ("layout_header.png"),
//	LAYOUT_LINK ("layout_link.png"),
//	LAYOUT_SIDEBAR ("layout_sidebar.png"),
//	LIGHTBULB ("lightbulb.png"),
//	LIGHTBULB_ADD ("lightbulb_add.png"),
//	LIGHTBULB_DELETE ("lightbulb_delete.png"),
//	LIGHTBULB_OFF ("lightbulb_off.png"),
//	LIGHTNING ("lightning.png"),
//	LIGHTNING_ADD ("lightning_add.png"),
//	LIGHTNING_DELETE ("lightning_delete.png"),
//	LIGHTNING_GO ("lightning_go.png"),
//	LINK ("link.png"),
//	LINK_ADD ("link_add.png"),
//	LINK_BREAK ("link_break.png"),
//	LINK_DELETE ("link_delete.png"),
//	LINK_EDIT ("link_edit.png"),
//	LINK_ERROR ("link_error.png"),
//	LINK_GO ("link_go.png"),
//	LOCK ("lock.png"),
//	LOCK_ADD ("lock_add.png"),
//	LOCK_BREAK ("lock_break.png"),
//	LOCK_DELETE ("lock_delete.png"),
//	LOCK_EDIT ("lock_edit.png"),
//	LOCK_GO ("lock_go.png"),
//	LOCK_OPEN ("lock_open.png"),
//	LORRY ("lorry.png"),
//	LORRY_ADD ("lorry_add.png"),
//	LORRY_DELETE ("lorry_delete.png"),
//	LORRY_ERROR ("lorry_error.png"),
//	LORRY_FLATBED ("lorry_flatbed.png"),
//	LORRY_GO ("lorry_go.png"),
//	LORRY_LINK ("lorry_link.png"),
//	MAGIFIER_ZOOM_OUT ("magifier_zoom_out.png"),
//	MAGNIFIER ("magnifier.png"),
//	MAGNIFIER_ZOOM_IN ("magnifier_zoom_in.png"),
//	MALE ("male.png"),
//	MAP ("map.png"),
//	MAP_ADD ("map_add.png"),
//	MAP_DELETE ("map_delete.png"),
//	MAP_EDIT ("map_edit.png"),
//	MAP_GO ("map_go.png"),
//	MAP_MAGNIFY ("map_magnify.png"),
//	MEDAL_BRONZE_1 ("medal_bronze_1.png"),
//	MEDAL_BRONZE_2 ("medal_bronze_2.png"),
//	MEDAL_BRONZE_3 ("medal_bronze_3.png"),
//	MEDAL_BRONZE_ADD ("medal_bronze_add.png"),
//	MEDAL_BRONZE_DELETE ("medal_bronze_delete.png"),
//	MEDAL_GOLD_1 ("medal_gold_1.png"),
//	MEDAL_GOLD_2 ("medal_gold_2.png"),
//	MEDAL_GOLD_3 ("medal_gold_3.png"),
//	MEDAL_GOLD_ADD ("medal_gold_add.png"),
//	MEDAL_GOLD_DELETE ("medal_gold_delete.png"),
//	MEDAL_SILVER_1 ("medal_silver_1.png"),
//	MEDAL_SILVER_2 ("medal_silver_2.png"),
//	MEDAL_SILVER_3 ("medal_silver_3.png"),
//	MEDAL_SILVER_ADD ("medal_silver_add.png"),
//	MEDAL_SILVER_DELETE ("medal_silver_delete.png"),
//	MONEY ("money.png"),
//	MONEY_ADD ("money_add.png"),
//	MONEY_DELETE ("money_delete.png"),
//	MONEY_DOLLAR ("money_dollar.png"),
//	MONEY_EURO ("money_euro.png"),
//	MONEY_POUND ("money_pound.png"),
//	MONEY_YEN ("money_yen.png"),
//	MONITOR ("monitor.png"),
//	MONITOR_ADD ("monitor_add.png"),
//	MONITOR_DELETE ("monitor_delete.png"),
//	MONITOR_EDIT ("monitor_edit.png"),
//	MONITOR_ERROR ("monitor_error.png"),
//	MONITOR_GO ("monitor_go.png"),
//	MONITOR_LIGHTNING ("monitor_lightning.png"),
//	MONITOR_LINK ("monitor_link.png"),
//	MOUSE ("mouse.png"),
//	MOUSE_ADD ("mouse_add.png"),
//	MOUSE_DELETE ("mouse_delete.png"),
//	MOUSE_ERROR ("mouse_error.png"),
//	MUSIC ("music.png"),
//	NEW ("new.png"),
//	NEWSPAPER ("newspaper.png"),
//	NEWSPAPER_ADD ("newspaper_add.png"),
//	NEWSPAPER_DELETE ("newspaper_delete.png"),
//	NEWSPAPER_GO ("newspaper_go.png"),
//	NEWSPAPER_LINK ("newspaper_link.png"),
//	NOTE ("note.png"),
//	NOTE_ADD ("note_add.png"),
//	NOTE_DELETE ("note_delete.png"),
//	NOTE_EDIT ("note_edit.png"),
//	NOTE_ERROR ("note_error.png"),
//	NOTE_GO ("note_go.png"),
//	OVERLAYS ("overlays.png"),
//	PACKAGE ("package.png"),
//	PACKAGE_ADD ("package_add.png"),
//	PACKAGE_DELETE ("package_delete.png"),
//	PACKAGE_GO ("package_go.png"),
//	PACKAGE_GREEN ("package_green.png"),
//	PACKAGE_LINK ("package_link.png"),
//	PAGE ("page.png"),
//	PAGE_ADD ("page_add.png"),
//	PAGE_ATTACH ("page_attach.png"),
//	PAGE_CODE ("page_code.png"),
//	PAGE_COPY ("page_copy.png"),
//	PAGE_DELETE ("page_delete.png"),
//	PAGE_EDIT ("page_edit.png"),
//	PAGE_ERROR ("page_error.png"),
//	PAGE_EXCEL ("page_excel.png"),
//	PAGE_FIND ("page_find.png"),
//	PAGE_GEAR ("page_gear.png"),
//	PAGE_GO ("page_go.png"),
//	PAGE_GREEN ("page_green.png"),
//	PAGE_KEY ("page_key.png"),
//	PAGE_LIGHTNING ("page_lightning.png"),
//	PAGE_LINK ("page_link.png"),
//	PAGE_PAINTBRUSH ("page_paintbrush.png"),
//	PAGE_PASTE ("page_paste.png"),
//	PAGE_RED ("page_red.png"),
//	PAGE_REFRESH ("page_refresh.png"),
//	PAGE_SAVE ("page_save.png"),
//	PAGE_WHITE ("page_white.png"),
//	PAGE_WHITE_ACROBAT ("page_white_acrobat.png"),
//	PAGE_WHITE_ACTIONSCRIPT ("page_white_actionscript.png"),
//	PAGE_WHITE_ADD ("page_white_add.png"),
//	PAGE_WHITE_C ("page_white_c.png"),
//	PAGE_WHITE_CAMERA ("page_white_camera.png"),
//	PAGE_WHITE_CD ("page_white_cd.png"),
//	PAGE_WHITE_CODE ("page_white_code.png"),
//	PAGE_WHITE_CODE_RED ("page_white_code_red.png"),
//	PAGE_WHITE_COLDFUSION ("page_white_coldfusion.png"),
//	PAGE_WHITE_COMPRESSED ("page_white_compressed.png"),
//	PAGE_WHITE_COPY ("page_white_copy.png"),
//	PAGE_WHITE_CPLUSPLUS ("page_white_cplusplus.png"),
//	PAGE_WHITE_CSHARP ("page_white_csharp.png"),
//	PAGE_WHITE_CUP ("page_white_cup.png"),
//	PAGE_WHITE_DATABASE ("page_white_database.png"),
//	PAGE_WHITE_DELETE ("page_white_delete.png"),
//	PAGE_WHITE_DVD ("page_white_dvd.png"),
//	PAGE_WHITE_EDIT ("page_white_edit.png"),
//	PAGE_WHITE_ERROR ("page_white_error.png"),
//	PAGE_WHITE_EXCEL ("page_white_excel.png"),
//	PAGE_WHITE_FIND ("page_white_find.png"),
//	PAGE_WHITE_FLASH ("page_white_flash.png"),
//	PAGE_WHITE_FREEHAND ("page_white_freehand.png"),
//	PAGE_WHITE_GEAR ("page_white_gear.png"),
//	PAGE_WHITE_GET ("page_white_get.png"),
//	PAGE_WHITE_GO ("page_white_go.png"),
//	PAGE_WHITE_H ("page_white_h.png"),
//	PAGE_WHITE_HORIZONTAL ("page_white_horizontal.png"),
//	PAGE_WHITE_KEY ("page_white_key.png"),
//	PAGE_WHITE_LIGHTNING ("page_white_lightning.png"),
//	PAGE_WHITE_LINK ("page_white_link.png"),
//	PAGE_WHITE_MAGNIFY ("page_white_magnify.png"),
//	PAGE_WHITE_MEDAL ("page_white_medal.png"),
//	PAGE_WHITE_OFFICE ("page_white_office.png"),
//	PAGE_WHITE_PAINT ("page_white_paint.png"),
//	PAGE_WHITE_PAINTBRUSH ("page_white_paintbrush.png"),
//	PAGE_WHITE_PASTE ("page_white_paste.png"),
//	PAGE_WHITE_PHP ("page_white_php.png"),
//	PAGE_WHITE_PICTURE ("page_white_picture.png"),
//	PAGE_WHITE_POWERPOINT ("page_white_powerpoint.png"),
//	PAGE_WHITE_PUT ("page_white_put.png"),
//	PAGE_WHITE_RUBY ("page_white_ruby.png"),
//	PAGE_WHITE_STACK ("page_white_stack.png"),
//	PAGE_WHITE_STAR ("page_white_star.png"),
//	PAGE_WHITE_SWOOSH ("page_white_swoosh.png"),
//	PAGE_WHITE_TEXT ("page_white_text.png"),
//	PAGE_WHITE_TEXT_WIDTH ("page_white_text_width.png"),
//	PAGE_WHITE_TUX ("page_white_tux.png"),
//	PAGE_WHITE_VECTOR ("page_white_vector.png"),
//	PAGE_WHITE_VISUALSTUDIO ("page_white_visualstudio.png"),
//	PAGE_WHITE_WIDTH ("page_white_width.png"),
//	PAGE_WHITE_WORD ("page_white_word.png"),
//	PAGE_WHITE_WORLD ("page_white_world.png"),
//	PAGE_WHITE_WRENCH ("page_white_wrench.png"),
//	PAGE_WHITE_ZIP ("page_white_zip.png"),
//	PAGE_WORD ("page_word.png"),
//	PAGE_WORLD ("page_world.png"),
//	PAINTBRUSH ("paintbrush.png"),
//	PAINTCAN ("paintcan.png"),
//	PALETTE ("palette.png"),
//	PASTE_PLAIN ("paste_plain.png"),
//	PASTE_WORD ("paste_word.png"),
//	PENCIL ("pencil.png"),
//	PENCIL_ADD ("pencil_add.png"),
//	PENCIL_DELETE ("pencil_delete.png"),
//	PENCIL_GO ("pencil_go.png"),
//	PHONE ("phone.png"),
//	PHONE_ADD ("phone_add.png"),
//	PHONE_DELETE ("phone_delete.png"),
//	PHONE_SOUND ("phone_sound.png"),
//	PHOTO ("photo.png"),
//	PHOTOS ("photos.png"),
//	PHOTO_ADD ("photo_add.png"),
//	PHOTO_DELETE ("photo_delete.png"),
//	PHOTO_LINK ("photo_link.png"),
//	PICTURE ("picture.png"),
//	PICTURES ("pictures.png"),
//	PICTURE_ADD ("picture_add.png"),
//	PICTURE_DELETE ("picture_delete.png"),
//	PICTURE_EDIT ("picture_edit.png"),
//	PICTURE_EMPTY ("picture_empty.png"),
//	PICTURE_ERROR ("picture_error.png"),
//	PICTURE_GO ("picture_go.png"),
//	PICTURE_KEY ("picture_key.png"),
//	PICTURE_LINK ("picture_link.png"),
//	PICTURE_SAVE ("picture_save.png"),
//	PILCROW ("pilcrow.png"),
//	PILL ("pill.png"),
//	PILL_ADD ("pill_add.png"),
//	PILL_DELETE ("pill_delete.png"),
//	PILL_GO ("pill_go.png"),
//	PLUGIN ("plugin.png"),
//	PLUGIN_ADD ("plugin_add.png"),
//	PLUGIN_DELETE ("plugin_delete.png"),
//	PLUGIN_DISABLED ("plugin_disabled.png"),
//	PLUGIN_EDIT ("plugin_edit.png"),
//	PLUGIN_ERROR ("plugin_error.png"),
//	PLUGIN_GO ("plugin_go.png"),
//	PLUGIN_LINK ("plugin_link.png"),
//	PRINTER ("printer.png"),
//	PRINTER_ADD ("printer_add.png"),
//	PRINTER_DELETE ("printer_delete.png"),
//	PRINTER_EMPTY ("printer_empty.png"),
//	PRINTER_ERROR ("printer_error.png"),
//	RAINBOW ("rainbow.png"),
//	REPORT ("report.png"),
//	REPORT_ADD ("report_add.png"),
//	REPORT_DELETE ("report_delete.png"),
//	REPORT_DISK ("report_disk.png"),
//	REPORT_EDIT ("report_edit.png"),
//	REPORT_GO ("report_go.png"),
//	REPORT_KEY ("report_key.png"),
//	REPORT_LINK ("report_link.png"),
//	REPORT_MAGNIFY ("report_magnify.png"),
//	REPORT_PICTURE ("report_picture.png"),
//	REPORT_USER ("report_user.png"),
//	REPORT_WORD ("report_word.png"),
//	RESULTSET_FIRST ("resultset_first.png"),
//	RESULTSET_LAST ("resultset_last.png"),
//	RESULTSET_NEXT ("resultset_next.png"),
//	RESULTSET_PREVIOUS ("resultset_previous.png"),
//	ROSETTE ("rosette.png"),
//	RSS ("rss.png"),
//	RSS_ADD ("rss_add.png"),
//	RSS_DELETE ("rss_delete.png"),
//	RSS_GO ("rss_go.png"),
//	RSS_VALID ("rss_valid.png"),
//	RUBY ("ruby.png"),
//	RUBY_ADD ("ruby_add.png"),
//	RUBY_DELETE ("ruby_delete.png"),
//	RUBY_GEAR ("ruby_gear.png"),
//	RUBY_GET ("ruby_get.png"),
//	RUBY_GO ("ruby_go.png"),
//	RUBY_KEY ("ruby_key.png"),
//	RUBY_LINK ("ruby_link.png"),
//	RUBY_PUT ("ruby_put.png"),
//	SCRIPT ("script.png"),
//	SCRIPT_ADD ("script_add.png"),
//	SCRIPT_CODE ("script_code.png"),
//	SCRIPT_CODE_RED ("script_code_red.png"),
//	SCRIPT_DELETE ("script_delete.png"),
//	SCRIPT_EDIT ("script_edit.png"),
//	SCRIPT_ERROR ("script_error.png"),
//	SCRIPT_GEAR ("script_gear.png"),
//	SCRIPT_GO ("script_go.png"),
//	SCRIPT_KEY ("script_key.png"),
//	SCRIPT_LIGHTNING ("script_lightning.png"),
//	SCRIPT_LINK ("script_link.png"),
//	SCRIPT_PALETTE ("script_palette.png"),
//	SCRIPT_SAVE ("script_save.png"),
//	SERVER ("server.png"),
//	SERVER_ADD ("server_add.png"),
//	SERVER_CHART ("server_chart.png"),
//	SERVER_COMPRESSED ("server_compressed.png"),
//	SERVER_CONNECT ("server_connect.png"),
//	SERVER_DATABASE ("server_database.png"),
//	SERVER_DELETE ("server_delete.png"),
//	SERVER_EDIT ("server_edit.png"),
//	SERVER_ERROR ("server_error.png"),
//	SERVER_GO ("server_go.png"),
//	SERVER_KEY ("server_key.png"),
//	SERVER_LIGHTNING ("server_lightning.png"),
//	SERVER_LINK ("server_link.png"),
//	SERVER_UNCOMPRESSED ("server_uncompressed.png"),
//	SHADING ("shading.png"),
//	SHAPE_ALIGN_BOTTOM ("shape_align_bottom.png"),
//	SHAPE_ALIGN_CENTER ("shape_align_center.png"),
//	SHAPE_ALIGN_LEFT ("shape_align_left.png"),
//	SHAPE_ALIGN_MIDDLE ("shape_align_middle.png"),
//	SHAPE_ALIGN_RIGHT ("shape_align_right.png"),
//	SHAPE_ALIGN_TOP ("shape_align_top.png"),
//	SHAPE_FLIP_HORIZONTAL ("shape_flip_horizontal.png"),
//	SHAPE_FLIP_VERTICAL ("shape_flip_vertical.png"),
//	SHAPE_GROUP ("shape_group.png"),
//	SHAPE_HANDLES ("shape_handles.png"),
//	SHAPE_MOVE_BACK ("shape_move_back.png"),
//	SHAPE_MOVE_BACKWARDS ("shape_move_backwards.png"),
//	SHAPE_MOVE_FORWARDS ("shape_move_forwards.png"),
//	SHAPE_MOVE_FRONT ("shape_move_front.png"),
//	SHAPE_ROTATE_ANTICLOCKWISE ("shape_rotate_anticlockwise.png"),
//	SHAPE_ROTATE_CLOCKWISE ("shape_rotate_clockwise.png"),
//	SHAPE_SQUARE ("shape_square.png"),
//	SHAPE_SQUARE_ADD ("shape_square_add.png"),
//	SHAPE_SQUARE_DELETE ("shape_square_delete.png"),
//	SHAPE_SQUARE_EDIT ("shape_square_edit.png"),
//	SHAPE_SQUARE_ERROR ("shape_square_error.png"),
//	SHAPE_SQUARE_GO ("shape_square_go.png"),
//	SHAPE_SQUARE_KEY ("shape_square_key.png"),
//	SHAPE_SQUARE_LINK ("shape_square_link.png"),
//	SHAPE_UNGROUP ("shape_ungroup.png"),
//	SHIELD ("shield.png"),
//	SHIELD_ADD ("shield_add.png"),
//	SHIELD_DELETE ("shield_delete.png"),
//	SHIELD_GO ("shield_go.png"),
//	SITEMAP ("sitemap.png"),
//	SITEMAP_COLOR ("sitemap_color.png"),
//	SOUND ("sound.png"),
//	SOUND_ADD ("sound_add.png"),
//	SOUND_DELETE ("sound_delete.png"),
//	SOUND_LOW ("sound_low.png"),
//	SOUND_MUTE ("sound_mute.png"),
//	SOUND_NONE ("sound_none.png"),
//	SPELLCHECK ("spellcheck.png"),
//	SPORT_8BALL ("sport_8ball.png"),
//	SPORT_BASKETBALL ("sport_basketball.png"),
//	SPORT_FOOTBALL ("sport_football.png"),
//	SPORT_GOLF ("sport_golf.png"),
//	SPORT_RAQUET ("sport_raquet.png"),
//	SPORT_SHUTTLECOCK ("sport_shuttlecock.png"),
//	SPORT_SOCCER ("sport_soccer.png"),
//	SPORT_TENNIS ("sport_tennis.png"),
//	STAR ("star.png"),
//	STATUS_AWAY ("status_away.png"),
//	STATUS_BUSY ("status_busy.png"),
//	STATUS_OFFLINE ("status_offline.png"),
//	STATUS_ONLINE ("status_online.png"),
//	STOP ("stop.png"),
//	STYLE ("style.png"),
//	STYLE_ADD ("style_add.png"),
//	STYLE_DELETE ("style_delete.png"),
//	STYLE_EDIT ("style_edit.png"),
//	STYLE_GO ("style_go.png"),
//	SUM ("sum.png"),
//	TAB ("tab.png"),
//	TABLE ("table.png"),
//	TABLE_ADD ("table_add.png"),
//	TABLE_DELETE ("table_delete.png"),
//	TABLE_EDIT ("table_edit.png"),
//	TABLE_ERROR ("table_error.png"),
//	TABLE_GEAR ("table_gear.png"),
//	TABLE_GO ("table_go.png"),
//	TABLE_KEY ("table_key.png"),
//	TABLE_LIGHTNING ("table_lightning.png"),
//	TABLE_LINK ("table_link.png"),
//	TABLE_MULTIPLE ("table_multiple.png"),
//	TABLE_REFRESH ("table_refresh.png"),
//	TABLE_RELATIONSHIP ("table_relationship.png"),
//	TABLE_ROW_DELETE ("table_row_delete.png"),
//	TABLE_ROW_INSERT ("table_row_insert.png"),
//	TABLE_SAVE ("table_save.png"),
//	TABLE_SORT ("table_sort.png"),
//	TAB_ADD ("tab_add.png"),
//	TAB_DELETE ("tab_delete.png"),
//	TAB_EDIT ("tab_edit.png"),
//	TAB_GO ("tab_go.png"),
//	TAG ("tag.png"),
//	TAG_BLUE ("tag_blue.png"),
//	TAG_BLUE_ADD ("tag_blue_add.png"),
//	TAG_BLUE_DELETE ("tag_blue_delete.png"),
//	TAG_BLUE_EDIT ("tag_blue_edit.png"),
//	TAG_GREEN ("tag_green.png"),
//	TAG_ORANGE ("tag_orange.png"),
//	TAG_PINK ("tag_pink.png"),
//	TAG_PURPLE ("tag_purple.png"),
//	TAG_RED ("tag_red.png"),
//	TAG_YELLOW ("tag_yellow.png"),
//	TELEPHONE ("telephone.png"),
//	TELEPHONE_ADD ("telephone_add.png"),
//	TELEPHONE_DELETE ("telephone_delete.png"),
//	TELEPHONE_EDIT ("telephone_edit.png"),
//	TELEPHONE_ERROR ("telephone_error.png"),
//	TELEPHONE_GO ("telephone_go.png"),
//	TELEPHONE_KEY ("telephone_key.png"),
//	TELEPHONE_LINK ("telephone_link.png"),
//	TELEVISION ("television.png"),
//	TELEVISION_ADD ("television_add.png"),
//	TELEVISION_DELETE ("television_delete.png"),
//	TEXTFIELD ("textfield.png"),
//	TEXTFIELD_ADD ("textfield_add.png"),
//	TEXTFIELD_DELETE ("textfield_delete.png"),
//	TEXTFIELD_KEY ("textfield_key.png"),
//	TEXTFIELD_RENAME ("textfield_rename.png"),
//	TEXT_ALIGN_CENTER ("text_align_center.png"),
//	TEXT_ALIGN_JUSTIFY ("text_align_justify.png"),
//	TEXT_ALIGN_LEFT ("text_align_left.png"),
//	TEXT_ALIGN_RIGHT ("text_align_right.png"),
//	TEXT_ALLCAPS ("text_allcaps.png"),
//	TEXT_BOLD ("text_bold.png"),
//	TEXT_COLUMNS ("text_columns.png"),
//	TEXT_DROPCAPS ("text_dropcaps.png"),
//	TEXT_HEADING_1 ("text_heading_1.png"),
//	TEXT_HEADING_2 ("text_heading_2.png"),
//	TEXT_HEADING_3 ("text_heading_3.png"),
//	TEXT_HEADING_4 ("text_heading_4.png"),
//	TEXT_HEADING_5 ("text_heading_5.png"),
//	TEXT_HEADING_6 ("text_heading_6.png"),
//	TEXT_HORIZONTALRULE ("text_horizontalrule.png"),
//	TEXT_INDENT ("text_indent.png"),
//	TEXT_INDENT_REMOVE ("text_indent_remove.png"),
//	TEXT_ITALIC ("text_italic.png"),
//	TEXT_KERNING ("text_kerning.png"),
//	TEXT_LETTERSPACING ("text_letterspacing.png"),
//	TEXT_LETTER_OMEGA ("text_letter_omega.png"),
//	TEXT_LINESPACING ("text_linespacing.png"),
//	TEXT_LIST_BULLETS ("text_list_bullets.png"),
//	TEXT_LIST_NUMBERS ("text_list_numbers.png"),
//	TEXT_LOWERCASE ("text_lowercase.png"),
//	TEXT_PADDING_BOTTOM ("text_padding_bottom.png"),
//	TEXT_PADDING_LEFT ("text_padding_left.png"),
//	TEXT_PADDING_RIGHT ("text_padding_right.png"),
//	TEXT_PADDING_TOP ("text_padding_top.png"),
//	TEXT_REPLACE ("text_replace.png"),
//	TEXT_SIGNATURE ("text_signature.png"),
//	TEXT_SMALLCAPS ("text_smallcaps.png"),
//	TEXT_STRIKETHROUGH ("text_strikethrough.png"),
//	TEXT_SUBSCRIPT ("text_subscript.png"),
//	TEXT_SUPERSCRIPT ("text_superscript.png"),
//	TEXT_UNDERLINE ("text_underline.png"),
//	TEXT_UPPERCASE ("text_uppercase.png"),
//	THUMB_DOWN ("thumb_down.png"),
//	THUMB_UP ("thumb_up.png"),
//	TICK ("tick.png"),
//	TIME ("time.png"),
//	TIMELINE_MARKER ("timeline_marker.png"),
//	TIME_ADD ("time_add.png"),
//	TIME_DELETE ("time_delete.png"),
//	TIME_GO ("time_go.png"),
//	TRANSMIT ("transmit.png"),
//	TRANSMIT_ADD ("transmit_add.png"),
//	TRANSMIT_BLUE ("transmit_blue.png"),
//	TRANSMIT_DELETE ("transmit_delete.png"),
//	TRANSMIT_EDIT ("transmit_edit.png"),
//	TRANSMIT_ERROR ("transmit_error.png"),
//	TRANSMIT_GO ("transmit_go.png"),
//	TUX ("tux.png"),
//	USER ("user.png"),
//	USER_ADD ("user_add.png"),
//	USER_COMMENT ("user_comment.png"),
//	USER_DELETE ("user_delete.png"),
//	USER_EDIT ("user_edit.png"),
//	USER_FEMALE ("user_female.png"),
//	USER_GO ("user_go.png"),
//	USER_GRAY ("user_gray.png"),
//	USER_GREEN ("user_green.png"),
//	USER_ORANGE ("user_orange.png"),
//	USER_RED ("user_red.png"),
//	USER_SUIT ("user_suit.png"),
//	VCARD ("vcard.png"),
//	VCARD_ADD ("vcard_add.png"),
//	VCARD_DELETE ("vcard_delete.png"),
//	VCARD_EDIT ("vcard_edit.png"),
//	VECTOR ("vector.png"),
//	VECTOR_ADD ("vector_add.png"),
//	VECTOR_DELETE ("vector_delete.png"),
//	WAND ("wand.png"),
//	WEATHER_CLOUDS ("weather_clouds.png"),
//	WEATHER_CLOUDY ("weather_cloudy.png"),
//	WEATHER_LIGHTNING ("weather_lightning.png"),
//	WEATHER_RAIN ("weather_rain.png"),
//	WEATHER_SNOW ("weather_snow.png"),
//	WEATHER_SUN ("weather_sun.png"),
//	WEBCAM ("webcam.png"),
//	WEBCAM_ADD ("webcam_add.png"),
//	WEBCAM_DELETE ("webcam_delete.png"),
//	WEBCAM_ERROR ("webcam_error.png"),
//	WORLD ("world.png"),
//	WORLD_ADD ("world_add.png"),
//	WORLD_DELETE ("world_delete.png"),
//	WORLD_EDIT ("world_edit.png"),
//	WORLD_GO ("world_go.png"),
//	WORLD_LINK ("world_link.png"),
//	WRENCH ("wrench.png"),
//	WRENCH_ORANGE ("wrench_orange.png"),
//	XHTML ("xhtml.png"),
//	XHTML_ADD ("xhtml_add.png"),
//	XHTML_DELETE ("xhtml_delete.png"),
//	XHTML_GO ("xhtml_go.png"),
//	XHTML_VALID ("xhtml_valid.png"),
//	ZOOM ("zoom.png"),
//	ZOOM_IN ("zoom_in.png"),
	ZOOM_OUT_DELETED ("zoom_out.png");

	private final static String ICONS_DIRECTORY = "/com/famfamfam/silk/";
	private final String icon;
	
	private SilkIcon(String icon) {
		this.icon = requireNonNull(icon);
	}
	
	public String getFileName() {
		return ICONS_DIRECTORY + icon;
	}
	
	public InputStream getFileInputStream() {
		return getClass().getResourceAsStream(getFileName());
	}
	
	public Image load() {
		
		return new Image(getFileInputStream());
	}
	
	public ImageView view() {
		return new ImageView(load());
	}
}
