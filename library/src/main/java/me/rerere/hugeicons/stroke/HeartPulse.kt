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

val HugeIcons.HeartPulse: ImageVector
    get() {
        if (_heartPulse != null) {
            return _heartPulse!!
        }
        _heartPulse = ImageVector.Builder(
            name = "HeartPulse",
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
            moveTo(10.4107f, 19.9677f)
            curveTo(7.58942f, 17.858f, 2f, 13.0348f, 2f, 8.69444f)
            curveTo(2f, 5.82563f, 4.10526f, 3.5f, 7f, 3.5f)
            curveTo(8.5f, 3.5f, 10f, 4f, 12f, 6f)
            curveTo(14f, 4f, 15.5f, 3.5f, 17f, 3.5f)
            curveTo(19.8947f, 3.5f, 22f, 5.82563f, 22f, 8.69444f)
            curveTo(22f, 13.0348f, 16.4106f, 17.858f, 13.5893f, 19.9677f)
            curveTo(12.6399f, 20.6776f, 11.3601f, 20.6776f, 10.4107f, 19.9677f)
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
            moveTo(20.001f, 13.0001f)
            horizontalLineTo(16.0288f)
            curveTo(15.8168f, 13.0001f, 15.7107f, 13.0001f, 15.619f, 12.9639f)
            curveTo(15.5691f, 12.9442f, 15.5229f, 12.9169f, 15.4821f, 12.8831f)
            curveTo(15.4072f, 12.8209f, 15.3598f, 12.7303f, 15.2649f, 12.5491f)
            curveTo(14.9921f, 12.0278f, 14.8557f, 11.7672f, 14.6597f, 11.7045f)
            curveTo(14.5567f, 11.6716f, 14.4453f, 11.6716f, 14.3422f, 11.7045f)
            curveTo(14.1462f, 11.7672f, 14.0098f, 12.0278f, 13.737f, 12.5491f)
            lineTo(13.1172f, 13.7335f)
            curveTo(12.6442f, 14.6372f, 12.4078f, 15.089f, 12.0706f, 15.0624f)
            curveTo(11.7335f, 15.0357f, 11.578f, 14.5529f, 11.267f, 13.5872f)
            lineTo(10.8024f, 12.1447f)
            curveTo(10.4668f, 11.1027f, 10.299f, 10.5817f, 9.95039f, 10.5639f)
            curveTo(9.60176f, 10.5462f, 9.377f, 11.0472f, 8.92748f, 12.0493f)
            lineTo(8.76073f, 12.4211f)
            curveTo(8.63475f, 12.7019f, 8.57176f, 12.8423f, 8.44652f, 12.9212f)
            curveTo(8.32129f, 13.0001f, 8.16139f, 13.0001f, 7.84158f, 13.0001f)
            horizontalLineTo(4.00098f)
        }
        }.build()

        return _heartPulse!!
    }

private var _heartPulse: ImageVector? = null
