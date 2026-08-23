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

val HugeIcons.RadioReceiver: ImageVector
    get() {
        if (_radioReceiver != null) {
            return _radioReceiver!!
        }
        _radioReceiver = ImageVector.Builder(
            name = "RadioReceiver",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17.9922f, 13.5f)
            arcTo(3.5f, 3.5f, 0f, true, false, 10.9922f, 13.5f)
            arcTo(3.5f, 3.5f, 0f, true, false, 17.9922f, 13.5f)
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
            moveTo(1.99219f, 13.5f)
            curveTo(1.99219f, 9.74142f, 1.99219f, 7.86213f, 3.04499f, 6.60746f)
            curveTo(3.21338f, 6.40678f, 3.39897f, 6.22119f, 3.59964f, 6.0528f)
            curveTo(4.85432f, 5f, 6.73361f, 5f, 10.4922f, 5f)
            horizontalLineTo(13.4922f)
            curveTo(17.2508f, 5f, 19.1301f, 5f, 20.3847f, 6.0528f)
            curveTo(20.5854f, 6.22119f, 20.771f, 6.40678f, 20.9394f, 6.60746f)
            curveTo(21.9922f, 7.86213f, 21.9922f, 9.74142f, 21.9922f, 13.5f)
            curveTo(21.9922f, 17.2586f, 21.9922f, 19.1379f, 20.9394f, 20.3925f)
            curveTo(20.771f, 20.5932f, 20.5854f, 20.7788f, 20.3847f, 20.9472f)
            curveTo(19.1301f, 22f, 17.2508f, 22f, 13.4922f, 22f)
            horizontalLineTo(10.4922f)
            curveTo(6.73361f, 22f, 4.85432f, 22f, 3.59964f, 20.9472f)
            curveTo(3.39897f, 20.7788f, 3.21338f, 20.5932f, 3.04499f, 20.3925f)
            curveTo(1.99219f, 19.1379f, 1.99219f, 17.2586f, 1.99219f, 13.5f)
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
            moveTo(9.99219f, 5f)
            lineTo(13.9922f, 2f)
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
            moveTo(5.99219f, 12f)
            horizontalLineTo(6.99219f)
            moveTo(5.99219f, 15f)
            horizontalLineTo(6.99219f)
        }
        }.build()

        return _radioReceiver!!
    }

private var _radioReceiver: ImageVector? = null
