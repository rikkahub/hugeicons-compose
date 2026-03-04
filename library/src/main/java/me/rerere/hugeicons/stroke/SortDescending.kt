package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SortDescending: ImageVector
    get() {
        if (_sortDescending != null) {
            return _sortDescending!!
        }
        _sortDescending = ImageVector.Builder(
            name = "SortDescending",
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
        moveTo(15.5f, 14f)
        curveTo(15.5f, 14f, 19f, 16.5777f, 19f, 17.5f)
        curveTo(19f, 18.4223f, 15.5f, 21f, 15.5f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 17.5f)
        horizontalLineTo(12.5f)
        curveTo(9.21252f, 17.5f, 7.56878f, 17.5f, 6.46243f, 16.592f)
        curveTo(6.25989f, 16.4258f, 6.07418f, 16.2401f, 5.90796f, 16.0376f)
        curveTo(5f, 14.9312f, 5f, 13.2875f, 5f, 10f)
        verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 6f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 10f)
        horizontalLineTo(16f)
        }
        }.build()

        return _sortDescending!!
    }

private var _sortDescending: ImageVector? = null
