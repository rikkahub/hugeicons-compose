package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
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
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 12f)
        curveTo(7.97056f, 12f, 12f, 7.97056f, 12f, 3f)
        curveTo(12f, 7.97056f, 16.0294f, 12f, 21f, 12f)
        curveTo(16.0294f, 12f, 12f, 16.0294f, 12f, 21f)
        curveTo(12f, 16.0294f, 7.97056f, 12f, 3f, 12f)
        }
        }.build()

        return _googleGemini!!
    }

private var _googleGemini: ImageVector? = null
