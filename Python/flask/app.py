from flask import Flask, render_template
app = Flask(__name__)


@app.route('/')
def index():
    return render_template('index.html')


@app.route('/setting')
def show_setting():
    return 'Ini adalah halaman setting'


@app.route('/profile/<user>')
def show_profile(user):
    return render_template('profile.html', user=user)


@app.route('/blog/<int:blog_id>')
def show_blog(blog_id):
    return render_template('blog.html', blog_id=blog_id)
