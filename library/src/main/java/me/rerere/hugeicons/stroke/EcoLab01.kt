package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EcoLab01: ImageVector
    get() {
        if (_ecoLab01 != null) {
            return _ecoLab01!!
        }
        _ecoLab01 = ImageVector.Builder(
            name = "EcoLab01",
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
        moveTo(15f, 9f)
        verticalLineTo(19f)
        curveTo(15f, 20.6569f, 13.6569f, 22f, 12f, 22f)
        curveTo(10.3431f, 22f, 9f, 20.6569f, 9f, 19f)
        verticalLineTo(9f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 9f)
        horizontalLineTo(16f)
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

        return _ecoLab01!!
    }

private var _ecoLab01: ImageVector? = null
