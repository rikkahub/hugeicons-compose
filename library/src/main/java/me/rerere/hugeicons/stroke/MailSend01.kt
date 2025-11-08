package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MailSend01: ImageVector
    get() {
        if (_mailSend01 != null) {
            return _mailSend01!!
        }
        _mailSend01 = ImageVector.Builder(
            name = "MailSend01",
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
        moveTo(22f, 12.5001f)
        curveTo(22f, 12.0087f, 21.9947f, 11.0172f, 21.9842f, 10.5244f)
        curveTo(21.9189f, 7.45886f, 21.8862f, 5.92609f, 20.7551f, 4.79066f)
        curveTo(19.6239f, 3.65523f, 18.0497f, 3.61568f, 14.9012f, 3.53657f)
        curveTo(12.9607f, 3.48781f, 11.0393f, 3.48781f, 9.09882f, 3.53656f)
        curveTo(5.95033f, 3.61566f, 4.37608f, 3.65521f, 3.24495f, 4.79065f)
        curveTo(2.11382f, 5.92608f, 2.08114f, 7.45885f, 2.01576f, 10.5244f)
        curveTo(1.99474f, 11.5101f, 1.99475f, 12.4899f, 2.01577f, 13.4756f)
        curveTo(2.08114f, 16.5412f, 2.11383f, 18.0739f, 3.24496f, 19.2094f)
        curveTo(4.37608f, 20.3448f, 5.95033f, 20.3843f, 9.09883f, 20.4634f)
        curveTo(9.90159f, 20.4836f, 10.7011f, 20.4954f, 11.5f, 20.4989f)
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
        moveTo(22f, 17.5f)
        lineTo(14f, 17.5f)
        moveTo(22f, 17.5f)
        curveTo(22f, 16.7998f, 20.0057f, 15.4915f, 19.5f, 15f)
        moveTo(22f, 17.5f)
        curveTo(22f, 18.2002f, 20.0057f, 19.5085f, 19.5f, 20f)
        }
        }.build()

        return _mailSend01!!
    }

private var _mailSend01: ImageVector? = null
