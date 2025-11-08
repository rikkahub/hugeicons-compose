package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MailDownload01: ImageVector
    get() {
        if (_mailDownload01 != null) {
            return _mailDownload01!!
        }
        _mailDownload01 = ImageVector.Builder(
            name = "MailDownload01",
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
        moveTo(22f, 11f)
        curveTo(22f, 10.5086f, 21.9947f, 10.0172f, 21.9842f, 9.52439f)
        curveTo(21.9189f, 6.45886f, 21.8862f, 4.92609f, 20.7551f, 3.79066f)
        curveTo(19.6239f, 2.65523f, 18.0497f, 2.61568f, 14.9012f, 2.53657f)
        curveTo(12.9607f, 2.48781f, 11.0393f, 2.48781f, 9.09882f, 2.53656f)
        curveTo(5.95033f, 2.61566f, 4.37608f, 2.65521f, 3.24495f, 3.79065f)
        curveTo(2.11382f, 4.92608f, 2.08114f, 6.45885f, 2.01576f, 9.52438f)
        curveTo(1.99474f, 10.5101f, 1.99475f, 11.4899f, 2.01577f, 12.4756f)
        curveTo(2.08114f, 15.5412f, 2.11383f, 17.0739f, 3.24496f, 18.2094f)
        curveTo(4.37608f, 19.3448f, 5.95033f, 19.3843f, 9.09883f, 19.4634f)
        curveTo(10.5713f, 19.5004f, 12.0328f, 19.5094f, 13.5f, 19.4902f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 5f)
        lineTo(8.91302f, 8.92462f)
        curveTo(11.4387f, 10.3585f, 12.5613f, 10.3585f, 15.087f, 8.92462f)
        lineTo(22f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 19f)
        curveTo(17.4915f, 19.5057f, 18.7998f, 21.5f, 19.5f, 21.5f)
        moveTo(22f, 19f)
        curveTo(21.5085f, 19.5057f, 20.2002f, 21.5f, 19.5f, 21.5f)
        moveTo(19.5f, 21.5f)
        verticalLineTo(13.5f)
        }
        }.build()

        return _mailDownload01!!
    }

private var _mailDownload01: ImageVector? = null
