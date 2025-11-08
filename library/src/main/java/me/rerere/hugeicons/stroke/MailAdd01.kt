package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MailAdd01: ImageVector
    get() {
        if (_mailAdd01 != null) {
            return _mailAdd01!!
        }
        _mailAdd01 = ImageVector.Builder(
            name = "MailAdd01",
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
        moveTo(2f, 5.5f)
        lineTo(8.91302f, 9.42462f)
        curveTo(11.4387f, 10.8585f, 12.5613f, 10.8585f, 15.087f, 9.42462f)
        lineTo(22f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 20f)
        curveTo(11.5f, 20f, 10.0691f, 19.9878f, 9.09883f, 19.9634f)
        curveTo(5.95033f, 19.8843f, 4.37608f, 19.8448f, 3.24496f, 18.7094f)
        curveTo(2.11383f, 17.5739f, 2.08114f, 16.0412f, 2.01577f, 12.9756f)
        curveTo(1.99475f, 11.9899f, 1.99474f, 11.0101f, 2.01576f, 10.0244f)
        curveTo(2.08114f, 6.95885f, 2.11382f, 5.42608f, 3.24495f, 4.29065f)
        curveTo(4.37608f, 3.15521f, 5.95033f, 3.11566f, 9.09882f, 3.03656f)
        curveTo(11.0393f, 2.98781f, 12.9607f, 2.98781f, 14.9012f, 3.03657f)
        curveTo(18.0497f, 3.11568f, 19.6239f, 3.15523f, 20.7551f, 4.29066f)
        curveTo(21.8862f, 5.42609f, 21.9189f, 6.95886f, 21.9842f, 10.0244f)
        curveTo(21.9918f, 10.3812f, 21.9967f, 10.9995f, 21.9988f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 17f)
        horizontalLineTo(22f)
        moveTo(18f, 21f)
        lineTo(18f, 13f)
        }
        }.build()

        return _mailAdd01!!
    }

private var _mailAdd01: ImageVector? = null
