package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MailSecure02: ImageVector
    get() {
        if (_mailSecure02 != null) {
            return _mailSecure02!!
        }
        _mailSecure02 = ImageVector.Builder(
            name = "MailSecure02",
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
        moveTo(7f, 7.5f)
        lineTo(9.94202f, 9.23943f)
        curveTo(11.6572f, 10.2535f, 12.3428f, 10.2535f, 14.058f, 9.23943f)
        lineTo(17f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 19.5f)
        curveTo(12.5f, 19.5f, 10.0691f, 19.4878f, 9.09883f, 19.4634f)
        curveTo(5.95033f, 19.3843f, 4.37608f, 19.3448f, 3.24496f, 18.2094f)
        curveTo(2.11383f, 17.0739f, 2.08114f, 15.5412f, 2.01577f, 12.4756f)
        curveTo(1.99475f, 11.4899f, 1.99474f, 10.5101f, 2.01576f, 9.52438f)
        curveTo(2.08114f, 6.45885f, 2.11382f, 4.92608f, 3.24495f, 3.79065f)
        curveTo(4.37608f, 2.65521f, 5.95033f, 2.61566f, 9.09882f, 2.53656f)
        curveTo(11.0393f, 2.48781f, 12.9607f, 2.48781f, 14.9012f, 2.53657f)
        curveTo(18.0497f, 2.61568f, 19.6239f, 2.65523f, 20.7551f, 3.79066f)
        curveTo(21.8862f, 4.92609f, 21.9189f, 6.45886f, 21.9842f, 9.52439f)
        curveTo(21.9947f, 10.0172f, 22f, 11.0086f, 22f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 17f)
        verticalLineTo(14.5f)
        curveTo(20f, 14.5f, 18.5f, 13.5f, 18.5f, 13.5f)
        curveTo(18.5f, 13.5f, 17f, 14.5f, 15f, 14.5f)
        verticalLineTo(17f)
        curveTo(15f, 20.5f, 18.5f, 21.5f, 18.5f, 21.5f)
        curveTo(18.5f, 21.5f, 22f, 20.5f, 22f, 17f)
        }
        }.build()

        return _mailSecure02!!
    }

private var _mailSecure02: ImageVector? = null
