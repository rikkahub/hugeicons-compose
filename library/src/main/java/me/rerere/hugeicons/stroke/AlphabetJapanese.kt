package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlphabetJapanese: ImageVector
    get() {
        if (_alphabetJapanese != null) {
            return _alphabetJapanese!!
        }
        _alphabetJapanese = ImageVector.Builder(
            name = "AlphabetJapanese",
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
        moveTo(11.0078f, 3f)
        curveTo(9.5913f, 7f, 7.06961f, 14f, 11.5f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 5.31913f)
        curveTo(6.70588f, 6.19855f, 15.1765f, 6.63826f, 21f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.0034f, 10f)
        curveTo(16.4981f, 13f, 12.5403f, 19.5f, 7.15287f, 19.9565f)
        curveTo(0.934783f, 20.4834f, 4.62421f, 11f, 12.0451f, 11.5f)
        curveTo(18.2926f, 11.921f, 22.0322f, 16.8261f, 15.7923f, 21f)
        }
        }.build()

        return _alphabetJapanese!!
    }

private var _alphabetJapanese: ImageVector? = null
