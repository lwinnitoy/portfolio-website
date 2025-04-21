window.addEventListener('scroll', () => {
    const wrapper = document.getElementById('progress-wrapper');
    const trigger = window.innerHeight * 0.70; // Adjust trigger point
  
    if (window.scrollY > trigger) {
      wrapper.classList.remove('progress-absolute');
      wrapper.classList.add('progress-fixed');
    } else {
      wrapper.classList.remove('progress-fixed');
      wrapper.classList.add('progress-absolute');
    }
  
    // Scroll % logic
    const docHeight = document.body.scrollHeight - window.innerHeight;
    const scrollPercent = (window.scrollY / docHeight) * 100;
    const progressBar = document.querySelector('.progress-bar');
    progressBar.style.height = `${scrollPercent}%`;
  });