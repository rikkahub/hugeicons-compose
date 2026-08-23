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

val HugeIcons.Roblox: ImageVector
    get() {
        if (_roblox != null) {
            return _roblox!!
        }
        _roblox = ImageVector.Builder(
            name = "Roblox",
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
            moveTo(19.7142f, 17.0933f)
            lineTo(21.2273f, 11.4461f)
            curveTo(21.9406f, 8.78405f, 22.2973f, 7.453f, 21.6919f, 6.40439f)
            curveTo(21.0865f, 5.35578f, 19.7554f, 4.99913f, 17.0933f, 4.28582f)
            lineTo(11.4461f, 2.77267f)
            curveTo(8.78405f, 2.05936f, 7.45299f, 1.70271f, 6.40439f, 2.30812f)
            curveTo(5.35578f, 2.91353f, 4.99913f, 4.24458f, 4.28582f, 6.90668f)
            lineTo(2.77267f, 12.5539f)
            curveTo(2.05936f, 15.216f, 1.70271f, 16.547f, 2.30812f, 17.5956f)
            curveTo(2.91353f, 18.6442f, 4.24458f, 19.0009f, 6.90668f, 19.7142f)
            lineTo(12.5539f, 21.2273f)
            curveTo(15.216f, 21.9406f, 16.547f, 22.2973f, 17.5956f, 21.6919f)
            curveTo(18.6442f, 21.0865f, 19.0009f, 19.7554f, 19.7142f, 17.0933f)
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
            moveTo(14.3143f, 13.528f)
            lineTo(14.7682f, 11.8338f)
            curveTo(14.9822f, 11.0352f, 15.0892f, 10.6359f, 14.9076f, 10.3213f)
            curveTo(14.7259f, 10.0067f, 14.3266f, 9.89974f, 13.528f, 9.68575f)
            lineTo(11.8338f, 9.2318f)
            curveTo(11.0352f, 9.01781f, 10.6359f, 8.91081f, 10.3213f, 9.09244f)
            curveTo(10.0067f, 9.27406f, 9.89974f, 9.67337f, 9.68575f, 10.472f)
            lineTo(9.2318f, 12.1662f)
            curveTo(9.01781f, 12.9648f, 8.91081f, 13.3641f, 9.09244f, 13.6787f)
            curveTo(9.27406f, 13.9933f, 9.67337f, 14.1003f, 10.472f, 14.3143f)
            lineTo(12.1662f, 14.7682f)
            curveTo(12.9648f, 14.9822f, 13.3641f, 15.0892f, 13.6787f, 14.9076f)
            curveTo(13.9933f, 14.7259f, 14.1003f, 14.3266f, 14.3143f, 13.528f)
            close()
        }
        }.build()

        return _roblox!!
    }

private var _roblox: ImageVector? = null
