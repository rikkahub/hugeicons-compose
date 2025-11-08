package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareArrowShrink02: ImageVector
    get() {
        if (_squareArrowShrink02 != null) {
            return _squareArrowShrink02!!
        }
        _squareArrowShrink02 = ImageVector.Builder(
            name = "SquareArrowShrink02",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.9833f, 11.0167f)
        curveTo(12.4085f, 10.4419f, 12.5041f, 8f, 12.5041f, 8f)
        moveTo(12.9833f, 11.0167f)
        curveTo(13.5581f, 11.5915f, 16f, 11.4958f, 16f, 11.4958f)
        moveTo(12.9833f, 11.0167f)
        lineTo(17f, 7f)
        moveTo(11.0131f, 12.9868f)
        curveTo(10.4383f, 12.412f, 7.99641f, 12.5077f, 7.99641f, 12.5077f)
        moveTo(11.0131f, 12.9868f)
        curveTo(11.5879f, 13.5616f, 11.4922f, 16.0035f, 11.4922f, 16.0035f)
        moveTo(11.0131f, 12.9868f)
        lineTo(7f, 16.9999f)
        }
        }.build()

        return _squareArrowShrink02!!
    }

private var _squareArrowShrink02: ImageVector? = null
