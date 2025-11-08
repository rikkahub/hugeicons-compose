package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CinnamonRoll: ImageVector
    get() {
        if (_cinnamonRoll != null) {
            return _cinnamonRoll!!
        }
        _cinnamonRoll = ImageVector.Builder(
            name = "CinnamonRoll",
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
        moveTo(22f, 9f)
        curveTo(22f, 12.3137f, 17.5228f, 15f, 12f, 15f)
        curveTo(6.47715f, 15f, 2f, 12.3137f, 2f, 9f)
        curveTo(2f, 5.68629f, 6.47715f, 3f, 12f, 3f)
        curveTo(17.5228f, 3f, 22f, 5.68629f, 22f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6.85441f)
        curveTo(15f, 5.44094f, 17f, 7.71729f, 17f, 8.7817f)
        curveTo(17f, 11.9514f, 7f, 11.7874f, 7f, 7.88187f)
        curveTo(7f, 5.49755f, 9f, 3f, 12f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 9f)
        verticalLineTo(15f)
        curveTo(22f, 18.3137f, 17.5228f, 21f, 12f, 21f)
        curveTo(6.47715f, 21f, 2f, 18.3137f, 2f, 15f)
        verticalLineTo(9f)
        }
        }.build()

        return _cinnamonRoll!!
    }

private var _cinnamonRoll: ImageVector? = null
