function App() {
  return (
    <div className="w-screen h-screen flex items-center justify-center bg-slate-50">
      <form className="flex items-center justify-evenly flex-col w-[32rem] h-2/5 p-12 bg-slate-200 rounded-md">
        <h1>Url Shortener from CS50</h1>

        <div className="flex items-center justify-center">
          <input className="flex py-2 px-4 rounded-l-md" type="text" placeholder="https://" />

          <button className="flex bg-sky-400 py-2 px-4 rounded-r-md">
            Be short!
          </button>
        </div>
      </form>
    </div>
  )
}

export default App
