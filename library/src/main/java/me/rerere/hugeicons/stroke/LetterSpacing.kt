package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LetterSpacing: ImageVector
    get() {
        if (_letterSpacing != null) {
            return _letterSpacing!!
        }
        _letterSpacing = ImageVector.Builder(
            name = "LetterSpacing",
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
        moveTo(2f, 22f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 22f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 18f)
        lineTo(10.6534f, 7.48635f)
        curveTo(10.9447f, 6.81279f, 11.4878f, 5.99657f, 11.9467f, 6.00001f)
        curveTo(12.6263f, 6.00511f, 12.9827f, 6.70758f, 13.3774f, 7.48635f)
        curveTo(13.7721f, 8.26513f, 17f, 18f, 17f, 18f)
        moveTo(9.01312f, 12.9912f)
        lineTo(14.8945f, 12.9293f)
        }
        }.build()

        return _letterSpacing!!
    }

private var _letterSpacing: ImageVector? = null
