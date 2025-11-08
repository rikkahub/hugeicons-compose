package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SortingUp: ImageVector
    get() {
        if (_sortingUp != null) {
            return _sortingUp!!
        }
        _sortingUp = ImageVector.Builder(
            name = "SortingUp",
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
        moveTo(18f, 8.5f)
        lineTo(5.9999f, 8.4999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 12.5f)
        lineTo(3f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 21.5f)
        lineTo(16f, 15.5f)
        moveTo(16f, 15.5f)
        lineTo(18f, 17.5f)
        moveTo(16f, 15.5f)
        lineTo(14f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8.5f)
        lineTo(12f, 2.5f)
        moveTo(12f, 2.5f)
        lineTo(14f, 4.5f)
        moveTo(12f, 2.5f)
        lineTo(10f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 21.5f)
        lineTo(8f, 15.5f)
        moveTo(8f, 15.5f)
        lineTo(10f, 17.5f)
        moveTo(8f, 15.5f)
        lineTo(6f, 17.5f)
        }
        }.build()

        return _sortingUp!!
    }

private var _sortingUp: ImageVector? = null
