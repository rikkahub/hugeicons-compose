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

val HugeIcons.MapPinSearch: ImageVector
    get() {
        if (_mapPinSearch != null) {
            return _mapPinSearch!!
        }
        _mapPinSearch = ImageVector.Builder(
            name = "MapPinSearch",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.9961f, 9.19621f)
            curveTo(14.3836f, 8.17979f, 13.2693f, 7.5f, 11.9961f, 7.5f)
            curveTo(10.0631f, 7.5f, 8.49609f, 9.067f, 8.49609f, 11f)
            curveTo(8.49609f, 12.2732f, 9.17588f, 13.3876f, 10.1923f, 14f)
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
            moveTo(20.9961f, 20.5f)
            lineTo(18.849f, 18.3529f)
            moveTo(18.849f, 18.3529f)
            curveTo(18.9636f, 18.2384f, 19.07f, 18.1158f, 19.1675f, 17.986f)
            curveTo(19.5981f, 17.413f, 19.8532f, 16.7006f, 19.8532f, 15.9286f)
            curveTo(19.8532f, 14.035f, 18.3182f, 12.5f, 16.4247f, 12.5f)
            curveTo(14.5311f, 12.5f, 12.9961f, 14.035f, 12.9961f, 15.9286f)
            curveTo(12.9961f, 17.8221f, 14.5311f, 19.3571f, 16.4247f, 19.3571f)
            curveTo(17.3714f, 19.3571f, 18.2286f, 18.9734f, 18.849f, 18.3529f)
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
            moveTo(20.983f, 11f)
            curveTo(21.0565f, 9.86816f, 20.8623f, 8.66581f, 20.3121f, 7.37966f)
            curveTo(18.9087f, 4.09916f, 15.54f, 2f, 11.9972f, 2f)
            curveTo(8.45444f, 2f, 5.08573f, 4.09916f, 3.68236f, 7.37966f)
            curveTo(1.08686f, 13.4469f, 6.40912f, 17.626f, 10.3806f, 21.367f)
            curveTo(10.8143f, 21.773f, 11.3939f, 22f, 11.9972f, 22f)
        }
        }.build()

        return _mapPinSearch!!
    }

private var _mapPinSearch: ImageVector? = null
