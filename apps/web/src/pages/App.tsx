import {useForm} from "react-hook-form";
import { yupResolver } from "@hookform/resolvers/yup"
import {createShortUrl, createShortUrlSchema} from "../schemas/createShortUrlSchema.ts";

function App() {
  const {register, handleSubmit, formState: {errors, isSubmitting}} = useForm<createShortUrl>({
    resolver: yupResolver(createShortUrlSchema)
  })

  const onSubmit = async (data: any) => {
    console.log(data)
  }

  return (
    <div className="w-screen h-screen flex items-center justify-center bg-slate-50">
      <form onSubmit={handleSubmit(onSubmit)}
            className="flex items-center justify-evenly flex-col w-[32rem] h-2/5 p-12 bg-slate-200 rounded-md">
        <h1>Url Shortener from CS50</h1>

        <div className="flex items-center justify-center">
          <input name="url" className="flex py-2 px-4 rounded-l-md" type="text"
                 placeholder="https://" {...register("url")} />

          <button type="submit" className="flex bg-sky-400 py-2 px-4 rounded-r-md">
            Be short!
          </button>
        </div>

        <span className="text-red-500">{errors.url?.message}</span>
      </form>
    </div>
  )
}

export default App
