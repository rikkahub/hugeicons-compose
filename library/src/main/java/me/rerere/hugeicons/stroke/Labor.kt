package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Labor: ImageVector
    get() {
        if (_labor != null) {
            return _labor!!
        }
        _labor = ImageVector.Builder(
            name = "Labor",
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
        moveTo(20f, 22f)
        verticalLineTo(19f)
        curveTo(20f, 17.1144f, 20f, 16.1716f, 19.4142f, 15.5858f)
        curveTo(18.8284f, 15f, 17.8856f, 15f, 16f, 15f)
        horizontalLineTo(14f)
        lineTo(12f, 17f)
        lineTo(10f, 15f)
        horizontalLineTo(8f)
        curveTo(6.11438f, 15f, 5.17157f, 15f, 4.58579f, 15.5858f)
        curveTo(4f, 16.1716f, 4f, 17.1144f, 4f, 19f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 15f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 15f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 9f)
        verticalLineTo(7f)
        curveTo(15.5f, 5.067f, 13.933f, 3.5f, 12f, 3.5f)
        curveTo(10.067f, 3.5f, 8.5f, 5.067f, 8.5f, 7f)
        verticalLineTo(9f)
        curveTo(8.5f, 10.933f, 10.067f, 12.5f, 12f, 12.5f)
        curveTo(13.933f, 12.5f, 15.5f, 10.933f, 15.5f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 7.5f)
        horizontalLineTo(16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        verticalLineTo(3.5f)
        }
        }.build()

        return _labor!!
    }

private var _labor: ImageVector? = null
