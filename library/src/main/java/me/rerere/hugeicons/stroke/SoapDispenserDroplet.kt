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

val HugeIcons.SoapDispenserDroplet: ImageVector
    get() {
        if (_soapDispenserDroplet != null) {
            return _soapDispenserDroplet!!
        }
        _soapDispenserDroplet = ImageVector.Builder(
            name = "SoapDispenserDroplet",
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
            strokeLineCap = StrokeCap.Square,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16.4922f, 22f)
            curveTo(18.4252f, 22f, 19.9922f, 20.46f, 19.9922f, 18.5603f)
            curveTo(19.9922f, 17.08f, 18.7217f, 15.4214f, 17.7116f, 14.3367f)
            curveTo(17.1923f, 13.7789f, 16.9326f, 13.5f, 16.4922f, 13.5f)
            curveTo(16.0518f, 13.5f, 15.7921f, 13.7789f, 15.2727f, 14.3367f)
            curveTo(14.2627f, 15.4214f, 12.9922f, 17.08f, 12.9922f, 18.5603f)
            curveTo(12.9922f, 20.46f, 14.5592f, 22f, 16.4922f, 22f)
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
            moveTo(12.9922f, 9.99951f)
            curveTo(12.08f, 8.78534f, 10.6278f, 8f, 8.99219f, 8f)
            curveTo(6.23076f, 8f, 3.99219f, 10.2386f, 3.99219f, 13f)
            verticalLineTo(18f)
            curveTo(3.99219f, 19.8856f, 3.99219f, 20.8284f, 4.57797f, 21.4142f)
            curveTo(5.16376f, 22f, 6.10657f, 22f, 7.99219f, 22f)
            horizontalLineTo(9.99219f)
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
            moveTo(9.99219f, 12.3382f)
            curveTo(8.2746f, 13.0278f, 6.54144f, 14.4797f, 3.99219f, 13.8418f)
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
            moveTo(6.99219f, 8f)
            verticalLineTo(7f)
            curveTo(6.99219f, 6.05719f, 6.99219f, 5.58579f, 7.28508f, 5.29289f)
            curveTo(7.57797f, 5f, 8.04938f, 5f, 8.99219f, 5f)
            curveTo(9.935f, 5f, 10.4064f, 5f, 10.6993f, 5.29289f)
            curveTo(10.9922f, 5.58579f, 10.9922f, 6.05719f, 10.9922f, 7f)
            verticalLineTo(8f)
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
            moveTo(8.99219f, 5f)
            verticalLineTo(2f)
            moveTo(8.99219f, 2f)
            horizontalLineTo(6.99219f)
            moveTo(8.99219f, 2f)
            horizontalLineTo(12.4151f)
            curveTo(13.4039f, 2f, 14.2415f, 2.39009f, 14.9922f, 3f)
        }
        }.build()

        return _soapDispenserDroplet!!
    }

private var _soapDispenserDroplet: ImageVector? = null
