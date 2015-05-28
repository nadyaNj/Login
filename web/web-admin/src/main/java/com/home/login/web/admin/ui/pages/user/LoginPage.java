package com.home.login.web.admin.ui.pages.user;

import com.home.login.web.admin.ui.pages.user.helper.UserPageHelper;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.spring.injection.annot.SpringBean;

/**
 * Created: Nadya Dainelyan
 * DATE:    5/27/15
 * TIME:    12:09 AM
 */
public class LoginPage extends WebPage {

    private static final long serialVersionUID = -4119825849153472126L;

    /*dependencies*/
    @SpringBean
    private UserPageHelper userPageHelper;

    private String userName;

    private String password;



    /*Constructor*/
    public LoginPage() {

        add(new RegistrationForm("registrationForm"));
    }


    /**
     * Registration form
     */
    private class RegistrationForm extends Form<Void> {

        /*Constructor*/
        public RegistrationForm(final String id) {
            super(id);

            initRegistrationForm();
        }


        /**
         * Initializing registration form
         */
        private void initRegistrationForm() {
            final RequiredTextField<String> username = new RequiredTextField<>("name");
            add(username);

            final PasswordTextField passwd = new PasswordTextField("password");
            add(passwd);

            userName = username.toString();
            password = passwd.toString();

            add(new SignIn("login", this));
        }


        /**
         * Save button
         */
        private class SignIn extends AjaxButton {

            /*Constructor*/
            public SignIn(final String id, final Form<?> form) {
                super(id, form);
            }


            @Override
            protected void onSubmit(final AjaxRequestTarget target, final Form<?> form) {
                userPageHelper.getLoginUser(userName, password);
            }

            @Override
            protected void onAfterSubmit(final AjaxRequestTarget target, final Form<?> form) {

            }

            @Override
            protected void onError(final AjaxRequestTarget target, final Form<?> form) {
                target.add(form);
            }
        }
    }
}
