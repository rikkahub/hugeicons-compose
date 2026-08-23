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

val HugeIcons.PaintbrushVertical: ImageVector
    get() {
        if (_paintbrushVertical != null) {
            return _paintbrushVertical!!
        }
        _paintbrushVertical = ImageVector.Builder(
            name = "PaintbrushVertical",
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
            moveTo(17.4928f, 9.89604f)
            verticalLineTo(6.00098f)
            curveTo(17.4928f, 4.11536f, 17.4928f, 3.17255f, 16.907f, 2.58676f)
            curveTo(16.3212f, 2.00098f, 15.3784f, 2.00098f, 13.4928f, 2.00098f)
            horizontalLineTo(10.4928f)
            curveTo(8.6072f, 2.00098f, 7.66439f, 2.00098f, 7.07861f, 2.58676f)
            curveTo(6.49282f, 3.17255f, 6.49282f, 4.11536f, 6.49282f, 6.00097f)
            verticalLineTo(9.89604f)
        }

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
            moveTo(14.3287f, 19.5069f)
            curveTo(14.4174f, 20.8573f, 13.346f, 22.0014f, 11.9927f, 22.0014f)
            curveTo(10.6393f, 22.0014f, 9.56789f, 20.8572f, 9.65671f, 19.5067f)
            lineTo(9.88743f, 15.9988f)
            curveTo(9.93415f, 15.2886f, 9.9575f, 14.9335f, 9.78977f, 14.6616f)
            curveTo(9.75808f, 14.6102f, 9.72181f, 14.5618f, 9.6814f, 14.517f)
            curveTo(9.46748f, 14.2797f, 9.12007f, 14.2025f, 8.42525f, 14.0481f)
            lineTo(7.59757f, 13.8642f)
            curveTo(7.0865f, 13.7506f, 6.83096f, 13.6938f, 6.62078f, 13.592f)
            curveTo(6.07964f, 13.3298f, 5.68519f, 12.8381f, 5.54664f, 12.253f)
            curveTo(5.49282f, 12.0257f, 5.49282f, 11.7639f, 5.49282f, 11.2404f)
            curveTo(5.49282f, 10.9205f, 5.49282f, 10.7606f, 5.52908f, 10.6297f)
            curveTo(5.62283f, 10.2911f, 5.88739f, 10.0265f, 6.22599f, 9.93274f)
            curveTo(6.35694f, 9.89648f, 6.51687f, 9.89648f, 6.83673f, 9.89648f)
            horizontalLineTo(17.1489f)
            curveTo(17.4688f, 9.89648f, 17.6287f, 9.89648f, 17.7597f, 9.93274f)
            curveTo(18.0983f, 10.0265f, 18.3628f, 10.2911f, 18.4566f, 10.6297f)
            curveTo(18.4928f, 10.7606f, 18.4928f, 10.9205f, 18.4928f, 11.2404f)
            curveTo(18.4928f, 11.7639f, 18.4928f, 12.0257f, 18.439f, 12.253f)
            curveTo(18.3005f, 12.8381f, 17.906f, 13.3298f, 17.3649f, 13.592f)
            curveTo(17.1547f, 13.6938f, 16.8991f, 13.7506f, 16.3881f, 13.8642f)
            lineTo(15.5603f, 14.0481f)
            curveTo(14.8655f, 14.2025f, 14.5181f, 14.2798f, 14.3042f, 14.517f)
            curveTo(14.2638f, 14.5618f, 14.2275f, 14.6102f, 14.1959f, 14.6615f)
            curveTo(14.0281f, 14.9334f, 14.0514f, 15.2886f, 14.0981f, 15.9988f)
            lineTo(14.3287f, 19.5069f)
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
            moveTo(9.99282f, 2.00098f)
            verticalLineTo(4.50098f)
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
            moveTo(13.9928f, 2.00098f)
            verticalLineTo(6.00098f)
        }
        }.build()

        return _paintbrushVertical!!
    }

private var _paintbrushVertical: ImageVector? = null
