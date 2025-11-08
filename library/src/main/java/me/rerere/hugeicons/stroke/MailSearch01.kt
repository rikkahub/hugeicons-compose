package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MailSearch01: ImageVector
    get() {
        if (_mailSearch01 != null) {
            return _mailSearch01!!
        }
        _mailSearch01 = ImageVector.Builder(
            name = "MailSearch01",
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
        moveTo(11f, 19.4634f)
        curveTo(10.2011f, 19.46f, 9.90159f, 19.4836f, 9.09883f, 19.4634f)
        curveTo(5.95033f, 19.3843f, 4.37608f, 19.3448f, 3.24496f, 18.2094f)
        curveTo(2.11383f, 17.0739f, 2.08114f, 15.5412f, 2.01577f, 12.4756f)
        curveTo(1.99475f, 11.4899f, 1.99474f, 10.5101f, 2.01576f, 9.52438f)
        curveTo(2.08114f, 6.45885f, 2.11382f, 4.92608f, 3.24495f, 3.79065f)
        curveTo(4.37608f, 2.65521f, 5.95033f, 2.61566f, 9.09882f, 2.53656f)
        curveTo(11.0393f, 2.48781f, 12.9607f, 2.48781f, 14.9012f, 2.53657f)
        curveTo(18.0497f, 2.61568f, 19.6239f, 2.65523f, 20.7551f, 3.79066f)
        curveTo(21.8862f, 4.92609f, 21.9189f, 6.45886f, 21.9842f, 9.52439f)
        curveTo(21.9983f, 10.1829f, 22f, 10.8414f, 22f, 11.5f)
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
        moveTo(20.017f, 19.5233f)
        lineTo(22f, 21.5f)
        moveTo(21.0531f, 17.0265f)
        curveTo(21.0531f, 15.0789f, 19.4742f, 13.5f, 17.5265f, 13.5f)
        curveTo(15.5789f, 13.5f, 14f, 15.0789f, 14f, 17.0265f)
        curveTo(14f, 18.9742f, 15.5789f, 20.5531f, 17.5265f, 20.5531f)
        curveTo(19.4742f, 20.5531f, 21.0531f, 18.9742f, 21.0531f, 17.0265f)
        }
        }.build()

        return _mailSearch01!!
    }

private var _mailSearch01: ImageVector? = null
