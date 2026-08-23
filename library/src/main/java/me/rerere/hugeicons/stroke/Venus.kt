package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Venus: ImageVector
    get() {
        if (_venus != null) {
            return _venus!!
        }
        _venus = ImageVector.Builder(
            name = "Venus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 14f)
            verticalLineTo(22f)
            moveTo(9f, 19f)
            horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18f, 8f)
            curveTo(18f, 11.3137f, 15.3137f, 14f, 12f, 14f)
            curveTo(8.68629f, 14f, 6f, 11.3137f, 6f, 8f)
            curveTo(6f, 4.68629f, 8.68629f, 2f, 12f, 2f)
            curveTo(15.3137f, 2f, 18f, 4.68629f, 18f, 8f)
            close()
        }
        }.build()

        return _venus!!
    }

private var _venus: ImageVector? = null
