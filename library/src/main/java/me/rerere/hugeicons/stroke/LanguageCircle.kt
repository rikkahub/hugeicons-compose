package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LanguageCircle: ImageVector
    get() {
        if (_languageCircle != null) {
            return _languageCircle!!
        }
        _languageCircle = ImageVector.Builder(
            name = "LanguageCircle",
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
        moveTo(7f, 8.37931f)
        horizontalLineTo(11.5f)
        moveTo(17f, 8.37931f)
        horizontalLineTo(14.5f)
        moveTo(11.5f, 8.37931f)
        horizontalLineTo(14.5f)
        moveTo(11.5f, 8.37931f)
        verticalLineTo(7f)
        moveTo(14.5f, 8.37931f)
        curveTo(13.9725f, 10.2656f, 12.8679f, 12.0487f, 11.6071f, 13.6158f)
        moveTo(8.39286f, 17f)
        curveTo(9.41205f, 16.0628f, 10.5631f, 14.9134f, 11.6071f, 13.6158f)
        moveTo(11.6071f, 13.6158f)
        curveTo(10.9643f, 12.8621f, 10.0643f, 11.6426f, 9.80714f, 11.0909f)
        moveTo(11.6071f, 13.6158f)
        lineTo(13.5357f, 15.6207f)
        }
        }.build()

        return _languageCircle!!
    }

private var _languageCircle: ImageVector? = null
