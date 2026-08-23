package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LoaderPinwheel: ImageVector
    get() {
        if (_loaderPinwheel != null) {
            return _loaderPinwheel!!
        }
        _loaderPinwheel = ImageVector.Builder(
            name = "LoaderPinwheel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21f, 12f)
            arcTo(9f, 9f, 0f, true, false, 3f, 12f)
            arcTo(9f, 9f, 0f, true, false, 21f, 12f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8.99997f, 3.51721f)
            curveTo(9.58182f, 3.47053f, 10.1737f, 3.51405f, 10.7492f, 3.65094f)
            curveTo(12.05f, 3.96034f, 13.1607f, 4.72137f, 13.837f, 5.76663f)
            curveTo(14.5133f, 6.81189f, 14.6998f, 8.05575f, 14.3555f, 9.22457f)
            curveTo(14.0112f, 10.3934f, 13.1642f, 11.3914f, 12.001f, 11.9991f)
            curveTo(10.8378f, 12.6069f, 9.99082f, 13.6049f, 9.6465f, 14.7737f)
            curveTo(9.30219f, 15.9425f, 9.48869f, 17.1864f, 10.165f, 18.2317f)
            curveTo(10.8413f, 19.2769f, 11.952f, 20.038f, 13.2527f, 20.3473f)
            curveTo(13.8276f, 20.4841f, 14.4188f, 20.5277f, 15f, 20.4812f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17.8455f, 5.16003f)
            curveTo(18.1769f, 5.6406f, 18.4352f, 6.17494f, 18.6044f, 6.74182f)
            curveTo(18.9868f, 8.023f, 18.8831f, 9.36541f, 18.316f, 10.4737f)
            curveTo(17.7489f, 11.5821f, 16.765f, 12.3655f, 15.5806f, 12.6517f)
            curveTo(14.3962f, 12.938f, 13.1084f, 12.7035f, 12.0005f, 12f)
            curveTo(10.8926f, 11.2964f, 9.60477f, 11.062f, 8.42039f, 11.3482f)
            curveTo(7.236f, 11.6344f, 6.25204f, 12.4179f, 5.68497f, 13.5262f)
            curveTo(5.1179f, 14.6345f, 5.01417f, 15.9769f, 5.39661f, 17.2581f)
            curveTo(5.56562f, 17.8243f, 5.82347f, 18.3581f, 6.15425f, 18.8382f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20.8459f, 13.6421f)
            curveTo(20.5954f, 14.1693f, 20.2618f, 14.6602f, 19.8554f, 15.0901f)
            curveTo(18.9371f, 16.0619f, 17.7227f, 16.6433f, 16.4793f, 16.7064f)
            curveTo(15.236f, 16.7694f, 14.0655f, 16.309f, 13.2254f, 15.4264f)
            curveTo(12.3853f, 14.5438f, 11.9445f, 13.3113f, 11.9998f, 12.0001f)
            curveTo(12.0551f, 10.6888f, 11.6143f, 9.45635f, 10.7742f, 8.57375f)
            curveTo(9.93413f, 7.69115f, 8.76366f, 7.23074f, 7.52029f, 7.29381f)
            curveTo(6.27692f, 7.35687f, 5.06249f, 7.93825f, 4.14417f, 8.91004f)
            curveTo(3.73833f, 9.33951f, 3.40501f, 9.82969f, 3.1546f, 10.3562f)
        }
        }.build()

        return _loaderPinwheel!!
    }

private var _loaderPinwheel: ImageVector? = null
