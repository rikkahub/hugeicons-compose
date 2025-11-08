package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TelevisionTable: ImageVector
    get() {
        if (_televisionTable != null) {
            return _televisionTable!!
        }
        _televisionTable = ImageVector.Builder(
            name = "TelevisionTable",
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
        moveTo(18f, 14f)
        horizontalLineTo(6f)
        curveTo(3.518f, 14f, 3f, 14.518f, 3f, 17f)
        verticalLineTo(19f)
        curveTo(3f, 21.482f, 3.518f, 22f, 6f, 22f)
        horizontalLineTo(18f)
        curveTo(20.482f, 22f, 21f, 21.482f, 21f, 19f)
        verticalLineTo(17f)
        curveTo(21f, 14.518f, 20.482f, 14f, 18f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 18f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 18f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 7f)
        verticalLineTo(6f)
        curveTo(6f, 4.11438f, 6f, 3.17157f, 6.58579f, 2.58579f)
        curveTo(7.17157f, 2f, 8.11438f, 2f, 10f, 2f)
        horizontalLineTo(14f)
        curveTo(15.8856f, 2f, 16.8284f, 2f, 17.4142f, 2.58579f)
        curveTo(18f, 3.17157f, 18f, 4.11438f, 18f, 6f)
        verticalLineTo(7f)
        curveTo(18f, 8.88562f, 18f, 9.82843f, 17.4142f, 10.4142f)
        curveTo(16.8284f, 11f, 15.8856f, 11f, 14f, 11f)
        horizontalLineTo(10f)
        curveTo(8.11438f, 11f, 7.17157f, 11f, 6.58579f, 10.4142f)
        curveTo(6f, 9.82843f, 6f, 8.88562f, 6f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 11f)
        lineTo(10f, 14f)
        moveTo(13.5f, 11f)
        lineTo(14f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 14f)
        verticalLineTo(22f)
        }
        }.build()

        return _televisionTable!!
    }

private var _televisionTable: ImageVector? = null
