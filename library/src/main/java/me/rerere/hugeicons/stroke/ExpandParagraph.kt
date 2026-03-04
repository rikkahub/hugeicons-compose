package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ExpandParagraph: ImageVector
    get() {
        if (_expandParagraph != null) {
            return _expandParagraph!!
        }
        _expandParagraph = ImageVector.Builder(
            name = "ExpandParagraph",
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
        moveTo(8f, 6.99998f)
        curveTo(8f, 6.99998f, 5.79053f, 4.00001f, 4.99998f, 4f)
        curveTo(4.20942f, 3.99999f, 2f, 7f, 2f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        horizontalLineTo(22f)
        moveTo(12f, 8f)
        horizontalLineTo(22f)
        moveTo(12f, 16f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 17f)
        curveTo(2f, 17f, 4.20947f, 20f, 5.00002f, 20f)
        curveTo(5.79058f, 20f, 8f, 17f, 8f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 5f)
        verticalLineTo(19f)
        }
        }.build()

        return _expandParagraph!!
    }

private var _expandParagraph: ImageVector? = null
