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

val HugeIcons.MailPlus: ImageVector
    get() {
        if (_mailPlus != null) {
            return _mailPlus!!
        }
        _mailPlus = ImageVector.Builder(
            name = "MailPlus",
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
            moveTo(1.99609f, 5.5f)
            lineTo(8.90912f, 9.42462f)
            curveTo(11.4348f, 10.8585f, 12.5574f, 10.8585f, 15.0831f, 9.42462f)
            lineTo(21.9961f, 5.5f)
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
            moveTo(11.4961f, 20f)
            curveTo(11.4961f, 20f, 10.0652f, 19.9878f, 9.09492f, 19.9634f)
            curveTo(5.94643f, 19.8843f, 4.37218f, 19.8448f, 3.24105f, 18.7094f)
            curveTo(2.10992f, 17.5739f, 2.07723f, 16.0412f, 2.01186f, 12.9756f)
            curveTo(1.99084f, 11.9899f, 1.99084f, 11.0101f, 2.01186f, 10.0244f)
            curveTo(2.07723f, 6.95885f, 2.10992f, 5.42608f, 3.24105f, 4.29065f)
            curveTo(4.37218f, 3.15521f, 5.94642f, 3.11566f, 9.09492f, 3.03656f)
            curveTo(11.0354f, 2.98781f, 12.9568f, 2.98781f, 14.8973f, 3.03657f)
            curveTo(18.0458f, 3.11568f, 19.62f, 3.15523f, 20.7511f, 4.29066f)
            curveTo(21.8823f, 5.42609f, 21.915f, 6.95886f, 21.9803f, 10.0244f)
            curveTo(21.9879f, 10.3812f, 21.9928f, 10.9995f, 21.9949f, 11.5f)
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
            moveTo(13.9961f, 17f)
            horizontalLineTo(21.9961f)
            moveTo(17.9961f, 21f)
            lineTo(17.9961f, 13f)
        }
        }.build()

        return _mailPlus!!
    }

private var _mailPlus: ImageVector? = null
