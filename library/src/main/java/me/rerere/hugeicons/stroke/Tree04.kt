package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tree04: ImageVector
    get() {
        if (_tree04 != null) {
            return _tree04!!
        }
        _tree04 = ImageVector.Builder(
            name = "Tree04",
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
        moveTo(12f, 22f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 17.1973f)
        curveTo(16.7934f, 16.1599f, 18f, 14.2208f, 18f, 12f)
        curveTo(18f, 10.3744f, 17.3535f, 8.89971f, 16.3036f, 7.81915f)
        curveTo(16.4313f, 7.40197f, 16.5f, 6.95901f, 16.5f, 6.5f)
        curveTo(16.5f, 4.01472f, 14.4853f, 2f, 12f, 2f)
        curveTo(9.51472f, 2f, 7.5f, 4.01472f, 7.5f, 6.5f)
        curveTo(7.5f, 6.95901f, 7.56872f, 7.40197f, 7.69645f, 7.81915f)
        curveTo(6.64651f, 8.89971f, 6f, 10.3744f, 6f, 12f)
        curveTo(6f, 14.2208f, 7.2066f, 16.1599f, 9f, 17.1973f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15f)
        lineTo(14.5f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13f)
        lineTo(9.5f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 22f)
        horizontalLineTo(14f)
        }
        }.build()

        return _tree04!!
    }

private var _tree04: ImageVector? = null
