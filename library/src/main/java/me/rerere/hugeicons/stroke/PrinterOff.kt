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

val HugeIcons.PrinterOff: ImageVector
    get() {
        if (_printerOff != null) {
            return _printerOff!!
        }
        _printerOff = ImageVector.Builder(
            name = "PrinterOff",
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
            moveTo(7f, 17f)
            horizontalLineTo(5.33333f)
            curveTo(4.08718f, 17f, 3.4641f, 17f, 3f, 16.7321f)
            curveTo(2.69596f, 16.5565f, 2.44349f, 16.304f, 2.26795f, 16f)
            curveTo(2f, 15.5359f, 2f, 14.9128f, 2f, 13.6667f)
            curveTo(2f, 11.1744f, 2f, 9.9282f, 2.5359f, 9f)
            curveTo(2.88697f, 8.39192f, 3.39192f, 7.88697f, 4f, 7.5359f)
            curveTo(4.69486f, 7.13472f, 5.56789f, 7.03387f, 7.00851f, 7.00851f)
            moveTo(11f, 7f)
            horizontalLineTo(15.3333f)
            curveTo(17.8256f, 7f, 19.0718f, 7f, 20f, 7.5359f)
            curveTo(20.6081f, 7.88697f, 21.113f, 8.39192f, 21.4641f, 9f)
            curveTo(22f, 9.9282f, 22f, 11.1744f, 22f, 13.6667f)
            curveTo(22f, 14.9128f, 22f, 15.5359f, 21.732f, 16f)
            curveTo(21.5565f, 16.304f, 21.304f, 16.5565f, 21f, 16.7321f)
            curveTo(20.9426f, 16.7652f, 20.8828f, 16.7942f, 20.8197f, 16.8197f)
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
            moveTo(16.9995f, 7f)
            verticalLineTo(5f)
            curveTo(16.9995f, 3.58579f, 16.9995f, 2.87868f, 16.5602f, 2.43934f)
            curveTo(16.1209f, 2f, 15.4137f, 2f, 13.9995f, 2f)
            horizontalLineTo(9.99954f)
            curveTo(8.58532f, 2f, 7.87822f, 2f, 7.43888f, 2.43934f)
            curveTo(7.26785f, 2.61037f, 7.1634f, 2.82197f, 7.09961f, 3.10007f)
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
            moveTo(17f, 17f)
            verticalLineTo(19f)
            curveTo(17f, 20.4142f, 17f, 21.1213f, 16.5607f, 21.5607f)
            curveTo(16.1213f, 22f, 15.4142f, 22f, 14f, 22f)
            horizontalLineTo(10f)
            curveTo(8.58579f, 22f, 7.87868f, 22f, 7.43934f, 21.5607f)
            curveTo(7f, 21.1213f, 7f, 20.4142f, 7f, 19f)
            verticalLineTo(14f)
            horizontalLineTo(14f)
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
            moveTo(18.875f, 10.25f)
            horizontalLineTo(18.75f)
            moveTo(19f, 10.25f)
            curveTo(19f, 10.3881f, 18.8881f, 10.5f, 18.75f, 10.5f)
            curveTo(18.6119f, 10.5f, 18.5f, 10.3881f, 18.5f, 10.25f)
            curveTo(18.5f, 10.1119f, 18.6119f, 10f, 18.75f, 10f)
            curveTo(18.8881f, 10f, 19f, 10.1119f, 19f, 10.25f)
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
            moveTo(2f, 2f)
            lineTo(22f, 22f)
        }
        }.build()

        return _printerOff!!
    }

private var _printerOff: ImageVector? = null
