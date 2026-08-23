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

val HugeIcons.MailCheck: ImageVector
    get() {
        if (_mailCheck != null) {
            return _mailCheck!!
        }
        _mailCheck = ImageVector.Builder(
            name = "MailCheck",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(1.99609f, 6f)
            lineTo(8.90912f, 9.91697f)
            curveTo(11.4577f, 11.361f, 12.5345f, 11.361f, 15.0831f, 9.91697f)
            lineTo(21.9961f, 6f)
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
            moveTo(11.9961f, 20.5f)
            curveTo(11.0306f, 20.5f, 10.0652f, 20.4878f, 9.09492f, 20.4634f)
            curveTo(5.94643f, 20.3843f, 4.37218f, 20.3448f, 3.24105f, 19.2094f)
            curveTo(2.10992f, 18.0739f, 2.07723f, 16.5412f, 2.01186f, 13.4756f)
            curveTo(1.99084f, 12.4899f, 1.99084f, 11.5101f, 2.01186f, 10.5244f)
            curveTo(2.07723f, 7.45885f, 2.10992f, 5.92608f, 3.24105f, 4.79065f)
            curveTo(4.37218f, 3.65521f, 5.94642f, 3.61566f, 9.09492f, 3.53656f)
            curveTo(11.0354f, 3.48781f, 12.9568f, 3.48781f, 14.8973f, 3.53657f)
            curveTo(18.0458f, 3.61568f, 19.62f, 3.65523f, 20.7511f, 4.79066f)
            curveTo(21.8823f, 5.92609f, 21.915f, 7.45886f, 21.9803f, 10.5244f)
            curveTo(21.9837f, 10.6831f, 21.9866f, 10.8416f, 21.9888f, 11f)
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
            moveTo(14.9961f, 18.3333f)
            curveTo(14.9961f, 18.3333f, 15.8711f, 18.3333f, 16.7461f, 20f)
            curveTo(16.7461f, 20f, 19.5255f, 15.8333f, 21.9961f, 15f)
        }
        }.build()

        return _mailCheck!!
    }

private var _mailCheck: ImageVector? = null
