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

val HugeIcons.Pipette: ImageVector
    get() {
        if (_pipette != null) {
            return _pipette!!
        }
        _pipette = ImageVector.Builder(
            name = "Pipette",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15.5857f, 12.4629f)
            lineTo(9.90583f, 18.1429f)
            curveTo(9.86061f, 18.1881f, 9.838f, 18.2107f, 9.81549f, 18.2325f)
            curveTo(9.27093f, 18.7605f, 8.5893f, 19.1253f, 7.84793f, 19.2855f)
            curveTo(7.8173f, 19.2922f, 7.78588f, 19.2984f, 7.72322f, 19.311f)
            lineTo(7.51632f, 19.3524f)
            curveTo(6.82433f, 19.4908f, 6.1888f, 19.8309f, 5.68981f, 20.3299f)
            lineTo(5.44056f, 20.5791f)
            curveTo(4.88026f, 21.1394f, 3.97184f, 21.1394f, 3.41154f, 20.5791f)
            curveTo(2.85124f, 20.0188f, 2.85123f, 19.1104f, 3.41154f, 18.5501f)
            lineTo(3.66075f, 18.3009f)
            curveTo(4.15976f, 17.8018f, 4.49989f, 17.1663f, 4.63827f, 16.4742f)
            lineTo(4.67961f, 16.2675f)
            curveTo(4.6921f, 16.205f, 4.69837f, 16.1736f, 4.70497f, 16.1431f)
            curveTo(4.86518f, 15.4015f, 5.23007f, 14.7197f, 5.75822f, 14.175f)
            curveTo(5.77999f, 14.1526f, 5.80253f, 14.13f, 5.84763f, 14.0849f)
            lineTo(11.5278f, 8.40491f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(11.1675f, 7.79965f)
            lineTo(16.1891f, 12.8213f)
            curveTo(16.7834f, 13.4156f, 17.7469f, 13.4156f, 18.3412f, 12.8213f)
            curveTo(18.9355f, 12.227f, 18.9355f, 11.2635f, 18.3412f, 10.6692f)
            lineTo(13.3196f, 5.64751f)
            curveTo(12.7253f, 5.05321f, 11.7618f, 5.05321f, 11.1675f, 5.64751f)
            curveTo(10.5732f, 6.2418f, 10.5732f, 7.20535f, 11.1675f, 7.79965f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.0655f, 5.86916f)
            lineTo(16.0946f, 3.8401f)
            curveTo(17.2152f, 2.71948f, 19.032f, 2.71948f, 20.1526f, 3.8401f)
            curveTo(21.2732f, 4.96072f, 21.2732f, 6.7776f, 20.1526f, 7.89822f)
            lineTo(18.1236f, 9.92727f)
        }
        }.build()

        return _pipette!!
    }

private var _pipette: ImageVector? = null
