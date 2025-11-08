package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlphabetHebrew: ImageVector
    get() {
        if (_alphabetHebrew != null) {
            return _alphabetHebrew!!
        }
        _alphabetHebrew = ImageVector.Builder(
            name = "AlphabetHebrew",
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
        moveTo(5f, 3f)
        curveTo(8.5f, 10.7143f, 14.9167f, 13.2857f, 19f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 15f)
        curveTo(18.7587f, 12.75f, 19f, 8.78846f, 19f, 7f)
        curveTo(19f, 4.33333f, 18.3333f, 3f, 18.3333f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.72689f, 21f)
        curveTo(5.72689f, 21f, 5f, 19.6431f, 5f, 16.9292f)
        curveTo(5f, 15.1701f, 5.24577f, 11.3453f, 8.96186f, 9.02368f)
        }
        }.build()

        return _alphabetHebrew!!
    }

private var _alphabetHebrew: ImageVector? = null
