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

val HugeIcons.SpellCheck: ImageVector
    get() {
        if (_spellCheck != null) {
            return _spellCheck!!
        }
        _spellCheck = ImageVector.Builder(
            name = "SpellCheck",
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
            moveTo(5.99219f, 13f)
            horizontalLineTo(14.9922f)
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
            moveTo(15.9922f, 14.8567f)
            lineTo(13.3817f, 7.82442f)
            curveTo(12.1874f, 4.60709f, 11.5902f, 2.99842f, 10.5508f, 3f)
            curveTo(9.51135f, 3.00158f, 8.91872f, 4.61206f, 7.73347f, 7.83302f)
            lineTo(3.99219f, 18f)
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
            moveTo(13.9922f, 19.3929f)
            curveTo(13.9922f, 19.3929f, 15.1922f, 20.0447f, 15.7922f, 21f)
            curveTo(15.7922f, 21f, 17.5922f, 17.25f, 19.9922f, 16f)
        }
        }.build()

        return _spellCheck!!
    }

private var _spellCheck: ImageVector? = null
