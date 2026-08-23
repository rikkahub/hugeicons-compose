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

val HugeIcons.GoogleGemini: ImageVector
    get() {
        if (_googleGemini != null) {
            return _googleGemini!!
        }
        _googleGemini = ImageVector.Builder(
            name = "GoogleGemini",
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
            moveTo(3f, 12f)
            curveTo(7.97056f, 12f, 12f, 7.97056f, 12f, 3f)
            curveTo(12f, 7.97056f, 16.0294f, 12f, 21f, 12f)
            curveTo(16.0294f, 12f, 12f, 16.0294f, 12f, 21f)
            curveTo(12f, 16.0294f, 7.97056f, 12f, 3f, 12f)
            close()
        }
        }.build()

        return _googleGemini!!
    }

private var _googleGemini: ImageVector? = null
