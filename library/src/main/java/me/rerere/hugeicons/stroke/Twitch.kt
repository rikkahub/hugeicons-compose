package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Twitch: ImageVector
    get() {
        if (_twitch != null) {
            return _twitch!!
        }
        _twitch = ImageVector.Builder(
            name = "Twitch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 7f)
        verticalLineTo(11f)
        moveTo(12f, 7f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 3f)
        horizontalLineTo(8f)
        curveTo(6.11438f, 3f, 5.17157f, 3f, 4.58579f, 3.58358f)
        curveTo(4f, 4.16716f, 4f, 5.10641f, 4f, 6.98492f)
        verticalLineTo(13.56f)
        curveTo(4f, 13.9302f, 4f, 14.1153f, 4.02462f, 14.2702f)
        curveTo(4.16017f, 15.1228f, 4.83135f, 15.7914f, 5.68713f, 15.9265f)
        curveTo(5.8426f, 15.951f, 6.0284f, 15.951f, 6.4f, 15.951f)
        curveTo(6.4929f, 15.951f, 6.53935f, 15.951f, 6.57822f, 15.9571f)
        curveTo(6.79216f, 15.9909f, 6.95996f, 16.158f, 6.99384f, 16.3712f)
        curveTo(7f, 16.4099f, 7f, 16.4562f, 7f, 16.5487f)
        verticalLineTo(18.0921f)
        curveTo(7f, 19.2742f, 7f, 19.8653f, 7.3345f, 19.9822f)
        curveTo(7.66899f, 20.0991f, 8.03962f, 19.6375f, 8.78087f, 18.7144f)
        lineTo(10.6998f, 16.3249f)
        curveTo(10.8473f, 16.1412f, 10.921f, 16.0493f, 11.0237f, 16.0002f)
        curveTo(11.1264f, 15.951f, 11.2445f, 15.951f, 11.4806f, 15.951f)
        horizontalLineTo(15.3431f)
        curveTo(16.1606f, 15.951f, 16.5694f, 15.951f, 16.9369f, 15.7993f)
        curveTo(17.3045f, 15.6477f, 17.5935f, 15.3597f, 18.1716f, 14.7838f)
        lineTo(18.8284f, 14.1295f)
        curveTo(19.4065f, 13.5536f, 19.6955f, 13.2656f, 19.8478f, 12.8995f)
        curveTo(20f, 12.5333f, 20f, 12.1261f, 20f, 11.3117f)
        verticalLineTo(6.98492f)
        curveTo(20f, 5.10641f, 20f, 4.16716f, 19.4142f, 3.58358f)
        curveTo(18.8284f, 3f, 17.8856f, 3f, 16f, 3f)
        }
        }.build()

        return _twitch!!
    }

private var _twitch: ImageVector? = null
