package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Paragraph: ImageVector
    get() {
        if (_paragraph != null) {
            return _paragraph!!
        }
        _paragraph = ImageVector.Builder(
            name = "Paragraph",
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
        moveTo(15f, 3f)
        verticalLineTo(21f)
        moveTo(15f, 3f)
        horizontalLineTo(10f)
        moveTo(15f, 3f)
        horizontalLineTo(21f)
        moveTo(10f, 12f)
        horizontalLineTo(7.5f)
        curveTo(5.01472f, 12f, 3f, 9.98528f, 3f, 7.5f)
        curveTo(3f, 5.01472f, 5.01472f, 3f, 7.5f, 3f)
        horizontalLineTo(10f)
        moveTo(10f, 12f)
        verticalLineTo(3f)
        moveTo(10f, 12f)
        verticalLineTo(21f)
        }
        }.build()

        return _paragraph!!
    }

private var _paragraph: ImageVector? = null
