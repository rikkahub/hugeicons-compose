package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MailMinus01: ImageVector
    get() {
        if (_mailMinus01 != null) {
            return _mailMinus01!!
        }
        _mailMinus01 = ImageVector.Builder(
            name = "MailMinus01",
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
        moveTo(11.5f, 20.4989f)
        curveTo(10.7011f, 20.4954f, 9.90159f, 20.4836f, 9.09883f, 20.4634f)
        curveTo(5.95033f, 20.3843f, 4.37608f, 20.3448f, 3.24496f, 19.2094f)
        curveTo(2.11383f, 18.0739f, 2.08114f, 16.5412f, 2.01577f, 13.4756f)
        curveTo(1.99475f, 12.4899f, 1.99474f, 11.5101f, 2.01576f, 10.5244f)
        curveTo(2.08114f, 7.45885f, 2.11382f, 5.92608f, 3.24495f, 4.79065f)
        curveTo(4.37608f, 3.65521f, 5.95033f, 3.61566f, 9.09882f, 3.53656f)
        curveTo(11.0393f, 3.48781f, 12.9607f, 3.48781f, 14.9012f, 3.53657f)
        curveTo(18.0497f, 3.61568f, 19.6239f, 3.65523f, 20.7551f, 4.79066f)
        curveTo(21.8862f, 5.92609f, 21.9189f, 7.45886f, 21.9842f, 10.5244f)
        curveTo(22.0019f, 11.3514f, 22.0047f, 12.1744f, 21.9928f, 13.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 6f)
        lineTo(8.91302f, 9.92462f)
        curveTo(11.4387f, 11.3585f, 12.5613f, 11.3585f, 15.087f, 9.92462f)
        lineTo(22f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 18.5f)
        horizontalLineTo(22f)
        }
        }.build()

        return _mailMinus01!!
    }

private var _mailMinus01: ImageVector? = null
