package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EcoLab02: ImageVector
    get() {
        if (_ecoLab02 != null) {
            return _ecoLab02!!
        }
        _ecoLab02 = ImageVector.Builder(
            name = "EcoLab02",
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
        moveTo(12f, 5f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 2f)
        horizontalLineTo(10f)
        curveTo(11.1046f, 2f, 12f, 2.89543f, 12f, 4f)
        verticalLineTo(5f)
        horizontalLineTo(10f)
        curveTo(8.89543f, 5f, 8f, 4.10457f, 8f, 3f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 9f)
        horizontalLineTo(13.5f)
        verticalLineTo(12.2288f)
        curveTo(15.5286f, 12.8659f, 17f, 14.7611f, 17f, 16.9999f)
        curveTo(17f, 19.7613f, 14.7614f, 21.9999f, 12f, 21.9999f)
        curveTo(9.23858f, 21.9999f, 7f, 19.7613f, 7f, 16.9999f)
        curveTo(7f, 14.7611f, 8.47145f, 12.8659f, 10.5f, 12.2288f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 9f)
        horizontalLineTo(14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 3f)
        horizontalLineTo(14f)
        curveTo(12.8954f, 3f, 12f, 3.89543f, 12f, 5f)
        verticalLineTo(6f)
        horizontalLineTo(14f)
        curveTo(15.1046f, 6f, 16f, 5.10457f, 16f, 4f)
        verticalLineTo(3f)
        }
        }.build()

        return _ecoLab02!!
    }

private var _ecoLab02: ImageVector? = null
