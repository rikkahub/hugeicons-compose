package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Comment03: ImageVector
    get() {
        if (_comment03 != null) {
            return _comment03!!
        }
        _comment03 = ImageVector.Builder(
            name = "Comment03",
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
        moveTo(2f, 10.5f)
        curveTo(2f, 5.5f, 6f, 3f, 12f, 3f)
        curveTo(18f, 3f, 22f, 5.5f, 22f, 10.5f)
        curveTo(22f, 15.5f, 18f, 18f, 12f, 18f)
        verticalLineTo(21f)
        curveTo(12f, 21f, 2f, 18f, 2f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 8.5f)
        horizontalLineTo(16f)
        moveTo(8f, 12.5f)
        horizontalLineTo(12f)
        }
        }.build()

        return _comment03!!
    }

private var _comment03: ImageVector? = null
