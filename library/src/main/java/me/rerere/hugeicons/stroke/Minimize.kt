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

val HugeIcons.Minimize: ImageVector
    get() {
        if (_minimize != null) {
            return _minimize!!
        }
        _minimize = ImageVector.Builder(
            name = "Minimize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = SolidColor(Color(0xFF141B34)),
            stroke = null,
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.46186f, 20.4697f)
            curveTo(2.16896f, 20.7626f, 2.16896f, 21.2374f, 2.46186f, 21.5303f)
            curveTo(2.75475f, 21.8232f, 3.22962f, 21.8232f, 3.52252f, 21.5303f)
            lineTo(2.99219f, 21f)
            lineTo(2.46186f, 20.4697f)
            close()
            moveTo(10.0225f, 15.0303f)
            curveTo(10.3154f, 14.7374f, 10.3154f, 14.2626f, 10.0225f, 13.9697f)
            curveTo(9.72962f, 13.6768f, 9.25475f, 13.6768f, 8.96186f, 13.9697f)
            lineTo(9.49219f, 14.5f)
            lineTo(10.0225f, 15.0303f)
            close()
            moveTo(2.99219f, 21f)
            lineTo(3.52252f, 21.5303f)
            lineTo(10.0225f, 15.0303f)
            lineTo(9.49219f, 14.5f)
            lineTo(8.96186f, 13.9697f)
            lineTo(2.46186f, 20.4697f)
            lineTo(2.99219f, 21f)
            close()
        }

        path(
            fill = SolidColor(Color(0xFF141B34)),
            stroke = null,
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21.5225f, 3.53033f)
            curveTo(21.8154f, 3.23744f, 21.8154f, 2.76256f, 21.5225f, 2.46967f)
            curveTo(21.2296f, 2.17678f, 20.7548f, 2.17678f, 20.4619f, 2.46967f)
            lineTo(20.9922f, 3f)
            lineTo(21.5225f, 3.53033f)
            close()
            moveTo(13.9619f, 8.96967f)
            curveTo(13.669f, 9.26256f, 13.669f, 9.73744f, 13.9619f, 10.0303f)
            curveTo(14.2548f, 10.3232f, 14.7296f, 10.3232f, 15.0225f, 10.0303f)
            lineTo(14.4922f, 9.5f)
            lineTo(13.9619f, 8.96967f)
            close()
            moveTo(20.9922f, 3f)
            lineTo(20.4619f, 2.46967f)
            lineTo(13.9619f, 8.96967f)
            lineTo(14.4922f, 9.5f)
            lineTo(15.0225f, 10.0303f)
            lineTo(21.5225f, 3.53033f)
            lineTo(20.9922f, 3f)
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
            moveTo(14.2688f, 5.00098f)
            curveTo(14.2688f, 5.00098f, 13.6464f, 9.10202f, 14.2688f, 9.72438f)
            curveTo(14.8911f, 10.3467f, 18.9922f, 9.72436f, 18.9922f, 9.72436f)
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
            moveTo(9.71561f, 19.001f)
            curveTo(9.71561f, 19.001f, 10.3379f, 14.8999f, 9.71558f, 14.2776f)
            curveTo(9.09323f, 13.6552f, 4.99219f, 14.2776f, 4.99219f, 14.2776f)
        }
        }.build()

        return _minimize!!
    }

private var _minimize: ImageVector? = null
