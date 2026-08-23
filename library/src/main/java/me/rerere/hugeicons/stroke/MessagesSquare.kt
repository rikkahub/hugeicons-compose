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

val HugeIcons.MessagesSquare: ImageVector
    get() {
        if (_messagesSquare != null) {
            return _messagesSquare!!
        }
        _messagesSquare = ImageVector.Builder(
            name = "MessagesSquare",
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
            moveTo(1.99609f, 8.73684f)
            curveTo(1.99609f, 8.08776f, 2.00754f, 7.45414f, 2.02932f, 6.84236f)
            curveTo(2.10049f, 4.84365f, 2.13608f, 3.84429f, 2.95665f, 3.02522f)
            curveTo(3.77722f, 2.20616f, 4.81444f, 2.16219f, 6.88886f, 2.07426f)
            curveTo(8.02699f, 2.02602f, 9.23886f, 2f, 10.4961f, 2f)
            curveTo(11.7533f, 2f, 12.9652f, 2.02602f, 14.1033f, 2.07426f)
            curveTo(16.1778f, 2.16219f, 17.215f, 2.20616f, 18.0355f, 3.02522f)
            curveTo(18.8561f, 3.84429f, 18.8917f, 4.84365f, 18.9629f, 6.84236f)
            curveTo(18.9846f, 7.45414f, 18.9961f, 8.08776f, 18.9961f, 8.73684f)
            curveTo(18.9961f, 9.38592f, 18.9846f, 10.0195f, 18.9629f, 10.6313f)
            curveTo(18.8917f, 12.63f, 18.8561f, 13.6294f, 18.0355f, 14.4485f)
            curveTo(17.215f, 15.2675f, 16.1777f, 15.3115f, 14.1032f, 15.3994f)
            curveTo(13.4794f, 15.4259f, 12.8335f, 15.4456f, 12.17f, 15.4581f)
            curveTo(11.54f, 15.4699f, 11.225f, 15.4758f, 10.9483f, 15.5803f)
            curveTo(10.6715f, 15.6847f, 10.4387f, 15.8825f, 9.97295f, 16.2782f)
            lineTo(8.12037f, 17.8519f)
            curveTo(8.00791f, 17.9475f, 7.86466f, 18f, 7.71652f, 18f)
            curveTo(7.37387f, 18f, 7.09609f, 17.7248f, 7.09609f, 17.3853f)
            verticalLineTo(15.4079f)
            curveTo(7.02675f, 15.4052f, 6.95767f, 15.4023f, 6.88886f, 15.3994f)
            curveTo(4.81443f, 15.3115f, 3.77722f, 15.2675f, 2.95665f, 14.4485f)
            curveTo(2.13608f, 13.6294f, 2.10049f, 12.63f, 2.02932f, 10.6313f)
            curveTo(2.00754f, 10.0195f, 1.99609f, 9.38592f, 1.99609f, 8.73684f)
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
            moveTo(13.0439f, 19.5803f)
            curveTo(13.3206f, 19.6847f, 13.5535f, 19.8825f, 14.0192f, 20.2782f)
            lineTo(15.8718f, 21.8519f)
            curveTo(15.9843f, 21.9475f, 16.1275f, 22f, 16.2757f, 22f)
            curveTo(16.6183f, 22f, 16.8961f, 21.7248f, 16.8961f, 21.3853f)
            verticalLineTo(19.4079f)
            curveTo(16.9654f, 19.4052f, 17.0345f, 19.4023f, 17.1033f, 19.3994f)
            curveTo(19.1778f, 19.3115f, 20.215f, 19.2675f, 21.0355f, 18.4485f)
            curveTo(21.8561f, 17.6294f, 21.8917f, 16.63f, 21.9629f, 14.6313f)
            curveTo(21.9846f, 14.0195f, 21.9961f, 13.3859f, 21.9961f, 12.7368f)
            curveTo(21.9961f, 12.0878f, 21.9846f, 11.4541f, 21.9629f, 10.8424f)
            curveTo(21.9367f, 10.1064f, 21.9153f, 9.50588f, 21.8577f, 9f)
        }
        }.build()

        return _messagesSquare!!
    }

private var _messagesSquare: ImageVector? = null
