/*
Copyright (C) Max Kastanas 2010
Copyright (C) Naval Saini 2010

 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */

#ifndef _PCM2WAV_INIT_H
#define	_PCM2WAV_INIT_H

#ifdef	__cplusplus
extern "C" {
#endif




#ifdef	__cplusplus
}
#endif


#include <jni.h>
#include "pcm2wav_params.h"
#include "../utils/utils.h"
int pcm2wav_init(JNIEnv* env, jobject thiz);

#endif	/* _PCM2WAV_INIT_H */

