from flask import Flask, render_template, request
app = Flask(__name__)

@app.route('/')
def index() :
  return render_template('index.html')

@app.route('/profile/<user>')
def show_profile(user) :
  return 'hello %s' % user

@app.route('/setting/<option>')
def show_setting(option) :
  return render_template('setting.html', option=option)

@app.route('/login', methods=['GET', 'POST'])
def show_login() :
  if request.method == 'POST' :
    return 'Email kamu adalah' + request.form['email']
  return render_template('login.html')