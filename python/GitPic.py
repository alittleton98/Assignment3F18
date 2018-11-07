'''
GitPic
'''

import requests
import urllib
from bs4 import BeautifulSoup
#url
webPage = 'https://www.reddit.com/r/EarthPorn/comments/9t8r5o/massive_sunbeams_the_largest_ive_ever_seen/'
webCode = requests.get(webPage) #url, data transfer, timeout
soup = BeautifulSoup(webCode,"html.parser").text
images = []
images = soup.findAll('img') #searches for all img tags on page
print(images)

for image in images:
    print(image.get('src'))

