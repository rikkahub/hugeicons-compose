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

val HugeIcons.MailX: ImageVector
    get() {
        if (_mailX != null) {
            return _mailX!!
        }
        _mailX = ImageVector.Builder(
            name = "MailX",
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
            moveTo(1.99609f, 5f)
            lineTo(8.90912f, 8.92462f)
            curveTo(11.4348f, 10.3585f, 12.5574f, 10.3585f, 15.0831f, 8.92462f)
            lineTo(21.9961f, 5f)
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
            moveTo(21.9888f, 11f)
            curveTo(22.0008f, 10.1743f, 21.998f, 10.3514f, 21.9803f, 9.52439f)
            curveTo(21.915f, 6.45886f, 21.8823f, 4.92609f, 20.7511f, 3.79066f)
            curveTo(19.62f, 2.65523f, 18.0458f, 2.61568f, 14.8973f, 2.53657f)
            curveTo(12.9568f, 2.48781f, 11.0354f, 2.48781f, 9.09492f, 2.53656f)
            curveTo(5.94642f, 2.61566f, 4.37218f, 2.65521f, 3.24105f, 3.79065f)
            curveTo(2.10992f, 4.92608f, 2.07723f, 6.45885f, 2.01186f, 9.52438f)
            curveTo(1.99084f, 10.5101f, 1.99084f, 11.4899f, 2.01186f, 12.4756f)
            curveTo(2.07723f, 15.5412f, 2.10992f, 17.0739f, 3.24105f, 18.2094f)
            curveTo(4.37218f, 19.3448f, 5.94643f, 19.3843f, 9.09492f, 19.4634f)
            curveTo(10.0652f, 19.4878f, 10.0306f, 19.5f, 10.9961f, 19.5f)
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
            moveTo(13.9961f, 14.5f)
            lineTo(17.4961f, 18f)
            moveTo(17.4961f, 18f)
            lineTo(20.9961f, 21.5f)
            moveTo(17.4961f, 18f)
            lineTo(13.9961f, 21.5f)
            moveTo(17.4961f, 18f)
            lineTo(20.9961f, 14.5f)
        }
        }.build()

        return _mailX!!
    }

private var _mailX: ImageVector? = null
